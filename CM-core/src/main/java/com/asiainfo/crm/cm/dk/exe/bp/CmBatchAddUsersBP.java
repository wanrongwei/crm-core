package com.asiainfo.crm.cm.dk.exe.bp;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.appframe.ext.exeframe.bp.BpFrameWork;
import com.asiainfo.appframe.ext.exeframe.bp.interfaces.IBpNotify;
import com.asiainfo.appframe.ext.exeframe.bp.interfaces.IBpProcess;
import com.asiainfo.appframe.ext.exeframe.bp.po.BpCol;
import com.asiainfo.appframe.ext.exeframe.bp.po.BpInfo;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.service.interfaces.IAddressSV;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustContactMediumBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.CustomerBean;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmIndivCustomerSV;
import com.asiainfo.crm.cm.support.bce.util.CmBceSupportConstants;

public class CmBatchAddUsersBP implements IBpProcess, IBpNotify {

	private final static int FILE_COL_COUNT = 6;	// 上传文件每行的项目列数.
	private final static String dateFormat = "yyyyMMdd";

	public void processData(BpCol[][] bpCols, BpInfo bpInfo) throws Exception {
		UserInfoInterface userInfo = ServiceManager.getNewBlankUserInfo();
		userInfo.setTenantId(TenantIDFactory.getTenant());
		userInfo.setID(bpInfo.getProcessOpId());
		userInfo.setOrgId(bpInfo.getProcessOrgId());
		ServiceManager.setServiceUserInfo(userInfo);
		if (null != bpCols && bpCols.length > 0) {
			for (int i = 0; i < bpCols.length; i++)	// 一般一行记录,创建用户按每行保存
			{
				IVOCustValue custValue = new VOCustBean();
				BpCol[] bpCol = bpCols[i];
				if (bpCol == null || bpCol.length != FILE_COL_COUNT)	// 行内容参数与配置的不一致
				{
					// // 记录格式错误，字段个数不等于{0}
					ExceptionUtil.throwBusinessException("AMS1600120", String.valueOf(FILE_COL_COUNT));
				}
				String CPRNumber = "";
				String comProtection = "";
				Timestamp proEffDate = null;
				Timestamp proExpDate = null;
				String contPhone = "";
				String contEmail = "";

				for (int j = 0; j < FILE_COL_COUNT; j++) {
					switch (bpCol[j].getPosition())	// 按照顺序处理
					{
						case 1:
							if (StringUtils.isNotBlank(bpCol[j].getValue())) {
								CPRNumber = bpCol[j].getValue();
							}
							break;

						case 2:
							if (StringUtils.isNotBlank(bpCol[j].getValue())) {
								comProtection = bpCol[j].getValue();
							}
							break;

						case 3:
							if (StringUtils.isNotBlank(bpCol[j].getValue())) {
								String effDate = bpCol[j].getValue();
								proEffDate = getTimestamp(effDate);
							}
							break;

						case 4:
							if (StringUtils.isNotBlank(bpCol[j].getValue())) {
								String expDate = bpCol[j].getValue();
								proExpDate = getTimestamp(expDate);
							}
							break;

						case 5:
							if (StringUtils.isNotBlank(bpCol[j].getValue())) {
								contPhone = bpCol[j].getValue();
							}
							break;

						case 6:
							if (StringUtils.isNotBlank(bpCol[j].getValue())) {
								contEmail = bpCol[j].getValue();
							}
							break;

						default:
							break;
					}
				}
				// 检验参数
				validateDate(comProtection, proEffDate, proExpDate);
				validateEmail(contEmail);
				// 创建使用者
				ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
				String custId = String.valueOf(commonSV.getCustId(CmConstants.CustomerType.INDIVIDUAL));
				Map map = getCustInfoFromCPR(CPRNumber, custId);
				if (!map.isEmpty()) {
					ICustomerValue customerValue = new CustomerBean();
					customerValue.setFirstName(DataType.getAsString(map.get("FIRST_NAME")));
					customerValue.setLastName(DataType.getAsString(map.get("LAST_NAME")));
					customerValue.setBirthday(getTimestamp(DataType.getAsString(map.get("BIRTHDAY"))));
					// 设置客户ID
					customerValue.setCustId(Long.parseLong(custId));
					// 设置一些默认字段
					customerValue.setRegionId(CmCommonUtil.getDefaultRegionId());
					customerValue.setState(CmConstants.RecordState.USE);
					customerValue.setAnonymousFlag(0);
					customerValue.setCustType(CmConstants.CustomerType.INDIVIDUAL);
					customerValue.setCustStatus(CmConstants.CustomerStatus.INDIV_POTENTIAL);
					customerValue.setRealNameFlag(0);
					customerValue.setCustLanguage("1");
					customerValue.setCustCertType(CmConstants.CertificateType.CPR);
					customerValue.setCustCertCode(CPRNumber);
					// cprnumber奇数为male,偶数为female
					if (Long.parseLong(CPRNumber) % 2 == 1) {
						customerValue.setGender(1);
					} else {
						customerValue.setGender(2);
					}
					// 设置客户子类型为使用者
					customerValue.setIndivCustType(String.valueOf(CmConstants.EntityType.USER));
					custValue.setCustomer(customerValue);
					// 设置客户扩展信息
					DataContainerInterface cmxIndiv = new DataContainer();
					if (StringUtils.isNotBlank(comProtection)) {
						cmxIndiv.set("MANUAL_COMMERCIAL_PROTECTION", comProtection);
					}
					if (!comProtection.equals("1")) {
						if (null != proEffDate) {
							cmxIndiv.set("MANUAL_PROTECT_EFFECTIVE_DATE", proEffDate);
						}
						if (null != proExpDate) {
							cmxIndiv.set("MANUAL_PROTECT_EXPIRE_DATE", proExpDate);
						}
					}
					cmxIndiv.set("CUST_ID", custId);
					cmxIndiv.set("REGION_ID", CmCommonUtil.getDefaultRegionId());
					cmxIndiv.set("STATE", CmConstants.RecordState.USE);
					cmxIndiv.set("PNR", custId);
					custValue.setUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer, cmxIndiv);
					// 保存客户信息
					CmServiceFactory.getCustomerSV().saveCustomer(custValue);
					// 保存使用者联系信息
					saveContact(contPhone, contEmail, custId);
				}
			}
		}
	}

	/*
	 * 将String转换成timestamp
	 */
	private Timestamp getTimestamp(String dateInfo) throws Exception {
		Date date = new SimpleDateFormat(dateFormat).parse(dateInfo);
		return new Timestamp(date.getTime());
	}

	/*
	 * 从CPR获得客户信息
	 */
	private Map getCustInfoFromCPR(String cprNum, String custId) throws Exception {
		Map map = new HashMap();
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICmIndivCustomerSV indivService = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
		IBOCmIndivCustomerValue[] values = service.queryCustomerByCPR(cprNum);
		if (null != values && values.length > 0) {
			// CPR在CRM进行验证客户是否存在，存在则不进行创建
			ExceptionUtil.throwBusinessException("CMS9988771");
		}
		Map params = new HashMap();
		params.put("PNR", cprNum);
		// 送CPR进行校验
		Map cprData = indivService.validateCPR(params);
		String FEJLNR = (String) cprData.get("FEJLNR");
		if (!FEJLNR.equals("00")) {
			// CPR在CPR系统中不存在。
			ExceptionUtil.throwBusinessException("CMS9988772");
		}
		Map data1 = (Map) cprData.get("DATA");
		Map data2 = (Map) data1.get("INFO");
		Map currentData = (Map) data2.get("Current_data");
		// 是否受保护
		String isProtected = (String) currentData.get("NVNADRBESKHAENSTART");
		// isProtected="1231234";
		String var = "[0]*";
		if (!isProtected.matches(var)) {
			// 受保护
			ExceptionUtil.throwBusinessException("CMS9988770");
		} else {
			// 从CPR返回的客户名称
			String firstName = (String) currentData.get("FORNVN");
			String lastName = (String) currentData.get("EFTERNVN");
			// 从CPR返回的生日
			String birthDay = (String) currentData.get("FOEDDTO");
			// 从CPR返回的地址
			String houseNum = ((String) currentData.get("HUSNR")).trim();
			String floor = (String) currentData.get("ETAGE");
			String sideOrApartNum = (String) currentData.get("SIDEDOER");
			String buildNum = (String) currentData.get("SIDEDOER");
			String streetName = (String) currentData.get("VEJADRNVN");
			String city = (String) currentData.get("POSTDISTTXT");
			String smallCity = (String) currentData.get("BYNVN");
			String postCode = (String) currentData.get("POSTNR");
			String coName = (String) currentData.get("CONVN");
			String munici = (String) currentData.get("KOMKOD");
			String personStatus= (String) currentData.get("STATUS");
			if("80".equals(personStatus)){
				//客户移民
				ExceptionUtil.throwBusinessException("CMS9988946");
			}
			if("70".equals(personStatus)){
				//客户消失
				ExceptionUtil.throwBusinessException("CMS9988947");
			}
			// 不受保护
			map.put("FIRST_NAME", CmCommonUtil.capitalizeFirstLetter(firstName));
			map.put("LAST_NAME", CmCommonUtil.capitalizeFirstLetter(lastName));
			map.put("BIRTHDAY", birthDay);
			address address = new address();
			address.setAddressType(CmConstants.Address.ADDRESSTYPE);
			address.setDistrictId(CmConstants.Address.DISTRICTID);
			if(StringUtils.isNotBlank(houseNum)){
				if(Character.isLetter(houseNum.charAt(houseNum.length()-1))){
					address.setHouseNumber(String.valueOf(Integer.valueOf(houseNum.substring(0,houseNum.length()-1).trim())));
					address.setHouseLetter(String.valueOf(houseNum.charAt(houseNum.length()-1)));
				}else{
					address.setHouseNumber(String.valueOf(Integer.valueOf(houseNum.trim())));
					address.setHouseLetter("");
				}
			}
			if (StringUtils.isNotBlank(floor)) {
				address.setFloor(floor.trim());
			} else {
				address.setFloor("");
			}
			if (StringUtils.isNotBlank(streetName)) {
				address.setStreetName(streetName.trim());
			} else {
				address.setStreetName("");
			}
			if (StringUtils.isNotBlank(city)) {
				address.setCity(city.trim());
			} else {
				address.setCity("");
			}
			if (StringUtils.isNotBlank(smallCity)) {
				address.setCounty(smallCity.trim());
			} else {
				address.setCounty("");
			}
			//根据特殊规则判断sidedoer的走向
			if(StringUtils.isNotBlank(sideOrApartNum)){
				if(CmCommonUtil.validateSidedoer(sideOrApartNum)){
					address.setApartment(sideOrApartNum.trim());
					address.setDoorNumber("");
				}else{
					address.setDoorNumber(sideOrApartNum.trim());
					address.setApartment("");
				}
			}else{
				address.setApartment("");
				address.setDoorNumber("");
			}
			if (StringUtils.isNotBlank(postCode)) {
				address.setZipcode(postCode);
			} else {
				address.setZipcode("");
			}
			if (StringUtils.isNotBlank(munici)) {
				address.setMunicipality(munici);
			} else {
				address.setMunicipality("");
			}
			//if (StringUtils.isNotBlank(addressDesc)) {
			//	address.setAddrDesc(addressDesc);
			//} else {
			address.setAddrDesc("");
			//}
			address.setMainDoor("");
			
			//地址层级中增加CO_NAME
			if(StringUtils.isNotBlank(coName)){
				address.setCoName(coName);
			}else{
				address.setCoName("");
			}
			
			// 保存地址信息
			IAddressSV service1 = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
			long addressId = service1.saveAddress(address);
			ICmCustomerSV service2 = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ArrayList<IBOCmCustContactMediumValue> list = new ArrayList<IBOCmCustContactMediumValue>();
			IBOCmCustContactMediumValue value = new BOCmCustContactMediumBean();
			value.setCustId(DataType.getAsLong(custId));
			value.setContMedTypeId(CmConstants.AddressId.legalAddress);
			value.setAddressId(addressId);
			value.setRegionId((String) CmCommonUtil.getDefaultRegionId());
			address realAddress = service1.getAddress(addressId, "012002002");
			value.setAddressDetail(realAddress.getAddrDesc());
			list.add(value);
			service2.saveCustContMedium(list.toArray(new BOCmCustContactMediumBean[0]));
		}
		return map;
	}

	/*
	 * 保存客户电话email信息
	 */
	private void saveContact(String phone, String email, String custId) throws Exception {
		// 保存联系电话
		IBOCmCustContactMediumValue phoneValue = new BOCmCustContactMediumBean();
		phoneValue.setCustId(Long.parseLong(custId));
		phoneValue.setContMedTypeId(31);
		phoneValue.setContNumber(phone);
		phoneValue.setCustContRelaId(CmCommonUtil.getNewSequence(BOCmCustContactMediumBean.class));
		phoneValue.setState(CmConstants.RecordState.USE);
		phoneValue.setRegionId(CmCommonUtil.getDefaultRegionId());
		// 保存email
		IBOCmCustContactMediumValue emailValue = new BOCmCustContactMediumBean();
		emailValue.setCustId(Long.parseLong(custId));
		emailValue.setContMedTypeId(21);
		emailValue.setEmailAddress(email);
		emailValue.setCustContRelaId(CmCommonUtil.getNewSequence(BOCmCustContactMediumBean.class));
		emailValue.setState(CmConstants.RecordState.USE);
		emailValue.setRegionId(CmCommonUtil.getDefaultRegionId());
		ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		List<IBOCmCustContactMediumValue> list = new ArrayList<IBOCmCustContactMediumValue>();
		list.add(phoneValue);
		list.add(emailValue);
		// 保存联系信息
		custSV.saveCustContMedium(list.toArray(new IBOCmCustContactMediumValue[0]));
	}

	public void statusNotify(String notifyBillId, String notifyMsg) throws Exception {
		// 调用发送短信接口完成短信发送
		if (StringUtils.isNotBlank(notifyBillId) && StringUtils.isNotBlank(notifyMsg)) {
			CenterFactory.setCenterInfoByTypeAndValue(CmConstants.CenterType.BILL_ID, notifyBillId);
			CmServiceFactory.getTeamInvokeSV().sendSms(notifyBillId, notifyMsg);
		}
	}

	// 校验邮箱
	private void validateEmail(String email) throws Exception {
		String check = "(?=^[\\w.@]{6,50}$)\\w+@\\w+(?:\\.[\\w]{2,3}){1,2}";
		Pattern pattern = Pattern.compile(check);
		java.util.regex.Matcher match = pattern.matcher(email);
		if (!match.matches()) {
			ExceptionUtil.throwBusinessException("CMS9988933");
		}
	}

	// 校验日期
	private void validateDate(String comProtact, Timestamp start, Timestamp end) throws Exception {
		// 只有在受保护的时候才去校验
		if (!comProtact.equals("1")) {
			long time = (start.getTime() - end.getTime());
			if (time > 0) {
				ExceptionUtil.throwBusinessException("CMS9988932");
			}
		}
	}

	public static void main(String[] args) throws Exception {
		// 启动下载FTP文件入库
		// BpFrameWork.main(new String[]{"-ftp","BATCH_ADD_USERS_21"});
		// 根据入库文件执行业务逻辑
		BpFrameWork.main(new String[] { "-dispatcher", "BATCH_ADD_USERS_21:21:1:0" });
	}
}