package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;
import java.util.List;

public class PreSubmitOrderVo implements Serializable {
	private static final long serialVersionUID = 154919022022655458L;
	private String basketId;
	private String serviceSubscriptionID;
	private String startDate;
	private String custId;
	private String billId;
	private String visitService;
	private String platform;
	private String io;
	private String isOpenNet;
	private String isModify;
	private String addressUid;
	private String offerId;//main offer
	private List<String> addons;//vas
	private String srcOrderId;
	private String regionId;
	private String installationId;
	private String leadTime;
	private String actCode;
	
	private PreQResultVo onlinePreQResult;//preQresult里的InstallationsStatus要用来判断是GIG还是Digging
	private String isOrderOperation;//是否改单进入 Y/N
	private String techType;//技术类型
	private long businessId;
	private String preTechType;//当前用户实例的技术类型，二次类业务要传
	private String preOfferId;//当前用户实例的main offer，二次类业务要传
	private List<String> preAddons;//当前用户实例的addon，二次类业务要传
	
	private List<String> removeAddons;//单独退定add on时要传
	private long userId;
	
	private String isAsapDate; 
	
	private String isChangePricePlan;
	public String getIsChangePricePlan() {
		return isChangePricePlan;
	}
	public void setIsChangePricePlan(String isChangePricePlan) {
		this.isChangePricePlan = isChangePricePlan;
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
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public List<String> getAddons() {
		return addons;
	}
	public void setAddons(List<String> addons) {
		this.addons = addons;
	}
	public List<String> getPreAddons() {
		return preAddons;
	}
	public void setPreAddons(List<String> preAddons) {
		this.preAddons = preAddons;
	}
	public String getPreOfferId() {
		return preOfferId;
	}
	public void setPreOfferId(String preOfferId) {
		this.preOfferId = preOfferId;
	}
	
	public String getPreTechType() {
		return preTechType;
	}
	public void setPreTechType(String preTechType) {
		this.preTechType = preTechType;
	}
	public long getBusinessId() {
		return businessId;
	}
	public void setBusinessId(long businessId) {
		this.businessId = businessId;
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
	public String getIsOrderOperation() {
		return isOrderOperation;
	}
	public void setIsOrderOperation(String isOrderOperation) {
		this.isOrderOperation = isOrderOperation;
	}
	public String getActCode() {
		return actCode;
	}
	public void setActCode(String actCode) {
		this.actCode = actCode;
	}
	public String getLeadTime() {
		return leadTime;
	}
	public void setLeadTime(String leadTime) {
		this.leadTime = leadTime;
	}
	public String getInstallationId() {
		return installationId;
	}
	public void setInstallationId(String installationId) {
		this.installationId = installationId;
	}
	public String getRegionId() {
		return regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	public String getBasketId() {
		return basketId;
	}
	public void setBasketId(String basketId) {
		this.basketId = basketId;
	}
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getVisitService() {
		return visitService;
	}
	public void setVisitService(String visitService) {
		this.visitService = visitService;
	}
	public String getIsOpenNet() {
		return isOpenNet;
	}
	public void setIsOpenNet(String isOpenNet) {
		this.isOpenNet = isOpenNet;
	}
	public String getIsModify() {
		return isModify;
	}
	public void setIsModify(String isModify) {
		this.isModify = isModify;
	}
	public String getAddressUid() {
		return addressUid;
	}
	public void setAddressUid(String addressUid) {
		this.addressUid = addressUid;
	}
	public String getOfferId() {
		return offerId;
	}
	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}
	public String getSrcOrderId() {
		return srcOrderId;
	}
	public void setSrcOrderId(String srcOrderId) {
		this.srcOrderId = srcOrderId;
	}
	public String getServiceSubscriptionID() {
		return serviceSubscriptionID;
	}
	public void setServiceSubscriptionID(String serviceSubscriptionID) {
		this.serviceSubscriptionID = serviceSubscriptionID;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public List<String> getRemoveAddons() {
		return removeAddons;
	}
	public void setRemoveAddons(List<String> removeAddons) {
		this.removeAddons = removeAddons;
	}
	
	public String getIsAsapDate() {
		return isAsapDate;
	}
	public void setIsAsapDate(String isAsapDate) {
		this.isAsapDate = isAsapDate;
	}
	
}
