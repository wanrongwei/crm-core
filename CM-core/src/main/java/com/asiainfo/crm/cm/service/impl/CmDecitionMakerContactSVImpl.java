package com.asiainfo.crm.cm.service.impl;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.service.interfaces.ICmContactSV;
import com.asiainfo.crm.cm.service.interfaces.ICmDecitionMakerContactSV;

public class CmDecitionMakerContactSVImpl implements ICmDecitionMakerContactSV {

	@Override
	public IContactValue queryDecitionMakerContact(long custId,int contType) throws Exception {
		DataContainer container=new DataContainer();
		container.set(IContactValue.S_ContType, contType);
		container.set(IContactValue.S_CustId, custId);
		ICmContactSV service=(ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
		IContactValue[] values=service.queryCustContacts(container,-1, -1);
		if(values!=null && values.length>0){
			return values[0];
		}
		return null;
	}

}
