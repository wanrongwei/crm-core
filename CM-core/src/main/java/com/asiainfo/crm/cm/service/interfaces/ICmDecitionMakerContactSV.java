package com.asiainfo.crm.cm.service.interfaces;

import com.asiainfo.crm.cm.model.ivalues.IContactValue;

public interface ICmDecitionMakerContactSV {
	public IContactValue queryDecitionMakerContact(long custId,int contType) throws Exception;
}
