package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetGroupBillReq implements Serializable {
	@JsonProperty(value="GroupId")
	public long groupId;
	@JsonProperty(value="AcctId")
	public long acctId;
	@JsonProperty(value="OfferId")
	public long offerId;
	@JsonProperty(value="BgnMonth")
	public String bgnMonth;
	@JsonProperty(value="EndMonth")
	public String endMonth;
	@JsonProperty(value="OweMax")
	public double oweMax;
	@JsonProperty(value="OweMin")
	public double oweMin;
	@JsonProperty(value="HasDetail")
	public int hasDetail;
	public long getGroupId() {
		return groupId;
	}
	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}
	public long getAcctId() {
		return acctId;
	}
	public void setAcctId(long acctId) {
		this.acctId = acctId;
	}
	public long getOfferId() {
		return offerId;
	}
	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}
	public String getBgnMonth() {
		return bgnMonth;
	}
	public void setBgnMonth(String bgnMonth) {
		this.bgnMonth = bgnMonth;
	}
	public String getEndMonth() {
		return endMonth;
	}
	public void setEndMonth(String endMonth) {
		this.endMonth = endMonth;
	}
	public double getOweMax() {
		return oweMax;
	}
	public void setOweMax(double oweMax) {
		this.oweMax = oweMax;
	}
	public double getOweMin() {
		return oweMin;
	}
	public void setOweMin(double oweMin) {
		this.oweMin = oweMin;
	}
	public int getHasDetail() {
		return hasDetail;
	}
	public void setHasDetail(int hasDetail) {
		this.hasDetail = hasDetail;
	}
	
	
}
