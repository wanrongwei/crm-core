package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class NormalAccountVo implements Serializable {
	private static final long serialVersionUID = -11539195225263541L;
	private long accountId;
	private int billDay;
	private int cycleType;
	private String cycleTypeName;
	private String accountName;

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setBillDay(int billDay) {
		this.billDay = billDay;
	}

	public int getBillDay() {
		return billDay;
	}

	public void setCycleType(int cycleType) {
		this.cycleType = cycleType;
	}

	public int getCycleType() {
		return cycleType;
	}

	public String getCycleTypeName() {
		return cycleTypeName;
	}

	public void setCycleTypeName(String cycleTypeName) {
		this.cycleTypeName = cycleTypeName;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
}
