package com.asiainfo.crm.so.order.productOffering.dto.condition;

import java.io.Serializable;

import com.asiainfo.crm.so.order.fixedline.dto.PreQResultVo;
import com.asiainfo.crm.so.order.productOffering.dto.CommonOfferVo;

public class QueryBroadbandOfferConditionVo extends CommonOfferVo implements Serializable{
	private static final long serialVersionUID = 2093889727519859220L;
	
	private boolean isBatchPreq;
	private boolean isChangePricePlan;
	private String io;
	private String downloadSpeedMin;
	private String downloadSpeedMax;
	
	private boolean superOrder;
	private String platform;
	private String technologyType;
	private PreQResultVo tdcPreQResult;
	private PreQResultVo opennetPreQResult;

	private boolean showAllOffer;
	private boolean needOldTafOffer;
	
	private String includeOfferFromAgreemnt;
	private String portfolio;
	private String offerStatus;

	public boolean isChangePricePlan() {
		return isChangePricePlan;
	}
	public void setChangePricePlan(boolean isChangePricePlan) {
		this.isChangePricePlan = isChangePricePlan;
	}
	public String getIo() {
		return io;
	}
	public void setIo(String io) {
		this.io = io;
	}
	public String getDownloadSpeedMin() {
		return downloadSpeedMin;
	}
	public void setDownloadSpeedMin(String downloadSpeedMin) {
		this.downloadSpeedMin = downloadSpeedMin;
	}
	public String getDownloadSpeedMax() {
		return downloadSpeedMax;
	}
	public void setDownloadSpeedMax(String downloadSpeedMax) {
		this.downloadSpeedMax = downloadSpeedMax;
	}
	
	public boolean isSuperOrder() {
		return superOrder;
	}
	public void setSuperOrder(boolean superOrder) {
		this.superOrder = superOrder;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getTechnologyType() {
		return technologyType;
	}
	public void setTechnologyType(String technologyType) {
		this.technologyType = technologyType;
	}
	public PreQResultVo getTdcPreQResult() {
		return tdcPreQResult;
	}
	public void setTdcPreQResult(PreQResultVo tdcPreQResult) {
		this.tdcPreQResult = tdcPreQResult;
	}
	public PreQResultVo getOpennetPreQResult() {
		return opennetPreQResult;
	}
	public void setOpennetPreQResult(PreQResultVo opennetPreQResult) {
		this.opennetPreQResult = opennetPreQResult;
	}
	public boolean isShowAllOffer() {
		return showAllOffer;
	}
	public void setShowAllOffer(boolean showAllOffer) {
		this.showAllOffer = showAllOffer;
	}
	public boolean isNeedOldTafOffer() {
		return needOldTafOffer;
	}
	public void setNeedOldTafOffer(boolean needOldTafOffer) {
		this.needOldTafOffer = needOldTafOffer;
	}
	public boolean isBatchPreq() {
		return isBatchPreq;
	}
	public void setBatchPreq(boolean isBatchPreq) {
		this.isBatchPreq = isBatchPreq;
	}
	public String getIncludeOfferFromAgreemnt() {
		return includeOfferFromAgreemnt;
	}
	public void setIncludeOfferFromAgreemnt(String includeOfferFromAgreemnt) {
		this.includeOfferFromAgreemnt = includeOfferFromAgreemnt;
	}
	public String getPortfolio() {
		return portfolio;
	}
	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}
	public String getOfferStatus() {
		return offerStatus;
	}
	public void setOfferStatus(String offerStatus) {
		this.offerStatus = offerStatus;
	}
	
}
