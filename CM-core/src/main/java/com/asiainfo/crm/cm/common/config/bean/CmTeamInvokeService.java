package com.asiainfo.crm.cm.common.config.bean;

import java.io.Serializable;

public class CmTeamInvokeService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1404986791533279086L;

	public static final String TYPE_IN = "IN";
	public static final String TYPE_OUT = "OUT";

	private String id = null;

	private String implService = null;

	private String type = null;

	private String remarks = null;
	
	private String string = null;

	public String toString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public CmTeamInvokeService(String id, String implService, String type, String remarks) {
		this.id = id;
		this.implService = implService;
		this.type = type;
		this.remarks = remarks;
	}

	public CmTeamInvokeService() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImplService() {
		return implService;
	}

	public void setImplService(String implService) {
		this.implService = implService;
	}

}
