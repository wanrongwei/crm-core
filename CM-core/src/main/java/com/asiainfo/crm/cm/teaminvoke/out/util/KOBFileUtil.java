package com.asiainfo.crm.cm.teaminvoke.out.util;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.comframe.client.ComframeClient;
import com.ai.comframe.vm.common.Constant;
import com.ai.common.cache.BsFtpPathCacheImpl;
import com.ai.common.ivalues.IBOBsDistrictValue;
import com.ai.common.ivalues.IBOBsFtpPathValue;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.*;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.asiainfo.appframe.ext.exeframe.task.interfaces.ITask;
import com.asiainfo.appframe.ext.exeframe.task.query.ivalues.IBOCfgTaskParamValueValue;
import com.asiainfo.appframe.ext.exeframe.task.query.service.interfaces.ITaskSV;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.CmxServiceFactory;
import com.asiainfo.crm.cm.common.bo.*;
import com.asiainfo.crm.cm.common.cache.CmSegmentManagerCacheImpl;
import com.asiainfo.crm.cm.common.ivalues.IBOCmMultThreadDealValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue;
import com.asiainfo.crm.cm.common.service.interfaces.IAddressSV;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.CmDistrictUtil;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupRelIndustryBean;
import com.asiainfo.crm.cm.customer.group.bo.BoCmGroupAccountingBean;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupRelIndustryValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBoCmGroupAccountingValue;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmCalGroupSegmentSV;
import com.asiainfo.crm.cm.customer.group.service.interfaces.IKOBFileImportSV;
import com.asiainfo.crm.cm.dk.bo.BOCmGroupApprovalBean;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmGroupApprovalValue;
import com.asiainfo.crm.cm.inner.customer.bo.*;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmCustContMediumAndTypeValue;
import com.asiainfo.crm.cm.inner.customer.service.interfaces.ICmCustSegmentRelaSV;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.ln.customer.group.bo.BOLnCmxGroupCustBean;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmxGroupCustValue;
import com.asiainfo.crm.cm.ln.customer.group.service.interfaces.ICmLnGroupSV;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.CustOrganizeBean;
import com.asiainfo.crm.cm.model.bo.CustomerBean;
import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartyRoleSV;
import com.asiainfo.crm.common.ResUserInfo;
import com.asiainfo.crm.common.ivalues.IBOBsCommonDistrictValue;
import com.asiainfo.crm.common.notes.tl.util.StringUtil;
import com.asiainfo.crm.common.util.BsCommonDistrictUtil;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV;
import com.asiainfo.crm.so.util.RBossUtil;
import com.asiainfo.isub.base.common.DataTypeUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.net.ftp.FTPFile;

