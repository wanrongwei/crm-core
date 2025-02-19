package com.asiainfo.crm.cm.common.util.ws.hu;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "addressId", "country", "districtId", "zipcode", "city", "streetName", "streettype", "housenumber", "additionalhousenumber", "isvalidated", "source",
		"isblacklist", "addrdesc" })
public class address4Hu implements Serializable {

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "ADDRESS_ID")
	long addressId = 0;
	@XmlElement(name = "COUNTRY")
	String country = null;
	@XmlElement(name = "DISTRICT_ID")
	String districtId = null;
	@XmlElement(name = "ZIPCODE")
	String zipcode = null;
	@XmlElement(name = "CITY")
	String city = null;
	@XmlElement(name = "STREET_NAME")
	String streetName = null;
	@XmlElement(name = "STREET_TYPE")
	String streettype = null;
	@XmlElement(name = "HOUSE_NUMBER")
	String housenumber = null;
	@XmlElement(name = "ADDITIONAL_HOUSE_ NUMBER")
	String additionalhousenumber = null;
	@XmlElement(name = "IS_VALIDATED")
	String isvalidated = null;
	@XmlElement(name = "SOURCE")
	String source = null;
	@XmlElement(name = "IS_BLACKLIST ")
	String isblacklist = null;
	@XmlElement(name = "ADDR_DESC")
	String addrdesc = null;

	public long getAddressid() {
		return addressId;
	}

	public void setAddressid(long addressid) {
		this.addressId = addressid;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDistrictid() {
		return districtId;
	}

	public void setDistrictid(String districtid) {
		this.districtId = districtid;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreetname() {
		return streetName;
	}

	public void setStreetname(String streetname) {
		this.streetName = streetname;
	}

	public String getStreettype() {
		return streettype;
	}

	public void setStreettype(String streettype) {
		this.streettype = streettype;
	}

	public String getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}

	public String getAdditionalhousenumber() {
		return additionalhousenumber;
	}

	public void setAdditionalhousenumber(String additionalhousenumber) {
		this.additionalhousenumber = additionalhousenumber;
	}

	public String getIsvalidated() {
		return isvalidated;
	}

	public void setIsvalidated(String isvalidated) {
		this.isvalidated = isvalidated;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getIsblacklist() {
		return isblacklist;
	}

	public void setIsblacklist(String isblacklist) {
		this.isblacklist = isblacklist;
	}

	public String getAddrdesc() {
		return addrdesc;
	}

	public void setAddrdesc(String addrdesc) {
		this.addrdesc = addrdesc;
	}

}
