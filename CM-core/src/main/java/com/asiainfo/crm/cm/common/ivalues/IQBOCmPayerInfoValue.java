package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmPayerInfoValue extends DataStructInterface{

  public final static  String S_CertCode = "CERT_CODE";
  public final static  String S_PartyName = "PARTY_NAME";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_PartyNameQry = "PARTY_NAME_QRY";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_CertAddress = "CERT_ADDRESS";
  public final static  String S_ProtectExpireDate = "PROTECT_EXPIRE_DATE";
  public final static  String S_SubRegionType = "SUB_REGION_TYPE";
  public final static  String S_ManualCommercialProtection = "MANUAL_COMMERCIAL_PROTECTION";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_EnglishName = "ENGLISH_NAME";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ContMobile = "cont_mobile";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_RegionType = "REGION_TYPE";
  public final static  String S_CertExpireDate = "CERT_EXPIRE_DATE";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_CustCertEffdate = "CUST_CERT_EFFDATE";
  public final static  String S_Ext9 = "EXT9";
  public final static  String S_DirectMarketingProtection = "DIRECT_MARKETING_PROTECTION";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Ext5 = "EXT5";
  public final static  String S_Ext6 = "EXT6";
  public final static  String S_Ext7 = "EXT7";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Ext8 = "EXT8";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_ManualProtectExpireDate = "MANUAL_PROTECT_EXPIRE_DATE";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_Ext4 = "EXT4";
  public final static  String S_AddressId = "ADDRESS_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_ManualProtectEffectiveDate = "MANUAL_PROTECT_EFFECTIVE_DATE";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_PerferLanguage = "PERFER_LANGUAGE";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Ext10 = "EXT10";
  public final static  String S_ProtectEffDate = "PROTECT_EFF_DATE";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CertType = "CERT_TYPE";
  public final static  String S_ParentPartyId = "PARENT_PARTY_ID";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_PartyType = "PARTY_TYPE";


public String getCertCode();

public String getPartyName();

public String getCityId();

public String getPartyNameQry();

public long getContId();

public String getCertAddress();

public Timestamp getProtectExpireDate();

public String getSubRegionType();

public int getManualCommercialProtection();

public String getFirstName();

public String getEnglishName();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getContMobile();

public String getContEmail();

public String getRegionType();

public Timestamp getCertExpireDate();

public String getLastName();

public Timestamp getCustCertEffdate();

public Timestamp getExt9();

public int getDirectMarketingProtection();

public Timestamp getDoneDate();

public String getExt5();

public long getExt6();

public long getExt7();

public Timestamp getCreateDate();

public long getExt8();

public String getExt1();

public Timestamp getManualProtectExpireDate();

public String getExt2();

public String getExt3();

public String getExt4();

public String getAddressId();

public String getState();

public String getRemarks();

public long getPartyId();

public Timestamp getManualProtectEffectiveDate();

public String getShortName();

public int getPerferLanguage();

public String getNationality();

public long getCreateOpId();

public long getDoneCode();

public Timestamp getExt10();

public Timestamp getProtectEffDate();

public Timestamp getBirthday();

public String getContAddress();

public String getLastNameQry();

public String getProvinceId();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public int getCertType();

public long getParentPartyId();

public String getCountyId();

public String getMiddleName();

public String getFirstNameQry();

public String getMiddleNameQry();

public int getPartyType();


public  void setCertCode(String value);

public  void setPartyName(String value);

public  void setCityId(String value);

public  void setPartyNameQry(String value);

public  void setContId(long value);

public  void setCertAddress(String value);

public  void setProtectExpireDate(Timestamp value);

public  void setSubRegionType(String value);

public  void setManualCommercialProtection(int value);

public  void setFirstName(String value);

public  void setEnglishName(String value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setContMobile(String value);

public  void setContEmail(String value);

public  void setRegionType(String value);

public  void setCertExpireDate(Timestamp value);

public  void setLastName(String value);

public  void setCustCertEffdate(Timestamp value);

public  void setExt9(Timestamp value);

public  void setDirectMarketingProtection(int value);

public  void setDoneDate(Timestamp value);

public  void setExt5(String value);

public  void setExt6(long value);

public  void setExt7(long value);

public  void setCreateDate(Timestamp value);

public  void setExt8(long value);

public  void setExt1(String value);

public  void setManualProtectExpireDate(Timestamp value);

public  void setExt2(String value);

public  void setExt3(String value);

public  void setExt4(String value);

public  void setAddressId(String value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setPartyId(long value);

public  void setManualProtectEffectiveDate(Timestamp value);

public  void setShortName(String value);

public  void setPerferLanguage(int value);

public  void setNationality(String value);

public  void setCreateOpId(long value);

public  void setDoneCode(long value);

public  void setExt10(Timestamp value);

public  void setProtectEffDate(Timestamp value);

public  void setBirthday(Timestamp value);

public  void setContAddress(String value);

public  void setLastNameQry(String value);

public  void setProvinceId(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCertType(int value);

public  void setParentPartyId(long value);

public  void setCountyId(String value);

public  void setMiddleName(String value);

public  void setFirstNameQry(String value);

public  void setMiddleNameQry(String value);

public  void setPartyType(int value);
}
