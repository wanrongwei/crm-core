package com.asiainfo.crm.inter.exe.webservice.client.neverbounce;

public class NeverBounceServiceFactory {

	private NeverBounceServiceFactory(){
	}
	
	private static NeverbounceServiceLocator INSTANCE = null;
	
	public static synchronized NeverbounceServiceLocator getService() {
		if(null == INSTANCE){
			INSTANCE = new NeverbounceServiceLocator();
		}
		return INSTANCE;
	}
	
//	public static void main(String[] args) throws Exception{
//		VerifyingEmailRequest request = new VerifyingEmailRequest();
//		VerifyingEmailRequestBody body = new VerifyingEmailRequestBody("799615@qq.com");
//		request.setRequestBody(body);
//		
//		VerifyingEmailResponse resp = NeverBounceServiceFactory.getService().getNeverbouncePort().verifyingEmail(request);
//		System.out.println(resp.getResponseBody().getIsrun());
//	}
}
