package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class UpdateUserMainOfferRsp implements Serializable {

	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public UpdateUserMainOfferRetInfo retInfo;
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public UpdateUserMainOfferRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(UpdateUserMainOfferRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
	
}
