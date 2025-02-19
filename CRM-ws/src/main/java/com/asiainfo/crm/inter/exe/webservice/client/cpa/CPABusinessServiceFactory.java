package com.asiainfo.crm.inter.exe.webservice.client.cpa;

import java.rmi.RemoteException;

public class CPABusinessServiceFactory {
	
	private static Boolean SLOCK = Boolean.FALSE;
	
	private static CPAFileInterfaceServiceLocator service = null;
	
	public static CPAFileInterfaceServiceLocator getService() throws Exception,RemoteException {
		if (SLOCK.equals(Boolean.FALSE)) {
            synchronized(SLOCK) {
             if(SLOCK.equals(Boolean.FALSE)){
            	 service = new CPAFileInterfaceServiceLocator ();
                    SLOCK = Boolean.TRUE;
             }
            }
		}
		return service;
	}
}
