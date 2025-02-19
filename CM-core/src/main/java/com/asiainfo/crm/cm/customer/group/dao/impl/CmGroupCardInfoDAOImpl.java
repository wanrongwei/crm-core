package com.asiainfo.crm.cm.customer.group.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmxConstants;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCardInfoEngine;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmGroupCardInfoDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCardInfoValue;

public class CmGroupCardInfoDAOImpl implements ICmGroupCardInfoDAO
{

	public IBOCmGroupCardInfoValue[] queryGroupCardInfo(long groupCustId, int busiType, int start, int end)
			throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition = condition.append(IBOCmGroupCardInfoValue.S_GroupCustId).append(" = :groupCustId ");
		parameterMap.put("groupCustId", Long.valueOf(groupCustId));
		condition.append(" AND ");
		if (busiType > 0)
		{
			condition.append(IBOCmGroupCardInfoValue.S_BusiType).append(" =:busiType ");
			parameterMap.put("busiType", Integer.valueOf(busiType));
			condition.append(" AND ");
		}
		condition.append(IBOCmGroupCardInfoValue.S_State).append(" =:state ");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmGroupCardInfoEngine.getBeans(null, condition.toString(), parameterMap, start, end, false);
	}

	public int queryGroupCardInfoCount(long groupCustId, int busiType) throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition = condition.append(IBOCmGroupCardInfoValue.S_GroupCustId).append(" = :groupCustId ");
		parameterMap.put("groupCustId", Long.valueOf(groupCustId));
		condition.append(" AND ");
		if (busiType > 0)
		{
			condition.append(IBOCmGroupCardInfoValue.S_BusiType).append(" =:busiType ");
			parameterMap.put("busiType", Integer.valueOf(busiType));
			condition.append(" AND ");
		}
		condition.append(IBOCmGroupCardInfoValue.S_State).append(" =:state ");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmGroupCardInfoEngine.getBeansCount(condition.toString(), parameterMap);
	}

	public void saveGroupCardInfos(IBOCmGroupCardInfoValue[] groupCardInfoValues) throws Exception
	{
		BOCmGroupCardInfoEngine.saveBatch(groupCardInfoValues);
	}

	public IBOCmGroupCardInfoValue[] queryGroupCardInfo(long groupCustId, int busiType, String billId) throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition = condition.append(IBOCmGroupCardInfoValue.S_GroupCustId).append(" = :groupCustId ");
		parameterMap.put("groupCustId", Long.valueOf(groupCustId));
		condition.append(" AND ");
		condition.append(IBOCmGroupCardInfoValue.S_BusiType).append(" =:busiType ");
		parameterMap.put("busiType", Integer.valueOf(busiType));
		condition.append(" AND ");
		condition.append(IBOCmGroupCardInfoValue.S_BillId).append(" =:billId ");
		parameterMap.put("billId", billId);
		condition.append(" AND ");
		condition.append(IBOCmGroupCardInfoValue.S_State).append(" =:state ");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmGroupCardInfoEngine.getBeans(condition.toString(), parameterMap);
	}

	public long getNewId() throws Exception
	{
		return BOCmGroupCardInfoEngine.getNewId().longValue();
	}

}
