package com.asiainfo.crm.cm.common.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCustMerchantValue;

public interface ICmCustMerchantSV {
	
	public DataContainer[] queryCustMerchant(String criteria, int startNum, int endNum) throws Exception;
	
	public int queryCustMerchantCount(String criteria) throws Exception;
	
	public void saveMerchant(DataContainer[] values)throws Exception;
	
	public IBOCmCustMerchantValue queryMerchantInfoById(String custMerchantId) throws Exception;

}
