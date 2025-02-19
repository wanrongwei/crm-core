package com.asiainfo.crm.inter.exe.webservice.client.admin;

public class GetFilteredAdminsByCustomerIdUsingGETServiceFactory {
	private GetFilteredAdminsByCustomerIdUsingGETServiceFactory() {
		
	}
	
	private static GetFilteredAdminsByCustomerIdUsingGETServiceLocator INSTANCE = null;
	
	public static GetFilteredAdminsByCustomerIdUsingGETServiceLocator getService() {
		if(INSTANCE == null) {
			INSTANCE = new GetFilteredAdminsByCustomerIdUsingGETServiceLocator();
		}
		return INSTANCE;
	}
}
