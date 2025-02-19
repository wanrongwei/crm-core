package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Map;

public class BalanceTransferRsp implements Serializable {
	
	public ErrorInfo errorInfo;
	
	public Map retInfo;

	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}

	public Map getRetInfo() {
		return retInfo;
	}

	public void setRetInfo(Map retInfo) {
		this.retInfo = retInfo;
	}
	
}
