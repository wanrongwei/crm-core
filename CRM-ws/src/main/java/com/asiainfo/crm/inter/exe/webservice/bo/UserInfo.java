package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.asiainfo.crm.common.jsonparse.DateDeserializer;

public class UserInfo implements Serializable {
	
	@JsonProperty(value="UserId")
	public long userId;
	@JsonProperty(value="ProdCatalogId")
	public long prodCatalogId;
	@JsonProperty(value="CustId")
	public long custId;
	@JsonProperty(value="CustType")
	public int custType;
	@JsonProperty(value="BillId")
	public String billId;
	@JsonProperty(value="SubBillId")
	public String subBillId;
	@JsonProperty(value="FirstUseDate")
	public Date firstUseDate;
	@JsonProperty(value="State")
	public int state;
	@JsonProperty(value="AreaCode")
	public String areaCode;
	@JsonProperty(value="OweAmount")
	public double oweAmount;
	@JsonProperty(value="PasswordType")
	public int passwordType;
	@JsonProperty(value="Password")
	public String password;
	@JsonProperty(value="UserType")
	public int userType;
	@JsonProperty(value="NoticeFlag")
	public int noticeFlag;
	@JsonProperty(value="IsOutNet")
	public int isOutNet;
	@JsonProperty(value="AreaId")
	public String areaId;
	@JsonProperty(value="BalOrgId")
	public String balOrgId;
	@JsonProperty(value="ContId")
	public int contId;
	@JsonProperty(value="RiskFlag")
	public String riskFlag;
	@JsonProperty(value="CreateOpId")
	public String createOpId;
	@JsonProperty(value="CreateOrgId")
	public String createOrgId;
	@JsonProperty(value="CreateDate")
	public Date createDate;
	@JsonProperty(value="OpId")
	public String opId;
	@JsonProperty(value="OrgId")
	public String orgId;
	@JsonProperty(value="DoneCode")
	public String doneCode;
	@JsonProperty(value="DoneDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date doneDate;
	@JsonProperty(value="EffectiveDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date effectiveDate;
	@JsonProperty(value="ExpireDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date expireDate;
	@JsonProperty(value="RegionId")
	public String regionId;
	@JsonProperty(value="EffectiveDateType")
	public int effectiveDateType;
	@JsonProperty(value="ExpireDateType")
	public int expireDateType;
	@JsonProperty(value="Remarks")
	public String remarks;
	@JsonProperty(value="CountryCode")
	public String countryCode;
	@JsonProperty(value="AddressId")
	public String addressId;
	@JsonProperty(value="AddressDesc")
	public String addressDesc;
	@JsonProperty(value="CreditLevel")
	public int creditLevel;
	@JsonProperty(value="StateDesc")
	public String stateDesc;
	@JsonProperty(value="UserTypeDesc")
	public String userTypeDesc;
	@JsonProperty(value="NoticeFlagDesc")
	public String noticeFlagDesc;
	@JsonProperty(value="BrandId")
	public String brandId;
	@JsonProperty(value="BrandIdDesc")
	public String brandIdDesc;
	@JsonProperty(value="OfferId")
	public long offerId;
	@JsonProperty(value="OfferInstId")
	public long offerInstId;
	@JsonProperty(value="OfferType")
	public String offerType;
	@JsonProperty(value="OfferName")
	public String offerName;
	@JsonProperty(value="OfferEffectiveDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date offerEffectiveDate;
	@JsonProperty(value="OfferExpireDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date offerExpireDate;
	@JsonProperty(value="OfferDesc")
	public String offerDesc;
	@JsonProperty(value="OsStatus")
	public String osStatus;
	@JsonProperty(value="AstopDate")
	public Date astopDate;
	@JsonProperty(value="BstopDate")
	public Date bstopDate;
	@JsonProperty(value="MstopDate")
	public Date mstopDate;
	@JsonProperty(value="RstopDate")
	public Date rstopDate;
	@JsonProperty(value="OstopDate")
	public Date ostopDate;
	@JsonProperty(value="ResSpecId")
	public String resSpecId;
	@JsonProperty(value="IccId")
	public String iccId;
	@JsonProperty(value="BaseAcctId")
	public long baseAcctId;
	@JsonProperty(value="UserAcctNum")
	public int userAcctNum;
	@JsonProperty(value="ContractNo")
	public String contractNo;
	@JsonProperty(value="SuperClassCode")
	public int superClassCode;
	@JsonProperty(value="ImportantClassCode")
	public int importantClassCode;
	@JsonProperty(value="GroupClassCode")
	public int groupClassCode;
	@JsonProperty(value="CustManagerName")
	public String custManagerName;
	@JsonProperty(value="CustManagerPhone")
	public String custManagerPhone;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getProdCatalogId() {
		return prodCatalogId;
	}
	public void setProdCatalogId(long prodCatalogId) {
		this.prodCatalogId = prodCatalogId;
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public int getCustType() {
		return custType;
	}
	public void setCustType(int custType) {
		this.custType = custType;
	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getSubBillId() {
		return subBillId;
	}
	public void setSubBillId(String subBillId) {
		this.subBillId = subBillId;
	}
	public Date getFirstUseDate() {
		return firstUseDate;
	}
	public void setFirstUseDate(Date firstUseDate) {
		this.firstUseDate = firstUseDate;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public double getOweAmount() {
		return oweAmount;
	}
	public void setOweAmount(double oweAmount) {
		this.oweAmount = oweAmount;
	}
	public int getPasswordType() {
		return passwordType;
	}
	public void setPasswordType(int passwordType) {
		this.passwordType = passwordType;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public int getNoticeFlag() {
		return noticeFlag;
	}
	public void setNoticeFlag(int noticeFlag) {
		this.noticeFlag = noticeFlag;
	}
	public int getIsOutNet() {
		return isOutNet;
	}
	public void setIsOutNet(int isOutNet) {
		this.isOutNet = isOutNet;
	}
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getBalOrgId() {
		return balOrgId;
	}
	public void setBalOrgId(String balOrgId) {
		this.balOrgId = balOrgId;
	}
	public int getContId() {
		return contId;
	}
	public void setContId(int contId) {
		this.contId = contId;
	}
	public String getRiskFlag() {
		return riskFlag;
	}
	public void setRiskFlag(String riskFlag) {
		this.riskFlag = riskFlag;
	}
	public String getCreateOpId() {
		return createOpId;
	}
	public void setCreateOpId(String createOpId) {
		this.createOpId = createOpId;
	}
	public String getCreateOrgId() {
		return createOrgId;
	}
	public void setCreateOrgId(String createOrgId) {
		this.createOrgId = createOrgId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getOpId() {
		return opId;
	}
	public void setOpId(String opId) {
		this.opId = opId;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getDoneCode() {
		return doneCode;
	}
	public void setDoneCode(String doneCode) {
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
	public String getRegionId() {
		return regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	public int getEffectiveDateType() {
		return effectiveDateType;
	}
	public void setEffectiveDateType(int effectiveDateType) {
		this.effectiveDateType = effectiveDateType;
	}
	public int getExpireDateType() {
		return expireDateType;
	}
	public void setExpireDateType(int expireDateType) {
		this.expireDateType = expireDateType;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getAddressDesc() {
		return addressDesc;
	}
	public void setAddressDesc(String addressDesc) {
		this.addressDesc = addressDesc;
	}
	public int getCreditLevel() {
		return creditLevel;
	}
	public void setCreditLevel(int creditLevel) {
		this.creditLevel = creditLevel;
	}
	public String getStateDesc() {
		return stateDesc;
	}
	public void setStateDesc(String stateDesc) {
		this.stateDesc = stateDesc;
	}
	public String getUserTypeDesc() {
		return userTypeDesc;
	}
	public void setUserTypeDesc(String userTypeDesc) {
		this.userTypeDesc = userTypeDesc;
	}
	public String getNoticeFlagDesc() {
		return noticeFlagDesc;
	}
	public void setNoticeFlagDesc(String noticeFlagDesc) {
		this.noticeFlagDesc = noticeFlagDesc;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getBrandIdDesc() {
		return brandIdDesc;
	}
	public void setBrandIdDesc(String brandIdDesc) {
		this.brandIdDesc = brandIdDesc;
	}
	public long getOfferId() {
		return offerId;
	}
	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}
	public long getOfferInstId() {
		return offerInstId;
	}
	public void setOfferInstId(long offerInstId) {
		this.offerInstId = offerInstId;
	}
	public String getOfferType() {
		return offerType;
	}
	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public Date getOfferEffectiveDate() {
		return offerEffectiveDate;
	}
	public void setOfferEffectiveDate(Date offerEffectiveDate) {
		this.offerEffectiveDate = offerEffectiveDate;
	}
	public Date getOfferExpireDate() {
		return offerExpireDate;
	}
	public void setOfferExpireDate(Date offerExpireDate) {
		this.offerExpireDate = offerExpireDate;
	}
	public String getOfferDesc() {
		return offerDesc;
	}
	public void setOfferDesc(String offerDesc) {
		this.offerDesc = offerDesc;
	}
	public String getOsStatus() {
		return osStatus;
	}
	public void setOsStatus(String osStatus) {
		this.osStatus = osStatus;
	}
	public Date getAstopDate() {
		return astopDate;
	}
	public void setAstopDate(Date astopDate) {
		this.astopDate = astopDate;
	}
	public Date getBstopDate() {
		return bstopDate;
	}
	public void setBstopDate(Date bstopDate) {
		this.bstopDate = bstopDate;
	}
	public Date getMstopDate() {
		return mstopDate;
	}
	public void setMstopDate(Date mstopDate) {
		this.mstopDate = mstopDate;
	}
	public Date getRstopDate() {
		return rstopDate;
	}
	public void setRstopDate(Date rstopDate) {
		this.rstopDate = rstopDate;
	}
	public Date getOstopDate() {
		return ostopDate;
	}
	public void setOstopDate(Date ostopDate) {
		this.ostopDate = ostopDate;
	}
	public String getResSpecId() {
		return resSpecId;
	}
	public void setResSpecId(String resSpecId) {
		this.resSpecId = resSpecId;
	}
	public String getIccId() {
		return iccId;
	}
	public void setIccId(String iccId) {
		this.iccId = iccId;
	}
	public long getBaseAcctId() {
		return baseAcctId;
	}
	public void setBaseAcctId(long baseAcctId) {
		this.baseAcctId = baseAcctId;
	}
	public int getUserAcctNum() {
		return userAcctNum;
	}
	public void setUserAcctNum(int userAcctNum) {
		this.userAcctNum = userAcctNum;
	}
	public String getContractNo() {
		return contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public int getSuperClassCode() {
		return superClassCode;
	}
	public void setSuperClassCode(int superClassCode) {
		this.superClassCode = superClassCode;
	}
	public int getImportantClassCode() {
		return importantClassCode;
	}
	public void setImportantClassCode(int importantClassCode) {
		this.importantClassCode = importantClassCode;
	}
	public int getGroupClassCode() {
		return groupClassCode;
	}
	public void setGroupClassCode(int groupClassCode) {
		this.groupClassCode = groupClassCode;
	}
	public String getCustManagerName() {
		return custManagerName;
	}
	public void setCustManagerName(String custManagerName) {
		this.custManagerName = custManagerName;
	}
	public String getCustManagerPhone() {
		return custManagerPhone;
	}
	public void setCustManagerPhone(String custManagerPhone) {
		this.custManagerPhone = custManagerPhone;
	}


}
