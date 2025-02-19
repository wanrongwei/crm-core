package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetUserAvailMainOfferRsp implements Serializable {
	
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public GetUserAvailMainOfferRetInfo retInfo;
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public GetUserAvailMainOfferRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(GetUserAvailMainOfferRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
	

}
