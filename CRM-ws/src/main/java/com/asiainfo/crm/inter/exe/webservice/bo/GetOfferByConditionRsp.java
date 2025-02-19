package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonProperty;


public class GetOfferByConditionRsp implements Serializable {
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public GetOfferByConditionRetInfo retInfo;

	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}

	public GetOfferByConditionRetInfo getRetInfo() {
		return retInfo;
	}

	public void setRetInfo(GetOfferByConditionRetInfo retInfo) {
		this.retInfo = retInfo;
	}

}