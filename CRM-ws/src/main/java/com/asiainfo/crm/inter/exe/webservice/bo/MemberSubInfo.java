package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class MemberSubInfo implements Serializable {
	
	@JsonProperty(value="DepartmentID")
	public long departmentID;
	@JsonProperty(value="DepartmentName")
	public String departmentName;
	@JsonProperty(value="MemberID")
	public long memberID;
	@JsonProperty(value="EmployeeName")
	public String employeeName;
	@JsonProperty(value="Position")
	public String position;
	@JsonProperty(value="ServiceNumber")
	public String serviceNumber;
	@JsonProperty(value="ShortCode")
	public String shortCode;
	public long getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(long departmentID) {
		this.departmentID = departmentID;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public long getMemberID() {
		return memberID;
	}
	public void setMemberID(long memberID) {
		this.memberID = memberID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getServiceNumber() {
		return serviceNumber;
	}
	public void setServiceNumber(String serviceNumber) {
		this.serviceNumber = serviceNumber;
	}
	public String getShortCode() {
		return shortCode;
	}
	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	
}
