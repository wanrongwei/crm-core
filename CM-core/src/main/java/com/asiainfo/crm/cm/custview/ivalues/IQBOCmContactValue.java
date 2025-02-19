package com.asiainfo.crm.cm.custview.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmContactValue extends DataStructInterface{

  public final static  String S_PostAddress = "POST_ADDRESS";
  public final static  String S_CertCode = "CERT_CODE";
  public final static  String S_State = "STATE";
  public final static  String S_PartyName = "PARTY_NAME";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_ContName = "CONT_NAME";
  public final static  String S_CertAddress = "CERT_ADDRESS";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_ContDesc = "CONT_DESC";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_HomeTel = "HOME_TEL";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ContNameQry = "CONT_NAME_QRY";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_PrioryLevel = "PRIORY_LEVEL";
  public final static  String S_EnglishName = "ENGLISH_NAME";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_OfficeTel = "OFFICE_TEL";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_CertExpireDate = "CERT_EXPIRE_DATE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CertType = "CERT_TYPE";
  public final static  String S_ParentPartyId = "PARENT_PARTY_ID";
  public final static  String S_CustCertEffdate = "CUST_CERT_EFFDATE";
  public final static  String S_PostCode = "POST_CODE";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_PartyType = "PARTY_TYPE";
  public final static  String S_ContFax = "CONT_FAX";


public String getPostAddress();

public String getCertCode();

public String getState();

public String getPartyName();

public String getCityId();

public String getRemarks();

public long getPartyId();

public long getContId();

public String getContName();

public String getCertAddress();

public String getShortName();

public String getContDesc();

public String getNationality();

public String getHomeTel();

public String getFirstName();

public String getContMobile();

public long getCreateOpId();

public String getContNameQry();

public long getDoneCode();

public long getPrioryLevel();

public String getEnglishName();

public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getContAddress();

public String getLastNameQry();

public String getContEmail();

public String getProvinceId();

public String getOfficeTel();

public String getLastName();

public Timestamp getCertExpireDate();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public long getCertType();

public long getParentPartyId();

public Timestamp getCustCertEffdate();

public String getPostCode();

public String getMiddleName();

public String getCountyId();

public Timestamp getDoneDate();

public String getFirstNameQry();

public Timestamp getCreateDate();

public String getMiddleNameQry();

public long getPartyType();

public String getContFax();


public  void setPostAddress(String value);

public  void setCertCode(String value);

public  void setState(String value);

public  void setPartyName(String value);

public  void setCityId(String value);

public  void setRemarks(String value);

public  void setPartyId(long value);

public  void setContId(long value);

public  void setContName(String value);

public  void setCertAddress(String value);

public  void setShortName(String value);

public  void setContDesc(String value);

public  void setNationality(String value);

public  void setHomeTel(String value);

public  void setFirstName(String value);

public  void setContMobile(String value);

public  void setCreateOpId(long value);

public  void setContNameQry(String value);

public  void setDoneCode(long value);

public  void setPrioryLevel(long value);

public  void setEnglishName(String value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setContAddress(String value);

public  void setLastNameQry(String value);

public  void setContEmail(String value);

public  void setProvinceId(String value);

public  void setOfficeTel(String value);

public  void setLastName(String value);

public  void setCertExpireDate(Timestamp value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCertType(long value);

public  void setParentPartyId(long value);

public  void setCustCertEffdate(Timestamp value);

public  void setPostCode(String value);

public  void setMiddleName(String value);

public  void setCountyId(String value);

public  void setDoneDate(Timestamp value);

public  void setFirstNameQry(String value);

public  void setCreateDate(Timestamp value);

public  void setMiddleNameQry(String value);

public  void setPartyType(long value);

public  void setContFax(String value);
}
