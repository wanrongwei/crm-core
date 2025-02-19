package com.asiainfo.crm.inter.exe.webservice.client.dawa;

public class DawsServiceFactory {
	
	private DawsServiceFactory() {
	}

	private static class DawsServiceHolder {

        private static final DawsPortBindingQSServiceLocator INSTANCE = new DawsPortBindingQSServiceLocator();

    }
	
	public static final DawsPortBindingQSServiceLocator getService() {
		return DawsServiceHolder.INSTANCE;
	}
	
//	public static void main(String[] args) throws Exception{
//		AddressRequest parameters = new AddressRequest();
//		
//		AddressRequestBody body = new AddressRequestBody();
//		parameters.setRequestBody(body);
//		
//		body.setDør("th");
//		body.setEtage("2");
//		body.setPostnr("9000");
//		body.setHusnr("45");
//		body.setVejnavn("Konvalvej");
//		
//		AddressResponse resp = DawsServiceFactory.getService().getdawsPortBindingQSPort().address(parameters);
//		System.out.println(resp.getResponseBody().getResultList()[0].getDør());
//		
//	}
}
