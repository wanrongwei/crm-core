package com.asiainfo.crm.cm.teaminvoke.out.dao.impl;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.common.ServiceManager;
import com.ai.common.util.TimeUtil;
import com.asiainfo.crm.cm.inner.contact.bo.BOCmContactEngine;
import com.asiainfo.crm.cm.inner.contact.ivalues.IBOCmContactValue;
import com.asiainfo.crm.cm.inner.customer.bo.QBOCmIndivCustAndContactEngine;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmIndivCustAndContactValue;
import com.asiainfo.crm.cm.teaminvoke.out.dao.interfaces.ICmIndivCustAndContactDAO;

public class CmIndivCustAndContactDAOImpl implements ICmIndivCustAndContactDAO
{

	public IQBOCmIndivCustAndContactValue queryIndivCustAndContactById(long indivCustId) throws Exception
	{
		Map parameter = new HashMap();
		StringBuilder condition = new StringBuilder();
		Timestamp sysdate = ServiceManager.getIdGenerator().getSysDate();
		 Timestamp curMaxDate = TimeUtil.getCurrentDayEndDate(sysdate);
		condition.append(IQBOCmIndivCustAndContactValue.S_IndivCustId).append(" = :indivCustId ");
		parameter.put("indivCustId", Long.valueOf(indivCustId));
		condition.append(" AND ").append(IQBOCmIndivCustAndContactValue.S_EffectiveDate).append(" <= ").append(
				":currentDate ");
		condition.append(" AND ").append(IQBOCmIndivCustAndContactValue.S_ExpireDate).append(" > ").append(
				" now() ");
		parameter.put("currentDate", curMaxDate);
		IQBOCmIndivCustAndContactValue[] indivCustAndContactValues = QBOCmIndivCustAndContactEngine.getBeans(condition
				.toString(), parameter);
		return (indivCustAndContactValues == null || indivCustAndContactValues.length == 0) ? null
				: indivCustAndContactValues[0];
	}

	public void saveContactValue(IBOCmContactValue contactValue) throws Exception {
		BOCmContactEngine.save(contactValue);
	}

	public long getNewId() throws Exception{
		return BOCmContactEngine.getNewId().longValue();
	}



	
}
