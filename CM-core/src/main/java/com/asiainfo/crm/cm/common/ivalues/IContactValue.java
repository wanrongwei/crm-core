package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IContactValue extends DataStructInterface{

  public final static  String S_PostAddress = "POST_ADDRESS";
  public final static  String S_CertCode = "CERT_CODE";
  public final static  String S_Hobby = "HOBBY";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_EducationLevel = "EDUCATION_LEVEL";
  public final static  String S_CharacterDesc = "CHARACTER_DESC";
  public final static  String S_ContDesc = "CONT_DESC";
  public final static  String S_IncomeLevel = "INCOME_LEVEL";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_PrioryLevel = "PRIORY_LEVEL";
  public final static  String S_Lunar = "LUNAR";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ContType = "CONT_TYPE";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_ContGender = "CONT_GENDER";
  public final static  String S_OfficeTel = "OFFICE_TEL";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_PostCode = "POST_CODE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_HomeAddress = "HOME_ADDRESS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_CustContId = "CUST_CONT_ID";
  public final static  String S_PoliticsFace = "POLITICS_FACE";
  public final static  String S_NationalType = "NATIONAL_TYPE";
  public final static  String S_State = "STATE";
  public final static  String S_ContBusiInterests = "CONT_BUSI_INTERESTS";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_PostName = "POST_NAME";
  public final static  String S_ContName = "CONT_NAME";
  public final static  String S_ContactPermissions = "CONTACT_PERMISSIONS";
  public final static  String S_HomeTel = "HOME_TEL";
  public final static  String S_DepartName = "DEPART_NAME";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_MarryStatus = "MARRY_STATUS";
  public final static  String S_ContactDepartment = "CONTACT_DEPARTMENT";
  public final static  String S_ContNameQry = "CONT_NAME_QRY";
  public final static  String S_AcctContId = "ACCT_CONT_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Department = "DEPARTMENT";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_JobCompany = "JOB_COMPANY";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_JobPosition = "JOB_POSITION";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_Post = "POST";
  public final static  String S_CertType = "CERT_TYPE";
  public final static  String S_ContSocialInterests = "CONT_SOCIAL_INTERESTS";
  public final static  String S_Gender = "GENDER";
  public final static  String S_JobDesc = "JOB_DESC";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_Religion = "RELIGION";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_IsInheritable = "IS_INHERITABLE";
  public final static  String S_ContFax = "CONT_FAX";


public String getPostAddress();

public String getCertCode();

public String getHobby();

public long getContId();

public long getEducationLevel();

public String getCharacterDesc();

public String getContDesc();

public long getIncomeLevel();

public String getFirstName();

public int getPrioryLevel();

public int getLunar();

public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public int getContType();

public String getContEmail();

public int getContGender();

public String getOfficeTel();

public String getLastName();

public String getPostCode();

public Timestamp getDoneDate();

public String getHomeAddress();

public Timestamp getCreateDate();

public long getCustContId();

public long getPoliticsFace();

public long getNationalType();

public String getState();

public int getContBusiInterests();

public String getRemarks();

public long getPartyId();

public String getPostName();

public String getContName();

public int getContactPermissions();

public String getHomeTel();

public String getDepartName();

public long getCustId();

public String getContMobile();

public long getAcctId();

public long getCreateOpId();

public long getMarryStatus();

public String getContactDepartment();

public String getContNameQry();

public long getAcctContId();

public long getDoneCode();

public int getDepartment();

public Timestamp getBirthday();

public String getContAddress();

public String getLastNameQry();

public String getJobCompany();

public long getOrgId();

public String getJobPosition();

public String getRegionId();

public long getCreateOrgId();

public int getPost();

public int getCertType();

public int getContSocialInterests();

public int getGender();

public String getJobDesc();

public String getMiddleName();

public String getReligion();

public String getFirstNameQry();

public String getMiddleNameQry();

public int getIsInheritable();

public String getContFax();


public  void setPostAddress(String value);

public  void setCertCode(String value);

public  void setHobby(String value);

public  void setContId(long value);

public  void setEducationLevel(long value);

public  void setCharacterDesc(String value);

public  void setContDesc(String value);

public  void setIncomeLevel(long value);

public  void setFirstName(String value);

public  void setPrioryLevel(int value);

public  void setLunar(int value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setContType(int value);

public  void setContEmail(String value);

public  void setContGender(int value);

public  void setOfficeTel(String value);

public  void setLastName(String value);

public  void setPostCode(String value);

public  void setDoneDate(Timestamp value);

public  void setHomeAddress(String value);

public  void setCreateDate(Timestamp value);

public  void setCustContId(long value);

public  void setPoliticsFace(long value);

public  void setNationalType(long value);

public  void setState(String value);

public  void setContBusiInterests(int value);

public  void setRemarks(String value);

public  void setPartyId(long value);

public  void setPostName(String value);

public  void setContName(String value);

public  void setContactPermissions(int value);

public  void setHomeTel(String value);

public  void setDepartName(String value);

public  void setCustId(long value);

public  void setContMobile(String value);

public  void setAcctId(long value);

public  void setCreateOpId(long value);

public  void setMarryStatus(long value);

public  void setContactDepartment(String value);

public  void setContNameQry(String value);

public  void setAcctContId(long value);

public  void setDoneCode(long value);

public  void setDepartment(int value);

public  void setBirthday(Timestamp value);

public  void setContAddress(String value);

public  void setLastNameQry(String value);

public  void setJobCompany(String value);

public  void setOrgId(long value);

public  void setJobPosition(String value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setPost(int value);

public  void setCertType(int value);

public  void setContSocialInterests(int value);

public  void setGender(int value);

public  void setJobDesc(String value);

public  void setMiddleName(String value);

public  void setReligion(String value);

public  void setFirstNameQry(String value);

public  void setMiddleNameQry(String value);

public  void setIsInheritable(int value);

public  void setContFax(String value);
}
