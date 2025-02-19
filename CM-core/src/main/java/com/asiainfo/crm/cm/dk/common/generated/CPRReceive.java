package com.asiainfo.crm.cm.dk.common.generated;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.comframe.client.ComframeClient;
import com.ai.comframe.utils.TimeUtil;
import com.ai.comframe.vm.common.Constant;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.FtpUtil;
import com.ai.common.util.StaticDataUtil;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.omframe.util.InsServiceFactory;
import com.ai.secframe.common.OrgModelConstants;
import com.asiainfo.crm.bill.teaminvoke.out.interfaces.IInterfaceBillCrmSV;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCmCprRecStatisticBean;
import com.asiainfo.crm.cm.common.bo.BOCmCprToTTBean;
import com.asiainfo.crm.cm.common.bo.BOCmPsPublicDealBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCprRecStatisticValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCprToTTValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmInsCmrelValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPsPublicDealValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPsTaskDealValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmPartyValue;
import com.asiainfo.crm.cm.common.service.interfaces.IAddressSV;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.CmTimeUtil;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmCustRequestTaskSV;
import com.asiainfo.crm.cm.inner.common.service.interfaces.ICmCommonInnerSV;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustContactMediumBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmFileSyncErrLogBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivContactBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivCustomerBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxIndivCustomerBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustRequestTaskValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmFileSyncErrLogValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivContactValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmContactContMediumInfoValue;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyBean;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyContactBean;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmIndivPartyValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyContactValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bean.VOPartyBean;
import com.asiainfo.crm.cm.model.bo.CustomerBean;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyContactValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.model.ivalues.IVOPartyValue;
import com.asiainfo.crm.cm.service.interfaces.ICmContactSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmIndivCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartyRoleSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartySV;
import com.asiainfo.crm.cm.service.interfaces.ICmPsTaskSV;
import com.asiainfo.crm.cm.support.bce.util.CmBceSupportConstants;
import com.asiainfo.crm.common.notes.tl.util.DateTimeUtil;
import com.asiainfo.crm.so.order.rboss.service.interfaces.IPhoneBookSV;

/**
 * 
 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
 * 
 * @ClassName CPRReceive
 * @Description CPR文件同步
 * 
 * @version v1.0.0
 * @author mael
 * @date 2014-6-13 下午3:13:48 <br>
 *       Modification History:<br>
 *       Date Author Version Description<br>
 *       ---------------------------------------------------------*<br>
 *       2014-6-13 mael v1.0.0 修改原因<br>
 */
public class CPRReceive {

	private static transient Log log = LogFactory.getLog(CPRReceive.class);

	private static final String DATE_FORMAT = "yyMMdd";

	// 用的是【客户管理附件FTP】
	private static final String FTP_CODE = "CM_CPR_RECEIVE_FTP";

	// 订购成功以及CPR追加的需要更新客户资料
	private static final String RECORD_TYPE_001 = "001";
	// 客户移民，CPR返回一个外国地址，然后客户的CPR状态修改为“移民”，
	// 然后通知操作员，操作员人工修改这个客户的法律地址为这个外国地址，以后这个客户回到丹麦后，客户会来CPR改地址，
	// 然后CPR会把这个信息主动推送给CRM更新客户资料，记录装填是“001”。
	private static final String RECORD_TYPE_002 = "002";
	// 死亡，失踪
	private static final String RECORD_TYPE_003 = "003";
	// 法律监护人（如客户没满18岁，去telenor开户，然后订购CPR的时候，CPR就返回这样的信息，只有法律监护人，标识这个客户还没18岁，不能创建客户）
	private static final String RECORD_TYPE_005 = "005";
	// 退订
	private static final String RECORD_TYPE_010 = "010";
	// 表示需要合并客户（有自己的文件格式）
	private static final String RECORD_TYPE_011 = "011";
	// 订购CPR错误编码
	private static final String RECORD_TYPE_901 = "901";
	// 整个文件统计信息，失败，成功多少
	private static final String RECORD_TYPE_903 = "903";
	// 表示记录开始，整条记录无效
	private static final String RECORD_TYPE_000 = "000";
	// 表示所有记录结束，整条记录无效
	private static final String RECORD_TYPE_999 = "999";
	// 表示送过来的是客户还是payer
	private static boolean custFlag = true;
	// 关于错误编码需要走flow的流程
	private static final String FLOW_CPR_CODE = "3,7,20,70,80,9080,9099";
	// 关于错误编码直接走troubleTicket的流程
	private static final String lOG_CPR_CODE = "4601,4602,4603,4604,4605,4606,4607,4608,4609,4610,4611,4612,4620,4621,4622,4623,4626,4628,4630,4631,4633,4634,4700,4910,4918,4919,9081,9082";
	// 地址为空不用处理对应的person status
	private static final String NO_DEAL_ADDRESS_STATUS = "03,07,20,30,50,60,70,80,90";
	// 需要合并tt的cpr
	private static Map cprTTMap = new HashMap();
	private static final String CPR_MISMATCH = "4613,4614,4624,4625,4629,4701,4702,4703,4704,4705,4706,4709,4710,4712,4713,4714,4715,4716,4717,4718,4719,4720,4721,4731,4732,4800,4810,4815,4901,4902,4903,4904,4907,4908,4911,4915,4916,4917";
	private static final String INVALID_CPR_NUMBER = "0001,0003,0005,0007,0020,0030,0050,0060,0070,0080,0090";

	/**
	 * 
	 * @Function dealFileDateToDB
	 * @Description
	 * 
	 * @param fileCode
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-8-12 上午10:57:37
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       2014-8-12 mael v1.0.0 修改原因<br>
	 */
	public void dealFileDateToDB(String fileCode) throws Exception {
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		// 获取本地文件全路径+文件名
		String localFile = "";
		String[] fileNames = getFileNames();
		if (fileNames != null) {
			ICmPsTaskSV sv = (ICmPsTaskSV) ServiceFactory.getService(ICmPsTaskSV.class);
			Calendar c = Calendar.getInstance();
			for (int j = 0; j < fileNames.length; j++) {
				if (fileNames[j].indexOf(".l210901") > -1) {
					try {
						SimpleDateFormat formate = new SimpleDateFormat("yyyyMMdd");
						IBOCmPsTaskDealValue[] lastValue = sv.queryCprRecord(88888888L, 6);
						Date lastDate = new Date();
						if (lastValue != null && lastValue.length > 0) {
							lastDate = formate.parse(String.valueOf(lastValue[0].getEntityId()));
						} else {
							ExceptionUtil.throwBusinessException("CMS9999132");
						}
						c.setTime(lastDate);
						c.add(Calendar.DATE, 1);
						Date needDate = c.getTime();
						Date date = formate.parse("20" + fileNames[j].substring(1, 7));
						// 为下一天处理，有跳过抛出异常
						if (date.equals(needDate)) {
							localFile = receiveFile(fileNames[j]);
						} else {
							ExceptionUtil.throwBusinessException("CMS9999130", formate.format(date));
						}
					} catch (Exception e) {
						log.error(e.getMessage(), e);
						// 记录错误日志到数据表中
						try {
							saveErrorLog("", fileNames[j].substring(1), e.getMessage());
						} catch (Exception ex) {
							log.error(ex.getMessage(), ex);
							break;
						}
						break;
					}

				} else {
					localFile = "";
				}
				if (null != localFile && !"".equals(localFile)) {
					// 获取文件数据
					String[] fileData = readLocalFile(fileCode, localFile);
					if (null != fileData && fileData.length > 0) {
						String recordType = "";
						String custId = "";
						for (int i = 0; i < fileData.length; i++) {
							if (null != fileData[i] && fileData[i].length() > 3) {
								try {
									recordType = fileData[i].substring(0, 3);
									// 防止下面数组越界
									if (fileData[i].length() < 18 || RECORD_TYPE_000.equals(recordType)) {
										continue;
									}
									String cpr = fileData[i].substring(3, 18);
									if (StringUtils.isNotBlank(cpr)) {
										// 901,903,999,000都不需要根据CprID查询
										if (RECORD_TYPE_901.equals(recordType) || RECORD_TYPE_903.equals(recordType) || RECORD_TYPE_999.equals(recordType)) {
											// do nothing
										} else {
											ICmIndivCustomerSV indivSV = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
											if (indivSV.queryCustIdByPNR(Long.parseLong(cpr.trim())) > 0) {
												custFlag = true;
											} else {
												custFlag = false;
											}
										}
									}
									if (RECORD_TYPE_001.equals(recordType)) {
										custId = fileData[i].substring(3, 18);
										dealFileDateToDBForType001(fileData[i]);
									} else if (RECORD_TYPE_002.equals(recordType)) {
										custId = fileData[i].substring(3, 18);
										dealFileDateToDBForType002(fileData[i]);
									} else if (RECORD_TYPE_003.equals(recordType)) {
										custId = fileData[i].substring(3, 18);
										dealFileDateToDBForType003(fileData[i]);
									} else if (RECORD_TYPE_005.equals(recordType)) {
										custId = fileData[i].substring(3, 18);
										dealFileDateToDBForType005(fileData[i]);
									} else if (RECORD_TYPE_010.equals(recordType)) {
										custId = fileData[i].substring(3, 18);
										dealFileDateToDBForType010(fileData[i]);
									} else if (RECORD_TYPE_011.equals(recordType)) {
										custId = fileData[i].substring(3, 18);
										dealFileDateToDBForType011(fileData[i]);
									} else if (RECORD_TYPE_901.equals(recordType)) {
										custId = fileData[i].substring(34, 49);
										dealFileDateToDBForType901(fileData[i]);
									} else if (RECORD_TYPE_903.equals(recordType)) {
										dealFileDateToDBForType903(fileData[i], localFile);
									} else if (RECORD_TYPE_000.equals(recordType)) {
										continue;
									} else if (RECORD_TYPE_999.equals(recordType)) {
										continue;
									}
								} catch (Exception e) {
									log.error(e.getMessage(), e);
									// 记录错误日志到数据表中
									try {
										saveErrorLog(custId, localFile.substring(1), e.getMessage());
									} catch (Exception ex) {
										log.error(ex.getMessage(), ex);
									}
								}
							}
						}
					}
					dealCprtoTT(cprTTMap);
					cprTTMap = new HashMap();
				}
			}
		}
	}

