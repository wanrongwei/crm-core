package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.asiainfo.crm.common.jsonparse.DateSerializer;

public class NetPubAppointOrderReq implements Serializable {
	@JsonProperty(value="BillId")
	public String billId;
	@JsonProperty(value="UserId")
	public long userId;
	@JsonProperty(value="CustId")
	public String custId;
	@JsonProperty(value="BusinessId")
	public String businessId;
	@JsonProperty(value="OfferId")
	public String offerId;
	@JsonProperty(value="OrderId")
	public String orderId;
	@JsonProperty(value="AppointTime")
	@JsonSerialize(using=DateSerializer.class)
	public Date appointTime;
	@JsonProperty(value="CreateDate")
	@JsonSerialize(using=DateSerializer.class)
	public Date createDate;
	@JsonProperty(value="ProductId")
	public String productId;
	@JsonProperty(value="ServiceId")
	public String serviceId;
	@JsonProperty(value="OrderType")
	public String orderType;

	
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getOfferId() {
		return offerId;
	}
	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Date getAppointTime() {
		return appointTime;
	}
	public void setAppointTime(Date appointTime) {
		this.appointTime = appointTime;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	
	
}
