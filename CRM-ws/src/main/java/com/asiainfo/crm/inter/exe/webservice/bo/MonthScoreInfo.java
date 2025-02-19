package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.asiainfo.crm.common.jsonparse.DateDeserializer;

public class MonthScoreInfo implements Serializable {
	
	@JsonProperty(value="ServiceNum")
	public String serviceNum;
	@JsonProperty(value="Month")
	public String month;
	@JsonProperty(value="LastScore")
	public long lastScore;
	@JsonProperty(value="EndMonthScore")
	public long endMonthScore;
	@JsonProperty(value="UsedScore")
	public long usedScore;
	@JsonProperty(value="ValidScore")
	public long validScore;
	@JsonProperty(value="ValueScore")
	public long valueScore;
	@JsonProperty(value="RewardScore")
	public long rewardScore;
	@JsonProperty(value="BrandScore")
	public long brandScore;
	@JsonProperty(value="OnNetScore")
	public long onNetScore;
	@JsonProperty(value="TransferScore")
	public long transferScore;
	@JsonProperty(value="DonateScore")
	public long donateScore;
	@JsonProperty(value="ExchangeScore")
	public long exchangeScore;
	@JsonProperty(value="TransferScoreOut")
	public long transferScoreOut;
	@JsonProperty(value="DonateOutScoreOut")
	public long donateOutScoreOut;
	@JsonProperty(value="OtherReduceScore")
	public long otherReduceScore;
	public String getServiceNum() {
		return serviceNum;
	}
	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public long getLastScore() {
		return lastScore;
	}
	public void setLastScore(long lastScore) {
		this.lastScore = lastScore;
	}
	public long getEndMonthScore() {
		return endMonthScore;
	}
	public void setEndMonthScore(long endMonthScore) {
		this.endMonthScore = endMonthScore;
	}
	public long getUsedScore() {
		return usedScore;
	}
	public void setUsedScore(long usedScore) {
		this.usedScore = usedScore;
	}
	public long getValidScore() {
		return validScore;
	}
	public void setValidScore(long validScore) {
		this.validScore = validScore;
	}
	public long getValueScore() {
		return valueScore;
	}
	public void setValueScore(long valueScore) {
		this.valueScore = valueScore;
	}
	public long getRewardScore() {
		return rewardScore;
	}
	public void setRewardScore(long rewardScore) {
		this.rewardScore = rewardScore;
	}
	public long getBrandScore() {
		return brandScore;
	}
	public void setBrandScore(long brandScore) {
		this.brandScore = brandScore;
	}
	public long getOnNetScore() {
		return onNetScore;
	}
	public void setOnNetScore(long onNetScore) {
		this.onNetScore = onNetScore;
	}
	public long getTransferScore() {
		return transferScore;
	}
	public void setTransferScore(long transferScore) {
		this.transferScore = transferScore;
	}
	public long getDonateScore() {
		return donateScore;
	}
	public void setDonateScore(long donateScore) {
		this.donateScore = donateScore;
	}
	public long getExchangeScore() {
		return exchangeScore;
	}
	public void setExchangeScore(long exchangeScore) {
		this.exchangeScore = exchangeScore;
	}
	public long getTransferScoreOut() {
		return transferScoreOut;
	}
	public void setTransferScoreOut(long transferScoreOut) {
		this.transferScoreOut = transferScoreOut;
	}
	public long getDonateOutScoreOut() {
		return donateOutScoreOut;
	}
	public void setDonateOutScoreOut(long donateOutScoreOut) {
		this.donateOutScoreOut = donateOutScoreOut;
	}
	public long getOtherReduceScore() {
		return otherReduceScore;
	}
	public void setOtherReduceScore(long otherReduceScore) {
		this.otherReduceScore = otherReduceScore;
	}

	
	

}
