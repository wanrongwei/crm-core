package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class VisitServiceQryVo implements Serializable{
	private static final long serialVersionUID = -2539190984220463500L;
	
	private String actCode;
	private SelCoVo selCo;
	private String techType;
	
	private PreQResultVo onlinePreQResult;
	private long actualDownloadSpeedCoax;//var vAttrActualSpeed="262100000005";//Actual Speed
	
	private long userId;
	private long businessId;
	private String platform;
	private String io;
	private String preTechType;
	private long offerId;
	
	private String isChangePricePlan;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getIo() {
		return io;
	}
	public void setIo(String io) {
		this.io = io;
	}
	public long getOfferId() {
		return offerId;
	}
	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}
	public String getActCode() {
		return actCode;
	}
	public void setActCode(String actCode) {
		this.actCode = actCode;
	}
	public SelCoVo getSelCo() {
		return selCo;
	}
	public void setSelCo(SelCoVo selCo) {
		this.selCo = selCo;
	}
	public String getTechType() {
		return techType;
	}
	public void setTechType(String techType) {
		this.techType = techType;
	}
	public PreQResultVo getOnlinePreQResult() {
		return onlinePreQResult;
	}
	public void setOnlinePreQResult(PreQResultVo onlinePreQResult) {
		this.onlinePreQResult = onlinePreQResult;
	}
	public long getActualDownloadSpeedCoax() {
		return actualDownloadSpeedCoax;
	}
	public void setActualDownloadSpeedCoax(long actualDownloadSpeedCoax) {
		this.actualDownloadSpeedCoax = actualDownloadSpeedCoax;
	}
	public long getBusinessId() {
		return businessId;
	}
	public void setBusinessId(long businessId) {
		this.businessId = businessId;
	}
	public String getPreTechType() {
		return preTechType;
	}
	public void setPreTechType(String preTechType) {
		this.preTechType = preTechType;
	}
	public String getIsChangePricePlan() {
		return isChangePricePlan;
	}
	public void setIsChangePricePlan(String isChangePricePlan) {
		this.isChangePricePlan = isChangePricePlan;
	}
	
}
