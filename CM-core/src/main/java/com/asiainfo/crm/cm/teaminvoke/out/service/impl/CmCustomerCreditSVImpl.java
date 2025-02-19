package com.asiainfo.crm.cm.teaminvoke.out.service.impl;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.service.interfaces.ICmCustCreditSV;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICmCustomerCreditSV;

public class CmCustomerCreditSVImpl implements ICmCustomerCreditSV {

	@Override
	public long queryCustCredit(long custId, long acctId) throws Exception {
		ICmCustCreditSV service=(ICmCustCreditSV) ServiceFactory.getService(ICmCustCreditSV.class);
		return service.queryCustCredit(custId, acctId);
	}

}
