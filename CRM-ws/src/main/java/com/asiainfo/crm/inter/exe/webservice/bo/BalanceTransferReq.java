package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

public class BalanceTransferReq implements Serializable {
	
	public int OutType;
	
	public String OutID;
	
	public int InType;
	
	public String InID;
	
	public long RuleID;
	
	public String TransformCount;

	public int getOutType() {
		return OutType;
	}

	public void setOutType(int outType) {
		OutType = outType;
	}

	public String getOutID() {
		return OutID;
	}

	public void setOutID(String outID) {
		OutID = outID;
	}

	public int getInType() {
		return InType;
	}

	public void setInType(int inType) {
		InType = inType;
	}

	public String getInID() {
		return InID;
	}

	public void setInID(String inID) {
		InID = inID;
	}

	public long getRuleID() {
		return RuleID;
	}

	public void setRuleID(long ruleID) {
		RuleID = ruleID;
	}

	public String getTransformCount() {
		return TransformCount;
	}

	public void setTransformCount(String transformCount) {
		TransformCount = transformCount;
	}
	
}
