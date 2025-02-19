package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetUserAvailVasOfferRsp implements Serializable {
	
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public GetUserAvailVasOfferRetInfo retInfo;
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public GetUserAvailVasOfferRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(GetUserAvailVasOfferRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
	

}
