package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetIndividualBillRetInfo implements Serializable {
	
	@JsonProperty(value="CustId")
	public long custId;
	@JsonProperty(value="UserId")
	public long userId;
	@JsonProperty(value="BillType")
	public int billType;
	@JsonProperty(value="BillFormatId")
	public String billFormatId;
	@JsonProperty(value="PostMode")
	public int[] postMode;
	@JsonProperty(value="PostCode")
	public String postCode;
	@JsonProperty(value="Addressee")
	public String addressee;
	@JsonProperty(value="Address")
	public String address;
	@JsonProperty(value="EMail")
	public String eMail;
	@JsonProperty(value="Fax")
	public String fax;
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
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
