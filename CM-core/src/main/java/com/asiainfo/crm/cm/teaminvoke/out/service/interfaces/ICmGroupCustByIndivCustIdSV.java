package com.asiainfo.crm.cm.teaminvoke.out.service.interfaces;

import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;

public interface ICmGroupCustByIndivCustIdSV {
	public ICustomerValue queryCustomerByIndivCustId(long custId)
			throws Exception;
}
