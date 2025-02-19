package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetGroupMemberReq implements Serializable {
	
	@JsonProperty(value="GroupId")
	public long groupId;
	@JsonProperty(value="ServiceNum")
	public String serviceNum;
	@JsonProperty(value="CustName")
	public String custName;
	@JsonProperty(value="VIPFlag")
	public String vipFlag;
	@JsonProperty(value="BgnIndex")
	public int bgnIndex;
	@JsonProperty(value="EndIndex")
	public int endIndex;
	
	public long getGroupId() {
		return groupId;
	}
	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}
	public String getServiceNum() {
		return serviceNum;
	}
	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getVipFlag() {
		return vipFlag;
	}
	public void setVipFlag(String vipFlag) {
		this.vipFlag = vipFlag;
	}
	public int getBgnIndex() {
		return bgnIndex;
	}
	public void setBgnIndex(int bgnIndex) {
		this.bgnIndex = bgnIndex;
	}
	public int getEndIndex() {
		return endIndex;
	}
	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}
	
}
