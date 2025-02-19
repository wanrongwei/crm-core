package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class SetBillDeliveryTypeRetInfo implements Serializable {

	@JsonProperty(value="DoneCode")
	public String doneCode;
	
}
