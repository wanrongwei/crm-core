package com.asiainfo.crm.cm.service.impl;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupMemberByCustIdSV;
import com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue;

public class CmGroupMemberByCustIdSVImpl implements ICmGroupMemberByCustIdSV {

	@Override
	public ICustomerValue queryCustomerByIndivCustId(long custId)
			throws Exception {
		if (custId > 0) {
			DataContainer condition = new DataContainer();
			condition.set(IGroupMemberValue.S_MemberCustId, custId);
			ICmCustomerSV service = (ICmCustomerSV) ServiceFactory
					.getService(ICmCustomerSV.class);
			IGroupMemberValue[] values = service.queryGroupMembers(condition,
					-1, -1);
			if (values!=null && values.length > 0) {
				long id = values[0].getCustId();
				ICustomerValue value = service.queryCustomerByCustId(id);
				return value;
			}
		}
		return null;
	}
	
}
