package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class QusetionInfoVo extends PreQResultVo implements Serializable {
	private static final long serialVersionUID = -253561219422826344L;
	long customerOrderId;
	long businessId;
	String choosedPlatform;
	String choosedIO;
	String choosedType;
	String questionCode;
	String questionVal;
	boolean fullOrderChange;
	String visitService;

	boolean isChangePricePlan;
	
	public String getVisitService() {
		return visitService;
	}
	public void setVisitService(String visitService) {
		this.visitService = visitService;
	}
	public long getCustomerOrderId() {
		return customerOrderId;
	}
	public void setCustomerOrderId(long customerOrderId) {
		this.customerOrderId = customerOrderId;
	}
	public String getChoosedType() {
		return choosedType;
	}
	public void setChoosedType(String choosedType) {
		this.choosedType = choosedType;
	}
	public String getChoosedPlatform() {
		return choosedPlatform;
	}
	public String getChoosedIO() {
		return choosedIO;
	}
	public void setChoosedPlatform(String choosedPlatform) {
		this.choosedPlatform = choosedPlatform;
	}
	public void setChoosedIO(String choosedIO) {
		this.choosedIO = choosedIO;
	}
	public String getQuestionCode() {
		return questionCode;
	}
	public void setQuestionCode(String questionCode) {
		this.questionCode = questionCode;
	}
	public String getQuestionVal() {
		return questionVal;
	}
	public void setQuestionVal(String questionVal) {
		this.questionVal = questionVal;
	}
	public boolean isFullOrderChange() {
		return fullOrderChange;
	}
	public void setFullOrderChange(boolean fullOrderChange) {
		this.fullOrderChange = fullOrderChange;
	}
	public long getBusinessId() {
		return businessId;
	}
	public void setBusinessId(long businessId) {
		this.businessId = businessId;
	}

	public boolean isChangePricePlan() {
		return isChangePricePlan;
	}

	public void setChangePricePlan(boolean changePricePlan) {
		isChangePricePlan = changePricePlan;
	}
	
	
}
