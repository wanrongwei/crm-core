package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class SelectPhoneNumRetInfo implements Serializable {

	@JsonProperty(value="SelectedNumInfo")
	public SelectedNumInfo [] selectNumInfo;

	public SelectedNumInfo[] getSelectNumInfo() {
		return selectNumInfo;
	}

	public void setSelectNumInfo(SelectedNumInfo [] selectNumInfo) {
		this.selectNumInfo = selectNumInfo;
	}
}
