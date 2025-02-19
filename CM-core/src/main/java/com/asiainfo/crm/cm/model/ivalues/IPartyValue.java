package com.asiainfo.crm.cm.model.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IPartyValue extends DataStructInterface{

  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_EntityId = "ENTITY_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CharacterDesc = "CHARACTER_DESC";
  public final static  String S_MotherName = "MOTHER_NAME";
  public final static  String S_Ext10 = "EXT10";
  public final static  String S_PrimartyIdNumber = "PRIMARTY_ID_NUMBER";
  public final static  String S_PostCode = "POST_CODE";
  public final static  String S_PartyNameQry = "PARTY_NAME_QRY";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_OfficeTel = "OFFICE_TEL";
  public final static  String S_Suffix = "SUFFIX";
  public final static  String S_CertCode = "CERT_CODE";
  public final static  String S_PlaceOfBirth = "PLACE_OF_BIRTH";
  public final static  String S_CarNo = "CAR_NO";
  public final static  String S_EducationLevel = "EDUCATION_LEVEL";
  public final static  String S_HomeTel = "HOME_TEL";
  public final static  String S_FamilyInfo = "FAMILY_INFO";
  public final static  String S_Religion = "RELIGION";
  public final static  String S_ContName = "CONT_NAME";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ContDesc = "CONT_DESC";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_SubRegionType = "SUB_REGION_TYPE";
  public final static  String S_EnglishName = "ENGLISH_NAME";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_MemberNum = "MEMBER_NUM";
  public final static  String S_PartyType = "PARTY_TYPE";
  public final static  String S_ParentPartyId = "PARENT_PARTY_ID";
  public final static  String S_PartyName = "PARTY_NAME";
  public final static  String S_OrgAddress = "ORG_ADDRESS";
  public final static  String S_RegionType = "REGION_TYPE";
  public final static  String S_ContType = "CONT_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_BirthFirstName = "BIRTH_FIRST_NAME";
  public final static  String S_CertType = "CERT_TYPE";
  public final static  String S_MarryStatus = "MARRY_STATUS";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_HomeAddress = "HOME_ADDRESS";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_Ext4 = "EXT4";
  public final static  String S_Ext5 = "EXT5";
  public final static  String S_Ext6 = "EXT6";
  public final static  String S_Ext7 = "EXT7";
  public final static  String S_Ext8 = "EXT8";
  public final static  String S_Ext9 = "EXT9";
  public final static  String S_PostAddress = "POST_ADDRESS";
  public final static  String S_PrioryLevel = "PRIORY_LEVEL";
  public final static  String S_Lunar = "LUNAR";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_BirthLastName = "BIRTH_LAST_NAME";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_ContFax = "CONT_FAX";
  public final static  String S_SecondaryIdType = "SECONDARY_ID_TYPE";
  public final static  String S_CustContId = "CUST_CONT_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_SecondaryIdNumber = "SECONDARY_ID_NUMBER";
  public final static  String S_Hobby = "HOBBY";
  public final static  String S_CertExpireDate = "CERT_EXPIRE_DATE";
  public final static  String S_IncomeLevel = "INCOME_LEVEL";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_CertAddress = "CERT_ADDRESS";
  public final static  String S_AlarmBillId = "ALARM_BILL_ID";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_SecurityId = "SECURITY_ID";
  public final static  String S_State = "STATE";
  public final static  String S_PerferLanguage = "PERFER_LANGUAGE";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_CustCertEffdate = "CUST_CERT_EFFDATE";
  public final static  String S_JobCompany = "JOB_COMPANY";
  public final static  String S_Gender = "GENDER";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_NationalType = "NATIONAL_TYPE";
  public final static  String S_PrimaryIdType = "PRIMARY_ID_TYPE";
  public final static  String S_JobDesc = "JOB_DESC";
  public final static  String S_JobPosition = "JOB_POSITION";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_ManagerName = "MANAGER_NAME";
  public final static  String S_Action = "ACTION";
  public final static  String S_CprId = "CPR_ID";
  public final static  String S_PoliticsFace = "POLITICS_FACE";
  public final static  String S_Title = "TITLE";


public long getOrgId();

public long getEntityId();

public String getRemarks();

public String getCharacterDesc();

public String getMotherName();

public Timestamp getExt10();

public String getPrimartyIdNumber();

public String getPostCode();

public String getPartyNameQry();

public Timestamp getBirthday();

public String getContAddress();

public String getOfficeTel();

public int getSuffix();

public String getCertCode();

public String getPlaceOfBirth();

public String getCarNo();

public int getEducationLevel();

public String getHomeTel();

public String getFamilyInfo();

public String getReligion();

public String getContName();

public String getLastNameQry();

public Timestamp getEffectiveDate();

public String getNationality();

public long getCreateOpId();

public String getContDesc();

public long getOpId();

public String getSubRegionType();

public String getEnglishName();

public String getLastName();

public long getMemberNum();

public int getPartyType();

public long getParentPartyId();

public String getPartyName();

public String getOrgAddress();

public String getRegionType();

public int getContType();

public long getDoneCode();

public String getBirthFirstName();

public int getCertType();

public int getMarryStatus();

public String getExt1();

public String getExt2();

public String getHomeAddress();

public String getExt3();

public String getExt4();

public String getExt5();

public int getExt6();

public String getExt7();

public int getExt8();

public Timestamp getExt9();

public String getPostAddress();

public int getPrioryLevel();

public int getLunar();

public long getCustId();

public String getFirstNameQry();

public String getBirthLastName();

public String getCountyId();

public String getShortName();

public String getContFax();

public int getSecondaryIdType();

public long getCustContId();

public long getCreateOrgId();

public Timestamp getExpireDate();

public Timestamp getDoneDate();

public String getContEmail();

public String getSecondaryIdNumber();

public String getHobby();

public Timestamp getCertExpireDate();

public int getIncomeLevel();

public String getMiddleNameQry();

public Timestamp getCreateDate();

public String getCertAddress();

public String getAlarmBillId();

public long getPartyId();

public String getRegionId();

public String getContMobile();

public String getSecurityId();

public String getState();

public String getPerferLanguage();

public long getContId();

public String getFirstName();

public Timestamp getCustCertEffdate();

public String getJobCompany();

public int getGender();

public String getProvinceId();

public String getMiddleName();

public int getNationalType();

public int getPrimaryIdType();

public String getJobDesc();

public String getJobPosition();

public String getCityId();

public String getManagerName();

public String getAction();

public String getCprId();

public int getPoliticsFace();

public int getTitle();


public  void setOrgId(long value);

public  void setEntityId(long value);

public  void setRemarks(String value);

public  void setCharacterDesc(String value);

public  void setMotherName(String value);

public  void setExt10(Timestamp value);

public  void setPrimartyIdNumber(String value);

public  void setPostCode(String value);

public  void setPartyNameQry(String value);

public  void setBirthday(Timestamp value);

public  void setContAddress(String value);

public  void setOfficeTel(String value);

public  void setSuffix(int value);

public  void setCertCode(String value);

public  void setPlaceOfBirth(String value);

public  void setCarNo(String value);

public  void setEducationLevel(int value);

public  void setHomeTel(String value);

public  void setFamilyInfo(String value);

public  void setReligion(String value);

public  void setContName(String value);

public  void setLastNameQry(String value);

public  void setEffectiveDate(Timestamp value);

public  void setNationality(String value);

public  void setCreateOpId(long value);

public  void setContDesc(String value);

public  void setOpId(long value);

public  void setSubRegionType(String value);

public  void setEnglishName(String value);

public  void setLastName(String value);

public  void setMemberNum(long value);

public  void setPartyType(int value);

public  void setParentPartyId(long value);

public  void setPartyName(String value);

public  void setOrgAddress(String value);

public  void setRegionType(String value);

public  void setContType(int value);

public  void setDoneCode(long value);

public  void setBirthFirstName(String value);

public  void setCertType(int value);

public  void setMarryStatus(int value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setHomeAddress(String value);

public  void setExt3(String value);

public  void setExt4(String value);

public  void setExt5(String value);

public  void setExt6(int value);

public  void setExt7(String value);

public  void setExt8(int value);

public  void setExt9(Timestamp value);

public  void setPostAddress(String value);

public  void setPrioryLevel(int value);

public  void setLunar(int value);

public  void setCustId(long value);

public  void setFirstNameQry(String value);

public  void setBirthLastName(String value);

public  void setCountyId(String value);

public  void setShortName(String value);

public  void setContFax(String value);

public  void setSecondaryIdType(int value);

public  void setCustContId(long value);

public  void setCreateOrgId(long value);

public  void setExpireDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setContEmail(String value);

public  void setSecondaryIdNumber(String value);

public  void setHobby(String value);

public  void setCertExpireDate(Timestamp value);

public  void setIncomeLevel(int value);

public  void setMiddleNameQry(String value);

public  void setCreateDate(Timestamp value);

public  void setCertAddress(String value);

public  void setAlarmBillId(String value);

public  void setPartyId(long value);

public  void setRegionId(String value);

public  void setContMobile(String value);

public  void setSecurityId(String value);

public  void setState(String value);

public  void setPerferLanguage(String value);

public  void setContId(long value);

public  void setFirstName(String value);

public  void setCustCertEffdate(Timestamp value);

public  void setJobCompany(String value);

public  void setGender(int value);

public  void setProvinceId(String value);

public  void setMiddleName(String value);

public  void setNationalType(int value);

public  void setPrimaryIdType(int value);

public  void setJobDesc(String value);

public  void setJobPosition(String value);

public  void setCityId(String value);

public  void setManagerName(String value);

public  void setAction(String value);

public  void setCprId(String value);

public  void setPoliticsFace(int value);

public  void setTitle(int value);
}
