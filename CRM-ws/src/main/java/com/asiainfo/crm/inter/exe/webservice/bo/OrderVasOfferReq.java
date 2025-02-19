package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class OrderVasOfferReq implements Serializable {
	
	@JsonProperty(value="ServiceNum")
	public String serviceNum;
	@JsonProperty(value="UserId")
	public long userId;
	@JsonProperty(value="VasOfferInfo")
	public OfferInstInfo[] vasOfferInfo;
	@JsonProperty(value="Remark")
	public String remark;
	public String getServiceNum() {
		return serviceNum;
	}
	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public OfferInstInfo[] getVasOfferInfo() {
		return vasOfferInfo;
	}
	public void setVasOfferInfo(OfferInstInfo[] vasOfferInfo) {
		this.vasOfferInfo = vasOfferInfo;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
}
