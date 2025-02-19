package com.asiainfo.crm.cm.custgroup.dao.impl;

import com.asiainfo.crm.cm.custgroup.bo.BOCmCustomerQuitGroupEngine;
import com.asiainfo.crm.cm.custgroup.dao.interfaces.ICmCustomerQuitGroupDAO;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmCustomerQuitGroupValue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import com.asiainfo.crm.res.common.valuebean.FieldValue;
import com.asiainfo.crm.util.StringUtil;

public class CmCustomerQuitGroupDAOImpl implements ICmCustomerQuitGroupDAO
{
	/**
	 * 根据查询条件查询  退群客户沉淀表  信息（标准格式）
	 */
	public IBOCmCustomerQuitGroupValue[] getCmCustomerQuitGroupInfos(String condition, HashMap parameter, int start, int end) throws Exception
	{
		return BOCmCustomerQuitGroupEngine.getBeans(null, condition, parameter, start, end, false);
	}
	
	/**
	 * 根据查询条件查询  退群客户沉淀表  数量（标准格式）
	 */
	public int getCmCustomerQuitGroupCount(String condition, HashMap parameter) throws Exception
	{
		return BOCmCustomerQuitGroupEngine.getBeansCount(condition, parameter);
	}	

	public IBOCmCustomerQuitGroupValue[] getCmCustomerQuitGroupInfosByMap(HashMap paramMap, int start, int end) throws Exception
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
		return BOCmCustomerQuitGroupEngine.getBeans(null, condition.toString(), conditionMap, start, end, false);
	}

	public int getCmCustomerQuitGroupCountByMap(HashMap paramMap) throws Exception
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
		return BOCmCustomerQuitGroupEngine.getBeansCount(condition.toString(), conditionMap);
	}

	/**
	 * 根据查询条件查询  退群客户沉淀表  数量（BySql）
	 */
	public IBOCmCustomerQuitGroupValue[] getCmCustomerQuitGroupInfosBySql(String sql, HashMap parameter) throws Exception
	{
		return BOCmCustomerQuitGroupEngine.getBeansFromSql(sql, parameter);
	}

	/**
	 * 根据查询条件查询  退群客户沉淀表  数量（BySql）
	 */
	public int getCmCustomerQuitGroupCountBySql(String sql, HashMap parameter) throws Exception
	{
		return BOCmCustomerQuitGroupEngine.getBeansFromSql(sql, parameter).length;
	}

	public void saveCmCustomerQuitGroupValue(IBOCmCustomerQuitGroupValue cmCustomerQuitGroupValue) throws Exception
	{
		BOCmCustomerQuitGroupEngine.save(cmCustomerQuitGroupValue);
	}

	public void deleteCmCustomerQuitGroupValue(IBOCmCustomerQuitGroupValue cmCustomerQuitGroupValue) throws Exception
	{
		BOCmCustomerQuitGroupEngine.save(cmCustomerQuitGroupValue);
	}

	public void saveBatchCmCustomerQuitGroupValues(IBOCmCustomerQuitGroupValue[] cmCustomerQuitGroupValues) throws Exception
	{
		BOCmCustomerQuitGroupEngine.saveBatch(cmCustomerQuitGroupValues);
	}

	public void deleteBatchCmCustomerQuitGroupValues(IBOCmCustomerQuitGroupValue[] cmCustomerQuitGroupValues) throws Exception
	{
		BOCmCustomerQuitGroupEngine.saveBatch(cmCustomerQuitGroupValues);
	}

}
