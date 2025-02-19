package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class OrderVo implements Serializable {
	private static final long serialVersionUID = -2539190984220463508L;
    private long customerOrderId;
    private long preCustomerOrderId;
    private long businessId;
    private boolean isNP;
    private long referenceId;
    private long channelType;
    private String serviceSubscriptionID;
    private String cprNum;
    private String isOrderOperation;//Y/N 是否改单，不传或传N就不是改单
    private long mainOfferId;
    private String isSbbu;
	private String isCapacity;
    
    private String isChangePricePlan;
	public String getIsChangePricePlan() {
		return isChangePricePlan;
	}
	public void setIsChangePricePlan(String isChangePricePlan) {
		this.isChangePricePlan = isChangePricePlan;
	}
    
    private String platform;
    
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getCprNum() {
		return cprNum;
	}
	public String getIsOrderOperation() {
		return isOrderOperation;
	}
	public void setIsOrderOperation(String isOrderOperation) {
		this.isOrderOperation = isOrderOperation;
	}
	public void setCprNum(String cprNum) {
		this.cprNum = cprNum;
	}
	public String getServiceSubscriptionID() {
		return serviceSubscriptionID;
	}
	public void setServiceSubscriptionID(String serviceSubscriptionID) {
		this.serviceSubscriptionID = serviceSubscriptionID;
	}
	public String getBasketId() {
		return basketId;
	}
	public void setBasketId(String basketId) {
		this.basketId = basketId;
	}
	private String basketId;
    public void setCustomerOrderId(long customerOrderId) {
         this.customerOrderId = customerOrderId;
     }
     public long getCustomerOrderId() {
         return customerOrderId;
     }

    public void setBusinessId(long businessId) {
         this.businessId = businessId;
     }
     public long getBusinessId() {
         return businessId;
     }

    public void setIsNP(boolean isNP) {
         this.isNP = isNP;
     }
     public boolean getIsNP() {
         return isNP;
     }
	public long getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(long referenceId) {
		this.referenceId = referenceId;
	}
	public long getChannelType() {
		return channelType;
	}
	public void setChannelType(long channelType) {
		this.channelType = channelType;
	}
	public long getPreCustomerOrderId() {
		return preCustomerOrderId;
	}
	public void setPreCustomerOrderId(long preCustomerOrderId) {
		this.preCustomerOrderId = preCustomerOrderId;
	}
	public long getMainOfferId() {
		return mainOfferId;
	}
	public void setMainOfferId(long mainOfferId) {
		this.mainOfferId = mainOfferId;
	}
	public String getIsSbbu() {
		return isSbbu;
	}
	public void setIsSbbu(String isSbbu) {
		this.isSbbu = isSbbu;
	}
	public String getIsCapacity() {
		return isCapacity;
	}
	public void setIsCapacity(String isCapacity) {
		this.isCapacity = isCapacity;
	}
}
