package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetPaymentRecordRsp implements Serializable {
	
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public GetPaymentRecordRetInfo retInfo;
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public GetPaymentRecordRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(GetPaymentRecordRetInfo retInfo) {
		this.retInfo = retInfo;
	}

	
}
