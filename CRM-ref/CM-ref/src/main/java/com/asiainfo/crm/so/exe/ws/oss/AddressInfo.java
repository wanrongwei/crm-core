package com.asiainfo.crm.so.exe.ws.oss;

import java.io.Serializable;

public class AddressInfo implements Serializable{
	private String country;
	private String city;
	private String street;
	private String houseNo;
	private String mainDoor;
	private String floor;
	private String doorNo;
	private String zipCode;
	private String municipalCode;
	private String county;
	private long standardAddrId;

	public long getStandardAddrId() {
		return standardAddrId;
	}

	public void setStandardAddrId(long standardAddrId) {
		this.standardAddrId = standardAddrId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getMainDoor() {
		return mainDoor;
	}

	public void setMainDoor(String mainDoor) {
		this.mainDoor = mainDoor;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getMunicipalCode() {
		return municipalCode;
	}

	public void setMunicipalCode(String municipalCode) {
		this.municipalCode = municipalCode;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

}
