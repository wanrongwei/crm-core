package com.asiainfo.crm.so.order.fixedline.dto;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;

public class BatchPreQOfferInfoVo implements Serializable,Comparable<BatchPreQOfferInfoVo>{
	private static final long serialVersionUID = 4226263641L;
    private String offerName;
    private String offerId;
    private String newOrCurrentOffer;
    private String platform;
    private String ioName;
    private String ioCode;
    private String technology;
    private String agreement;
    private String offerStatus;
    private String portfolio;
    private String downloadSpeed;
	private String offerDownloadSpeed;
    private String uploadSpeed;
    private String installationMethod;
    private String possibleWithoutTV;
    private String existingBB;
    private String hasVoip;
    private boolean isTAFOffer;

	public String getOfferDownloadSpeed() {
		return offerDownloadSpeed;
	}

	public void setOfferDownloadSpeed(String offerDownloadSpeed) {
		this.offerDownloadSpeed = offerDownloadSpeed;
	}

	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public String getOfferId() {
		return offerId;
	}
	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}
	public String getNewOrCurrentOffer() {
		return newOrCurrentOffer;
	}
	public void setNewOrCurrentOffer(String newOrCurrentOffer) {
		this.newOrCurrentOffer = newOrCurrentOffer;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getIoName() {
		return ioName;
	}
	public void setIoName(String ioName) {
		this.ioName = ioName;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getAgreement() {
		return agreement;
	}
	public void setAgreement(String agreement) {
		this.agreement = agreement;
	}
	public String getOfferStatus() {
		return offerStatus;
	}
	public void setOfferStatus(String offerStatus) {
		this.offerStatus = offerStatus;
	}
	public String getPortfolio() {
		return portfolio;
	}
	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}
	public String getDownloadSpeed() {
		return downloadSpeed;
	}
	public void setDownloadSpeed(String downloadSpeed) {
		this.downloadSpeed = downloadSpeed;
	}
	public String getUploadSpeed() {
		return uploadSpeed;
	}
	public void setUploadSpeed(String uploadSpeed) {
		this.uploadSpeed = uploadSpeed;
	}
	public String getInstallationMethod() {
		return installationMethod;
	}
	public void setInstallationMethod(String installationMethod) {
		this.installationMethod = installationMethod;
	}
	public String getPossibleWithoutTV() {
		return possibleWithoutTV;
	}
	public void setPossibleWithoutTV(String possibleWithoutTV) {
		this.possibleWithoutTV = possibleWithoutTV;
	}
	public String getExistingBB() {
		return existingBB;
	}
	public void setExistingBB(String existingBB) {
		this.existingBB = existingBB;
	}
	
 
	public String getHasVoip() {
		return hasVoip;
	}
	public void setHasVoip(String hasVoip) {
		this.hasVoip = hasVoip;
	}
	@Override
	public boolean equals(Object o) {
		if(o==null) {
			return true;
		}
		BatchPreQOfferInfoVo obj = (BatchPreQOfferInfoVo)o;
		if(offerId.equals(obj.offerId)) {
			return true;
		}
		return false;
	}
	
	
	
	public String getIoCode() {
		return ioCode;
	}
	public void setIoCode(String ioCode) {
		this.ioCode = ioCode;
	}
	@Override
	public int compareTo(BatchPreQOfferInfoVo o) {
		
		int priorityA=o.isTAFOffer?0:getTechnologyPriority(technology);
		int priorityB=isTAFOffer?0:getTechnologyPriority(o.technology);
		if(StringUtils.isNotBlank(o.ioCode) && StringUtils.isNotBlank(ioCode) && o.ioCode.compareTo(ioCode)!=0) {
			return ioCode.compareTo(o.ioCode);
		}else{
			if (priorityA > priorityB) {
				return 1;
			}else if(priorityA==priorityB) {
				if(StringUtils.isNotBlank(o.offerDownloadSpeed) && StringUtils.isNotBlank(offerDownloadSpeed)) {
					if( Long.parseLong(offerDownloadSpeed)>Long.parseLong(o.offerDownloadSpeed)) {
						return -1;
					}else if(Long.parseLong(offerDownloadSpeed)<Long.parseLong(o.offerDownloadSpeed)) {
						return 1;
					}
				}
	 		} else {
				return -1;
			}
		}
		return 0;
	}
	public static int getTechnologyPriority(String technology) {
		int priorityLev = 0;
 			if (StringUtils.equals(technology, "FIBER")) {
				priorityLev = 1;
			} else if (StringUtils.equals(technology, "COAX")) {
				priorityLev = 2;
			} else if (StringUtils.equals(technology, "PB")) {
				priorityLev = 3;
			}else if (StringUtils.equals(technology, "DSL")) {
				priorityLev = 4;
			}else {
				priorityLev = 5;
			}
		return priorityLev;
	}
	public boolean isTAFOffer() {
		return isTAFOffer;
	}
	public void setTAFOffer(boolean isTAFOffer) {
		this.isTAFOffer = isTAFOffer;
	}
   
}
