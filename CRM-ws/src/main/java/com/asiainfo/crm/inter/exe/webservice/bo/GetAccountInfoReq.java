package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetAccountInfoReq implements Serializable {

	@JsonProperty(value="ServiceNum")
	public String ServiceNum;
	@JsonProperty(value="UserId")
	public long userId;
	@JsonProperty(value="AcctId")
	public long acctId;
	@JsonProperty(value="CustId")
	public long custId;

	public String getServiceNum() {
		return ServiceNum;
	}

	public void setServiceNum(String serviceNum) {
		ServiceNum = serviceNum;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getAcctId() {
		return acctId;
	}

	public void setAcctId(long acctId) {
		this.acctId = acctId;
	}

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}
	
	
	
}
