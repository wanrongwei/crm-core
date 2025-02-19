package com.asiainfo.crm.cm.customer.group.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.asiainfo.crm.cm.customer.group.bo.QBOCmGroupCustomerOperEngine;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmCustManagerContactDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupCustomerOperValue;

public class CmCustManagerContactDAOImpl implements ICmCustManagerContactDAO{

	@Override
	public IQBOCmGroupCustomerOperValue[] queryCustManagerContact(long custId) throws Exception {
		StringBuffer condition=new StringBuffer();
		Map parameterMap=new HashMap();
		condition.append(IQBOCmGroupCustomerOperValue.S_CustId).append(" = :custId ");
		parameterMap.put("custId", custId);
		return QBOCmGroupCustomerOperEngine.getBeans(condition.toString(), parameterMap);
		
		
	}

}
