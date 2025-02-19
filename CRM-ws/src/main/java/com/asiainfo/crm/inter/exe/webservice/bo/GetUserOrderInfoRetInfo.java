package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetUserOrderInfoRetInfo implements Serializable {
	@JsonProperty(value="OrderInfo")
	public OrderInfo[] orderInfo;
	@JsonProperty(value="Count")
	public int count;
	public OrderInfo[] getOrderInfo() {
		return orderInfo;
	}
	public void setOrderInfo(OrderInfo[] orderInfo) {
		this.orderInfo = orderInfo;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
