package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class BusiCustInfo implements Serializable {
	
	@JsonProperty(value="BusiCustID")
	public long busiCustID;
	@JsonProperty(value="CompanyName")
	public String companyName;
	@JsonProperty(value="IDType")
	public String iDType;
	@JsonProperty(value="IDNumber")
	public String iDNumber;
	@JsonProperty(value="LegalRepresentative")
	public String legalRepresentative;
	@JsonProperty(value="OrganizationType")
	public String organizationType;
	@JsonProperty(value="IndustryLine")
	public String industryLine;
	@JsonProperty(value="EmpolyeeSize")
	public String empolyeeSize;
	@JsonProperty(value="ContactPerson")
	public String contactPerson;
	@JsonProperty(value="ContactNumber")
	public String contactNumber;
	@JsonProperty(value="ContactNumber2")
	public String contactNumber2;
	@JsonProperty(value="Fax")
	public String fax;
	@JsonProperty(value="RegionID")
	public String regionID;
	@JsonProperty(value="CountyID")
	public String countyID;
	@JsonProperty(value="Email")
	public String email;
	@JsonProperty(value="RegisteredAddressInfo")
	public RegisteredAddressInfo registeredAddressInfo;
	@JsonProperty(value="ShippingAddressInfo")
	public ShippingAddressInfo shippingAddressInfo;
	

	public long getBusiCustID() {
		return busiCustID;
	}
	public void setBusiCustID(long busiCustID) {
		this.busiCustID = busiCustID;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getiDType() {
		return iDType;
	}
	public void setiDType(String iDType) {
		this.iDType = iDType;
	}
	public String getiDNumber() {
		return iDNumber;
	}
	public void setiDNumber(String iDNumber) {
		this.iDNumber = iDNumber;
	}
	public String getLegalRepresentative() {
		return legalRepresentative;
	}
	public void setLegalRepresentative(String legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
	}
	public String getOrganizationType() {
		return organizationType;
	}
	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}
	public String getIndustryLine() {
		return industryLine;
	}
	public void setIndustryLine(String industryLine) {
		this.industryLine = industryLine;
	}
	public String getEmpolyeeSize() {
		return empolyeeSize;
	}
	public void setEmpolyeeSize(String empolyeeSize) {
		this.empolyeeSize = empolyeeSize;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getContactNumber2() {
		return contactNumber2;
	}
	public void setContactNumber2(String contactNumber2) {
		this.contactNumber2 = contactNumber2;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getRegionID() {
		return regionID;
	}
	public void setRegionID(String regionID) {
		this.regionID = regionID;
	}
	public String getCountyID() {
		return countyID;
	}
	public void setCountyID(String countyID) {
		this.countyID = countyID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public RegisteredAddressInfo getRegisteredAddressInfo() {
		return registeredAddressInfo;
	}
	public void setRegisteredAddressInfo(RegisteredAddressInfo registeredAddressInfo) {
		this.registeredAddressInfo = registeredAddressInfo;
	}
	public ShippingAddressInfo getShippingAddressInfo() {
		return shippingAddressInfo;
	}
	public void setShippingAddressInfo(ShippingAddressInfo shippingAddressInfo) {
		this.shippingAddressInfo = shippingAddressInfo;
	}
	
}
