package com.asiainfo.crm.so.exe.ws.oss;

import java.io.Serializable;
import java.util.List;

public class ResultInfo implements Serializable {
	private static final long serialVersionUID = 7303214174125611979L;
	private String result_code;
	private String result_msg;
	private int routeNumber;
	private int freeRouteNumber;
	private String municipalityCode;
	private String addressId;
	private String lockedSpeed;
	private List<CoInfo> coInfo;
	private List<LineProductInfo> lineProductInfo;
	private List<AddressInfo> addressInfo;
	private List<WorkTimeslot> workTimeslot;
	private String technologyType;
	private String plugType;
	private String maxSpeed;
	private String offlineDate;

	public String getLockedSpeed() {
		return lockedSpeed;
	}

	public String getTechnologyType() {
		return technologyType;
	}

	public void setTechnologyType(String technologyType) {
		this.technologyType = technologyType;
	}

	public void setLockedSpeed(String lockedSpeed) {
		this.lockedSpeed = lockedSpeed;
	}

	public List<WorkTimeslot> getWorkTimeslot() {
		return workTimeslot;
	}

	public void setWorkTimeslot(List<WorkTimeslot> workTimeslot) {
		this.workTimeslot = workTimeslot;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getMunicipalityCode() {
		return municipalityCode;
	}

	public void setMunicipalityCode(String municipalityCode) {
		this.municipalityCode = municipalityCode;
	}

	public String getResult_code() {
		return result_code;
	}

	public void setResult_code(String result_code) {
		this.result_code = result_code;
	}

	public String getResult_msg() {
		return result_msg;
	}

	public void setResult_msg(String result_msg) {
		this.result_msg = result_msg;
	}

	public List<CoInfo> getCoInfo() {
		return coInfo;
	}

	public void setCoInfo(List<CoInfo> coInfo) {
		this.coInfo = coInfo;
	}

	public List<LineProductInfo> getLineProductInfo() {
		return lineProductInfo;
	}

	public void setLineProductInfo(List<LineProductInfo> lineProductInfo) {
		this.lineProductInfo = lineProductInfo;
	}

	public List<AddressInfo> getAddressInfo() {
		return addressInfo;
	}

	public void setAddressInfo(List<AddressInfo> addressInfo) {
		this.addressInfo = addressInfo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getRouteNumber() {
		return routeNumber;
	}

	public void setRouteNumber(int routeNumber) {
		this.routeNumber = routeNumber;
	}

	public int getFreeRouteNumber() {
		return freeRouteNumber;
	}

	public void setFreeRouteNumber(int freeRouteNumber) {
		this.freeRouteNumber = freeRouteNumber;
	}

	public String getPlugType() {
		return plugType;
	}

	public void setPlugType(String plugType) {
		this.plugType = plugType;
	}

	public String getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getOfflineDate() {
		return offlineDate;
	}

	public void setOfflineDate(String offlineDate) {
		this.offlineDate = offlineDate;
	}

}
