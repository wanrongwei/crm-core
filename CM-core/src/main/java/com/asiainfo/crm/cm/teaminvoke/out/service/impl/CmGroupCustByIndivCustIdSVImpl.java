package com.asiainfo.crm.cm.teaminvoke.out.service.impl;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupMemberByCustIdSV;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICmGroupCustByIndivCustIdSV;

public class CmGroupCustByIndivCustIdSVImpl implements ICmGroupCustByIndivCustIdSV {

	@Override
	public ICustomerValue queryCustomerByIndivCustId(long custId)
			throws Exception {
		ICmGroupMemberByCustIdSV service=(ICmGroupMemberByCustIdSV) ServiceFactory.getService(ICmGroupMemberByCustIdSV.class);
		return service.queryCustomerByIndivCustId(custId);
	}

}
