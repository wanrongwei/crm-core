package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;
import java.util.List;

public class ValidateAddressResultVo implements Serializable {
	private static final long serialVersionUID = -266619022022632L;
	String retMsg;
    String ongoingOrderMsg;
    String orderId;
    List<AddressInfoVo> addressInfo;
    String hasOtherUser;
	public String getRetMsg() {
		return retMsg;
	}
	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}
	public String getOngoingOrderMsg() {
		return ongoingOrderMsg;
	}
	public void setOngoingOrderMsg(String ongoingOrderMsg) {
		this.ongoingOrderMsg = ongoingOrderMsg;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	 
	public String getHasOtherUser() {
		return hasOtherUser;
	}
	public void setHasOtherUser(String hasOtherUser) {
		this.hasOtherUser = hasOtherUser;
	}
	public List<AddressInfoVo> getAddressInfo() {
		return addressInfo;
	}
	public void setAddressInfo(List<AddressInfoVo> addressInfo) {
		this.addressInfo = addressInfo;
	}
    
}
