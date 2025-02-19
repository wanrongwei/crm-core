/**  
* <p>Title: AttrVo.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.asiainfo.com</p>  
* @author cxw 
* @date 2019年10月04日  
* @version SR 0.83  
*/  
package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

/**  
* <p>Title: AttrVo</p>  
* <p>Description: </p>  
* @author cxw  
* @date 2019年10月04日  
*/

public class TerminationInfoVo implements Serializable {
	private static final long serialVersionUID = 15391909842263500L;
	
	private String offlineDate;
	private String offlineDateType;
	private String terminationKind;
	private String isToTdc;
	private String contactName;
	private String terminationReason;
	private String referralType;
	private String referralNumber;
	private String extendPeriod;
	private String overrideCpePenalty;
	private String tdcOrderId;
	
	public String getTdcOrderId() {
		return tdcOrderId;
	}
	public void setTdcOrderId(String tdcOrderId) {
		this.tdcOrderId = tdcOrderId;
	}
	public String getOfflineDate() {
		return offlineDate;
	}
	public void setOfflineDate(String offlineDate) {
		this.offlineDate = offlineDate;
	}
	public String getOfflineDateType() {
		return offlineDateType;
	}
	public void setOfflineDateType(String offlineDateType) {
		this.offlineDateType = offlineDateType;
	}
	public String getTerminationKind() {
		return terminationKind;
	}
	public void setTerminationKind(String terminationKind) {
		this.terminationKind = terminationKind;
	}
	public String getIsToTdc() {
		return isToTdc;
	}
	public void setIsToTdc(String isToTdc) {
		this.isToTdc = isToTdc;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getTerminationReason() {
		return terminationReason;
	}
	public void setTerminationReason(String terminationReason) {
		this.terminationReason = terminationReason;
	}
	public String getReferralType() {
		return referralType;
	}
	public void setReferralType(String referralType) {
		this.referralType = referralType;
	}
	public String getReferralNumber() {
		return referralNumber;
	}
	public void setReferralNumber(String referralNumber) {
		this.referralNumber = referralNumber;
	}
	public String getExtendPeriod() {
		return extendPeriod;
	}
	public void setExtendPeriod(String extendPeriod) {
		this.extendPeriod = extendPeriod;
	}

	public String getOverrideCpePenalty() {
		return overrideCpePenalty;
	}
	public void setOverrideCpePenalty(String overrideCpePenalty) {
		this.overrideCpePenalty = overrideCpePenalty;
	}
}
