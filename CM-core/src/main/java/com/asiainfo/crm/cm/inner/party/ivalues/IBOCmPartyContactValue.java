package com.asiainfo.crm.cm.inner.party.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmPartyContactValue extends DataStructInterface{

  public final static  String S_PostAddress = "POST_ADDRESS";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_ManualProtectEffectiveDate = "MANUAL_PROTECT_EFFECTIVE_DATE";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_ContName = "CONT_NAME";
  public final static  String S_ContDesc = "CONT_DESC";
  public final static  String S_ProtectExpireDate = "PROTECT_EXPIRE_DATE";
  public final static  String S_ManualCommercialProtection = "MANUAL_COMMERCIAL_PROTECTION";
  public final static  String S_HomeTel = "HOME_TEL";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ContNameQry = "CONT_NAME_QRY";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_PrioryLevel = "PRIORY_LEVEL";
  public final static  String S_Ext10 = "EXT10";
  public final static  String S_ProtectEffDate = "PROTECT_EFF_DATE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_OfficeTel = "OFFICE_TEL";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_Ext9 = "EXT9";
  public final static  String S_PostCode = "POST_CODE";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_DirectMarketingProtection = "DIRECT_MARKETING_PROTECTION";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Ext5 = "EXT5";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_Ext6 = "EXT6";
  public final static  String S_Ext7 = "EXT7";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Ext8 = "EXT8";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_ManualProtectExpireDate = "MANUAL_PROTECT_EXPIRE_DATE";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_ContFax = "CONT_FAX";
  public final static  String S_Ext4 = "EXT4";


public String getPostAddress();

public String getState();

public String getRemarks();

public long getPartyId();

public Timestamp getManualProtectEffectiveDate();

public long getContId();

public String getContName();

public String getContDesc();

public Timestamp getProtectExpireDate();

public long getManualCommercialProtection();

public String getHomeTel();

public String getFirstName();

public String getContMobile();

public long getCreateOpId();

public String getContNameQry();

public long getDoneCode();

public long getPrioryLevel();

public Timestamp getExt10();

public Timestamp getProtectEffDate();

public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getContAddress();

public String getLastNameQry();

public String getContEmail();

public String getOfficeTel();

public String getLastName();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public Timestamp getExt9();

public String getPostCode();

public String getMiddleName();

public long getDirectMarketingProtection();

public Timestamp getDoneDate();

public String getExt5();

public String getFirstNameQry();

public long getExt6();

public long getExt7();

public Timestamp getCreateDate();

public long getExt8();

public String getMiddleNameQry();

public Timestamp getManualProtectExpireDate();

public String getExt1();

public String getExt2();

public String getExt3();

public String getContFax();

public String getExt4();


public  void setPostAddress(String value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setPartyId(long value);

public  void setManualProtectEffectiveDate(Timestamp value);

public  void setContId(long value);

public  void setContName(String value);

public  void setContDesc(String value);

public  void setProtectExpireDate(Timestamp value);

public  void setManualCommercialProtection(long value);

public  void setHomeTel(String value);

public  void setFirstName(String value);

public  void setContMobile(String value);

public  void setCreateOpId(long value);

public  void setContNameQry(String value);

public  void setDoneCode(long value);

public  void setPrioryLevel(long value);

public  void setExt10(Timestamp value);

public  void setProtectEffDate(Timestamp value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setContAddress(String value);

public  void setLastNameQry(String value);

public  void setContEmail(String value);

public  void setOfficeTel(String value);

public  void setLastName(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setExt9(Timestamp value);

public  void setPostCode(String value);

public  void setMiddleName(String value);

public  void setDirectMarketingProtection(long value);

public  void setDoneDate(Timestamp value);

public  void setExt5(String value);

public  void setFirstNameQry(String value);

public  void setExt6(long value);

public  void setExt7(long value);

public  void setCreateDate(Timestamp value);

public  void setExt8(long value);

public  void setMiddleNameQry(String value);

public  void setManualProtectExpireDate(Timestamp value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setExt3(String value);

public  void setContFax(String value);

public  void setExt4(String value);
}
