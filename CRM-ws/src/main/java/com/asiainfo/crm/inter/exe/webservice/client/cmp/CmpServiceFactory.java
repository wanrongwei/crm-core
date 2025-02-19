package com.asiainfo.crm.inter.exe.webservice.client.cmp;


public class CmpServiceFactory {

	private CmpServiceFactory() {
		
	}
	
	public static final CheckMarketingPermissionUsingServiceLocator getService() {
		return CmpServiceHolder.INSTANCE;
	}
	
	private static class CmpServiceHolder{
		private static final CheckMarketingPermissionUsingServiceLocator INSTANCE = new CheckMarketingPermissionUsingServiceLocator();
	}
	
	/*public static void main(String[] args) throws Exception {
		CheckMarketingPermissionUsingRequest req = new CheckMarketingPermissionUsingRequest();
		CheckMarketingPermissionUsingRequestBody requestBody = new CheckMarketingPermissionUsingRequestBody();
		req.setRequestBody(requestBody);
		Ids id = new Ids();
		Ids[] ids = new Ids[1];
		id.setId("400001456134");
		ids[0]=id;
		requestBody.setId(ids);
		requestBody.setIdType("2");

		CheckMarketingPermissionUsingResponse rsp = CmpServiceFactory.getService()
				.getCheckMarketingPermissionUsingPort().checkMarketingPermissionUsing(req);
		Resultinfo[] result = rsp.getResponseBody().getResults();
		System.out.println(result[0].getUserId());

	}*/
}
