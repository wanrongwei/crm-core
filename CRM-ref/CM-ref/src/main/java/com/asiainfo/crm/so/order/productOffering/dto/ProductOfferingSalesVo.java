package com.asiainfo.crm.so.order.productOffering.dto;

import java.io.Serializable;
import java.util.Date;

public class ProductOfferingSalesVo implements Serializable{
	
	private static final long serialVersionUID = 1773788898744743079L;
	
	private long offerId;
	private String offerName;
	private boolean isBackOrder;
	private boolean isPreOrder;
	private String stockType;
	private Date startDate;
	private Date endDate;
	private SalesInfoVo[] salesInfos;
	
	public long getOfferId() {
		return offerId;
	}
	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public boolean isBackOrder() {
		return isBackOrder;
	}
	public void setBackOrder(boolean isBackOrder) {
		this.isBackOrder = isBackOrder;
	}
	public boolean isPreOrder() {
		return isPreOrder;
	}
	public void setPreOrder(boolean isPreOrder) {
		this.isPreOrder = isPreOrder;
	}
	public String getStockType() {
		return stockType;
	}
	public void setStockType(String stockType) {
		this.stockType = stockType;
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
	public SalesInfoVo[] getSalesInfos() {
		return salesInfos;
	}
	public void setSalesInfos(SalesInfoVo[] salesInfos) {
		this.salesInfos = salesInfos;
	}

}
