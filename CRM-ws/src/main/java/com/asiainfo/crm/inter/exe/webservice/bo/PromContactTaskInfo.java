package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.asiainfo.crm.common.jsonparse.DateDeserializer;

public class PromContactTaskInfo implements Serializable {
	
	@JsonProperty(value="AccessNumber")
	public String accessNumber;
	@JsonProperty(value="ChannelCode")
	public String channelCode;
	@JsonProperty(value="ChannelId")
	public long channelId;
	@JsonProperty(value="ContId")
	public long contId;
	@JsonProperty(value="ContName")
	public String contName;
	@JsonProperty(value="ContactDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date contactDate;
	@JsonProperty(value="ContactTaskId")
	public long contactTaskId;
	@JsonProperty(value="ContactTaskName")
	public String contactTaskName;
	@JsonProperty(value="ContactTime")
	public String contactTime;
	@JsonProperty(value="CreateDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date createDate;
	@JsonProperty(value="CustId")
	public long custId;
	@JsonProperty(value="Description")
	public String description;
	@JsonProperty(value="DoneCode")
	public long doneCode;
	@JsonProperty(value="DoneDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date doneDate;
	@JsonProperty(value="EffectiveDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date effectiveDate;
	@JsonProperty(value="ExpireDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date expireDate;
	@JsonProperty(value="MktCampCreateDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date mktCampCreateDate;
	@JsonProperty(value="MktCampId")
	public long mktCampId;
	@JsonProperty(value="MktTgtId")
	public long mktTgtId;
	@JsonProperty(value="OpId")
	public long opId;
	@JsonProperty(value="OrgId")
	public long orgId;
	@JsonProperty(value="QnrRecId")
	public long qnrRecId;
	@JsonProperty(value="ScriptId")
	public long scriptId;
	@JsonProperty(value="State")
	public String state;
	@JsonProperty(value="StateDesc")
	public String stateDesc;
	public String getAccessNumber() {
		return accessNumber;
	}
	public void setAccessNumber(String accessNumber) {
		this.accessNumber = accessNumber;
	}
	public String getChannelCode() {
		return channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
	public long getChannelId() {
		return channelId;
	}
	public void setChannelId(long channelId) {
		this.channelId = channelId;
	}
	public long getContId() {
		return contId;
	}
	public void setContId(long contId) {
		this.contId = contId;
	}
	public String getContName() {
		return contName;
	}
	public void setContName(String contName) {
		this.contName = contName;
	}
	public Date getContactDate() {
		return contactDate;
	}
	public void setContactDate(Date contactDate) {
		this.contactDate = contactDate;
	}
	public long getContactTaskId() {
		return contactTaskId;
	}
	public void setContactTaskId(long contactTaskId) {
		this.contactTaskId = contactTaskId;
	}
	public String getContactTaskName() {
		return contactTaskName;
	}
	public void setContactTaskName(String contactTaskName) {
		this.contactTaskName = contactTaskName;
	}
	public String getContactTime() {
		return contactTime;
	}
	public void setContactTime(String contactTime) {
		this.contactTime = contactTime;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getDoneCode() {
		return doneCode;
	}
	public void setDoneCode(long doneCode) {
		this.doneCode = doneCode;
	}
	public Date getDoneDate() {
		return doneDate;
	}
	public void setDoneDate(Date doneDate) {
		this.doneDate = doneDate;
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
	public Date getMktCampCreateDate() {
		return mktCampCreateDate;
	}
	public void setMktCampCreateDate(Date mktCampCreateDate) {
		this.mktCampCreateDate = mktCampCreateDate;
	}
	public long getMktCampId() {
		return mktCampId;
	}
	public void setMktCampId(long mktCampId) {
		this.mktCampId = mktCampId;
	}
	public long getMktTgtId() {
		return mktTgtId;
	}
	public void setMktTgtId(long mktTgtId) {
		this.mktTgtId = mktTgtId;
	}
	public long getOpId() {
		return opId;
	}
	public void setOpId(long opId) {
		this.opId = opId;
	}
	public long getOrgId() {
		return orgId;
	}
	public void setOrgId(long orgId) {
		this.orgId = orgId;
	}
	public long getQnrRecId() {
		return qnrRecId;
	}
	public void setQnrRecId(long qnrRecId) {
		this.qnrRecId = qnrRecId;
	}
	public long getScriptId() {
		return scriptId;
	}
	public void setScriptId(long scriptId) {
		this.scriptId = scriptId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStateDesc() {
		return stateDesc;
	}
	public void setStateDesc(String stateDesc) {
		this.stateDesc = stateDesc;
	}
	
	

}
