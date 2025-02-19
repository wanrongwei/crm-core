package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class ReceiverVo implements Serializable {

	private static final long serialVersionUID = -1539190220463500L;
	private long custId;
	private String custName;
	private String custType;
	private String paymentTerms;
	private String stopPaymentFee;
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public String getPaymentTerms() {
		return paymentTerms;
	}
	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}
	public String getStopPaymentFee() {
		return stopPaymentFee;
	}
	public void setStopPaymentFee(String stopPaymentFee) {
		this.stopPaymentFee = stopPaymentFee;
	}
	
}
