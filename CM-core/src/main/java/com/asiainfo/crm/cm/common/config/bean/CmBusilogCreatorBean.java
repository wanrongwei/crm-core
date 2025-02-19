package com.asiainfo.crm.cm.common.config.bean;

import java.io.Serializable;

public class CmBusilogCreatorBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -473097393998659769L;

	private String valueObjectType;

	private String creatorImplClass;

	public CmBusilogCreatorBean() {
		super();
	}

	public CmBusilogCreatorBean(String valueObjectType, String creatorImplClass) {
		super();
		this.valueObjectType = valueObjectType;
		this.creatorImplClass = creatorImplClass;
	}

	public String getValueObjectType() {
		return valueObjectType;
	}

	public void setValueObjectType(String valueObjectType) {
		this.valueObjectType = valueObjectType;
	}

	public String getCreatorImplClass() {
		return creatorImplClass;
	}

	public void setCreatorImplClass(String creatorImplClass) {
		this.creatorImplClass = creatorImplClass;
	}

}
