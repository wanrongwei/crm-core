package com.asiainfo.crm.so.teaminvoke.in.service.oss.dto;

import java.io.Serializable;

public class WorkTimeSlotCdDTO implements Serializable {
	private static final long serialVersionUID = 3012244334111L;
	private String slotCd;
	private String slotTo;
	private String slotFrom;
	public String getSlotTo() {
		return slotTo;
	}
	public void setSlotTo(String slotTo) {
		this.slotTo = slotTo;
	}
	public String getSlotFrom() {
		return slotFrom;
	}
	public void setSlotFrom(String slotFrom) {
		this.slotFrom = slotFrom;
	}
	public String getSlotCd() {
		return slotCd;
	}
	public void setSlotCd(String slotCd) {
		this.slotCd = slotCd;
	}
}
