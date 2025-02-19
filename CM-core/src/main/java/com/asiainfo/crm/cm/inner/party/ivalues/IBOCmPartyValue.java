package com.asiainfo.crm.cm.inner.party.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmPartyValue extends DataStructInterface{

  public final static  String S_CertCode = "CERT_CODE";
  public final static  String S_State = "STATE";
  public final static  String S_PartyName = "PARTY_NAME";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyNameQry = "PARTY_NAME_QRY";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_CertAddress = "CERT_ADDRESS";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_PerferLanguage = "PERFER_LANGUAGE";
  public final static  String S_CprId = "CPR_ID";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_SubRegionType = "SUB_REGION_TYPE";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_EnglishName = "ENGLISH_NAME";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_RegionType = "REGION_TYPE";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_CertExpireDate = "CERT_EXPIRE_DATE";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CertType = "CERT_TYPE";
  public final static  String S_ParentPartyId = "PARENT_PARTY_ID";
  public final static  String S_CustCertEffdate = "CUST_CERT_EFFDATE";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_PartyType = "PARTY_TYPE";


public String getCertCode();

public String getState();

public String getPartyName();

public String getCityId();

public String getRemarks();

public String getPartyNameQry();

public long getPartyId();

public String getCertAddress();

public String getShortName();

public long getPerferLanguage();

public String getCprId();

public String getNationality();

public String getSubRegionType();

public String getFirstName();

public long getCreateOpId();

public long getDoneCode();

public String getEnglishName();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getLastNameQry();

public String getRegionType();

public String getProvinceId();

public Timestamp getCertExpireDate();

public String getLastName();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public long getCertType();

public long getParentPartyId();

public Timestamp getCustCertEffdate();

public String getCountyId();

public String getMiddleName();

public Timestamp getDoneDate();

public String getFirstNameQry();

public Timestamp getCreateDate();

public String getMiddleNameQry();

public long getPartyType();


public  void setCertCode(String value);

public  void setState(String value);

public  void setPartyName(String value);

public  void setCityId(String value);

public  void setRemarks(String value);

public  void setPartyNameQry(String value);

public  void setPartyId(long value);

public  void setCertAddress(String value);

public  void setShortName(String value);

public  void setPerferLanguage(long value);

public  void setCprId(String value);

public  void setNationality(String value);

public  void setSubRegionType(String value);

public  void setFirstName(String value);

public  void setCreateOpId(long value);

public  void setDoneCode(long value);

public  void setEnglishName(String value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setLastNameQry(String value);

public  void setRegionType(String value);

public  void setProvinceId(String value);

public  void setCertExpireDate(Timestamp value);

public  void setLastName(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCertType(long value);

public  void setParentPartyId(long value);

public  void setCustCertEffdate(Timestamp value);

public  void setCountyId(String value);

public  void setMiddleName(String value);

public  void setDoneDate(Timestamp value);

public  void setFirstNameQry(String value);

public  void setCreateDate(Timestamp value);

public  void setMiddleNameQry(String value);

public  void setPartyType(long value);
}
