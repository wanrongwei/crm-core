package com.asiainfo.crm.cm.dk.customer.service.impl;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.dk.customer.service.interfaces.ICmModifyCustInfoSV;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;

public class CmModifyCustInfoSVImpl implements ICmModifyCustInfoSV{

	@Override
	public void modifyCustInfo(long custId) throws Exception {
		ICmCustomerSV service=(ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue value=(ICustomerValue) service.queryCustomerByCustId(custId);
		value.set(ICustomerValue.S_CustCertType, 7);
		value.set(ICustomerValue.S_CustCertCode, custId);
		service.saveCustomer(value);
	}
}
