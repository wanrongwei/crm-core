package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;

public class UpdateCustomerInfoReq  implements Serializable{

	@JsonProperty(value="ServiceNum")
	public String serviceNum;
	@JsonProperty(value="GroupId")
	public long groupId;
	@JsonProperty(value="CustInfo")
	public CustInfo custInfo;
	@JsonProperty(value="CustExtInfo")
	public Map custExtInfo;
	public String getServiceNum() {
		return serviceNum;
	}
	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}
	public long getGroupId() {
		return groupId;
	}
	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}
	public CustInfo getCustInfo() {
		return custInfo;
	}
	public void setCustInfo(CustInfo custInfo) {
		this.custInfo = custInfo;
	}
	public Map getCustExtInfo() {
		return custExtInfo;
	}
	public void setCustExtInfo(Map custExtInfo) {
		this.custExtInfo = custExtInfo;
	}
	
	
}
