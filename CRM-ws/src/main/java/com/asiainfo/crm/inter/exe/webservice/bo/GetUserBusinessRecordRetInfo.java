package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetUserBusinessRecordRetInfo implements Serializable {
	@JsonProperty(value="BusiRecInfo")
	public BusiRecInfo[] busiRecInfo;
	@JsonProperty(value="Count")
	public int count;
	
	public BusiRecInfo[] getBusiRecInfo() {
		return busiRecInfo;
	}

	public void setBusiRecInfo(BusiRecInfo[] busiRecInfo) {
		this.busiRecInfo = busiRecInfo;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
