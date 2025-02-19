package com.asiainfo.crm.cm.inner.customer.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.util.StringUtils;
import com.asiainfo.crm.cm.common.CmxConstants;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmVpmnCustomerEngine;
import com.asiainfo.crm.cm.inner.customer.dao.interfaces.IVpmnCustomerDAO;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmVpmnCustomerValue;

public class VpmnCustomerDAOImpl implements IVpmnCustomerDAO
{

	public IBOCmVpmnCustomerValue queryVpmnCustomer(long vpmnCustId) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		condition.append(IBOCmVpmnCustomerValue.S_VpmnCustId).append(" = :vpmnCustId ");
//		condition.append(" and ").append(IBOCmFamilyCustMemberValue.S_State).append(" = :state ");

		HashMap paraMap = new HashMap();
		paraMap.put("vpmnCustId", Long.valueOf(vpmnCustId));
		paraMap.put("state", CmxConstants.RECORD_STATE_USE);
		IBOCmVpmnCustomerValue[] vpmnCustomerValues = BOCmVpmnCustomerEngine.getBeans(condition.toString(), paraMap);
		if (vpmnCustomerValues == null || vpmnCustomerValues.length < 1)
		{
			return null;
		}
		return vpmnCustomerValues[0];
	}

	public void saveVpmnCustomer(IBOCmVpmnCustomerValue vpmnCustomerValue) throws Exception
	{
		BOCmVpmnCustomerEngine.save(vpmnCustomerValue);
	}

	public int queryVpmnCustomerCount(DataContainerInterface dataContainer) throws Exception
	{
		return queryVpmnCustomerCount(dataContainer, null, new HashMap());
	}

	public IBOCmVpmnCustomerValue[] queryVpmnCustomer(DataContainerInterface dataContainer, int startIndex, int endIndex)
			throws Exception
	{
		return queryVpmnCustomer(dataContainer, null, new HashMap(), startIndex, endIndex);
	}

	public IBOCmVpmnCustomerValue[] queryVpmnCustomer(DataContainerInterface dataContainer, String extCondition,
			Map extParameter, int startIndex, int endIndex) throws Exception
	{
		Map ps = dataContainer.getProperties();
		StringBuffer condition = new StringBuffer();
		Map parameters = new HashMap();
		if (!StringUtils.isEmptyString(extCondition))
		{
			condition.append(" ").append(extCondition);
			parameters.putAll(extParameter);
		}
		for (java.util.Iterator cc = ps.entrySet().iterator(); cc.hasNext();)
		{
			Map.Entry e = (Map.Entry) cc.next();
			if (condition.length() > 0)
				condition.append(" and ");
			condition.append(e.getKey().toString()).append(" = :p_").append(e.getKey().toString());
			parameters.put("p_" + e.getKey().toString(), e.getValue());
		}

		return BOCmVpmnCustomerEngine.getBeans(null, condition.toString(), parameters, startIndex, endIndex, false);
	}

	public int queryVpmnCustomerCount(DataContainerInterface dataContainer, String extCondition, Map extParameter)
			throws Exception
	{
		Map ps = dataContainer.getProperties();
		StringBuffer condition = new StringBuffer();
		Map parameters = new HashMap();
		if (!StringUtils.isEmptyString(extCondition))
		{
			condition.append(" ").append(extCondition);
			parameters.putAll(extParameter);
		}
		for (java.util.Iterator cc = ps.entrySet().iterator(); cc.hasNext();)
		{
			Map.Entry e = (Map.Entry) cc.next();
			if (condition.length() > 0)
				condition.append(" and ");
			condition.append(e.getKey().toString() + " = :p_" + e.getKey().toString());
			parameters.put("p_" + e.getKey().toString(), e.getValue());
		}
		return BOCmVpmnCustomerEngine.getBeansCount(condition.toString(), parameters);
	}

	public IBOCmVpmnCustomerValue[] queryVpmnGroupInfosByGroupId(long vpmnGroupId, int start, int end) throws Exception
	{
		StringBuffer sql = new StringBuffer();
		Map parameters = new HashMap();
		sql.append(IBOCmVpmnCustomerValue.S_GroupId).append(" = :vGroupId");
		parameters.put("vGroupId", Long.valueOf(vpmnGroupId));
		sql.append(" AND ");
		sql.append(IBOCmVpmnCustomerValue.S_State).append(" =:state ");
		parameters.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmVpmnCustomerEngine.getBeans(null, sql.toString(), parameters, start, end, false);
	}

	public int queryVpmnGroupInfosCountByGroupId(long vpmnGroupId) throws Exception
	{
		StringBuffer sql = new StringBuffer();
		Map parameters = new HashMap();
		sql.append(IBOCmVpmnCustomerValue.S_GroupId).append(" = :vGroupId");
		parameters.put("vGroupId", Long.valueOf(vpmnGroupId));
		sql.append(" AND ");
		sql.append(IBOCmVpmnCustomerValue.S_State).append(" =:state ");
		parameters.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmVpmnCustomerEngine.getBeansCount(sql.toString(), parameters);
	}

	public IBOCmVpmnCustomerValue queryVpmnCustomerByGroupId(long groupId) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmVpmnCustomerValue.S_GroupId).append(" = :groupId ");
		condition.append(" AND ").append(IBOCmVpmnCustomerValue.S_State).append(" = :state ");
		parameter.put("groupId", Long.valueOf(groupId));
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		IBOCmVpmnCustomerValue[] vpmnCustomer = BOCmVpmnCustomerEngine.getBeans(condition.toString(), parameter);
		if (vpmnCustomer.length < 1)
			return null;
		else
			return vpmnCustomer[0];
	}

	public int queryVpmnCustomerCount(String condition, Map parameter) throws Exception
	{
		return BOCmVpmnCustomerEngine.getBeansCount(condition, parameter);
	}

	public IBOCmVpmnCustomerValue[] queryVpmnCustomers(String condition, Map parameter, int startNum, int endNum)
			throws Exception
	{
		return BOCmVpmnCustomerEngine.getBeans(null, condition, parameter, startNum, endNum, false);
	}
}
