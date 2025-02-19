package com.asiainfo.crm.inter.exe.webservice.client;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NPSetParams {
	

	public static Map setPortInRequestDK() throws Exception {
	    Map busiParams = new HashMap();
		busiParams.put("OrderId", "1");
		busiParams.put("CustomerId", "2");
		busiParams.put("CustomerType", "0");
		busiParams.put("ICC", "3");
		busiParams.put("CurrentNumberType", "4");
		busiParams.put("CurrentServiceOperator", "5");
		busiParams.put("CurrentNetworkOperator", "6");
		busiParams.put("RecipientServiceOperator", "7");
		busiParams.put("RecipientNetworkOperator", "8");
		busiParams.put("TelephoneNumber", "1");
		busiParams.put("PointOfConnection", "11");
		List list1 = new ArrayList();
		list1.add("111");
		list1.add("211");
		busiParams.put("Comment", list1);
		busiParams.put("RequestedExecutionDate", Calendar.getInstance()+"");
		List list = new ArrayList();
		Map ser1 = new HashMap();
		ser1.put("SeriesStart", "1");
		ser1.put("SeriesEnd", "2");
		list.add(ser1);
		
		Map ser2 = new HashMap();
		ser2.put("SeriesStart", "3");
		ser2.put("SeriesEnd", "4");
		list.add(ser2);
	
	
	busiParams.put("NumberSeries", list);
	return busiParams;
		
	}
	
	public static Map setHeader() throws Exception {
		
	    Map headers = new HashMap();
	    headers.put("AppKey", "1");
		headers.put("TransactionID", "1");
		headers.put("ReqTime", "1");
		headers.put("Format", "1");
		headers.put("Sign", "1");
		headers.put("AccessToken", "1");
		headers.put("Version", "1");
		headers.put("TenantId", "1");
		headers.put("AcceptProvCode", "1");
		headers.put("AcceptRegionCode", "1");
		headers.put("AcceptChannelType", "1");
		headers.put("AcceptChannelCode", "1");
		headers.put("AcceptOrgId", "1");
		headers.put("AcceptStaffId", "1");
		headers.put("ChargeFlag", "1");
		headers.put("NotifyFlag", "1");
		headers.put("DstSysID", "1");
		
	    return headers;
		
	}
	public static Map setCrmOrderFinished() throws Exception {
	    Map busiParams = new HashMap();
		busiParams.put("OrderId", "1");
		busiParams.put("TelephoneNumber", "1");
		busiParams.put("Product ", "1");
		busiParams.put("ProfileId  ", "");
		busiParams.put("SPC", "");
		busiParams.put("Municipality", "");
		busiParams.put("RoutingInfo", "");
		busiParams.put("ChargingInfo", "");
		busiParams.put("NewNumberType", "GSM");
		busiParams.put("NumberPorted", "Y");
		busiParams.put("PortingCase ", "");
	    return busiParams;
		
	}
	public static Map setPortOutResponse() throws Exception {
	    Map busiParams = new HashMap();
		busiParams.put("OrderId", "01015201405210010952");
		busiParams.put("ResponseType","1");
		busiParams.put("ConfirmedExecutionDate", "20140520114914");
		busiParams.put("ConfirmationStatus", "1");
		//busiParams.put("rejectCode", "100");
		//busiParams.put("rejectReason", "1");
		//busiParams.put("rejectDesc", "1");
		//busiParams.put("debitAmount", "1");
		
	    return busiParams;
		
	}
	
	public static Map setReturnNumber() throws Exception {
	    Map busiParams = new HashMap();
	    busiParams.put("OrderId","123" );
		busiParams.put("CountryCode", "DK");
		
		busiParams.put("TerminateDate", Calendar.getInstance()+"");
		busiParams.put("CustomerId", "1");
		busiParams.put("ReturnOperator", "1");
		busiParams.put("MainNumber", "1");
		//busiParams.put("fromOperator", "1");
		//busiParams.put("SeriesStart", "1");
		
		List list = new ArrayList();
		Map ser1 = new HashMap();
		ser1.put("SeriesStart", "1");
		ser1.put("SeriesEnd", "2");
		list.add(ser1);
		
		Map ser2 = new HashMap();
		ser2.put("SeriesStart", "3");
		ser2.put("SeriesEnd", "4");
		list.add(ser2);
		
		busiParams.put("NumberSeries", list);
		
	    return busiParams;
		
	}
	
	public static Map setModConfirmDate() throws Exception {
	    Map busiParams = new HashMap();
		busiParams.put("CountryCode", "DK");
		busiParams.put("OrderId","1981" );
		busiParams.put("TelephoneNumber", "20140520");
		busiParams.put("NewConfrimDate", "20140520114914");
		
	    return busiParams;
		
	}
	
	public static Map setCrmcancel() throws Exception {
	    Map busiParams = new HashMap();
		busiParams.put("OrderId", "10953");
		busiParams.put("CancelFlag","true" );
		busiParams.put("Reason", "111");
		//busiParams.put("newConfrimDate", "1");
		
	    return busiParams;
		
	}
	public static Map setNumberChangeRequest() throws Exception {
	    Map busiParams = new HashMap();
		busiParams.put("countryCode", "DK");
		busiParams.put("orderId","123" );
		busiParams.put("telephoneNumber", "111");
		/*busiParams.put("currentServiceOperator", "10953");
		busiParams.put("currentNetworkOperator","true" );
		busiParams.put("recipientServiceOperator", "111");
		busiParams.put("portingCase", "10953");
		busiParams.put("SPC","true" );
		busiParams.put("municipality", "111");
		
		busiParams.put("routingInfo", "10953");
		busiParams.put("chargingInfo","1" );
		busiParams.put("newNumberType", "111");*/
	    busiParams.put("numberPorted", "Y");
		List list = new ArrayList();
		List list2 = new ArrayList();
		/*Map numberSeries=new HashMap();
		Map numberSeries2=new HashMap();
		numberSeries.put("SeriesStart","");
		numberSeries.put("SeriesEnd","");
		numberSeries2.put("SeriesStart","1");
		numberSeries2.put("SeriesEnd","2");
		list.add(numberSeries);
		list.add(numberSeries2);*/
		busiParams.put("numberSeries", list);
		list2.add("111");
		list2.add("211");
		busiParams.put("comment", list2);
	    return busiParams;
		
	}


	public static Map setRangeChangeRequest() throws Exception {
	    Map busiParams = new HashMap();
		busiParams.put("CountryCode", "DK");
		busiParams.put("OrderId", "123");
		busiParams.put("RangeUpdateType","I" );
		busiParams.put("Range", "39664000-39664999");
		busiParams.put("OtherOperator", "01026");
		busiParams.put("CurrentRangeHolder","01011" );
		busiParams.put("CurrentServiceOperator", "01011");
		busiParams.put("CurrentNetworkOperator", "01011");
		busiParams.put("PortingCase","true" );
		busiParams.put("SPC", "29724");
		
		busiParams.put("Municipality", "101");
		busiParams.put("RoutingInfo","4347/371213" );
		busiParams.put("ChargingInfo", "4347/371213");
		busiParams.put("NewNumberType", "GSM");
		List list2 = new ArrayList();
		list2.add("111");
		list2.add("211");
		busiParams.put("Comment", list2);
	    return busiParams;
		
	}

	public static Map setCheckAgreementRequest() {
		Map busiParams = new HashMap();
		busiParams.put("CountryCode", "DK");
		busiParams.put("TelephoneNumber","39470000" );
		busiParams.put("CustomerType", "M");
		busiParams.put("NumberType", "GSM");
	    List list = new ArrayList();
		Map numberSeries=new HashMap();
		Map numberSeries2=new HashMap();
		numberSeries.put("SeriesStart","1");
		numberSeries.put("SeriesEnd","1");
		numberSeries2.put("SeriesStart","1");
		numberSeries2.put("SeriesEnd","2");
		list.add(numberSeries);
		list.add(numberSeries2);
		busiParams.put("NumberSeries", list);
	    return busiParams;
	}

	public static Map setCrmNotifyPoaResult() {
		Map busiParams = new HashMap();
		busiParams.put("CountryCode", "DK");
		busiParams.put("OrderId","39470000" );
		busiParams.put("TelephoneNumber", "4325432");
		busiParams.put("ResultCode", "1051");
	    
	    return busiParams;
	}

}
