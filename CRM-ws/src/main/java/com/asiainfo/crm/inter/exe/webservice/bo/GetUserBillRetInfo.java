package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetUserBillRetInfo implements Serializable {
	@JsonProperty(value="BillInfo")
	public BillInfo billInfo;
	@JsonProperty(value="CustClass")
	public String custClass;
	@JsonProperty(value="TradeMark")
	public String tradeMark;
	public BillInfo getBillInfo() {
		return billInfo;
	}
	public void setBillInfo(BillInfo billInfo) {
		this.billInfo = billInfo;
	}
	public String getCustClass() {
		return custClass;
	}
	public void setCustClass(String custClass) {
		this.custClass = custClass;
	}
	public String getTradeMark() {
		return tradeMark;
	}
	public void setTradeMark(String tradeMark) {
		this.tradeMark = tradeMark;
	}
	
}
