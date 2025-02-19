package com.asiainfo.crm.cm.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.complex.tab.split.TableVars;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.CmxConstants;
import com.asiainfo.crm.cm.common.CmxServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupCustomerHBean;
import com.asiainfo.crm.cm.inner.customer.bo.QBOCmxGroupMemberExtBean;
import com.asiainfo.crm.cm.inner.customer.dao.interfaces.ICmxGroupCustDAO;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerHValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupAddInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupCreditPointRecValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupInformInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupMemberValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupOrgStructExtValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupOutMemberValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmxGroupCreditPointValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmxGroupMemValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmxGroupMemberExtValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmxGroupOrgStructValue;
import com.asiainfo.crm.cm.service.interfaces.ICmxGroupCustInnerSV;

public class CmxGroupCustInnerSVImpl implements ICmxGroupCustInnerSV {

	private static transient Log log = LogFactory.getLog(CmxGroupCustInnerSVImpl.class);

	private ICmxGroupCustDAO getCmxGroupCustDAO() throws Exception {
		return (ICmxGroupCustDAO) ServiceFactory.getService(ICmxGroupCustDAO.class);
	}

	public IQBOCmxGroupMemberExtValue queryGroupMemberExt(long relId) throws Exception {
		if (relId < 0) {
			return new QBOCmxGroupMemberExtBean();
		}
		IQBOCmxGroupMemberExtValue[] cmxGroupMemberExtValues = null;
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1 = 1 ");
		condition.append(" AND ").append(IQBOCmxGroupMemberExtValue.S_CustRelId).append(" =:relId ");
		paraMap.put("relId", Long.valueOf(relId));
		cmxGroupMemberExtValues = getCmxGroupCustDAO().queryGroupMemberExt(condition.toString(), paraMap);
		if (CmCommonUtil.isNotEmptyObject(cmxGroupMemberExtValues)) {
			return cmxGroupMemberExtValues[0];
		}
		return new QBOCmxGroupMemberExtBean();
	}

