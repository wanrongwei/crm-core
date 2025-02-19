package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxIndivCustomerValue extends DataStructInterface{

  public final static  String S_Pnr = "PNR";
  public final static  String S_ProtectExpireDate = "PROTECT_EXPIRE_DATE";
  public final static  String S_ManualCommercialProtection = "MANUAL_COMMERCIAL_PROTECTION";
  public final static  String S_UpdateFlag = "UPDATE_FLAG";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_AksStatus = "AKS_STATUS";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_CoName = "CO_NAME";
  public final static  String S_ContactProtection = "CONTACT_PROTECTION";
  public final static  String S_PersonStatus = "PERSON_STATUS";
  public final static  String S_CurResidenceStrDate = "CUR_RESIDENCE_STR_DATE";
  public final static  String S_StatusEffDate = "STATUS_EFF_DATE";
  public final static  String S_Ext9 = "EXT9";
  public final static  String S_DirectMarketingProtection = "DIRECT_MARKETING_PROTECTION";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BadPayerFlag = "BAD_PAYER_FLAG";
  public final static  String S_Ext5 = "EXT5";
  public final static  String S_Ext6 = "EXT6";
  public final static  String S_Ext7 = "EXT7";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Ext8 = "EXT8";
  public final static  String S_ManualProtectExpireDate = "MANUAL_PROTECT_EXPIRE_DATE";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_Ext4 = "EXT4";
  public final static  String S_Ext20 = "EXT20";
  public final static  String S_Ext30 = "EXT30";
  public final static  String S_State = "STATE";
  public final static  String S_ManualProtectEffectiveDate = "MANUAL_PROTECT_EFFECTIVE_DATE";
  public final static  String S_Attorneys = "ATTORNEYS";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_Ext19 = "EXT19";
  public final static  String S_Ext29 = "EXT29";
  public final static  String S_Ext18 = "EXT18";
  public final static  String S_Ext17 = "EXT17";
  public final static  String S_Ext27 = "EXT27";
  public final static  String S_Ext16 = "EXT16";
  public final static  String S_Ext28 = "EXT28";
  public final static  String S_Ext15 = "EXT15";
  public final static  String S_Ext25 = "EXT25";
  public final static  String S_Ext14 = "EXT14";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Ext26 = "EXT26";
  public final static  String S_Ext13 = "EXT13";
  public final static  String S_Ext23 = "EXT23";
  public final static  String S_Ext12 = "EXT12";
  public final static  String S_DuplicateCprId = "DUPLICATE_CPR_ID";
  public final static  String S_Ext24 = "EXT24";
  public final static  String S_Ext11 = "EXT11";
  public final static  String S_Ext21 = "EXT21";
  public final static  String S_Ext10 = "EXT10";
  public final static  String S_Ext22 = "EXT22";
  public final static  String S_ProtectEffDate = "PROTECT_EFF_DATE";
  public final static  String S_MotherName = "MOTHER_NAME";
  public final static  String S_AksRegistrationDate = "AKS_REGISTRATION_DATE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_FormerName = "FORMER_NAME";
  public final static  String S_GuardianName = "GUARDIAN_NAME";


public long getPnr();

public Timestamp getProtectExpireDate();

public long getManualCommercialProtection();

public long getUpdateFlag();

public Timestamp getExpireDate();

public String getAksStatus();

public long getOpId();

public Timestamp getEffectiveDate();

public String getCoName();

public long getContactProtection();

public String getPersonStatus();

public Timestamp getCurResidenceStrDate();

public Timestamp getStatusEffDate();

public String getExt9();

public long getDirectMarketingProtection();

public Timestamp getDoneDate();

public long getBadPayerFlag();

public String getExt5();

public String getExt6();

public String getExt7();

public Timestamp getCreateDate();

public String getExt8();

public Timestamp getManualProtectExpireDate();

public String getExt1();

public String getExt2();

public String getExt3();

public String getExt4();

public long getExt20();

public Timestamp getExt30();

public String getState();

public Timestamp getManualProtectEffectiveDate();

public String getAttorneys();

public long getCustId();

public long getCreateOpId();

public long getExt19();

public Timestamp getExt29();

public String getExt18();

public String getExt17();

public Timestamp getExt27();

public String getExt16();

public Timestamp getExt28();

public String getExt15();

public long getExt25();

public String getExt14();

public long getDoneCode();

public long getExt26();

public String getExt13();

public long getExt23();

public String getExt12();

public String getDuplicateCprId();

public long getExt24();

public String getExt11();

public long getExt21();

public String getExt10();

public long getExt22();

public Timestamp getProtectEffDate();

public String getMotherName();

public Timestamp getAksRegistrationDate();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public String getFormerName();

public String getGuardianName();


public  void setPnr(long value);

public  void setProtectExpireDate(Timestamp value);

public  void setManualCommercialProtection(long value);

public  void setUpdateFlag(long value);

public  void setExpireDate(Timestamp value);

public  void setAksStatus(String value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setCoName(String value);

public  void setContactProtection(long value);

public  void setPersonStatus(String value);

public  void setCurResidenceStrDate(Timestamp value);

public  void setStatusEffDate(Timestamp value);

public  void setExt9(String value);

public  void setDirectMarketingProtection(long value);

public  void setDoneDate(Timestamp value);

public  void setBadPayerFlag(long value);

public  void setExt5(String value);

public  void setExt6(String value);

public  void setExt7(String value);

public  void setCreateDate(Timestamp value);

public  void setExt8(String value);

public  void setManualProtectExpireDate(Timestamp value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setExt3(String value);

public  void setExt4(String value);

public  void setExt20(long value);

public  void setExt30(Timestamp value);

public  void setState(String value);

public  void setManualProtectEffectiveDate(Timestamp value);

public  void setAttorneys(String value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setExt19(long value);

public  void setExt29(Timestamp value);

public  void setExt18(String value);

public  void setExt17(String value);

public  void setExt27(Timestamp value);

public  void setExt16(String value);

public  void setExt28(Timestamp value);

public  void setExt15(String value);

public  void setExt25(long value);

public  void setExt14(String value);

public  void setDoneCode(long value);

public  void setExt26(long value);

public  void setExt13(String value);

public  void setExt23(long value);

public  void setExt12(String value);

public  void setDuplicateCprId(String value);

public  void setExt24(long value);

public  void setExt11(String value);

public  void setExt21(long value);

public  void setExt10(String value);

public  void setExt22(long value);

public  void setProtectEffDate(Timestamp value);

public  void setMotherName(String value);

public  void setAksRegistrationDate(Timestamp value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setFormerName(String value);

public  void setGuardianName(String value);
}