	private void saveErrorLog(String recordId, String fileName, String errorMsg) throws Exception {
		IBOCmFileSyncErrLogValue errorValue = new BOCmFileSyncErrLogBean();
		errorValue.setFileType(CmConstants.errFileType.CPR);
		errorValue.setRecordId(recordId);
		errorValue.setErrMsg(errorMsg);
		errorValue.setFileName(fileName);
		errorValue.setState("U");
		errorValue.setRegionId(CmCommonUtil.getDefaultRegionId());
		CmServiceFactory.getCustomerSV().saveCmFileSyncErrLog(errorValue);
	}

	/**
	 * 
	 * @Function dealFileDateToDBForType001
	 * @Description 订购成功以及CPR追加的需要更新客户资料
	 * 
	 * @param dataContent
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-6-13 下午3:18:42
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       2014-6-13 mael v1.0.0 修改原因<br>
	 */
	private void dealFileDateToDBForType001(String dataContent) throws Exception {
		// 记录类型，用来标识该条记录是订购，或者退订等等
		// String recordType = dataContent.substring(0, 3);
		// CPR_ID
		String kunderefnr = dataContent.substring(3, 18);
		// CPR生成该记录的时间
		// String proddto = dataContent.substring(18, 26);
		// It’s always ‘P’, but not used
		// String pnrsenrmrk = dataContent.substring(26, 27);
		String matchtyp = dataContent.substring(27, 28);
		// Status date.状态生效时间
		String statushaenstart = dataContent.substring(28, 40);

		String status = dataContent.substring(40, 42);

		String nvnadrbeskhaenstar = dataContent.substring(42, 54);
		// First name and last name
		// String adrnvn = dataContent.substring(54, 88);
		// Date customer moved to this address
		String tilflydto = dataContent.substring(88, 100);
		// C/O name, person who owned this house
		String convn = dataContent.substring(100, 134);
		String location = dataContent.substring(134, 168);
		// String standardadr = dataContent.substring(168, 202);
		String bynvn = dataContent.substring(202, 236);
		String postcode = dataContent.substring(236, 240);
		String postdisttxt = dataContent.substring(240, 260);
		String komkod = dataContent.substring(260, 264);
		// String vejkod = dataContent.substring(264, 268);
		String housNo = dataContent.substring(268, 272);
		String floor = dataContent.substring(272, 274);
		String sideDoor = dataContent.substring(274, 278);
		// String BNR = dataContent.substring(278, 282);
		// First and middle name
		String formelnvn = CmCommonUtil.capitalizeFirstLetter(dataContent.substring(282, 332));
		// Last name
		String efternvn = CmCommonUtil.capitalizeFirstLetter(dataContent.substring(332, 372));
		String vejadrnvn = dataContent.substring(372, 392);
		String rekbeskhaenstart = dataContent.substring(392, 404);
		long cprId = Long.parseLong(kunderefnr.trim());
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICmCustRequestTaskSV taskSV = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
		// 是否受保护 1:受保护 0：不受保护
		int protectFlag = 0;
		// 是否同步地址 1:同步 0：不同步
		int addressFlag = 1;
		long numCode = 0L;
		if (!custFlag) {
			// 针对送回来的是partyId
			IBOCmPartyValue[] partyValues = service.queryPartyByCprId(cprId);
			if (StringUtils.isBlank(matchtyp) || "T".equals(matchtyp)) {
				long partyId = 0L;
				if (CmCommonUtil.isNotEmptyObject(partyValues)) {
					partyId = partyValues[0].getPartyId();
				}
				// 变更party表信息
				IVOPartyValue voPartyValue = new VOPartyBean();
				ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
				IPartyValue partyValue = partySV.queryPartyById(partyId);
				DataContainer dc = new DataContainer();
				dc.set("PARTY_ID", partyId);
				IPartyContactValue[] contactValue = partySV.queryPartyContacts(dc, -1, -1);
				if (CmCommonUtil.isNotEmptyObject(partyValue) && CmCommonUtil.isNotEmptyObject(contactValue)) {
					numCode = partyId;
					// 是否同步名称的标志 1:同步 0：不同步
					int nameFlag = 1;
					if ("000000000000".equals(tilflydto)) {
						if ("01".equalsIgnoreCase(status) || "05".equalsIgnoreCase(status)) {
							protectFlag = 1;
							addressFlag = 0;
							if (StringUtils.isBlank(formelnvn) && StringUtils.isBlank(efternvn)) {
								nameFlag = 0;
							}
						}
					}

					if (nameFlag == 1) {
						// 设置firstName,lastName(cm_party,cm_indiv_party)
						partyValue.setFirstName(formelnvn.trim());
						partyValue.setLastName(efternvn.trim());
						partyValue.setFirstNameQry(partyValue.getFirstName().toUpperCase());
						partyValue.setLastNameQry(partyValue.getLastName().toUpperCase());
						partyValue.setPartyName(partyValue.getFirstName() + " " + partyValue.getLastName());
						partyValue.setPartyNameQry(partyValue.getFirstNameQry() + " " + partyValue.getLastNameQry());
						// 设置firstName,lasName(cm_party,cm_indiv_party)
						contactValue[0].setFirstName(formelnvn.trim());
						contactValue[0].setLastName(efternvn.trim());
						contactValue[0].setFirstNameQry(contactValue[0].getFirstName().toUpperCase());
						contactValue[0].setLastNameQry(contactValue[0].getLastName().toUpperCase());
						contactValue[0].setContName(contactValue[0].getFirstName() + " " + contactValue[0].getLastName());
						contactValue[0].setContNameQry(contactValue[0].getFirstNameQry() + " " + contactValue[0].getLastNameQry());
					}
					// 设置营销受保护
					if (StringUtils.isBlank(rekbeskhaenstart) || "000000000000".equals(rekbeskhaenstart)) {
						contactValue[0].setDirectMarketingProtection(0);
						//TELENOR_DEFECT_20190123_0003
						contactValue[0].setProtectEffDate(null);
						contactValue[0].setProtectExpireDate(null);
					} else {
						Timestamp dealDate = com.ai.common.util.TimeUtil.getTimstampByString(rekbeskhaenstart, "yyyyMMddHHmm");
						contactValue[0].setDirectMarketingProtection(1);
						contactValue[0].setProtectEffDate(dealDate);
						Timestamp endDate = com.ai.common.util.TimeUtil.getMaxExpire();
						contactValue[0].setProtectExpireDate(endDate);
						if (contactValue[0].getManualCommercialProtection() == -1) {
							contactValue[0].setManualCommercialProtection(1);
							contactValue[0].setManualProtectEffectiveDate(null);
							contactValue[0].setManualProtectExpireDate(null);
						}

					}

					if (addressFlag == 1) {
						// 更新【客户联系媒介关系】表
						// 用户是否受保护
						// if (null == nvnadrbeskhaenstar || "000000000000".equals(nvnadrbeskhaenstar)) {
						// 设置地址
						IAddressSV addrService = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
						// 构造地址对象
						address address = new address();
						address.setAddressType("CPR_ADDRESS");
						address.setDistrictId("012002002");
						// 地址判空
						int notNullFlag = 0;
						if (StringUtils.isNotBlank(komkod)) {
							address.setMunicipality(komkod.trim());
							notNullFlag = 1;
						} else {
							address.setMunicipality("");
						}
						if (StringUtils.isNotBlank(postdisttxt)) {
							address.setCity(postdisttxt.trim());
							notNullFlag = 1;
						} else {
							address.setCity("");
						}

						if (StringUtils.isNotBlank(bynvn)) {
							address.setCounty(bynvn.trim());
							notNullFlag = 1;
						} else {
							address.setCounty("");
						}
						if (StringUtils.isNotBlank(vejadrnvn)) {
							address.setStreetName(vejadrnvn.trim());
							notNullFlag = 1;
						}

						if (StringUtils.isNotBlank(sideDoor)) {
							notNullFlag = 1;
							if (CmCommonUtil.validateSidedoer(sideDoor)) {
								address.setApartment(sideDoor.trim());
								address.setDoorNumber("");
							} else {
								address.setDoorNumber(sideDoor.trim());
								address.setApartment("");
							}
						} else {
							address.setApartment("");
							address.setDoorNumber("");
						}
						if (StringUtils.isNotBlank(floor)) {
							address.setFloor(floor.trim());
							notNullFlag = 1;
						} else {
							address.setFloor("");
						}
						if (StringUtils.isNotBlank(housNo)) {
							notNullFlag = 1;
							if (Character.isLetter(housNo.charAt(housNo.length() - 1))) {
								address.setHouseNumber(String.valueOf(Integer.valueOf(housNo.substring(0, housNo.length() - 1).trim())));
								address.setHouseLetter(String.valueOf(housNo.charAt(housNo.length() - 1)));
							} else {
								address.setHouseNumber(String.valueOf(Integer.valueOf(housNo.trim())));
								address.setHouseLetter("");
							}
						}

						/*
						 * if(null != sideDoor){
						 * address.setDirection(sideDoor.trim()); }else{
						 * address.setDirection(""); }
						 */

						if (StringUtils.isNotBlank(postcode)) {
							notNullFlag = 1;
							address.setZipcode(postcode.trim());
						} else {
							address.setZipcode("");
						}

						/*
						 * if(null != BNR){ address.setBuildingNo(BNR.trim());
						 * }else{ address.setBuildingNo(""); }
						 */

						// 文件中没有字段给默认值
						address.setAddrDesc("");
						address.setMainDoor("");
						// address.setMunicipality("");
						long addressId = 0;
						if (notNullFlag == 1) {
							if (!NO_DEAL_ADDRESS_STATUS.contains(status)) {
								addressId = addrService.saveAddress(address);
							}
						}
						if (addressId > 0) {
							// 设置地址ID
							contactValue[0].setContAddress(String.valueOf(addressId));
							address addressInfo = addrService.getAddress(addressId, "012002002");
							if (null != addressInfo) {
								// 设置地址的详细描述
								contactValue[0].setRemarks(addressInfo.getAddrDesc());
							}
						}
					}
					if (protectFlag == 1) {
						Timestamp effDate;
						if (StringUtils.isBlank(nvnadrbeskhaenstar) || "000000000000".equals(nvnadrbeskhaenstar)) {
							effDate = TimeUtil.getSysTime();
						} else {
							// 设置地址受保护
							effDate = com.ai.common.util.TimeUtil.getTimstampByString(nvnadrbeskhaenstar, "yyyyMMddHHmm");
						}
						Timestamp endDate = com.ai.common.util.TimeUtil.getMaxExpire();
						contactValue[0].setExt1(String.valueOf(CmConstants.YesOrNo.YES));
						contactValue[0].setExt9(effDate);
						contactValue[0].setExt10(endDate);
					}

					voPartyValue.setParty(partyValue);
					voPartyValue.setPartyContact(contactValue[0]);
					CmServiceFactory.getPartySV().saveParty(voPartyValue);

					// 修改payer信息需要同步客户资料营销受保护，地址受保护,名称等
					ICmCustRequestTaskSV requestTaskSV = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
					IBOCmPsPublicDealValue psPublicDealValue = new BOCmPsPublicDealBean();
					psPublicDealValue.setEntityId(contactValue[0].getPartyId());
					psPublicDealValue.setPartyId(contactValue[0].getPartyId());
					psPublicDealValue.setEntityType(CmConstants.EntityType.PAYER);
					psPublicDealValue.setExecAction(CmConstants.PsPublicAction.PUBLIC_INFO_SYS);
					requestTaskSV.savePublicWordOrder(psPublicDealValue);

					// 用于判断是否生成TT
					if (NO_DEAL_ADDRESS_STATUS.contains(status)) {
						addressFlag = 0;
					}
				}

				// 变更【客户请求任务】表
				service.changeRequestStatusAndResults(cprId, CmConstants.RequestType.ADD, "000");

			} else if ("S".equals(matchtyp)) {
				// S的情况只需要变更【客户请求任务】表 请求结果待定
				service.changeRequestStatusAndResults(cprId, CmConstants.RequestType.DELETE, "000");
			}
		} else {
			// 通过cprId查询出custId
			ICmIndivCustomerSV indivSV = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
			long custId = indivSV.queryCustIdByPNR(cprId);
			// 针对送回来的是custId
			if (StringUtils.isBlank(matchtyp) || "T".equals(matchtyp)) {
				numCode = custId;
				// 如果是S，该记录后面都没有信息，都是空的，然后这个文件中会追加一条Record
				// type是010（代表退订）的记录，使用相同的CPR_ID
				// 更新客户基本信息及客户拓展信息--客户信息修改未同步修改计费等信息 20140723
				IVOCustValue custValue = new VOCustBean();

				// 客户基本信息的拼装
				BOCmIndivCustomerBean bean = new BOCmIndivCustomerBean();
				bean.setCustId(custId);
				IBOCmIndivCustomerValue value = (IBOCmIndivCustomerValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
				ICustomerValue customerValue = new CustomerBean();
				customerValue.copy(value);
				// 个人用户设置类型为1
				customerValue.setCustType(1);
				customerValue.setRegionId(CmCommonUtil.getDefaultRegionId());
				if (StringUtils.isNotBlank(formelnvn)) {
					customerValue.setFirstName(formelnvn.trim());
				}
				if (StringUtils.isNotBlank(efternvn)) {
					customerValue.setLastName(efternvn.trim());
				}
				custValue.setCustomer(customerValue);

				// 更新【客户信息】表里面的数据
				// service.updateCPRInfoToCustomer(custId, formelnvn, efternvn);
				// 客户扩展信息的拼装
				// 更新【客户拓展信息】表里面的数据
				IBOCmxIndivCustomerValue cmxIndivCustomerValue = service.queryCmxIndivCustomerValue(custId);
				if (null != cmxIndivCustomerValue) {
					cmxIndivCustomerValue.setRegionId(CmCommonUtil.getDefaultRegionId());
					// statushaenstart
					if (StringUtils.isBlank(statushaenstart) || "000000000000".equals(statushaenstart)) {

					} else {
						Timestamp statusEffDate = com.ai.common.util.TimeUtil.getTimstampByString(statushaenstart, "yyyyMMddHHmm");
						cmxIndivCustomerValue.setStatusEffDate(statusEffDate);
					}

					cmxIndivCustomerValue.setPersonStatus(status);
					if (StringUtils.isNotBlank(tilflydto) && !"000000000000".equals(tilflydto)) {
						Timestamp strDate = com.ai.common.util.TimeUtil.getTimstampByString(tilflydto, "yyyyMMddHHmm");
						cmxIndivCustomerValue.setCurResidenceStrDate(strDate);
					}
					if (StringUtils.isNotBlank(convn)) {
						cmxIndivCustomerValue.setCoName(convn);
					}
					// 设置营销受保护
					if (StringUtils.isBlank(rekbeskhaenstart) || "000000000000".equals(rekbeskhaenstart)) {
						cmxIndivCustomerValue.setDirectMarketingProtection(0);
						cmxIndivCustomerValue.setProtectEffDate(null);
						cmxIndivCustomerValue.setProtectExpireDate(null);
					} else {
						Timestamp dealDate = com.ai.common.util.TimeUtil.getTimstampByString(rekbeskhaenstart, "yyyyMMddHHmm");
						cmxIndivCustomerValue.setDirectMarketingProtection(1);
						cmxIndivCustomerValue.setProtectEffDate(dealDate);
						Timestamp endDate = com.ai.common.util.TimeUtil.getMaxExpire();
						cmxIndivCustomerValue.setProtectExpireDate(endDate);
						if (cmxIndivCustomerValue.getManualCommercialProtection() == -1) {
							cmxIndivCustomerValue.setManualCommercialProtection(1);
							cmxIndivCustomerValue.setManualProtectEffectiveDate(null);
							cmxIndivCustomerValue.setManualProtectExpireDate(null);
						}
					}
					// service.saveCmxIndivCustomer(cmxIndivCustomerValue);
				}
				custValue.setUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer, cmxIndivCustomerValue);

				if ("000000000000".equals(tilflydto)) {
					if ("01".equalsIgnoreCase(status) || "05".equalsIgnoreCase(status)) {
						protectFlag = 1;
						addressFlag = 0;
					}
				}
				long addressId = 0;
				if (addressFlag == 1) {

					// 更新【客户联系媒介关系】表
					// 用户是否受保护
					// if (null == nvnadrbeskhaenstar || "000000000000".equals(nvnadrbeskhaenstar)) {
					// 该客户不是受保护的，更新地址信息，保存农场信息
					IAddressSV addrService = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
					// 构造地址对象
					address address = new address();
					address.setAddressType("CPR_ADDRESS");
					address.setDistrictId("012002002");
					// 地址判空
					int notNullFlag = 0;
					if (StringUtils.isNotBlank(komkod)) {
						address.setMunicipality(komkod.trim());
						notNullFlag = 1;
					} else {
						address.setMunicipality("");
					}
					if (StringUtils.isNotBlank(postdisttxt)) {
						address.setCity(postdisttxt.trim());
						notNullFlag = 1;
					} else {
						address.setCity("");
					}

					if (StringUtils.isNotBlank(bynvn)) {
						address.setCounty(bynvn.trim());
						notNullFlag = 1;
					} else {
						address.setCounty("");
					}
					if (StringUtils.isNotBlank(vejadrnvn)) {
						address.setStreetName(vejadrnvn.trim());
						notNullFlag = 1;
					}
					if (StringUtils.isNotBlank(sideDoor)) {
						notNullFlag = 1;
						if (CmCommonUtil.validateSidedoer(sideDoor)) {
							address.setApartment(sideDoor.trim());
							address.setDoorNumber("");
						} else {
							address.setDoorNumber(sideDoor.trim());
							address.setApartment("");
						}
					} else {
						address.setApartment("");
						address.setDoorNumber("");
					}

					if (StringUtils.isNotBlank(floor)) {
						address.setFloor(floor.trim());
						notNullFlag = 1;
					} else {
						address.setFloor("");
					}

					if (StringUtils.isNotBlank(housNo)) {
						notNullFlag = 1;
						if (Character.isLetter(housNo.charAt(housNo.length() - 1))) {
							address.setHouseNumber(String.valueOf(Integer.valueOf(housNo.substring(0, housNo.length() - 1).trim())));
							address.setHouseLetter(String.valueOf(housNo.charAt(housNo.length() - 1)));
						} else {
							address.setHouseNumber(String.valueOf(Integer.valueOf(housNo.trim())));
							address.setHouseLetter("");
						}
					} else {
						address.setHouseNumber("");
						address.setHouseLetter("");
					}

					/*
					 * if(null != sideDoor){
					 * address.setDirection(sideDoor.trim()); }else{
					 * address.setDirection(""); }
					 */

					if (StringUtils.isNotBlank(postcode)) {
						notNullFlag = 1;
						address.setZipcode(postcode.trim());
					} else {
						address.setZipcode("");
					}

					/*
					 * if(null != BNR){ address.setBuildingNo(BNR.trim());
					 * }else{ address.setBuildingNo(""); }
					 */

					// 文件中没有字段给默认值
					address.setAddrDesc("");
					address.setMainDoor("");
					// address.setMunicipality("");
					// 地址层级中增加CO_NAME
					if (StringUtils.isNotBlank(convn)) {
						address.setCoName(convn);
						notNullFlag = 1;
					} else {
						address.setCoName("");
					}
					if (notNullFlag == 1) {
						if (!NO_DEAL_ADDRESS_STATUS.contains(status)) {
							addressId = addrService.saveAddress(address);
						}
					}
					// 保存客户资料之前验重
					// 避免保存客户地址验重不通过，但客户基本信息变更生效未回退
					if (addressId > 0) {
						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
						Timestamp birth = custValue.getCustomer().getBirthday();
						String birthDay = "";
						if (birth != null) {
							birthDay = df.format(birth);
						}
						String custName = custValue.getCustomer().getFirstName() + " " + custValue.getCustomer().getLastName();
						String addressDetail = CmCommonUtil.getStandAddressDesc(address);
						try {
							address realAddress = addrService.getAddress(addressId, CmConstants.AddressDistrictId.DISTRICT_ID);
							if (realAddress != null) {
								addressDetail = CmCommonUtil.getStandAddressDesc(realAddress);
							}
						} catch (Exception e) {
							log.error("dealFileDateToDBForType001 getAddress error.", e);
						}
						CmCommonUtil.judgeDuplicateCustomer(custId, birthDay, addressId, addressDetail, custName);
						changeAddressId(custId, addressId, null, addressDetail);
					}
					// 如果客户原来是受保护的则需要退订phoneBook
					// if (indivSV.ifCustIsProtected(custId)) {
					// 插入工单退订
					// taskSV.saveCustAKSInfo(customerValue, CmConstants.PsPublicAction.PHONE_NUM_HIDE);
					// }
				}

				CmServiceFactory.getCustomerSV().saveCustomer(custValue);

				// 没有地址层级，sff不支持
				// if (null != location && location.trim().length() > 0) {
				// saveFarmAddress(custId, location.trim(), null, CmConstants.AddressId.farmAddress);
				// }
				if (protectFlag == 1) {
					Timestamp effDate;
					if (StringUtils.isBlank(nvnadrbeskhaenstar) || "000000000000".equals(nvnadrbeskhaenstar)) {
						effDate = TimeUtil.getSysTime();
					} else {
						// 设置地址受保护
						effDate = com.ai.common.util.TimeUtil.getTimstampByString(nvnadrbeskhaenstar, "yyyyMMddHHmm");
					}
					// 该客户是受保护的，更新农场信息，送phonebook
					changeAddressId(custId, -1, effDate, null);
					// 订购phonebook
					IPhoneBookSV sv = (IPhoneBookSV) ServiceFactory.getService(IPhoneBookSV.class);
					sv.modifyCustomerCVRState(custId, -1);
				}
				// 用于判断是否生成TT
				if (NO_DEAL_ADDRESS_STATUS.contains(status)) {
					addressFlag = 0;
				}
				IBOCmCustRequestTaskValue[] taskValues = taskSV.queryByCustId(custId);
				if (CmCommonUtil.isNotEmptyObject(taskValues)) {
					if (taskValues[0].getRequestStatus().equals(CmConstants.RequestStatus.processing)) {
						// 发短信通知客户
						sendMsgToCust(custId);
					}
				}

				// 变更【客户请求任务】表
				service.changeRequestStatusAndResults(cprId, CmConstants.RequestType.ADD, "000");

			} else if ("S".equals(matchtyp)) {
				// S的情况只需要变更【客户请求任务】表 请求结果待定
				service.changeRequestStatusAndResults(cprId, CmConstants.RequestType.DELETE, "000");
			}
			
			if(addressFlag==0){
				//在没有修改地址的时候，需要调用phonebook的接口，传送一下名字
				ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
				IBOCmCustContactMediumValue[] contactMediumValues = customerSV.queryContactMediumByCondition(custId, CmConstants.AddressId.legalAddress);
				if(null!=contactMediumValues&&contactMediumValues.length>0){
					// 修改法律地址需要调用phonebook接口，同步送phonebook
					IPhoneBookSV phoneBookSV = (IPhoneBookSV) ServiceFactory.getService(IPhoneBookSV.class);
					phoneBookSV.changePhonebookWhenModifyAddress(custId, contactMediumValues[0].getAddressId());
				}
			}
		}
		// Status = 03,07,20,30,50,60,70,80，90，以及地址受保护生成TT
		if (addressFlag == 0) {
			if (numCode > 0) {
				service.saveCprToTtTask(numCode, "00" + status, dataContent.trim());
				cprTTMap.put(numCode, "00" + status);
			}
		}
	}

