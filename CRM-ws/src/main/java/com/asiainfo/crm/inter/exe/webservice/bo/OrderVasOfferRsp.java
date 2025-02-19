package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class OrderVasOfferRsp implements Serializable {

	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public OrderVasOfferRetInfo retInfo;
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public OrderVasOfferRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(OrderVasOfferRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
	
}
