package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class UserVo implements Serializable {
	private static final long serialVersionUID = -25391902202263500L;
    private String billId;
    private String userId;
    private String password;
    private String regionId;
    public void setBillId(String billId) {
         this.billId = billId;
     }
     public String getBillId() {
         return billId;
     }

    public void setUserId(String userId) {
         this.userId = userId;
     }
     public String getUserId() {
         return userId;
     }

    public void setPassword(String password) {
         this.password = password;
     }
     public String getPassword() {
         return password;
     }

    public void setRegionId(String regionId) {
         this.regionId = regionId;
     }
     public String getRegionId() {
         return regionId;
     }
}
