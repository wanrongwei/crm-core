package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class BusiMemberModifyReq implements Serializable {
	@JsonProperty(value="OperatorType")
	public int operatorType;
	@JsonProperty(value="BusiCustID")
	public long busiCustID;
	@JsonProperty(value="OfferInstanceCode")
	public String offerInstanceCode;
	@JsonProperty(value="ServiceNumber")
	public String serviceNumber;
	
	public int getOperatorType() {
		return operatorType;
	}
	public void setOperatorType(int operatorType) {
		this.operatorType = operatorType;
	}
	public long getBusiCustID() {
		return busiCustID;
	}
	public void setBusiCustID(long busiCustID) {
		this.busiCustID = busiCustID;
	}
	public String getOfferInstanceCode() {
		return offerInstanceCode;
	}
	public void setOfferInstanceCode(String offerInstanceCode) {
		this.offerInstanceCode = offerInstanceCode;
	}
	public String getServiceNumber() {
		return serviceNumber;
	}
	public void setServiceNumber(String serviceNumber) {
		this.serviceNumber = serviceNumber;
	}
	
}
