package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

public class OfferUsageRsp implements Serializable {
	
	public ErrorInfo errorInfo;
	
	public OfferUsageRetInfo retInfo;

	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}

	public OfferUsageRetInfo getRetInfo() {
		return retInfo;
	}

	public void setRetInfo(OfferUsageRetInfo retInfo) {
		this.retInfo = retInfo;
	}

}
