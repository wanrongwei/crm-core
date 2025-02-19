package com.asiainfo.crm.so.order.productOffering.dto;

import java.io.Serializable;
import java.util.Date;

public class SalesInfoVo implements Serializable{
	
	private static final long serialVersionUID = 1773788898744743079L;
	
	private long quantity;
	private Date expDeliveryDate;
	private Date startDate;
	private Date endDate;
	private String unit;
	
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public Date getExpDeliveryDate() {
		return expDeliveryDate;
	}
	public void setExpDeliveryDate(Date expDeliveryDate) {
		this.expDeliveryDate = expDeliveryDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
