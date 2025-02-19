package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class EmployeeModifyReq implements Serializable{
	
	@JsonProperty(value="BusiCustID")
	public String busiCustID;
	@JsonProperty(value="DepartmentID")
	public String departmentID;
	@JsonProperty(value="OperatorFlag")
	public String operatorFlag;
	@JsonProperty(value="EmployeeInfo")
	public EmployeeInfo employeeInfo;
	public String getBusiCustID() {
		return busiCustID;
	}
	public void setBusiCustID(String busiCustID) {
		this.busiCustID = busiCustID;
	}
	public String getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
	}
	public String getOperatorFlag() {
		return operatorFlag;
	}
	public void setOperatorFlag(String operatorFlag) {
		this.operatorFlag = operatorFlag;
	}
	public EmployeeInfo getEmployeeInfo() {
		return employeeInfo;
	}
	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}
	 

	 

}
