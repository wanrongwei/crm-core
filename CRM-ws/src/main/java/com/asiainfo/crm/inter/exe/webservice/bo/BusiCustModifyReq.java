package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class BusiCustModifyReq implements Serializable {
	@JsonProperty(value="OperatorFlag")
	public String operatorFlag;
	@JsonProperty(value="BusiCustInfo")
	public BusiCustInfo busiCustInfo;
	
	public String getOperatorFlag() {
		return operatorFlag;
	}
	public void setOperatorFlag(String operatorFlag) {
		this.operatorFlag = operatorFlag;
	}
	public BusiCustInfo getBusiCustInfo() {
		return busiCustInfo;
	}
	public void setBusiCustInfo(BusiCustInfo busiCustInfo) {
		this.busiCustInfo = busiCustInfo;
	}
	
}
