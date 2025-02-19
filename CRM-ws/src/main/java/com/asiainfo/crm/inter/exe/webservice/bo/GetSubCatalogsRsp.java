package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonProperty;


public class GetSubCatalogsRsp implements Serializable {
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public GetSubCatalogsRetInfo retInfo;

	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}

	public GetSubCatalogsRetInfo getRetInfo() {
		return retInfo;
	}

	public void setRetInfo(GetSubCatalogsRetInfo retInfo) {
		this.retInfo = retInfo;
	}

}