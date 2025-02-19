package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.asiainfo.crm.common.jsonparse.DateDeserializer;
import com.asiainfo.crm.common.jsonparse.DateSerializer;

public class CustInfo implements Serializable {
	
	@JsonProperty(value="CustId")
	public long custId;
	@JsonProperty(value="CustLanguage")
	public String custLanguage;
	@JsonProperty(value="CustName")
	public String custName;
	@JsonProperty(value="CustServiceId")
	public String custServiceId;
	@JsonProperty(value="CustType")
	public int custType;
	@JsonProperty(value="CustServiceLevel")
	public int custServiceLevel;
	@JsonProperty(value="CustStatus")
	public int custStatus;
	@JsonProperty(value="CreateDate")
	public Date createDate;
	@JsonProperty(value="CreateOpId")
	public String createOpId;
	@JsonProperty(value="CreateOrgId")
	public String createOrgId;
	@JsonProperty(value="CreditLevel")
	public int creditLevel;
	@JsonProperty(value="CreditValue")
	public long creditValue;
	@JsonProperty(value="CustAddress")
	public String custAddress;
	@JsonProperty(value="CustCertAddress")
	public String custCertAddress;
	@JsonProperty(value="CustCertCode")
	public String custCertCode;
	@JsonProperty(value="CustCertEffdate")
	@JsonSerialize(using=DateSerializer.class)
	@JsonDeserialize(using=DateDeserializer.class)
	public Date custCertEffdate;
	@JsonProperty(value="CustCertExpire")
	@JsonSerialize(using=DateSerializer.class)
	@JsonDeserialize(using=DateDeserializer.class)
	public Date custCertExpire;
	@JsonProperty(value="CustCertType")
	public int custCertType;
	@JsonProperty(value="CustZipcode")
	public String custZipcode;
	@JsonProperty(value="DoneDate")
	public Date doneDate;
	@JsonProperty(value="Nationality")
	public String nationality;
	@JsonProperty(value="CityId")
	public String cityId;
	@JsonProperty(value="CountyId")
	public String countyId;
	@JsonProperty(value="OpId")
	public String opId;
	@JsonProperty(value="OrgId")
	public String orgId;
	@JsonProperty(value="PartyId")
	public long partyId;
	@JsonProperty(value="ProvinceId")
	public String provinceId;
	@JsonProperty(value="RegionId")
	public String regionId;
	@JsonProperty(value="Remarks")
	public String remarks;
	@JsonProperty(value="Birthday")
	@JsonSerialize(using=DateSerializer.class)
	@JsonDeserialize(using=DateDeserializer.class)
	public Date birthday;
	@JsonProperty(value="CharacterDesc")
	public String characterDesc;
	@JsonProperty(value="EducationLevel")
	public int educationLevel;
	@JsonProperty(value="FamilyInfo")
	public String familyInfo;
	@JsonProperty(value="Gender")
	public int gender;
	@JsonProperty(value="Hobby")
	public String hobby;
	@JsonProperty(value="IncomeLevel")
	public int incomeLevel;
	@JsonProperty(value="IndivCustType")
	public int indivCustType;
	@JsonProperty(value="IsVip")
	public int isVip;
	@JsonProperty(value="JobCompany")
	public String jobCompany;
	@JsonProperty(value="JobPosition")
	public String jobPosition;
	@JsonProperty(value="Lunar")
	public int lunar;
	@JsonProperty(value="MarryStatus")
	public int marryStatus;
	@JsonProperty(value="NationalType")
	public int nationalType;
	@JsonProperty(value="Occupation")
	public int occupation;
	@JsonProperty(value="PoliticsFace")
	public int politicsFace;
	@JsonProperty(value="RealNameFlag")
	public int realNameFlag;
	@JsonProperty(value="Religion")
	public String religion;
	@JsonProperty(value="Mail")
	public String mail;
	@JsonProperty(value="Contactor")
	public String contactor;
	@JsonProperty(value="ContactPhone")
	public String contactPhone;
	@JsonProperty(value="CampanyAddr")
	public String campanyAddr;
	@JsonProperty(value="CampanyPhone")
	public String campanyPhone;
	@JsonProperty(value="Fax")
	public String fax;
	@JsonProperty(value="GroupFax")
	public String groupFax;
	@JsonProperty(value="GroupType")
	public int groupType;
	@JsonProperty(value="GroupWeb")
	public String groupWeb;
	@JsonProperty(value="HqNumber")
	public String hqNumber;
	@JsonProperty(value="LegalCustId")
	public String legalCustId;
	@JsonProperty(value="LegalCustName")
	public String legalCustName;
	@JsonProperty(value="ParentCustId")
	public long parentCustId;
	@JsonProperty(value="RegAmount")
	public long regAmount;
	@JsonProperty(value="RegionType")
	public int regionType;
	@JsonProperty(value="ShortName")
	public String shortName;
	@JsonProperty(value="StaffAmount")
	public long staffAmount;
	@JsonProperty(value="SubRegionType")
	public int subRegionType;
	@JsonProperty(value="Vocation")
	public int vocation;
	@JsonProperty(value="SubVocation")
	public int subVocation;
	@JsonProperty(value="TownId")
	public String townId;
	@JsonProperty(value="VillegeId")
	public String villegeId;
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getCustLanguage() {
		return custLanguage;
	}
	public void setCustLanguage(String custLanguage) {
		this.custLanguage = custLanguage;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustServiceId() {
		return custServiceId;
	}
	public void setCustServiceId(String custServiceId) {
		this.custServiceId = custServiceId;
	}
	public int getCustType() {
		return custType;
	}
	public void setCustType(int custType) {
		this.custType = custType;
	}
	public int getCustServiceLevel() {
		return custServiceLevel;
	}
	public void setCustServiceLevel(int custServiceLevel) {
		this.custServiceLevel = custServiceLevel;
	}
	public int getCustStatus() {
		return custStatus;
	}
	public void setCustStatus(int custStatus) {
		this.custStatus = custStatus;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
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
	public int getCreditLevel() {
		return creditLevel;
	}
	public void setCreditLevel(int creditLevel) {
		this.creditLevel = creditLevel;
	}
	public long getCreditValue() {
		return creditValue;
	}
	public void setCreditValue(long creditValue) {
		this.creditValue = creditValue;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getCustCertAddress() {
		return custCertAddress;
	}
	public void setCustCertAddress(String custCertAddress) {
		this.custCertAddress = custCertAddress;
	}
	public String getCustCertCode() {
		return custCertCode;
	}
	public void setCustCertCode(String custCertCode) {
		this.custCertCode = custCertCode;
	}
	public Date getCustCertEffdate() {
		return custCertEffdate;
	}
	public void setCustCertEffdate(Date custCertEffdate) {
		this.custCertEffdate = custCertEffdate;
	}
	public Date getCustCertExpire() {
		return custCertExpire;
	}
	public void setCustCertExpire(Date custCertExpire) {
		this.custCertExpire = custCertExpire;
	}
	public int getCustCertType() {
		return custCertType;
	}
	public void setCustCertType(int custCertType) {
		this.custCertType = custCertType;
	}
	public String getCustZipcode() {
		return custZipcode;
	}
	public void setCustZipcode(String custZipcode) {
		this.custZipcode = custZipcode;
	}
	public Date getDoneDate() {
		return doneDate;
	}
	public void setDoneDate(Date doneDate) {
		this.doneDate = doneDate;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getCountyId() {
		return countyId;
	}
	public void setCountyId(String countyId) {
		this.countyId = countyId;
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
	public long getPartyId() {
		return partyId;
	}
	public void setPartyId(long partyId) {
		this.partyId = partyId;
	}
	public String getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}
	public String getRegionId() {
		return regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getCharacterDesc() {
		return characterDesc;
	}
	public void setCharacterDesc(String characterDesc) {
		this.characterDesc = characterDesc;
	}
	public int getEducationLevel() {
		return educationLevel;
	}
	public void setEducationLevel(int educationLevel) {
		this.educationLevel = educationLevel;
	}
	public String getFamilyInfo() {
		return familyInfo;
	}
	public void setFamilyInfo(String familyInfo) {
		this.familyInfo = familyInfo;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public int getIncomeLevel() {
		return incomeLevel;
	}
	public void setIncomeLevel(int incomeLevel) {
		this.incomeLevel = incomeLevel;
	}
	public int getIndivCustType() {
		return indivCustType;
	}
	public void setIndivCustType(int indivCustType) {
		this.indivCustType = indivCustType;
	}
	public int getIsVip() {
		return isVip;
	}
	public void setIsVip(int isVip) {
		this.isVip = isVip;
	}
	public String getJobCompany() {
		return jobCompany;
	}
	public void setJobCompany(String jobCompany) {
		this.jobCompany = jobCompany;
	}
	public String getJobPosition() {
		return jobPosition;
	}
	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}
	public int getLunar() {
		return lunar;
	}
	public void setLunar(int lunar) {
		this.lunar = lunar;
	}
	public int getMarryStatus() {
		return marryStatus;
	}
	public void setMarryStatus(int marryStatus) {
		this.marryStatus = marryStatus;
	}
	public int getNationalType() {
		return nationalType;
	}
	public void setNationalType(int nationalType) {
		this.nationalType = nationalType;
	}
	public int getOccupation() {
		return occupation;
	}
	public void setOccupation(int occupation) {
		this.occupation = occupation;
	}
	public int getPoliticsFace() {
		return politicsFace;
	}
	public void setPoliticsFace(int politicsFace) {
		this.politicsFace = politicsFace;
	}
	public int getRealNameFlag() {
		return realNameFlag;
	}
	public void setRealNameFlag(int realNameFlag) {
		this.realNameFlag = realNameFlag;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getContactor() {
		return contactor;
	}
	public void setContactor(String contactor) {
		this.contactor = contactor;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getCampanyAddr() {
		return campanyAddr;
	}
	public void setCampanyAddr(String campanyAddr) {
		this.campanyAddr = campanyAddr;
	}
	public String getCampanyPhone() {
		return campanyPhone;
	}
	public void setCampanyPhone(String campanyPhone) {
		this.campanyPhone = campanyPhone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getGroupFax() {
		return groupFax;
	}
	public void setGroupFax(String groupFax) {
		this.groupFax = groupFax;
	}
	public int getGroupType() {
		return groupType;
	}
	public void setGroupType(int groupType) {
		this.groupType = groupType;
	}
	public String getGroupWeb() {
		return groupWeb;
	}
	public void setGroupWeb(String groupWeb) {
		this.groupWeb = groupWeb;
	}
	public String getHqNumber() {
		return hqNumber;
	}
	public void setHqNumber(String hqNumber) {
		this.hqNumber = hqNumber;
	}
	public String getLegalCustId() {
		return legalCustId;
	}
	public void setLegalCustId(String legalCustId) {
		this.legalCustId = legalCustId;
	}
	public String getLegalCustName() {
		return legalCustName;
	}
	public void setLegalCustName(String legalCustName) {
		this.legalCustName = legalCustName;
	}
	public long getParentCustId() {
		return parentCustId;
	}
	public void setParentCustId(long parentCustId) {
		this.parentCustId = parentCustId;
	}
	public long getRegAmount() {
		return regAmount;
	}
	public void setRegAmount(long regAmount) {
		this.regAmount = regAmount;
	}
	public int getRegionType() {
		return regionType;
	}
	public void setRegionType(int regionType) {
		this.regionType = regionType;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public long getStaffAmount() {
		return staffAmount;
	}
	public void setStaffAmount(long staffAmount) {
		this.staffAmount = staffAmount;
	}
	public int getSubRegionType() {
		return subRegionType;
	}
	public void setSubRegionType(int subRegionType) {
		this.subRegionType = subRegionType;
	}
	public int getVocation() {
		return vocation;
	}
	public void setVocation(int vocation) {
		this.vocation = vocation;
	}
	public int getSubVocation() {
		return subVocation;
	}
	public void setSubVocation(int subVocation) {
		this.subVocation = subVocation;
	}
	public String getTownId() {
		return townId;
	}
	public void setTownId(String townId) {
		this.townId = townId;
	}
	public String getVillegeId() {
		return villegeId;
	}
	public void setVillegeId(String villegeId) {
		this.villegeId = villegeId;
	}
	
	
	
	
}
