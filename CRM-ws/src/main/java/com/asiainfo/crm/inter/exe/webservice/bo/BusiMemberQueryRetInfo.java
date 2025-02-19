package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class BusiMemberQueryRetInfo implements Serializable {
	
	@JsonProperty(value="Count")
	public int count;
	@JsonProperty(value="MemberSubInfo")
	public MemberSubInfo[] memberSubInfo;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public MemberSubInfo[] getMemberSubInfo() {
		return memberSubInfo;
	}
	public void setMemberSubInfo(MemberSubInfo[] memberSubInfo) {
		this.memberSubInfo = memberSubInfo;
	}

}
