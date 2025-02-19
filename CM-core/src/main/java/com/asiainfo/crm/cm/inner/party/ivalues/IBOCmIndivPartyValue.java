package com.asiainfo.crm.cm.inner.party.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmIndivPartyValue extends DataStructInterface{

  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_Lunar = "LUNAR";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_SecurityId = "SECURITY_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_BirthLastName = "BIRTH_LAST_NAME";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CharacterDesc = "CHARACTER_DESC";
  public final static  String S_MotherName = "MOTHER_NAME";
  public final static  String S_Ext10 = "EXT10";
  public final static  String S_JobCompany = "JOB_COMPANY";
  public final static  String S_Gender = "GENDER";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_Suffix = "SUFFIX";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_PlaceOfBirth = "PLACE_OF_BIRTH";
  public final static  String S_CarNo = "CAR_NO";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_NationalType = "NATIONAL_TYPE";
  public final static  String S_BirthFirstName = "BIRTH_FIRST_NAME";
  public final static  String S_EducationLevel = "EDUCATION_LEVEL";
  public final static  String S_FamilyInfo = "FAMILY_INFO";
  public final static  String S_MarryStatus = "MARRY_STATUS";
  public final static  String S_Hobby = "HOBBY";
  public final static  String S_JobDesc = "JOB_DESC";
  public final static  String S_IncomeLevel = "INCOME_LEVEL";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_HomeAddress = "HOME_ADDRESS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_JobPosition = "JOB_POSITION";
  public final static  String S_Ext4 = "EXT4";
  public final static  String S_Ext5 = "EXT5";
  public final static  String S_Ext6 = "EXT6";
  public final static  String S_Religion = "RELIGION";
  public final static  String S_Ext7 = "EXT7";
  public final static  String S_Ext8 = "EXT8";
  public final static  String S_Ext9 = "EXT9";
  public final static  String S_PoliticsFace = "POLITICS_FACE";
  public final static  String S_Title = "TITLE";
  public final static  String S_AlarmBillId = "ALARM_BILL_ID";
  public final static  String S_PartyId = "PARTY_ID";


public Timestamp getEffectiveDate();

public long getLunar();

public String getRegionId();

public long getCreateOpId();

public long getOrgId();

public String getSecurityId();

public long getOpId();

public String getState();

public String getBirthLastName();

public String getRemarks();

public String getCharacterDesc();

public String getMotherName();

public Timestamp getExt10();

public String getJobCompany();

public long getGender();

public long getCreateOrgId();

public Timestamp getExpireDate();

public Timestamp getBirthday();

public long getSuffix();

public Timestamp getDoneDate();

public String getPlaceOfBirth();

public String getCarNo();

public long getDoneCode();

public long getNationalType();

public String getBirthFirstName();

public long getEducationLevel();

public String getFamilyInfo();

public long getMarryStatus();

public String getHobby();

public String getJobDesc();

public long getIncomeLevel();

public String getExt1();

public String getExt2();

public String getHomeAddress();

public Timestamp getCreateDate();

public String getExt3();

public String getJobPosition();

public String getExt4();

public String getExt5();

public long getExt6();

public String getReligion();

public long getExt7();

public long getExt8();

public Timestamp getExt9();

public long getPoliticsFace();

public String getTitle();

public String getAlarmBillId();

public long getPartyId();


public  void setEffectiveDate(Timestamp value);

public  void setLunar(long value);

public  void setRegionId(String value);

public  void setCreateOpId(long value);

public  void setOrgId(long value);

public  void setSecurityId(String value);

public  void setOpId(long value);

public  void setState(String value);

public  void setBirthLastName(String value);

public  void setRemarks(String value);

public  void setCharacterDesc(String value);

public  void setMotherName(String value);

public  void setExt10(Timestamp value);

public  void setJobCompany(String value);

public  void setGender(long value);

public  void setCreateOrgId(long value);

public  void setExpireDate(Timestamp value);

public  void setBirthday(Timestamp value);

public  void setSuffix(long value);

public  void setDoneDate(Timestamp value);

public  void setPlaceOfBirth(String value);

public  void setCarNo(String value);

public  void setDoneCode(long value);

public  void setNationalType(long value);

public  void setBirthFirstName(String value);

public  void setEducationLevel(long value);

public  void setFamilyInfo(String value);

public  void setMarryStatus(long value);

public  void setHobby(String value);

public  void setJobDesc(String value);

public  void setIncomeLevel(long value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setHomeAddress(String value);

public  void setCreateDate(Timestamp value);

public  void setExt3(String value);

public  void setJobPosition(String value);

public  void setExt4(String value);

public  void setExt5(String value);

public  void setExt6(long value);

public  void setReligion(String value);

public  void setExt7(long value);

public  void setExt8(long value);

public  void setExt9(Timestamp value);

public  void setPoliticsFace(long value);

public  void setTitle(String value);

public  void setAlarmBillId(String value);

public  void setPartyId(long value);
}
