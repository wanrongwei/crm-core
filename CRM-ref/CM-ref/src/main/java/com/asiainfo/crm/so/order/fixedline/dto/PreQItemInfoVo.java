package com.asiainfo.crm.so.order.fixedline.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

public class PreQItemInfoVo implements Serializable{
	private static final long serialVersionUID = -5854626741815757913L;
	int reasonCode;
	String msg;
	String technologyType;
	String infrastructureOwner;
	String infrastructureOwnerName;
	String bbProvidePlatform;
	int routeNumber;
	int freeRouteNumber;
	String lockedSpeed;
	LineProductInfo[] lineProductInfo;
	CoInfo[] coInfo;
	String maxSpeedUp;
	String maxSpeedDown;
	String hasPstn;
	String activeBB;//是否有
	String cmtsId;
	String installationsStatus;
	String broadbandDTv;
	String plugType;
	String visitService;
	String coName;//offlinePreQ出来的
	String maxSpeed;//Coax最大速率
	String[] optionCodes;
	String[] installationId;
	String priceCategoryCode;
	String leadTime;
	String deselectionReasonTekst;
	String deselectionReasonDate;
	String placeId;
	String placeName;
	String portSpeed;
	String cpeSpeed;
	String cpeWholesaleCapable;
	String customerJourney ;
	String technicianNeeded ;
	@JsonIgnore
	boolean isDefaultInstallation;
	String ResponseCode;
	@JsonIgnore
	String MessageCode;
	public String getResponseCode() {
		return ResponseCode;
	}
	public void setResponseCode(String responseCode) {
		ResponseCode = responseCode;
	}

	public String getMessageCode() {
		return MessageCode;
	}

	public void setMessageCode(String messageCode) {
		MessageCode = messageCode;
	}

	
	
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public boolean isDefaultInstallation() {
		return isDefaultInstallation;
	}
	public void setDefaultInstallation(boolean isDefaultInstallation) {
		this.isDefaultInstallation = isDefaultInstallation;
	}
	public String getPortSpeed() {
		return portSpeed;
	}
	public void setPortSpeed(String portSpeed) {
		this.portSpeed = portSpeed;
	}
	public String getCpeSpeed() {
		return cpeSpeed;
	}
	public void setCpeSpeed(String cpeSpeed) {
		this.cpeSpeed = cpeSpeed;
	}
	public String getCpeWholesaleCapable() {
		return cpeWholesaleCapable;
	}
	public void setCpeWholesaleCapable(String cpeWholesaleCapable) {
		this.cpeWholesaleCapable = cpeWholesaleCapable;
	}
	@JsonIgnore
	String availability;
	
	
	public String getPlaceId() {
		return placeId;
	}
	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getPlugType() {
		return plugType;
	}
	public void setPlugType(String plugType) {
		this.plugType = plugType;
	}
	public String getTechnologyType() {
		return technologyType;
	}
	public void setTechnologyType(String technologyType) {
		this.technologyType = technologyType;
	}
	public String getInfrastructureOwner() {
		return infrastructureOwner;
	}
	public void setInfrastructureOwner(String infrastructureOwner) {
		this.infrastructureOwner = infrastructureOwner;
	}
	public String getBbProvidePlatform() {
		return bbProvidePlatform;
	}
	public void setBbProvidePlatform(String bbProvidePlatform) {
		this.bbProvidePlatform = bbProvidePlatform;
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
	public String getLockedSpeed() {
		return lockedSpeed;
	}
	public void setLockedSpeed(String lockedSpeed) {
		this.lockedSpeed = lockedSpeed;
	}
 
	public LineProductInfo[] getLineProductInfo() {
		return lineProductInfo;
	}
	public void setLineProductInfo(LineProductInfo[] lineProductInfo) {
		this.lineProductInfo = lineProductInfo;
	}
	public CoInfo[] getCoInfo() {
		return coInfo;
	}
	public void setCoInfo(CoInfo[] coInfo) {
		this.coInfo = coInfo;
	}
	public String getMaxSpeedUp() {
		return maxSpeedUp;
	}
	public void setMaxSpeedUp(String maxSpeedUp) {
		this.maxSpeedUp = maxSpeedUp;
	}
	public String getMaxSpeedDown() {
		return maxSpeedDown;
	}
	public void setMaxSpeedDown(String maxSpeedDown) {
		this.maxSpeedDown = maxSpeedDown;
	}
	public String getHasPstn() {
		return hasPstn;
	}
	public void setHasPstn(String hasPstn) {
		this.hasPstn = hasPstn;
	}
	public String getActiveBB() {
		return activeBB;
	}
	public void setActiveBB(String activeBB) {
		this.activeBB = activeBB;
	}
	public String getCmtsId() {
		return cmtsId;
	}
	public void setCmtsId(String cmtsId) {
		this.cmtsId = cmtsId;
	}
	public String getInstallationsStatus() {
		return installationsStatus;
	}
	public void setInstallationsStatus(String installationsStatus) {
		this.installationsStatus = installationsStatus;
	}
	public String getBroadbandDTv() {
		return broadbandDTv;
	}
	public void setBroadbandDTv(String broadbandDTv) {
		this.broadbandDTv = broadbandDTv;
	}
	public String getCoName() {
		return coName;
	}
	public void setCoName(String coName) {
		this.coName = coName;
	}
	public String getVisitService() {
		return visitService;
	}
	public void setVisitService(String visitService) {
		this.visitService = visitService;
	}
	public String getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String[] getOptionCodes() {
		return optionCodes;
	}
	public void setOptionCodes(String[] optionCodes) {
		this.optionCodes = optionCodes;
	}
	public String getLeadTime() {
		return leadTime;
	}
	public void setLeadTime(String leadTime) {
		this.leadTime = leadTime;
	}
	public String[] getInstallationId() {
		return installationId;
	}
	public void setInstallationId(String[] installationId) {
		this.installationId = installationId;
	}
	public String getPriceCategoryCode() {
		return priceCategoryCode;
	}
	public void setPriceCategoryCode(String priceCategoryCode) {
		this.priceCategoryCode = priceCategoryCode;
	}
	public int getReasonCode() {
		return reasonCode;
	}
	public void setReasonCode(int reasonCode) {
		this.reasonCode = reasonCode;
	}
	public String getInfrastructureOwnerName() {
		return infrastructureOwnerName;
	}
	public void setInfrastructureOwnerName(String infrastructureOwnerName) {
		this.infrastructureOwnerName = infrastructureOwnerName;

	}


	public String getDeselectionReasonTekst() {
		return deselectionReasonTekst;
	}
	public void setDeselectionReasonTekst(String deselectionReasonTekst) {
		this.deselectionReasonTekst = deselectionReasonTekst;
	}
	public String getDeselectionReasonDate() {
		return deselectionReasonDate;
	}
	public void setDeselectionReasonDate(String deselectionReasonDate) {
		this.deselectionReasonDate = deselectionReasonDate;

	}

	public String getCustomerJourney() {
		return customerJourney;
	}

	public void setCustomerJourney(String customerJourney) {
		this.customerJourney = customerJourney;
	}

	public String getTechnicianNeeded() {
		return technicianNeeded;
	}

	public void setTechnicianNeeded(String technicianNeeded) {
		this.technicianNeeded = technicianNeeded;
	}
}
