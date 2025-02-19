package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetUserAllOfferRsp implements Serializable {

	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public GetUserAllOfferRetInfo retInfo;
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public GetUserAllOfferRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(GetUserAllOfferRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
	
	
}
