package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class SubDepartmentRetInfo implements Serializable {

	@JsonProperty(value="DepartmentInfo")
	public DepartmentInfo [] departmentInfo;

	public DepartmentInfo[] getDepartmentInfo() {
		return departmentInfo;
	}

	public void setDepartmentInfo(DepartmentInfo[] departmentInfo) {
		this.departmentInfo = departmentInfo;
	}
}
