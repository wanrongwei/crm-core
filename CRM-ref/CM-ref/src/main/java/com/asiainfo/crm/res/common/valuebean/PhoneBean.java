package com.asiainfo.crm.res.common.valuebean;

import java.io.Serializable;

/**
 * Copyright: Asiainfo-Linkage
 * 
 * @desc: 用于封装营业选号返回信息
 * @version: v1.0
 * @author: lvyh
 * @date: 2011.02.20
 */
public class PhoneBean implements Serializable {

	private static final long serialVersionUID = 1L;
	public String billId = null;// 手机号码
	public int resLevel = 0;// 号码档次
	public long tradeId = 0L;// 品牌
	public long offerId = 0L;// 套餐
	public long prePay = 0L;// 预存费

	public int getResLevel() {
		return resLevel;
	}

	public void setResLevel(int resLevel) {
		this.resLevel = resLevel;
	}

	public long getTradeId() {
		return tradeId;
	}

	public void setTradeId(long tradeId) {
		this.tradeId = tradeId;
	}

	public long getOfferId() {
		return offerId;
	}

	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}

	public long getPrePay() {
		return prePay;
	}

	public void setPrePay(long prePay) {
		this.prePay = prePay;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

}
