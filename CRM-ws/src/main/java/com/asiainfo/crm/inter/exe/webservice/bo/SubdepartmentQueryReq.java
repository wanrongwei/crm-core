package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class SubdepartmentQueryReq implements Serializable {

	@JsonProperty(value="DepartmentID")
	public long departmentID;

	public long getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(long departmentID) {
		this.departmentID = departmentID;
	}
}
