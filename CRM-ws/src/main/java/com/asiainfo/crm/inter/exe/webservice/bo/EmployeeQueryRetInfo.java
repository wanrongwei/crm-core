package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class EmployeeQueryRetInfo implements Serializable {
	

	@JsonProperty(value="PageResultInfo")
	public PageResultInfo pageResultInfo;
	@JsonProperty(value="DeptEmployeeInfo")
	public DepartmentEmployeeInfo[] deptEmployeeInfo;

	public PageResultInfo getPageResultInfo() {
		return pageResultInfo;
	}
	public void setPageResultInfo(PageResultInfo pageResultInfo) {
		this.pageResultInfo = pageResultInfo;
	}
	public DepartmentEmployeeInfo[] getDeptEmployeeInfo() {
		return deptEmployeeInfo;
	}
	public void setDeptEmployeeInfo(DepartmentEmployeeInfo[] deptEmployeeInfo) {
		this.deptEmployeeInfo = deptEmployeeInfo;
	}


}
