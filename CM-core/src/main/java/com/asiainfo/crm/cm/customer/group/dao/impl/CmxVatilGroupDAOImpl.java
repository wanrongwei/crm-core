package com.asiainfo.crm.cm.customer.group.dao.impl;


import java.util.HashMap;

import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmxVatilGroupDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmxGroupVitalGroupRelValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmxVitalGroupCustomerValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmVitalGroupValue;
import com.asiainfo.crm.cm.customer.group.bo.QBOCmVitalGroupEngine;
import com.asiainfo.crm.cm.customer.group.bo.BOCmxVitalGroupCustomerEngine;
import com.asiainfo.crm.cm.customer.group.bo.BOCmxGroupVitalGroupRelEngine;

public class CmxVatilGroupDAOImpl implements ICmxVatilGroupDAO
{

	public IQBOCmVitalGroupValue[] queryVatilGroup(String groupId, int $startrowindex, int $endrowindex)
			throws Exception
	{
		StringBuffer sql = new StringBuffer();
		HashMap map = new HashMap();
		sql.append(IQBOCmVitalGroupValue.S_State).append(" =:state");
		map.put("state", "U");
		sql.append(" AND ").append(IQBOCmVitalGroupValue.S_MainGroupCustId).append(" =:groupId");
		map.put("groupId",Long.valueOf(groupId));
		return QBOCmVitalGroupEngine.getBeans(null, sql.toString(), map, $startrowindex, $endrowindex, false);
	}

	public IQBOCmVitalGroupValue queryVatilGroupById(String groupId, String vgroupId) throws Exception
	{
		StringBuffer sql = new StringBuffer();
		HashMap map = new HashMap();
		sql.append(IQBOCmVitalGroupValue.S_State).append(" =:state");
		map.put("state", "U");
		sql.append(" AND ").append(IQBOCmVitalGroupValue.S_MainGroupCustId).append(" =:groupId");
		map.put("groupId",Long.valueOf(groupId));
		sql.append(" AND ").append(IQBOCmVitalGroupValue.S_VgroupId).append(" =:vgroupId");
		map.put("vgroupId", vgroupId);
		IQBOCmVitalGroupValue[] aValues = QBOCmVitalGroupEngine.getBeans(sql.toString(), map);
		return (aValues == null || aValues.length == 0) ? null : aValues[0];
	}

	public int queryVatilGroupCount(String groupId) throws Exception
	{
		StringBuffer sql = new StringBuffer();
		HashMap map = new HashMap();
		sql.append(IQBOCmVitalGroupValue.S_State).append(" =:state");
		map.put("state", "U");
		sql.append(" AND ").append(IQBOCmVitalGroupValue.S_MainGroupCustId).append(" =:groupId");
		map.put("groupId",Long.valueOf(groupId));
		return QBOCmVitalGroupEngine.getBeansCount(sql.toString(), map);
	}

	public void deleteVatilGroupById(String groupId, String vgroupId) throws Exception
	{
		StringBuffer sql = new StringBuffer();
		HashMap map = new HashMap();
		sql.append(IBOCmxGroupVitalGroupRelValue.S_State).append(" =:state");
		map.put("state", "U");
		sql.append(" AND ").append(IBOCmxGroupVitalGroupRelValue.S_GroupCustId).append(" =:groupId");
		map.put("groupId",Long.valueOf(groupId));
		sql.append(" AND ").append(IBOCmxGroupVitalGroupRelValue.S_VgroupId).append(" =:vgroupId");
		map.put("vgroupId", vgroupId);
		IBOCmxGroupVitalGroupRelValue[] aValues = BOCmxGroupVitalGroupRelEngine.getBeans(sql.toString(), map);
		if(aValues != null && aValues.length != 0){
			aValues[0].setState("E");
			saveVitalGroupRel(aValues[0]);
		}
	}

	public IBOCmxVitalGroupCustomerValue queryVatailGroupByVGroupId(String vgroupId) throws Exception
	{
		StringBuffer sql = new StringBuffer();
		HashMap map = new HashMap();
		sql.append(IBOCmxVitalGroupCustomerValue.S_VgroupId).append(" =:vgroupId");
		map.put("vgroupId", vgroupId);
		IBOCmxVitalGroupCustomerValue[] aValues = BOCmxVitalGroupCustomerEngine.getBeans(sql.toString(), map);
		return (aValues == null || aValues.length ==0) ? null : aValues[0];
	}

	public void saveVitalGroup(IQBOCmVitalGroupValue value) throws Exception
	{
		QBOCmVitalGroupEngine.save(value);
	}

	public void saveVitalCustomer(IBOCmxVitalGroupCustomerValue value) throws Exception
	{
		BOCmxVitalGroupCustomerEngine.save(value);
		
	}

	public void saveVitalGroupRel(IBOCmxGroupVitalGroupRelValue value) throws Exception
	{
		BOCmxGroupVitalGroupRelEngine.save(value);
		
	}

}
