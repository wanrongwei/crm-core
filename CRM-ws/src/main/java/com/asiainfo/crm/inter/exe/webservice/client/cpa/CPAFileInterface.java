package com.asiainfo.crm.inter.exe.webservice.client.cpa;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CPAFileInterface extends Remote {

	public SyncIncrementalSubscriberInfoResponse syncIncrementalSubscriberInfo(
			SyncIncrementalSubscriberInfoRequest parameters) throws RemoteException;

}
