package com.asiainfo.crm.cm.inner.manager.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmManagerValue extends DataStructInterface{

  public final static  String S_CertCode = "CERT_CODE";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_Hobby = "HOBBY";
  public final static  String S_EducationLevel = "EDUCATION_LEVEL";
  public final static  String S_CertAddress = "CERT_ADDRESS";
  public final static  String S_CharacterDesc = "CHARACTER_DESC";
  public final static  String S_SubRegionType = "SUB_REGION_TYPE";
  public final static  String S_IncomeLevel = "INCOME_LEVEL";
  public final static  String S_AlarmBillId = "ALARM_BILL_ID";
  public final static  String S_CertEffdate = "CERT_EFFDATE";
  public final static  String S_EnglishName = "ENGLISH_NAME";
  public final static  String S_Lunar = "LUNAR";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_StaffLevel = "STAFF_LEVEL";
  public final static  String S_RegionType = "REGION_TYPE";
  public final static  String S_CertExpireDate = "CERT_EXPIRE_DATE";
  public final static  String S_OfficeTel = "OFFICE_TEL";
  public final static  String S_WirelessCall = "WIRELESS_CALL";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_HomeAddress = "HOME_ADDRESS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_StaffType = "STAFF_TYPE";
  public final static  String S_NationalType = "NATIONAL_TYPE";
  public final static  String S_PoliticsFace = "POLITICS_FACE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_Postcode = "POSTCODE";
  public final static  String S_SecurityId = "SECURITY_ID";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_ParentStaffId = "PARENT_STAFF_ID";
  public final static  String S_BcMgr = "BC_MGR";
  public final static  String S_HomeTel = "HOME_TEL";
  public final static  String S_CarNo = "CAR_NO";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_MarryStatus = "MARRY_STATUS";
  public final static  String S_StaffName = "STAFF_NAME";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_JobCompany = "JOB_COMPANY";
  public final static  String S_FamilyInfo = "FAMILY_INFO";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_JobPosition = "JOB_POSITION";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CertType = "CERT_TYPE";
  public final static  String S_StaffId = "STAFF_ID";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_Gender = "GENDER";
  public final static  String S_JobDesc = "JOB_DESC";
  public final static  String S_Religion = "RELIGION";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_ContFax = "CONT_FAX";
  public final static  String S_ManagerType = "MANAGER_TYPE";


public String getCertCode();

public String getCityId();

public String getHobby();

public int getEducationLevel();

public String getCertAddress();

public String getCharacterDesc();

public String getSubRegionType();

public int getIncomeLevel();

public String getAlarmBillId();

public Timestamp getCertEffdate();

public String getEnglishName();

public int getLunar();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getContEmail();

public int getStaffLevel();

public String getRegionType();

public Timestamp getCertExpireDate();

public String getOfficeTel();

public String getWirelessCall();

public Timestamp getDoneDate();

public String getHomeAddress();

public Timestamp getCreateDate();

public int getStaffType();

public int getNationalType();

public int getPoliticsFace();

public String getState();

public String getRemarks();

public long getPartyId();

public String getPostcode();

public String getSecurityId();

public String getShortName();

public String getNationality();

public long getParentStaffId();

public String getBcMgr();

public String getHomeTel();

public String getCarNo();

public long getCreateOpId();

public int getMarryStatus();

public String getStaffName();

public long getDoneCode();

public Timestamp getBirthday();

public String getContAddress();

public String getJobCompany();

public String getFamilyInfo();

public String getProvinceId();

public String getJobPosition();

public long getOrgId();

public long getCreateOrgId();

public int getCertType();

public long getStaffId();

public String getCountyId();

public int getGender();

public String getJobDesc();

public String getReligion();

public String getBillId();

public String getContFax();

public int getManagerType();


public  void setCertCode(String value);

public  void setCityId(String value);

public  void setHobby(String value);

public  void setEducationLevel(int value);

public  void setCertAddress(String value);

public  void setCharacterDesc(String value);

public  void setSubRegionType(String value);

public  void setIncomeLevel(int value);

public  void setAlarmBillId(String value);

public  void setCertEffdate(Timestamp value);

public  void setEnglishName(String value);

public  void setLunar(int value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setContEmail(String value);

public  void setStaffLevel(int value);

public  void setRegionType(String value);

public  void setCertExpireDate(Timestamp value);

public  void setOfficeTel(String value);

public  void setWirelessCall(String value);

public  void setDoneDate(Timestamp value);

public  void setHomeAddress(String value);

public  void setCreateDate(Timestamp value);

public  void setStaffType(int value);

public  void setNationalType(int value);

public  void setPoliticsFace(int value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setPartyId(long value);

public  void setPostcode(String value);

public  void setSecurityId(String value);

public  void setShortName(String value);

public  void setNationality(String value);

public  void setParentStaffId(long value);

public  void setBcMgr(String value);

public  void setHomeTel(String value);

public  void setCarNo(String value);

public  void setCreateOpId(long value);

public  void setMarryStatus(int value);

public  void setStaffName(String value);

public  void setDoneCode(long value);

public  void setBirthday(Timestamp value);

public  void setContAddress(String value);

public  void setJobCompany(String value);

public  void setFamilyInfo(String value);

public  void setProvinceId(String value);

public  void setJobPosition(String value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setCertType(int value);

public  void setStaffId(long value);

public  void setCountyId(String value);

public  void setGender(int value);

public  void setJobDesc(String value);

public  void setReligion(String value);

public  void setBillId(String value);

public  void setContFax(String value);

public  void setManagerType(int value);
}
