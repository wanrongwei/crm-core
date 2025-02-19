package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class TechnologiesVo implements Serializable {
    /** serialVersionUID*/  
	private static final long serialVersionUID = 553919022022635450L;
	private String accessType;
    private String coType;
    private String speedUp;
    private String speedDown;
    public void setAccessType(String accessType) {
         this.accessType = accessType;
     }
     public String getAccessType() {
         return accessType;
     }

    public void setCoType(String coType) {
         this.coType = coType;
     }
     public String getCoType() {
         return coType;
     }

    public void setSpeedUp(String speedUp) {
         this.speedUp = speedUp;
     }
     public String getSpeedUp() {
         return speedUp;
     }

    public void setSpeedDown(String speedDown) {
         this.speedDown = speedDown;
     }
     public String getSpeedDown() {
         return speedDown;
     }
}
