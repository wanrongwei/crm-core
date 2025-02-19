package com.asiainfo.crm.so.teaminvoke.out.service.bean;

import java.io.Serializable;

public class DepositRtnReq implements Serializable{
	private long insOfferId;
	private String regionId;
	public long getInsOfferId() {
		return insOfferId;
	}
	public void setInsOfferId(long insOfferId) {
		this.insOfferId = insOfferId;
	}
	public String getRegionId() {
		return regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	
}
