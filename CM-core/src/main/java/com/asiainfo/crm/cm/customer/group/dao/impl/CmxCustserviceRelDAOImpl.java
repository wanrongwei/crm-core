package com.asiainfo.crm.cm.customer.group.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.asiainfo.crm.cm.customer.group.bo.BOCmxCustserviceRelEngine;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmxCustserviceRelDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmxCustserviceRelValue;

public class CmxCustserviceRelDAOImpl implements ICmxCustserviceRelDAO{

	public IBOCmxCustserviceRelValue queryCustserviceRelByCountryCode(String countryCode) throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmxCustserviceRelValue.S_CountyCode).append(" = :countryCode");
		condition.append(countryCode);
		IBOCmxCustserviceRelValue[] custServiceRels=BOCmxCustserviceRelEngine.getBeans(condition.toString(),parameterMap);
		if(custServiceRels.length==0){
			return null;
		}
		return custServiceRels[0];
	}
}
