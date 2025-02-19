package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

public class BalanceTransformSetReq implements Serializable {
	
	public int queryType;
	
	public String queryID;
	
	public String originalResourceID;
	
	public String ruleID;
	
	public String transformCount;
	
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
	
	public String getOriginalResourceID() {
		return originalResourceID;
	}

	public void setOriginalResourceID(String originalResourceID) {
		this.originalResourceID = originalResourceID;
	}
	
	public String getRuleID() {
		return ruleID;
	}

	public void setRuleID(String ruleID) {
		this.ruleID = ruleID;
	}
	
	public String getTransformCount() {
		return transformCount;
	}

	public void setTransformCount(String transformCount) {
		this.transformCount = transformCount;
	}
	
	
}
