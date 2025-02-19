package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

public class BalanceTransformRuleQueryReq implements Serializable {
	
	public int queryType;
	
	public long queryID;
	
	public long availableResourceID;
	
	public String availableResourceValue;

	public int getQueryType() {
		return queryType;
	}

	public void setQueryType(int queryType) {
		this.queryType = queryType;
	}

	public long getQueryID() {
		return queryID;
	}

	public void setQueryID(long queryID) {
		this.queryID = queryID;
	}

	public long getAvailableResourceID() {
		return availableResourceID;
	}

	public void setAvailableResourceID(long availableResourceID) {
		this.availableResourceID = availableResourceID;
	}

	public String getAvailableResourceValue() {
		return availableResourceValue;
	}

	public void setAvailableResourceValue(String availableResourceValue) {
		this.availableResourceValue = availableResourceValue;
	}
	
}
