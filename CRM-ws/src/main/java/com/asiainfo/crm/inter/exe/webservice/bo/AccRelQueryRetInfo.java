package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class AccRelQueryRetInfo implements Serializable {
	@JsonProperty(value="AccRelInfo")
	public AccRelInfo accRelInfo;

	public AccRelInfo getAccRelInfo() {
		return accRelInfo;
	}

	public void setAccRelInfo(AccRelInfo accRelInfo) {
		this.accRelInfo = accRelInfo;
	}
	
}
