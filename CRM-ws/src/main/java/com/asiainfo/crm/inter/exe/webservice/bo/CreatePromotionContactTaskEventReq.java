package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class CreatePromotionContactTaskEventReq implements Serializable {
	@JsonProperty(value="CampId")
	public String campId;
	@JsonProperty(value="AccessNumber")
	public String accessNumber;
	@JsonProperty(value="CustId")
	public String custId;
	public String getCampId() {
		return campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getAccessNumber() {
		return accessNumber;
	}
	public void setAccessNumber(String accessNumber) {
		this.accessNumber = accessNumber;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}

	
}
