package com.asiainfo.crm.cm.customer.group.dao.interfaces;

import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupCustomerOperValue;

public interface ICmCustManagerContactDAO {
	public IQBOCmGroupCustomerOperValue[] queryCustManagerContact(long custId) throws Exception ;
}
