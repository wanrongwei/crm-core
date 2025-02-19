package com.asiainfo.crm.cm.teaminvoke.out.service.impl;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICmCustManagerContactSV;

public class CmCustManagerContactSVImpl implements ICmCustManagerContactSV{

	@Override
	public String queryCustManagerContact(long custId) throws Exception {
		com.asiainfo.crm.cm.service.interfaces.ICmCustManagerContactSV service=(com.asiainfo.crm.cm.service.interfaces.ICmCustManagerContactSV) ServiceFactory.getService(com.asiainfo.crm.cm.service.interfaces.ICmCustManagerContactSV.class);
		return service.queryCustManagerContact(custId);
	}

}
