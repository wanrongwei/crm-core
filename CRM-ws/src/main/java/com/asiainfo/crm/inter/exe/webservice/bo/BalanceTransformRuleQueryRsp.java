package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

public class BalanceTransformRuleQueryRsp implements Serializable {

	public ErrorInfo errorInfo;
	
	public BalanceTransformRuleQueryRetInfo retInfo;

	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}

	public BalanceTransformRuleQueryRetInfo getRetInfo() {
		return retInfo;
	}

	public void setRetInfo(BalanceTransformRuleQueryRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
}
