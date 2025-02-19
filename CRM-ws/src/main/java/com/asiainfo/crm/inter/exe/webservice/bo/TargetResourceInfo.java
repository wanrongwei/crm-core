package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

public class TargetResourceInfo implements Serializable {
	
	public long ruleID;
	
	public long targetResourceID;
	
	public String targetResourceName;
	
	public String availableResourceMinValue;
	
	public String availableResourceUnit;
	
	public String targetResourceValue;
	
	public String targetResourceUnit;
	
	public String targetResourceMaxValue;
	
	public Date effectiveDate;
	
	public Date expireDate;

	public long getRuleID() {
		return ruleID;
	}

	public void setRuleID(long ruleID) {
		this.ruleID = ruleID;
	}

	public long getTargetResourceID() {
		return targetResourceID;
	}

	public void setTargetResourceID(long targetResourceID) {
		this.targetResourceID = targetResourceID;
	}

	public String getTargetResourceName() {
		return targetResourceName;
	}

	public void setTargetResourceName(String targetResourceName) {
		this.targetResourceName = targetResourceName;
	}

	public String getAvailableResourceMinValue() {
		return availableResourceMinValue;
	}

	public void setAvailableResourceMinValue(String availableResourceMinValue) {
		this.availableResourceMinValue = availableResourceMinValue;
	}

	public String getAvailableResourceUnit() {
		return availableResourceUnit;
	}

	public void setAvailableResourceUnit(String availableResourceUnit) {
		this.availableResourceUnit = availableResourceUnit;
	}

	public String getTargetResourceValue() {
		return targetResourceValue;
	}

	public void setTargetResourceValue(String targetResourceValue) {
		this.targetResourceValue = targetResourceValue;
	}

	public String getTargetResourceUnit() {
		return targetResourceUnit;
	}

	public void setTargetResourceUnit(String targetResourceUnit) {
		this.targetResourceUnit = targetResourceUnit;
	}

	public String getTargetResourceMaxValue() {
		return targetResourceMaxValue;
	}

	public void setTargetResourceMaxValue(String targetResourceMaxValue) {
		this.targetResourceMaxValue = targetResourceMaxValue;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	
}
