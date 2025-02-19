package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

public class OfferUsageReq implements Serializable {
	
	public int queryType;
	
	public String queryID;

	public int getQueryType() {
		return queryType;
	}

	public void setQueryType(int queryType) {
		this.queryType = queryType;
	}

	public String getQueryID() {
		return queryID;
	}

	public void setQueryID(String queryID) {
		this.queryID = queryID;
	}
	
}
