package com.asiainfo.crm.so.order.productOffering.dto.condition;

import java.io.Serializable;
import java.util.Map;

public class OTCPriceConditionVo implements Serializable{

	private static final long serialVersionUID = 5025437159493449933L;

	private long offerId;
	private long offerInstId;
	private long businessId;
	private long offerIndexId;
	// 该费用相关参数
	private Map params;
	
	public long getOfferId() {
		return offerId;
	}
	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}
	public long getOfferInstId() {
		return offerInstId;
	}
	public void setOfferInstId(long offerInstId) {
		this.offerInstId = offerInstId;
	}
	public long getBusinessId() {
		return businessId;
	}
	public void setBusinessId(long businessId) {
		this.businessId = businessId;
	}
	public long getOfferIndexId() {
		return offerIndexId;
	}
	public void setOfferIndexId(long offerIndexId) {
		this.offerIndexId = offerIndexId;
	}
	public Map getParams() {
		return params;
	}
	public void setParams(Map params) {
		this.params = params;
	}
	
	
}

