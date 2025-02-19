package com.asiainfo.crm.cm.dk.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.FtpUtil;
import com.ai.common.util.StaticDataUtil;
import com.ai.common.util.TimeUtil;
import com.ai.omframe.util.SoDataFactory;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.service.interfaces.IAddressSV;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmFileSyncErrLogBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustRequestTaskValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmFileSyncErrLogValue;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyBean;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmIndivCustomerSV;

public class CustomerToCPR {

	private static final Log log = LogFactory.getLog(CustomerToCPR.class);
	private static int numFlag = 1;

	public void doCustToCPR() throws Exception {
		// 设置默认操作员信息
		UserInfoInterface user = CmCommonUtil.getDefaultUser();
		ServiceManager.setServiceUserInfo(user);
		// 默认创建一个空的文件
		File file = new File("custToCPR.txt");
		file.createNewFile();
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		// 按照一万取模，分批次处理
		int count = commonSV.queryCmCustRequestTaskCount(CmConstants.RequestStatus.pending);
		if (count > 0) {
			dealCustRequestValues(file, count);
			FtpUtil fp = new FtpUtil("CM_CPR_FTP");
			FileInputStream fis = null;
			StringBuffer name = new StringBuffer();
			name.append("d").append((TimeUtil.getYYYYMMDD(new Date())).substring(2, 8)).append(".am210901");
			try {
				fis = new FileInputStream(file);
				fp.upload(name.toString(), fis, FtpUtil.BIN);
				// 统一将之前操作的数据状态由C改为P
			} catch (Exception e) {
				log.error(e.getMessage(), e);
			} finally {
				if (fis != null) {
					fis.close();
				}
			}
		}
		file.delete();
	}