	public void modifyPayer(String addressId, String oldAddressId, long partyId, String addressDetail, long contId) throws Exception {
		if(oldAddressId!=null && !addressId.equals(oldAddressId)) {
			ICmPartyRoleSV partyRoleSV=(ICmPartyRoleSV)ServiceFactory.getService(ICmPartyRoleSV.class);
			com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue[] partyRoleValue=partyRoleSV.queryPartyRole(partyId, 5, -1, -1);
			if(partyRoleValue!=null && partyRoleValue.length>0){
				ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
				IQBOCmPartyValue party = partySV.queryPayerByPartyId(partyId);
				if(CmCommonUtil.isNotEmptyObject(party)) {
					List addressList =new ArrayList();
					Map temp0=new HashMap();
					temp0.put("PAYER_ID", partyId);
					temp0.put("PAYER_TYPE", 1);
					temp0.put("FAMILY_NAMES", party.getLastName());
					temp0.put("MIDDLE_NAMES", party.getFirstName());
					temp0.put("BIRTHDAY", party.getBirthday());
					temp0.put("ADDRESS_ID",  addressId);
					temp0.put("VALID_DATE", DateTimeUtil.getCurrentDate());
					temp0.put("COMMIT_DATE", DateTimeUtil.getCurrentDate());
					temp0.put("EXPIRE_DATE", com.ai.common.util.TimeUtil.getMaxExpire());
					temp0.put("TENANT_ID", TenantIDFactory.getTenantId());
					temp0.put("OP_ID",ServiceManager.getUser().getID());
					temp0.put("ORG_ID",ServiceManager.getUser().getOrgId());
					temp0.put("TAX_NO", party.getCertCode());
					temp0.put("OPER_TYPE", 2);
					temp0.put("ADDRESS", addressDetail);

/*					try {
						//查询email排序为最小的记录 //CUST:PHONE_NUMBER CUST_EMAIL PAYER:PHONE_NUMBER PAYER_EMAIL
						ICmCustomerSV cmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
						IQBOCmContactContMediumInfoValue[] emailContMediums = cmCustomerSV.queryContactContMediumInfoByContId(contId, 201, -1, -1);
						if (null != emailContMediums && emailContMediums.length > 0) {
							temp0.put("PAYER_EMAIL", emailContMediums[0].getEmailAddress());
						}

						//查询phonenum 排序为最小的记录 //CUST:PHONE_NUMBER CUST_EMAIL PAYER:PHONE_NUMBER PAYER_EMAIL
						IQBOCmContactContMediumInfoValue[] phonenumContMediums = cmCustomerSV.queryContactContMediumInfoByContId(contId, 301, -1, -1);
						if (null != phonenumContMediums && phonenumContMediums.length > 0) {
							temp0.put("PHONE_NUMBER", phonenumContMediums[0].getContNumber());
						}
					} catch (Exception e) {
						log.error("deal party contact error.", e);
					}*/

					addressList.add(temp0);
					Map result=new HashMap();
					result.put("I_PAYER", addressList);
					IInterfaceBillCrmSV interfaceBillCrmSV = (IInterfaceBillCrmSV) ServiceFactory.getService(IInterfaceBillCrmSV.class);	
					interfaceBillCrmSV.sendMapOrderInfoToBilling(result);
				}

			}

		}
	}

