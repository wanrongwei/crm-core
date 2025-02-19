package com.asiainfo.crm.so.order.productOffering.dto;

import java.io.Serializable;

import com.asiainfo.crm.so.order.common.dto.CommonPageVo;
import com.asiainfo.crm.so.order.productOffering.dto.condition.ProductOfferCoditionVo;


public class CommonOfferVo extends ProductOfferCoditionVo implements Serializable{
	
	private static final long serialVersionUID = 1773788898744743079L;
	
	private String handwareBrand;
	private long relationOfferId;
	private long fromOfferId;
	private String hardwareResType;
	private CommonPageVo commonPageVo;
	
	public String getHandwareBrand() {
		return handwareBrand;
	}
	public void setHandwareBrand(String handwareBrand) {
		this.handwareBrand = handwareBrand;
	}
	public long getRelationOfferId() {
		return relationOfferId;
	}
	public void setRelationOfferId(long relationOfferId) {
		this.relationOfferId = relationOfferId;
	}
	public long getFromOfferId() {
		return fromOfferId;
	}
	public void setFromOfferId(long fromOfferId) {
		this.fromOfferId = fromOfferId;
	}
	public String getHardwareResType() {
		return hardwareResType;
	}
	public void setHardwareResType(String hardwareResType) {
		this.hardwareResType = hardwareResType;
	}
	public CommonPageVo getCommonPageVo() {
		return commonPageVo;
	}
	public void setCommonPageVo(CommonPageVo commonPageVo) {
		this.commonPageVo = commonPageVo;
	}

}
