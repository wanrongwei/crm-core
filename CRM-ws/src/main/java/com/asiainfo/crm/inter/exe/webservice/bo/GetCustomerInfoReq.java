package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetCustomerInfoReq implements Serializable {
	@JsonProperty(value="ServiceNum")
	public String serviceNum;
	@JsonProperty(value="GroupId")
	public String groupId;
	@JsonProperty(value="UserId")
	public long userId;
	@JsonProperty(value="CustId")
	public long custId;
	@JsonProperty(value="Password")
	public String password;
	
	public String getServiceNum() {
		return serviceNum;
	}
	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
