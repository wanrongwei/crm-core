package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class EmployeeQueryReq implements Serializable{
	
	@JsonProperty(value="BusiCustID")
	public String busiCustID;
	@JsonProperty(value="DepartmentID")
	public String departmentID;
	@JsonProperty(value="EmployeeName")
	public String employeeName;
	@JsonProperty(value="ServiceNumber")
	public String serviceNumber;
	@JsonProperty(value="Position")
	public String position;
	@JsonProperty(value="PageQueryInfo")
	public PageQueryInfo pageQueryInfo;
	
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
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getServiceNumber() {
		return serviceNumber;
	}
	public void setServiceNumber(String serviceNumber) {
		this.serviceNumber = serviceNumber;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public PageQueryInfo getPageQueryInfo() {
		return pageQueryInfo;
	}
	public void setPageQueryInfo(PageQueryInfo pageQueryInfo) {
		this.pageQueryInfo = pageQueryInfo;
	}

	 

}
