package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class AccRelQueryReq implements Serializable {
	@JsonProperty(value="ServiceNumber")
	public String serviceNumber;
	@JsonProperty(value="AccID")
	public long accID;
	
	public String getServiceNumber() {
		return serviceNumber;
	}
	public void setServiceNumber(String serviceNumber) {
		this.serviceNumber = serviceNumber;
	}
	public long getAccID() {
		return accID;
	}
	public void setAccID(long accID) {
		this.accID = accID;
	}
	
}