import java.io.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class KOBFileUtil{
	private static final transient Log log = LogFactory.getLog(KOBFileUtil.class);

	public static DataContainer dealFileOne( String tempString) throws Exception {
		DataContainer data = new DataContainer();
		data.set("KOB_NUMBER", StringUtils.trimToEmpty(tempString.substring(0, 10)));
		// Name 70
		data.set("NAME", StringUtils.trimToEmpty(tempString.substring(10, 80)));
		// Addresse 1 35
		data.set("ADDRESSE_1", StringUtils.trimToEmpty(tempString.substring(80, 115)));
		// Addresse 2 (C/O name) 35
		data.set("ADDRESSE_2", StringUtils.trimToEmpty(tempString.substring(115, 150)));
		// Zip code 4
		data.set("ZIP_CODE", StringUtils.trimToEmpty(tempString.substring(150, 154)));
		// City 35
		// data.set("CITY", StringUtils.trimToEmpty("012005"));
		// Ctiy Name tempString.substring(154, 188)
		data.set("CITY_NAME", StringUtils.trimToEmpty(tempString.substring(154, 188)));
		// Phonenumber 25
		data.set("PHONE_NUMBER", StringUtils.trimToEmpty(tempString.substring(188, 214)));
		// SE-number 8
		data.set("SE_NUMBER", StringUtils.trimToEmpty(tempString.substring(214, 222)));
		// Legal form 3
		data.set("LEGAL_FORM", StringUtils.trimToEmpty(tempString.substring(222, 225)));
		// Registration numberber 6
		data.set("REGISTRATION_NUMBERBER", StringUtils.trimToEmpty(tempString.substring(225, 231)));
		// Status 3
		data.set("STATUS", StringUtils.trimToEmpty(tempString.substring(231, 234)));
		// Registration Date 8
		data.set("REGISTRATION_DATE", StringUtils.trimToEmpty(tempString.substring(234, 242)));
		// Employee (code) 3
		data.set("EMPLOYEE_CODE", StringUtils.trimToEmpty(tempString.substring(242, 245)));
		// Employee (numberber) 7
		data.set("EMPLOYEE_NUMBER", StringUtils.trimToEmpty(tempString.substring(245, 252)));
		// Established (year) 4
		data.set("ESTABLISHED_YEAR", StringUtils.trimToEmpty(tempString.substring(252, 256)));
		// Share Capital 15
		String shareCapital = tempString.substring(256, 271);
		if (StringUtils.isNotBlank(shareCapital)) {
			if (shareCapital.contains(",")) {
				data.set("SHARE_CAPITAL", shareCapital.trim().replaceAll(",", ""));
			} else {
				data.set("SHARE_CAPITAL", shareCapital.trim());
			}
		}
		// Industrial Classification 8*9
		data.set("INDUSTRIAL_CLASSIFICATION", StringUtils.trimToEmpty(tempString.substring(271, 343)));
		// Industry Overview 50*9
		data.set("INDUSTRY_OVERVIEW", StringUtils.trimToEmpty(tempString.substring(343, 793)));
		// Advertising Privacy 3
		data.set("ADVERTISING_PRIVACY", StringUtils.trimToEmpty(tempString.substring(793, 796)));
		// Workplace Code 4
		data.set("WORKPLACE_CODE", StringUtils.trimToEmpty(tempString.substring(796, 800)));
		// Workplace Numberber 10 TODO 该字段的位数与word文档中有差异
		data.set("WORKPLACE_NUMBERBER", StringUtils.trimToEmpty(tempString.substring(800, 810)));
		// Road code 4
		data.set("ROAD_CODE", StringUtils.trimToEmpty(tempString.substring(810, 814)));
		// Municipality Code 3
		data.set("MUNICIPALITY_CODE", StringUtils.trimToEmpty(tempString.substring(814, 817)));
		// Municipality code text 50
		data.set("MUNICIPALITY_CODE_TEXT", StringUtils.trimToEmpty(tempString.substring(817, 867)));
		// Region Code 3
		data.set("REGION_CODE", StringUtils.trimToEmpty(tempString.substring(867, 870)));
		// Region Code text 50
		data.set("REGION_CODE_TEXT", StringUtils.trimToEmpty(tempString.substring(870, 920)));
		// Jurisdiction Code 3
		data.set("JURISDICTION_CODE", StringUtils.trimToEmpty(tempString.substring(920, 923)));
		// Jurisdiction Code text 50
		data.set("JURISDICTION_CODE_TEXT", StringUtils.trimToEmpty(tempString.substring(923, 973)));
		// TODO Fax numberber 25 传真号码不对
		data.set("FAX_NUMBERBER", StringUtils.trimToEmpty(tempString.substring(973, 998)));
		// Listed on Stock Exchange 3---会计信息
		data.set("LISTED_ON_STOCK_EXCHANGE", StringUtils.trimToEmpty(tempString.substring(998, 1001)));
		// Kap-History - Date 8*9
		data.set("KAP_HISTORY_DATE", StringUtils.trimToEmpty(tempString.substring(1001, 1073)));
		// Kap-Historik- Currency 3*9
		data.set("KAP_HISTORIK_CURRENCY", StringUtils.trimToEmpty(tempString.substring(1073, 1100)));
		// Kap-History - Amount 15
		data.set("KAP_HISTORY_AMOUNT", StringUtils.trimToEmpty(tempString.substring(1100, 1235)));
		// Kap-History–inh. code 3*9
		data.set("KAP_HISTORY_INH_CODE", StringUtils.trimToEmpty(tempString.substring(1235, 1262)));
		// Kap- History – Change Amounts 15*9
		data.set("KAP_HISTORY_CHANGE_AMOUNTS", StringUtils.trimToEmpty(tempString.substring(1262, 1397)));
		// Kap- History - Market Value 15*9
		data.set("KAP_HISTORY_MARKET_VALUE", StringUtils.trimToEmpty(tempString.substring(1397, 1532)));
		// Export Country Code (area) 3*9
		data.set("EXPORT_COUNTRY_CODE_AREA", StringUtils.trimToEmpty(tempString.substring(1532, 1559)));
		// Export Country Code text 50*9
		data.set("EXPORT_COUNTRY_CODE_TEXT", StringUtils.trimToEmpty(tempString.substring(1559, 2009)));
		// Export turnover ratio 3
		data.set("EXPORT_TURNOVER_RATIO", StringUtils.trimToEmpty(tempString.substring(2009, 2012)));
		// CVR-numberber 8
		data.set("CVR_NUMBER", StringUtils.trimToEmpty(tempString.substring(2012, 2020)));
		// P-numberber 10
		data.set("P_NUMBERBER", StringUtils.trimToEmpty(tempString.substring(2020, 2030)));
		// House numberber 3
		data.set("HOUSE_NUMBER", StringUtils.trimToEmpty(tempString.substring(2030, 2033)));
		// House Letter 1
		data.set("HOUSE_LETTER", StringUtils.trimToEmpty(tempString.substring(2033, 2034)));
		// Apartment / floor 35
		data.set("APARTMENT_FLOOR", StringUtils.trimToEmpty(tempString.substring(2034, 2069)));
		// Unknown address 1
		data.set("UNKNOWN_ADDRESS", StringUtils.trimToEmpty(tempString.substring(2069, 2070)));
		// Street name 35
		data.set("STREET_NAME", StringUtils.trimToEmpty(tempString.substring(2070, 2105)));
		// kob变更审批用
		data.set("KOB_REMARKS", tempString);
		//CR346
		if(RBossUtil.kobBusinessCtrl("SO_CR346_CONTROL")) {
			data.set("FLOOR",StringUtils.trimToEmpty(tempString.substring(2105, 2111)));
			data.set("APARTMENT",StringUtils.trimToEmpty(tempString.substring(2111, 2115)));
			data.set("DOOR_NUMBER",StringUtils.trimToEmpty(tempString.substring(2115, 2119)));
		}
		return data;
	}
	public static void saveCustomerData(String tenantId, ICustomerValue customerData, IBOLnCmxGroupCustValue cmxData, DataContainer dataForFile) throws Exception {
		ICmGroupCustomerSV groupCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		IVOCustValue custValue = new VOCustBean();
		// city_name
		String cityId = "";
		IBOBsDistrictValue countyVal = null;
		if (StringUtils.isNotBlank(dataForFile.getAsString("CITY_NAME"))) {
			countyVal = CmDistrictUtil.getDistrictByCityname(dataForFile.getAsString("CITY_NAME"));
			if (CmCommonUtil.isNotEmptyObject(countyVal)) {
				IBOBsCommonDistrictValue cityValue = BsCommonDistrictUtil.getCommonDistrictById(countyVal.getDistrictId());
				if (CmCommonUtil.isNotEmptyObject(cityValue)) {
					cityId = cityValue.getDistrictCode();
				}
			}
		}
		long initCustId = 0L;
		// 从KOB新增集团客户
		if (customerData != null) {
			// 公司停业或已破产状态相互变化需要更新客户基本信息
			boolean inaOphTransforFlag = false;
			// 激活到破产
			boolean isFromActiveToBankrupt = false;
			long oldCompanyStatus = cmxData.getCompanyStatus();
			// Status 公司状态
			if (StringUtils.isNotBlank(dataForFile.getAsString("STATUS"))) {
				if (CmConstants.companyStatus.AKT.equals(dataForFile.getAsString("STATUS"))) {
					// 正常
					cmxData.setCompanyStatus(1);
//					// 破产恢复场景捞取当日sono03全量文件中对应的层级数据处理,只限送全量文件当天
//					if (CmCommonUtil.isNotEmptyObject(fileName) && Arrays.asList(fileName).contains(CmCommonUtil.getCurMonthSono03FileName())) {
//						kobNumberSet.add(customerData.getCustCertCode());
//					}
				} else if (CmConstants.companyStatus.INA.equals(dataForFile.getAsString("STATUS")) || CmConstants.companyStatus.OPH.equals(dataForFile.getAsString("STATUS"))) {
					// 停业或已破产
					if (CmConstants.companyStatus.INA.equals(dataForFile.getAsString("STATUS"))) {
						cmxData.setCompanyStatus(2);
						if (oldCompanyStatus == 3) {
							inaOphTransforFlag = true;
						}
					} else if (CmConstants.companyStatus.OPH.equals(dataForFile.getAsString("STATUS"))) {
						// 注销
						cmxData.setCompanyStatus(3);
						if (oldCompanyStatus == 2) {
							inaOphTransforFlag = true;
						}
					}
					if (oldCompanyStatus == 1) {
						isFromActiveToBankrupt = true;
					}
				}
			} else {
				// Status 公司状态如果为空，默认设置为1
				if (CmCommonUtil.isEmptyObj(cmxData.getCompanyStatus()) || 0 == cmxData.getCompanyStatus()) {
					cmxData.setCompanyStatus(1);
				}
			}
			// 公司停业或销户状态没变直接返回
			if(cmxData.getCompanyStatus() != 1 && oldCompanyStatus == cmxData.getCompanyStatus()) {
				return;
			}
			// 将老的公司状态存入扩展字段EXT10
			cmxData.setExt10(String.valueOf(oldCompanyStatus));
			customerData.setCustType(CmConstants.CustomerType.GROUP);
			// 公司状态正常或者停业破产状态相互变化更新资料
			if (1 == cmxData.getCompanyStatus() || inaOphTransforFlag) {
				// 集团基本信息
				// Name
				customerData.setCustName(dataForFile.getAsString("NAME"));
				// Zip code
				customerData.setCustZipcode(dataForFile.getAsString("ZIP_CODE"));
				// 外国集团类型---kob导入后清空该字段值
				customerData.setDevelopTypeNull();
				// City_Name
				if (countyVal != null) {
					// 取得county信息
					IBOBsCommonDistrictValue countyValue = BsCommonDistrictUtil.getCommonDistrictByCode(cityId, 4);
					// 根据county信息取得city信息
					IBOBsCommonDistrictValue cityValue = BsCommonDistrictUtil.getCommonDistrictById(countyValue.getParentDistrictId());
					customerData.setCityId(cityValue.getDistrictCode());
					// 省份
					IBOBsCommonDistrictValue province = BsCommonDistrictUtil.getCommonDistrictById(cityValue.getParentDistrictId());
					customerData.setProvinceId(province.getDistrictCode());// 省份
					IBOBsCommonDistrictValue districtValues = BsCommonDistrictUtil.getCommonDistrictById(province.getParentDistrictId());// 国家
					if (CmCommonUtil.isNotEmptyObject(districtValues)) {
						customerData.setNationality(districtValues.getDistrictCode());// 国家
					} else {
						customerData.setNationality("00400");// 国家
					}
				}
				customerData.setCountyId(cityId);// 城市
				// Employee(code)
				customerData.setStaffAmountType(dataForFile.getAsString("EMPLOYEE_CODE"));
				// Employee (numberber)
				customerData.setStaffAmount(StringUtil.isNotEmpty(dataForFile.getAsString("EMPLOYEE_NUMBER"))?dataForFile.getAsLong("EMPLOYEE_NUMBER"):0);
				// Established (year)
				if (StringUtils.isNotBlank(dataForFile.getAsString("ESTABLISHED_YEAR"))) {
					customerData.setEstablished(dataForFile.getAsInt("ESTABLISHED_YEAR"));
				}
				// Share Capital
				customerData.setRegAmount(dataForFile.getAsLong("SHARE_CAPITAL"));
				// 联系媒介
				List<BOCmCustContactMediumBean> mediumValues = new ArrayList<BOCmCustContactMediumBean>();
				// TODO Fax numberber 传真号码不对 32:传真
				// saveMedium(dataForFile.getAsString("FAX_NUMBERBER"), customerData.getCustId(), 32, mediumValues);
				// 设置集团基本信息
				custValue.setCustomer(customerData);
				// Addresse 1 Legal Address 法律地址
				IQBOCmCustContMediumAndTypeValue legalAddressValue = null;
				IQBOCmCustContMediumAndTypeValue[] legalAddressValues = CmServiceFactory.getCustomerSV().queryCustContactMediumsForPage(customerData.getCustId(), 11, 1, -1, -1);
				if (legalAddressValues != null && legalAddressValues.length > 0) {
					legalAddressValue = legalAddressValues[0];
				} else {
					legalAddressValue = new QBOCmCustContMediumAndTypeBean();
					legalAddressValue.setCustId(customerData.getCustId());
				}
				saveAddress(dataForFile, legalAddressValue, customerData.getCustZipcode());
				// Phonenumber 作为联系媒介保存 31 固话
				saveMedium(dataForFile.getAsString("PHONE_NUMBER"), customerData.getCustId(), 31, mediumValues);
				// 集团扩展信息
				cmxData.setExt18("");// 清空页面创建后转kob的集团客户信息
				custValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_MODIFY);// 修改集团扩展信息

				// ADVERTISING_PRIVACY 营销免打扰，信件免打扰
				if (StringUtils.isNotBlank(dataForFile.getAsString("ADVERTISING_PRIVACY"))) {
					// 信件免打扰
					if ("IMD".equals(dataForFile.getAsString("ADVERTISING_PRIVACY"))) {
						// 信件免打扰与营销免打扰互斥--去除营销免打扰  （罗松与客户已确认，前面的注释中的信件与营销不互斥）
						// 1：不免打扰，0：免打扰
						cmxData.setDirectMarketingProtection(0);
						cmxData.setProtectEffDate(new Timestamp(System.currentTimeMillis()));
						cmxData.setProtectExpireDate(TimeUtil.getMaxExpire());
						// 保存信件免打扰
						saveMedium(dataForFile.getAsString("ADVERTISING_PRIVACY"), customerData.getCustId(), 36, mediumValues);
					} else if ("IM1".equals(dataForFile.getAsString("ADVERTISING_PRIVACY"))) {// 营销免打扰标记
						// 信件免打扰与营销免打扰互斥--去除信件免打扰
						IQBOCmCustContMediumAndTypeValue[] contactMediumValues = CmServiceFactory.getCustomerSV()
								.queryCustContactMediumsForPage(cmxData.getCustId(), 36, 3, -1, -1);
						if (contactMediumValues != null && contactMediumValues.length > 0) {
							BOCmCustContactMediumBean mediumBean = new BOCmCustContactMediumBean();
							mediumBean.copy(contactMediumValues[0]);
							mediumBean.setIsNoDisturbing(1);// 0:不可打扰 1：可打扰
							mediumValues.add(mediumBean);
						}
						// 1：不免打扰，0：免打扰
						cmxData.setDirectMarketingProtection(0);
						cmxData.setProtectEffDate(new Timestamp(System.currentTimeMillis()));
						cmxData.setProtectExpireDate(TimeUtil.getMaxExpire());
					}
				}
				// CVR-numberber
				cmxData.setTaxId(dataForFile.getAsString("CVR_NUMBER"));
				// P-numberber
				cmxData.setExt12(dataForFile.getAsString("P_NUMBERBER"));
				// SE-number
				cmxData.setSeNumber(dataForFile.getAsLong("SE_NUMBER"));
				// Legal form
				cmxData.setLegalForm(dataForFile.getAsString("LEGAL_FORM"));
				// Registration numberber
				cmxData.setRegistrationNumber(dataForFile.getAsLong("REGISTRATION_NUMBERBER"));
				// Registration Date
				if (StringUtils.isNotBlank(dataForFile.getAsString("REGISTRATION_DATE")) && DataType.getAsLong(dataForFile.getAsString("REGISTRATION_DATE")) > 0) {
					Timestamp dateTime = CmCommonUtil.StringToDate(dataForFile.getAsString("REGISTRATION_DATE"), "yyyyMMdd");
					if (dateTime != null) {
						cmxData.setRegistrationDate(dateTime);
					}
				}

				// Workplace Code 工作场所编码
				cmxData.setWorkplaceCode(dataForFile.getAsLong("WORKPLACE_CODE"));
				// Workplace Numberber 工作场所号码
				cmxData.setWorkplaceNumber(dataForFile.getAsLong("WORKPLACE_NUMBERBER"));
				// add EXT2 -------会计信息 LISTED_ON_STOCK_EXCHANGE
				cmxData.setExt2(dataForFile.getAsString("LISTED_ON_STOCK_EXCHANGE"));
				// add EXT4 --- Unknown address
				cmxData.setExt4(dataForFile.getAsString("UNKNOWN_ADDRESS"));
				custValue.setUserObject("cmxGrpCust", cmxData);// 设置集团扩展信息
				// 保存
				ICustomerValue customerValue = custValue.getCustomer();
				if (customerValue != null) {
					customerValue.setRegionId(CmCommonUtil.getDefaultRegionId());
				}
				// 保存集团客户资料
				CmServiceFactory.getCustomerSV().saveCustomer(custValue);
				// 行业信息处理
				String industryIds = dataForFile.getAsString("INDUSTRIAL_CLASSIFICATION");
				if (StringUtils.isNotBlank(industryIds)) {
					IKOBFileImportSV service = (IKOBFileImportSV) ServiceFactory.getService(IKOBFileImportSV.class);
					// 查询该集团的所有行业信息
					DataContainer[] industrys = service.queryIndustrys(tenantId, customerData.getCustId());
					List<IBOCmGroupRelIndustryValue> oldList = new ArrayList<>();
					// 删除原有的所有行业后再添加kob文件中的行业
					if (CmCommonUtil.isNotEmptyObject(industrys)) {
						for (int j = 0; j < industrys.length; j++) {
							BOCmGroupRelIndustryBean industryBean = new BOCmGroupRelIndustryBean();
							industryBean.copy(industrys[j]);
							industryBean.setStsToOld();
							industryBean.delete();
							oldList.add(industryBean);
						}
						groupCustomerSV.saveGroupRelIndustry(oldList.toArray(new IBOCmGroupRelIndustryValue[0]));
					}
					List<IBOCmGroupRelIndustryValue> list = new ArrayList<>();
					for (int i = 0; i < 9; i++) {
						String industryId = industryIds.substring(i * 8, i * 8 + 8);
						if (DataType.getAsLong(industryId) > 0) {
							IBOCmGroupRelIndustryValue industryValue = new BOCmGroupRelIndustryBean();
							industryValue.setIndustryId(industryId);
							industryValue.setCustId(customerData.getCustId());
							industryValue.setRelId(CmCommonUtil.getNewSequence(BOCmGroupRelIndustryBean.class));
							industryValue.setSort(i + 1);
							industryValue.setCreateDate(DataTypeUtils.getCurrentDate());
							industryValue.setDoneCode(ResUserInfo.getDoneCode());
							industryValue.setDoneDate(DataTypeUtils.getCurrentDate());
							industryValue.setOpId(ResUserInfo.getOpId());
							industryValue.setOrgId(ResUserInfo.getOrgId());
							industryValue.setEffectiveDate(DataTypeUtils.getCurrentDate());
							industryValue.setExpireDate(TimeUtil.getMaxExpire());
							industryValue.setRegionId(ResUserInfo.getRegionId());
							industryValue.setCreateOpId(ResUserInfo.getOpId());
							industryValue.setCreateOrgId(ResUserInfo.getOrgId());
							industryValue.setStsToNew();
							industryValue.setState(CmConstants.RecordState.USE);
							list.add(industryValue);
						}
					}
					groupCustomerSV.saveGroupRelIndustry(list.toArray(new IBOCmGroupRelIndustryValue[0]));
				}
				// 联系媒介保存
				if (!mediumValues.isEmpty()) {
					CmServiceFactory.getCustomerSV().saveCustContMedium(mediumValues.toArray(new BOCmCustContactMediumBean[0]));
				}
				// 触发TT
				if (inaOphTransforFlag) {
					judgeIfSendTT(customerData, cmxData);
				}
			} else {
				// 破产处理
				if (2 == cmxData.getCompanyStatus() || 3 == cmxData.getCompanyStatus()) {
					// 更新公司状态
					updateCompanyStatus(customerData, cmxData);
					judgeIfSendTT(customerData, cmxData);
					// BMRT-4683 Hierarchy when AKT -> OPH/INA拆分层级特殊处理
					if (isFromActiveToBankrupt && CmCommonUtil.activeToBankruptControl()) {
						log.info("dealActiveToBankruptHierarchy begin custId:" + customerData.getCustId());
						dealActiveToBankruptHierarchy(customerData);
					}
				}
			}
		}
	}
	private static void dealActiveToBankruptHierarchy(ICustomerValue customerData) throws Exception {
		// 层级数据特征,针对根节点:PARENT_DEPT_ID=CUST_ID=REL_CUST_ID,针对子节点:CUST_ID=ROOT_CUST_ID,PARENT_DEPT_ID=ROOT_DEPT_ID
		// 判断集团是否加入层级
		// 只有一条数据表示没有层级不处理
		ICmCalGroupSegmentSV sv = (ICmCalGroupSegmentSV) ServiceFactory.getService(ICmCalGroupSegmentSV.class);
		long custId = customerData.getCustId();
		long orgCount = sv.queryGroupDifferDataByCustId(custId);
		if (orgCount == 0) {
			// 没查到数据是子节点，子节点的拆分有两种场景
			// 根据relCustId查询待去除层级的组织信息
			ICustOrganizeValue subCustOrganizeValue = CmServiceFactory.getCustomerSV().queryCustOrganizeByRelCustId(custId);
			if (subCustOrganizeValue != null) {
				long subDeptId = subCustOrganizeValue.getDeptId();
				long oldRootCustId = subCustOrganizeValue.getCustId();
				// 查看该组织下关联的同级子节点
				ICustOrganizeValue[] subCustOrganizeValues = CmServiceFactory.getCustomerSV().queryCustOrganizesByParentId(subDeptId, -1, -1);
				if (subCustOrganizeValues.length == 0) {
					// 1.该子节点没有关联的下级节点，直接从层级移除
					BOCmGroupOrgStructBean subOrgStructValue = new BOCmGroupOrgStructBean();
					subOrgStructValue.copy(subCustOrganizeValue);
					subOrgStructValue.setParentDeptId(custId);
					subOrgStructValue.setCustId(custId);
					subOrgStructValue.setIsContactPoint(0);
					subOrgStructValue.setHasLeaf(0);
					subOrgStructValue.setIsRevisable(1);
					sv.syncHierarchyInfoToBilling(subOrgStructValue, false);
					CmInnerServiceFactory.getCommonInnerSV().saveBean(subOrgStructValue);
				} else {
					// 2.该子节点有关联的下级节点
					List<BOCmGroupOrgStructBean> orgStructList = new LinkedList<>();
					// 子节点移除层级
					BOCmGroupOrgStructBean subOrgStructValue = new BOCmGroupOrgStructBean();
					subOrgStructValue.copy(subCustOrganizeValue);
					long oldParentDeptId = subOrgStructValue.getParentDeptId();
					subOrgStructValue.setParentDeptId(custId);
					subOrgStructValue.setCustId(custId);
					subOrgStructValue.setIsContactPoint(0);
					subOrgStructValue.setHasLeaf(0);
					subOrgStructValue.setIsRevisable(1);
					orgStructList.add(subOrgStructValue);

					// 所有子节点升级，指向被移除子节点对应的父节点
					for (ICustOrganizeValue organizeValue : subCustOrganizeValues) {
						BOCmGroupOrgStructBean newSubUpgradeOrgStructValue = new BOCmGroupOrgStructBean();
						newSubUpgradeOrgStructValue.copy(organizeValue);
						// 使用被移除的子节点对应的ParentDeptId
						newSubUpgradeOrgStructValue.setParentDeptId(oldParentDeptId);
						orgStructList.add(newSubUpgradeOrgStructValue);
					}
					for (BOCmGroupOrgStructBean orgStructBean : orgStructList) {
						boolean needAddFlag = true;
						if (subOrgStructValue.getDeptId() == orgStructBean.getDeptId()) {
							// 子节点移除层级不需要再新增节点信息
							needAddFlag = false;
						}
						sv.syncHierarchyInfoToBilling(orgStructBean, needAddFlag);
					}
					CmInnerServiceFactory.getCommonInnerSV().saveBeans(orgStructList.toArray(new BOCmGroupOrgStructBean[0]));
				}
				// 记录层级CI变更记录
				CmCommonUtil.recordHierarchyChangeCi(custId, 0, oldRootCustId, CmConstants.kobCiAttrValue.TYPE_REMOVE,
						CmConstants.kobCiAttrValue.REASON_CLOSED);
			}
		} else if (orgCount > 1) {
			// 查到多条数据是根节点
			// 根据relCustId查询待去除层级的根节点信息
			ICustOrganizeValue rootCustOrganizeValue = CmServiceFactory.getCustomerSV().queryCustOrganizeByRelCustId(custId);
			if (rootCustOrganizeValue != null) {
				long oldRootDeptId = rootCustOrganizeValue.getDeptId();
				long oldRootCustId = rootCustOrganizeValue.getCustId();
				// 查看原有根节点关联的下级子节点信息
				ICustOrganizeValue[] subCustOrganizeValues = CmServiceFactory.getCustomerSV().queryCustOrganizesByParentId(oldRootDeptId, -1, -1);
				if (CmCommonUtil.isNotEmptyObject(subCustOrganizeValues)) {
					List<BOCmGroupOrgStructBean> orgStructList = new LinkedList<>();
					// 原有根节点层级移除
					BOCmGroupOrgStructBean oldRootOrgStructValue = new BOCmGroupOrgStructBean();
					oldRootOrgStructValue.copy(rootCustOrganizeValue);
					oldRootOrgStructValue.setHasLeaf(0);
					oldRootOrgStructValue.setIsRevisable(1);
					orgStructList.add(oldRootOrgStructValue);

					List<Long> newRootDeptIdList = new ArrayList<>();
					// 下面的所有子节点全部升级为根节点，拆成多个层级
					for (ICustOrganizeValue organizeValue : subCustOrganizeValues) {
						BOCmGroupOrgStructBean newRootOrgStructValue = new BOCmGroupOrgStructBean();
						newRootOrgStructValue.copy(organizeValue);
						newRootOrgStructValue.setParentDeptId(newRootOrgStructValue.getRelCustId());
						newRootOrgStructValue.setCustId(newRootOrgStructValue.getRelCustId());
						newRootOrgStructValue.setIsContactPoint(0);
						newRootOrgStructValue.setIsRevisable(1);
						orgStructList.add(newRootOrgStructValue);
						newRootDeptIdList.add(newRootOrgStructValue.getDeptId());
						// 原有子节点升级为根节点后下面的所有子节点的根节点变更
						batchUpdateSubStructCustId(newRootOrgStructValue.getCustId(), newRootOrgStructValue.getDeptId(), orgStructList);
					}

					for (BOCmGroupOrgStructBean orgStructBean : orgStructList) {
						boolean needAddFlag = true;
						if (oldRootDeptId == orgStructBean.getDeptId()) {
							// 原有根节点拆分不需要同步billing
							continue;
						} else if (newRootDeptIdList.contains(orgStructBean.getDeptId())) {
							// 升级为根节点不需要再次新增根节点信息，billing已存在
							needAddFlag = false;
						}
						sv.syncHierarchyInfoToBilling(orgStructBean, needAddFlag);
					}
					CmInnerServiceFactory.getCommonInnerSV().saveBeans(orgStructList.toArray(new BOCmGroupOrgStructBean[0]));
					// 记录层级CI变更记录
					CmCommonUtil.recordHierarchyChangeCi(custId, 0, oldRootCustId, CmConstants.kobCiAttrValue.TYPE_REMOVE,
							CmConstants.kobCiAttrValue.REASON_CLOSED);
				}
			}
		}
	}

	/**
	 * 保存组织结构
	 * @param upCustId
	 * @param downCustId
	 * @param downCustName
	 * @throws Exception
	 */
	public static void saveCustOrg(long upCustId, long downCustId, String upCustServiceId, String downCustName) throws Exception {
		// 上级组织
		ICustOrganizeValue upCustOrganizeValue = CmServiceFactory.getCustomerSV().queryCustOrganizeByRelCustId(upCustId);
		// 下级组织
		ICustOrganizeValue downCustOrganizeValue = CmServiceFactory.getCustomerSV().queryCustOrganizeByRelCustId(downCustId);
		if (upCustOrganizeValue != null && downCustOrganizeValue != null) {
			// 下级组织的原根节点custId
			long oldParentCustId = downCustOrganizeValue.getCustId();
			if (downCustOrganizeValue.getParentDeptId() != upCustOrganizeValue.getDeptId()) {
				if (0 != downCustOrganizeValue.getIsRevisable()) {// 判断该集团的组织结构是否可覆盖, 1为可覆盖; 0为不可覆盖
					BOCmGroupOrgStructBean orgStructValue = new BOCmGroupOrgStructBean();
					List orgStructLists = new LinkedList();
					// 新增子节点时，需要修改父组织的HAS_LEAF属性为"是"
					upCustOrganizeValue.setHasLeaf(1);

					// 针对层级拆分的特殊处理
					if (downCustId > 0 && upCustId == downCustId) {
						downCustOrganizeValue.setParentDeptId(upCustOrganizeValue.getRelCustId());
						downCustOrganizeValue.setCustId(upCustOrganizeValue.getRelCustId());
					} else {
						downCustOrganizeValue.setParentDeptId(upCustOrganizeValue.getDeptId());
						downCustOrganizeValue.setCustId(upCustOrganizeValue.getCustId());
					}

					downCustOrganizeValue.setDeptType(CmConstants.CustomerOrg.SUB_COMPANY);// 子公司
					downCustOrganizeValue.setDeptName(downCustName);
					downCustOrganizeValue.setIsContactPoint(0);
					downCustOrganizeValue.setIsRevisable(1);// 1为可覆盖
					orgStructValue.copy(downCustOrganizeValue);
					orgStructLists.add(orgStructValue);
					BOCmGroupOrgStructBean upOrgStructValue = new BOCmGroupOrgStructBean();
					upOrgStructValue.copy(upCustOrganizeValue);
					orgStructLists.add(upOrgStructValue);
					BOCmGroupOrgStructBean[] orgStructValues = (BOCmGroupOrgStructBean[]) orgStructLists.toArray(new BOCmGroupOrgStructBean[0]);
					CmInnerServiceFactory.getCommonInnerSV().saveBeans(orgStructValues);

					// 判断新增子公司是否存在子级,将子公司的所有子节点cust_id全部修改为根节点的cust_id
					ICmCalGroupSegmentSV sv = (ICmCalGroupSegmentSV) ServiceFactory.getService(ICmCalGroupSegmentSV.class);
					sv.batchUpdateSubCustId(orgStructValue);

					// 同步组织层级给billing
					IVOCustValue value = new VOCustBean();
					ICustOrganizeValue orgValue = new CustOrganizeBean();
					orgValue.copy(orgStructValue);
					value.addCustOrganize(orgValue);
					CmServiceFactory.getTeamInvokeSV().sendCustInfo2Billing(value, null);
					// 录入组织结构差异表
					sv.saveDifferData(upCustOrganizeValue.getDeptId(), upCustId, downCustId, upCustServiceId, oldParentCustId);
				} else {
					ExceptionUtil.throwBusinessException("CMS0013029", "DownCustId:" + downCustId + " Can't Revisable!");
				}
			}
		}
	}

	private static void batchUpdateSubStructCustId(long custId, long deptId, List<BOCmGroupOrgStructBean> orgStructList) throws Exception {
		ICustOrganizeValue[] allSubCustOrganizeValues = CmServiceFactory.getCustomerSV().queryAllSubCustOrganizesByParentId(deptId, -1, -1);
		// 判断原有子节点是否存在子级,将子公司的所有子节点cust_id全部修改为根节点的cust_id
		if (CmCommonUtil.isNotEmptyObject(allSubCustOrganizeValues)) {
			boolean updateFlag = false;
			for (ICustOrganizeValue subCustOrganizeValue : allSubCustOrganizeValues) {
				if (subCustOrganizeValue.getParentDeptId() != subCustOrganizeValue.getCustId()) {
					if (1 == subCustOrganizeValue.getIsContactPoint()) {
						// 默认去除原有联系点
						subCustOrganizeValue.setIsContactPoint(0);
					}
					subCustOrganizeValue.setCustId(custId);
					updateFlag = true;
				}
			}
			if (updateFlag) {
				BOCmGroupOrgStructBean[] subOrgStructValues = new BOCmGroupOrgStructBean[allSubCustOrganizeValues.length];
				for (int j = 0; j < allSubCustOrganizeValues.length; j++) {
					subOrgStructValues[j] = new BOCmGroupOrgStructBean();
					subOrgStructValues[j].copy(allSubCustOrganizeValues[j]);
					orgStructList.add(subOrgStructValues[j]);
				}
			}
		}
	}

	private static void updateCompanyStatus(ICustomerValue customerData, IBOLnCmxGroupCustValue cmxData) throws Exception {
		IVOCustValue custValue = new VOCustBean();
		custValue.setCustomer(customerData);
		custValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_MODIFY);// 修改集团扩展信息
		custValue.setUserObject("cmxGrpCust", cmxData);// 设置集团扩展信息
		CmServiceFactory.getCustomerSV().saveCustomer(custValue);
	}

	private static void judgeIfSendTT(ICustomerValue customerData, IBOLnCmxGroupCustValue cmxData) {
		try {
			// 破产时只判断客户状态是否是active/suspended，是的话才触发TT，其他场景的TT触发都去除
			if (customerData.getCustStatus() == CmConstants.CustomerStatus.GROUP_ACTIVE
					|| customerData.getCustStatus() == CmConstants.CustomerStatus.GROUP_PAUSE) {
				log.info("createCompanyStatusChangeTT begin custId:" + customerData.getCustId());
				createCompanyStatusChangeTT(customerData, cmxData);
			}
		} catch (Exception e) {
			log.error("createCompanyStatusChangeTT error.", e);
		}
	}
	private static void createCompanyStatusChangeTT(ICustomerValue customerData, IBOLnCmxGroupCustValue cmxData) throws Exception {
		// 触发TT
		String errorCode = "";
		String errorMessage = "";
		String ticketType = "";
		if (2 == cmxData.getCompanyStatus()) {
			// INA -- 破产
			errorCode = "ACTIVE_KOB_BANKRUPT";
			errorMessage = "The B2B Customer has gone bankrupt, please terminate the B2B Customer.";
			ticketType = "075001017";// Bankrupt CVR
		} else if (3 == cmxData.getCompanyStatus()) {
			// OPH -- 注销
			errorCode = "ACTIVE_KOB_TERMINATED";
			errorMessage = "The B2B Customer has gone terminated, please terminate the B2B Customer.";
			ticketType = "075001016";// Terminated CVR
		}
		Map map = new HashMap();
		map.put("CUST_ID", String.valueOf(customerData.getCustId()));
		map.put("ERROR_CODE", errorCode);
		map.put("ERROR_MESSAGE", errorMessage);
		map.put("TICKET_TYPE", ticketType);
		map.put("SOURCE_SYSTEM", "KOB");
		CmCommonUtil.CreateTicketForCM(map);
	}

	private static void saveMedium(String phoneNumber, long custId, long typeCode, List mediums) throws Exception {
		BOCmCustContactMediumBean mediumBean = null;
		if (!StringUtils.isBlank(phoneNumber)) {
			mediumBean = new BOCmCustContactMediumBean();
			IQBOCmCustContMediumAndTypeValue[] contactMediumValues = CmServiceFactory.getCustomerSV().queryCustContactMediumsForPage(custId, typeCode, 3, -1, -1);
			if (contactMediumValues != null && contactMediumValues.length > 0) {
				// 信件免打扰
				if ("IMD".equals(phoneNumber)) {
					mediumBean.copy(contactMediumValues[0]);
					mediumBean.setIsNoDisturbing(0);// 0:不可打扰 1：可打扰
					mediums.add(mediumBean);
				} else if (!phoneNumber.equals(contactMediumValues[0].getContNumber())) {
					mediumBean.copy(contactMediumValues[0]);
					mediumBean.setContNumber(phoneNumber);
					mediums.add(mediumBean);
				}
			} else {
				if (!"IMD".equals(phoneNumber)) {
					mediumBean.setCustContRelaId(CmCommonUtil.getNewSequence(BOCmCustContactMediumBean.class));
					mediumBean.setCustId(custId);
					mediumBean.setContMedTypeId(typeCode);
					mediumBean.setContNumber(phoneNumber);
					mediumBean.setState("U");
					mediumBean.setRegionId(CmCommonUtil.getDefaultRegionId());
					mediums.add(mediumBean);
				}
			}
		}
	}

	private static void saveAddress(DataContainer dataForFile, IQBOCmCustContMediumAndTypeValue legalAddressValues, String zipCode) throws Exception {
		IAddressSV addrService = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
		// 现在值未定，可能需要进行转换
		String districtId = "012002002";
		address address = new address();
		address.setAddressType("KOB_ADDRESS");
		address.setDistrictId(districtId);
		address.setCity(dataForFile.getAsString("CITY_NAME"));
		address.setCounty("");
		address.setStreetName(dataForFile.getAsString("STREET_NAME"));
		//Cr346
		if(RBossUtil.kobBusinessCtrl("SO_CR346_CONTROL")) { //开关已开，执行新的逻辑
			address.setApartment(dataForFile.getAsString("APARTMENT"));
			address.setFloor(dataForFile.getAsString("FLOOR"));
			address.setDoorNumber(dataForFile.getAsString("DOOR_NUMBER"));
		}else { //开关未开，保持旧的
			address.setApartment(dataForFile.getAsString("APARTMENT_FLOOR"));
			address.setFloor("");
			address.setDoorNumber("");
		}

		address.setHouseNumber(dataForFile.getAsString("HOUSE_NUMBER"));
		address.setHouseLetter(dataForFile.getAsString("HOUSE_LETTER"));
		if (StringUtils.isNotBlank(address.getHouseNumber()) || StringUtils.isNotBlank(address.getHouseLetter())) {
			String houseNum = address.getHouseNumber() + address.getHouseLetter();
			if (Character.isLetter(houseNum.charAt(houseNum.length() - 1))) {
				address.setHouseNumber(String.valueOf(Integer.valueOf(houseNum.substring(0, houseNum.length() - 1).trim())));
				address.setHouseLetter(String.valueOf(houseNum.charAt(houseNum.length() - 1)));
			} else {
				address.setHouseNumber(String.valueOf(Integer.valueOf(houseNum.trim())));
				address.setHouseLetter("");
			}
		}
		address.setZipcode(zipCode);
		address.setMainDoor("");
		address.setMunicipality(dataForFile.getAsString("MUNICIPALITY_CODE"));

		// 地址层级中增加CO_NAME
		String coName = dataForFile.getAsString("ADDRESSE_2");
		if (StringUtils.isNotBlank(coName)) {
			address.setCoName(coName);
		} else {
			address.setCoName("");
		}
		//设置地址详情
		String addressDetail = CmCommonUtil.getStandAddressDesc(address);
		address.setAddrDesc(addressDetail);
		long addressId = addrService.saveAddress(address);

		// CVS-28地址详情统一使用SFF返回的地址信息拼接
		try {
			address realAddress = addrService.getAddress(addressId, CmConstants.Address.DISTRICTID);
			if (realAddress != null) {
				addressDetail = CmCommonUtil.getStandAddressDesc(realAddress);
			}
		} catch (Exception e) {
			log.error("KOBFileImportTask getAddress error.", e);
		}

		//保存客户法律地址
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IBOCmCustContactMediumValue contactMediumValue = new BOCmCustContactMediumBean();
		if (legalAddressValues.getAddressId() > 0) {
			if (addressId != legalAddressValues.getAddressId()) {
				legalAddressValues.setAddressId(addressId);
				contactMediumValue.copy(legalAddressValues);
				contactMediumValue.setAddressDetail(addressDetail);
				customerSV.saveCustContMedium(new IBOCmCustContactMediumValue[] { contactMediumValue });
			}
		} else {
			contactMediumValue.setAddressId(addressId);
			contactMediumValue.setContMedTypeId(11);
			contactMediumValue.setCustId(legalAddressValues.getCustId());
			contactMediumValue.setRegionId(CmCommonUtil.getDefaultRegionId());
			contactMediumValue.setAddressDetail(addressDetail);
			customerSV.saveCustContMedium(new IBOCmCustContactMediumValue[] { contactMediumValue });
		}
	}

}
