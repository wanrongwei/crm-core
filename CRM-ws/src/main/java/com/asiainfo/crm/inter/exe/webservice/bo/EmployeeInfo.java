package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class EmployeeInfo implements Serializable{
	
	@JsonProperty(value="EmployeeID")
	public String employeeID;
	@JsonProperty(value="Salutation")
	public String salutation;
	@JsonProperty(value="EmployeeName")
	public String employeeName;
	@JsonProperty(value="Gender")
	public String gender;
	@JsonProperty(value="Email")
	public String email;
	@JsonProperty(value="ServiceNumber")
	public String serviceNumber;
	@JsonProperty(value="KeyPerson")
	public String keyPerson;
	@JsonProperty(value="KeyReason")
	public String keyReason;
	@JsonProperty(value="Position")
	public String position;
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getServiceNumber() {
		return serviceNumber;
	}
	public void setServiceNumber(String serviceNumber) {
		this.serviceNumber = serviceNumber;
	}
	public String getKeyPerson() {
		return keyPerson;
	}
	public void setKeyPerson(String keyPerson) {
		this.keyPerson = keyPerson;
	}
	public String getKeyReason() {
		return keyReason;
	}
	public void setKeyReason(String keyReason) {
		this.keyReason = keyReason;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	 
	 
	 
	 
	 
	

}
