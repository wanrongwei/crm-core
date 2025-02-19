package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class ValidateAddressVo implements Serializable {
	private static final long serialVersionUID = -1166619022022635L;
	private long customerOrderId;
	private String reqOrderId;//发SFF请求ID
	private long custId;
	private AddressInfoVo addressInfo;
	private String billId;
	private String regionId;
	private long businessId;
	private String ignoreOngoingOrder;
	private String basketID;
	private String installationId;
	private String infrastructureOwnerCode;
	private String isModify;
	private long userId;
	private String platform;
	private Boolean isChangePricePlan;
	private Boolean bulkPreqFlag = false;
	
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public long getCustomerOrderId() {
		return customerOrderId;
	}
	public void setCustomerOrderId(long customerOrderId) {
		this.customerOrderId = customerOrderId;
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public AddressInfoVo getAddressInfo() {
		return addressInfo;
	}
	public void setAddressInfo(AddressInfoVo addressInfo) {
		this.addressInfo = addressInfo;
	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getRegionId() {
		return regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	public long getBusinessId() {
		return businessId;
	}
	public void setBusinessId(long businessId) {
		this.businessId = businessId;
	}
	public String getReqOrderId() {
		return reqOrderId;
	}
	public void setReqOrderId(String reqOrderId) {
		this.reqOrderId = reqOrderId;
	}
	public String getIgnoreOngoingOrder() {
		return ignoreOngoingOrder;
	}
	public void setIgnoreOngoingOrder(String ignoreOngoingOrder) {
		this.ignoreOngoingOrder = ignoreOngoingOrder;
	}
	public String getBasketID() {
		return basketID;
	}
	public void setBasketID(String basketID) {
		this.basketID = basketID;
	}
	public String getInstallationId() {
		return installationId;
	}
	public void setInstallationId(String installationId) {
		this.installationId = installationId;
	}
	public String getInfrastructureOwnerCode() {
		return infrastructureOwnerCode;
	}
	public void setInfrastructureOwnerCode(String infrastructureOwnerCode) {
		this.infrastructureOwnerCode = infrastructureOwnerCode;
	}
	public String getIsModify() {
		return isModify;
	}
	public void setIsModify(String isModify) {
		this.isModify = isModify;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public Boolean getIsChangePricePlan() {
		return isChangePricePlan;
	}
	public void setIsChangePricePlan(Boolean isChangePricePlan) {
		this.isChangePricePlan = isChangePricePlan;
	}

	public Boolean getBulkPreqFlag() {
		return bulkPreqFlag;
	}

	public void setBulkPreqFlag(Boolean bulkPreqFlag) {
		this.bulkPreqFlag = bulkPreqFlag;
	}
}
