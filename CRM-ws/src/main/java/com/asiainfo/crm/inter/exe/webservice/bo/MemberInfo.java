package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.asiainfo.crm.common.jsonparse.DateDeserializer;

public class MemberInfo implements Serializable {
	@JsonProperty(value="GroupId")
	public long groupId;
	@JsonProperty(value="CustId")
	public long custId;
	@JsonProperty(value="MemberKind")
	public String memberKind;
	@JsonProperty(value="UserId")
	public long userId;
	@JsonProperty(value="Department")
	public String department;
	@JsonProperty(value="Job")
	public String job;
	@JsonProperty(value="VipFlag")
	public int vipFlag;
	@JsonProperty(value="CustManagerId")
	public String custManagerId;
	@JsonProperty(value="MembertName")
	public String membertName;
	@JsonProperty(value="RegionCode")
	public String regionCode;
	@JsonProperty(value="CountyCode")
	public String countyCode;
	@JsonProperty(value="GroupMode")
	public String groupMode;
	@JsonProperty(value="ClassId")
	public String classId;
	@JsonProperty(value="State")
	public String state;
	@JsonProperty(value="CreateDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date createDate;
	@JsonProperty(value="BrandName")
	public String brandName;
	@JsonProperty(value="BrandId")
	public String brandId;
	@JsonProperty(value="PlanName")
	public String planName;
	@JsonProperty(value="PlanId")
	public String planId;
	public long getGroupId() {
		return groupId;
	}
	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getMemberKind() {
		return memberKind;
	}
	public void setMemberKind(String memberKind) {
		this.memberKind = memberKind;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getVipFlag() {
		return vipFlag;
	}
	public void setVipFlag(int vipFlag) {
		this.vipFlag = vipFlag;
	}
	public String getCustManagerId() {
		return custManagerId;
	}
	public void setCustManagerId(String custManagerId) {
		this.custManagerId = custManagerId;
	}
	public String getMembertName() {
		return membertName;
	}
	public void setMembertName(String membertName) {
		this.membertName = membertName;
	}
	public String getRegionCode() {
		return regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	public String getCountyCode() {
		return countyCode;
	}
	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}
	public String getGroupMode() {
		return groupMode;
	}
	public void setGroupMode(String groupMode) {
		this.groupMode = groupMode;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanId() {
		return planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	
}
