package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class UpdateCustomerInfoRetInfo implements Serializable {
	@JsonProperty(value="CustId")
	public long custId;

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}
	
	

}
