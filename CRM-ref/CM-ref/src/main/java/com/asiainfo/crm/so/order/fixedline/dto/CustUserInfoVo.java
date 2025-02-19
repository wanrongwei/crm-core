package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class CustUserInfoVo implements Serializable {
	private static final long serialVersionUID = 15991909842269500L;
    private String partyName;
    private long custId;
    public void setPartyName(String partyName) {
         this.partyName = partyName;
     }
     public String getPartyName() {
         return partyName;
     }

    public void setCustId(long custId) {
         this.custId = custId;
     }
     public long getCustId() {
         return custId;
     }
}
