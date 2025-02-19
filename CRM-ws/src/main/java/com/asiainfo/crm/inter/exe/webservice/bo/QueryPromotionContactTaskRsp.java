package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class QueryPromotionContactTaskRsp implements Serializable {
	
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public QueryPromotionContactTaskRetInfo retInfo;
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public QueryPromotionContactTaskRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(QueryPromotionContactTaskRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
	

}
