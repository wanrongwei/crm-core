package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class OrdSubmmitResultVo implements Serializable {
	private static final long serialVersionUID = -2539195225263541L;
	
	private boolean isSuccess;
	private String message;
	private long orderId;
	private String orderCode ;
	private boolean isNeedContract;
	private String contractUrl;
	private String orderDate;
	private long acctId;
	private long custId;
	private String payUrl;
	private String errorCode;
	private String serviceSubscriptionId;
	private String agreementId;
	private String onlineDateChangeMsg;
	
	public String getOnlineDateChangeMsg() {
		return onlineDateChangeMsg;
	}
	public void setOnlineDateChangeMsg(String onlineDateChangeMsg) {
		this.onlineDateChangeMsg = onlineDateChangeMsg;
	}
	public String getAgreementId() {
		return agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getServiceSubscriptionId() {
		return serviceSubscriptionId;
	}
	public void setServiceSubscriptionId(String serviceSubscriptionId) {
		this.serviceSubscriptionId = serviceSubscriptionId;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public boolean getIsNeedContract() {
		return isNeedContract;
	}
	public void setIsNeedContract(boolean isNeedContract) {
		this.isNeedContract = isNeedContract;
	}
	public String getContractUrl() {
		return contractUrl;
	}
	public void setContractUrl(String contractUrl) {
		this.contractUrl = contractUrl;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public long getAcctId() {
		return acctId;
	}
	public void setAcctId(long acctId) {
		this.acctId = acctId;
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getPayUrl() {
		return payUrl;
	}
	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}
	public boolean getIsSuccess() {
		return isSuccess;
	}
	public void setIsSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	
	
}
