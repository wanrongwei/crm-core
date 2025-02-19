package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class ChangeTechParamInfoVo implements Serializable {

	private static final long serialVersionUID = -1539190220463500L;
	
	private String oldCoName;
	private String oldCoKind;
	private String oldCoAccessType;
	private String oldCoType;
	private String newCoName;
	private String newCoKind;
	private String newCoAccessType;
	private String newCoType;
	private String effType;
	private String effDate;
	private String sendToTdc;
	public String getOldCoName() {
		return oldCoName;
	}
	public void setOldCoName(String oldCoName) {
		this.oldCoName = oldCoName;
	}
	public String getOldCoKind() {
		return oldCoKind;
	}
	public void setOldCoKind(String oldCoKind) {
		this.oldCoKind = oldCoKind;
	}
	public String getOldCoAccessType() {
		return oldCoAccessType;
	}
	public void setOldCoAccessType(String oldCoAccessType) {
		this.oldCoAccessType = oldCoAccessType;
	}
	public String getOldCoType() {
		return oldCoType;
	}
	public void setOldCoType(String oldCoType) {
		this.oldCoType = oldCoType;
	}
	public String getNewCoName() {
		return newCoName;
	}
	public void setNewCoName(String newCoName) {
		this.newCoName = newCoName;
	}
	public String getNewCoKind() {
		return newCoKind;
	}
	public void setNewCoKind(String newCoKind) {
		this.newCoKind = newCoKind;
	}
	public String getNewCoAccessType() {
		return newCoAccessType;
	}
	public void setNewCoAccessType(String newCoAccessType) {
		this.newCoAccessType = newCoAccessType;
	}
	public String getNewCoType() {
		return newCoType;
	}
	public void setNewCoType(String newCoType) {
		this.newCoType = newCoType;
	}
	public String getEffType() {
		return effType;
	}
	public void setEffType(String effType) {
		this.effType = effType;
	}
	public String getEffDate() {
		return effDate;
	}
	public void setEffDate(String effDate) {
		this.effDate = effDate;
	}
	public String getSendToTdc() {
		return sendToTdc;
	}
	public void setSendToTdc(String sendToTdc) {
		this.sendToTdc = sendToTdc;
	}
	
}
