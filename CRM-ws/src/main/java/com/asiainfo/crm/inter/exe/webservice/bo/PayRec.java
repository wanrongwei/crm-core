package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.asiainfo.crm.common.jsonparse.DateDeserializer;

public class PayRec implements Serializable {
	@JsonProperty(value="ServiceNum")
	public String serviceNum;
	@JsonProperty(value="AcctId")
	public long acctId;
	@JsonProperty(value="TransDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date transDate;
	@JsonProperty(value="OpCode")
	public String opCode;
	@JsonProperty(value="ChargeValue")
	public double chargeValue;
	@JsonProperty(value="PreBalance")
	public double preBalance;
	@JsonProperty(value="ChargeType")
	public int chargeType;
	@JsonProperty(value="CardNo")
	public String cardNo;
	@JsonProperty(value="OfferName")
	public String offerName;
	public String getServiceNum() {
		return serviceNum;
	}
	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}
	public long getAcctId() {
		return acctId;
	}
	public void setAcctId(long acctId) {
		this.acctId = acctId;
	}
	public Date getTransDate() {
		return transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	public String getOpCode() {
		return opCode;
	}
	public void setOpCode(String opCode) {
		this.opCode = opCode;
	}
	public double getChargeValue() {
		return chargeValue;
	}
	public void setChargeValue(double chargeValue) {
		this.chargeValue = chargeValue;
	}
	public double getPreBalance() {
		return preBalance;
	}
	public void setPreBalance(double preBalance) {
		this.preBalance = preBalance;
	}
	public int getChargeType() {
		return chargeType;
	}
	public void setChargeType(int chargeType) {
		this.chargeType = chargeType;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	
	
}
