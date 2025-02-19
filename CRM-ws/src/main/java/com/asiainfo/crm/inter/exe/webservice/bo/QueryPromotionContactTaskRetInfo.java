package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class QueryPromotionContactTaskRetInfo implements Serializable {
	
	@JsonProperty(value="PromContactTaskInfo")
	public PromContactTaskInfo[] promContactTaskInfo;

	public PromContactTaskInfo[] getPromContactTaskInfo() {
		return promContactTaskInfo;
	}

	public void setPromContactTaskInfo(PromContactTaskInfo[] promContactTaskInfo) {
		this.promContactTaskInfo = promContactTaskInfo;
	}
	
	

}
