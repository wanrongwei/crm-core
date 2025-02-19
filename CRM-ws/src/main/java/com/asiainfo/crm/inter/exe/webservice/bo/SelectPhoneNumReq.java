package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class SelectPhoneNumReq implements Serializable {
	
	@JsonProperty(value="OpId")
	public long opId;
	
	@JsonProperty(value="RegionCode")
	public long regionCode;
	
	@JsonProperty(value="CountyCode")
	public long countyCode;
	
	@JsonProperty(value="OrgId")
	public long orgId;
	
	@JsonProperty(value="OrgType")
	public int orgType;
	
	@JsonProperty(value="ChooseType")
	public int chooseType;
	
	@JsonProperty(value="ChooseLevel")
	public int chooseLevel;
	
	@JsonProperty(value="ModeType")
	public int modeType;
	
	@JsonProperty(value="SelectMode")
	public String selectMode;
	
	@JsonProperty(value="NumType")
	public String numType;
	
	@JsonProperty(value="NumCharacter")
	public String numCharacter;
	
	@JsonProperty(value="ResNumberHlr")
	public String resNumberHlr;
	
	@JsonProperty(value="ContainValue")
	public String containValue;
	
	@JsonProperty(value="EndValue")
	public String endValue;
	
	@JsonProperty(value="IsShare")
	public int isShare;
	
	@JsonProperty(value="NumCount")
	public int numCount;
	
	@JsonProperty(value="IMSI")
	public String imsi;
	
	@JsonProperty(value="PlanId")
	public String planId;
	
	@JsonProperty(value="BrandId")
	public String brandId;
	
	@JsonProperty(value="BgnIndex")
	public long bgnIndex;
	
	@JsonProperty(value="EndIndex")
	public long endIndex;

	public long getOpId() {
		return opId;
	}

	public void setOpId(long opId) {
		this.opId = opId;
	}

	public long getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(long regionCode) {
		this.regionCode = regionCode;
	}

	public long getCountyCode() {
		return countyCode;
	}

	public void setCountyCode(long countyCode) {
		this.countyCode = countyCode;
	}

	public long getOrgId() {
		return orgId;
	}

	public void setOrgId(long orgId) {
		this.orgId = orgId;
	}

	public int getOrgType() {
		return orgType;
	}

	public void setOrgType(int orgType) {
		this.orgType = orgType;
	}

	public int getChooseType() {
		return chooseType;
	}

	public void setChooseType(int chooseType) {
		this.chooseType = chooseType;
	}

	public int getChooseLevel() {
		return chooseLevel;
	}

	public void setChooseLevel(int chooseLevel) {
		this.chooseLevel = chooseLevel;
	}

	public int getModeType() {
		return modeType;
	}

	public void setModeType(int modeType) {
		this.modeType = modeType;
	}

	public String getSelectMode() {
		return selectMode;
	}

	public void setSelectMode(String selectMode) {
		this.selectMode = selectMode;
	}

	public String getNumType() {
		return numType;
	}

	public void setNumType(String numType) {
		this.numType = numType;
	}

	public String getNumCharacter() {
		return numCharacter;
	}

	public void setNumCharacter(String numCharacter) {
		this.numCharacter = numCharacter;
	}

	public String getResNumberHlr() {
		return resNumberHlr;
	}

	public void setResNumberHlr(String resNumberHlr) {
		this.resNumberHlr = resNumberHlr;
	}

	public String getContainValue() {
		return containValue;
	}

	public void setContainValue(String containValue) {
		this.containValue = containValue;
	}

	public String getEndValue() {
		return endValue;
	}

	public void setEndValue(String endValue) {
		this.endValue = endValue;
	}

	public int getIsShare() {
		return isShare;
	}

	public void setIsShare(int isShare) {
		this.isShare = isShare;
	}

	public int getNumCount() {
		return numCount;
	}

	public void setNumCount(int numCount) {
		this.numCount = numCount;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public long getBgnIndex() {
		return bgnIndex;
	}

	public void setBgnIndex(long bgnIndex) {
		this.bgnIndex = bgnIndex;
	}

	public long getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(long endIndex) {
		this.endIndex = endIndex;
	}
}
