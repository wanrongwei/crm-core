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

public class SuspensionResumeInfoVo implements Serializable {
	private static final long serialVersionUID = 15391909842263500L;
	
	private String appointStop;
	private String appointOpen;
	private String bookingDate;
	private String appointTimeStop;
	private String appointTimeOpen;
	private String osStatusTypeStop;
	private String osStatusTypeOpen;
	private String relateOsStatusType;
	private String relBillIds;
	private String channelType;
	private String validateType;
	private String osLevel;
	
	public String getOsLevel() {
		return osLevel;
	}
	public void setOsLevel(String osLevel) {
		this.osLevel = osLevel;
	}
	public String getAppointStop() {
		return appointStop;
	}
	public void setAppointStop(String appointStop) {
		this.appointStop = appointStop;
	}
	public String getAppointOpen() {
		return appointOpen;
	}
	public void setAppointOpen(String appointOpen) {
		this.appointOpen = appointOpen;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getAppointTimeStop() {
		return appointTimeStop;
	}
	public void setAppointTimeStop(String appointTimeStop) {
		this.appointTimeStop = appointTimeStop;
	}
	public String getAppointTimeOpen() {
		return appointTimeOpen;
	}
	public void setAppointTimeOpen(String appointTimeOpen) {
		this.appointTimeOpen = appointTimeOpen;
	}
	public String getOsStatusTypeStop() {
		return osStatusTypeStop;
	}
	public void setOsStatusTypeStop(String osStatusTypeStop) {
		this.osStatusTypeStop = osStatusTypeStop;
	}
	public String getOsStatusTypeOpen() {
		return osStatusTypeOpen;
	}
	public void setOsStatusTypeOpen(String osStatusTypeOpen) {
		this.osStatusTypeOpen = osStatusTypeOpen;
	}
	public String getRelateOsStatusType() {
		return relateOsStatusType;
	}
	public void setRelateOsStatusType(String relateOsStatusType) {
		this.relateOsStatusType = relateOsStatusType;
	}
	public String getRelBillIds() {
		return relBillIds;
	}
	public void setRelBillIds(String relBillIds) {
		this.relBillIds = relBillIds;
	}
	public String getChannelType() {
		return channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}
	public String getValidateType() {
		return validateType;
	}
	public void setValidateType(String validateType) {
		this.validateType = validateType;
	}
	
	
}
