package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class OrderVasOfferRetInfo implements Serializable {
	@JsonProperty(value="DoneCode")
	public String doneCode;
	@JsonProperty(value="OperType")
	public String[] operType;
	@JsonProperty(value="OfferInsInfo")
	public OfferInstInfo[] offerInsInfo;
	
	public String getDoneCode() {
		return doneCode;
	}
	public void setDoneCode(String doneCode) {
		this.doneCode = doneCode;
	}
	public String[] getOperType() {
		return operType;
	}
	public void setOperType(String[] operType) {
		this.operType = operType;
	}
	public OfferInstInfo[] getOfferInsInfo() {
		return offerInsInfo;
	}
	public void setOfferInsInfo(OfferInstInfo[] offerInsInfo) {
		this.offerInsInfo = offerInsInfo;
	}
	
	
}
