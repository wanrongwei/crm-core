package com.asiainfo.crm.inter.exe.webservice.client.wimp.dao.interfaces;

import com.asiainfo.crm.inter.exe.webservice.client.wimp.bo.IBOActivateWimpSubscriberValue;

public interface IActWimpSubscriberDAO {
	
	
	public void save(IBOActivateWimpSubscriberValue activateWimpSubscriberValue) throws Exception;

	
	public void save(IBOActivateWimpSubscriberValue[] activateWimpSubscriberValues) throws Exception;

    public IBOActivateWimpSubscriberValue[] queryByBatchId(String batchId) throws Exception;
}
