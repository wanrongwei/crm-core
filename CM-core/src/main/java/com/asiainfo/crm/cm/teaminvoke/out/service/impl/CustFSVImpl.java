package com.asiainfo.crm.cm.teaminvoke.out.service.impl;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmVpmnCustomerValue;
import com.asiainfo.crm.cm.service.interfaces.IVpmnCustomerSV;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICustFSV;


public class CustFSVImpl implements ICustFSV {

	public IBOCmVpmnCustomerValue queryVpmnCustomerByGroupId(long groupId) throws Exception {
		IVpmnCustomerSV vpmnCustomerSV = (IVpmnCustomerSV)ServiceFactory.getService(IVpmnCustomerSV.class);
		return vpmnCustomerSV.queryVpmnCustomerByGroupId(groupId);
	}

}
