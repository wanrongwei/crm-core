package com.asiainfo.crm.cm.common.service.impl;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.impl.account.AbstractAccountQueryModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractCmCommonDealModelImpl;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCustMerchantValue;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCustMerchantSV;

public class CmCustMerchantSVImpl implements ICmCustMerchantSV {

	public DataContainer[] queryCustMerchant(String criteria, int startNum,
			int endNum) throws Exception {

		return ((AbstractCmCommonDealModelImpl)CmServiceFactory.getBusiMode(AbstractCmCommonDealModelImpl.class)).queryData(criteria, startNum, endNum);

	}

	public int queryCustMerchantCount(String criteria) throws Exception {
		
		return((AbstractCmCommonDealModelImpl)CmServiceFactory.getBusiMode(AbstractCmCommonDealModelImpl.class)).queryCount(criteria);
	}

	public void saveMerchant(DataContainer[] values) throws Exception {
		
		((AbstractCmCommonDealModelImpl) CmServiceFactory.getBusiMode(AbstractCmCommonDealModelImpl.class)).saveData(values);
	}
	public IBOCmCustMerchantValue queryMerchantInfoById(String custMerchantId) throws Exception {
		return ((AbstractCmCommonDealModelImpl) CmServiceFactory.getBusiMode(AbstractCmCommonDealModelImpl.class)).queryMerchantInfoById(custMerchantId, -1, -1);
	}
}
