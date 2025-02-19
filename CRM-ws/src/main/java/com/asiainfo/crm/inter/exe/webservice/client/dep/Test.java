package com.asiainfo.crm.inter.exe.webservice.client.dep;


public class Test {
	
	public static void main(String[] args) throws Exception {
		testBulkEnrollDevices();
	//	servive.bulkEnrollDevices(parameters);
	}
	public  static void testBulkEnrollDevices()throws Exception {
		AppleDEPServiceLocator locator = new AppleDEPServiceLocator();
		AppleDEP servive = locator.getAppleDEPSYNCPort();
		BulkEnrollDevicesRequest request = new BulkEnrollDevicesRequest();
		BulkEnrollDevicesRequestBody reqeustBody = new BulkEnrollDevicesRequestBody();
		RequestContext requestContext = new RequestContext();
		requestContext.setShipTo("4321");
		requestContext.setLangCode("en");
		requestContext.setTimeZone("");
		reqeustBody.setDepResellerId("100");
		reqeustBody.setTransactionId("20160211");
		reqeustBody.setRequestContext(requestContext);
		request.setRequestBody(reqeustBody);
		BulkEnrollDevicesResponse response = servive.bulkEnrollDevices(request);
		BulkEnrollDevicesResponseBody body = response.getResponseBody();
		System.out.println(body);
		//servive.bulkEnrollDevices(parameters);
	}

}
