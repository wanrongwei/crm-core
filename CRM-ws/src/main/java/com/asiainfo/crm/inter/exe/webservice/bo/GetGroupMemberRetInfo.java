package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetGroupMemberRetInfo implements Serializable {
	
	@JsonProperty(value="MemberInfo")
	public MemberInfo[] memberInfo;
	@JsonProperty(value="Count")
	public int count ;
	public MemberInfo[] getMemberInfo() {
		return memberInfo;
	}
	public void setMemberInfo(MemberInfo[] memberInfo) {
		this.memberInfo = memberInfo;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

}
