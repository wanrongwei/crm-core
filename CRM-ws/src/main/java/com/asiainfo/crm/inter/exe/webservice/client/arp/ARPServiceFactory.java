package com.asiainfo.crm.inter.exe.webservice.client.arp;

public class ARPServiceFactory {
	
	private static Boolean SLOCK = Boolean.FALSE;
	
	private static RoamingProvisioningLocator service = null ;
	
	public static synchronized RoamingProvisioningLocator getService(){
		if (SLOCK.equals(Boolean.FALSE)) {
			service = new RoamingProvisioningLocator();
			SLOCK = Boolean.TRUE;
		}
		return service ;
	}

	public static void main(String[] args) throws Exception{
		PreProvisioningAcknowledgement preack =  new PreProvisioningAcknowledgement();
		preack.setBilateralInformation("a");
		preack.setReceiver("b");
		preack.setRequestArrivalTimestamp("19900102000000");
		preack.setSender("DSL100900");
		preack.setSubscriptionId("1121312455");
		preack.setTransactionId("YYYYYYYY");
		Ack ack = null;
		try {
			ack = getService().getServiceActivation().acknowledgePreProvision(preack);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			System.out.println("ServiceException");
		}catch (PolicyException e) {
			System.out.println("PolicyException");
		}
		System.out.println(ack);
	}
}
