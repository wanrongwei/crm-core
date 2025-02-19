package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetUserBillReq implements Serializable {
	@JsonProperty(value="ServiceNum")
	public String serviceNum;
	@JsonProperty(value="Password")
	public String password;
	@JsonProperty(value="BillingCycle")
	public String billingCycle;
	@JsonProperty(value="RelationType")
	public int relationType;
	@JsonProperty(value="SubjectId")
	public long subjectId;
	@JsonProperty(value="AddInfo")
	public String addInfo;
	
	public String getServiceNum() {
		return serviceNum;
	}
	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBillingCycle() {
		return billingCycle;
	}
	public void setBillingCycle(String billingCycle) {
		this.billingCycle = billingCycle;
	}
	public int getRelationType() {
		return relationType;
	}
	public void setRelationType(int relationType) {
		this.relationType = relationType;
	}
	public long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}
	public String getAddInfo() {
		return addInfo;
	}
	public void setAddInfo(String addInfo) {
		this.addInfo = addInfo;
	}
	
}
