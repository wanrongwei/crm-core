package com.asiainfo.crm.cm.teaminvoke.out.service.impl;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICmDecitionMakerContactSV;

public class CmDecitionMakerContactSVImpl implements ICmDecitionMakerContactSV {

	@Override
	public IContactValue queryDecitionMakerContact(long custId,int contType) throws Exception {
		com.asiainfo.crm.cm.service.interfaces.ICmDecitionMakerContactSV service=(com.asiainfo.crm.cm.service.interfaces.ICmDecitionMakerContactSV) ServiceFactory.getService(com.asiainfo.crm.cm.service.interfaces.ICmDecitionMakerContactSV.class);
		return service.queryDecitionMakerContact(custId,contType);
	}

}
