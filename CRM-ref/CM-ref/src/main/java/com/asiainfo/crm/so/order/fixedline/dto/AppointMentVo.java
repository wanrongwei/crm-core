package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class AppointMentVo extends ValidateAddressVo implements Serializable {
	private static final long serialVersionUID = -116661902202263522L;
	private String basketId;
	private String startDate;
	public String getBasketId() {
		return basketId;
	}
	public void setBasketId(String basketId) {
		this.basketId = basketId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
}
