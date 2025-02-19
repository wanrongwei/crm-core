package com.asiainfo.crm.so.teaminvoke.in.service.oss.dto;

import java.io.Serializable;
import java.util.List;

public class PreSubmitResultDTO implements Serializable {
	private static final long serialVersionUID = 3032141741253234242L;
	
	private String offerId;
	private String basketId;
	private String serviceSubscriptionID;
	private List<DayWorkScheduleDTO> availableDays;
	private List<String> holidays;
	private String forbiddenDate;
	private String errorInfo;
	private String noCapacity;//Opennet场景，如果预提交发现installation ID被占则noCapacity是Y
	private String visitService;//GDS\GIG\Digging，返回如果有值则替换界面的值，如果无值则不处理
	private String changeFlag;//Y/N 告诉界面是否可以自由切换GDS和GIG。Opennet是不可以自由切换的；TDC当GDS的时候可以自由切换，GIG的时候不可以自由切换
	private String installationId;
	private String gigForbiddenDate; //当changeFlag=Y时，GIG的forbiddenDate
	private String maxAvailableSelectDate;//最晚可选日期。目前只有移机会有这个限制。
	private DayWorkScheduleDTO earlistDay;
	private String xWeeks;
	
	public String getMaxAvailableSelectDate() {
		return maxAvailableSelectDate;
	}
	public void setMaxAvailableSelectDate(String maxAvailableSelectDate) {
		this.maxAvailableSelectDate = maxAvailableSelectDate;
	}
	public String getInstallationId() {
		return installationId;
	}
	public String getGigForbiddenDate() {
		return gigForbiddenDate;
	}
	public void setGigForbiddenDate(String gigForbiddenDate) {
		this.gigForbiddenDate = gigForbiddenDate;
	}
	public void setInstallationId(String installationId) {
		this.installationId = installationId;
	}
	public String getChangeFlag() {
		return changeFlag;
	}
	public void setChangeFlag(String changeFlag) {
		this.changeFlag = changeFlag;
	}
	public String getNoCapacity() {
		return noCapacity;
	}
	public void setNoCapacity(String noCapacity) {
		this.noCapacity = noCapacity;
	}
	public String getVisitService() {
		return visitService;
	}
	public void setVisitService(String visitService) {
		this.visitService = visitService;
	}
	public String getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}
	public String getForbiddenDate() {
		return forbiddenDate;
	}
	public void setForbiddenDate(String forbiddenDate) {
		this.forbiddenDate = forbiddenDate;
	}
	public String getBasketId() {
		return basketId;
	}
	public List<DayWorkScheduleDTO> getAvailableDays() {
		return availableDays;
	}
	public void setAvailableDays(List<DayWorkScheduleDTO> availableDays) {
		this.availableDays = availableDays;
	}
	public List<String> getHolidays() {
		return holidays;
	}
	public void setHolidays(List<String> holidays) {
		this.holidays = holidays;
	}
	public void setBasketId(String basketId) {
		this.basketId = basketId;
	}
	public String getServiceSubscriptionID() {
		return serviceSubscriptionID;
	}
	public void setServiceSubscriptionID(String serviceSubscriptionID) {
		this.serviceSubscriptionID = serviceSubscriptionID;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getOfferId() {
		return offerId;
	}
	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}
	public DayWorkScheduleDTO getEarlistDay() {
		return earlistDay;
	}
	public void setEarlistDay(DayWorkScheduleDTO earlistDay) {
		this.earlistDay = earlistDay;
	}
	public String getxWeeks() {
		return xWeeks;
	}
	public void setxWeeks(String xWeeks) {
		this.xWeeks = xWeeks;
	}

	
}
