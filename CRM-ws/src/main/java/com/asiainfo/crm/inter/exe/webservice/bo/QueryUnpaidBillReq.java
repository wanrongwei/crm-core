package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class QueryUnpaidBillReq implements Serializable {
	@JsonProperty(value="ServiceNumber")
	public String serviceNumber;
	@JsonProperty(value="AcctID")
	public long acctID;
	@JsonProperty(value="ContainRealTimeBill")
	public int containRealTimeBill;

	public String getServiceNumber() {
		return serviceNumber;
	}

	public void setServiceNumber(String serviceNumber) {
		this.serviceNumber = serviceNumber;
	}

	public long getAcctID() {
		return acctID;
	}

	public void setAcctID(long acctID) {
		this.acctID = acctID;
	}

	public int getContainRealTimeBill() {
		return containRealTimeBill;
	}

	public void setContainRealTimeBill(int containRealTimeBill) {
		this.containRealTimeBill = containRealTimeBill;
	}
	
}
