package com.asiainfo.crm.so.common.bo;

import java.io.Serializable;
import java.sql.Timestamp;

import com.ai.omframe.order.ivalues.IOrdBusiPriceValue;
import com.ai.omframe.order.ivalues.IOrdOfferValue;

public class BOOrdxUserPayInfoBean implements Serializable,Comparable{

	private static final long serialVersionUID = -11181128786662L;

	private Timestamp doneDate;// 业务完成时间

	private long busiCode;// 业务操作ID

	private String busiName;// 业务名称

	private long brandId;// 品牌编号

	private String brandName;// 品牌名称

	private long userId;// 用户ID

	private long offerId;// 操作策划ID

	private String offerName;// 操作策划名称

	private IOrdBusiPriceValue busiPrice[];//费用信息
	
	private IOrdOfferValue ordOfferValue[];//策划订单

	public IOrdOfferValue[] getOrdOfferValue() {
		return ordOfferValue;
	}

	public void setOrdOfferValue(IOrdOfferValue[] ordOfferValue) {
		this.ordOfferValue = ordOfferValue;
	}

	public IOrdBusiPriceValue[] getBusiPrice() {
		return busiPrice;
	}

	public void setBusiPrice(IOrdBusiPriceValue[] busiPrice) {
		this.busiPrice = busiPrice;
	}

	public Timestamp getDoneDate() {
		return doneDate;
	}

	public void setDoneDate(Timestamp doneDate) {
		this.doneDate = doneDate;
	}

	public long getBusiCode() {
		return busiCode;
	}

	public void setBusiCode(long busiCode) {
		this.busiCode = busiCode;
	}

	public String getBusiName() {
		return busiName;
	}

	public void setBusiName(String busiName) {
		this.busiName = busiName;
	}

	public long getBrandId() {
		return brandId;
	}

	public void setBrandId(long brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getOfferId() {
		return offerId;
	}

	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public String getOperType() {
		return operType;
	}

	public void setOperType(String operType) {
		this.operType = operType;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private String operType;// 操作类型

	private int status;// 订单状态

	//排序，做分页时候用到
	public int compareTo(Object o) {
		BOOrdxUserPayInfoBean b1 = (BOOrdxUserPayInfoBean) o;
		if (this.doneDate.getTime() < b1.doneDate.getTime()) {
			return -1;
		}
		if (this.doneDate.getTime() > b1.doneDate.getTime()) {
			return 1;
		} else {
			if (this.doneDate.getTime() < b1.doneDate.getTime()) {
				return -1;
			}
			if (this.doneDate.getTime() > b1.doneDate.getTime()) {
				return 1;
			}
		}
		return 0;

	}
	@Override
	public boolean equals(Object obj){
		if (obj!=null && obj instanceof BOOrdxUserPayInfoBean&& this.doneDate.getTime()==((BOOrdxUserPayInfoBean)obj).getDoneDate().getTime()) {
			return true;
		}
		return false;
	}
	 public int hashCode() {
		  return Long.valueOf(this.doneDate.getTime()).hashCode(); 
	}
}
