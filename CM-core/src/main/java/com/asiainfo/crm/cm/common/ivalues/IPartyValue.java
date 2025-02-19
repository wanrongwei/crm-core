package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IPartyValue extends DataStructInterface{

  public final static  String S_CertCode = "CERT_CODE";
  public final static  String S_PartyName = "PARTY_NAME";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_OrgAddress = "ORG_ADDRESS";
  public final static  String S_PartyNameQry = "PARTY_NAME_QRY";
  public final static  String S_Hobby = "HOBBY";
  public final static  String S_EducationLevel = "EDUCATION_LEVEL";
  public final static  String S_CertAddress = "CERT_ADDRESS";
  public final static  String S_CharacterDesc = "CHARACTER_DESC";
  public final static  String S_IncomeLevel = "INCOME_LEVEL";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_EnglishName = "ENGLISH_NAME";
  public final static  String S_Lunar = "LUNAR";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ManagerName = "MANAGER_NAME";
  public final static  String S_CertExpireDate = "CERT_EXPIRE_DATE";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_CustCertEffdate = "CUST_CERT_EFFDATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_HomeAddress = "HOME_ADDRESS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_MemberNum = "MEMBER_NUM";
  public final static  String S_NationalType = "NATIONAL_TYPE";
  public final static  String S_PoliticsFace = "POLITICS_FACE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_MarryStatus = "MARRY_STATUS";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_JobCompany = "JOB_COMPANY";
  public final static  String S_FamilyInfo = "FAMILY_INFO";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_JobPosition = "JOB_POSITION";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CertType = "CERT_TYPE";
  public final static  String S_ParentPartyId = "PARENT_PARTY_ID";
  public final static  String S_Gender = "GENDER";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_JobDesc = "JOB_DESC";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_Religion = "RELIGION";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_PartyType = "PARTY_TYPE";


public String getCertCode();

public String getPartyName();

public String getCityId();

public String getOrgAddress();

public String getPartyNameQry();

public String getHobby();

public long getEducationLevel();

public String getCertAddress();

public String getCharacterDesc();

public long getIncomeLevel();

public String getFirstName();

public String getEnglishName();

public long getLunar();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getManagerName();

public Timestamp getCertExpireDate();

public String getLastName();

public Timestamp getCustCertEffdate();

public Timestamp getDoneDate();

public String getHomeAddress();

public Timestamp getCreateDate();

public long getMemberNum();

public long getNationalType();

public long getPoliticsFace();

public String getState();

public String getRemarks();

public long getPartyId();

public String getShortName();

public String getNationality();

public long getCreateOpId();

public long getMarryStatus();

public long getDoneCode();

public Timestamp getBirthday();

public String getLastNameQry();

public String getJobCompany();

public String getFamilyInfo();

public String getProvinceId();

public String getJobPosition();

public long getOrgId();

public long getCreateOrgId();

public String getRegionId();

public int getCertType();

public long getParentPartyId();

public long getGender();

public String getCountyId();

public String getJobDesc();

public String getMiddleName();

public String getReligion();

public String getFirstNameQry();

public String getMiddleNameQry();

public int getPartyType();


public  void setCertCode(String value);

public  void setPartyName(String value);

public  void setCityId(String value);

public  void setOrgAddress(String value);

public  void setPartyNameQry(String value);

public  void setHobby(String value);

public  void setEducationLevel(long value);

public  void setCertAddress(String value);

public  void setCharacterDesc(String value);

public  void setIncomeLevel(long value);

public  void setFirstName(String value);

public  void setEnglishName(String value);

public  void setLunar(long value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setManagerName(String value);

public  void setCertExpireDate(Timestamp value);

public  void setLastName(String value);

public  void setCustCertEffdate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setHomeAddress(String value);

public  void setCreateDate(Timestamp value);

public  void setMemberNum(long value);

public  void setNationalType(long value);

public  void setPoliticsFace(long value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setPartyId(long value);

public  void setShortName(String value);

public  void setNationality(String value);

public  void setCreateOpId(long value);

public  void setMarryStatus(long value);

public  void setDoneCode(long value);

public  void setBirthday(Timestamp value);

public  void setLastNameQry(String value);

public  void setJobCompany(String value);

public  void setFamilyInfo(String value);

public  void setProvinceId(String value);

public  void setJobPosition(String value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setRegionId(String value);

public  void setCertType(int value);

public  void setParentPartyId(long value);

public  void setGender(long value);

public  void setCountyId(String value);

public  void setJobDesc(String value);

public  void setMiddleName(String value);

public  void setReligion(String value);

public  void setFirstNameQry(String value);

public  void setMiddleNameQry(String value);

public  void setPartyType(int value);
}
