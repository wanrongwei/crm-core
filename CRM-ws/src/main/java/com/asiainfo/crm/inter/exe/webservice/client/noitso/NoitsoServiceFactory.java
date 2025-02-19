package com.asiainfo.crm.inter.exe.webservice.client.noitso;

public class NoitsoServiceFactory {
	
	private NoitsoServiceFactory() {
		
	}
	
	public static final CreditScoreService_ServiceLocator getService() {
		return NoitsoServiceHolder.INSTANCE;
	}
	
	private static class NoitsoServiceHolder{
		private static final CreditScoreService_ServiceLocator INSTANCE = new CreditScoreService_ServiceLocator();
	}

//	public static void main(String[] args) throws Exception{
		
//		CheckCreditRequest request = new CheckCreditRequest();
//		
//		CheckCreditRequestBody requestBody = new CheckCreditRequestBody();
//		request.setRequestBody(requestBody);
//		
//		requestBody.setSystemId("Veris");
//		requestBody.setCpr("0408474191");
//		requestBody.setB2CCustomerId("21210111529675");
//		requestBody.setAgent("TEAMLEG");
//		requestBody.setStoreId("DK-Bilka Sondeborg");
//		
//		PurchaseInformation purchaseInformation = new PurchaseInformation();
//		requestBody.setPurchaseInformation(purchaseInformation);
//		
//		purchaseInformation.setNoOfSubscriptions(0);
//		purchaseInformation.setIsHighRiskDevice(false);
//		purchaseInformation.setIsNumberPorting(true);
//		purchaseInformation.setAmount(0L);
//		purchaseInformation.setSwitchAmount(200L);
//		purchaseInformation.setHardwareListPrice(1L);
//		purchaseInformation.setHardwareAskingPrice(5l);
//		
//		
//		CheckCreditResponse  rsp = NoitsoServiceFactory.getService().getCreditScoreService().checkCredit(request);
//		System.out.println(rsp.getResponseBody().getSystemDecision());
		
//		GetCreditScoringApplicationRequest request = new GetCreditScoringApplicationRequest();
//		
//		GetCreditScoringApplicationRequestBody requestBody = new GetCreditScoringApplicationRequestBody();
//		request.setRequestBody(requestBody);
//		
//		requestBody.setApplicationId("100006");
//		
//		GetCreditScoringApplicationResponse rsp = NoitsoServiceFactory.getService().getCreditScoreService().getCreditScoringApplication(request);
//		System.out.println(rsp.getResponseBody().getSystemDecision());
//		
//
//	}

}
