package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class SetBillDeliveryTypeReq implements Serializable {
	@JsonProperty(value="ServiceNum")
	public String serviceNum;
	@JsonProperty(value="BillType")
	public int billType;
	@JsonProperty(value="BillFormatId")
	public String billFormatId;
	@JsonProperty(value="ActionType")
	public int actionType;
	@JsonProperty(value="PostMode")
	public int[] postMode;
	@JsonProperty(value="PostCode")
	public String postCode;
	@JsonProperty(value="Addressee")
	public String addressee;
	@JsonProperty(value="Address")
	public String address;
	@JsonProperty(value="Email")
	public String eMail;
	@JsonProperty(value="Fax")
	public String fax;
	public String getServiceNum() {
		return serviceNum;
	}
	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}
	public int getBillType() {
		return billType;
	}
	public void setBillType(int billType) {
		this.billType = billType;
	}
	public String getBillFormatId() {
		return billFormatId;
	}
	public void setBillFormatId(String billFormatId) {
		this.billFormatId = billFormatId;
	}
	public int getActionType() {
		return actionType;
	}
	public void setActionType(int actionType) {
		this.actionType = actionType;
	}
	public int[] getPostMode() {
		return postMode;
	}
	public void setPostMode(int[] postMode) {
		this.postMode = postMode;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getAddressee() {
		return addressee;
	}
	public void setAddressee(String addressee) {
		this.addressee = addressee;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	
	
}
