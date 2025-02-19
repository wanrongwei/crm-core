package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class QueryUnpaidBillRsp implements Serializable {
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public QueryUnpaidBillRetInfo retInfo;

	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}

	public QueryUnpaidBillRetInfo getRetInfo() {
		return retInfo;
	}

	public void setRetInfo(QueryUnpaidBillRetInfo retInfo) {
		this.retInfo = retInfo;
	}

}
