package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetAccountBalanceRsp implements Serializable{
	
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	
	@JsonProperty(value="RetInfo")
	public GetAccountBalanceRetInfo retInfo;

	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}

	public GetAccountBalanceRetInfo getRetInfo() {
		return retInfo;
	}

	public void setRetInfo(GetAccountBalanceRetInfo retInfo) {
		this.retInfo = retInfo;
	}
}
