package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class AgreementVo implements Serializable {
	private static final long serialVersionUID = 15492909844464500L;
    private long agreementId;
    public void setAgreementId(long agreementId) {
         this.agreementId = agreementId;
     }
     public long getAgreementId() {
         return agreementId;
     }
}
