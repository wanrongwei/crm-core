package com.asiainfo.crm.inter.exe.webservice.client.rcp;


public class RcpServiceFactory {

	private RcpServiceFactory() {
		
	}
	
	public static final RetractCprPermissionUsingPUTServiceLocator getService() {
		return RcpServiceHolder.INSTANCE;
	}
	
	private static class RcpServiceHolder{
		private static final RetractCprPermissionUsingPUTServiceLocator INSTANCE = new RetractCprPermissionUsingPUTServiceLocator();
	}
	
	public static void main(String[] args) throws Exception {
		RetractCprPermissionUsingPUTRequest req = new RetractCprPermissionUsingPUTRequest();
		RetractCprPermissionUsingPUTRequestBody requestBody = new RetractCprPermissionUsingPUTRequestBody();
		req.setRequestBody(requestBody);
		requestBody.setCustomerId("21210917736024");
		requestBody.setCustomerIdType("1");
		requestBody.setUserConsentSource("11");
		requestBody.setUserConsentSourceType("111");

		RetractCprPermissionUsingPUTResponse rsp = RcpServiceFactory.getService()
				.getretractCprPermissionUsingPUTPort().retractCprPermissionUsingPUT(req);
		String result = rsp.getResponseBody().getResults();
		System.out.println(result);

	}
}
