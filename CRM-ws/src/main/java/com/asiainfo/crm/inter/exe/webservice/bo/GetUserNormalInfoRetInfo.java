package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetUserNormalInfoRetInfo implements Serializable {
	@JsonProperty(value="UserInfo")
	public UserInfo[] userInfo;

	public UserInfo[] getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo[] userInfo) {
		this.userInfo = userInfo;
	}

	
}
