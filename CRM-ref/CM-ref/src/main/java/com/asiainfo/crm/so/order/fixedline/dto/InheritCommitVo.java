package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class InheritCommitVo implements Serializable {

	private static final long serialVersionUID = -1539190220463500L;
	private String dealCommitType;
	public String getDealCommitType() {
		return dealCommitType;
	}
	public void setDealCommitType(String dealCommitType) {
		this.dealCommitType = dealCommitType;
	}
	
}
