package com.asiainfo.crm.cm.service.interfaces;

import com.asiainfo.crm.cm.common.ivalues.IBOIdentificationValue;

public interface ICmIdentificationSV {
	public void save(IBOIdentificationValue[] values)throws Exception;
	public IBOIdentificationValue[] queryIdentification(long custId,int idenType,int idenSubType,String idenNum)throws Exception;
}
