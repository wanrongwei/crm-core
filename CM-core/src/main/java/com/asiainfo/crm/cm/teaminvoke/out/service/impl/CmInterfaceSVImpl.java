package com.asiainfo.crm.cm.teaminvoke.out.service.impl;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.cache.CmCreditLevelCacheImpl;
import com.asiainfo.crm.cm.common.ivalues.IBOCmAttachValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCreditMappingValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.cp.ivalues.IBOCmAgentPartnerInfoValue;
import com.asiainfo.crm.cm.cp.ivalues.IBOCmPartnerInfoValue;
import com.asiainfo.crm.cm.cp.ivalues.IQBOCmPartnerInfoValue;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupRelIndustryBean;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupRelIndustryValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBoCmCustSegmentValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBoCmGroupAccountingValue;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmCustSegmentSV;
import com.asiainfo.crm.cm.customer.group.service.interfaces.IKOBFileImportSV;
import com.asiainfo.crm.cm.inner.account.ivalues.IQBOCmAcctPayMentValue;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupCustomerBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContactQryValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContractValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.inner.customer.service.interfaces.ICmCustSegmentRelaSV;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmxAcctBankRelValue;
import com.asiainfo.crm.cm.ln.club.ivalues.IBOLnCmUserManagerValue;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsCmRelValue;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsDesRelValue;
import com.asiainfo.crm.cm.ln.common.util.CmBusiEntry;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmGroupInfoValue;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmxGroupCustValue;
import com.asiainfo.crm.cm.ln.customer.group.service.interfaces.ICmLnGroupSV;
import com.asiainfo.crm.cm.ln.service.interfaces.ICmLnCommonServiceSV;
import com.asiainfo.crm.cm.model.bean.VOAccountBean;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.AccountBean;
import com.asiainfo.crm.cm.model.bo.AcctPaymentBean;
import com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCustomizeValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue;
import com.asiainfo.crm.cm.model.ivalues.ISoUserValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmAccountSV;
import com.asiainfo.crm.cm.service.interfaces.ICmContactSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupCustomerSV;
import com.asiainfo.crm.cm.support.bce.service.interfaces.ICmAccountBceDealSV;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICmInterfaceSV;
import com.asiainfo.crm.common.ivalues.IBOBsBankValue;
import com.asiainfo.crm.common.ResUserInfo;

public class CmInterfaceSVImpl implements ICmInterfaceSV {

	public ICustomerValue queryCustotmerByCustId(long CustId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CustId", CustId);
		innerMap.put("busiId", "so100002");
		innerMap.put("QueryType", "1");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);

