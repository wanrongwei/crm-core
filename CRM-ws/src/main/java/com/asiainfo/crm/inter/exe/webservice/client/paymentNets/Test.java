package com.asiainfo.crm.inter.exe.webservice.client.paymentNets;

public class Test {
	public static void main(String[] args) throws Exception {
		NetsService_ServiceLocator locator = new NetsService_ServiceLocator();
		CheckBankAccountRequest request = new CheckBankAccountRequest();
		CheckBankAccountRequestBody body = new CheckBankAccountRequestBody();
		body.setBankAcctNumber("123");
		body.setBankNumber("34");
		request.setRequestBody(body);
		
		
		System.out.println(locator.getNetsService().checkBankAccount(request));
	}

}
