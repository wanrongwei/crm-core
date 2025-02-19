/**  
* <p>Title: ServiceInfoVo.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.asiainfo.com</p>  
* @author YJ  
* @date 2019年8月13日  
* @version SR 0.83  
*/  
package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

/**  
* <p>Title: ServiceInfoVo</p>  
* <p>Description: </p>  
* @author YJ  
* @date 2019年8月13日  
*/

public class ServiceInfoVo implements Serializable {
	   private static final long serialVersionUID = 554419022655654658L;
	    private String onlineDate;
	    private String visitService;
	    private String contactName;
	    private String  contactNumber ;
	    private String timeSlot;
	    private String email;
	    private String manualModifyTech;
	    private String offlineDate;
	    private String isAsapDate;
	    private String xWeeks;
		private String technicianNeeded; // TDC Digging
	    public String getOfflineDate() {
			return offlineDate;
		}
		public void setOfflineDate(String offlineDate) {
			this.offlineDate = offlineDate;
		}
		public String getManualModifyTech() {
			return manualModifyTech;
		}
		public void setManualModifyTech(String manualModifyTech) {
			this.manualModifyTech = manualModifyTech;
		}
		private String isNeedDigging;
	    public String getTimeSlot() {
			return timeSlot;
		}
		public void setTimeSlot(String timeSlot) {
			this.timeSlot = timeSlot;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getIsNeedDigging() {
			return isNeedDigging;
		}
		public void setIsNeedDigging(String isNeedDigging) {
			this.isNeedDigging = isNeedDigging;
		}
		public void setOnlineDate(String onlineDate) {
	         this.onlineDate = onlineDate;
	     }
	     public String getOnlineDate() {
	         return onlineDate;
	     }

	    public void setVisitService(String visitService) {
	         this.visitService = visitService;
	     }
	     public String getVisitService() {
	         return visitService;
	     }

	    public void setContactName(String contactName) {
	         this.contactName = contactName;
	     }
	     public String getContactName() {
	         return contactName;
	     }

	    public void setContactNumber (String  contactNumber ) {
	         this. contactNumber  =  contactNumber ;
	     }
	     public String getContactNumber () {
	         return  contactNumber ;
	     }
		public String getIsAsapDate() {
			return isAsapDate;
		}
		public void setIsAsapDate(String isAsapDate) {
			this.isAsapDate = isAsapDate;
		}
		public String getxWeeks() {
			return xWeeks;
		}
		public void setxWeeks(String xWeeks) {
			this.xWeeks = xWeeks;
		}
		public String getTechnicianNeeded() {
			return technicianNeeded;
		}
		public void setTechnicianNeeded(String technicianNeeded) {
			this.technicianNeeded = technicianNeeded;
		}

}
