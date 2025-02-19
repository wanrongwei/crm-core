package com.asiainfo.crm.cm.service.impl;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.SNUtil;
import com.ai.omframe.util.TimeUtil;
import com.asiainfo.crm.cm.busimodel.rule.CmVpmnCustomerBusiRule;
import com.asiainfo.crm.cm.busimodel.rule.ivalues.ICmRuleReturnData;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmxConstants;
import com.asiainfo.crm.cm.inner.customer.dao.interfaces.IVpmnCustomerDAO;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmVpmnCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmGroupCustAndExtraInfoValue;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.IVpmnCustomerSV;

public class VpmnCustomerSVImpl implements IVpmnCustomerSV {

	private static transient Log log = LogFactory.getLog(VpmnCustomerSVImpl.class);

	private IVpmnCustomerDAO getVpmnCustomerDAO() {
		return (IVpmnCustomerDAO) ServiceFactory.getService(IVpmnCustomerDAO.class);
	}

	public long getNewId() throws Exception, RemoteException {
		return SNUtil.generatorVpmnCustId(CenterFactory.getCenterInfo().getRegion());
	}

	public IBOCmVpmnCustomerValue queryVpmnCustomer(long vpmnCustId) throws Exception, RemoteException {
		if (vpmnCustId <= 0) {
			if (log.isErrorEnabled())
				log.error(CrmLocaleFactory.getResource("CMS0000129"));
			ExceptionUtil.throwBusinessException("CMS0000129");
		}
		return getVpmnCustomerDAO().queryVpmnCustomer(vpmnCustId);
	}

	public IBOCmVpmnCustomerValue[] queryVpmnCustomers(DataContainerInterface dataContainer, int startIndex, int endIndex) throws Exception, RemoteException {
		return getVpmnCustomerDAO().queryVpmnCustomer(dataContainer, startIndex, endIndex);
	}

	public IBOCmVpmnCustomerValue[] queryVpmnCustomers(String custId, String name, String regionId, String groupType, String countyCode, String groupAttr, String createBegin,
			String createEnd, int startIndex, int endIndex) throws Exception {
		DataContainerInterface dataContainer = new DataContainer();
		// 只查询有效的记录
		dataContainer.set(IBOCmVpmnCustomerValue.S_State, CmxConstants.RECORD_STATE_USE);

		if (StringUtils.isNotBlank(custId)) {
			dataContainer.set(IBOCmVpmnCustomerValue.S_VpmnCustId, Long.valueOf(custId));
		}
		if (StringUtils.isNotBlank(regionId)) {
			dataContainer.set(IBOCmVpmnCustomerValue.S_RegionId, regionId);
		}
		if (StringUtils.isNotBlank(groupType)) {
			dataContainer.set(IBOCmVpmnCustomerValue.S_GroupType, groupType);
		}
		if (StringUtils.isNotBlank(countyCode)) {
			dataContainer.set(IBOCmVpmnCustomerValue.S_CountyCode, countyCode);
		}
		if (StringUtils.isNotBlank(groupAttr)) {
			dataContainer.set(IBOCmVpmnCustomerValue.S_GroupCategory, groupAttr);
		}

		StringBuilder extCondition = null;
		Map paraMap = null;
		if (StringUtils.isNotBlank(createBegin)) {
			extCondition = new StringBuilder();
			paraMap = new HashMap();
			extCondition.append(IBOCmVpmnCustomerValue.S_CreateDate).append(" >= :createBegin ");
			paraMap.put("createBegin", TimeUtil.convertStringToDate(createBegin, "yyyy-MM-dd"));
		}
		if (StringUtils.isNotBlank(createEnd)) {
			if (null == extCondition) {
				extCondition = new StringBuilder();
				paraMap = new HashMap();
				if (extCondition.length() > 0) {
					extCondition.append(" AND ");
				}
				extCondition.append(IBOCmVpmnCustomerValue.S_CreateDate).append(" <= :createEnd ");
				Timestamp ts = TimeUtil.convertStringToDate(createEnd, "yyyy-MM-dd");
				paraMap.put("createEnd", TimeUtil.getLastDate(ts));
			}
		}
		if (StringUtils.isNotBlank(name)) {
			if (null == extCondition) {
				extCondition = new StringBuilder();
				paraMap = new HashMap();
			}
			if (extCondition.length() > 0) {
				extCondition.append(" AND ");
			}
			extCondition.append(IBOCmVpmnCustomerValue.S_CustName).append(" LIKE :custName ");
			if (null != paraMap) {
				paraMap.put("custName", "%" + name + "%");
			}
		}

		return getVpmnCustomerDAO().queryVpmnCustomer(dataContainer, (extCondition == null) ? null : extCondition.toString(), paraMap, startIndex, endIndex);
	}

	public void saveVpmnCustomer(IBOCmVpmnCustomerValue vpmnCustomerValue) throws Exception, RemoteException {
		ICmRuleReturnData ruleReturnData = CmVpmnCustomerBusiRule.validateIntegrity(vpmnCustomerValue);
		if (ruleReturnData.getResultCode() != CmConstants.BusiRuleResultCode.CODE_YES) {
			log.error(ruleReturnData.getMsg());
			ExceptionUtil.throwBusinessException("CMS0000000", ruleReturnData.getMsg());
		}
		if (vpmnCustomerValue.isNew()) {
			vpmnCustomerValue.setState(CmxConstants.RECORD_STATE_USE);
			// 增加记录创建记录的操作员信息 added by huzq2 at 2011-8-5
			if (ServiceManager.getUser() != null) {
				vpmnCustomerValue.setCreateOpId(ServiceManager.getUser().getID());
				vpmnCustomerValue.setCreateOrgId(ServiceManager.getUser().getOrgId());
			}
		}
		/*
		 * 如果是删除的话需要做相应的处理，只能提供逻辑删除，不能无理删除。
		 */
		if (vpmnCustomerValue.isDeleted()) {
			vpmnCustomerValue.setStsToOld();
			vpmnCustomerValue.setState(CmxConstants.RECORD_STATE_DEL);
		}
		getVpmnCustomerDAO().saveVpmnCustomer(vpmnCustomerValue);
	}

