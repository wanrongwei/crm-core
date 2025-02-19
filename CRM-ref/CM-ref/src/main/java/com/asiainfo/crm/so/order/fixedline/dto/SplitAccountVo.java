package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class SplitAccountVo implements Serializable {
	private static final long serialVersionUID = 254919022022655458L;
    private long patternId;
    private long accountId;
    private String accountName;
    private String patternName;
    public void setPatternId(long patternId) {
         this.patternId = patternId;
     }
     public long getPatternId() {
         return patternId;
     }

    public void setAccountId(long accountId) {
         this.accountId = accountId;
     }
     public long getAccountId() {
         return accountId;
     }
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getPatternName() {
		return patternName;
	}
	public void setPatternName(String patternName) {
		this.patternName = patternName;
	}
}
