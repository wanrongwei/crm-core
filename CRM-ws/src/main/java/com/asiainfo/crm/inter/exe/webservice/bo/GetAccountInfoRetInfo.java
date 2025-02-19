package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetAccountInfoRetInfo implements Serializable {
	
	@JsonProperty(value="AcctInfo")
	public AcctInfo[] acctInfo;

	public AcctInfo[] getAcctInfo() {
		return acctInfo;
	}

	public void setAcctInfo(AcctInfo[] acctInfo) {
		this.acctInfo = acctInfo;
	}

	
}