	/**
	 * 
	 * @Function dealFileDateToDBForType002
	 * @Description 客户移民
	 * 
	 * @param dataContent
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-8-25 下午2:53:58
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       2014-8-25 mael v1.0.0 修改原因<br>
	 */
	private void dealFileDateToDBForType002(String dataContent) throws Exception {
		String kunderefnr = dataContent.substring(3, 18);
		long cprId = Long.parseLong(kunderefnr.trim());
		long numCode = 0L;
		if (custFlag) {// 只是针对传回来的是custId
			// 通过PNR查询出custId
			ICmIndivCustomerSV indivSV = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
			numCode = indivSV.queryCustIdByPNR(cprId);
			// 改变客户的personstatus
			// personStatus的更新根据001文件
			// modifyPersonStatus(numCode, "80");
		} else {
			// 针对传回来的是partyId
			ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			IBOCmPartyValue[] partyValues = custSV.queryPartyByCprId(cprId);
			if (CmCommonUtil.isNotEmptyObject(partyValues)) {
				numCode = partyValues[0].getPartyId();
			}
		}
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		if(numCode>0){
			service.saveCprToTtTask(numCode, "0080", dataContent.trim());
			if (!cprTTMap.containsKey(numCode)) {
				cprTTMap.put(numCode, "0080");
			}
		}
	}

