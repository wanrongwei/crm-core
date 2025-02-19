package com.asiainfo.crm.inter.exe.webservice.client.poa;

public class PoaServiceFactory {

	private PoaServiceFactory() {

	}
	public static final AgreementGetServiceLocator getService() {
		return PoaServiceHolder.INSTANCE;
	}

	private static class PoaServiceHolder {
		private static final AgreementGetServiceLocator INSTANCE = new AgreementGetServiceLocator();
	}

	public static void main(String[] args) throws Exception {
		AgreementGetRequest req = new AgreementGetRequest();
		AgreementGetRequestBody requestBody = new AgreementGetRequestBody();
		req.setRequestBody(requestBody);
		requestBody.setAgreementType("1111");
		requestBody.setPartyId("2222");

		AgreementGetResponse rsp = PoaServiceFactory.getService().getAgreementGetPort().agreementGet(req);
		String result = rsp.getResponseBody().getResults();
		System.out.println(result);

	}
}
