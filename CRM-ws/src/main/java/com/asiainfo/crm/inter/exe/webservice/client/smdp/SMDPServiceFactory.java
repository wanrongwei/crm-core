package com.asiainfo.crm.inter.exe.webservice.client.smdp;

public class SMDPServiceFactory {
	
	private SMDPServiceFactory() {
		
	}
	
	private static class SMDPServiceHolder{
		private static final SMDPPortBindingQSServiceLocator INSTANCE = new SMDPPortBindingQSServiceLocator();
	}
	
	public static final SMDPPortBindingQSServiceLocator getService() {
		return SMDPServiceHolder.INSTANCE;
	}

//	public static void main(String[] args) throws Exception{
//		ConfirmOrderRequest parameters = new ConfirmOrderRequest();
//		
//		ConfirmOrderRequestBody requestBody = new ConfirmOrderRequestBody();
//		requestBody.setEid("123215521");
//		requestBody.setReleaseFlag("Y");
//		parameters.setRequestBody(requestBody);
//		
//		ConfirmOrderResponse rsp = SMDPServiceFactory.getService().getSMDPPortBindingQSPort().confirmOrder(parameters);
//		System.out.println(rsp.getResponseBody().getSmdpAddress());
//		
//		RemoveProfileRequest removeParams = new RemoveProfileRequest();
//		
//		RemoveProfileRequestBody body = new RemoveProfileRequestBody();
//		body.setEid("12321415125");
//		body.setIccidList(new String[] {"890871623512551897621"});
//		removeParams.setRequestBody(body);
//		RemoveProfileResponse  returnParam = SMDPServiceFactory.getService().getSMDPPortBindingQSPort().removeProfile(removeParams);
//		System.out.println(returnParam.getResponseBody().getIccidList());
//
//	}

}
