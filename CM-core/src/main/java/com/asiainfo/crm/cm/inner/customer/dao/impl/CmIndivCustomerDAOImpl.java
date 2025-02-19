package com.asiainfo.crm.cm.inner.customer.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.SNUtil;
import com.asiainfo.crm.cm.common.CmxConstants;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivCustomerEngine;
import com.asiainfo.crm.cm.inner.customer.dao.interfaces.ICmIndivCustomerDAO;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;

public class CmIndivCustomerDAOImpl implements ICmIndivCustomerDAO
{

	public IBOCmIndivCustomerValue[] queryIndivCustomers(String condition, Map parameter) throws Exception
	{
		StringBuilder sbCondition = new StringBuilder(condition);
		// TODO：后续需要将这些过滤条件加上
		// sbCondition.append(" AND ").append(IBOCmIndivCustomerValue.S_EffectiveDate).append(" <=
		// ").append(":currentDate ");
		// sbCondition.append(" AND ").append(IBOCmIndivCustomerValue.S_ExpireDate).append(" > ").append(":currentDate
		// ");
		// parameter.put("currentDate", BOCmIndivCustomerEngine.getSysDate());
		sbCondition.append(" AND ").append(IBOCmIndivCustomerValue.S_State).append(" = ").append(":state ");
		parameter.put("state", CmxConstants.RECORD_STATE_USE);

		return BOCmIndivCustomerEngine.getBeans(sbCondition.toString(), parameter);
	}

	public IBOCmIndivCustomerValue[] queryIndivCustomers(String condition, Map parameter, int startIndex, int endIndex)
			throws Exception
	{
		StringBuilder sbCondition = new StringBuilder(condition);
		// TODO：后续需要将这些过滤条件加上
		// sbCondition.append(" AND ").append(IBOCmIndivCustomerValue.S_EffectiveDate).append(" <=
		// ").append(":currentDate ");
		// sbCondition.append(" AND ").append(IBOCmIndivCustomerValue.S_ExpireDate).append(" > ").append(":currentDate
		// ");
		// parameter.put("currentDate", BOCmIndivCustomerEngine.getSysDate());
		sbCondition.append(" AND ").append(IBOCmIndivCustomerValue.S_State).append(" = ").append(":state ");
		parameter.put("state", CmxConstants.RECORD_STATE_USE);

		return BOCmIndivCustomerEngine.getBeans(null, condition, parameter, startIndex, endIndex, false);
	}

	public int queryIndivCustomersCount(String condition, Map parameter) throws Exception
	{
		StringBuilder sbCondition = new StringBuilder(condition);
		// TODO：后续需要将这些过滤条件加上
		// sbCondition.append(" AND ").append(IBOCmIndivCustomerValue.S_EffectiveDate).append(" <=
		// ").append(":currentDate ");
		// sbCondition.append(" AND ").append(IBOCmIndivCustomerValue.S_ExpireDate).append(" > ").append(":currentDate
		// ");
		// parameter.put("currentDate", BOCmIndivCustomerEngine.getSysDate());
		sbCondition.append(" AND ").append(IBOCmIndivCustomerValue.S_State).append(" = ").append(":state ");
		parameter.put("state", CmxConstants.RECORD_STATE_USE);

		return BOCmIndivCustomerEngine.getBeansCount(condition, parameter);
	}

	public IBOCmIndivCustomerValue queryIndivCustomerById(long indivCustId) throws Exception
	{
		IBOCmIndivCustomerValue retValue = null;

		StringBuilder condition = new StringBuilder("1=1");
		Map parameter = new HashMap();

		condition.append(" AND ").append(IBOCmIndivCustomerValue.S_CustId).append(" = ").append(":indivCustId ");
		parameter.put("indivCustId", Long.valueOf(indivCustId));
		IBOCmIndivCustomerValue[] values = BOCmIndivCustomerEngine.getBeans(condition.toString(), parameter);
		if ((values != null))
		{
			if (values.length == 1)
			{
				retValue = values[0];
			}
			else if (values.length > 1)
			{
//				String errorInfo = new StringBuilder().append(IBOCmIndivCustomerValue.S_IndivCustId).append(" = ")
//						.append(indivCustId).toString();
//				if (log.isErrorEnabled())
//				{
//					log.error(CrmLocaleFactory.getResource("CMS0003004", errorInfo));
//				}
//				ExceptionUtil.throwBusinessException("CMS0003004", errorInfo);
			}
		}
		return retValue;
	}

	public void saveIndivCustomer(IBOCmIndivCustomerValue indivCustValue) throws Exception
	{
		if (indivCustValue.isNew())
		{
			// indivCustValue.setEffectiveDate(BOCmIndivCustomerEngine.getSysDate());
			// indivCustValue.setExpireDate(TimeUtil.getMaxExpire());
			indivCustValue.setState(CmxConstants.RECORD_STATE_USE);
		}
		indivCustValue.setCustName(indivCustValue.getCustName().trim());
		BOCmIndivCustomerEngine.save(indivCustValue);
	}

	public long getNewId() throws Exception
	{// 调用平台统一提供的生成个人编号的方法
		return SNUtil.generatorPersonCustId(CenterFactory.getCenterInfo().getRegion());
	}

	public IBOCmIndivCustomerValue queryOnlyIndivCustById(long indivCustId) throws Exception {
		return BOCmIndivCustomerEngine.getBean(indivCustId);
	}

	
}
