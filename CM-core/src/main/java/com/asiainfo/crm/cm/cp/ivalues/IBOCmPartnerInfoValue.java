package com.asiainfo.crm.cm.cp.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmPartnerInfoValue extends DataStructInterface{

  public final static  String S_PartnerType = "PARTNER_TYPE";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_CoopCompany = "COOP_COMPANY";
  public final static  String S_OrganiseFlag = "ORGANISE_FLAG";
  public final static  String S_Auditor = "AUDITOR";
  public final static  String S_EnterLevel = "ENTER_LEVEL";
  public final static  String S_WebSite = "WEB_SITE";
  public final static  String S_BaseAccessNoProp = "BASE_ACCESS_NO_PROP";
  public final static  String S_EnterDesc = "ENTER_DESC";
  public final static  String S_ParentPartnerId = "PARENT_PARTNER_ID";
  public final static  String S_RejectType = "REJECT_TYPE";
  public final static  String S_PauseDesc = "PAUSE_DESC";
  public final static  String S_PartnerMode = "PARTNER_MODE";
  public final static  String S_StateName = "STATE_NAME";
  public final static  String S_ZoneId = "ZONE_ID";
  public final static  String S_EnName = "EN_NAME";
  public final static  String S_PartId = "PART_ID";
  public final static  String S_PublicPhone = "PUBLIC_PHONE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_AliasName = "ALIAS_NAME";
  public final static  String S_LeaveDate = "LEAVE_DATE";
  public final static  String S_LeaveDesc = "LEAVE_DESC";
  public final static  String S_LeaveType = "LEAVE_TYPE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_SiIntroNum = "SI_INTRO_NUM";
  public final static  String S_EnterDate = "ENTER_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_PartnerNo = "PARTNER_NO";
  public final static  String S_PartnerTypeDtl = "PARTNER_TYPE_DTL";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_BusiTestDate = "BUSI_TEST_DATE";
  public final static  String S_MistakeStatus = "MISTAKE_STATUS";
  public final static  String S_PassTime = "PASS_TIME";
  public final static  String S_ApplyDate = "APPLY_DATE";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_ExtField10 = "EXT_FIELD10";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_OrganiseId = "ORGANISE_ID";
  public final static  String S_RejectDate = "REJECT_DATE";
  public final static  String S_Email = "EMAIL";
  public final static  String S_ProvId = "PROV_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_BatchFlag = "BATCH_FLAG";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_PartnerProperty = "PARTNER_PROPERTY";
  public final static  String S_CooperateType = "COOPERATE_TYPE";
  public final static  String S_PartnerId = "PARTNER_ID";
  public final static  String S_OtherName = "OTHER_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_PauseDate = "PAUSE_DATE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ExtField2 = "EXT_FIELD2";
  public final static  String S_ExtField3 = "EXT_FIELD3";
  public final static  String S_ExtField1 = "EXT_FIELD1";
  public final static  String S_StatusType = "STATUS_TYPE";
  public final static  String S_ExtField6 = "EXT_FIELD6";
  public final static  String S_ExtField7 = "EXT_FIELD7";
  public final static  String S_ExtField4 = "EXT_FIELD4";
  public final static  String S_ExtField5 = "EXT_FIELD5";
  public final static  String S_RejectDesc = "REJECT_DESC";
  public final static  String S_ExtField8 = "EXT_FIELD8";
  public final static  String S_ExtField9 = "EXT_FIELD9";


public int getPartnerType();

public long getCityId();

public int getCoopCompany();

public int getOrganiseFlag();

public int getAuditor();

public int getEnterLevel();

public String getWebSite();

public int getBaseAccessNoProp();

public String getEnterDesc();

public long getParentPartnerId();

public int getRejectType();

public String getPauseDesc();

public int getPartnerMode();

public String getStateName();

public long getZoneId();

public String getEnName();

public long getPartId();

public String getPublicPhone();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getAliasName();

public Timestamp getLeaveDate();

public String getLeaveDesc();

public long getLeaveType();

public Timestamp getDoneDate();

public String getSiIntroNum();

public Timestamp getEnterDate();

public Timestamp getCreateDate();

public String getState();

public long getPartnerNo();

public int getPartnerTypeDtl();

public String getRemarks();

public Timestamp getBusiTestDate();

public int getMistakeStatus();

public Timestamp getPassTime();

public Timestamp getApplyDate();

public String getShortName();

public String getExtField10();

public long getCreateOpId();

public long getOrganiseId();

public Timestamp getRejectDate();

public String getEmail();

public long getProvId();

public long getDoneCode();

public String getBatchFlag();

public int getCreditLevel();

public int getPartnerProperty();

public int getCooperateType();

public long getPartnerId();

public String getOtherName();

public long getOrgId();

public String getRegionId();

public Timestamp getPauseDate();

public long getCreateOrgId();

public String getExtField2();

public String getExtField3();

public String getExtField1();

public int getStatusType();

public String getExtField6();

public String getExtField7();

public String getExtField4();

public String getExtField5();

public String getRejectDesc();

public String getExtField8();

public String getExtField9();


public  void setPartnerType(int value);

public  void setCityId(long value);

public  void setCoopCompany(int value);

public  void setOrganiseFlag(int value);

public  void setAuditor(int value);

public  void setEnterLevel(int value);

public  void setWebSite(String value);

public  void setBaseAccessNoProp(int value);

public  void setEnterDesc(String value);

public  void setParentPartnerId(long value);

public  void setRejectType(int value);

public  void setPauseDesc(String value);

public  void setPartnerMode(int value);

public  void setStateName(String value);

public  void setZoneId(long value);

public  void setEnName(String value);

public  void setPartId(long value);

public  void setPublicPhone(String value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setAliasName(String value);

public  void setLeaveDate(Timestamp value);

public  void setLeaveDesc(String value);

public  void setLeaveType(long value);

public  void setDoneDate(Timestamp value);

public  void setSiIntroNum(String value);

public  void setEnterDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setState(String value);

public  void setPartnerNo(long value);

public  void setPartnerTypeDtl(int value);

public  void setRemarks(String value);

public  void setBusiTestDate(Timestamp value);

public  void setMistakeStatus(int value);

public  void setPassTime(Timestamp value);

public  void setApplyDate(Timestamp value);

public  void setShortName(String value);

public  void setExtField10(String value);

public  void setCreateOpId(long value);

public  void setOrganiseId(long value);

public  void setRejectDate(Timestamp value);

public  void setEmail(String value);

public  void setProvId(long value);

public  void setDoneCode(long value);

public  void setBatchFlag(String value);

public  void setCreditLevel(int value);

public  void setPartnerProperty(int value);

public  void setCooperateType(int value);

public  void setPartnerId(long value);

public  void setOtherName(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setPauseDate(Timestamp value);

public  void setCreateOrgId(long value);

public  void setExtField2(String value);

public  void setExtField3(String value);

public  void setExtField1(String value);

public  void setStatusType(int value);

public  void setExtField6(String value);

public  void setExtField7(String value);

public  void setExtField4(String value);

public  void setExtField5(String value);

public  void setRejectDesc(String value);

public  void setExtField8(String value);

public  void setExtField9(String value);
}