	public IQBOCmxGroupOrgStructValue[] queryGroupOrgStruct(long custId, int startNum, int endNum) throws Exception {
		if (custId <= 0) {
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		condition.append(" 1=1 ");
		if (custId > 0) {
			condition.append(" AND ").append(IQBOCmxGroupOrgStructValue.S_CustId).append(" = :custId ");
			parameter.put("custId", custId);
		}
		IQBOCmxGroupOrgStructValue[] groupOrgStructValues = getCmxGroupCustDAO().queryGroupOrgStruct(null, condition.toString(), parameter, startNum, endNum);
		return groupOrgStructValues;
	}

	public int queryGroupOrgStructCount(long custId) throws Exception {
		if (custId <= 0) {
			// 输入参数不合法！
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IQBOCmxGroupOrgStructValue.S_CustId).append(" = :custId ");
		parameter.put("custId", custId);
		return getCmxGroupCustDAO().queryGroupOrgStructCount(condition.toString(), parameter);
	}

	public void saveGroupOrgStruct(IBOCmxGroupOrgStructExtValue extValue) throws Exception {
		getCmxGroupCustDAO().saveGroupOrgStruct(extValue);
	}

	public IQBOCmxGroupOrgStructValue[] queryGroupOrgStructByDeptId(long deptId, int startNum, int endNum) throws Exception {
		if (deptId <= 0) {
			// 输入参数不合法！
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IQBOCmxGroupOrgStructValue.S_DeptId).append(" = :deptId ");
		parameter.put("deptId", deptId);
		IQBOCmxGroupOrgStructValue[] values = getCmxGroupCustDAO().queryGroupOrgStruct(null, condition.toString(), parameter, startNum, endNum);
		return values;
	}

	public boolean checkGroupOrgParent(long custId, long deptId) throws Exception {
		if (custId <= 0 && deptId < 0) {
			// 输入参数不合法！
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		condition.append(" 1=1 ");
		if (custId >= 0) {
			condition.append(" AND ").append(IQBOCmxGroupOrgStructValue.S_CustId).append(" = :custId ");
			parameter.put("custId", custId);
		}
		if (deptId >= 0) {
			condition.append(" AND ").append(IQBOCmxGroupOrgStructValue.S_ParentDeptId).append(" = :deptId ");
			parameter.put("deptId", deptId);
		}

		IQBOCmxGroupOrgStructValue[] groupOrgStructvalues = getCmxGroupCustDAO().queryGroupOrgStruct(null, condition.toString(), parameter, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(groupOrgStructvalues)) {
			return true;
		}
		return false;
	}

	public boolean checkDeptName(long custId, String deptName) throws Exception {
		if (custId <= 0) {
			// 输入参数不合法！
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IQBOCmxGroupOrgStructValue.S_CustId).append(" = :custId ");
		condition.append(" AND ").append(IQBOCmxGroupOrgStructValue.S_DeptName).append(" = :deptName ");
		parameter.put("custId", custId);
		parameter.put("deptName", deptName);
		IQBOCmxGroupOrgStructValue[] groupOrgStructvalues = getCmxGroupCustDAO().queryGroupOrgStruct(null, condition.toString(), parameter, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(groupOrgStructvalues)) {
			return true;
		}
		return false;
	}

	public IBOCmxGroupAddInfoValue[] queryGroupCustChance(long custId, int startNum, int endNum) throws Exception {
		if (custId <= 0) {
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IBOCmxGroupAddInfoValue.S_CustId).append(" = :custId ");
		parameter.put("custId", custId);
		IBOCmxGroupAddInfoValue[] groupAddInfoValue = getCmxGroupCustDAO().queryGroupCustChance(null, condition.toString(), parameter, startNum, endNum);
		return groupAddInfoValue;
	}

	public IBOCmxGroupInformInfoValue queryGroupInformInfoBy(int informTypeId, long groupCustId) throws Exception {
		if (groupCustId < 0 || informTypeId < 0) {
			if (log.isInfoEnabled()) {
				log.info("condition groupInformInfoValues error!");
			}
			ExceptionUtil.throwBusinessException("CMS0000129");
		}
		return getCmxGroupCustDAO().queryGroupInformInfo(informTypeId, groupCustId);
	}

	public void saveGroupInformInfo(IBOCmxGroupInformInfoValue[] groupInformInfoValues) throws Exception {
		getCmxGroupCustDAO().saveGroupInformInfo(groupInformInfoValues);
	}

	public String queryIsUsedByGroupCustId(long groupCustId) throws Exception {
		return getCmxGroupCustDAO().queryIsUsedByGroupCustId(groupCustId);
	}

	public IQBOCmxGroupCreditPointValue[] queryGroupCreditPoint(String condition, Map parameter, int startNum, int endNum) throws Exception {
		IQBOCmxGroupCreditPointValue[] groupCreditPointValues = getCmxGroupCustDAO().queryGroupCreditPoint(null, condition.toString(), parameter, startNum, endNum);
		return groupCreditPointValues;
	}

	public int queryCreditPointCount(String condition, Map parameter) throws Exception {
		return getCmxGroupCustDAO().queryGroupCreditPointCount(condition.toString(), parameter);
	}

	public IBOCmxGroupCreditPointRecValue[] queryCreditPointRec(long custId, long pointsType, int startNum, int endNum) throws Exception {
		if (custId <= 0 || pointsType < 0) {
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		condition.append(" 1=1 ");
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmxGroupCreditPointRecValue.S_CustId).append(" = :custId ");
			condition.append(" AND ").append(IBOCmxGroupCreditPointRecValue.S_PointsType).append(" = :pointsType ");
			parameter.put("custId", custId);
			parameter.put("pointsType", pointsType);
		}
		IBOCmxGroupCreditPointRecValue[] groupCreditPointRecValues = getCmxGroupCustDAO().queryCreditPointRec(null, condition.toString(), parameter, startNum, endNum);
		return groupCreditPointRecValues;
	}

	public int queryCreditPointRecCount(long custId, long pointsType) throws Exception {
		if (custId <= 0 || pointsType < 0) {
			// 输入参数不合法！
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IBOCmxGroupCreditPointRecValue.S_CustId).append(" = :custId ");
		condition.append(" AND ").append(IBOCmxGroupCreditPointRecValue.S_PointsType).append(" = :pointsType ");
		parameter.put("custId", custId);
		parameter.put("pointsType", pointsType);
		return getCmxGroupCustDAO().queryCreditPointRecCount(condition.toString(), parameter);
	}

	public IQBOCmxGroupMemValue[] queryGroupInnerMems(long custId, String billId, String vipLevel, int startNum, int endNum) throws Exception {
		if (custId <= 0 && billId == null && vipLevel == null) {
			// 输入参数不合法！
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		condition.append(" 1=1 ");
		if (custId > 0) {
			condition.append(" AND ").append(IQBOCmxGroupMemValue.S_CustId).append(" = :custId ");
			parameter.put("custId", custId);
		}
		if (StringUtils.isNotBlank(billId)) {
			condition.append(" AND ").append(IQBOCmxGroupMemValue.S_BillId).append(" = :billId ");
			parameter.put("billId", billId);
		}
		if (StringUtils.isNotBlank(vipLevel)) {
			condition.append(" AND ").append(IQBOCmxGroupMemValue.S_VipLevel).append(" = :vipLevel ");
			parameter.put("vipLevel", vipLevel);
		}
		IQBOCmxGroupMemValue[] cmxGroupMemValues = getCmxGroupCustDAO().queryGroupInnerMems(null, condition.toString(), parameter, startNum, endNum);
		return cmxGroupMemValues;
	}

	public int queryGroupInnerMemCount(long custId, String billId, String vipLevel) throws Exception {
		if (custId <= 0 && billId == null && vipLevel == null) {
			// 输入参数不合法！
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		condition.append(" 1=1 ");
		if (StringUtils.isBlank(billId) && StringUtils.isBlank(vipLevel)) {
			condition.append(" AND ").append(IQBOCmxGroupMemValue.S_CustId).append(" = :custId ");
			parameter.put("custId", custId);
		}
		if (StringUtils.isNotBlank(billId)) {
			condition.append(" AND ").append(IQBOCmxGroupMemValue.S_BillId).append(" = :billId ");
			parameter.put("billId", billId);
		}
		if (StringUtils.isNotBlank(vipLevel)) {
			condition.append(" AND ").append(IQBOCmxGroupMemValue.S_VipLevel).append(" = :vipLevel ");
			parameter.put("vipLevel", vipLevel);
		}
		return getCmxGroupCustDAO().queryGroupInnerMemCount(condition.toString(), parameter);
	}

	public IBOCmxGroupOutMemberValue[] queryGroupOuterMems(long custId, int spType, String billId, String name, int startNum, int endNum) throws Exception {
		if (custId <= 0) {
			// 输入参数不合法！
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		condition.append(" 1=1 ");
		if (spType == -1) {
			condition.append(" AND SP_TYPE IN ( " + CmxConstants.spType.CUCC + ", " + CmxConstants.spType.XLT + ", " + CmxConstants.spType.GDDH + ") ");
		} else {
			condition.append(" AND ").append(IBOCmxGroupOutMemberValue.S_SpType).append(" = :spType ");
			parameter.put("spType", spType);
		}
		if (StringUtils.isNotBlank(billId)) {
			condition.append(" AND ").append(IBOCmxGroupOutMemberValue.S_BillId).append(" = :billId ");
			parameter.put("billId", billId);
		}
		if (StringUtils.isNotBlank(name)) {
			condition.append(" AND ").append(IBOCmxGroupOutMemberValue.S_Name).append(" = :name ");
			parameter.put("name", name);
		}
		condition.append(" AND ").append(IBOCmxGroupOutMemberValue.S_CustId).append(" = :custId ");
		parameter.put("custId", custId);
		return getCmxGroupCustDAO().queryGroupOuterMems(null, condition.toString(), parameter, startNum, endNum);
	}

	public int queryGroupOuterMemCount(long custId, int spType, String billId, String name) throws Exception {
		if (custId <= 0) {
			// 输入参数不合法！
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		condition.append(" 1=1 ");
		if (spType == -1) {
			condition.append(" AND SP_TYPE IN ( " + CmxConstants.spType.CUCC + ", " + CmxConstants.spType.XLT + ", " + CmxConstants.spType.GDDH + ") ");
		} else {
			condition.append(" AND ").append(IBOCmxGroupOutMemberValue.S_SpType).append(" = :spType ");
			parameter.put("spType", spType);
		}
		if (StringUtils.isNotBlank(billId)) {
			condition.append(" AND ").append(IBOCmxGroupOutMemberValue.S_BillId).append(" = :billId ");
			parameter.put("billId", billId);
		}
		if (StringUtils.isNotBlank(name)) {
			condition.append(" AND ").append(IBOCmxGroupOutMemberValue.S_Name).append(" = :name ");
			parameter.put("name", name);
		}
		condition.append(" AND ").append(IBOCmxGroupOutMemberValue.S_CustId).append(" = :custId ");
		parameter.put("custId", custId);
		return getCmxGroupCustDAO().queryGroupOuterMemCount(condition.toString(), parameter);
	}

	public IBOCmxGroupAddInfoValue[] queryGroupModifySpecialAttr(long custId, int startNum, int endNum) throws Exception {
		if (custId <= 0) {
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IBOCmxGroupAddInfoValue.S_CustId).append(" = :custId ");
		parameter.put("custId", custId);
		IBOCmxGroupAddInfoValue[] groupAddInfoValue = getCmxGroupCustDAO().queryGroupCustChance(null, condition.toString(), parameter, startNum, endNum);
		return groupAddInfoValue;
	}

	public IBOCmxGroupOutMemberValue[] queryGroupOuterMem(long custId, long outMemberId) throws Exception {
		if (custId <= 0 || outMemberId < 0) {
			// 输入参数不合法！
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IBOCmxGroupOutMemberValue.S_CustId).append(" = :custId ");
		condition.append(" AND ").append(IBOCmxGroupOutMemberValue.S_OutMemberId).append(" = :outMemberId ");
		parameter.put("custId", custId);
		parameter.put("outMemberId", outMemberId);
		return getCmxGroupCustDAO().queryGroupOuterMems(null, condition.toString(), parameter, -1, -1);
	}

	public void saveGroupAddInfoValue(IBOCmxGroupAddInfoValue extValue) throws Exception {
		getCmxGroupCustDAO().saveGroupAddInfoValue(extValue);
	}

	public void saveGroupMemExt(IBOCmxGroupMemberValue extValue) throws Exception {
		getCmxGroupCustDAO().saveGroupMemExt(extValue);
	}

	public void saveGroupOutMember(IBOCmxGroupOutMemberValue groupOutMemberValue) throws Exception {
		getCmxGroupCustDAO().saveGroupOutMember(groupOutMemberValue);
	}

	public IQBOCmxGroupMemValue[] queryGroupInnerMemBybillId(String billId) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IQBOCmxGroupMemValue.S_BillId).append(" = :billId ");
		parameter.put("billId", billId);
		return getCmxGroupCustDAO().queryGroupInnerMems(null, condition.toString(), parameter, -1, -1);
	}

	public void saveGroupMemberLevel(IBOCmxGroupMemberValue groupMemberValue) throws Exception {
		getCmxGroupCustDAO().saveGroupMemberLevel(groupMemberValue);
	}

	public void saveGroupMemberLevelByfile(IBOCmxGroupMemberValue[] groupMemberValues) throws Exception {
		getCmxGroupCustDAO().saveGroupMemberLevelByfile(groupMemberValues);
	}

	public IBOCmxGroupMemberValue[] queryGroupMemberLevelBybillId(String billId) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IBOCmxGroupMemberValue.S_BillId).append(" = :billId ");
		parameter.put("billId", billId);
		return getCmxGroupCustDAO().queryGroupMemberLevelBybillIds(null, condition.toString(), parameter, -1, -1);
	}

	public int queryGroupCustHisCount(long opId, long custId, String custName, String doneDate, String startDate, String endDate) throws Exception {
		// if (opId < 0) {
		// // 输入参数不合法！
		// log.error(CrmLocaleFactory.getResource("CMS0000073"));
		// ExceptionUtil.throwBusinessException("CMS0000073");
		// }
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 AND ");
		if (StringUtils.isNotBlank(startDate) && StringUtils.isNotBlank(endDate)) {
			condition.append(IBOCmGroupCustomerHValue.S_DoneDate).append(" >= ").append(" to_date('").append(startDate).append(" 00:00:00 ").append(" ','yyyy-MM-dd hh24:mi:ss'")
					.append(") ").append(" AND ").append(IBOCmGroupCustomerHValue.S_DoneDate).append(" <= ").append(" to_date('").append(endDate).append(" 23:59:59 ")
					.append("','yyyy-MM-dd hh24:mi:ss'").append(") ");
		}
		String[] billingCycles = CmCommonUtil.getCycleYY(startDate, endDate);
		if (opId > 0) {
			condition.append(" AND ").append(IBOCmGroupCustomerHValue.S_OpId).append(" = :opId ");
			paraMap.put("opId", Long.valueOf(opId));
		}
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmGroupCustomerHValue.S_CustId).append(" = :custId ");
			paraMap.put("custId", Long.valueOf(custId));
		}
		if (StringUtils.isNotBlank(custName)) {
			condition.append(" AND ").append(IBOCmGroupCustomerHValue.S_CustName).append(" = :custName ");
			paraMap.put("custName", custName);
		}
		TableVars[] tableVars = new TableVars[billingCycles.length];
		for (int i = 0; i < billingCycles.length; i++) {
			tableVars[i] = new TableVars();
			tableVars[i].add("CM_GROUP_CUSTOMER_H", "DONE_DATE", billingCycles[i]);
		}
		String querySql = "";// ScoreUtil.createUnionSql(BOCmGroupCustomerHBean.class, new StringBuilder(condition),
								// null, tableVars);
		int count = 0;
		IBOCmGroupCustomerHValue[] retValues = getCmxGroupCustDAO().queryGroupCustHis(querySql, paraMap);
		if (retValues != null && retValues.length > 0) {
			count = retValues.length;
		}
		return count;
	}

	public int queryGroupCustHisCountById(long opId, long custId, String custServiceId, String doneDate, String startDate, String endDate) throws Exception {
		// if (opId < 0) {
		// // 输入参数不合法！
		// log.error(CrmLocaleFactory.getResource("CMS0000073"));
		// ExceptionUtil.throwBusinessException("CMS0000073");
		// }
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 AND ");
		if (StringUtils.isNotBlank(startDate) && StringUtils.isNotBlank(endDate)) {
			condition.append(IBOCmGroupCustomerHValue.S_DoneDate).append(" >= ").append(" to_date('").append(startDate).append(" 00:00:00 ").append(" ','yyyy-MM-dd hh24:mi:ss'")
					.append(") ").append(" AND ").append(IBOCmGroupCustomerHValue.S_DoneDate).append(" <= ").append(" to_date('").append(endDate).append(" 23:59:59 ")
					.append("','yyyy-MM-dd hh24:mi:ss'").append(") ");
		}
		String[] billingCycles = CmCommonUtil.getCycleYY(startDate, endDate);
		if (opId > 0) {
			condition.append(" AND ").append(IBOCmGroupCustomerHValue.S_OpId).append(" = :opId ");
			paraMap.put("opId", Long.valueOf(opId));
		}
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmGroupCustomerHValue.S_CustId).append(" = :custId ");
			paraMap.put("custId", Long.valueOf(custId));
		}
		if (StringUtils.isNotBlank(custServiceId)) {
			condition.append(" AND ").append(IBOCmGroupCustomerHValue.S_CustServiceId).append(" = :custServiceId ");
			paraMap.put("custServiceId", custServiceId);
		}
		TableVars[] tableVars = new TableVars[billingCycles.length];
		for (int i = 0; i < billingCycles.length; i++) {
			tableVars[i] = new TableVars();
			tableVars[i].add("CM_GROUP_CUSTOMER_H", "DONE_DATE", billingCycles[i]);
		}
		String querySql = "";// ScoreUtil.createUnionSql(BOCmGroupCustomerHBean.class, new StringBuilder(condition),
								// null, tableVars);
		int count = 0;
		IBOCmGroupCustomerHValue[] retValues = getCmxGroupCustDAO().queryGroupCustHis(querySql, paraMap);
		if (retValues != null && retValues.length > 0) {
			count = retValues.length;
		}
		return count;
	}

	public IBOCmGroupCustomerHValue[] queryGroupCustHis(long opId, long custId, String custName, String doneDate, String startDate, String endDate, int startNum, int endNum)
			throws Exception {
		// if (opId < 0) {
		// // 输入参数不合法！
		// log.error(CrmLocaleFactory.getResource("CMS0000073"));
		// ExceptionUtil.throwBusinessException("CMS0000073");
		// }
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 AND ");
		if (StringUtils.isNotBlank(startDate) && StringUtils.isNotBlank(endDate)) {
			condition.append(IBOCmGroupCustomerHValue.S_DoneDate).append(" >= ").append(" to_date('").append(startDate).append(" 00:00:00 ").append(" ','yyyy-MM-dd hh24:mi:ss'")
					.append(") ").append(" AND ").append(IBOCmGroupCustomerHValue.S_DoneDate).append(" <= ").append(" to_date('").append(endDate).append(" 23:59:59 ")
					.append("','yyyy-MM-dd hh24:mi:ss'").append(") ");
		}
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmGroupCustomerHValue.S_CustId).append(" = :custId ");
			paraMap.put("custId", Long.valueOf(custId));
		}
		if (opId > 0) {
			condition.append(" AND ").append(IBOCmGroupCustomerHValue.S_OpId).append(" = :opId ");
			paraMap.put("opId", Long.valueOf(opId));
		}
		if (StringUtils.isNotBlank(custName)) {
			condition.append(" AND ").append(IBOCmGroupCustomerHValue.S_CustName).append(" = :custName ");
			paraMap.put("custName", custName);
		}
		String[] billingCycles = CmCommonUtil.getCycleYY(startDate, endDate);
		return CmxServiceFactory.getCmxGroupCustInnerSV().queryGroupCustHis(condition.toString(), paraMap, billingCycles, startNum, endNum);
	}

	public IBOCmGroupCustomerHValue[] queryGroupCustHisById(long opId, long custId, String custServiceId, String doneDate, String startDate, String endDate, int startNum,
			int endNum) throws Exception {
		// if (opId < 0) {
		// // 输入参数不合法！
		// log.error(CrmLocaleFactory.getResource("CMS0000073"));
		// ExceptionUtil.throwBusinessException("CMS0000073");
		// }
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 AND ");
		if (StringUtils.isNotBlank(startDate) && StringUtils.isNotBlank(endDate)) {
			condition.append(IBOCmGroupCustomerHValue.S_DoneDate).append(" >= ").append(" to_date('").append(startDate).append(" 00:00:00 ").append(" ','yyyy-MM-dd hh24:mi:ss'")
					.append(") ").append(" AND ").append(IBOCmGroupCustomerHValue.S_DoneDate).append(" <= ").append(" to_date('").append(endDate).append(" 23:59:59 ")
					.append("','yyyy-MM-dd hh24:mi:ss'").append(") ");
		}
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmGroupCustomerHValue.S_CustId).append(" = :custId ");
			paraMap.put("custId", Long.valueOf(custId));
		}
		if (opId > 0) {
			condition.append(" AND ").append(IBOCmGroupCustomerHValue.S_OpId).append(" = :opId ");
			paraMap.put("opId", Long.valueOf(opId));
		}
		if (StringUtils.isNotBlank(custServiceId)) {
			condition.append(" AND ").append(IBOCmGroupCustomerHValue.S_CustServiceId).append(" = :custServiceId ");
			paraMap.put("custServiceId", custServiceId);
		}
		String[] billingCycles = CmCommonUtil.getCycleYY(startDate, endDate);
		return CmxServiceFactory.getCmxGroupCustInnerSV().queryGroupCustHis(condition.toString(), paraMap, billingCycles, startNum, endNum);
	}

	public IBOCmGroupCustomerHValue[] queryGroupCustHis(String condition, Map paraMap, String[] billingCycles, int startNum, int endNum) throws Exception {
		if (billingCycles == null || billingCycles.length == 0) {
			// 查询失败，传入的帐期列表为空！
			ExceptionUtil.throwBusinessException("CMS0022003");
		}

		TableVars[] tableVars = new TableVars[billingCycles.length];
		for (int i = 0; i < billingCycles.length; i++) {
			tableVars[i] = new TableVars();
			tableVars[i].add("CM_GROUP_CUSTOMER_H", "DONE_DATE", billingCycles[i]);
		}
		StringBuilder orderBy = new StringBuilder().append(IBOCmGroupCustomerHValue.S_DoneDate);
		String querySql = CmCommonUtil.createUnionSql(BOCmGroupCustomerHBean.class, new StringBuilder(condition), orderBy, tableVars);
		StringBuilder finalSql = new StringBuilder();
		if (startNum != -1 && endNum != -1) {
			finalSql.append("SELECT * FROM (");
			finalSql.append("SELECT * FROM (");
		}

		finalSql.append("SELECT M.* FROM (");
		finalSql.append("SELECT * FROM (").append(querySql).append(") ");
		finalSql.append(") M ");

		if (startNum != -1 && endNum != -1) {
			finalSql.append(") limit :startNum,:endNum )");
			paraMap.put("startNum", Integer.valueOf(startNum));
			paraMap.put("endNum", Integer.valueOf(endNum));
		}

		IBOCmGroupCustomerHValue[] groupCustomerHValues = getCmxGroupCustDAO().queryGroupCustHis(finalSql.toString(), paraMap);
		return groupCustomerHValues;
	}

}
