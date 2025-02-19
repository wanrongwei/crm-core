package com.asiainfo.crm.so.exe.remote.third;

import java.io.Serializable;

/**
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: Crm2InterPubInfo.java
 * @Description: CRM提供给外部系统接口调用时，需要传入的公共信息
 * 
 * @version: v1.0.0
 * @author: Panqw
 * @date: Mar 23, 2011 11:13:52 AM
 * 
 * Modification History: Date Author Version Description
 * ---------------------------------------------------------* Mar 23, 2011 Panqw
 * v1.0.0 修改原因
 */
public class Crm2InterPubInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 必填,与原接口一致
	private long opId;
	// 可空
	private long keyId;
	// 必填,操作员登录组织
	private long opOrgId;
	// 必填
	private String opRegionCode;
	// 必填
	private String opCountyCode;
	// 必填,操作员归属组织
	private long orgId;
	// 操作来源
	private String busiOrigin;
	// 必填：操作员密码，明文
	private String notes;
	// 保留：统一接触编号
	private String servCode;

	public long getOpId() {
		return opId;
	}

	public void setOpId(long opId) {
		this.opId = opId;
	}

	public long getKeyId() {
		return keyId;
	}

	public void setKeyId(long keyId) {
		this.keyId = keyId;
	}

	public long getOpOrgId() {
		return opOrgId;
	}

	public void setOpOrgId(long opOrgId) {
		this.opOrgId = opOrgId;
	}

	public String getOpRegionCode() {
		return opRegionCode;
	}

	public void setOpRegionCode(String opRegionCode) {
		this.opRegionCode = opRegionCode;
	}

	public String getOpCountyCode() {
		return opCountyCode;
	}

	public void setOpCountyCode(String opCountyCode) {
		this.opCountyCode = opCountyCode;
	}

	public long getOrgId() {
		return orgId;
	}

	public void setOrgId(long orgId) {
		this.orgId = orgId;
	}

	public String getBusiOrigin() {
		return busiOrigin;
	}

	public void setBusiOrigin(String busiOrigin) {
		this.busiOrigin = busiOrigin;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getServCode() {
		return servCode;
	}

	public void setServCode(String servCode) {
		this.servCode = servCode;
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("opId:").append(getOpId()).append("\n");
		sb.append("keyId:").append(getKeyId()).append("\n");
		sb.append("opOrgId:").append(getOpOrgId()).append("\n");
		sb.append("opRegionCode:").append(getOpRegionCode()).append("\n");
		sb.append("opCountyCode:").append(getOpCountyCode()).append("\n");
		sb.append("orgId:").append(getOrgId()).append("\n");
		sb.append("busiOrigin:").append(getBusiOrigin()).append("\n");
		sb.append("notes:").append(getNotes()).append("\n");
		sb.append("servCode:").append(getServCode()).append("\n");
		return sb.toString();
	}


}
