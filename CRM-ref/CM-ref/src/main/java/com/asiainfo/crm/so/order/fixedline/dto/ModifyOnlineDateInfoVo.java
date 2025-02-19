package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class ModifyOnlineDateInfoVo extends NewContactInfoVO implements Serializable{
	private static final long serialVersionUID = -705134522363013007L;
	private String newOnlineDate;
	private String oldOnlineDate;
	private String slotCd;
	private String slotFrom;
	private String slotTo;
	private String visitService;
	private String oldOfflineDate;
	private String newOfflineDate;
	public String getNewOnlineDate() {
		return newOnlineDate;
	}
	public void setNewOnlineDate(String newOnlineDate) {
		this.newOnlineDate = newOnlineDate;
	}
	public String getOldOnlineDate() {
		return oldOnlineDate;
	}
	public void setOldOnlineDate(String oldOnlineDate) {
		this.oldOnlineDate = oldOnlineDate;
	}
	public String getSlotCd() {
		return slotCd;
	}
	public void setSlotCd(String slotCd) {
		this.slotCd = slotCd;
	}
	public String getSlotFrom() {
		return slotFrom;
	}
	public void setSlotFrom(String slotFrom) {
		this.slotFrom = slotFrom;
	}
	public String getSlotTo() {
		return slotTo;
	}
	public void setSlotTo(String slotTo) {
		this.slotTo = slotTo;
	}
	public String getVisitService() {
		return visitService;
	}
	public void setVisitService(String visitService) {
		this.visitService = visitService;
	}
	public String getOldOfflineDate() {
		return oldOfflineDate;
	}
	public void setOldOfflineDate(String oldOfflineDate) {
		this.oldOfflineDate = oldOfflineDate;
	}
	public String getNewOfflineDate() {
		return newOfflineDate;
	}
	public void setNewOfflineDate(String newOfflineDate) {
		this.newOfflineDate = newOfflineDate;
	}
	

}
