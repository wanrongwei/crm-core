package com.asiainfo.crm.inter.exe.activemq.client.optin.service.interfaces;

public interface IOptinSyncC34CrmSV {

	/**
	 * Send optin info to C3 real time.
	 * 
	 * @param billId
	 * @param optinFlag
	 *            1: Add 2:Delete 3:Modify
	 * @param country
	 * @param action
	 * @throws Exception
	 */
	public void optinSyncRealtime(String billId, long optinFlag, String country, long action) throws Exception;

}
