package com.asiainfo.crm.so.teaminvoke.out.service.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class CrmOrderInfo implements Serializable {

	/** serialVersionUID*/  
	private static final long serialVersionUID = -5081949034739134070L;
	private long sapOrderId;
	private String ordSpecType;//区分是否是裸机 1.裸机 2合约机
	private String orderType;//订单类型preOrder/futureOrder/onStockOrder
	private String businessType;//业务类型
	private String custName;//客户名称
	private long custId;//客户id
	private String createDate;//创建时间
	private boolean isAbleDelete;//是否能删除
	private boolean isAbleModify;//是否能修改
	private long customerOrderId;//crm单个订单号
	private long businessId;//业务id
	private long cartId;//购物车id
	private long oseOrderId;//ose订单编号
	private long mainOfferId; 
	private String billId;//计费号码
	private long imeiDiscount;
	private long agentDiscount;
	private String insurance;
	private String imei;
	private String simCardNumber;
	private String trackTrace;
	private Map phoneCommitment;
	private Map subscriptionCommitment;
	private List<Object> addonOfferList;
	private Map npInfo;
	private String linkToContract;
	private String agreementNumber;
	private Map billingAddress;
	private Map shipmentAddress;
	private Map legalAddress;
	private Map deliveryAttr;
	
	
	public Map getLegalAddress() {
		return legalAddress;
	}

	public void setLegalAddress(Map legalAddress) {
		this.legalAddress = legalAddress;
	}

	public Map getDeliveryAttr() {
		return deliveryAttr;
	}

	public void setDeliveryAttr(Map deliveryAttr) {
		this.deliveryAttr = deliveryAttr;
	}

	private HandsetOfferInfo offerInfoList[];//offer信息

	
	public long getImeiDiscount() {
		return imeiDiscount;
	}

	public void setImeiDiscount(long imeiDiscount) {
		this.imeiDiscount = imeiDiscount;
	}

	public long getAgentDiscount() {
		return agentDiscount;
	}

	public void setAgentDiscount(long agentDiscount) {
		this.agentDiscount = agentDiscount;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getSimCardNumber() {
		return simCardNumber;
	}

	public void setSimCardNumber(String simCardNumber) {
		this.simCardNumber = simCardNumber;
	}

	public String getTrackTrace() {
		return trackTrace;
	}

	public void setTrackTrace(String trackTrace) {
		this.trackTrace = trackTrace;
	}

	public Map getPhoneCommitment() {
		return phoneCommitment;
	}

	public void setPhoneCommitment(Map phoneCommitment) {
		this.phoneCommitment = phoneCommitment;
	}

	public Map getSubscriptionCommitment() {
		return subscriptionCommitment;
	}

	public void setSubscriptionCommitment(Map subscriptionCommitment) {
		this.subscriptionCommitment = subscriptionCommitment;
	}

	public List<Object> getAddonOfferList() {
		return addonOfferList;
	}

	public void setAddonOfferList(List<Object> addonOfferList) {
		this.addonOfferList = addonOfferList;
	}

	public Map getNpInfo() {
		return npInfo;
	}

	public void setNpInfo(Map npInfo) {
		this.npInfo = npInfo;
	}

	public String getLinkToContract() {
		return linkToContract;
	}

	public void setLinkToContract(String linkToContract) {
		this.linkToContract = linkToContract;
	}

	public String getAgreementNumber() {
		return agreementNumber;
	}

	public void setAgreementNumber(String agreementNumber) {
		this.agreementNumber = agreementNumber;
	}

	public Map getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Map billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Map getShipmentAddress() {
		return shipmentAddress;
	}

	public void setShipmentAddress(Map shipmentAddress) {
		this.shipmentAddress = shipmentAddress;
	}

	public long getMainOfferId() {
		return mainOfferId;
	}

	public void setMainOfferId(long mainOfferId) {
		this.mainOfferId = mainOfferId;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public long getBusinessId() {
		return businessId;
	}

	public void setBusinessId(long businessId) {
		this.businessId = businessId;
	}

	public long getSapOrderId() {
		return sapOrderId;
	}

	public void setSapOrderId(long sapOrderId) {
		this.sapOrderId = sapOrderId;
	}

	public String getOrdSpecType() {
		return ordSpecType;
	}

	public void setOrdSpecType(String ordSpecType) {
		this.ordSpecType = ordSpecType;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public boolean isAbleDelete() {
		return isAbleDelete;
	}

	public void setAbleDelete(boolean isAbleDelete) {
		this.isAbleDelete = isAbleDelete;
	}

	public boolean isAbleModify() {
		return isAbleModify;
	}

	public void setAbleModify(boolean isAbleModify) {
		this.isAbleModify = isAbleModify;
	}

	public long getCustomerOrderId() {
		return customerOrderId;
	}

	public void setCustomerOrderId(long customerOrderId) {
		this.customerOrderId = customerOrderId;
	}

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public long getOseOrderId() {
		return oseOrderId;
	}

	public void setOseOrderId(long oseOrderId) {
		this.oseOrderId = oseOrderId;
	}

	public HandsetOfferInfo[] getOfferInfoList() {
		return offerInfoList;
	}

	public void setOfferInfoList(HandsetOfferInfo[] offerInfoList) {
		this.offerInfoList = offerInfoList;
	}
	
	
}
