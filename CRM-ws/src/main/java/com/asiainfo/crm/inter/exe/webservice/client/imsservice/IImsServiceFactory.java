package com.asiainfo.crm.inter.exe.webservice.client.imsservice;

import java.rmi.RemoteException;

public class IImsServiceFactory {
	
	private static Boolean SLOCK = Boolean.FALSE;
	
	private static IImsServiceRemoteLocator service = null;
	
	public static IImsServiceRemoteLocator getService() throws Exception,RemoteException {
		if (SLOCK.equals(Boolean.FALSE)) {
            synchronized(SLOCK) {
             if(SLOCK.equals(Boolean.FALSE)){
            	 service = new IImsServiceRemoteLocator ();
                    SLOCK = Boolean.TRUE;
             }
            }
		}
		return service;
	}

	public static void main(String[] args) throws Exception{
		PbxNumberRange range = new PbxNumberRange();
		range.setMainNumber("111111");
		PbxNumberRange[] ranges = new PbxNumberRange[]{range};
		RequestHead head = new RequestHead();
		head.setBusiCode("1052");
		head.setTenantId("21");
		head.setOperatorCode(100000028);
		//DoPBXNumberRangeSyncResponse resp = IImsServiceFactory.getService().getIImsService().doPBXNumberRangeSync(head , ranges);
	}
}
