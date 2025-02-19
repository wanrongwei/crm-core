package com.asiainfo.crm.so.order.productOffering.dto.condition;

import java.io.Serializable;
import java.util.List;

public class QueryOTCVo implements Serializable{

	private static final long serialVersionUID = 7639130622165277033L;
	// 客户id
	private long custId;
	// 客户细分id
	private long segmentId;
	// 号码
	private String billId;
	// 合同id
	private long agreementId;
	// 是否需要 根据taxInclude 处理
	private boolean needTaxIncludeDeal;
	// 查询费用信息列表
	private List<OTCPriceConditionVo> otcPriceConditionList;
	// 宽带公共参数
	private BroadbandParamsConditionVo broadbandParams;
	
	// 是否固网查询费用
	private boolean fixedLine;
	
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public long getSegmentId() {
		return segmentId;
	}
	public void setSegmentId(long segmentId) {
		this.segmentId = segmentId;
	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public long getAgreementId() {
		return agreementId;
	}
	public void setAgreementId(long agreementId) {
		this.agreementId = agreementId;
	}
	public List<OTCPriceConditionVo> getOtcPriceConditionList() {
		return otcPriceConditionList;
	}
	public void setOtcPriceConditionList(
			List<OTCPriceConditionVo> otcPriceConditionList) {
		this.otcPriceConditionList = otcPriceConditionList;
	}
	public BroadbandParamsConditionVo getBroadbandParams() {
		return broadbandParams;
	}
	public void setBroadbandParams(BroadbandParamsConditionVo broadbandParams) {
		this.broadbandParams = broadbandParams;
	}
	public boolean isFixedLine() {
		return fixedLine;
	}
	public void setFixedLine(boolean fixedLine) {
		this.fixedLine = fixedLine;
	}
	public boolean isNeedTaxIncludeDeal() {
		return needTaxIncludeDeal;
	}
	public void setNeedTaxIncludeDeal(boolean needTaxIncludeDeal) {
		this.needTaxIncludeDeal = needTaxIncludeDeal;
	}
	
}
