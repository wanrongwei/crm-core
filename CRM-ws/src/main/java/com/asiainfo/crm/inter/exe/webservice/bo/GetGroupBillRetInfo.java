package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetGroupBillRetInfo implements Serializable {
	
	@JsonProperty(value="GroupBillInfo")
	public GroupBillInfo[] groupBillInfo;

	public GroupBillInfo[] getGroupBillInfo() {
		return groupBillInfo;
	}

	public void setGroupBillInfo(GroupBillInfo[] groupBillInfo) {
		this.groupBillInfo = groupBillInfo;
	}
	
	

}
