package com.asiainfo.crm.cm.ln.club.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOLnCmxClubMemberValue extends DataStructInterface{

  public final static  String S_CertCode = "CERT_CODE";
  public final static  String S_State = "STATE";
  public final static  String S_EnterpriseNature = "ENTERPRISE_NATURE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_HasPhoto = "HAS_PHOTO";
  public final static  String S_LunarBirthday = "LUNAR_BIRTHDAY";
  public final static  String S_HomeTel = "HOME_TEL";
  public final static  String S_MemberId = "MEMBER_ID";
  public final static  String S_RealZipcodeAdd = "REAL_ZIPCODE_ADD";
  public final static  String S_RealTheOffice = "REAL_THE_OFFICE";
  public final static  String S_ChildSts = "CHILD_STS";
  public final static  String S_HobbyId = "HOBBY_ID";
  public final static  String S_PolitiFeature = "POLITI_FEATURE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_RealJobCompany = "REAL_JOB_COMPANY";
  public final static  String S_QqNo = "QQ_NO";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_RealGender = "REAL_GENDER";
  public final static  String S_RealContactPhone = "REAL_CONTACT_PHONE";
  public final static  String S_AnnualIncome = "ANNUAL_INCOME";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_RealEmail = "REAL_EMAIL";
  public final static  String S_RealCustName = "REAL_CUST_NAME";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_KeyPersonType = "KEY_PERSON_TYPE";
  public final static  String S_IsWhiteName = "IS_WHITE_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_FetionNo = "FETION_NO";
  public final static  String S_CertType = "CERT_TYPE";
  public final static  String S_RealPost = "REAL_POST";
  public final static  String S_RealContactAdd = "REAL_CONTACT_ADD";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_IdCardNo = "ID_CARD_NO";
  public final static  String S_RealOfficePhone = "REAL_OFFICE_PHONE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_MainBirthType = "MAIN_BIRTH_TYPE";
  public final static  String S_IsFullData = "IS_FULL_DATA";


public String getCertCode();

public String getState();

public String getEnterpriseNature();

public String getRemarks();

public int getHasPhoto();

public Timestamp getLunarBirthday();

public String getHomeTel();

public long getMemberId();

public String getRealZipcodeAdd();

public String getRealTheOffice();

public int getChildSts();

public String getHobbyId();

public int getPolitiFeature();

public long getCreateOpId();

public String getRealJobCompany();

public String getQqNo();

public long getDoneCode();

public int getRealGender();

public String getRealContactPhone();

public String getAnnualIncome();

public Timestamp getExpireDate();

public String getRealEmail();

public String getRealCustName();

public Timestamp getEffectiveDate();

public Timestamp getBirthday();

public long getOpId();

public long getUserId();

public int getKeyPersonType();

public int getIsWhiteName();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public String getFetionNo();

public int getCertType();

public int getRealPost();

public String getRealContactAdd();

public Timestamp getDoneDate();

public String getIdCardNo();

public String getRealOfficePhone();

public Timestamp getCreateDate();

public int getMainBirthType();

public int getIsFullData();


public  void setCertCode(String value);

public  void setState(String value);

public  void setEnterpriseNature(String value);

public  void setRemarks(String value);

public  void setHasPhoto(int value);

public  void setLunarBirthday(Timestamp value);

public  void setHomeTel(String value);

public  void setMemberId(long value);

public  void setRealZipcodeAdd(String value);

public  void setRealTheOffice(String value);

public  void setChildSts(int value);

public  void setHobbyId(String value);

public  void setPolitiFeature(int value);

public  void setCreateOpId(long value);

public  void setRealJobCompany(String value);

public  void setQqNo(String value);

public  void setDoneCode(long value);

public  void setRealGender(int value);

public  void setRealContactPhone(String value);

public  void setAnnualIncome(String value);

public  void setExpireDate(Timestamp value);

public  void setRealEmail(String value);

public  void setRealCustName(String value);

public  void setEffectiveDate(Timestamp value);

public  void setBirthday(Timestamp value);

public  void setOpId(long value);

public  void setUserId(long value);

public  void setKeyPersonType(int value);

public  void setIsWhiteName(int value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setFetionNo(String value);

public  void setCertType(int value);

public  void setRealPost(int value);

public  void setRealContactAdd(String value);

public  void setDoneDate(Timestamp value);

public  void setIdCardNo(String value);

public  void setRealOfficePhone(String value);

public  void setCreateDate(Timestamp value);

public  void setMainBirthType(int value);

public  void setIsFullData(int value);
}
