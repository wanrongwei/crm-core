package com.asiainfo.crm.so.order.productOffering.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ProductOfferingVo implements Serializable{
	
	private long offeringId;
	private long offeringInstId;
	private String offeringName;
	private String offeringDescription;
	private String offeringType;
	private long maxQuantity;
	private Date validDate;
	private Date expireDate;
	private long offerIndexId;
	private long offerNum;
	private long agreementId;
	private long state;
	private long businessId;
	private String commitmentMonth;

	private ProductOfferingFeeVo productOfferingFee;
	private List<ProductInfoVo> productInfoList;

	/**
	 * 库存属性
	 */
	private boolean inStore;
	private ProductOfferingSalesVo offerSalesInfo;
	/**
	 * 安装方式(固网)
	 */
	private String visitService;
	/**
	 * 是否推荐offer
	 */
	private boolean recommend;
	
	
	public String getVisitService() {
		return visitService;
	}
	public void setVisitService(String visitService) {
		this.visitService = visitService;
	}
	public boolean isRecommend() {
		return recommend;
	}
	public void setRecommend(boolean recommend) {
		this.recommend = recommend;
	}
	public ProductOfferingSalesVo getOfferSalesInfo() {
		return offerSalesInfo;
	}
	public void setOfferSalesInfo(ProductOfferingSalesVo offerSalesInfo) {
		this.offerSalesInfo = offerSalesInfo;
	}
	public String getCommitmentMonth() {
		return commitmentMonth;
	}
	public void setCommitmentMonth(String commitmentMonth) {
		this.commitmentMonth = commitmentMonth;
	}

	public List<ProductInfoVo> getProductInfoList() {
		return productInfoList;
	}
	public void setProductInfoList(List<ProductInfoVo> productInfoList) {
		this.productInfoList = productInfoList;
	}
	public long getOfferingId() {
		return offeringId;
	}
	public void setOfferingId(long offeringId) {
		this.offeringId = offeringId;
	}
	public long getOfferingInstId() {
		return offeringInstId;
	}
	public void setOfferingInstId(long offeringInstId) {
		this.offeringInstId = offeringInstId;
	}
	public String getOfferingName() {
		return offeringName;
	}
	public void setOfferingName(String offeringName) {
		this.offeringName = offeringName;
	}
	public String getOfferingDescription() {
		return offeringDescription;
	}
	public void setOfferingDescription(String offeringDescription) {
		this.offeringDescription = offeringDescription;
	}
	public String getOfferingType() {
		return offeringType;
	}
	public void setOfferingType(String offeringType) {
		this.offeringType = offeringType;
	}
	public long getMaxQuantity() {
		return maxQuantity;
	}
	public void setMaxQuantity(long maxQuantity) {
		this.maxQuantity = maxQuantity;
	}
	public Date getValidDate() {
		return validDate;
	}
	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public long getOfferIndexId() {
		return offerIndexId;
	}
	public void setOfferIndexId(long offerIndexId) {
		this.offerIndexId = offerIndexId;
	}
	public long getOfferNum() {
		return offerNum;
	}
	public void setOfferNum(long offerNum) {
		this.offerNum = offerNum;
	}
	public long getAgreementId() {
		return agreementId;
	}
	public void setAgreementId(long agreementId) {
		this.agreementId = agreementId;
	}
	public long getState() {
		return state;
	}
	public void setState(long state) {
		this.state = state;
	}
	public long getBusinessId() {
		return businessId;
	}
	public void setBusinessId(long businessId) {
		this.businessId = businessId;
	}
	public ProductOfferingFeeVo getProductOfferingFee() {
		return productOfferingFee;
	}
	public void setProductOfferingFee(ProductOfferingFeeVo productOfferingFee) {
		this.productOfferingFee = productOfferingFee;
	}
	public boolean isInStore() {
		return inStore;
	}
	public void setInStore(boolean inStore) {
		this.inStore = inStore;
	}

}
