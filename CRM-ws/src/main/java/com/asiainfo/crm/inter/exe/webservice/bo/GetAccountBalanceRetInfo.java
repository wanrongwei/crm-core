package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.asiainfo.crm.common.jsonparse.DateDeserializer;

public class GetAccountBalanceRetInfo implements Serializable{

	@JsonProperty(value="Balance")
	public Double balance;
	
	@JsonProperty(value="ExpireDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date expireDate;
	
	@JsonProperty(value="RealBalance")
	public Double realBalance;

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public Double getRealBalance() {
		return realBalance;
	}

	public void setRealBalance(Double realBalance) {
		this.realBalance = realBalance;
	}
}
