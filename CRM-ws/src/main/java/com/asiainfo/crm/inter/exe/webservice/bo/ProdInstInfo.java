package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.asiainfo.crm.common.jsonparse.DateDeserializer;

public class ProdInstInfo implements Serializable {
	@JsonProperty(value="ProdId")
	public long prodId;
	@JsonProperty(value="ProdName")
	public String prodName;
	@JsonProperty(value="OperType")
	public int operType;
	@JsonProperty(value="ProdType")
	public String prodType;
	@JsonProperty(value="ValidDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date validDate;
	@JsonProperty(value="ExpireDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date expireDate;
	@JsonProperty(value="MemberNum")
	public long memberNum;
	public long getProdId() {
		return prodId;
	}
	public void setProdId(long prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getOperType() {
		return operType;
	}
	public void setOperType(int operType) {
		this.operType = operType;
	}
	public String getProdType() {
		return prodType;
	}
	public void setProdType(String prodType) {
		this.prodType = prodType;
	}
	public Date getValidDate() {
		return validDate;
	}
	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public long getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(long memberNum) {
		this.memberNum = memberNum;
	}
	
	
}
