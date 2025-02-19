package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class StopOrStartUserReq implements Serializable {
	@JsonProperty(value="ServiceNum")
	public String serviceNum;
	@JsonProperty(value="OsType")
	public int osType;
	@JsonProperty(value="ZtType")
	public String ztType;
	@JsonProperty(value="IsLost")
	public int isLost;

	public String getServiceNum() {
		return serviceNum;
	}

	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}

	public int getOsType() {
		return osType;
	}

	public void setOsType(int osType) {
		this.osType = osType;
	}

	public String getZtType() {
		return ztType;
	}

	public void setZtType(String ztType) {
		this.ztType = ztType;
	}

	public int getIsLost() {
		return isLost;
	}

	public void setIsLost(int isLost) {
		this.isLost = isLost;
	}
	
}
