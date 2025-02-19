package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetPaymentRecordRetInfo implements Serializable {
	@JsonProperty(value="PayRec")
	public PayRec[] payRec;

	public PayRec[] getPayRec() {
		return payRec;
	}

	public void setPayRec(PayRec[] payRec) {
		this.payRec = payRec;
	}
	
	

}
