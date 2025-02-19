package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.asiainfo.crm.common.jsonparse.DateDeserializer;

public class SelectedNumInfo implements Serializable {
	
	@JsonProperty(value="ResCode")
	public String resCode;
	
	@JsonProperty(value="ResId")
	public String resId;
	
	@JsonProperty(value="ResStatus")
	public int resStatus;
	
	@JsonProperty(value="Password")
	public String password;
	
	@JsonProperty(value="OrgId")
	public String orgId;
	
	@JsonProperty(value="OpId")
	public String opId;
	
	@JsonProperty(value="DoneCode")
	public String doneCode;
	
	@JsonProperty(value="DoneDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date doneDate;
	
	@JsonProperty(value="IccId")
	public String iccId;
	
	@JsonProperty(value="Imsi")
	public String imsi;
	
	@JsonProperty(value="UseType")
	public String useType;
	
	@JsonProperty(value="ManageStatus")
	public int manageStatus;
	
	@JsonProperty(value="ResNumberHlr")
	public String resNumberHlr;
	
	@JsonProperty(value="PlanId")
	public String planId;
	
	@JsonProperty(value="BatchId")
	public String batchId;
	
	@JsonProperty(value="NumberMode")
	public String numberMode;
	
	@JsonProperty(value="ChooseLevel")
	public int chooseLevel;
	
	@JsonProperty(value="FeeSeg")
	public int feeSeg;
	
	@JsonProperty(value="ReserveFee")
	public double reserveFee;
	
	@JsonProperty(value="DepositMonth")
	public String depositMonth;
	
	@JsonProperty(value="AgentPhone")
	public String agentPhone;
	
	@JsonProperty(value="OfferId")
	public String offerId;
	
	@JsonProperty(value="LeastFee")
	public double leastFee;
	
	@JsonProperty(value="MonthReturn")
	public double monthReturn;
	
	@JsonProperty(value="IsBest")
	public String isBest;
	
	@JsonProperty(value="RegionCode")
	public String regionCode;
	
	@JsonProperty(value="CountyCode")
	public String countyCode;
	
	@JsonProperty(value="BrandId")
	public String brandId;

	public String getResCode() {
		return resCode;
	}

	public void setResCode(String resCode) {
		this.resCode = resCode;
	}

	public String getResId() {
		return resId;
	}

	public void setResId(String resId) {
		this.resId = resId;
	}

	public int getResStatus() {
		return resStatus;
	}

	public void setResStatus(int resStatus) {
		this.resStatus = resStatus;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOpId() {
		return opId;
	}

	public void setOpId(String opId) {
		this.opId = opId;
	}

	public String getDoneCode() {
		return doneCode;
	}

	public void setDoneCode(String doneCode) {
		this.doneCode = doneCode;
	}

	public Date getDoneDate() {
		return doneDate;
	}

	public void setDoneDate(Date doneDate) {
		this.doneDate = doneDate;
	}

	public String getIccId() {
		return iccId;
	}

	public void setIccId(String iccId) {
		this.iccId = iccId;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getUseType() {
		return useType;
	}

	public void setUseType(String useType) {
		this.useType = useType;
	}

	public int getManageStatus() {
		return manageStatus;
	}

	public void setManageStatus(int manageStatus) {
		this.manageStatus = manageStatus;
	}

	public String getResNumberHlr() {
		return resNumberHlr;
	}

	public void setResNumberHlr(String resNumberHlr) {
		this.resNumberHlr = resNumberHlr;
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getNumberMode() {
		return numberMode;
	}

	public void setNumberMode(String numberMode) {
		this.numberMode = numberMode;
	}

	public int getChooseLevel() {
		return chooseLevel;
	}

	public void setChooseLevel(int chooseLevel) {
		this.chooseLevel = chooseLevel;
	}

	public int getFeeSeg() {
		return feeSeg;
	}

	public void setFeeSeg(int feeSeg) {
		this.feeSeg = feeSeg;
	}

	public double getReserveFee() {
		return reserveFee;
	}

	public void setReserveFee(double reserveFee) {
		this.reserveFee = reserveFee;
	}

	public String getDepositMonth() {
		return depositMonth;
	}

	public void setDepositMonth(String depositMonth) {
		this.depositMonth = depositMonth;
	}

	public String getAgentPhone() {
		return agentPhone;
	}

	public void setAgentPhone(String agentPhone) {
		this.agentPhone = agentPhone;
	}

	public String getOfferId() {
		return offerId;
	}

	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}

	public double getLeastFee() {
		return leastFee;
	}

	public void setLeastFee(double leastFee) {
		this.leastFee = leastFee;
	}

	public double getMonthReturn() {
		return monthReturn;
	}

	public void setMonthReturn(double monthReturn) {
		this.monthReturn = monthReturn;
	}

	public String isBest() {
		return isBest;
	}

	public void setBest(String isBest) {
		this.isBest = isBest;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getCountyCode() {
		return countyCode;
	}

	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
}