	private void dealCPRData(IBOCmCustRequestTaskValue[] taskValues, File file) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(taskValues)) {
			ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICmIndivCustomerSV indivSV = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
			
			String taskId = "";// 工单序列
			String requestType = "";// 请求类型
			FileOutputStream fos = null;
			OutputStreamWriter osw = null;
			for (int i = 0; i < taskValues.length; i++) {
				try {
					String firstName = "";// 名
					String middleName = "";// 中名
					String lastName = "";// 姓
					String birthday = "";// 生日
					String addressId = "";// 地址
					taskId = DataType.getAsString(taskValues[i].getTaskId());
					requestType = DataType.getAsString(taskValues[i].getRequestType());
					String cprId = DataType.getAsString(taskValues[i].getCustId());
					String custId = "";
					if (indivSV.queryCustIdByPNR(Long.parseLong(cprId)) > 0) {
						custId = DataType.getAsString(indivSV.queryCustIdByPNR(Long.parseLong(cprId)));
					} else {
						custId = DataType.getAsString(queryPartyIdByCprId(Long.parseLong(cprId)));
					}
					
					if(StringUtils.isBlank(custId)){
						IBOCmFileSyncErrLogValue value = new BOCmFileSyncErrLogBean();
						ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
						StringBuffer name = new StringBuffer();
						name.append("d").append(TimeUtil.getYYYYMMDD(new Date())).append(".am210901").append(".txt");
						value.setFileType(CmConstants.errFileType.CPR);
						value.setErrMsg("custId can not found by cprId ("+ cprId +").");
						value.setFileName(name.toString());
						value.setState(CmConstants.RecordState.USE);
						service.saveCmFileSyncErrLog(value);
						continue;
					}
					
					// 由于payer插的是partyId,所以这里分两种情况
					if (custId.length() == 14) {
						// 说明插的是custId,然后调用服务查询出具体的客户信息
						DataContainer[] custDCS = indivSV.queryCustomerSendToCPR(Long.parseLong(custId));
						if (CmCommonUtil.isNotEmptyObject(custDCS)) {
							firstName = custDCS[0].getAsString("FIRST_NAME");
							middleName = custDCS[0].getAsString("MIDDLE_NAME");
							lastName = custDCS[0].getAsString("LAST_NAME");
							birthday = custDCS[0].getAsString("BIRTHDAY");
							addressId = custDCS[0].getAsString("ADDRESS_ID");
						}
					} else {
						// 说明插的是partyId
						DataContainer[] payDCS = indivSV.queryPartyInfo(Long.parseLong(custId));
						if (CmCommonUtil.isNotEmptyObject(payDCS)) {
							firstName = payDCS[0].getAsString("FIRST_NAME");
							middleName = payDCS[0].getAsString("MIDDLE_NAME");
							lastName = payDCS[0].getAsString("LAST_NAME");
							birthday = payDCS[0].getAsString("BIRTHDAY");
							addressId = payDCS[0].getAsString("CONT_ADDRESS");
						}
					}

					if(StringUtils.isBlank(addressId)){
						IBOCmFileSyncErrLogValue value = new BOCmFileSyncErrLogBean();
						ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
						StringBuffer name = new StringBuffer();
						name.append("d").append(TimeUtil.getYYYYMMDD(new Date())).append(".am210901").append(".txt");
						value.setFileType(CmConstants.errFileType.CPR);
						value.setErrMsg("addressId can not found by custId ("+ custId +").");
						value.setFileName(name.toString());
						value.setState(CmConstants.RecordState.USE);
						service.saveCmFileSyncErrLog(value);
						continue;
					}

					// 默认为10
					String Inddatatyp = "10";
					// 默认为2109
					String Kundenr = "2109";
					// 客户custId
					String Kunderefnr = cprId;
					// 默认取得requestType
					String Sortbyte = requestType;
					// 根据sortbyte生成
					String Matchtyp = "";
					if ("1".equalsIgnoreCase(Sortbyte)) {
						Matchtyp = "S";
					} else {
						Matchtyp = "T";
					}
					// 不需要默认塞"P"
					String Pnrsenrmrk = "P";
					String Matchnvn = "";
					String Suplnvn = "";
					String middle = middleName == null ? "" : middleName;
					//firstName 进行特殊处理 
					firstName = getFirstNameByAnalyze(firstName);
					// firstName+middleName
					String Formelnvn = "" + firstName + middle;
					// lastName
					String Efternvn = lastName;
					// 不需要
					String Komkod = "";
					IAddressSV service = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
					// DistrictID当前为012002002
					address ss = service.getAddress(Long.parseLong(addressId), "012002002");
					String postCode = ss.getZipcode();
					String Postnr = postCode == null ? "" : postCode;
					// street code 不需要
					String Vejkod = "";
					// street name
					String Vejnvn = ss.getStreetName() == null ? "" : ss.getStreetName();
					String Klaradr = "";
					String Husnr = "";
					if (ss.getHouseNumber() != null && ss.getHouseNumber().length() > 0) {
						if (ss.getHouseNumber().length() >= 3) {
							Husnr += ss.getHouseNumber().substring(0, 3);
						} else {
							Husnr += ss.getHouseNumber();
							Husnr = convertZeroBefore(Husnr, 3);
						}
					}else{
						Husnr = convertZeroBefore(Husnr, 3);
					}
					if (ss.getHouseLetter() != null && ss.getHouseLetter().length() > 0) {
						Husnr += ss.getHouseLetter().substring(ss.getHouseLetter().length() - 1);
					}
					String Etage = ss.getFloor() == null ? "" : ss.getFloor();
					String Sidedoer = ss.getApartment() == null ? "" : ss.getApartment();
					String Bynvn = "";
					String Koen = "";
					// 记录客户的生日
					String Foeddto = "";
					if (StringUtils.isNotBlank(birthday)) {
						boolean isValid = true;
						birthday = birthday.substring(0, 4) + birthday.substring(5, 7) + birthday.substring(8, 10);
						IBOBsStaticDataValue[] i18ResStaticDatas = SoDataFactory.getI18ResStaticData("CPR_INVALID_BIRTH");
						if(i18ResStaticDatas != null && i18ResStaticDatas.length > 0) {
							for(IBOBsStaticDataValue i18ResStaticData:i18ResStaticDatas) {
								if( birthday.equals(i18ResStaticData.getCodeValue()) ){
									isValid = false;
									break;
								}
							}
						}
						if (isValid) {
							Foeddto = birthday;
						}
					}
					StringBuffer sb = new StringBuffer();
					sb.append(Inddatatyp).append(Kundenr).append(convert(Kunderefnr, 15)).append(Sortbyte).append(Matchtyp).append(Pnrsenrmrk).append(convert(Matchnvn, 50))
							.append(convert(Suplnvn, 50)).append(convert(Formelnvn, 50)).append(convert(Efternvn, 40)).append(convert(Komkod, 4)).append(convert(Postnr, 4))
							.append(convert(Vejkod, 4)).append(convert(Vejnvn, 40)).append(convert(Klaradr, 68)).append(convert(Husnr, 4)).append(convert(Etage, 2))
							.append(convert(Sidedoer, 4)).append(convert(Bynvn, 34)).append(convert(Koen, 1)).append(convert(Foeddto, 8));
					// 调用服务使requestStatus为"P"
					customerSV.changeRequestStatus(Long.parseLong(taskId));
					String str = sb.toString();
					fos = new FileOutputStream(file, true);
					osw = new OutputStreamWriter(fos, StandardCharsets.ISO_8859_1);
					osw.write(str + "\r\n");
					osw.flush();
				} catch (Exception e) {
					log.error(e.getMessage(), e);
					// 保存错误信息
					IBOCmFileSyncErrLogValue value = new BOCmFileSyncErrLogBean();
					ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
					StringBuffer name = new StringBuffer();
					name.append("d").append(TimeUtil.getYYYYMMDD(new Date())).append(".am210901").append(".txt");
					value.setFileType(CmConstants.errFileType.CPR);
					value.setErrMsg(e.getMessage());
					value.setFileName(name.toString());
					value.setState(CmConstants.RecordState.USE);
					service.saveCmFileSyncErrLog(value);
				} finally {
					if (osw != null) {
						osw.close();
					}
					if (fos != null) {
						fos.close();
					}
				}
			}
		}
	}

	/**
	 * 获取第一个空格之前的名字
	 * @param firstName
	 * @return
	 */
	private String getFirstNameByAnalyze(String firstName) {
		String resultFirstName = firstName;
		if(StringUtils.isNotEmpty(resultFirstName)&&checkFirstNameSwitch()) {
			resultFirstName =resultFirstName.substring(0,resultFirstName.indexOf(" ")>0?resultFirstName.indexOf(" "):resultFirstName.length());
		}
		return resultFirstName;
	}
	
	/**
	 * 解析获取firstName开关
	 * @return
	 */
	private boolean checkFirstNameSwitch() {
		boolean cr1168FistNameFlag = false;
		
		IBOBsStaticDataValue[] busiOperData = null;
		try {
			busiOperData = StaticDataUtil.getStaticData("SO_CR1168FIRSTNAME_CONTROL");
			if(busiOperData!=null && busiOperData.length>0){
				if ("1".equals(busiOperData[0].getCodeValue()))
					cr1168FistNameFlag = true;
			}
		} catch (Exception e) {
			 log.error(e.getMessage());
		}
		return cr1168FistNameFlag;
	}	
	
	// 字段转换
	private String convert(String str, int num) {
		if (str == null) {
			return convert("", num);
		}
		StringBuffer sb = new StringBuffer(str);
		for (int i = str.length(); i < num; i++) {
			sb.append(" ");
		}
		return sb.toString();
	}
	
	private String convertZeroBefore(String str, int num) {
		if (str == null) {
			return convertZeroBefore("", num);
		}
		StringBuffer sb = new StringBuffer(str);
		for (int i = str.length(); i < num; i++) {
			sb.insert(0, "0");
		}
		return sb.toString();
	}

	// 取模分片处理
	private void dealCustRequestValues(File file, int count) throws Exception {
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		IBOCmCustRequestTaskValue[] values = commonSV.queryCmCustRequestTask(CmConstants.RequestStatus.pending, 1, 10000);
		if (CmCommonUtil.isNotEmptyObject(values) && numFlag <= count / 10000 + 1) {
			dealCPRData(values, file);
			numFlag++;
			dealCustRequestValues(file, count);
		}
		numFlag = 1;
	}

	private long queryPartyIdByCprId(long cprId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map map = new HashMap();
		if (cprId > 0) {
			condition.append(" AND ").append(IBOCmPartyValue.S_CprId).append(" =:cprId ");
			map.put("cprId", String.valueOf(cprId));
			IBOCmPartyValue[] values = (IBOCmPartyValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmPartyBean.class, condition.toString(), map, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(values)) {
				return values[0].getPartyId();
			}
		}
		return 0L;
	}

	public static void main(String[] args) throws Exception {
		/*String[] agrs = new String[] { "CRM_CM_MUTUAL2CPR_TASK", "10030008", "0" };
		TaskFrameWork.main(agrs);*/
		
		/*
		 * oMai-Britt -> Mai-Britt
		   oMai -> Mai
           oMai Britt -> Mai
		   oKristian Peder Thoverud -> Kristian
		   oGrigorijus Emma-Nenneh -> Grigorijus
		   oFiza Kongerslev Panstrup Nlynge -> Fiza
		   oFest-Jongløren Damao Skou -> Fest-Jongløren
		 */
		
		String hsNum = "oMai-Britt";
		List<String> firstNameList = new ArrayList();
		firstNameList.add("oMai-Britt ");
		firstNameList.add("oMai ");
		firstNameList.add("oMai Britt ");
		firstNameList.add("oKristian Peder Thoverud ");
		firstNameList.add("oGrigorijus Emma-Nenneh ");
		firstNameList.add("oFiza Kongerslev Panstrup Nlynge ");
		firstNameList.add("oFest-Jongløren Damao Skou ");
		for (int i = 0; i < firstNameList.size(); i++) {
			System.out.println(firstNameList.get(i).substring(0,firstNameList.get(i).indexOf(" "))+"---");
		}
		
	}
}
