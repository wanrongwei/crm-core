package com.asiainfo.crm.cm.customer.group.dao.impl;

import java.util.Map;

import com.asiainfo.crm.cm.customer.group.bo.BOCmxGroupAccrelDealEngine;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmxGroupAccrelDealDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmxGroupAccrelDealValue;

public class CmxGroupAccrelDealDAOImpl implements ICmxGroupAccrelDealDAO
{

	public long getNewDealId() throws Exception
	{
		return BOCmxGroupAccrelDealEngine.getNewId().longValue();
	}

	public IBOCmxGroupAccrelDealValue[] queryGroupAccrelDeals(String condition, Map parameter, int startNum, int endNum)
			throws Exception
	{

		return BOCmxGroupAccrelDealEngine.getBeans(null, condition, parameter, startNum, endNum, false);
	}

	public void saveGroupAccrelDeal(IBOCmxGroupAccrelDealValue[] accrelDealValues) throws Exception
	{
		BOCmxGroupAccrelDealEngine.saveBatch(accrelDealValues);
	}
	
	public int queryGroupAccrelDealsCount(String condition, Map parameter) throws Exception
	{
		return BOCmxGroupAccrelDealEngine.getBeansCount(condition, parameter);
	}
}
