package com.asiainfo.crm.so.order.productOffering.dto.condition;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class OfferOrderConditionVo implements Serializable{
	private static final long serialVersionUID = -488422007864546099L;
	private long custId;
	private long segmentId;
	private long userId;
	private String regionId;
	private long prodSpecId;
	private long businessId;
	private String businessParamData;
	private long agreementId;
	private List<OfferConditionVo> offerList;
	
	private BroadbandParamsConditionVo broadbandParams;
	
	private String showType;
	private boolean changePricePlan;
	
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public long getSegmentId() {
		return segmentId;
	}
	public void setSegmentId(long segmentId) {
		this.segmentId = segmentId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getRegionId() {
		return regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	public long getProdSpecId() {
		return prodSpecId;
	}
	public void setProdSpecId(long prodSpecId) {
		this.prodSpecId = prodSpecId;
	}
	public long getBusinessId() {
		return businessId;
	}
	public void setBusinessId(long businessId) {
		this.businessId = businessId;
	}
	public String getBusinessParamData() {
		return businessParamData;
	}
	public void setBusinessParamData(String businessParamData) {
		this.businessParamData = businessParamData;
	}
	public long getAgreementId() {
		return agreementId;
	}
	public void setAgreementId(long agreementId) {
		this.agreementId = agreementId;
	}
	public List<OfferConditionVo> getOfferList() {
		return offerList;
	}
	public void setOfferList(List<OfferConditionVo> offerList) {
		this.offerList = offerList;
	}
	public BroadbandParamsConditionVo getBroadbandParams() {
		return broadbandParams;
	}
	public void setBroadbandParams(BroadbandParamsConditionVo broadbandParams) {
		this.broadbandParams = broadbandParams;
	}
	public String getShowType() {
		return showType;
	}
	public void setShowType(String showType) {
		this.showType = showType;
	}
	public boolean isChangePricePlan() {
		return changePricePlan;
	}
	public void setChangePricePlan(boolean changePricePlan) {
		this.changePricePlan = changePricePlan;
	}
}
