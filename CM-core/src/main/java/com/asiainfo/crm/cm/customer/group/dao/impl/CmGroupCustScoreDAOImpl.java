package com.asiainfo.crm.cm.customer.group.dao.impl;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import com.asiainfo.crm.cm.common.CmxConstants;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustScoreEngine;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmGroupCustScoreDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustScoreValue;

/** 
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * @ClassName: ICmGroupCustScoreDAO.java
 * @Description: 对企业评分的操作
 * @version: v1.0.0
 * @author: fengjian
 * @date: Jan 12, 2011 2:01:33 PM 
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * Jan 12, 2011	 fengjian           v1.0.0               修改原因
 */
public class CmGroupCustScoreDAOImpl implements ICmGroupCustScoreDAO
{
	public IBOCmGroupCustScoreValue[] queryGroupCustScoresByGroupId(long groupId) throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupCustScoreValue.S_State).append(" = :state ");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		condition.append(" AND ");
		condition.append(IBOCmGroupCustScoreValue.S_GroupCustId).append(" = :groupCustId ");
		parameterMap.put("groupCustId", Long.valueOf(groupId));
		parameterMap.put(IBOCmGroupCustScoreValue.S_CreateDate, BOCmGroupCustScoreEngine.getSysDate());
		return BOCmGroupCustScoreEngine.getBeans(condition.toString(), parameterMap);
	}
	
	public IBOCmGroupCustScoreValue[] queryGroupCustScoresByCondition(long groupId,long year,long quarter) throws Exception{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupCustScoreValue.S_State).append(" = :state ");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		if(groupId>0){
			condition.append(" AND ").append(IBOCmGroupCustScoreValue.S_GroupCustId).append(" = :groupCustId ");
			parameterMap.put("groupCustId", Long.valueOf(groupId));
		}
		if(year>0){
			condition.append(" AND ").append(IBOCmGroupCustScoreValue.S_Year).append(" = :year ");
			parameterMap.put("year", Long.valueOf(year));
		}
		if(quarter>0){
			condition.append(" AND ").append(IBOCmGroupCustScoreValue.S_Quarter).append(" = :quarter ");
			parameterMap.put("quarter", Long.valueOf(quarter));
		}
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, (int)year);
		parameterMap.put(IBOCmGroupCustScoreValue.S_CreateDate,  new Timestamp(calendar.getTimeInMillis()));
		return BOCmGroupCustScoreEngine.getBeans(condition.toString(), parameterMap);
	}
	
	public void  saveGroupCustScores(IBOCmGroupCustScoreValue[] groupCustScores) throws Exception
	{
		BOCmGroupCustScoreEngine.saveBatch(groupCustScores);
	}
	
}
