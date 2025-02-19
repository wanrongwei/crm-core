package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class CreateUserOrder implements Serializable {
	@JsonProperty(value="CustName")
	public String custName;
	@JsonProperty(value="Gender")
	public String gender;
	@JsonProperty(value="IDType")
	public int iDType;
	@JsonProperty(value="IDCardNum")
	public String iDCardNum;
	@JsonProperty(value="Address")
	public String address;
	@JsonProperty(value="Contacter")
	public String contacter;
	@JsonProperty(value="ContactPhone")
	public String contactPhone;
	@JsonProperty(value="ServiceNum")
	public String serviceNum;
	@JsonProperty(value="MainOfferId")
	public String mainOfferId;
	@JsonProperty(value="OneOfThree")
	public String oneOfThree;
	@JsonProperty(value="VasOffer")
	public VasOffer[] vasOffer;
	@JsonProperty(value="IMSI")
	public String imsi;
	@JsonProperty(value="ICCID")
	public String iccID;
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getiDType() {
		return iDType;
	}
	public void setiDType(int iDType) {
		this.iDType = iDType;
	}
	public String getiDCardNum() {
		return iDCardNum;
	}
	public void setiDCardNum(String iDCardNum) {
		this.iDCardNum = iDCardNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContacter() {
		return contacter;
	}
	public void setContacter(String contacter) {
		this.contacter = contacter;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getServiceNum() {
		return serviceNum;
	}
	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}
	public String getMainOfferId() {
		return mainOfferId;
	}
	public void setMainOfferId(String mainOfferId) {
		this.mainOfferId = mainOfferId;
	}
	public String getOneOfThree() {
		return oneOfThree;
	}
	public void setOneOfThree(String oneOfThree) {
		this.oneOfThree = oneOfThree;
	}
	public VasOffer[] getVasOffer() {
		return vasOffer;
	}
	public void setVasOffer(VasOffer[] vasOffer) {
		this.vasOffer = vasOffer;
	}
	public String getImsi() {
		return imsi;
	}
	public void setImsi(String imsi) {
		this.imsi = imsi;
	}
	public String getIccID() {
		return iccID;
	}
	public void setIccID(String iccID) {
		this.iccID = iccID;
	}
	
}
