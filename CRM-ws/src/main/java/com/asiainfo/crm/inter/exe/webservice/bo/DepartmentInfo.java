package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class DepartmentInfo implements Serializable {
	
	@JsonProperty(value="DepartmentID")
	public String departmentID;
	
	@JsonProperty(value="DepartmentName")
	public String departmentName;
	
	@JsonProperty(value="ResponsiblePerson")
	public String responsiblePerson;
	
	@JsonProperty(value="SuperiorDepartmentID")
	public String superiorDepartmentID;
	
	@JsonProperty(value="Remarks")
	public String remarks;

	public String getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getResponsiblePerson() {
		return responsiblePerson;
	}

	public void setResponsiblePerson(String responsiblePerson) {
		this.responsiblePerson = responsiblePerson;
	}

	public String getSuperiorDepartmentID() {
		return superiorDepartmentID;
	}

	public void setSuperiorDepartmentID(String superiorDepartmentID) {
		this.superiorDepartmentID = superiorDepartmentID;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
