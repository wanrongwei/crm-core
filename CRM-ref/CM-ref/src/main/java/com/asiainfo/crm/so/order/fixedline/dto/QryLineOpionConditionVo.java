package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class QryLineOpionConditionVo extends PreQResultVo implements Serializable {

	private static final long serialVersionUID = -153561219422826344L;
	
	private long userId;
	private PreQResultVo onlinePreQResult;
	private String platForm;//TDC OpenNet
	private String io;
	private String visitService;
	private long customerOrderId;
	private long businessId;
	private String choosedType;
	private String questionCode;
	private String questionVal;
	private boolean fullOrderChange;
	private String isChangePricePlan;
	private PreQItemInfoVo[] itemInfo;
	
	public PreQItemInfoVo[] getItemInfo() {
		return itemInfo;
	}
	public void setItemInfo(PreQItemInfoVo[] itemInfo) {
		this.itemInfo = itemInfo;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public PreQResultVo getOnlinePreQResult() {
		return onlinePreQResult;
	}
	public void setOnlinePreQResult(PreQResultVo onlinePreQResult) {
		this.onlinePreQResult = onlinePreQResult;
	}
	public String getPlatForm() {
		return platForm;
	}
	public void setPlatForm(String platForm) {
		this.platForm = platForm;
	}
	public String getIo() {
		return io;
	}
	public void setIo(String io) {
		this.io = io;
	}
	public long getCustomerOrderId() {
		return customerOrderId;
	}
	public void setCustomerOrderId(long customerOrderId) {
		this.customerOrderId = customerOrderId;
	}
	public long getBusinessId() {
		return businessId;
	}
	public void setBusinessId(long businessId) {
		this.businessId = businessId;
	}
	public String getChoosedType() {
		return choosedType;
	}
	public void setChoosedType(String choosedType) {
		this.choosedType = choosedType;
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
	public String getIsChangePricePlan() {
		return isChangePricePlan;
	}
	public void setIsChangePricePlan(String isChangePricePlan) {
		this.isChangePricePlan = isChangePricePlan;
	}
	public String getVisitService() {
		return visitService;
	}
	public void setVisitService(String visitService) {
		this.visitService = visitService;
	}
	
	

}