	/**
	 * 
	 * @Function dealFileDateToDBForType003
	 * @Description 死亡，失踪
	 * 
	 * @param dataContent
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-8-25 下午2:54:17
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       2014-8-25 mael v1.0.0 修改原因<br>
	 */
	private void dealFileDateToDBForType003(String dataContent) throws Exception {
		String kunderefnr = dataContent.substring(3, 18);
		long cprId = Long.parseLong(kunderefnr.trim());
		long numCode = 0L;
		ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		if (custFlag) {// 只针对传回来的是custId
			// 根据cprId查询出custId
			ICmIndivCustomerSV indivSV = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
			numCode = indivSV.queryCustIdByPNR(cprId);
			// modifyPersonStatus
			// personStatus的更新根据001文件
			// modifyPersonStatus(custId, "70");
		} else {
			// 针对传回来的是partyId
			IBOCmPartyValue[] partyValues = custSV.queryPartyByCprId(cprId);
			if (CmCommonUtil.isNotEmptyObject(partyValues)) {
				numCode = partyValues[0].getPartyId();
			}
		}
		// 正常场景中003记录上面一定有同一个cprId的001记录，补充联系人信息
		if(numCode>0){
			if (!cprTTMap.containsKey(numCode)) {
				cprTTMap.put(numCode, "0070");
			}
			// 保存TT信息
			custSV.saveCprToTtTask(numCode, cprTTMap.get(numCode).toString(), dataContent.trim());
		}
	}

	/**
	 * 保存TT信息
	 */
	private void saveTTInfo(long numCode, String errorCode, String errorMsg) throws Exception {
		// 调用TT接口保存错误日志
		Map map = new HashMap();
		// 客户ID(只有客户塞custId,其他的塞partyId)
		map.put("CUST_ID", String.valueOf(numCode));
		// error_code
		map.put("ERROR_CODE", errorCode);
		// 错误code
		map.put("ERROR_MESSAGE", errorMsg);
		if (INVALID_CPR_NUMBER.indexOf(errorCode) >= 0) {
			// TT类型
			map.put("TICKET_TYPE", "076005029");
		} else if (CPR_MISMATCH.indexOf(errorCode) >= 0) {
			// TT类型
			map.put("TICKET_TYPE", "076005030");
		}
		// 个人传CPR
		map.put("SOURCE_SYSTEM", "CPR");
		// 错误message
		map.put("ERROR_EXT_INFO", errorMsg);
		CmCommonUtil.CreateTicketForCM(map);
	}

	/**
	 * 修改客户的personstatus
	 */
	private void modifyPersonStatus(long custId, String personStatus) throws Exception {
		BOCmxIndivCustomerBean cmxIndivValue = new BOCmxIndivCustomerBean();
		cmxIndivValue.initProperty("CUST_ID", custId);
		cmxIndivValue.initProperty("REGION_ID", CmCommonUtil.getDefaultRegionId());
		cmxIndivValue.setPersonStatus(personStatus);
		CmInnerServiceFactory.getCommonInnerSV().saveBean(cmxIndivValue);
	}

	/**
	 * 
	 * @Function saveCurResidenceStrDate
	 * @Description 保存当前居住地开始时间
	 * 
	 * @param custId
	 * @param date
	 * @param cprState
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-8-29 上午10:15:24
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       2014-8-29 mael v1.0.0 修改原因<br>
	 */
	private void saveCurResidenceStrDate(long custId, String date, String cprState) throws Exception {
		IVOCustValue custValue = new VOCustBean();
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);

		// 个人客户信息
		BOCmIndivCustomerBean bean = new BOCmIndivCustomerBean();
		bean.setCustId(custId);
		IBOCmIndivCustomerValue value = (IBOCmIndivCustomerValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
		ICustomerValue customerValue = new CustomerBean();
		customerValue.copy(value);
		// 个人用户设置类型为1
		customerValue.setCustType(1);
		customerValue.setRegionId(CmCommonUtil.getDefaultRegionId());
		custValue.setCustomer(customerValue);

		// 扩展信息表
		IBOCmxIndivCustomerValue cmxIndivCustomerValue = service.queryCmxIndivCustomerValue(custId);

		if (null != cmxIndivCustomerValue) {
			cmxIndivCustomerValue.setRegionId(CmCommonUtil.getDefaultRegionId());
			Timestamp strDate = com.ai.common.util.TimeUtil.getTimstampByString(date, "yyyyMMddHHmm");
			cmxIndivCustomerValue.setCurResidenceStrDate(strDate);
			cmxIndivCustomerValue.setPersonStatus(cprState);
		}
		custValue.setUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer, cmxIndivCustomerValue);

