package com.asiainfo.crm.inter.exe.webservice.client.cpr.log.bo;

public class FejlnrErrorInfo {
	//FEJLNR错误信息对应表

	private static String key[]={"00","01","02","03","04","05",
										"06","07","08","09","10",
										"11","12","13","14","15",
										"16","99"};
	private static String value[]={
			"No errors"," USERID/PWD incorrect","PWD expired, NEWPWD required", //0,1,2
			"NEWPWD format error","No access to CPR","PNR not found in CPR",	//3,4,5
			"Unknown KUNDENR","Timeout – new LOGON required","DEAD-LOCK' while retrieving data from the CPR system",	//6,7,8
			"Serious problem (e.g. failure to connect to the CPR system)please contact the CSC Service Center, tel (+45) 3614 6192", //9
			"ABON_TYPE unknown","DATA_TYPE unknown","KUNDEREFNR has to be filled in",	//10,11,12
			"KUNDEREFNR is already in use for an other person","Making subscriptions is not allowed",	//13,14
			"The is no subscription on the KUNDEREFNR","No access for your IP address",	//15,16
			"99"
	};
		
	public String getErrorValueByKey(String fejlnr){
		int index = -1;
		for(int i = 0;i<key.length;i++){
			if(key[i].equals(fejlnr)){
				index = i;
				break;
			}
		}
		return value[index];
	}
	
}
