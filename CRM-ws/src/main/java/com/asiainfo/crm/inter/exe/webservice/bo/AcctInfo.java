package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class AcctInfo implements Serializable {
	
	@JsonProperty(value="AccId")
	public long accId;
	@JsonProperty(value="CustId")
	public long custId;
	@JsonProperty(value="AccType")
	public int accType;
	@JsonProperty(value="AccStatus")
	public int accStatus;
	@JsonProperty(value="AccName")
	public String accName;
	@JsonProperty(value="PayMethod")
	public int payMethod;
	@JsonProperty(value="AccCycle")
	public long accCycle;
	@JsonProperty(value="CreditLevel")
	public int creditLevel;
	@JsonProperty(value="CreditValue")
	public double creditValue;
	@JsonProperty(value="UrgeStopFlag")
	public int urgeStopFlag;
	@JsonProperty(value="RegionId")
	public String regionId;
	@JsonProperty(value="CountyId")
	public String countyId;
	@JsonProperty(value="AccExtendInfo")
	public String accExtendInfo;
	@JsonProperty(value="MainNum")
	public String mainNum;
	@JsonProperty(value="BankId")
	public long bankId;
	@JsonProperty(value="BankAccount")
	public String bankAccount;
	@JsonProperty(value="CrtLevelName")
	public String crtLevelName;
	public long getAccId() {
		return accId;
	}
	public void setAccId(long accId) {
		this.accId = accId;
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public int getAccType() {
		return accType;
	}
	public void setAccType(int accType) {
		this.accType = accType;
	}
	public int getAccStatus() {
		return accStatus;
	}
	public void setAccStatus(int accStatus) {
		this.accStatus = accStatus;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getPayMethod() {
		return payMethod;
	}
	public void setPayMethod(int payMethod) {
		this.payMethod = payMethod;
	}
	public long getAccCycle() {
		return accCycle;
	}
	public void setAccCycle(long accCycle) {
		this.accCycle = accCycle;
	}
	public int getCreditLevel() {
		return creditLevel;
	}
	public void setCreditLevel(int creditLevel) {
		this.creditLevel = creditLevel;
	}
	public double getCreditValue() {
		return creditValue;
	}
	public void setCreditValue(double creditValue) {
		this.creditValue = creditValue;
	}
	public int getUrgeStopFlag() {
		return urgeStopFlag;
	}
	public void setUrgeStopFlag(int urgeStopFlag) {
		this.urgeStopFlag = urgeStopFlag;
	}
	public String getRegionId() {
		return regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	public String getCountyId() {
		return countyId;
	}
	public void setCountyId(String countyId) {
		this.countyId = countyId;
	}
	public String getAccExtendInfo() {
		return accExtendInfo;
	}
	public void setAccExtendInfo(String accExtendInfo) {
		this.accExtendInfo = accExtendInfo;
	}
	public String getMainNum() {
		return mainNum;
	}
	public void setMainNum(String mainNum) {
		this.mainNum = mainNum;
	}
	public long getBankId() {
		return bankId;
	}
	public void setBankId(long bankId) {
		this.bankId = bankId;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getCrtLevelName() {
		return crtLevelName;
	}
	public void setCrtLevelName(String crtLevelName) {
		this.crtLevelName = crtLevelName;
	}
	

}
