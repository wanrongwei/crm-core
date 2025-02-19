package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class DepartmentModifyReq implements Serializable {
	@JsonProperty(value="BusiCustID")
	public String busiCustID;
	@JsonProperty(value="OperatorFlag")
	public int operatorFlag;
	@JsonProperty(value="DepartmentInfo")
	public DepartmentInfo departmentInfo;
	public String getBusiCustID() {
		return busiCustID;
	}
	public void setBusiCustID(String busiCustID) {
		this.busiCustID = busiCustID;
	}
	public int getOperatorFlag() {
		return operatorFlag;
	}
	public void setOperatorFlag(int operatorFlag) {
		this.operatorFlag = operatorFlag;
	}
	public DepartmentInfo getDepartmentInfo() {
		return departmentInfo;
	}
	public void setDepartmentInfo(DepartmentInfo departmentInfo) {
		this.departmentInfo = departmentInfo;
	}
	
}
