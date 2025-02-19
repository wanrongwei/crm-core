package com.asiainfo.crm.cm.cp.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmPartnerBusiInfoValue extends DataStructInterface{

  public final static  String S_CustomerInfo = "CUSTOMER_INFO";
  public final static  String S_AccessNumber = "ACCESS_NUMBER";
  public final static  String S_ServDesc = "SERV_DESC";
  public final static  String S_MaxItemMonthly = "MAX_ITEM_MONTHLY";
  public final static  String S_ModeId = "MODE_ID";
  public final static  String S_ProviceCode = "PROVICE_CODE";
  public final static  String S_EndDate = "END_DATE";
  public final static  String S_TypeDtlId = "TYPE_DTL_ID";
  public final static  String S_GatewayCode = "GATEWAY_CODE";
  public final static  String S_ZhSignText = "ZH_SIGN_TEXT";
  public final static  String S_ServiceId = "SERVICE_ID";
  public final static  String S_PauseDesc = "PAUSE_DESC";
  public final static  String S_FieldType = "FIELD_TYPE";
  public final static  String S_Version = "VERSION";
  public final static  String S_ServLevel = "SERV_LEVEL";
  public final static  String S_ServCode = "SERV_CODE";
  public final static  String S_ExpertTel = "EXPERT_TEL";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_MoAccessNum = "MO_ACCESS_NUM";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_Name = "NAME";
  public final static  String S_EnSignText = "EN_SIGN_TEXT";
  public final static  String S_PrechargeFlag = "PRECHARGE_FLAG";
  public final static  String S_BusiDataSt = "BUSI_DATA_ST";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_BusiId = "BUSI_ID";
  public final static  String S_FieldTypeDtl = "FIELD_TYPE_DTL";
  public final static  String S_SignDate = "SIGN_DATE";
  public final static  String S_ServiceInfo = "SERVICE_INFO";
  public final static  String S_State = "STATE";
  public final static  String S_SignStatus = "SIGN_STATUS";
  public final static  String S_AccessModel = "ACCESS_MODEL";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_DefaultLang = "DEFAULT_LANG";
  public final static  String S_BillingMode = "BILLING_MODE";
  public final static  String S_Status = "STATUS";
  public final static  String S_EndDesc = "END_DESC";
  public final static  String S_BusiPhase = "BUSI_PHASE";
  public final static  String S_ExpertNum = "EXPERT_NUM";
  public final static  String S_FieldDesc = "FIELD_DESC";
  public final static  String S_MaxItemDayly = "MAX_ITEM_DAYLY";
  public final static  String S_DatabaseFlag = "DATABASE_FLAG";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ServiceType = "SERVICE_TYPE";
  public final static  String S_ProvUrl = "PROV_URL";
  public final static  String S_ApplyId = "APPLY_ID";
  public final static  String S_OldIoNbr = "OLD_IO_NBR";
  public final static  String S_PartnerId = "PARTNER_ID";
  public final static  String S_ValidDesc = "VALID_DESC";
  public final static  String S_BusiProperty = "BUSI_PROPERTY";
  public final static  String S_IbusiType = "IBUSI_TYPE";
  public final static  String S_BusiCode = "BUSI_CODE";
  public final static  String S_Property = "PROPERTY";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_BusiDataDate = "BUSI_DATA_DATE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_IntroUrl = "INTRO_URL";
  public final static  String S_PauseDate = "PAUSE_DATE";
  public final static  String S_TextSignFlag = "TEXT_SIGN_FLAG";
  public final static  String S_ExtField2 = "EXT_FIELD2";
  public final static  String S_ExtField3 = "EXT_FIELD3";
  public final static  String S_ExtField1 = "EXT_FIELD1";
  public final static  String S_TypeId = "TYPE_ID";
  public final static  String S_ExtField4 = "EXT_FIELD4";
  public final static  String S_ExtField5 = "EXT_FIELD5";


public String getCustomerInfo();

public String getAccessNumber();

public String getServDesc();

public long getMaxItemMonthly();

public long getModeId();

public String getProviceCode();

public Timestamp getEndDate();

public long getTypeDtlId();

public String getGatewayCode();

public String getZhSignText();

public long getServiceId();

public String getPauseDesc();

public int getFieldType();

public String getVersion();

public int getServLevel();

public String getServCode();

public String getExpertTel();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public String getMoAccessNum();

public long getOpId();

public String getName();

public String getEnSignText();

public int getPrechargeFlag();

public int getBusiDataSt();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public long getBusiId();

public int getFieldTypeDtl();

public Timestamp getSignDate();

public String getServiceInfo();

public String getState();

public int getSignStatus();

public int getAccessModel();

public String getRemarks();

public int getDefaultLang();

public int getBillingMode();

public int getStatus();

public String getEndDesc();

public int getBusiPhase();

public int getExpertNum();

public String getFieldDesc();

public long getMaxItemDayly();

public int getDatabaseFlag();

public long getCreateOpId();

public long getDoneCode();

public int getServiceType();

public String getProvUrl();

public long getApplyId();

public long getOldIoNbr();

public long getPartnerId();

public String getValidDesc();

public int getBusiProperty();

public int getIbusiType();

public String getBusiCode();

public int getProperty();

public long getOrgId();

public String getRegionId();

public Timestamp getBusiDataDate();

public long getCreateOrgId();

public String getIntroUrl();

public Timestamp getPauseDate();

public int getTextSignFlag();

public String getExtField2();

public String getExtField3();

public String getExtField1();

public long getTypeId();

public String getExtField4();

public String getExtField5();


public  void setCustomerInfo(String value);

public  void setAccessNumber(String value);

public  void setServDesc(String value);

public  void setMaxItemMonthly(long value);

public  void setModeId(long value);

public  void setProviceCode(String value);

public  void setEndDate(Timestamp value);

public  void setTypeDtlId(long value);

public  void setGatewayCode(String value);

public  void setZhSignText(String value);

public  void setServiceId(long value);

public  void setPauseDesc(String value);

public  void setFieldType(int value);

public  void setVersion(String value);

public  void setServLevel(int value);

public  void setServCode(String value);

public  void setExpertTel(String value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setMoAccessNum(String value);

public  void setOpId(long value);

public  void setName(String value);

public  void setEnSignText(String value);

public  void setPrechargeFlag(int value);

public  void setBusiDataSt(int value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setBusiId(long value);

public  void setFieldTypeDtl(int value);

public  void setSignDate(Timestamp value);

public  void setServiceInfo(String value);

public  void setState(String value);

public  void setSignStatus(int value);

public  void setAccessModel(int value);

public  void setRemarks(String value);

public  void setDefaultLang(int value);

public  void setBillingMode(int value);

public  void setStatus(int value);

public  void setEndDesc(String value);

public  void setBusiPhase(int value);

public  void setExpertNum(int value);

public  void setFieldDesc(String value);

public  void setMaxItemDayly(long value);

public  void setDatabaseFlag(int value);

public  void setCreateOpId(long value);

public  void setDoneCode(long value);

public  void setServiceType(int value);

public  void setProvUrl(String value);

public  void setApplyId(long value);

public  void setOldIoNbr(long value);

public  void setPartnerId(long value);

public  void setValidDesc(String value);

public  void setBusiProperty(int value);

public  void setIbusiType(int value);

public  void setBusiCode(String value);

public  void setProperty(int value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setBusiDataDate(Timestamp value);

public  void setCreateOrgId(long value);

public  void setIntroUrl(String value);

public  void setPauseDate(Timestamp value);

public  void setTextSignFlag(int value);

public  void setExtField2(String value);

public  void setExtField3(String value);

public  void setExtField1(String value);

public  void setTypeId(long value);

public  void setExtField4(String value);

public  void setExtField5(String value);
}
