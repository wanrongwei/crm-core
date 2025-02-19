package com.asiainfo.crm.cm.ln.account.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmCmxAcctPaymentAttrValue;

public interface ICmPaymentAttrSV 
{
	public void saveData(DataContainer[] values) throws Exception;
	
	public IBOCmCmxAcctPaymentAttrValue queryData(String _AttrCode,long _PaymentId)throws Exception;
}
