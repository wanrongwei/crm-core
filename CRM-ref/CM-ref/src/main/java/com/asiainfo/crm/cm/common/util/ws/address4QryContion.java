package com.asiainfo.crm.cm.common.util.ws;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "country", "addressType", "districtId", "zipcode", "city", "county", "streetName", "apartment", "floor", "houseLetter", "houseNumber", "mainDoor",
		"doorNumber", "addrDesc", "blackState", "deliveryState", "municipality", "coName", "poBox", "startIndex", "pageSize", "soundexval", "suggestiontype","streetName2","streetName3"})
public class address4QryContion implements Serializable {

	/**
	 * 地址对象类
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "COUNTRY")
	String country = null;
	@XmlElement(name = "ADDRESS_TYPE")
	String addressType = null;
	@XmlElement(name = "DISTRICT_ID")
	String districtId = null;
	@XmlElement(name = "ZIPCODE")
	String zipcode = null;
	@XmlElement(name = "CITY")
	String city = null;
	@XmlElement(name = "COUNTY")
	String county = null;
	@XmlElement(name = "STREET_NAME")
	String streetName = null;
	@XmlElement(name = "DIRECTION")
	String apartment = null;
	@XmlElement(name = "FLOOR")
	String floor = null;
	@XmlElement(name = "HOUSE_LETTER")
	String houseLetter = null;
	@XmlElement(name = "HOUSE_NUMBER")
	String houseNumber = null;
	@XmlElement(name = "MAIN_DOOR")
	String mainDoor = null;
	@XmlElement(name = "DOOR_NUMBER")
	String doorNumber = null;
	/*
	 * @XmlElement(name = "PLACE_NAME")
	 * String placeName = null;
	 * @XmlElement(name = "BUILDING_NO")
	 * String buildingNo = null;
	 */
	@XmlElement(name = "ADDR_DESC")
	String addrDesc = null;
	@XmlElement(name = "BLACK_STATE")
	String blackState = null;
	@XmlElement(name = "DELIVERY_STATE")
	String deliveryState = null;
	@XmlElement(name = "MUNICIPALITY")
	String municipality = null;
	@XmlElement(name = "C_O")
	String coName = null;
	@XmlElement(name = "PO_BOX")
	String poBox = null;
	@XmlElement(name = "START_INDEX")
	int startIndex = 0;
	@XmlElement(name = "PAGE_SIZE")
	int pageSize = 0;
	@XmlElement(name = "SOUNDEXVAL")
	int soundexval = 0;
	@XmlElement(name = "SUGGESTIONTYPE")
	int suggestiontype = 0;
	@XmlElement(name = "STREET_NAME2")
	String streetName2 = null;
	@XmlElement(name = "STREET_NAME3")
	String streetName3 = null;

	public String getStreetName2() {
		return streetName2;
	}

	public void setStreetName2(String streetName2) {
		this.streetName2 = streetName2;
	}

	public String getStreetName3() {
		return streetName3;
	}

	public void setStreetName3(String streetName3) {
		this.streetName3 = streetName3;
	}

	public int getSoundexval() {
		return soundexval;
	}

	public void setSoundexval(int soundexval) {
		this.soundexval = soundexval;
	}

	public int getSuggestiontype() {
		return suggestiontype;
	}

	public void setSuggestiontype(int suggestiontype) {
		this.suggestiontype = suggestiontype;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getPoBox() {
		return poBox;
	}

	public void setPoBox(String poBox) {
		this.poBox = poBox;
	}

	public String getCoName() {
		return coName;
	}

	public void setCoName(String coName) {
		this.coName = coName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getDistrictId() {
		return districtId;
	}

	public void setDistrictId(String districtId) {
		this.districtId = districtId;
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

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getHouseLetter() {
		return houseLetter;
	}

	public void setHouseLetter(String houseLetter) {
		this.houseLetter = houseLetter;
	}

	public String getMainDoor() {
		return mainDoor;
	}

	public void setMainDoor(String mainDoor) {
		this.mainDoor = mainDoor;
	}

	/**
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}

	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}

	/**
	 * @return the addrDesc
	 */
	public String getAddrDesc() {
		return addrDesc;
	}

	/**
	 * @param addrDesc the addrDesc to set
	 */
	public void setAddrDesc(String addrDesc) {
		this.addrDesc = addrDesc;
	}

	/**
	 * @return the doorNumber
	 */
	public String getDoorNumber() {
		return doorNumber;
	}

	/**
	 * @param doorNumber the doorNumber to set
	 */
	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	/**
	 * @return the blackState
	 */
	public String getBlackState() {
		return blackState;
	}

	/**
	 * @param blackState the blackState to set
	 */
	public void setBlackState(String blackState) {
		this.blackState = blackState;
	}

	/**
	 * @return the deliveryState
	 */
	public String getDeliveryState() {
		return deliveryState;
	}

	/**
	 * @param deliveryState the deliveryState to set
	 */
	public void setDeliveryState(String deliveryState) {
		this.deliveryState = deliveryState;
	}

	/**
	 * @return the municipality
	 */
	public String getMunicipality() {
		return municipality;
	}

	/**
	 * @param municipality the municipality to set
	 */
	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

}
