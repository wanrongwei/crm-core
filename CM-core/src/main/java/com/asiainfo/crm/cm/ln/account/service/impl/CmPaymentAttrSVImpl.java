package com.asiainfo.crm.cm.ln.account.service.impl;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractCmCommonDealModelImpl;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.ln.account.bo.BOCmCmxAcctPaymentAttrEngine;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmCmxAcctPaymentAttrValue;
import com.asiainfo.crm.cm.ln.account.service.interfaces.ICmPaymentAttrSV;

public class CmPaymentAttrSVImpl implements ICmPaymentAttrSV 
{

	public void saveData(DataContainer[] values) throws Exception 
	{
		((AbstractCmCommonDealModelImpl) CmServiceFactory.getBusiMode(AbstractCmCommonDealModelImpl.class)).saveData(values);
	}

	public IBOCmCmxAcctPaymentAttrValue queryData(String _AttrCode,long _PaymentId)throws Exception
	{
		return BOCmCmxAcctPaymentAttrEngine.getBean(_AttrCode, _PaymentId);
	}
}
