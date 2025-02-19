package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.asiainfo.crm.common.jsonparse.DateDeserializer;

public class AttrInfo implements Serializable {

	@JsonProperty(value="AttrId")
	public long attrId;
	@JsonProperty(value="AttrName")
	public String attrName;
	@JsonProperty(value="AttrDesc")
	public String attrDesc;
	@JsonProperty(value="AttrValue")
	public String attrValue;
	@JsonProperty(value="AttrTxt")
	public String attrTxt;
	@JsonProperty(value="DoneDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date doneDate;
	@JsonProperty(value="DoneCode")
	public String doneCode;
	@JsonProperty(value="EffectiveDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date effectiveDate;
	@JsonProperty(value="ExpireDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date expireDate;
	public long getAttrId() {
		return attrId;
	}
	public void setAttrId(long attrId) {
		this.attrId = attrId;
	}
	public String getAttrName() {
		return attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}
	public String getAttrDesc() {
		return attrDesc;
	}
	public void setAttrDesc(String attrDesc) {
		this.attrDesc = attrDesc;
	}
	public String getAttrValue() {
		return attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}
	public String getAttrTxt() {
		return attrTxt;
	}
	public void setAttrTxt(String attrTxt) {
		this.attrTxt = attrTxt;
	}
	public Date getDoneDate() {
		return doneDate;
	}
	public void setDoneDate(Date doneDate) {
		this.doneDate = doneDate;
	}
	public String getDoneCode() {
		return doneCode;
	}
	public void setDoneCode(String doneCode) {
		this.doneCode = doneCode;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	
}