	public int queryVpmnCustomerCount(String custId, String name, String regionId, String groupType, String countyCode, String groupAttr, String createBegin, String createEnd)
			throws Exception {

		DataContainerInterface dataContainer = new DataContainer();
		// 只查询有效的记录
		dataContainer.set(IBOCmVpmnCustomerValue.S_State, CmxConstants.RECORD_STATE_USE);

		if (StringUtils.isNotBlank(custId)) {
			dataContainer.set(IBOCmVpmnCustomerValue.S_VpmnCustId, Long.valueOf(custId));
		}

		if (StringUtils.isNotBlank(regionId)) {
			dataContainer.set(IBOCmVpmnCustomerValue.S_RegionId, regionId);
		}
		if (StringUtils.isNotBlank(groupType)) {
			dataContainer.set(IBOCmVpmnCustomerValue.S_GroupType, groupType);
		}
		if (StringUtils.isNotBlank(countyCode)) {
			dataContainer.set(IBOCmVpmnCustomerValue.S_CountyCode, countyCode);
		}
		if (StringUtils.isNotBlank(groupAttr)) {
			dataContainer.set(IBOCmVpmnCustomerValue.S_GroupCategory, groupAttr);
		}

		StringBuilder extCondition = new StringBuilder();
		Map paraMap = new HashMap();
		if (StringUtils.isNotBlank(createBegin)) {
			extCondition.append(IBOCmVpmnCustomerValue.S_CreateDate).append(" >= :createBegin ");
			paraMap.put("createBegin", TimeUtil.convertStringToDate(createBegin, "yyyy-MM-dd"));
		}
		if (StringUtils.isNotBlank(createEnd)) {
			if (extCondition.length() > 0) {
				extCondition.append(" AND ");
			}
			extCondition.append(IBOCmVpmnCustomerValue.S_CreateDate).append(" <= :createEnd ");
			Timestamp ts = TimeUtil.convertStringToDate(createEnd, "yyyy-MM-dd");
			paraMap.put("createEnd", TimeUtil.getLastDate(ts));
		}
		if (StringUtils.isNotBlank(name)) {
			if (extCondition.length() > 0) {
				extCondition.append(" AND ");
			}
			extCondition.append(IBOCmVpmnCustomerValue.S_CustName).append(" LIKE :custName ");
			paraMap.put("custName", (new StringBuilder()).append("%").append(name).append("%").toString());
		}
		return getVpmnCustomerDAO().queryVpmnCustomerCount(dataContainer, extCondition.toString(), paraMap);
	}

	public int queryVpmnCustomer(DataContainerInterface dataContainer) throws Exception, RemoteException {
		return getVpmnCustomerDAO().queryVpmnCustomerCount(dataContainer);
	}

	public IBOCmVpmnCustomerValue[] queryVpmnGroupInfosByGroupId(long groupId, int start, int end) throws Exception, RemoteException {
		IVpmnCustomerDAO groupVpmnCustomerDAO = (IVpmnCustomerDAO) ServiceFactory.getService(IVpmnCustomerDAO.class);
		ICmGroupCustomerSV cmGroupCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		IQBOCmGroupCustAndExtraInfoValue groupCustAndExtraInfo = cmGroupCustomerSV.queryGroupCustAndExtraInfoByGroupId(groupId);
		if (groupCustAndExtraInfo != null) {
			return groupVpmnCustomerDAO.queryVpmnGroupInfosByGroupId(groupCustAndExtraInfo.getVpmnCustId(), start, end);
		}
		return new IBOCmVpmnCustomerValue[0];
	}

	public int queryVpmnGroupInfosCountByGroupId(long groupId) throws Exception, RemoteException {
		IVpmnCustomerDAO groupVpmnCustomerDAO = (IVpmnCustomerDAO) ServiceFactory.getService(IVpmnCustomerDAO.class);
		ICmGroupCustomerSV cmGroupCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		IQBOCmGroupCustAndExtraInfoValue groupCustAndExtraInfo = cmGroupCustomerSV.queryGroupCustAndExtraInfoByGroupId(groupId);
		if (groupCustAndExtraInfo != null) {
			return groupVpmnCustomerDAO.queryVpmnGroupInfosCountByGroupId(groupCustAndExtraInfo.getVpmnCustId());
		}
		return 0;
	}

	public IBOCmVpmnCustomerValue queryVpmnCustomerByGroupId(long groupId) throws Exception, RemoteException {
		return getVpmnCustomerDAO().queryVpmnCustomerByGroupId(groupId);
	}

	public IBOCmVpmnCustomerValue[] queryVpmnCustomersByCustName(String custName) throws Exception, RemoteException {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmVpmnCustomerValue.S_State).append(" = :state ");
		condition.append(" AND ").append(IBOCmVpmnCustomerValue.S_CustName).append(" LIKE :custName ");
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		parameter.put("custName", "%" + custName + "%");
		return getVpmnCustomerDAO().queryVpmnCustomers(condition.toString(), parameter, -1, -1);
	}

}
