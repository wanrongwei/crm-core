package com.asiainfo.crm.so.order.rboss.service.interfaces;

import java.rmi.RemoteException;



public interface IRecordLogSV {
	public void saveLog(long custId, long customerOrderId, long busiId, String billId, long userId, String interfaceName,
			String logInfo, int inOut, String remarks) throws Exception ,RemoteException;
      
	public void flush() throws Exception;

}