		CmServiceFactory.getCustomerSV().saveCustomer(custValue);
	}

	/**
	 * 
	 * @Function dealFileDateToDBForType005
	 * @Description
	 * 
	 * @param dataContent
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-7-8 下午3:22:17
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       2014-7-8 mael v1.0.0 修改原因<br>
	 */
	private void dealFileDateToDBForType005(String dataContent) throws Exception {
		// 记录类型--监护人
		// String recordType = dataContent.substring(0, 3);
		// CPR_ID
		String kunderefnr = dataContent.substring(3, 18);
		// Date of CPR generating the record
		// String proddto = dataContent.substring(18, 26);
		// It’s always ‘P’, but not used
		// String pnrsenrmrk = dataContent.substring(26, 27);
		// Date for Legal guardian
		String umynmynHaenstart = dataContent.substring(27, 39);
		// First, middle and last name of legal gardian
		String adressa = dataContent.substring(39, 73);
		// address_1
		String Vargeadressetxt_linie1 = dataContent.substring(73, 107);
		// address_2
		// String Vargeadressetxt_linie2 = dataContent.substring(107, 141);
		// address_3
		// String Vargeadressetxt_linie3 = dataContent.substring(141, 175);
		// address_4
		// String Vargeadressetxt_linie4 = dataContent.substring(175, 209);
		// address_5
		// String Vargeadressetxt_linie5 = dataContent.substring(209, 243);

		// 创建监护人--联系人的一种
		long cprId = Long.parseLong(kunderefnr.trim());
		long partyIdLegal = 0; 
		if (custFlag) {// 只针对传回来的是custId
			// 通过cprId查询出custId
			ICmIndivCustomerSV indivSV = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
			long custId = indivSV.queryCustIdByPNR(cprId);
			String regionId = CmCommonUtil.getDefaultRegionId(); 
			Timestamp effDate = null;
			if (null != umynmynHaenstart && !umynmynHaenstart.equals("")) {
				effDate = com.ai.common.util.TimeUtil.getTimstampByString(umynmynHaenstart, "yyyyMMddHHmm");
			} else {
				Date date = new Date();
				effDate = com.ai.common.util.TimeUtil.getTruncDate(date);
			}
			Timestamp expireDate = com.ai.common.util.TimeUtil.getMaxExpire();
			ICmContactSV service = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
			IBOCmIndivContactValue[] cmIndivContacts = service.queryIndivContactsByCustId(custId);
			if (null != cmIndivContacts && cmIndivContacts.length > 0) {
				// 更新个人客户联系人信息表
				BOCmIndivContactBean bean = new BOCmIndivContactBean();
				cmIndivContacts[0].setEffectiveDate(effDate);
				cmIndivContacts[0].setExpireDate(expireDate);
				bean.copy(cmIndivContacts[0]);
				CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);

				// 更新参与人联系信息表
				long contId = cmIndivContacts[0].getContId();
				long partyId = cmIndivContacts[0].getPartyId();
				partyIdLegal = partyId;
				IBOCmPartyContactValue partyContactValue = service.queryPartyContactByContId(contId);
				if (null == partyContactValue) {
					BOCmPartyContactBean partyContact = new BOCmPartyContactBean();
					if (null != adressa) {
						partyContact.setContName(adressa.trim());
					}
					if (null != Vargeadressetxt_linie1) {
						partyContact.setContAddress(Vargeadressetxt_linie1.trim());

						try {
							IAddressSV addrService = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
							address addressInfo = addrService.getAddress(Long.parseLong(Vargeadressetxt_linie1.trim()), "");
							if (addressInfo != null && StringUtils.isNotEmpty(addressInfo.getAddrDesc())) {
								// 设置地址的详细描述
								partyContact.setRemarks(addressInfo.getAddrDesc());
							}
						} catch (Exception ignored) {

						}
					}
					partyContact.setEffectiveDate(effDate);
					partyContact.setExpireDate(expireDate);
					partyContact.setContId(contId);
					partyContact.setPartyId(partyId);
					partyContact.setRegionId(regionId);
					partyContact.setState("U");
					CmInnerServiceFactory.getCommonInnerSV().saveBean(partyContact);
				} else {
					String oldAddressId = partyContactValue.getContAddress();
					BOCmPartyContactBean partyContact = new BOCmPartyContactBean();
					if (null != adressa) {
						partyContactValue.setContName(adressa.trim());
					}
					if (null != Vargeadressetxt_linie1) {
						partyContactValue.setContAddress(Vargeadressetxt_linie1.trim());

						try {
							IAddressSV addrService = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
							address addressInfo = addrService.getAddress(Long.parseLong(Vargeadressetxt_linie1.trim()), "");
							if (addressInfo != null && StringUtils.isNotEmpty(addressInfo.getAddrDesc())) {
								// 设置地址的详细描述
								partyContactValue.setRemarks(addressInfo.getAddrDesc());
							}
						} catch (Exception ignored) {

						}
					}
					partyContactValue.setEffectiveDate(effDate);
					partyContactValue.setExpireDate(expireDate);
					partyContact.copy(partyContactValue);
					CmInnerServiceFactory.getCommonInnerSV().saveBean(partyContact);
					//AI-12211 还更新i_payer
					if (null != Vargeadressetxt_linie1) {
						modifyPayer(Vargeadressetxt_linie1.trim(), oldAddressId, partyId, partyContactValue.getRemarks(), partyContactValue.getContId());
					}
				}

				// 更新参与人基本信息表
				IBOCmPartyValue cmPartyValue = service.queryCmPartyByPartyId(partyId);
				if (null == cmPartyValue) {
					BOCmPartyBean partyInfo = new BOCmPartyBean();
					partyInfo.setPartyId(partyId);
					if (null != adressa) {
						partyInfo.setPartyName(adressa.trim());
						String firstName = adressa.trim().substring(0, adressa.trim().lastIndexOf(" "));
						String lastName = adressa.trim().substring(adressa.trim().lastIndexOf(" ")+1, adressa.trim().length());
						partyInfo.setFirstName(firstName);
						partyInfo.setLastName(lastName);
					}
					partyInfo.setEffectiveDate(effDate);
					partyInfo.setExpireDate(expireDate);
					partyInfo.setRegionId(regionId);
					partyInfo.setPartyType(1);
					partyInfo.setState("U");
					CmInnerServiceFactory.getCommonInnerSV().saveBean(partyInfo);
				} else {
					BOCmPartyBean partyInfo = new BOCmPartyBean();
					if (null != adressa) {
						cmPartyValue.setPartyName(adressa.trim());
						String firstName = adressa.trim().substring(0, adressa.trim().lastIndexOf(" "));
						String lastName = adressa.trim().substring(adressa.trim().lastIndexOf(" ")+1, adressa.trim().length());
						cmPartyValue.setFirstName(firstName);
						cmPartyValue.setLastName(lastName);
					}
					cmPartyValue.setEffectiveDate(effDate);
					cmPartyValue.setExpireDate(expireDate);
					partyInfo.copy(cmPartyValue);
					CmInnerServiceFactory.getCommonInnerSV().saveBean(partyInfo);
				}
				
				
				log.info("CPRReceive try to add party role. partyId="+partyIdLegal);
				ICmPartyRoleSV partyRoleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
				com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue[]  cmPartyRoleValues = partyRoleSV.queryPartyRoles(partyId,4,1);
				if(null!=cmPartyRoleValues&&cmPartyRoleValues.length>0) {
					cmPartyRoleValues[0].setEffectiveDate(effDate);
					cmPartyRoleValues[0].setExpireDate(expireDate);
					partyRoleSV.dealPartyRoleForContact(partyIdLegal,3,cmPartyRoleValues[0]);
				}else {
					partyRoleSV.dealPartyRoleForContact(partyIdLegal,1,null);
				}
				
				log.info("CPRReceive try to add party role. partyId="+partyIdLegal+"   ====Success");
				
				//添加cm_indiv_party
				log.info("CPRReceive try to add indivParty. partyId="+partyIdLegal+"");
				ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
				IBOCmIndivPartyValue[] cmIndivPartyValues = partySV.queryCmIndivPartyByPartyId(partyId);
				if(null!=cmIndivPartyValues&&cmIndivPartyValues.length>0) {
					cmIndivPartyValues[0].setEffectiveDate(effDate);
					cmIndivPartyValues[0].setExpireDate(expireDate);
					partySV.dealCmIndivPartyForContact(partyIdLegal, 3, regionId,cmIndivPartyValues[0]);
				}else {
					partySV.dealCmIndivPartyForContact(partyIdLegal, 1, regionId,null);
				}
			
				log.info("CPRReceive try to add indivParty. partyId="+partyIdLegal+"   ====Success");
			} else {
				long partyId = CmCommonUtil.getNewSequence(BOCmPartyBean.class);
				long contId = CmCommonUtil.getNewSequence(BOCmPartyContactBean.class);
				partyIdLegal = partyId;
				// 个人客户联系人信息表
				BOCmIndivContactBean bean = new BOCmIndivContactBean();
				bean.setCustId(custId);
				bean.setEffectiveDate(effDate);
				bean.setExpireDate(expireDate);
				bean.setContType(1);
				bean.setCustContId(CmCommonUtil.getNewSequence(BOCmIndivContactBean.class));
				bean.setContId(contId);
				bean.setPartyId(partyId);
				bean.setState("U");
				bean.setRegionId(regionId);
				CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);

				// 参与人联系信息表
				BOCmPartyContactBean partyContact = new BOCmPartyContactBean();
				if (null != adressa) {
					partyContact.setContName(adressa.trim());
				}
				if (null != Vargeadressetxt_linie1) {
					partyContact.setContAddress(Vargeadressetxt_linie1.trim());

					try {
						IAddressSV addrService = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
						address addressInfo = addrService.getAddress(Long.parseLong(Vargeadressetxt_linie1.trim()), "");
						if (addressInfo != null && StringUtils.isNotEmpty(addressInfo.getAddrDesc())) {
							// 设置地址的详细描述
							partyContact.setRemarks(addressInfo.getAddrDesc());
						}
					} catch (Exception ignored) {

					}
				}
				partyContact.setEffectiveDate(effDate);
				partyContact.setExpireDate(expireDate);
				partyContact.setContId(contId);
				partyContact.setPartyId(partyId);
				partyContact.setRegionId(regionId);
				partyContact.setState("U");
				CmInnerServiceFactory.getCommonInnerSV().saveBean(partyContact);

				// 参与人基本信息表
				BOCmPartyBean partyInfo = new BOCmPartyBean();
				partyInfo.setPartyId(partyId);
				if (null != adressa) {
					partyInfo.setPartyName(adressa.trim());
					
					String firstName = adressa.trim().substring(0, adressa.trim().lastIndexOf(" "));
					String lastName = adressa.trim().substring(adressa.trim().lastIndexOf(" ")+1, adressa.trim().length());
					partyInfo.setFirstName(firstName);
					partyInfo.setLastName(lastName);
				}
				partyInfo.setEffectiveDate(effDate);
				partyInfo.setExpireDate(expireDate);
				partyInfo.setRegionId(regionId);
				partyInfo.setPartyType(1);
				partyInfo.setState("U");
				CmInnerServiceFactory.getCommonInnerSV().saveBean(partyInfo);
			
				log.info("CPRReceive try to add party role. partyId="+partyIdLegal);
				ICmPartyRoleSV partyRoleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
				partyRoleSV.dealPartyRoleForContact(partyIdLegal,1,null);
				log.info("CPRReceive try to add party role. partyId="+partyIdLegal+"   ====Success");
				
				//添加cm_indiv_party
				log.info("CPRReceive try to add indivParty. partyId="+partyIdLegal+"");
				ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
				partySV.dealCmIndivPartyForContact(partyIdLegal, 1, regionId,null);
				log.info("CPRReceive try to add indivParty. partyId="+partyIdLegal+"   ====Success");
			}
		}
	}

	/**
	 * 
	 * @Function dealFileDateToDBForType010
	 * @Description 退订
	 * 
	 * @param dataContent
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-7-1 上午10:41:57
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       2014-7-1 mael v1.0.0 修改原因<br>
	 */
	private void dealFileDateToDBForType010(String dataContent) throws Exception {
		// 记录类型，用来标识该条记录是订购，或者退订等等
		// String recordType = dataContent.substring(0, 3);
		// CPR_ID
		String kunderefnr = dataContent.substring(3, 18);
		// CPR生成该记录的时间
		// String proddto = dataContent.substring(18, 26);
		// It’s always ‘P’, but not used
		// String pnrsenrmrk = dataContent.substring(26, 27);

		long cprId = Long.parseLong(kunderefnr.trim());
		ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		if (custFlag) {
			//AI-7640 Customer Management Defect_Fomer customer should not remove CPR number
			// 针对传回来的是partyId
//			IBOCmPartyValue[] values = custSV.queryPartyByCprId(cprId);
//			if (CmCommonUtil.isNotEmptyObject(values)) {
//				deleteCPRInfo(values[0].getPartyId());
//			}
//		} else {// 针对传回来的是custId
			// 通过cprId查询出custId
			ICmIndivCustomerSV indivSV = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
			long custId = indivSV.queryCustIdByPNR(cprId);
			com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICmCustomerSV service = (com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICmCustomerSV) ServiceFactory
					.getService(com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICmCustomerSV.class);
			service.dealCreateCustomer(custId, true);
		}
		// 修改工单表的状态
		custSV.changeRequestStatusAndResults(cprId, CmConstants.RequestType.DELETE, "000");

	}

	/**
	 * 
	 * @Function dealFileDateToDBForType011
	 * @Description 
	 *
	 * @param dataContent
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-8-29 上午10:33:48
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-8-29     mael           v1.0.0               修改原因<br>
	 */
	private void dealFileDateToDBForType011(String dataContent) throws Exception {
		// String recordType = dataContent.substring(0, 3);

		String kunderefnr = dataContent.substring(3, 18);

		// String proddto = dataContent.substring(18, 26);

		// String pnrsenrmrk = dataContent.substring(26, 27);

		String kunderefnrandet1 = dataContent.substring(27, 42);

		String kunderefnrandet2 = dataContent.substring(42, 57);

		String kunderefnrandet3 = dataContent.substring(57, 72);

		String kunderefnrandet4 = dataContent.substring(72, 87);

		String kunderefnrandet5 = dataContent.substring(87, 102);

		long cprId = Long.parseLong(kunderefnr.trim());
		if (custFlag) {// 只是针对传回来的是custId
			// 通过cprId查询出custId
			ICmIndivCustomerSV indivSV = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
			long custId = indivSV.queryCustIdByPNR(cprId);
			StringBuffer sb = new StringBuffer();
			if (null != kunderefnrandet1 && kunderefnrandet1.trim().length() > 0) {
				sb.append(kunderefnrandet1.trim());
			}
			if (null != kunderefnrandet2 && kunderefnrandet2.trim().length() > 0) {
				sb.append(",").append(kunderefnrandet2.trim());
			}
			if (null != kunderefnrandet3 && kunderefnrandet3.trim().length() > 0) {
				sb.append(",").append(kunderefnrandet3.trim());
			}
			if (null != kunderefnrandet4 && kunderefnrandet4.trim().length() > 0) {
				sb.append(",").append(kunderefnrandet4.trim());
			}
			if (null != kunderefnrandet5 && kunderefnrandet5.trim().length() > 0) {
				sb.append(",").append(kunderefnrandet5.trim());
			}

			IVOCustValue custValue = new VOCustBean();
			ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);

			// 个人客户信息
			BOCmIndivCustomerBean bean = new BOCmIndivCustomerBean();
			bean.setCustId(custId);
			IBOCmIndivCustomerValue value = (IBOCmIndivCustomerValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
			ICustomerValue customerValue = new CustomerBean();
			customerValue.copy(value);
			// 个人用户设置类型为1
			customerValue.setCustType(1);
			customerValue.setRegionId(CmCommonUtil.getDefaultRegionId());
			custValue.setCustomer(customerValue);

			// 个人扩展信息
			IBOCmxIndivCustomerValue cmxIndivCustomerValue = service.queryCmxIndivCustomerValue(custId);
			if (null != cmxIndivCustomerValue) {
				cmxIndivCustomerValue.setRegionId(CmCommonUtil.getDefaultRegionId());
				cmxIndivCustomerValue.setDuplicateCprId(sb.toString());
			}
			// custValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_MODIFY);
			custValue.setUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer, cmxIndivCustomerValue);

			// 设置中心
			// CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.REGION_ID,
			// CmCommonUtil.getDefaultRegionId());
			CmServiceFactory.getCustomerSV().saveCustomer(custValue);
		}
	}

	private void dealFileDateToDBForType901(String dataContent) throws Exception {
		// 老系统的custId
		String kunderefnr = dataContent.substring(34, 49);
		// requestType
		String requestType = dataContent.substring(49, 50);
		// 错误代码
		String errorCode = dataContent.substring(50, 54);
		// 错误信息
		String errorMsg = dataContent.substring(54, 106);
		long cprId = Long.parseLong(kunderefnr.trim());
		long custId = 0L;
		ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		// 通过cprId查询出custId
		ICmIndivCustomerSV indivSV = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
		custId = indivSV.queryCustIdByPNR(cprId);
		if (custId > 0) {// 只是针对传回来的是custId
			if (StringUtils.isNotEmpty(errorCode)) {
				ICustomerValue custValue = custSV.queryDKCustomer(custId);
				if (CmCommonUtil.isNotEmptyObject(custValue)) {
					if (FLOW_CPR_CODE.indexOf(errorCode.trim()) != -1) {
						// 走对应的流程
						System.setProperty(Constant.S_COMFRAME_DEV_NAME, "CM_04");
						String templateTag = "com.asiainfo.crm.cm.vm.DealCPRErrorCode";
						HashMap aVars = new HashMap();
						aVars.put("errorCode", errorCode);
						aVars.put("cprId", cprId);
						aVars.put("errorMsg", errorMsg);
						aVars.put("opId", "1000");
						aVars.put("orgId", "2000");
						ComframeClient.createWorkflow(templateTag, "100233", "", "", aVars, null, "");

						if (String.valueOf(CmConstants.EntityType.CUSTOMER).equals(custValue.getIndivCustType())) {
							if(custId>0){
								custSV.saveCprToTtTask(custId, errorCode, dataContent.trim());
								cprTTMap.put(custId, errorCode);
							}
						} else {
							if(custValue.getPartyId()>0){
								custSV.saveCprToTtTask(custValue.getPartyId(), errorCode, dataContent.trim());
								cprTTMap.put(custValue.getPartyId(), errorCode);
							}
						}
					} else if (lOG_CPR_CODE.indexOf(errorCode.trim()) != -1) {
						// 走对应的日志
						saveErrorLog(String.valueOf(custId), "cprError", errorMsg);
					} else {
						if(!"4632".equals(errorCode)&&!"4608".equals(errorCode)&&!"4910".equals(errorCode)&&!"4919".equals(errorCode)&&!"4631".equals(errorCode)){
							// 调用TT接口(只有客户送custId,其他的送partyId)
							if (String.valueOf(CmConstants.EntityType.CUSTOMER).equals(custValue.getIndivCustType())) {
								if(custId>0){
									custSV.saveCprToTtTask(custId, errorCode, dataContent.trim());
									cprTTMap.put(custId, errorCode);
								}
							} else {
								if(custValue.getPartyId()>0){
									custSV.saveCprToTtTask(custValue.getPartyId(), errorCode, dataContent.trim());
									cprTTMap.put(custValue.getPartyId(), errorCode);
								}
							}
						}
						
					}
				}
			}
		} else {
			// 针对传回来的是partyId
			IBOCmPartyValue[] values = custSV.queryPartyByCprId(cprId);
			if (CmCommonUtil.isNotEmptyObject(values)) {
				custId = values[0].getPartyId();
			}
			if(!"4632".equals(errorCode)&&!"4608".equals(errorCode)&&!"4910".equals(errorCode)&&!"4919".equals(errorCode)&&!"4631".equals(errorCode)){
				// 调用TT接口
				saveTroubleTicket(custId, errorCode, dataContent.trim());
			}
		}
		if ("T".equals(requestType)) {
			// 订购
			// 49开头只是warning，退订购是成功的
			if (errorCode.startsWith("49")) {
				custSV.changeRequestStatusAndResults(cprId, CmConstants.RequestType.ADD, "000");
			} else {
				custSV.changeRequestStatusAndResults(cprId, CmConstants.RequestType.ADD, errorCode.trim());
			}
		} else if ("S".equals(requestType)) {
			// 退订
			if (errorCode.startsWith("49")) {
				custSV.changeRequestStatusAndResults(cprId, CmConstants.RequestType.DELETE, "000");
			} else {
				custSV.changeRequestStatusAndResults(cprId, CmConstants.RequestType.DELETE, errorCode.trim());
			}
		}
	}

	// 调用TT接口
	private void saveTroubleTicket(long custId, String errorCode, String errorMsg) throws Exception {
		// 调用TT接口保存错误日志
		Map map = new HashMap();
		// 客户ID
		map.put("CUST_ID", String.valueOf(custId));
		// error_code
		map.put("ERROR_CODE", errorCode);
		if (INVALID_CPR_NUMBER.indexOf(errorCode) >= 0) {
			// TT类型
			map.put("TICKET_TYPE", "076005029");
		} else if (CPR_MISMATCH.indexOf(errorCode) >= 0) {
			// TT类型
			map.put("TICKET_TYPE", "076005030");
		}
		IBOBsStaticDataValue staticValue = StaticDataUtil.getStaticData("CM_CUST_REQUEST_RESULTS", errorCode);
		if (CmCommonUtil.isNotEmptyObject(staticValue)) {
			// 错误code
			map.put("ERROR_MESSAGE", staticValue.getCodeName());
		}
		// 个人传CPR
		map.put("SOURCE_SYSTEM", "CPR");
		// 错误message
		map.put("ERROR_EXT_INFO", errorMsg);
		CmCommonUtil.CreateTicketForCM(map);
	}

	private void dealFileDateToDBForType903(String dataContent, String localFile) throws Exception {
		// 文件名称
		String[] file = localFile.split("/");
		String fileName = file[file.length - 1];
		// 记录编号
		String recordId = dataContent.substring(16, 26);
		// 记录类容
		String remarks = dataContent.substring(27, 132);
		// 保存CPR记录信息
		IBOCmCprRecStatisticValue value = new BOCmCprRecStatisticBean();
		value.setFileName(fileName);
		value.setRecordId(Long.parseLong(recordId));
		value.setRemarks(remarks);
		value.setState(CmConstants.RecordState.USE);
		value.setRegionId(CmCommonUtil.getDefaultRegionId());
		value.setStatisticId(CmCommonUtil.getNewSequence(BOCmCprRecStatisticBean.class));
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commonSV.saveCmCprRecStatistic(value);
	}

	/**
	 * 使用统一方法对地址进行保存
	 * 
	 * @Function changeAddressId
	 * @Description
	 * 
	 * @param custId
	 * @param addressId
	 * @param effDates
	 * @param addressDetail
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-7-17 下午3:19:55
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       2014-7-17 mael v1.0.0 修改原因<br>
	 */
	private void changeAddressId(long custId, long addressId, Timestamp effDates, String addressDetail) throws Exception {
		IBOCmCustContactMediumValue[] valueArra = new IBOCmCustContactMediumValue[1];
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IBOCmCustContactMediumValue value = service.queryCustContactMediumByCustIdAndType(custId, String.valueOf(CmConstants.AddressId.legalAddress));
		if (null == value) {
			value = new BOCmCustContactMediumBean();
			value.setCustId(custId);
			value.setContMedTypeId(CmConstants.AddressId.legalAddress);
		}
		if (addressId != -1) {
			// 地址不一致时，以CPR为准覆盖本地地址
			value.setAddressId(addressId);
			value.setAddressDetail(addressDetail);
		}
		value.setProtectEffDate(effDates);
		// 受保护失效时间改造。
		if (effDates != null) {
			Timestamp endDate = com.ai.common.util.TimeUtil.getMaxExpire();
			value.setProtectExpDate(endDate);
		} else {
			value.setProtectExpDate(null);
		}
		valueArra[0] = value;
		service.saveCustContMedium(valueArra);
	}

	/**
	 * 
	 * @Function receiveFile
	 * @Description 下载txt文件到本地
	 * 
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-6-13 下午3:18:06
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       2014-6-13 mael v1.0.0 修改原因<br>
	 */
	private String receiveFile(String fileName) throws Exception {
		// SimpleDateFormat file_format = new SimpleDateFormat(DATE_FORMAT);
		// Date today_date = new Date();
		// String today_str = file_format.format(today_date);

		String localTmpFile = "";
		String remoteTmpFile = "";

		// 文件名 ftp和本地用的同样的文件名
		// String fileName = "d" + today_str + ".l210901";
		FtpUtil ftp = null;
		OutputStream os = null;
		try {
			ftp = new FtpUtil(FTP_CODE);
			remoteTmpFile = ftp.getBsFtpPath().getRemotePath() + "/" + fileName;
			if (null == ftp.getBsFtpPath().getLocalPath()) {
				localTmpFile = "/" + fileName;
			} else {
				localTmpFile = ftp.getBsFtpPath().getLocalPath() + "/" + fileName;
			}
			os = new BufferedOutputStream(new FileOutputStream(localTmpFile));
			ftp.download(fileName, os);
			os.flush();
			ftp.moveFileToRemoteHisDir(fileName);
			// 更新处理到哪一天的cpr文件
			ICmPsTaskSV sv = (ICmPsTaskSV) ServiceFactory.getService(ICmPsTaskSV.class);
			IBOCmPsTaskDealValue[] lastValue = sv.queryCprRecord(88888888L, 6);
			if (lastValue != null && lastValue.length > 0) {
				lastValue[0].setEntityId(getDateOfCprFile("20" + fileName.substring(1, 7)));
			} else {
				ExceptionUtil.throwBusinessException("CMS9999132");
			}
			sv.savePsTaskDeal(lastValue[0]);
		} catch (Exception e) {
			log.error("download TXT file fail.", e);
		} finally {
			if (null != ftp) {
				ftp.close();
			}
			if (os != null) {
				os.close();
			}
		}

		return localTmpFile;
	}

	/**
	 * 
	 * @Function getDateOfCprFile
	 * @Description 如果当前文件日期是周五，则需要跳过周六，周末，这两天cpr没有文件过来
	 * 所以需要更新时间为周末。（上面文件比对时候，是拿数据库查询到的时间加一天与文件时间比较，因此只能设置时间为周末）
	 *
	 * @param cprFileDate
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2017-1-20 上午10:26:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2017-1-20      shitian           v1.0.0               修改原因<br>
	 */
	public static long getDateOfCprFile(String cprFileDate) throws Exception {
		int dayOfWeek = CmTimeUtil.getDayForWeek(cprFileDate, "yyyyMMdd");
		if (dayOfWeek == 5) {
			// 如果是周五，则要将日期设置为周末
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			Date sunday = CmTimeUtil.addOrMinusDays(sdf.parse(cprFileDate).getTime(), 2);
			return Long.parseLong(sdf.format(sunday));
		}
		return Long.parseLong(cprFileDate);
	}

	/**
	 * 
	 * @Function readLocalFile
	 * @Description 解析本地txt文件
	 * 
	 * @param fileCode
	 * @param filepath
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-6-13 下午3:17:03
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       2014-6-13 mael v1.0.0 修改原因<br>
	 */
	private String[] readLocalFile(String fileCode, String filepath) throws Exception {
		// FileReader fr = new FileReader(filepath);
		BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream(filepath), fileCode));

		// 将无法识别的字节赋值为'?'
		int c = 63;
		String errmessage = "The file encoding is not ISO8859-15,can not be resolved.";
		// try {
		// // 从文件中读取一个字符
		// c = fr.read();
		// } catch (Exception e) {
		// try {
		// fr.skip(1);
		// } catch (Exception ex) {
		// throw new Exception(errmessage, ex);
		// }
		// c = 63;
		// }

		StringBuffer sb = new StringBuffer();
		List<String> list = new ArrayList<String>();
		while (c != -1) {
			// 遇到回车符时保存该行内容，刷新缓存
			if (c == 10) {
				list.add(sb.toString());
				sb = new StringBuffer();
				try {
					// 从文件中继续读取数据
					c = fr.read();
				} catch (Exception e) {
					try {
						fr.skip(1);
					} catch (Exception ex) {
						throw new Exception(errmessage, ex);
					}
					c = 63;
				}
				continue;
			}
			sb.append((char) c);
			try {
				// 从文件中继续读取数据
				c = fr.read();
			} catch (Exception e) {
				try {
					fr.skip(1);
				} catch (Exception ex) {
					throw new Exception(errmessage, ex);
				}
				c = 63;
			}
		}
		// 保存最后一行内容
		if (c == -1 && sb.length() > 0) {
			list.add(sb.toString());
		}
		fr.close();
		// 返回从文本文件中读取的内容
		Object[] objContent = list.toArray();
		String[] txtContent = new String[objContent.length];
		for (int i = 0; i < objContent.length; i++) {
			txtContent[i] = new String((String) objContent[i]);
		}
		File file = new File(filepath);

		// 删除本地临时文件
		if (file.exists()) {
			file.delete();
		}
		return txtContent;
	}

	/**
	 * 
	 * @Function  发送短信通知客户
	 * @Description 发送短信通知客户
	 * 
	 * @param custId
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author huangqun
	 * @throws Exception 
	 * @date 2014-12-05 下午3:17:03
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       2014-12-05 huangqun v1.0.0 修改原因<br>
	 */
	private void sendMsgToCust(long custId) throws Exception {
		ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		List<IBOCmInsCmrelValue> valueList = custSV.queryAllCmInsCmrel(custId);
		if (!valueList.isEmpty()) {
			// 随机找一个号码发送短信
			long userId = valueList.get(0).getUserId();
			// 根据userId找到billId
			if (userId > 0) {
				CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID, String.valueOf(userId));
				IInsUserValue value = InsServiceFactory.getInstanceQueryService().getInstUserByUserId(userId);
				if (null != value) {
					String billId = value.getBillId();
					if (StringUtils.isNotBlank(billId)) {
						// 发送短信给客户
						long managerId = ServiceManager.getUser().getID();
						CmCommonUtil.sendMsm("CM_INDIVIDUAL_CUST_REGIST_CPR_SUCCESS", null, billId, custId, managerId);
					}
				}
			}
		}
	}

	/**
	 * 
	 * @Function getFile
	 * @Description 得到文件名
	 * 
	 * @return
	 * @throws Exception
	 */
	private String[] getFileNames() throws Exception {
		FtpUtil ftp = null;
		String[] fileNames = {};
		try {
			ftp = new FtpUtil(FTP_CODE);
			fileNames = ftp.listNames();
			if (fileNames != null) {
				Arrays.sort(fileNames);
			}
		} catch (Exception e) {
			log.error("download TXT file fail.", e);
		} finally {
			if (null != ftp) {
				ftp.close();
			}

		}
		return fileNames;
	}

	// 处理合并tt
	private void dealCprtoTT(Map cprMap) throws Exception {
		if (!cprMap.isEmpty()) {
			ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICmCommonInnerSV commonInnerSV = (ICmCommonInnerSV) ServiceFactory.getService(ICmCommonInnerSV.class);
			IBOCmCprToTTValue[] cmCprtoTTValue = null;
			BOCmCprToTTBean[] beans = null;
			String errCode = "";
			String errMsg = "";
			Iterator it = cprMap.entrySet().iterator();
			while (it.hasNext()) {
				Entry entry = (Entry) it.next();
				long cprId = Long.parseLong(entry.getKey().toString());
				if(cprId>0){
					errCode = (String) entry.getValue();
					cmCprtoTTValue = customerSV.qryCprToTtTask(cprId);
					if (CmCommonUtil.isNotEmptyObject(cmCprtoTTValue)) {
						beans = new BOCmCprToTTBean[cmCprtoTTValue.length];
						for (int i = 0; i < cmCprtoTTValue.length; i++) {
							errMsg = errMsg + cmCprtoTTValue[i].getErrorMsg() + ";";
							beans[i] = new BOCmCprToTTBean();
							beans[i].copy(cmCprtoTTValue[i]);
							beans[i].delete();
						}
						// 删除工单表
						commonInnerSV.saveBeans(beans);
						// 调用TT接口
						try {
							saveTTInfo(cprId, errCode, errMsg);
						} catch (Exception e) {
							log.error("saveTTInfo error.", e);
							// 异常信息保存
							saveErrorLog(String.valueOf(cprId), "CPR saveTTInfo error.", e.getMessage());
							throw e;
						}
						errMsg = "";
					}
				}
			}
		}
	}

}
