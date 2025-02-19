package com.asiainfo.crm.inter.exe.webservice.client.ott;

public class OttServiceFactory {

	private OttServiceFactory() {
	}
	
	public static final OttService_ServiceLocator getService() {
		return OttServiceHolder.INSTANCE;
	}
	
	private static class OttServiceHolder{
		private static final OttService_ServiceLocator INSTANCE = new OttService_ServiceLocator();
	}
	
	
//	public static void main(String[] args) throws Exception{
//		PrecheckRequest parameters = new PrecheckRequest();
//		PrecheckRequestBody requestBody = new PrecheckRequestBody();
//		parameters.setRequestBody(requestBody);
//		PreCheckQuery query = new PreCheckQuery();
//		query.setCustomerId("2100000000000001");
//		query.setVendor("EyeOnId");
//		query.setProductLine("EmailMonitoring");
//		query.setProductVariant("Medium");
//		query.setSubscriberId("0");
//		query.setExtend("email=asia@aii.com&name=emea");
//		requestBody.setQuery(query);
//		
//		PrecheckResponse  rsp = OttServiceFactory.getService().getOttService().precheck(parameters);
//		System.out.println(rsp.getResponseBody().getErrorCode());
		
//		PlaceOrderEventRequest parameters = new PlaceOrderEventRequest();
//		OttOrderEvent requestBody = new OttOrderEvent();
//		parameters.setRequestBody(requestBody);
//		requestBody.setOperatorId("43010000111");
//		requestBody.setOrderId("3210219660001256");
//		requestBody.setOrderLineId("ADE0991235511");
//		requestBody.setEventType(OttOrderEventEventType.Create);
//		requestBody.setCustomerId("2100000000000001");
//		requestBody.setOldCustomerId("0");
//		requestBody.setSubscriberId("0");
//		Product product = new Product();
//		requestBody.setProduct(product);
//		product.setName("Voip");
//		product.setVendor("EyeOnId");
//		product.setPloductLine("OneDrive");
//		product.setProductVariant("small");
//		
//		Attributes[] attributes = new Attributes[1];
//		attributes[0] = new Attributes();
//		attributes[0].setName("a");
//		attributes[0].setValue("b");
//		attributes[0].setMetadata("M");
//		product.setAttributes(attributes);
//		
//		
//		requestBody.setCallbackExpected(false);
//		
//		PlaceOrderEventResponse rsp = OttServiceFactory.getService().getOttService().placeOrderEvent(parameters);
//		System.out.println(rsp.getResponseBody().getStatus());
//	}
	
}
