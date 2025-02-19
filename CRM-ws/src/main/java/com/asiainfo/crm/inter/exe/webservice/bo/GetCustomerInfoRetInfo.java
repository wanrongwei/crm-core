package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetCustomerInfoRetInfo implements Serializable {
	
	@JsonProperty(value="CustInfo")
	public CustInfo custInfo;
	@JsonProperty(value="CustExtInfo")
	public Map custExtInfo;
	public CustInfo getCustInfo() {
		return custInfo;
	}
	public void setCustInfo(CustInfo custInfo) {
		this.custInfo = custInfo;
	}
	public Map getCustExtInfo() {
		return custExtInfo;
	}
	public void setCustExtInfo(Map custExtInfo) {
		this.custExtInfo = custExtInfo;
	}

	
}
