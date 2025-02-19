package com.asiainfo.crm.cm.custview.dao.impl;

import com.asiainfo.crm.cm.custview.bo.BOEmailWhiteListsEngine;
import com.asiainfo.crm.cm.custview.dao.interfaces.IEmailWhiteListsDAO;
import com.asiainfo.crm.cm.custview.ivalues.IBOEmailWhiteListsValue;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import com.asiainfo.crm.res.common.valuebean.FieldValue;
import com.asiainfo.crm.util.StringUtil;

public class EmailWhiteListsDAOImpl implements IEmailWhiteListsDAO
{
	/**
	 * 根据查询条件查询  Email白名单表  信息（标准格式）
	 */
	public IBOEmailWhiteListsValue[] getEmailWhiteListsInfos(String condition, HashMap parameter, int start, int end) throws Exception
	{
		return BOEmailWhiteListsEngine.getBeans(null, condition, parameter, start, end, false);
	}
	
	/**
	 * 根据查询条件查询  Email白名单表  数量（标准格式）
	 */
	public int getEmailWhiteListsCount(String condition, HashMap parameter) throws Exception
	{
		return BOEmailWhiteListsEngine.getBeansCount(condition, parameter);
	}	

	public IBOEmailWhiteListsValue[] getEmailWhiteListsInfosByMap(HashMap paramMap, int start, int end) throws Exception
	{
		StringBuilder condition = new StringBuilder(32);
		HashMap conditionMap = new HashMap();
		Set set = paramMap.keySet();
		Iterator it = set.iterator();
		Object key = null;
		FieldValue fieldValue = null;
		condition.append(" 1=1 ");
		Map map = null;
		String tmp = null;
		while (it.hasNext())
		{
			key = it.next();
			fieldValue = (FieldValue) paramMap.get((String) key);
			tmp = fieldValue.toCondition();
			if (!StringUtil.isEmpty(tmp))
			{
				condition.append(tmp);
			}
			map = fieldValue.toConditionValue();
			if (!StringUtil.isEmpty(map))
			{
				conditionMap.putAll(map);
				map.clear();
			}
		}
		return BOEmailWhiteListsEngine.getBeans(null, condition.toString(), conditionMap, start, end, false);
	}

	public int getEmailWhiteListsCountByMap(HashMap paramMap) throws Exception
	{
		StringBuilder condition = new StringBuilder(32);
		HashMap conditionMap = new HashMap();
		Set set = paramMap.keySet();
		Iterator it = set.iterator();
		Object key = null;
		FieldValue fieldValue = null;
		condition.append(" 1=1 ");
		Map map = null;
		String tmp = null;
		while (it.hasNext())
		{
			key = it.next();
			fieldValue = (FieldValue) paramMap.get((String) key);
			tmp = fieldValue.toCondition();
			if (!StringUtil.isEmpty(tmp))
			{
				condition.append(tmp);
			}
			map = fieldValue.toConditionValue();
			if (!StringUtil.isEmpty(map))
			{
				conditionMap.putAll(map);
				map.clear();
			}
		}
		return BOEmailWhiteListsEngine.getBeansCount(condition.toString(), conditionMap);
	}

	/**
	 * 根据查询条件查询  Email白名单表  数量（BySql）
	 */
	public IBOEmailWhiteListsValue[] getEmailWhiteListsInfosBySql(String sql, HashMap parameter) throws Exception
	{
		return BOEmailWhiteListsEngine.getBeansFromSql(sql, parameter);
	}

	/**
	 * 根据查询条件查询  Email白名单表  数量（BySql）
	 */
	public int getEmailWhiteListsCountBySql(String sql, HashMap parameter) throws Exception
	{
		return BOEmailWhiteListsEngine.getBeansFromSql(sql, parameter).length;
	}

	public void saveEmailWhiteListsValue(IBOEmailWhiteListsValue emailWhiteListsValue) throws Exception
	{
		BOEmailWhiteListsEngine.save(emailWhiteListsValue);
	}

	public void deleteEmailWhiteListsValue(IBOEmailWhiteListsValue emailWhiteListsValue) throws Exception
	{
		BOEmailWhiteListsEngine.save(emailWhiteListsValue);
	}

	public void saveBatchEmailWhiteListsValues(IBOEmailWhiteListsValue[] emailWhiteListsValues) throws Exception
	{
		BOEmailWhiteListsEngine.saveBatch(emailWhiteListsValues);
	}

	public void deleteBatchEmailWhiteListsValues(IBOEmailWhiteListsValue[] emailWhiteListsValues) throws Exception
	{
		BOEmailWhiteListsEngine.saveBatch(emailWhiteListsValues);
	}

}