		return (ICustomerValue) returnObj;
	}

	public ICustomerValue queryCustotmerByGroupId(String groupId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CustServiceId", groupId);
		innerMap.put("busiId", "so100002");
		innerMap.put("QueryType", "2");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		if (returnObj == null) {
			return null;
		}
		return (ICustomerValue) returnObj;
	}

	public ICustomerValue[] queryCustotmersByCertTypeAndCertCode(int certType, String certCode) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CustCertType", certType);
		innerMap.put("CustCertCode", certCode);
		innerMap.put("busiId", "so100002");
		innerMap.put("QueryType", "3");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (ICustomerValue[]) returnObj;
	}

	public Boolean checkRealNameByCustId(long custid) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CustId", custid);
		innerMap.put("busiId", "so100002");
		innerMap.put("QueryType", "4");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Boolean) returnObj;
	}

	public Map queryCustomerByCn(Map parameter) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		if (parameter.containsKey("ServiceNum"))
			innerMap.put("ServiceNum", parameter.get("ServiceNum"));

		if (parameter.containsKey("UserId"))
			innerMap.put("UserId", parameter.get("UserId"));

		if (parameter.containsKey("CustId"))
			innerMap.put("CustId", parameter.get("CustId"));

		if (parameter.containsKey("Password"))
			innerMap.put("Password", parameter.get("Password"));

		if (parameter.containsKey("GroupId"))
			innerMap.put("GroupId", parameter.get("GroupId"));

		innerMap.put("busiId", "so100002");
		innerMap.put("QueryType", "5");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public Boolean checkRealNameByServiceNum(String serviceNum) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("ServiceNum", serviceNum);
		innerMap.put("busiId", "so100002");
		innerMap.put("QueryType", "6");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Boolean) returnObj;
	}

	public Map queryGroupCustByCdn(int qryType, String qryValue) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("QryType", qryType);
		innerMap.put("QryValue", qryValue);
		innerMap.put("busiId", "so100002");
		innerMap.put("QueryType", "7");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public List querySpecialListByCustId(long custId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CustId", custId);
		innerMap.put("busiId", "so100001");
		innerMap.put("OperType", "query");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (List) returnObj;
	}

	public List querySpecialListByCertTypeAndCertCode(int certType, String certCode) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CertType", certType);
		innerMap.put("CertCode", certCode);
		innerMap.put("busiId", "so100001");
		innerMap.put("OperType", "query");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (List) returnObj;
	}

	public Boolean checkSpecialListByCustId(long custId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CustId", custId);
		innerMap.put("busiId", "so100001");
		innerMap.put("OperType", "check");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Boolean) returnObj;
	}

	public Boolean checkSpecialListByCertTypeAndCertCode(int certType, String certCode) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CertType", certType);
		innerMap.put("CertCode", certCode);
		innerMap.put("busiId", "so100001");
		innerMap.put("OperType", "check");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Boolean) returnObj;
	}

	public Boolean checkSpecialList4AMS(int certType, String certCode, String listType) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CertType", certType);
		innerMap.put("CertCode", certCode);
		innerMap.put("SubMonType", listType);
		innerMap.put("busiId", "so100001");
		innerMap.put("OperType", "check");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Boolean) returnObj;
	}

	public List queryClubMemberByBillId(String BillId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("BillId", BillId);
		innerMap.put("busiId", "so100003");
		innerMap.put("QueryType", "1");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (List) returnObj;
	}

	public long modifyGroupEcCodeByCustId(long custId, String ecCode) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("OperType", "modify");
		innerMap.put("CustId", custId);
		innerMap.put("EcCode", ecCode);
		innerMap.put("busiId", "so100004");
		innerMap.put("CustType", CmConstants.CustomerType.GROUP);

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return Long.parseLong(returnObj.toString());
	}

	public long createGroupCustomer(Map parameter) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("OperType", "new");
		innerMap.putAll(parameter);
		innerMap.put("busiId", "so100004");
		innerMap.put("CustType", CmConstants.CustomerType.GROUP);
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return Long.parseLong(returnObj.toString());
	}

	public long modifyCustomerValueByCustId(Map custValue) throws Exception {
		Map parameter = (Map) custValue.get("CustInfo");
		if (parameter == null)
			ExceptionUtil.throwBusinessException("CMS95000083");// CMS95000083 "参数传递错误",

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		if (parameter.get("CustId") == null || "".equals(parameter.get("CustId")))
			ExceptionUtil.throwBusinessException("CMS95000084");// CMS95000084 "修改客户信息,客户编码不能为空",

		long custId = Long.parseLong(parameter.get("CustId").toString());

		innerMap.put("busiId", "so100004");
		innerMap.put("OperType", "modify");
		innerMap.put("CustId", custId);
		int custType = CmCommonUtil.getCustType(custId);
		innerMap.put("CustType", custType);

		if (parameter.containsKey("CustLanguage"))
			innerMap.put("CustLanguage", parameter.get("CustLanguage"));

		if (parameter.containsKey("CustName"))
			innerMap.put("CustName", parameter.get("CustName"));

		if (parameter.containsKey("CustServiceLevel"))
			innerMap.put("CustServiceLevel", parameter.get("CustServiceLevel"));

		// 客户地址
		if (parameter.containsKey("CustAddress"))
			innerMap.put("CustAddress", parameter.get("CustAddress"));

		// 邮政编码
		if (parameter.containsKey("CustZipcode"))
			innerMap.put("CustZipcode", parameter.get("CustZipcode"));

		if (parameter.containsKey("CityId"))
			innerMap.put("CityId", parameter.get("CityId"));

		if (parameter.containsKey("CountyId"))
			innerMap.put("CountyId", parameter.get("CountyId"));

		if (parameter.containsKey("OpId"))
			innerMap.put("OpId", parameter.get("OpId"));

		if (parameter.containsKey("OrgId"))
			innerMap.put("OrgId", parameter.get("OrgId"));

		if (parameter.containsKey("Remarks"))
			innerMap.put("Remarks", parameter.get("Remarks"));

		if (custType == CmConstants.CustomerType.INDIVIDUAL) {
			if (parameter.containsKey("Birthday"))
				innerMap.put("Birthday", parameter.get("Birthday"));

			if (parameter.containsKey("CharacterDesc"))
				innerMap.put("CharacterDesc", parameter.get("CharacterDesc"));

			if (parameter.containsKey("EducationLevel"))
				innerMap.put("EducationLevel", parameter.get("EducationLevel"));

			if (parameter.containsKey("FamilyInfo"))
				innerMap.put("FamilyInfo", parameter.get("FamilyInfo"));

			if (parameter.containsKey("Gender"))
				innerMap.put("Gender", parameter.get("Gender"));

			if (parameter.containsKey("Hobby"))
				innerMap.put("Hobby", parameter.get("Hobby"));

			if (parameter.containsKey("IncomeLevel"))
				innerMap.put("IncomeLevel", parameter.get("IncomeLevel"));

			if (parameter.containsKey("IsVip"))
				innerMap.put("IsVip", parameter.get("IsVip"));

			if (parameter.containsKey("JobCompany"))
				innerMap.put("JobCompany", parameter.get("JobCompany"));

			if (parameter.containsKey("JobPosition"))
				innerMap.put("JobPosition", parameter.get("JobPosition"));

			if (parameter.containsKey("Lunar"))
				innerMap.put("Lunar", parameter.get("Lunar"));

			if (parameter.containsKey("MarryStatus"))
				innerMap.put("MarryStatus", parameter.get("MarryStatus"));

			if (parameter.containsKey("NationalType"))
				innerMap.put("NationalType", parameter.get("NationalType"));

			if (parameter.containsKey("Occupation"))
				innerMap.put("Occupation", parameter.get("Occupation"));

			if (parameter.containsKey("PoliticsFace"))
				innerMap.put("PoliticsFace", parameter.get("PoliticsFace"));

			if (parameter.containsKey("Religion"))
				innerMap.put("Religion", parameter.get("Religion"));

			if (parameter.containsKey("RealNameFlag"))
				innerMap.put("RealNameFlag", parameter.get("RealNameFlag"));

		} else if (custType == CmConstants.CustomerType.GROUP) {
			if (parameter.containsKey("GroupFax"))
				innerMap.put("GroupFax", parameter.get("GroupFax"));

			if (parameter.containsKey("GroupWeb"))
				innerMap.put("GroupWeb", parameter.get("GroupWeb"));

			if (parameter.containsKey("HqNumber"))
				innerMap.put("HqNumber", parameter.get("HqNumber"));

			if (parameter.containsKey("RegAmount"))
				innerMap.put("RegAmount", parameter.get("RegAmount"));

			if (parameter.containsKey("RegionType"))
				innerMap.put("RegionType", parameter.get("RegionType"));

			if (parameter.containsKey("ShortName"))
				innerMap.put("ShortName", parameter.get("ShortName"));

			if (parameter.containsKey("StaffAmount"))
				innerMap.put("StaffAmount", parameter.get("StaffAmount"));

			if (parameter.containsKey("SubRegionType"))
				innerMap.put("SubRegionType", parameter.get("SubRegionType"));

			if (parameter.containsKey("Vocation"))
				innerMap.put("Vocation", parameter.get("Vocation"));

			if (parameter.containsKey("SubVocation"))
				innerMap.put("SubVocation", parameter.get("SubVocation"));

			if (parameter.containsKey("TownId"))
				innerMap.put("TownId", parameter.get("TownId"));

			if (parameter.containsKey("VillegeId"))
				innerMap.put("VillegeId", parameter.get("VillegeId"));

			if (parameter.containsKey("CustStatus"))
				innerMap.put("CustStatus", parameter.get("CustStatus"));
		}

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return Long.parseLong(returnObj.toString());
	}

	public Map queryClubServiceFreeTimes(Map parameter) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.putAll(parameter);
		innerMap.put("busiId", "so100006");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public IBOLnCmInsCmRelValue[] queryCmInsCmRelByCustId(long custid, long userId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CustId", custid);
		innerMap.put("UserId", userId);
		innerMap.put("busiId", "so100007");
		innerMap.put("OperType", "query");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (IBOLnCmInsCmRelValue[]) returnObj;
	}

	public Map queryCmAcctRegion(long custid, long userId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CustId", custid);
		innerMap.put("UserId", userId);
		innerMap.put("busiId", "so100007");
		innerMap.put("OperType", "queryRegion");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public IBOLnCmInsCmRelValue[] queryDesUsers(long custId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CustId", custId);
		innerMap.put("busiId", "so100007");
		innerMap.put("OperType", "queryDes");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (IBOLnCmInsCmRelValue[]) returnObj;
	}

	public String addCmInsCmRel(Map parameter) throws Exception {
		if (isEmpty(parameter.get("UserId")) || isEmpty(parameter.get("CustId")) || isEmpty(parameter.get("UserRegionCode")))
			ExceptionUtil.throwBusinessException("CMS95000085");// CMS95000085 "新增操作,UserId,CustId,UserRegionCode不能为空",
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CustId", parameter.get("CustId"));
		innerMap.put("UserId", parameter.get("UserId"));
		innerMap.put("UserRegionCode", parameter.get("UserRegionCode"));
		innerMap.put("RelaType", parameter.get("RelaType"));
		innerMap.put("UserType", parameter.get("UserType"));
		if (parameter.containsKey("State"))
			innerMap.put("State", parameter.get("State"));
		innerMap.put("OfferId", parameter.get("OfferId"));
		innerMap.put("busiId", "so100007");
		innerMap.put("OperType", "add");
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (String) returnObj;
	}

	public String deleteCmInsCmRel(Map parameter) throws Exception {
		if (isEmpty(parameter.get("UserId")))
			ExceptionUtil.throwBusinessException("CMS95000086");// CMS95000086 "删除操作,UserId不能为空",

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("UserId", parameter.get("UserId"));
		innerMap.put("busiId", "so100007");
		innerMap.put("OperType", "delete");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (String) returnObj;
	}

	public String modifyCmInsCmRel(IBOLnCmInsCmRelValue value) throws Exception {
		if (isEmpty(value.getUserId() <= 0))
			ExceptionUtil.throwBusinessException("CMS95000087");// CMS95000087 "修改操作,UserId不能为空",
		Map<Object, Object> innerMap = new HashMap<Object, Object>();

		innerMap.put("inputObj", value);
		innerMap.put("busiId", "so100007");
		innerMap.put("OperType", "modify");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (String) returnObj;
	}

	public IBOCmGroupContractValue[] queryGroupContractByCustId(long custid) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CustId", custid);
		innerMap.put("busiId", "so100008");
		innerMap.put("OperType", "query");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (IBOCmGroupContractValue[]) returnObj;
	}

	public Map queryGroupContractByCnd(Map parameter) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("inputParameter", parameter);
		innerMap.put("busiId", "so100008");
		innerMap.put("OperType", "queryForOut");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public IAcctPaymentValue[] queryAcctPaymentByAcctId(long acctId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("AcctId", acctId);
		innerMap.put("busiId", "ams200001");
		innerMap.put("QueryType", "1");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (IAcctPaymentValue[]) returnObj;
	}

	public IAcctPaymentValue[] queryAcctPaymentByBankCode(Map parameter) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.putAll(parameter);
		innerMap.put("busiId", "ams200001");
		innerMap.put("QueryType", "2");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (IAcctPaymentValue[]) returnObj;
	}

	public IAccountProfileValue[] queryAccountByGroupId(String groupId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("busiId", "ams200002");
		innerMap.put("GroupId", groupId);
		innerMap.put("QueryType", "1");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (IAccountProfileValue[]) returnObj;
	}

	public IAccountProfileValue[] queryAccountByPayAccount(Map parameter) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.putAll(parameter);
		innerMap.put("busiId", "ams200002");
		innerMap.put("QueryType", "2");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (IAccountProfileValue[]) returnObj;
	}

	/**
	 * 根据账户标志查询账户信息
	 * 
	 * @param AcctId
	 * @return
	 * @throws Exception
	 */
	public IAccountProfileValue[] queryAccountByAccountId(long AcctId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("busiId", "ams200002");
		innerMap.put("AcctId", AcctId);
		innerMap.put("QueryType", "4");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (IAccountProfileValue[]) returnObj;
	}

	/**
	 * 根据客户标志查询账户信息
	 * 
	 * @return
	 * @throws Exception
	 */
	public IAccountProfileValue[] queryAccountByCustId(long CustId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("busiId", "ams200002");
		innerMap.put("CustId", CustId);
		innerMap.put("QueryType", "5");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (IAccountProfileValue[]) returnObj;
	}

	public Map queryCustotmerByGroupCustId(long GroupCustId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CustId", GroupCustId);
		innerMap.put("busiId", "so100009");
		innerMap.put("QueryType", "1");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);

		return (Map) returnObj;
	}

	public Map queryCreditByServiceNumOrUserId(String serviceNum, String userId, String queryType) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("ServiceNum", serviceNum);
		innerMap.put("userId", userId);
		innerMap.put("queryType", queryType);

		innerMap.put("busiId", "ams200003");
		innerMap.put("OperType", "1");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);

		return (Map) returnObj;
	}

	public Map queryMgrByGroupCustId(long GroupCustId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CustId", GroupCustId);
		innerMap.put("busiId", "so100009");
		innerMap.put("QueryType", "2");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);

		return (Map) returnObj;
	}

	public Map queryCustotmersByCondition(Map parameter) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("inputMap", parameter);
		innerMap.put("busiId", "so100002");
		innerMap.put("QueryType", "11");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);

		return (Map) returnObj;
	}

	public Map queryCustotmerByCustIdOrGroupId(long custId, String groupId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();

		if (custId > 0)
			innerMap.put("CustId", custId);

		if (groupId != null && !"".equals(groupId))
			innerMap.put("GroupId", groupId);

		innerMap.put("busiId", "so100002");
		innerMap.put("QueryType", "12");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);

		return (Map) returnObj;
	}

	public Map queryAcctPaymentAndByAcctId(long acctId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("AcctId", acctId);
		innerMap.put("busiId", "ams200002");
		innerMap.put("QueryType", "6");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public Map queryCmBillCustomize(String serviceNum) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("ServiceNum", serviceNum);
		innerMap.put("busiId", "so100012");
		innerMap.put("OperType", "query");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public Map modifyCmBillCustomize(Map parameter) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		if (isEmpty(parameter.get("ActionType"))) {
			ExceptionUtil.throwBusinessException("CMS95000083");// CMS95000083 "参数传递错误",
		}

		if ("0".equals(parameter.get("ActionType"))) {
			innerMap.put("OperType", "new");
		} else if ("1".equals(parameter.get("ActionType"))) {
			innerMap.put("OperType", "mod");
		} else if ("2".equals(parameter.get("ActionType"))) {
			innerMap.put("OperType", "del");
		} else {
			ExceptionUtil.throwBusinessException("CMS95000083");// CMS95000083 "参数传递错误",
		}

		innerMap.put("ServiceMap", parameter);
		innerMap.put("busiId", "so100012");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public long addCmBillCustomize(Map parameter) throws Exception {
		if (!parameter.containsKey("cmAcctFrmCustomize"))
			return 0L;

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("inputParameter", parameter);
		innerMap.put("busiId", "so100012");
		innerMap.put("OperType", "fromSO");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return Long.parseLong(returnObj.toString());
	}

	public Map queryAcctInfo(String Sn, String acctId, String userId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("ServiceNum", Sn);
		innerMap.put("AcctId", acctId);
		innerMap.put("UserId", userId);
		innerMap.put("busiId", "ams200002");
		innerMap.put("QueryType", "8");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public IAcctBillCycleValue[] queryNextAcctBillCyclesByAcctId(long acctId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("AcctId", acctId);
		innerMap.put("busiId", "so100023");
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (IAcctBillCycleValue[]) returnObj;
	}

	public Map queryAcctBillCycleInfo(String acctId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("AcctId", acctId);
		innerMap.put("busiId", "so100011");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public ICustomerValue queryCustotmerByContractId(String contractId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("contractId", contractId);
		innerMap.put("busiId", "so100009");
		innerMap.put("QueryType", "5");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);

		return (ICustomerValue) returnObj;
	}

	public Boolean isGroupAcctByAccttId(long acctId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("AcctId", acctId);
		innerMap.put("busiId", "ams200005");
		innerMap.put("QueryType", "1");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Boolean) returnObj;
	}

	public Boolean checkCreditLevelByAcctId(long acctId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("AcctId", acctId);
		innerMap.put("busiId", "ams200006");
		innerMap.put("OperType", "check");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Boolean) returnObj;
	}

	public IContactValue queryMainGroupContactByCustId(long CustId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("GroupCustId", CustId);
		innerMap.put("busiId", "so100009");
		innerMap.put("QueryType", "6");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (IContactValue) returnObj;
	}

	public IContactValue[] queryAllGroupContactByCustId(long CustId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("GroupCustId", CustId);
		innerMap.put("busiId", "so100009");
		innerMap.put("QueryType", "7");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (IContactValue[]) returnObj;
	}

	public Map bindingBankAcctPayment(Map parameter) throws Exception {
		if (isEmpty(parameter.get("ServiceNum")) && isEmpty(parameter.get("AcctId")))
			ExceptionUtil.throwBusinessException("CMS95000088");// CMS95000088 "手机号码及账户编码不能都为空",

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("busiId", "so100010");
		innerMap.put("OperType", "1");

		if (parameter.containsKey("ServiceNum"))
			innerMap.put("ServiceNum", parameter.get("ServiceNum"));

		if (parameter.containsKey("AcctId"))
			innerMap.put("AcctId", parameter.get("AcctId"));

		if (parameter.containsKey("BankId"))
			innerMap.put("BankId", parameter.get("BankId"));

		if (parameter.containsKey("BankAccount"))
			innerMap.put("BankAccount", parameter.get("BankAccount"));

		if (parameter.containsKey("BusiType"))
			innerMap.put("BusiType", parameter.get("BusiType"));

		if (parameter.containsKey("OnceFee"))
			innerMap.put("OnceFee", parameter.get("OnceFee"));

		if (parameter.containsKey("MinFee"))
			innerMap.put("MinFee", parameter.get("MinFee"));

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public Map unbindingBankAcctPayment(Map parameter) throws Exception {
		if (isEmpty(parameter.get("ServiceNum")) && isEmpty(parameter.get("AcctId")))
			ExceptionUtil.throwBusinessException("CMS95000088");// "手机号码及账户编码不能都为空",

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("busiId", "so100010");
		innerMap.put("OperType", "2");

		if (parameter.containsKey("ServiceNum"))
			innerMap.put("ServiceNum", parameter.get("ServiceNum"));

		if (parameter.containsKey("AcctId"))
			innerMap.put("AcctId", parameter.get("AcctId"));

		if (parameter.containsKey("BankId"))
			innerMap.put("BankId", parameter.get("BankId"));

		if (parameter.containsKey("BankAccount"))
			innerMap.put("BankAccount", parameter.get("BankAccount"));

		if (parameter.containsKey("BusiType"))
			innerMap.put("BusiType", parameter.get("BusiType"));

		if (parameter.containsKey("OnceFee"))
			innerMap.put("OnceFee", parameter.get("OnceFee"));

		if (parameter.containsKey("MinFee"))
			innerMap.put("MinFee", parameter.get("MinFee"));

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public Map queryBankAcctPaymentInfo(Long acctId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("AcctId", acctId);
		innerMap.put("busiId", "ams200007");
		innerMap.put("QueryType", "1");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		Map map = (Map) returnObj;
		return map;
	}

	public Boolean userReceipt(long custId, long acctId, long userId) throws Exception {
		if (custId <= 0)
			ExceptionUtil.throwBusinessException("CMS95000089");// CMS95000089"客户编码不能为空",
		if (acctId <= 0)
			ExceptionUtil.throwBusinessException("CMS95000090");// CMS95000090"账户编码不能为空",
		if (userId <= 0)
			ExceptionUtil.throwBusinessException("CMS95000091");// CMS95000091"用户编码不能为空",

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CustId", custId);
		innerMap.put("AcctId", acctId);
		innerMap.put("UserId", userId);
		innerMap.put("busiId", "so100013");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Boolean) returnObj;
	}

	/*
	 * 开通信用等级 * retCode 0 操作成功 1001 用户信息不存在 1002 已经开通，无需办理 1003 已经存在无需取消 1004 其它操作 retMsg 错误信息
	 */
	public Map dredgeCreditEnter(long serviceNum, long userId, long actType) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("ServiceNum", serviceNum);
		innerMap.put("UserId", userId);
		innerMap.put("ActType", actType);
		innerMap.put("busiId", "so100014");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public ICustomerValue[] queryCustotmerByCustName(String name) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CustName", name);
		innerMap.put("busiId", "so100002");
		innerMap.put("QueryType", "8");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (ICustomerValue[]) returnObj;
	}

	public IBOCmGroupContactQryValue[] queryGroupContactByGroupId(String custServiceId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CustServiceId", custServiceId);
		innerMap.put("busiId", "so100002");
		innerMap.put("QueryType", "9");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (IBOCmGroupContactQryValue[]) returnObj;
	}

	private Boolean isEmpty(Object obj) {
		if (obj == null || "".equals(obj.toString()))
			return true;

		return false;
	}

	// 查询集团帐单寄送信息
	public Map queryGrpCustAcctBill(Map parameter) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("map", parameter);
		innerMap.put("busiId", "so100015");
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	// 3.4.2.18 查询集团信用信息
	public Map queryGrpCustCredirMessage(Map parameter) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("map", parameter);
		innerMap.put("busiId", "so100016");
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public long addSpecialCustomer(Map parameter) throws Exception {

		if (isEmpty(parameter.get("CUST_ID")))
			ExceptionUtil.throwBusinessException("CMS95000089");// "客户编码不能为空",

		if (isEmpty(parameter.get("USER_ID")))
			ExceptionUtil.throwBusinessException("CMS95000091");// "用户编码不能为空",

		if (isEmpty(parameter.get("BILL_ID")))
			ExceptionUtil.throwBusinessException("CMS95000094");// CMS95000094"手机号码不能为空",

		if (isEmpty(parameter.get("CUST_NAME")))
			ExceptionUtil.throwBusinessException("CMS95000095");// CMS95000095"客户名称不能为空",

		if (isEmpty(parameter.get("CERT_TYPE")))
			ExceptionUtil.throwBusinessException("CMS95000096");// CMS95000096"身份类型不能为空",

		if (isEmpty(parameter.get("CERT_CODE")))
			ExceptionUtil.throwBusinessException("CMS95000097");// CMS95000097"身份号码不能为空",

		if (isEmpty(parameter.get("ADD_REASON")))
			ExceptionUtil.throwBusinessException("CMS95000098");// CMS95000098"加入原因不能为空",

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("busiId", "so100017");
		innerMap.put("OperType", "new");

		if (parameter.containsKey("CUST_ID"))
			innerMap.put("CUST_ID", parameter.get("CUST_ID"));

		if (parameter.containsKey("USER_ID"))
			innerMap.put("USER_ID", parameter.get("USER_ID"));

		if (parameter.containsKey("BILL_ID"))
			innerMap.put("BILL_ID", parameter.get("BILL_ID"));

		if (parameter.containsKey("CUST_NAME"))
			innerMap.put("PARTY_NAME", parameter.get("CUST_NAME"));

		if (parameter.containsKey("CERT_TYPE"))
			innerMap.put("CERT_TYPE", parameter.get("CERT_TYPE"));

		if (parameter.containsKey("CERT_CODE"))
			innerMap.put("CERT_CODE", parameter.get("CERT_CODE"));

		if (parameter.containsKey("ADD_REASON"))
			innerMap.put("ADD_REASON", parameter.get("ADD_REASON"));
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return Long.valueOf(returnObj.toString());
	}

	public long delSpecialCustomer(long certType, String certCode, String listType, long userId) throws Exception {
		// TODO Auto-generated method stub
		if (certType < 0)
			ExceptionUtil.throwBusinessException("CMS95000092");// CMS95000092"证件类型输入不正确",

		if ("".equals(certCode))
			ExceptionUtil.throwBusinessException("CMS95000093");// CMS95000093"证件号码不能为空",

		// 备注删除监控子类型
		/*
		 * if ("".equals(listType)) ExceptionUtil.throwBusinessException("CMS95000099");// CMS95000099"监控子类型不能为空",
		 */

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("busiId", "so100017");
		innerMap.put("OperType", "delete");

		innerMap.put("CustCertType", certType);
		innerMap.put("CustCertCode", certCode);
		innerMap.put("SubMonType", listType);

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return Long.valueOf(returnObj.toString());
	}

	public IAcctPaymentValue[] queryBankCodeByRegionIdAndPayMethod(String regionId, int payMethod) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("RegionId", regionId);
		innerMap.put("PayMethod", payMethod);
		innerMap.put("QueryType", 3);
		innerMap.put("busiId", "ams200001");
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (IAcctPaymentValue[]) returnObj;
	}

	public Map queryAcctPayment(Map parameter) throws Exception {
		if (isEmpty(parameter.get("ServiceNum")) && isEmpty(parameter.get("UserId")) && isEmpty(parameter.get("AcctId")) && isEmpty(parameter.get("CustId")))
			ExceptionUtil.throwBusinessException("CMS95000100");// CMS95000100"手机号码、用户编码、客户编码、账户编码不能同时为空",

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("busiId", "so100018");

		if (parameter.containsKey("ServiceNum"))
			innerMap.put("ServiceNum", parameter.get("ServiceNum"));

		if (parameter.containsKey("UserId"))
			innerMap.put("UserId", parameter.get("UserId"));

		if (parameter.containsKey("CustId"))
			innerMap.put("CustId", parameter.get("CustId"));

		if (parameter.containsKey("AcctId"))
			innerMap.put("AcctId", parameter.get("AcctId"));
		
		if (parameter.containsKey("InstallmentFlag"))
			innerMap.put("InstallmentFlag", parameter.get("InstallmentFlag"));

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public ICustomerValue queryCustotmerByEcCode(String ecCode) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("EcCode", ecCode);
		innerMap.put("busiId", "so100002");
		innerMap.put("QueryType", "10");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (ICustomerValue) returnObj;
	}

	/**
	 * 集团下发账户新增
	 */
	public long saveAccount4BBoss(Map parameter) throws Exception {
		// TODO Auto-generated method stub

		if (isEmpty(parameter.get("CustId")))
			ExceptionUtil.throwBusinessException("CMS95000089");// "客户编码不能为空",

		if (isEmpty(parameter.get("AcctName")))
			ExceptionUtil.throwBusinessException("CMS95000101");// CMS95000101"账户名称不能为空",

		if (isEmpty(parameter.get("AcctType")))
			ExceptionUtil.throwBusinessException("CMS95000102");// CMS95000102"账户类型不能为空",

		if (isEmpty(parameter.get("RegionID")))
			ExceptionUtil.throwBusinessException("CMS0700404");// CMS95000102"账户类型不能为空",

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("OperType", "add");
		innerMap.put("busiId", "so100019");

		innerMap.put("CustId", parameter.get("CustId"));
		innerMap.put("AcctName", parameter.get("AcctName"));
		innerMap.put("AcctType", parameter.get("AcctType"));
		innerMap.put("RegionID", parameter.get("RegionID"));

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return Long.parseLong((returnObj.toString()));
	}

	public IBOLnCmInsDesRelValue[] queryCustDesUsers(long custId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CustId", custId);
		innerMap.put("busiId", "so100007");
		innerMap.put("OperType", "queryHis");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (IBOLnCmInsDesRelValue[]) returnObj;
	}

	public Boolean saveDesUsers(IBOLnCmInsDesRelValue[] insDesRelValues) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("inputObj", insDesRelValues);
		innerMap.put("busiId", "so100007");
		innerMap.put("OperType", "addHis");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Boolean) returnObj;
	}

	public Map queryContactInfo4CBOSS(String groupId, String serviceNum, int bgnIndex, int endIndex) throws Exception {
		// TODO Auto-generated method stub
		if ("".equals(groupId))
			ExceptionUtil.throwBusinessException("CMS95000103");// CMS95000103"集团编码不能为空",
		if (bgnIndex < 1)
			bgnIndex = 1;

		if (endIndex < 1)
			endIndex = 100;

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CustServiceId", groupId);
		innerMap.put("BgnIndex", bgnIndex);
		innerMap.put("EndIndex", endIndex);
		innerMap.put("busiId", "so100020");
		innerMap.put("QueryType", "1");

		if (!"".equals(serviceNum))
			innerMap.put("ServiceNum", serviceNum);

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public Map queryKeyInfo4CBOSS(String groupId, String name, int bgnIndex, int endIndex) throws Exception {
		// TODO Auto-generated method stub
		if ("".equals(groupId))
			ExceptionUtil.throwBusinessException("CMS95000103");// "集团编码不能为空",

		if (bgnIndex < 1)
			ExceptionUtil.throwBusinessException("CMS95000104");// CMS95000104"起始记录号格式错误",

		if (endIndex < 1)
			ExceptionUtil.throwBusinessException("CMS95000105");// CMS95000105"结束记录号格式错误",

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CustServiceId", groupId);
		innerMap.put("BgnIndex", bgnIndex);
		innerMap.put("EndIndex", endIndex);
		innerMap.put("busiId", "so100020");
		innerMap.put("QueryType", "2");

		if (!"".equals(name))
			innerMap.put("ContName", name);

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	// 成员基本信息
	public Map queryCmGrpMember(Map parameter) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("map", parameter);
		innerMap.put("busiId", "so100021");
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	// 成员列表
	public Map queryCmGrpMemberList(Map parameter) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("map", parameter);
		innerMap.put("busiId", "so100022");
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public IBOCmCreditMappingValue getOneCreditMapping(String regionId, int custType, int creditLevel) throws Exception {
		return (IBOCmCreditMappingValue) CacheFactory.get(CmCreditLevelCacheImpl.class, CmCreditLevelCacheImpl.ONE_DATA_KEY + regionId + custType + creditLevel);
	}

	public Map transferCustScoreAndGrade(Map parameter) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("map", parameter);
		innerMap.put("busiId", "ams200008");
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public Map checkTrainService(Map bean) throws Exception {
		if (bean == null)
			ExceptionUtil.throwBusinessException("CMS95000083");// "参数传递错误",

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("inputValue", bean);
		innerMap.put("ServiceType", CmConstants.Club.SERVICE_TYPE_TRAIN);
		innerMap.put("busiId", "so100024");
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public Map checkAirportService(Map bean) throws Exception {
		if (bean == null)
			ExceptionUtil.throwBusinessException("CMS95000083");// "参数传递错误",

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("inputValue", bean);
		innerMap.put("ServiceType", CmConstants.Club.SERVICE_TYPE_PLANE);
		innerMap.put("busiId", "so100024");
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public Map recordAirportService(Map bean) throws Exception {
		if (bean == null)
			ExceptionUtil.throwBusinessException("CMS95000083");// "参数传递错误",

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("inputValue", bean);
		innerMap.put("ServiceType", CmConstants.Club.SERVICE_TYPE_PLANE);
		innerMap.put("busiId", "so100025");
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public Map recordTrainService(Map bean) throws Exception {
		if (bean == null)
			ExceptionUtil.throwBusinessException("CMS95000083");// "参数传递错误",

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("inputValue", bean);
		innerMap.put("ServiceType", CmConstants.Club.SERVICE_TYPE_TRAIN);
		innerMap.put("busiId", "so100025");
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public Map qrySubordinateGrpCust(long CustId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		// modify by caiyu 20121103
		if (CustId <= 0) {
			ExceptionUtil.throwBusinessException("CMS0076044");// 传入参数有误
		}
		Map parameter = new HashMap();
		parameter.put("grpCustId", CustId);
		innerMap.put("map", parameter);
		innerMap.put("busiId", "so100027");
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public Boolean delManagerRel(long managerId, String managerType) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("ManagerId", managerId);
		innerMap.put("ManagerType", managerType);
		innerMap.put("busiId", "so100028");
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Boolean) returnObj;
	}

	public Map qryVipCardInfo(String billId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("BillId", billId);
		innerMap.put("busiId", "so100029");
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public IBOCmGroupCustomerValue queryGroupCustByBillId(String billId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("billId", billId);
		innerMap.put("busiId", "so100030");
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (IBOCmGroupCustomerValue) returnObj;
	}

	public IBOLnCmInsCmRelValue[] queryCmInsCmRelByCds(long custId, long userId, int state) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("custId", custId);
		innerMap.put("userId", userId);
		innerMap.put("state", state);
		innerMap.put("busiId", "so100031");
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (IBOLnCmInsCmRelValue[]) returnObj;
	}

	public void saveCmInsCmRelValues(IBOLnCmInsCmRelValue[] lnCmInsCmRelValues) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { IBOLnCmInsCmRelValue[].class });
		innerMap.put("paraObjects", new Object[] { lnCmInsCmRelValues });
		innerMap.put("busiId", "so100032");
		CmBusiEntry.invokeInterfaceNew(innerMap);

	}

	public IBOCmxAcctBankRelValue[] queryAcctBankRel(String billId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { String.class, long.class });
		innerMap.put("paraObjects", new Object[] { billId, -1 });
		innerMap.put("busiId", "ams200009");
		Object returnObj = CmBusiEntry.invokeInterfaceNew(innerMap);
		return (IBOCmxAcctBankRelValue[]) returnObj;
	}

	public List queryRootGrpCustomers(long custId) throws Exception {
		// TODO Auto-generated method stub

		if (custId <= 0)
			ExceptionUtil.throwBusinessException("CMS95000106");// CMS95000106"集团客户编号不能为空",

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CustId", custId);
		innerMap.put("busiId", "so100033");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (List) returnObj;
	}

	public Boolean cancelLationOfUser(Map parameter) throws Exception {
		// TODO Auto-generated method stub
		if (isEmpty(parameter.get("CustId")))
			ExceptionUtil.throwBusinessException("CMS95000089");// "客户编号不能为空",
		if (isEmpty(parameter.get("AcctId")))
			ExceptionUtil.throwBusinessException("CMS95000090");// "账户编号不能为空",
		if (isEmpty(parameter.get("UserId")))
			ExceptionUtil.throwBusinessException("CMS95000091");// "用户编号不能为空",

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CustId", parameter.get("CustId"));
		innerMap.put("AcctId", parameter.get("AcctId"));
		innerMap.put("UserId", parameter.get("UserId"));
		innerMap.put("busiId", "so100034");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Boolean) returnObj;
	}

	public IAccountProfileValue[] queryAcctAndPayments(String bankAccount, String regionId, long payMethod) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { String.class, String.class, long.class });
		innerMap.put("paraObjects", new Object[] { bankAccount, regionId, payMethod });
		innerMap.put("busiId", "ams200010");
		Object returnObj = CmBusiEntry.invokeInterfaceNew(innerMap);
		return (IAccountProfileValue[]) returnObj;
	}

	/**                                                                                                                                    
	 * qiangkz                                                                                                                             
	 */

	public IQBOCmPartnerInfoValue[] queryMPartnerInfo(String partnerTypeDtl, String partnerType, String statusType, String typeDesc, int start, int end) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { String.class, String.class, String.class, String.class, int.class, int.class });
		innerMap.put("busiId", "so100035");
		innerMap.put("paraObjects", new Object[] { partnerTypeDtl, partnerType, statusType, typeDesc, start, end });
		Object returnObj = CmBusiEntry.invokeInterfaceNew(innerMap);
		return (IQBOCmPartnerInfoValue[]) returnObj;
	}

	public IBOCmPartnerInfoValue[] querySPartnerInfo(String partnerTypeDtl, String partnerType, String statusType, String siIntroNum, int start, int end) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { String.class, String.class, String.class, String.class, int.class, int.class });
		innerMap.put("busiId", "so100036");
		innerMap.put("paraObjects", new Object[] { partnerTypeDtl, partnerType, statusType, siIntroNum, start, end });
		Object returnObj = CmBusiEntry.invokeInterfaceNew(innerMap);
		return (IBOCmPartnerInfoValue[]) returnObj;
	}

	public IBOCmPartnerInfoValue[] querySPartnerInfo(String partnerTypeDtl, String partnerType, String siIntroNum, int start, int end) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { String.class, String.class, String.class, int.class, int.class });
		innerMap.put("busiId", "so100037");
		innerMap.put("paraObjects", new Object[] { partnerTypeDtl, partnerType, siIntroNum, start, end });
		Object returnObj = CmBusiEntry.invokeInterfaceNew(innerMap);
		return (IBOCmPartnerInfoValue[]) returnObj;
	}

	public Map getGroupPayPlan4BBoss(String custServiceId) throws Exception {
		// TODO Auto-generated method stub
		if ("".equals(custServiceId))
			// TODO 存在问题，需要了解需求
			ExceptionUtil.throwBusinessException("1022", ""); // 文档规范1022 ： 集团编号不存在

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CustServiceId", custServiceId);
		innerMap.put("busiId", "so100038");
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public Map getGrpCountInfoByMgrId(long managerId) throws Exception {
		// TODO Auto-generated method stub
		if (managerId <= 0)
			ExceptionUtil.throwBusinessException("CMS95000075");// "客户经理编码不能为空",

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("ManagerId", managerId);
		innerMap.put("busiId", "so100039");
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public void outPutGrpCustList(long grpCustId, long opId, long orgId) throws Exception {
		if (opId < 0 || orgId < 0 || grpCustId < 0)
			ExceptionUtil.throwBusinessException("CMS1100105");
		IBOCmGroupCustomerValue grp = new BOCmGroupCustomerBean();
		grp.setCustId(grpCustId);
		grp.setOpId(opId);
		grp.setOrgId(orgId);
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("custGrp", grp);
		innerMap.put("busiId", "so100040");
		CmBusiEntry.invokeInterface(innerMap);
	}

	public IQBOCmAcctPayMentValue queryAcctAndPaymentById(long acctId) throws Exception {
		if (acctId <= 0) {
			// 账户编号不能为空！
			ExceptionUtil.throwBusinessException("CMC0010004");
		}
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { long.class, long.class });
		innerMap.put("paraObjects", new Object[] { acctId, -1 });
		innerMap.put("busiId", "ams200011");
		Object returnObj = CmBusiEntry.invokeInterfaceNew(innerMap);
		return (IQBOCmAcctPayMentValue) returnObj;
	}

	public ICustomerValue queryGroupCustomerByGroupId(long groupId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { long.class, int.class });
		innerMap.put("paraObjects", new Object[] { groupId, 3 });
		innerMap.put("busiId", "so100041");
		Object returnObj = CmBusiEntry.invokeInterfaceNew(innerMap);
		return (ICustomerValue) returnObj;
	}

	public String fireBank(String billId, long acctId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("BillId", billId);
		innerMap.put("AcctId", acctId);
		innerMap.put("OperType", "fire");
		innerMap.put("busiId", "ams200012");
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (String) returnObj;
	}

	public String signBank(String tradeSeq, String billId, String bankCode, String actionDate) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("TradeSeq", tradeSeq);
		innerMap.put("BillId", billId);
		innerMap.put("BankCode", bankCode);
		innerMap.put("ActionDate", actionDate);
		innerMap.put("OperType", "sign");
		innerMap.put("busiId", "ams200012");
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (String) returnObj;
	}

	public IContactValue queryContactByContId(long contId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { long.class });
		innerMap.put("paraObjects", new Object[] { contId });
		innerMap.put("busiId", "so100042");
		Object returnObj = CmBusiEntry.invokeInterfaceNew(innerMap);
		return (IContactValue) returnObj;
	}

	public IContactValue[] queryCustContactsByCustId(long custId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { long.class, int.class, int.class });
		innerMap.put("paraObjects", new Object[] { custId, -1, -1 });
		innerMap.put("busiId", "so100043");
		Object returnObj = CmBusiEntry.invokeInterfaceNew(innerMap);
		return (IContactValue[]) returnObj;
	}

	public Map singOrFireBank(Map paraMap) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { Map.class });
		innerMap.put("paraObjects", new Object[] { paraMap });
		innerMap.put("busiId", "ams200013");
		Object returnObj = CmBusiEntry.invokeInterfaceNew(innerMap);
		return (Map) returnObj;
	}

	public Map singOrFireMobile(Map paraMap) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { Map.class });
		innerMap.put("paraObjects", new Object[] { paraMap });
		innerMap.put("busiId", "ams200017");
		Object returnObj = CmBusiEntry.invokeInterfaceNew(innerMap);
		return (Map) returnObj;
	}

	public Map isMobilePayUser(Map paraMap) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("busiId", "ams200018");
		innerMap.putAll(paraMap);
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public Map queryDiffAreaCustInfo(Map parameter) throws Exception {

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { Map.class });
		innerMap.put("paraObjects", new Object[] { parameter });
		innerMap.put("busiId", "so100045");

		Object returnObj = CmBusiEntry.invokeInterfaceNew(innerMap);
		return (Map) returnObj;

	}

	public IClubMemberValue qryVipInfo(String billId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("BillId", billId);
		innerMap.put("busiId", "so100044");
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (IClubMemberValue) returnObj;
	}

	public List queryCmGrpContractURL(String attachId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("conTractId", attachId);
		innerMap.put("busiId", "so100008");
		innerMap.put("OperType", "qryCmGroupContractURL");
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (List) returnObj;
	}

	public IAccountProfileValue queryAcctDtsById(long acctId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { long.class, long.class, int.class, int.class });
		innerMap.put("paraObjects", new Object[] { acctId, -1, -1, -1 });
		innerMap.put("busiId", "ams200014");
		IAccountProfileValue[] accountProfileValues = (IAccountProfileValue[]) CmBusiEntry.invokeInterfaceNew(innerMap);
		if (CmCommonUtil.isEmptyObject(accountProfileValues)) {
			return null;
		}
		return accountProfileValues[0];
	}

	public Map addGrpCustomer4BBoss(Map parameter) throws Exception {
		// TODO Auto-generated method stub
		Map resultMap = new HashMap();
		resultMap.put("OprTime", CmCommonUtil.getSysDate());

		if (isEmpty(parameter.get("CustomerInfo"))) {
			resultMap.put("RspCode", "99");
			resultMap.put("RspDesc", "Customer information can not be empty");
			return resultMap;
		}

		if (!isEmpty(parameter.get("CustomerInfo"))) {

			Map customerInfo = (Map) parameter.get("CustomerInfo");
			if (isEmpty(customerInfo.get("ParentCustomerNumber"))) {
				resultMap.put("RspCode", "01");
				resultMap.put("RspDesc", "Superior customer ID error");
				return resultMap;
			}

			if (isEmpty(customerInfo.get("Action"))) {

				resultMap.put("RspCode", "02");
				resultMap.put("RspDesc", "The type of operation error");
				return resultMap;

			}

			if (isEmpty(customerInfo.get("Customer"))) {
				resultMap.put("RspCode", "99");
				resultMap.put("RspDesc", "EC information can not be empty");
				return resultMap;
			}

			if (!isEmpty(customerInfo.get("Customer"))) {

				Map customer = (Map) customerInfo.get("Customer");
				if (isEmpty(customer.get("CompanyID"))) {
					resultMap.put("RspCode", "03");
					resultMap.put("RspDesc", "Group customer ownership province code error");
					return resultMap;
				}

				if (isEmpty(customer.get("CustomerProvinceNumber"))) {
					resultMap.put("RspCode", "04");
					resultMap.put("RspDesc", "Group customer ownership province code error");
					return resultMap;
				}

				if (isEmpty(customer.get("CustomerNumber"))) {
					resultMap.put("RspCode", "72");
					resultMap.put("RspDesc", "EC group client code error");
					return resultMap;

				}

				if (isEmpty(customer.get("CustomerName"))) {
					resultMap.put("RspCode", "05");
					resultMap.put("RspDesc", "Group customer name error");
					return resultMap;

				}

				if (isEmpty(customer.get("CreditLevelID"))) {
					resultMap.put("RspCode", "99");
					resultMap.put("RspDesc", "Group customer level error");
					return resultMap;
				}

				if (isEmpty(customer.get("IndustryID"))) {
					resultMap.put("RspCode", "14");
					resultMap.put("RspDesc", "Industry classification error");
					return resultMap;
				}

				if (isEmpty(customer.get("CustomerServLevel"))) {
					resultMap.put("RspCode", "74");
					resultMap.put("RspDesc", "Customer service level error");
					return resultMap;
				}
			}

			if (!isEmpty(customerInfo.get("CustomerManager"))) {

				Map manager = (Map) customerInfo.get("CustomerManager");
				if (isEmpty(manager.get("StaffName"))) {
					resultMap.put("RspCode", "26");
					resultMap.put("RspDesc", "The name error");
					return resultMap;
				}

				if (isEmpty(manager.get("ContactPhone"))) {
					resultMap.put("RspCode", "27");
					resultMap.put("RspDesc", "Call error");
					return resultMap;
				}
			}

			if (!isEmpty(customerInfo.get("KeyPersons"))) {
				List list = new ArrayList();
				list = (List) customerInfo.get("KeyPersons");
				if (!list.isEmpty()) {
					for (int k = 0; k < list.size(); k++) {
						Map keyman = (Map) list.get(k);
						if (isEmpty(keyman.get("Role"))) {
							resultMap.put("RspCode", "33");
							resultMap.put("RspDesc", "Character error");
							return resultMap;
						}

						if (isEmpty(keyman.get("PartyName"))) {
							resultMap.put("RspCode", "34");
							resultMap.put("RspDesc", "The name error");
							return resultMap;
						}

						if (isEmpty(keyman.get("Sex"))) {
							resultMap.put("RspCode", "35");
							resultMap.put("RspDesc", "The sex error");
							return resultMap;
						}

						if (isEmpty(keyman.get("ContactPhone"))) {
							resultMap.put("RspCode", "36");
							resultMap.put("RspDesc", "Call error");
							return resultMap;
						}
					}
				}
			}

			/*
			 * if (!isEmpty(customerInfo.get("ExtInfo"))) { List extinfos = (List) customerInfo.get("ExtInfo"); for (int
			 * j = 0; j < extinfos.size(); j++) { // TODO扩展信息 Map extinfo = (Map) extinfos.get(j); if
			 * (!isEmpty(extinfo.get("CMCCPrdList"))) { List cmccs = (List) extinfo.get("CMCCPrdList"); for (int i = 0;
			 * i < cmccs.size(); i++) { // TODO中国移动信息化产品 } } } }
			 */
		}
		Map innerMap = new HashMap();
		innerMap.put("busiId", "so100046");
		innerMap.put("map", parameter);
		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Map) returnObj;
	}

	public void delVipInfo(long userId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { long.class });
		innerMap.put("paraObjects", new Object[] { userId });
		innerMap.put("busiId", "so100047");
		CmBusiEntry.invokeInterfaceNew(innerMap);
	}

	public Map queryGroupByKeyBillId(String billId, String password, int LoginFlag) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { String.class, String.class, int.class });
		innerMap.put("paraObjects", new Object[] { billId, password, LoginFlag });
		innerMap.put("busiId", "int300001");
		Object result = CmBusiEntry.invokeInterfaceNew(innerMap);
		return (Map) result;
	}

	public ICustomerValue queryGroupCustByKeyBillId(String billId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { String.class });
		innerMap.put("paraObjects", new Object[] { billId });
		innerMap.put("busiId", "so100048");
		Object result = CmBusiEntry.invokeInterfaceNew(innerMap);
		if (result == null) {
			return null;
		}
		return (ICustomerValue) result;
	}

	public Map queryManagerById(long managerId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { long.class });
		innerMap.put("paraObjects", new Object[] { managerId });
		innerMap.put("busiId", "int300002");
		Object result = CmBusiEntry.invokeInterfaceNew(innerMap);
		return (Map) result;
	}

	public IAccountProfileValue[] queryAcctDtsByCustId(long custId, String regionId, int start, int end) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { long.class, String.class, int.class, int.class });
		innerMap.put("paraObjects", new Object[] { custId, regionId, start, end });
		innerMap.put("busiId", "so100049");
		Object result = CmBusiEntry.invokeInterfaceNew(innerMap);
		if (result == null) {
			return new IAccountProfileValue[0];
		}
		return (IAccountProfileValue[]) result;
	}

	public int queryAcctDtsCountByCustId(long custId, String regionId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { long.class, String.class });
		innerMap.put("paraObjects", new Object[] { custId, regionId });
		innerMap.put("busiId", "so100050");
		Object result = CmBusiEntry.invokeInterfaceNew(innerMap);
		return Integer.parseInt(result.toString());
	}

	public void updateAcctBehalfPhone(long acctId, String acctBehalfPhone) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { long.class, String.class });
		innerMap.put("paraObjects", new Object[] { acctId, acctBehalfPhone });
		innerMap.put("busiId", "so100051");
		CmBusiEntry.invokeInterfaceNew(innerMap);
	}

	public IAccountProfileValue[] queryAcctAndPayments(String bankAccount, String regionId, long payMethod, int start, int end) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { String.class, String.class, long.class, int.class, int.class });
		innerMap.put("paraObjects", new Object[] { bankAccount, regionId, payMethod, start, end });
		innerMap.put("busiId", "ams200015");
		Object obj = CmBusiEntry.invokeInterfaceNew(innerMap);
		if (obj == null) {
			return new IAccountProfileValue[0];
		}
		return (IAccountProfileValue[]) obj;
	}

	public int queryAcctAndPaymentsCount(String bankAccount, String regionId, long payMethod) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { String.class, String.class, long.class });
		innerMap.put("paraObjects", new Object[] { bankAccount, regionId, payMethod });
		innerMap.put("busiId", "ams200016");
		Object obj = CmBusiEntry.invokeInterfaceNew(innerMap);
		if (obj == null) {
			return 0;
		}
		return Integer.parseInt(obj.toString());
	}

	public void updateCustInfo(Map paraMap) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { Map.class });
		innerMap.put("paraObjects", new Object[] { paraMap });
		innerMap.put("busiId", "int300003");
	}

	// 修改集团客户资料接口
	public Map acceptGrpMemTemp(Map parameter) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { Map.class });
		innerMap.put("paraObjects", new Object[] { parameter });
		innerMap.put("busiId", "so100061");
		return (Map) CmBusiEntry.invokeInterfaceNew(innerMap);
	}

	// 3.6.4.1 修改集团密码接口
	public Map upGrpChangePwd(Map parameter) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { Map.class });
		innerMap.put("paraObjects", new Object[] { parameter });
		innerMap.put("busiId", "so100053");
		return (Map) CmBusiEntry.invokeInterfaceNew(innerMap);
	}

	// 3.6.2.2 产品管理员增加,删除
	public Map acceptProdMemTemp(Map parameter) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { Map.class });
		innerMap.put("paraObjects", new Object[] { parameter });
		innerMap.put("busiId", "so100054");
		return (Map) CmBusiEntry.invokeInterfaceNew(innerMap);
	}

	// * @Description3.6.2.1 产品管理员查询
	public Map qryProdMgntMem(Map parameter) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { Map.class });
		innerMap.put("paraObjects", new Object[] { parameter });
		innerMap.put("busiId", "so100055");
		return (Map) CmBusiEntry.invokeInterfaceNew(innerMap);
	}

	// 修改集团客户资料接口
	public Map upGrpCustomerDetailTemp(Map parameter) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { Map.class });
		innerMap.put("paraObjects", new Object[] { parameter });
		innerMap.put("busiId", "so100052");
		return (Map) CmBusiEntry.invokeInterfaceNew(innerMap);
	}

	public Map vipUserFreeService(Map paraMap) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { Map.class });
		innerMap.put("paraObjects", new Object[] { paraMap });
		innerMap.put("busiId", "int300004");
		return (Map) CmBusiEntry.invokeInterfaceNew(innerMap);
	}

	public IContactValue qryGroupContact(Map paraMap) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { Map.class });
		innerMap.put("paraObjects", new Object[] { paraMap });
		innerMap.put("busiId", "so100056");
		IContactValue[] contactValues = (IContactValue[]) CmBusiEntry.invokeInterfaceNew(innerMap);
		if (CmCommonUtil.isEmptyObject(contactValues)) {
			return null;
		}
		return contactValues[0];

	}

	public IGroupMemberValue qryGrpMem(Map paraMap) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { Map.class });
		innerMap.put("paraObjects", new Object[] { paraMap });
		innerMap.put("busiId", "so100057");
		IGroupMemberValue[] cmGrpMembers = (IGroupMemberValue[]) CmBusiEntry.invokeInterfaceNew(innerMap);

		if (CmCommonUtil.isEmptyObject(cmGrpMembers)) {
			return null;
		}
		return cmGrpMembers[0];
	}

	public IGroupMemberValue qryGrpMem(long userId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { long.class });
		innerMap.put("paraObjects", new Object[] { userId });
		innerMap.put("busiId", "so100074");
		IGroupMemberValue[] cmGrpMembers = (IGroupMemberValue[]) CmBusiEntry.invokeInterfaceNew(innerMap);

		if (CmCommonUtil.isEmptyObject(cmGrpMembers)) {
			return null;
		}
		return cmGrpMembers[0];
	}

	public IBOLnCmGroupInfoValue qryGroupInfo(Map parameter) throws Exception {

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { Map.class });
		innerMap.put("paraObjects", new Object[] { parameter });
		innerMap.put("busiId", "so100058");
		IBOLnCmGroupInfoValue[] cmGrpInfos = (IBOLnCmGroupInfoValue[]) CmBusiEntry.invokeInterfaceNew(innerMap);

		if (CmCommonUtil.isEmptyObject(cmGrpInfos)) {
			return null;
		}
		return cmGrpInfos[0];
	}

	public Map qryGroupInfos(String billId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("billId", billId);
		innerMap.put("busiId", "so100059");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);

		return (Map) returnObj;
	}

	public Map qryUserInfo(long userId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("userId", userId);
		innerMap.put("busiId", "so100060");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);

		return (Map) returnObj;
	}

	public Boolean modGlobalClubMember(String billId, long offId, String doneCode) throws Exception {
		// TODO Auto-generated method stub
		if (offId < 0) {
			ExceptionUtil.throwBusinessException("CMS0076044");// 传入参数有误！
		}
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("BillId", billId);
		innerMap.put("DoneCode", doneCode);
		innerMap.put("OffId", offId);
		innerMap.put("Action", "global");
		innerMap.put("busiId", "so100062");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Boolean) returnObj;
	}

	public Boolean modVipClubMember(String billId, String memberLevel, String doneCode) throws Exception {
		// TODO Auto-generated method stub
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("BillId", billId);
		innerMap.put("MemberLevel", memberLevel);
		innerMap.put("DoneCode", doneCode);
		innerMap.put("Action", "vip");
		innerMap.put("busiId", "so100062");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (Boolean) returnObj;
	}

	public Map queryBankAcctsByCustId(Map paraMap) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { Map.class });
		innerMap.put("paraObjects", new Object[] { paraMap });
		innerMap.put("busiId", "int300005");
		return (Map) CmBusiEntry.invokeInterfaceNew(innerMap);
	}

	public Map qryVipMangerInfo(long userId, String billId) throws Exception {

		Map<Object, Object> innerMap = new HashMap<Object, Object>();

		innerMap.put("userId", userId);
		innerMap.put("billId", billId);
		innerMap.put("busiId", "so100063");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);

		return (Map) returnObj;
	}

	public Map queryAuditValues(Map paraMap) throws Exception {

		Map<Object, Object> innerMap = new HashMap<Object, Object>();

		innerMap.put("paraClasses", new Class[] { Map.class });
		innerMap.put("paraObjects", new Object[] { paraMap });
		innerMap.put("busiId", "so100064");
		return (Map) CmBusiEntry.invokeInterfaceNew(innerMap);
	}

	public void delCustAndAcct(long custId, long acctId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { long.class, long.class });
		innerMap.put("paraObjects", new Object[] { custId, acctId });
		innerMap.put("busiId", "so100065");
		CmBusiEntry.invokeInterfaceNew(innerMap);
	}

	public IAccountProfileValue[] queryAcctAndPayments(String bankAccount, String regionId, long payMethod, String bankCode, int start, int end) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { String.class, String.class, long.class, String.class, int.class, int.class });
		innerMap.put("paraObjects", new Object[] { bankAccount, regionId, payMethod, bankCode, start, end });
		innerMap.put("busiId", "ams200019");
		Object obj = CmBusiEntry.invokeInterfaceNew(innerMap);
		if (obj == null) {
			return new IAccountProfileValue[0];
		}
		return (IAccountProfileValue[]) obj;
	}

	public int queryAcctAndPaymentsCount(String bankAccount, String regionId, long payMethod, String bankCode) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { String.class, String.class, long.class, String.class });
		innerMap.put("paraObjects", new Object[] { bankAccount, regionId, payMethod, bankCode });
		innerMap.put("busiId", "ams200020");
		Object obj = CmBusiEntry.invokeInterfaceNew(innerMap);
		if (obj == null) {
			return 0;
		}
		return Integer.parseInt(obj.toString());
	}

	public void updateCustStatus(long custId, int newStatus, int oldStatus) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { long.class, int.class, int.class });
		innerMap.put("paraObjects", new Object[] { custId, newStatus, oldStatus });
		innerMap.put("busiId", "so100066");
		CmBusiEntry.invokeInterfaceNew(innerMap);

	}

	public Map queryAuditValuesNew(Map paraMap) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();

		innerMap.put("paraClasses", new Class[] { Map.class });
		innerMap.put("paraObjects", new Object[] { paraMap });
		innerMap.put("busiId", "so100067");
		return (Map) CmBusiEntry.invokeInterfaceNew(innerMap);
	}

	public IAcctPaymentValue qryAcctPaymentByAcctId(long acctId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("AcctId", acctId);
		innerMap.put("busiId", "ams200001");
		innerMap.put("QueryType", "4");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (IAcctPaymentValue) returnObj;
	}

	public IBOCmAgentPartnerInfoValue[] queryAgentPartnerInfo(long channelCity, long partnerId) throws Exception {
		// TODO Auto-generated method stub
		if (channelCity <= 0 || partnerId <= 0)
			ExceptionUtil.throwBusinessException("CMS95000083");

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("channelCity", channelCity);
		innerMap.put("partnerId", partnerId);
		innerMap.put("busiId", "so100068");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);
		return (IBOCmAgentPartnerInfoValue[]) returnObj;
	}

	public IBOCmAttachValue[] queryAttacthByid(long busiSheetId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		DataContainer dc = new DataContainer();
		dc.set(IBOCmAttachValue.S_BusiSheetId, Long.valueOf(busiSheetId));
		dc.set(IBOCmAttachValue.S_State, CmConstants.RecordState.USE);
		innerMap.put("paraClasses", new Class[] { DataContainer.class });
		innerMap.put("paraObjects", new Object[] { dc });
		innerMap.put("busiId", "so100069");
		IBOCmAttachValue[] result = (IBOCmAttachValue[]) CmBusiEntry.invokeInterfaceNew(innerMap);
		if (CmCommonUtil.isEmptyObject(result)) {
			return new IBOCmAttachValue[0];
		}
		return result;
	}

	public Map queryGMBorContact(long custId, String billId) throws Exception {
		if (custId <= 0)
			ExceptionUtil.throwBusinessException("CMS95000089");// "客户编号不能为空",
		if (StringUtils.isBlank(billId)) {
			ExceptionUtil.throwBusinessException("CMS0000214");// "服务号码不能为空",
		}
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { long.class, String.class });
		innerMap.put("paraObjects", new Object[] { custId, billId });
		innerMap.put("busiId", "so100070");
		return (Map) CmBusiEntry.invokeInterfaceNew(innerMap);
	}

	public int queryGroupMemberByCustId(long custId, String action) throws Exception {
		// TODO Auto-generated method stub
		if (custId <= 0)
			ExceptionUtil.throwBusinessException("CMS95000089");// "客户编号不能为空",

		if ("".equals(action) || action == null)
			ExceptionUtil.throwBusinessException("CMS0076044");// 传入参数有误！

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("CustId", custId);
		innerMap.put("Action", action);
		innerMap.put("busiId", "so100071");
		Object obj = CmBusiEntry.invokeInterface(innerMap);
		if (obj == null) {
			return 0;
		}
		return Integer.valueOf(obj.toString());
	}

	public Map queryCustUnionInfo(long custId, long userId, long acctId) throws Exception {

		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("custId", custId);
		innerMap.put("userId", userId);
		innerMap.put("acctId", acctId);
		innerMap.put("busiId", "so100072");

		Object returnObj = CmBusiEntry.invokeInterface(innerMap);

		return (Map) returnObj;
	}

	public IBOLnCmUserManagerValue[] queryCmUserManagerByUserId(long userId) throws Exception {
		if (userId < 0)
			ExceptionUtil.throwBusinessException("CMS95000091");
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { long.class });
		innerMap.put("paraObjects", new Object[] { userId });
		innerMap.put("busiId", "so100073");
		Object returnObj = CmBusiEntry.invokeInterfaceNew(innerMap);
		return (IBOLnCmUserManagerValue[]) returnObj;
	}

	public IQBOSecCustManagerValue[] qryGroupMangerInfoByBillId(String billId) throws Exception {
		if (CmCommonUtil.isEmptyObj(billId)) {
			throw new Exception("Mobile phone number can not be empty!");
		}
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { String.class });
		innerMap.put("paraObjects", new Object[] { billId });
		innerMap.put("busiId", "so100075");
		Object returnObj = CmBusiEntry.invokeInterfaceNew(innerMap);
		return (IQBOSecCustManagerValue[]) returnObj;
	}

	public void synCustInfo(long phoneNum, long oldCustId, long newCustId) throws Exception {
		Map<Object, Object> innerMap = new HashMap<Object, Object>();
		innerMap.put("paraClasses", new Class[] { long.class, long.class, long.class });
		innerMap.put("paraObjects", new Object[] { phoneNum, oldCustId, newCustId });
		innerMap.put("busiId", "int300006");
		CmBusiEntry.invokeInterfaceNew(innerMap);

	}

	public IBOLnCmInsCmRelValue[] queryCmInsCmRelValues(long custId, long userId, int start, int end) throws Exception {
		ICmLnCommonServiceSV commonServiceSV = (ICmLnCommonServiceSV) ServiceFactory.getService(ICmLnCommonServiceSV.class);
		return commonServiceSV.queryCmInsCmRelValues(custId, userId, start, end);
	}

	public int queryCmInsCmRelValuesCount(long custId, long userId) throws Exception {
		ICmLnCommonServiceSV commonServiceSV = (ICmLnCommonServiceSV) ServiceFactory.getService(ICmLnCommonServiceSV.class);
		return commonServiceSV.queryCmInsCmRelValuesCount(custId, userId);
	}

	public ICustomerValue[] queryCustomerByCdns(String billId, String customerName, int custType, long custId, int status, String certCode, int startIndex, int endIndex)
			throws Exception {
		if (StringUtils.isBlank(billId) && StringUtils.isBlank(customerName) && custId <= 0 && status <= 0 && StringUtils.isBlank(certCode)) {
			ExceptionUtil.throwBusinessException("CMS5000085");
		}
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		DataContainer dc = new DataContainer();
		if (StringUtils.isNotBlank(billId)) {
			dc.set(ISoUserValue.S_BillId, billId);
		}
		if (StringUtils.isNotBlank(customerName)) {
			dc.set(ICustomerValue.S_CustName, customerName);
		}
		if (custType > 0) {
			dc.set(ICustomerValue.S_CustType, custType);
		}
		if (custId > 0) {
			dc.set(ICustomerValue.S_CustId, custId);
		}
		if (status >= 0) {
			dc.set(ICustomerValue.S_CustStatus, status);
		}
		if (StringUtils.isNotBlank(certCode)) {
			dc.set(ICustomerValue.S_CustCertCode, certCode);
		}
		if (CmConstants.CustomerType.INDIVIDUAL == custType) {
			dc.set("INDIV_CUST_TYPE", CmConstants.EntityType.CUSTOMER);
		}
		ICustomerValue[] custValues = customerSV.queryCustomers(dc, startIndex, endIndex);
		if (CmCommonUtil.isNotEmptyObject(custValues)) {
			for (int i = 0; i < custValues.length; i++) {
				if (null != custValues[i].getFirstName() && "$$$$".equals(custValues[i].getFirstName())) {
					custValues[i].setCustName(custValues[i].getLastName());
				}
			}
		}
		return custValues;
	}

	public int queryCustomerByCdnsCount(String billId, String customerName, int custType, long custId, int status, String certCode) throws Exception {
		if (StringUtils.isBlank(billId) && StringUtils.isBlank(customerName) && custId <= 0 && status <= 0 && StringUtils.isBlank(certCode)) {
			ExceptionUtil.throwBusinessException("CMS5000085");
		}
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		DataContainer dc = new DataContainer();
		if (StringUtils.isNotBlank(billId)) {
			dc.set(ISoUserValue.S_BillId, billId);
		}
		if (StringUtils.isNotBlank(customerName)) {
			dc.set(ICustomerValue.S_CustName, customerName);
		}
		if (custType > 0) {
			dc.set(ICustomerValue.S_CustType, custType);
		}
		if (custId > 0) {
			dc.set(ICustomerValue.S_CustId, custId);
		}
		if (status >= 0) {
			dc.set(ICustomerValue.S_CustStatus, status);
		}
		if (StringUtils.isNotBlank(certCode)) {
			dc.set(ICustomerValue.S_CustCertCode, certCode);
		}
		if (CmConstants.CustomerType.INDIVIDUAL == custType) {
			dc.set("INDIV_CUST_TYPE", CmConstants.EntityType.CUSTOMER);
		}
		// 只能查客户
		return customerSV.queryCustomerCount(dc);
	}

	public IVOCustValue queryIndivCustAndContact(long custId) throws Exception {
		if (custId <= 0) {
			return null;
		}
		// 查询客户信息
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue customerValue = customerSV.queryCustomerMaskByCustId(custId);
		if (customerValue == null) {
			return null;
		}
		IVOCustValue voCustValue = new VOCustBean();
		voCustValue.setCustomer(customerValue);
		// 查询客户主要联系人信息
		ICmContactSV contactSV = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
		DataContainer contactDc = new DataContainer();
		contactDc.set(ICustomerValue.S_CustId, custId);
		contactDc.set(IContactValue.S_PrioryLevel, CmConstants.CONT_LEVEL.CONT_LEVEL_1);// 主要联系人
		IContactValue[] contactValues = contactSV.queryCustContacts(contactDc, -1, -1);
		if (contactValues != null && contactValues.length > 0) {
			voCustValue.addContact(contactValues[0]);
		}
		return voCustValue;
	}

	public ICustomerValue[] queryCustomerByCdns(long custId, int custType, int certType, String certCode, String custName, int start, int end) throws Exception {
		if (custId <= 0 && custType <= 0) {
			// 客户编号和客户类型不能同时为空！
			ExceptionUtil.throwBusinessException("CMS0000122");
		}
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		DataContainer conditionDC = new DataContainer();
		if (custId > 0) {
			conditionDC.set(ICustomerValue.S_CustId, Long.valueOf(custId));
		}
		if (custType > 0) {
			conditionDC.set(ICustomerValue.S_CustType, Integer.valueOf(custType));
		}
		if (certType > 0 && StringUtils.isNotBlank(certCode)) {
			if (custType <= 0) {
				custType = CmCommonUtil.getCustType(custId);
			}
			// 客户证件类型必须为当前系统定义的证件类型
			if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.CUST_CERT_TYPE + "_" + String.valueOf(custType), String.valueOf(certType)) == null) {
				// 参数错误，当前系统不存在类型为{0}的证件类型定义！
				ExceptionUtil.throwBusinessException("CMS0030041", String.valueOf(certType));
			}
			conditionDC.set(ICustomerValue.S_CustCertType, Integer.valueOf(certType));
			conditionDC.set(ICustomerValue.S_CustCertCode, certCode);
		}
		if (StringUtils.isNotBlank(custName)) {
			conditionDC.set(ICustomerValue.S_CustName, custName);
		}
		ICustomerValue[] customers = customerSV.queryCustomers(conditionDC, start, end);
		if (customers == null || customers.length == 0) {
			return new ICustomerValue[0];
		}
		return customers;
	}

	public int queryCustomerCountByCdns(long custId, int custType, int certType, String certCode, String custName) throws Exception {
		if (custId <= 0 && custType <= 0) {
			// 客户编号和客户类型不能同时为空！
			ExceptionUtil.throwBusinessException("CMS0000122");
		}
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		DataContainer conditionDC = new DataContainer();
		if (custId > 0) {
			conditionDC.set(ICustomerValue.S_CustId, Long.valueOf(custId));
		}
		if (custType > 0) {
			conditionDC.set(ICustomerValue.S_CustType, Integer.valueOf(custType));
		}
		if (certType > 0 && StringUtils.isNotBlank(certCode)) {
			conditionDC.set(ICustomerValue.S_CustCertType, Integer.valueOf(certType));
			conditionDC.set(ICustomerValue.S_CustCertCode, certCode);
		}
		if (StringUtils.isNotBlank(custName)) {
			conditionDC.set(ICustomerValue.S_CustName, custName);
		}
		return customerSV.queryCustomerCount(conditionDC);
	}

	public long saveCustomer(ICustomerValue customerValue) throws Exception {
		if (customerValue == null) {
			return 0;
		}
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		return customerSV.saveCustomer(customerValue);
	}

	public IAccountProfileValue[] queryAcctsByCustId(long custId, int start, int end) throws Exception {
		ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IAccountProfileValue[] accountValues = accountSV.queryAcctDtsById(-1, custId, start, end);
		return accountValues;
	}

	public int queryAcctsCountByCustId(long custId) throws Exception {
		ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		return accountSV.queryAcctDtsCountById(-1, custId);
	}

	public long saveAccount(IAccountValue accountValue, boolean isDelete) throws Exception {
		ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IVOAccountValue voAcctValue = new VOAccountBean();
		if (isDelete) {
			long acctId = accountValue.getAcctId();
			accountSV.delAcctInfo(acctId);
			return acctId;
		}
		voAcctValue.setAccount(accountValue);
		return accountSV.saveAccount(voAcctValue);
	}

	public IAcctBillCustomizeValue queryAcctCustomize(long acctId) throws Exception {
		ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		return accountSV.queryBillCustomizeByAcctId(acctId);
	}

	public boolean checkCustCertInfo(String billId, int certType, String certCode) throws Exception {
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		DataContainer conditionDC = new DataContainer();
		conditionDC.set(ISoUserValue.S_BillId, billId);
		ICustomerValue[] customerValues = customerSV.queryCustomers(conditionDC, -1, -1);
		if (customerValues != null && customerValues.length > 0) {
			int custCertType = customerValues[0].getCustCertType();
			String custCertCode = customerValues[0].getCustCertCode();
			if (custCertType == certType && custCertCode.equalsIgnoreCase(certCode)) {
				return true;
			}
		}
		return false;
	}

	public IAccountValue[] queryAcctsById(long custId, int startIndex, int endIndex) throws Exception {
		ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		return accountSV.queryAcctsById(-1, custId, startIndex, endIndex);
	}

	public int queryAcctsCountById(long custId) throws Exception {
		ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		return accountSV.queryAcctsCountById(-1, custId);
	}

	public ICustOrganizeValue[] queryCustOrganizesById(long groupCustId, long parentDeptId, int start, int end) throws Exception {
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		DataContainer dc = new DataContainer();
		dc.set(ICustOrganizeValue.S_CustId, Long.valueOf(groupCustId));
		dc.set(ICustOrganizeValue.S_ParentDeptId, Long.valueOf(parentDeptId));
		return customerSV.queryCustOrganizes(dc, start, end);
	}

	public int queryCustOrganizesCountById(long groupCustId, long parentDeptId) throws Exception {
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		DataContainer dc = new DataContainer();
		dc.set(ICustOrganizeValue.S_CustId, Long.valueOf(groupCustId));
		dc.set(ICustOrganizeValue.S_ParentDeptId, Long.valueOf(parentDeptId));
		return customerSV.queryCustOrganizeCount(dc);
	}

	public ICustOrganizeValue queryCustOrganizeById(long deptId) throws Exception {
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		return customerSV.queryCustOrganizeById(deptId);
	}

	public long saveCustOrganize(ICustOrganizeValue custOrganizeValue, boolean isDelete) throws Exception {
		IVOCustValue custValue = new VOCustBean();
		long id = custOrganizeValue.getDeptId();
		if (isDelete) {
			custOrganizeValue.delete();
		} else if (id > 0) {
			// custOrganizeValue.setStsToOld();
		} else {
			custOrganizeValue.setStsToNew();
		}
		custValue.addCustOrganize(custOrganizeValue);
		CmServiceFactory.getCustomerSV().saveCustomer(custValue);
		id = custOrganizeValue.getDeptId();
		return id;
	}

	public IGroupMemberValue[] queryGroupMembers(long deptId, String memberName, String billId, int start, int end) throws Exception {
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		DataContainer condition = new DataContainer();
		condition.set(IGroupMemberValue.S_DeptId, Long.valueOf(deptId));
		condition.set(IGroupMemberValue.S_MemberName, memberName);
		condition.set(IGroupMemberValue.S_BillId, billId);
		IGroupMemberValue[] groupMemberValues = customerSV.queryGroupMembers(condition, start, end);
		if (groupMemberValues == null || groupMemberValues.length < 1) {
			return new IGroupMemberValue[0];
		}
		return groupMemberValues;
	}

	public int queryGroupMembersCount(long deptId, String memberName, String billId) throws Exception {
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		DataContainer condition = new DataContainer();
		condition.set(IGroupMemberValue.S_DeptId, Long.valueOf(deptId));
		condition.set(IGroupMemberValue.S_MemberName, memberName);
		condition.set(IGroupMemberValue.S_BillId, billId);
		return customerSV.queryGroupMembersCount(condition);
	}

	public void saveGroupMember(IBOCmGroupMemberValue[] groupMemberValues, int operType) throws Exception {
		ICmGroupCustomerSV groupCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		groupCustomerSV.saveGroupMember(groupMemberValues, operType);
	}

	public IGroupMemberValue[] queryGroupMembersByCustId(long groupCustId, String memberName, String billId, int start, int end) throws Exception {

		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		DataContainer condition = new DataContainer();
		condition.set(IGroupMemberValue.S_CustId, Long.valueOf(groupCustId));
		condition.set(IGroupMemberValue.S_MemberName, memberName);
		condition.set(IGroupMemberValue.S_BillId, billId);
		IGroupMemberValue[] groupMemberValues = customerSV.queryGroupMembers(condition, start, end);
		if (groupMemberValues == null || groupMemberValues.length < 1) {
			return new IGroupMemberValue[0];
		}
		return groupMemberValues;
	}

	public int queryGroupMembersCountByCustId(long groupCustId, String memberName, String billId) throws Exception {
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		DataContainer condition = new DataContainer();
		condition.set(IGroupMemberValue.S_CustId, groupCustId);
		condition.set(IGroupMemberValue.S_MemberName, memberName);
		condition.set(IGroupMemberValue.S_BillId, billId);
		return customerSV.queryGroupMembersCount(condition);
	}

	public DataContainer[] query360AcctsByCustId(long custId, int start, int end) throws Exception, RemoteException {
		ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IAccountProfileValue[] accountValues = accountSV.queryAcctDtsById(-1, custId, start, end);

		if (accountValues == null || accountValues.length == 0) {
			return new DataContainer[0];
		}
		IBOBsStaticDataValue[] pays = StaticDataUtil.getStaticData("CM_ACCOUNT_TYPE");// 付费类型
		DataContainer[] dcs = new DataContainer[accountValues.length];

		for (int i = 0, j = accountValues.length; i < j; i++) {
//			if (StringUtils.isNotBlank(accountValues[i].getPaymentBankCode())) {
//				IBOBsBankValue bankValue = BankUtil.getBankByBankCode(accountValues[i].getPaymentBankCode());
//				if (bankValue != null)
//					accountValues[i].set("PAYMENT_BANK_NAME", CrmLocaleFactory.getResource(bankValue.getBankName()));
//			}
			DataContainer dc = new DataContainer();
			dc.copy(accountValues[i]);
			int acct_type = accountValues[i].getAcctType();
			if (pays != null && pays.length > 0) {
				for (int x = 0; x < pays.length; x++) {
					if (StringUtils.isNotBlank(pays[x].getCodeValue()) && pays[x].getCodeValue().equals(acct_type + "")) {
						dc.set("ACCT_TYPE", pays[x].getCodeName());
						break;
					}
				}
			}

			String edit = CrmLocaleFactory.getResource("SOS8802050");
			// String delete = CrmLocaleFactory.getResource("OFS2000254");
			String operation = CrmLocaleFactory.getResource("OFS2000243");

			String[] icons = new String[3];
			icons[0] = "<a href='javascript:void(0)' class='cellpath' onclick='modifyAccount(\"" + String.valueOf(accountValues[i].getAcctId())
					+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + edit + "</a>";
			// icons[1] = "<a href='javascript:void(0)' class='cellpath' onclick='deleteAccount(\"" +
			// String.valueOf(accountValues[i].getAcctId())
			// + "\")' style='color:blue;margin-left:5px;text-decoration:underline'>"+delete+"</a>";
			icons[1] = "<a href='javascript:void(0)' class='cellpath' onclick='showAccount(\"" + String.valueOf(accountValues[i].getAcctId())
					+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + operation + "</a>";
			dc.set("ACTION", icons[0] + icons[1]);
			dcs[i] = dc;
		}

		return dcs;
	}

	public IGroupMemberValue[] queryGroupMembers(DataContainer condition, int startNum, int endNum) throws Exception {
		return CmServiceFactory.getCustomerSV().queryGroupMembers(condition, startNum, endNum);
	}

	public int queryGroupMembersCount(DataContainer condition) throws Exception {
		return CmServiceFactory.getCustomerSV().queryGroupMembersCount(condition);
	}

	public void save360Account(DataContainerInterface accountProfileValue) throws Exception, RemoteException {
		IVOAccountValue voAccountValue = new VOAccountBean();

		IAccountValue accountValue = new AccountBean();
		accountValue.copy(accountProfileValue);
		voAccountValue.setAccount(accountValue);

		IAcctPaymentValue acctPaymentValue = new AcctPaymentBean();
		acctPaymentValue.copy(accountProfileValue);
		voAccountValue.addPayment(acctPaymentValue);

		// 设置账户状态
		voAccountValue.setUserObject("OPER_TYPE", CmConstants.MODIFY_ACCT_MODEL.ACCT_OPER_TYPE_NEW);
		voAccountValue.setUserObject(CmConstants.MODIFY_ACCT_MODEL.MODIFY_ACCT_KEY, CmConstants.MODIFY_ACCT_MODEL.INNER_MODIFY);

		CmServiceFactory.getAccountSV().saveAccount(voAccountValue);
		ICmAccountBceDealSV cmAccountBceDealSV = (ICmAccountBceDealSV) ServiceFactory.getService(ICmAccountBceDealSV.class);
		cmAccountBceDealSV.dealBankBehalfPhone(voAccountValue.getPayments());
	}

	public ICustOrganizeValue[] queryGroupOrganizesById(long groupCustId, long parentDeptId, int start, int end) throws Exception {
		ICmGroupCustomerSV groupCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		ICustOrganizeValue[] organizeValues = groupCustomerSV.queryGroupOrganizesById(groupCustId, parentDeptId, start, end);
		return organizeValues;
	}

	public ICustOrganizeValue[] queryGroupTopOrganize(long groupCustId) throws Exception {
		ICmGroupCustomerSV groupCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		return groupCustomerSV.queryGroupTopOrganize(groupCustId);
	}

	public long saveGroupMember(IGroupMemberValue groupMemberValue) throws Exception {
		if (groupMemberValue == null) {
			ExceptionUtil.throwBusinessException("CMS0403001", "groupMemberValue");
		}
		// deptId is null,will set default root deptId
		long deptId = groupMemberValue.getDeptId();
		if (deptId <= 0) {
			ICustOrganizeValue[] custOrganizeValues = CmServiceFactory.getCustomerSV().queryCustOrganizesByParentId(groupMemberValue.getCustId(), -1, -1);
			if (custOrganizeValues != null && custOrganizeValues.length > 0) {
				groupMemberValue.setDeptId(custOrganizeValues[0].getDeptId());
			}
		} else {
			ICustOrganizeValue organizeValue = queryGroupOrganizeByDeptId(deptId);
			if (organizeValue != null) {
				if (groupMemberValue.getCustId() != organizeValue.getCustId()) {
					// 成员归属的部门与归属集团不匹配！
					ExceptionUtil.throwBusinessException("CMS0000142");
				}
			} else {
				// 根据部门编号没有查询到部门信息！
				ExceptionUtil.throwBusinessException("CMS0000143");
			}
		}
		DataContainer contain = new DataContainer();
		contain.set(IGroupMemberValue.S_CustRelId, groupMemberValue.getCustRelId());
		IGroupMemberValue[] value = CmServiceFactory.getCustomerSV().queryGroupMembers(contain, -1, -1);
		if (value == null || value.length == 0) {
			DataContainer container = new DataContainer();
			container.set(IGroupMemberValue.S_MemberCustId, groupMemberValue.getMemberCustId());
			container.set(IGroupMemberValue.S_DeptId, groupMemberValue.getDeptId());
			IGroupMemberValue[] values = CmServiceFactory.getCustomerSV().queryGroupMembers(container, -1, -1);
			if (values != null && values.length > 0) {
				// 同一部门下，同一成员不可以重复新增！
				ExceptionUtil.throwBusinessException("CMS0090230");
			}
		}
		return CmServiceFactory.getCustomerSV().saveGroupMember(groupMemberValue);
	}

	public long saveGroupOrganize(ICustOrganizeValue groupOrgStructValue, int operType) throws Exception {
		ICmGroupCustomerSV groupCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		return groupCustomerSV.saveGroupOrganize(groupOrgStructValue, operType);
	}

	public ICustOrganizeValue queryGroupOrganizeByDeptId(long deptId) throws Exception {
		ICmGroupCustomerSV groupCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		ICustOrganizeValue organizeValue = groupCustomerSV.queryGroupOrganizeByDeptId(deptId);
		return organizeValue;
	}

	public IBOCmCustSegmentRelaValue querySegmentRelaByCustId(long custId) throws Exception {
		IBOCmCustSegmentRelaValue segmentRela = ((ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class)).querySegmentRelaByCustId(custId);
		if (segmentRela != null) {
			IBoCmCustSegmentValue segment = ((ICmCustSegmentSV) ServiceFactory.getService(ICmCustSegmentSV.class)).querySegmentByIdfromCache(segmentRela.getSegmentId());
			segmentRela.setRemarks(segment.getSegmentName());
		}
		return segmentRela;
	}

	public Map getKobData(Map mInput) throws Exception {
		Map resultMap = new HashMap();
		Map GetKobDataResponse = new HashMap();
		Map GetKobDataResult = new HashMap();
		Map AccountDTO = new HashMap();
		Map CompanyFinancialInfoDTO = new HashMap();
		Map ReturnStatusDTO = new HashMap();
		Map paramMap = (Map) mInput.get("GetKobData");
		if (paramMap != null) {
			String cvrNumber = DataType.getAsString(paramMap.get("Cvr"));
			String kobNumber = DataType.getAsString(paramMap.get("Kob"));
			IVOCustValue custValue = null;
			ICustomerValue customerValue = null;
			ICmGroupCustomerSV groupCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
			ICmLnGroupSV cmxSv = (ICmLnGroupSV) ServiceFactory.getService(ICmLnGroupSV.class);
			// 只有cvrNumber时，只根据cvrNumber查询
			if (StringUtils.isNotBlank(cvrNumber) && StringUtils.isBlank(kobNumber)) {
				custValue = groupCustomerSV.queryCustValueByCVR(cvrNumber);
				customerValue = custValue.getCustomer();
				DataContainer[] industrys = null;
				// 查询会计信息
				if (customerValue != null) {
					IBoCmGroupAccountingValue custAcctingValue = cmxSv.queryGroupAccountingById(customerValue.getCustId());
					custValue.setUserObject("cmAcctingData", custAcctingValue);
					IKOBFileImportSV service = (IKOBFileImportSV) ServiceFactory.getService(IKOBFileImportSV.class);
					industrys = service.queryIndustrys(ResUserInfo.getTenantId(), customerValue.getCustId());
				}
				List industryValue = new ArrayList();
				if (null != industrys && CmCommonUtil.isNotEmptyObject(industrys)) {
					for (int j = 0; j < industrys.length; j++) {
						long relId = industrys[j].getAsLong("REL_ID");
						StringBuilder condition = new StringBuilder();
						HashMap paraMap = new HashMap();
						condition.append(IBOCmGroupRelIndustryValue.S_RelId).append(" = :relId ");
						paraMap.put("relId", relId);
						DataContainerInterface[] dcs = CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupRelIndustryBean.class, condition.toString(), paraMap, -1, -1);
						BOCmGroupRelIndustryBean industryBean = new BOCmGroupRelIndustryBean();
						industryBean.copy(dcs[0]);
						industryValue.add(industryBean);
					}
				}
				custValue.setUserObject("cmIndustryData", industryValue.toArray(new BOCmGroupRelIndustryBean[0]));
			} else if (StringUtils.isNotBlank(kobNumber)) {// 只要有kobNumber时，只根据kobNumber查询
				customerValue = groupCustomerSV.queryCustomerByKobNumber(kobNumber);
			}
			// 设置custValue对象
			if (customerValue != null && CmCommonUtil.isNotEmptyObject(customerValue)) {
				custValue = new VOCustBean();
				custValue.setCustomer(customerValue);
				IBOLnCmxGroupCustValue cmxValue = cmxSv.queryGroupCustExtById(customerValue.getCustId());
				custValue.setUserObject("cmxGrpCust", cmxValue);// 设置集团扩展信息
				// 查询会计信息
				IBoCmGroupAccountingValue custAcctingValue = cmxSv.queryGroupAccountingById(customerValue.getCustId());
				custValue.setUserObject("cmAcctingData", custAcctingValue);
				// 行业信息
				IKOBFileImportSV service = (IKOBFileImportSV) ServiceFactory.getService(IKOBFileImportSV.class);
				DataContainer[] industrys = service.queryIndustrys(ResUserInfo.getTenantId(), customerValue.getCustId());
				List industryValue = new ArrayList();
				if (CmCommonUtil.isNotEmptyObject(industrys)) {
					for (int j = 0; j < industrys.length; j++) {
						long relId = industrys[j].getAsLong("REL_ID");
						StringBuilder condition = new StringBuilder();
						HashMap paraMap = new HashMap();
						condition.append(IBOCmGroupRelIndustryValue.S_RelId).append(" = :relId ");
						paraMap.put("relId", relId);
						DataContainerInterface[] dcs = CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupRelIndustryBean.class, condition.toString(), paraMap, -1, -1);
						BOCmGroupRelIndustryBean industryBean = new BOCmGroupRelIndustryBean();
						industryBean.copy(dcs[0]);
						industryValue.add(industryBean);
					}
				}
				custValue.setUserObject("cmIndustryData", industryValue.toArray(new BOCmGroupRelIndustryBean[0]));
			}
			if (custValue != null) {
				resultCustMap(custValue, AccountDTO, CompanyFinancialInfoDTO, ReturnStatusDTO);
				// //TransactionId
				// ReturnStatusDTO.put("TransactionId", "0");
				// //ErrorLevel 0 = Info
				// ReturnStatusDTO.put("ErrorLevel", "0");
				// //StackTrace
				// ReturnStatusDTO.put("StackTrace", "Success");
				// //StatusCode 0 = OK
				// ReturnStatusDTO.put("StatusCode", "0");
			} else {
				throw new Exception("CMS1100082");// 客户信息不存在!
			}
			GetKobDataResult.put("AccountDTO", AccountDTO);
			GetKobDataResult.put("CompanyFinancialInfoDTO", CompanyFinancialInfoDTO);
			GetKobDataResult.put("ReturnStatusDTO", ReturnStatusDTO);
			GetKobDataResponse.put("GetKobDataResult", GetKobDataResult);
			resultMap.put("GetKobDataResponse", GetKobDataResponse);
		} else {
			throw new Exception("CMS1100082");// 客户信息不存在!
		}

		return resultMap;
	}

	/**
	 * 封装Map
	 * @param custValue
	 * @return
	 * @throws Exception
	 */
	public void resultCustMap(IVOCustValue custValue, Map AccountDTO, Map CompanyFinancialInfoDTO, Map ReturnStatusDTO) throws Exception {
		if (custValue != null) {
			// 集团主信息
			ICustomerValue customerValue = custValue.getCustomer();
			// 集团扩展信息
			IBOLnCmxGroupCustValue cmxValue = (IBOLnCmxGroupCustValue) custValue.getUserObject("cmxGrpCust");
			// 集团会计信息
			IBoCmGroupAccountingValue custAcctingValue = (IBoCmGroupAccountingValue) custValue.getUserObject("cmAcctingData");
			// 行业信息
			IBOCmGroupRelIndustryValue[] industryValues = (IBOCmGroupRelIndustryValue[]) custValue.getUserObject("cmIndustryData");
			// 集团主信息
			if (CmCommonUtil.isNotEmptyObject(customerValue)) {
				// companyName
				AccountDTO.put("CompanyName", customerValue.getCustName());
				// kob
				AccountDTO.put("Kob", customerValue.getCustCertCode());
				// noCreditUpdate---允许被修改，设为Y，否则设为N
				if (customerValue.getIsRevisable() > 0) {
					AccountDTO.put("NoCreditUpdate", "Y");
				} else {
					AccountDTO.put("NoCreditUpdate", "N");
				}
				// kobAnsatteCode----STAFF_AMOUNT_TYPE
				AccountDTO.put("KobAnsatteCode", customerValue.getStaffAmountType());
				// currentNoOfEmployees----STAFF_AMOUNT
				CompanyFinancialInfoDTO.put("CurrentNoOfEmployees", customerValue.getStaffAmount());
				// foundedYear----Established
				CompanyFinancialInfoDTO.put("FoundedYear", customerValue.getEstablished());
				// isAddressUnknown----Unknown address
				CompanyFinancialInfoDTO.put("IsAddressUnknown", cmxValue.getExt4());
				// shareCapital---注册资金
				if (customerValue.getRegAmount() > 0) {
					CompanyFinancialInfoDTO.put("ShareCapital", customerValue.getRegAmount());
				}

			}
			// 集团扩展信息
			if (CmCommonUtil.isNotEmptyObject(cmxValue)) {
				// cvr
				AccountDTO.put("Cvr", cmxValue.getTaxId());
				// kobJurdiskCode --- Legal from
				AccountDTO.put("KobJurdiskCode", cmxValue.getLegalForm());
			}
			// 集团会计信息
			if (CmCommonUtil.isNotEmptyObject(custAcctingValue)) {
				// noOfEmployees
				CompanyFinancialInfoDTO.put("NoOfEmployees", custAcctingValue.getEmployees());
				// isListedStockExchange----上市证券交易所
				CompanyFinancialInfoDTO.put("IsListedStockExchange", custAcctingValue.getListedOnStockExchange());
				// fiscalYear----财政年份
				CompanyFinancialInfoDTO.put("FiscalYear", custAcctingValue.getFiscalYear());
				// netTurnover---收入
				CompanyFinancialInfoDTO.put("NetTurnover", custAcctingValue.getRevenue());
				// grossProfit---毛利
				CompanyFinancialInfoDTO.put("GrossProfit", custAcctingValue.getGrossProfit());
				// operatingProfit---营业利润
				CompanyFinancialInfoDTO.put("OperatingProfit", custAcctingValue.getEarnings());
				// netProfit---每年净利润
				CompanyFinancialInfoDTO.put("NetProfit", custAcctingValue.getNetProfitYearly());
				// balanceStatus---平衡状况Status balance
				CompanyFinancialInfoDTO.put("BalanceStatus", custAcctingValue.getStatusBalance());
				// nonCurrentAssets----固定资产Fixed assets
				CompanyFinancialInfoDTO.put("NonCurrentAssets", custAcctingValue.getFixedSsets());
				// currentAssets----流动资产Current Assets
				CompanyFinancialInfoDTO.put("CurrentAssets", custAcctingValue.getCurrentAssets());
				// properties----土地及建筑物Land andbuildings
				CompanyFinancialInfoDTO.put("Properties", custAcctingValue.getLandAndBuildings());
				// shareCapital---股票
				if (StringUtils.isNotBlank(custAcctingValue.getEquity())) {
					CompanyFinancialInfoDTO.put("ShareCapital", custAcctingValue.getEquity());
				}
				// provisions----规定PROVISIONS
				CompanyFinancialInfoDTO.put("Provisions", custAcctingValue.getProvisions());
				// contributedCapital----Subordinary loan capital
				CompanyFinancialInfoDTO.put("ContributedCapital", custAcctingValue.getSubordinaryLoanCapital());
				// longTermDebt
				CompanyFinancialInfoDTO.put("LongTermDebt", custAcctingValue.getLongTermDebt());
				// shortTermDebt
				CompanyFinancialInfoDTO.put("ShortTermDebt", custAcctingValue.getShortTermDebt());
				// mortgageDebt
				CompanyFinancialInfoDTO.put("MortgageDebt", custAcctingValue.getMortgages());
				// contributionRatio
				CompanyFinancialInfoDTO.put("ContributionRatio", custAcctingValue.getCoverage());
				// profitMargin
				CompanyFinancialInfoDTO.put("ProfitMargin", custAcctingValue.getOperatingMargin());
				// returnOnCapitalEmployed
				CompanyFinancialInfoDTO.put("ReturnOnCapitalEmployed", custAcctingValue.getReturnOnAssets());
				// acidTestRatio1
				CompanyFinancialInfoDTO.put("AcidTestRatio1", custAcctingValue.getDegreeOfLiquidityi());
				// acidTestRatio2
				CompanyFinancialInfoDTO.put("AcidTestRatio2", custAcctingValue.getDegreeOfLiquidity2());
				// solvencyRatio
				CompanyFinancialInfoDTO.put("SolvencyRatio", custAcctingValue.getSolvencyAtio());
				String accountRemark = custAcctingValue.getAccountRemark();
				if (StringUtils.isNotBlank(accountRemark)) {
					String[] remarks = accountRemark.split("\\|", -1);
					for (int i = 1, len = remarks.length; i <= len; i++) {
						CompanyFinancialInfoDTO.put("AccountingNote" + i, remarks[i - 1]);
					}
				}
				// amortisations
				CompanyFinancialInfoDTO.put("Amortisations", custAcctingValue.getDepreciation());
				// netFinancials
				CompanyFinancialInfoDTO.put("NetFinancials", custAcctingValue.getFinanceItems());
				// profitFromOrdinaryOperation
				CompanyFinancialInfoDTO.put("ProfitFromOrdinaryOperation", custAcctingValue.getOperatingProfit());
				// extraordinaryItems
				CompanyFinancialInfoDTO.put("ExtraordinaryItems", custAcctingValue.getExtraordinaryItems());
				// preTaxProfit
				CompanyFinancialInfoDTO.put("PreTaxProfit", custAcctingValue.getProfitBeforeTax());
				// cashAndCashEquivalents
				CompanyFinancialInfoDTO.put("cashAndCashEquivalents", custAcctingValue.getCash());
				// tradeAccountPayable
				CompanyFinancialInfoDTO.put("TradeAccountPayable", custAcctingValue.getTradeCreditors());
				// financialIncome
				CompanyFinancialInfoDTO.put("FinancialIncome", custAcctingValue.getFinancialRevenue());
				// financialExpenses
				CompanyFinancialInfoDTO.put("FinancialExpenses", custAcctingValue.getFinancialExpenditure());
				// intangibleAssets
				CompanyFinancialInfoDTO.put("IntangibleAssets", custAcctingValue.getImmatConstructionActivities());
				// tangibleAssets
				CompanyFinancialInfoDTO.put("TangibleAssets", custAcctingValue.getMatConstructionActivities());
				// operationProfitPrEmployee
				CompanyFinancialInfoDTO.put("OperationProfitPrEmployee", custAcctingValue.getPrimResPerEmployee());
				// ordinaryOperationProfitPrEmployee
				CompanyFinancialInfoDTO.put("OrdinaryOperationProfitPrEmployee", custAcctingValue.getOrdResPerEmployee());
				// profitPrEmployee
				CompanyFinancialInfoDTO.put("ProfitPrEmployee", custAcctingValue.getNetGainsPerEmployee());
				// fixedAssetsPrEmployee
				CompanyFinancialInfoDTO.put("FixedAssetsPrEmployee", custAcctingValue.getFixedAssetsPerEmployee());
				// capacityRatio
				CompanyFinancialInfoDTO.put("CapacityRatio", custAcctingValue.getCapacityGrade());
				// breakEvenTurnover
				CompanyFinancialInfoDTO.put("BreakEvenTurnover", custAcctingValue.getZeroTurnover());
				// securityMargin
				CompanyFinancialInfoDTO.put("SecurityMargin", custAcctingValue.getSafetyMargin());
				// assetTurnover
				CompanyFinancialInfoDTO.put("AssetTurnover", custAcctingValue.getAssetsTurnoverRate());
				// creditPeriodAccountsPayable
				CompanyFinancialInfoDTO.put("CreditPeriodAccountsPayable", custAcctingValue.getCreditPeriodCredit());
				// fixedAssetTurnover
				CompanyFinancialInfoDTO.put("FixedAssetTurnover", custAcctingValue.getFixedAssetsTurnoverRate());
				// capitalRatio
				CompanyFinancialInfoDTO.put("CapitalRatio", custAcctingValue.getCapitalGrade());
				// salaryRatio
				CompanyFinancialInfoDTO.put("SalaryRatio", custAcctingValue.getSaleryGrade());
				// staffExpensesPrEmployee
				CompanyFinancialInfoDTO.put("StaffExpensesPrEmployee", custAcctingValue.getExt1());
				// ratingCode
				CompanyFinancialInfoDTO.put("RatingCode", custAcctingValue.getRatingCode());
				// creditMaxCurrency --- Credit max(currency) SONO05.DAT 接口自行处理
				CompanyFinancialInfoDTO.put("CreditMaxCurrency", custAcctingValue.getCreditMaxCurrency());
				// //creditMax----Credit max(amount) SONO05.DAT接口自行处理
				CompanyFinancialInfoDTO.put("CreditMax", custAcctingValue.getCreditMaxAmount());
				// //riskCategory SONO05.DAT接口自行处理
				// resultMap.put("RiskCategory", custAcctingValue.get);
				// Risc Group
				CompanyFinancialInfoDTO.put("RiskCategory", custAcctingValue.getRiscGroup());
			}
			// 行业信息
			if (CmCommonUtil.isNotEmptyObject(industryValues)) {
				for (int i = 0; i < industryValues.length; i++) {// 9个行业类别
					// lineOfBusinessCode*
					CompanyFinancialInfoDTO.put("LineOfBusinessCode" + (i + 1), industryValues[i].getIndustryId());
				}
			}
		}
	}

	public ICustomerValue queryCustomerByCustId(long custId, String state) throws Exception {
		ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId, state);
		if (customerValue != null) {
			if (CmConstants.CustomerType.INDIVIDUAL == customerValue.getCustType() && "$$$$".equals(customerValue.getFirstName())) {
				customerValue.setFirstName("");
				customerValue.setLastName("");
				customerValue.setCustName("");
			}
			if (StringUtils.isNotBlank(customerValue.getIndivCustType()) && Integer.parseInt(customerValue.getIndivCustType()) != CmConstants.PartyRoleType.CUSTOMER) {
				customerValue = null;
			}
		}
		return customerValue;
	}
	
	/**
	 * OSE查询客户信息
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2018-7-20
	* ICmInterfaceSV
	 */
	public ICustomerValue queryCustomerByCustIdForOSE(long custId, String state) throws Exception {
		ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId, state);
		if (customerValue != null) {
			if (CmConstants.CustomerType.INDIVIDUAL == customerValue.getCustType() && "$$$$".equals(customerValue.getFirstName())) {
				customerValue.setFirstName("");
				customerValue.setLastName("");
				customerValue.setCustName("");
			}
		}
		return customerValue;
	}

}
