package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetGroupOrderRetInfo implements Serializable {
	
	@JsonProperty(value="ProdInstInfo")
	public ProdInstInfo[] prodInstInfo ;
	@JsonProperty(value="GroupId")
	public long groupId ;
	@JsonProperty(value="GroupName")
	public String groupName ;
	public ProdInstInfo[] getProdInstInfo() {
		return prodInstInfo;
	}
	public void setProdInstInfo(ProdInstInfo[] prodInstInfo) {
		this.prodInstInfo = prodInstInfo;
	}
	public long getGroupId() {
		return groupId;
	}
	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	

}
