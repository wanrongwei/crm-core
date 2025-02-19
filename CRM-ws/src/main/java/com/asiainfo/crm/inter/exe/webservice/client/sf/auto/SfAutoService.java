package com.asiainfo.crm.inter.exe.webservice.client.sf.auto;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SfAutoService extends Remote {

	public int queryCoListCount(String districtID, String coName, String longName) throws RemoteException;

	public String queryCoList(String districtID, String coName, String longName, int startIndex, int endIndex)
			throws RemoteException;

}
