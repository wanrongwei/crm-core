package com.asiainfo.crm.inter.exe.webservice.client.esconsumer;

public class ESServiceFactory {
	
	private ESServiceFactory() {
	}
	
	private static class ESServiceHolder {
		
		private static final ESService_ServiceLocator INSTANCE = new ESService_ServiceLocator();
	}
	
	public static final ESService_ServiceLocator getService() {
		return ESServiceHolder.INSTANCE;
	}

//	public static void main(String[] args) throws Exception{
//		RaiseEvent parameters = new RaiseEvent();
//		
//		NbiDeviceTriplet deviceTriplet = new NbiDeviceTriplet();
//		deviceTriplet.setSubscriberID("4046942497123");
//		parameters.setDeviceTriplet(deviceTriplet);
//		
//		NbiCustomEvent event = new NbiCustomEvent();
//		event.setName("multi-sim-signup-changed");
//		parameters.setEvent(event);
//		ResponseHeaderHolder hodler = ESServiceFactory.getService().getESService().raiseEvent(parameters);
//		System.out.println(hodler.value.getRspCode() + " --> " + hodler.value.getRspDesc() );
//	}

}
