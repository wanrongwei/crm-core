package com.asiainfo.crm.cm.custview.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmIndivCustomerHValue extends DataStructInterface{

  public final static  String S_IndivCustType = "INDIV_CUST_TYPE";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_Hobby = "HOBBY";
  public final static  String S_EducationLevel = "EDUCATION_LEVEL";
  public final static  String S_CharacterDesc = "CHARACTER_DESC";
  public final static  String S_IncomeLevel = "INCOME_LEVEL";
  public final static  String S_CustCertType = "CUST_CERT_TYPE";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_CustCertCode = "CUST_CERT_CODE";
  public final static  String S_CustLanguage = "CUST_LANGUAGE";
  public final static  String S_CustCertExpire = "CUST_CERT_EXPIRE";
  public final static  String S_CustZipcode = "CUST_ZIPCODE";
  public final static  String S_EnglishName = "ENGLISH_NAME";
  public final static  String S_Lunar = "LUNAR";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_HId = "H_ID";
  public final static  String S_Occupation = "OCCUPATION";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_CustNameQry = "CUST_NAME_QRY";
  public final static  String S_CustCertEffdate = "CUST_CERT_EFFDATE";
  public final static  String S_BlogNo = "BLOG_NO";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_IsVip = "IS_VIP";
  public final static  String S_PoliticsFace = "POLITICS_FACE";
  public final static  String S_NationalType = "NATIONAL_TYPE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_CustAddress = "CUST_ADDRESS";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_MarryStatus = "MARRY_STATUS";
  public final static  String S_QqNo = "QQ_NO";
  public final static  String S_CustServiceLevel = "CUST_SERVICE_LEVEL";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_RealNameFlag = "REAL_NAME_FLAG";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_CustStatus = "CUST_STATUS";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_CustServiceId = "CUST_SERVICE_ID";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_JobCompany = "JOB_COMPANY";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_FamilyInfo = "FAMILY_INFO";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_JobPosition = "JOB_POSITION";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_Gender = "GENDER";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_Religion = "RELIGION";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_CustCertAddress = "CUST_CERT_ADDRESS";


public String getIndivCustType();

public String getCityId();

public String getHobby();

public int getEducationLevel();

public String getCharacterDesc();

public int getIncomeLevel();

public int getCustCertType();

public String getFirstName();

public String getCustCertCode();

public String getCustLanguage();

public Timestamp getCustCertExpire();

public String getCustZipcode();

public String getEnglishName();

public int getLunar();

public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public long getHId();

public int getOccupation();

public String getLastName();

public String getCustName();

public String getCustNameQry();

public Timestamp getCustCertEffdate();

public String getBlogNo();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public int getIsVip();

public int getPoliticsFace();

public int getNationalType();

public String getState();

public String getRemarks();

public long getPartyId();

public long getCreditValue();

public String getShortName();

public String getNationality();

public String getCustAddress();

public long getCustId();

public long getCreateOpId();

public int getMarryStatus();

public String getQqNo();

public int getCustServiceLevel();

public long getDoneCode();

public int getRealNameFlag();

public int getCreditLevel();

public int getCustStatus();

public Timestamp getBirthday();

public String getCustServiceId();

public String getLastNameQry();

public String getJobCompany();

public String getProvinceId();

public String getFamilyInfo();

public long getOrgId();

public String getJobPosition();

public String getRegionId();

public long getCreateOrgId();

public String getCountyId();

public int getGender();

public String getMiddleName();

public String getReligion();

public String getFirstNameQry();

public String getMiddleNameQry();

public String getCustCertAddress();


public  void setIndivCustType(String value);

public  void setCityId(String value);

public  void setHobby(String value);

public  void setEducationLevel(int value);

public  void setCharacterDesc(String value);

public  void setIncomeLevel(int value);

public  void setCustCertType(int value);

public  void setFirstName(String value);

public  void setCustCertCode(String value);

public  void setCustLanguage(String value);

public  void setCustCertExpire(Timestamp value);

public  void setCustZipcode(String value);

public  void setEnglishName(String value);

public  void setLunar(int value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setHId(long value);

public  void setOccupation(int value);

public  void setLastName(String value);

public  void setCustName(String value);

public  void setCustNameQry(String value);

public  void setCustCertEffdate(Timestamp value);

public  void setBlogNo(String value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setIsVip(int value);

public  void setPoliticsFace(int value);

public  void setNationalType(int value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setPartyId(long value);

public  void setCreditValue(long value);

public  void setShortName(String value);

public  void setNationality(String value);

public  void setCustAddress(String value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setMarryStatus(int value);

public  void setQqNo(String value);

public  void setCustServiceLevel(int value);

public  void setDoneCode(long value);

public  void setRealNameFlag(int value);

public  void setCreditLevel(int value);

public  void setCustStatus(int value);

public  void setBirthday(Timestamp value);

public  void setCustServiceId(String value);

public  void setLastNameQry(String value);

public  void setJobCompany(String value);

public  void setProvinceId(String value);

public  void setFamilyInfo(String value);

public  void setOrgId(long value);

public  void setJobPosition(String value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCountyId(String value);

public  void setGender(int value);

public  void setMiddleName(String value);

public  void setReligion(String value);

public  void setFirstNameQry(String value);

public  void setMiddleNameQry(String value);

public  void setCustCertAddress(String value);
}
