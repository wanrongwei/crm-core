package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetAccountBalanceReq implements Serializable{
	
	@JsonProperty(value="ServiceNum")
	public String serviceNum;
	
	@JsonProperty(value="AcctId")
	public long acctId;

	public String getServiceNum() {
		return serviceNum;
	}

	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}

	public long getAcctId() {
		return acctId;
	}

	public void setAcctId(long acctId) {
		this.acctId = acctId;
	}
}
