package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class BusiMemberQueryReq implements Serializable {
	@JsonProperty(value="BusiCustID")
	public long busiCustID;
	@JsonProperty(value="DepartmentID")
	public long departmentID;
	@JsonProperty(value="OfferInstanceCode")
	public long offerInstanceCode;
	@JsonProperty(value="ServiceNumber")
	public String serviceNumber;
	@JsonProperty(value="Position")
	public String position;
	@JsonProperty(value="MemberName")
	public String memberName;
	@JsonProperty(value="StartIndex")
	public int startIndex;
	@JsonProperty(value="EndIndex")
	public int endIndex;
	public long getBusiCustID() {
		return busiCustID;
	}
	public void setBusiCustID(long busiCustID) {
		this.busiCustID = busiCustID;
	}
	public long getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(long departmentID) {
		this.departmentID = departmentID;
	}
	public long getOfferInstanceCode() {
		return offerInstanceCode;
	}
	public void setOfferInstanceCode(long offerInstanceCode) {
		this.offerInstanceCode = offerInstanceCode;
	}
	public String getServiceNumber() {
		return serviceNumber;
	}
	public void setServiceNumber(String serviceNumber) {
		this.serviceNumber = serviceNumber;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	public int getEndIndex() {
		return endIndex;
	}
	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}
	
	
}
