package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCustPerferInfomationValue extends DataStructInterface{

  public final static  String S_MediumDoneCode = "MEDIUM_DONE_CODE";
  public final static  String S_ChannelDoneCode = "CHANNEL_DONE_CODE";
  public final static  String S_AddressId = "ADDRESS_ID";
  public final static  String S_ChannelCreateOrgId = "CHANNEL_CREATE_ORG_ID";
  public final static  String S_PreferChannelId = "PREFER_CHANNEL_ID";
  public final static  String S_MediumOpId = "MEDIUM_OP_ID";
  public final static  String S_ChannelCreateOpId = "CHANNEL_CREATE_OP_ID";
  public final static  String S_FaxNumber = "FAX_NUMBER";
  public final static  String S_AddressCode = "ADDRESS_CODE";
  public final static  String S_ChannelRegionId = "CHANNEL_REGION_ID";
  public final static  String S_UpContMedTypeId = "UP_CONT_MED_TYPE_ID";
  public final static  String S_PreferChannelName = "PREFER_CHANNEL_NAME";
  public final static  String S_AddressDetail = "ADDRESS_DETAIL";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_ProtectExpDate = "PROTECT_EXP_DATE";
  public final static  String S_ChannelDoneDate = "CHANNEL_DONE_DATE";
  public final static  String S_Action = "ACTION";
  public final static  String S_MediumExpireDate = "MEDIUM_EXPIRE_DATE";
  public final static  String S_ContMedTypeName = "CONT_MED_TYPE_NAME";
  public final static  String S_ProtectEffDate = "PROTECT_EFF_DATE";
  public final static  String S_ChannelEffectiveDate = "CHANNEL_EFFECTIVE_DATE";
  public final static  String S_ChannelExpireDate = "CHANNEL_EXPIRE_DATE";
  public final static  String S_ChannelRemarks = "CHANNEL_REMARKS";
  public final static  String S_ChannelCreateDate = "CHANNEL_CREATE_DATE";
  public final static  String S_MediumRemarks = "MEDIUM_REMARKS";
  public final static  String S_MediumDoneDate = "MEDIUM_DONE_DATE";
  public final static  String S_Priority = "PRIORITY";
  public final static  String S_MediumOrgId = "MEDIUM_ORG_ID";
  public final static  String S_ChannelOrgId = "CHANNEL_ORG_ID";
  public final static  String S_MediumEffectiveDate = "MEDIUM_EFFECTIVE_DATE";
  public final static  String S_ChannelState = "CHANNEL_STATE";
  public final static  String S_CustContRelaId = "CUST_CONT_RELA_ID";
  public final static  String S_MediumCreateOpId = "MEDIUM_CREATE_OP_ID";
  public final static  String S_ContNumber = "CONT_NUMBER";
  public final static  String S_ContMedTypeId = "CONT_MED_TYPE_ID";
  public final static  String S_PerferType = "PERFER_TYPE";
  public final static  String S_MediumRegionId = "MEDIUM_REGION_ID";
  public final static  String S_IsNoDisturbing = "IS_NO_DISTURBING";
  public final static  String S_ChannelOpId = "CHANNEL_OP_ID";
  public final static  String S_MediumCreateDate = "MEDIUM_CREATE_DATE";
  public final static  String S_PostalCode = "POSTAL_CODE";
  public final static  String S_MediumState = "MEDIUM_STATE";
  public final static  String S_MediumCreateOrgId = "MEDIUM_CREATE_ORG_ID";
  public final static  String S_Prior = "PRIOR";
  public final static  String S_EmailAddress = "EMAIL_ADDRESS";


public long getMediumDoneCode();

public long getChannelDoneCode();

public long getAddressId();

public long getChannelCreateOrgId();

public long getPreferChannelId();

public long getMediumOpId();

public long getChannelCreateOpId();

public String getFaxNumber();

public String getAddressCode();

public String getChannelRegionId();

public long getUpContMedTypeId();

public String getPreferChannelName();

public String getAddressDetail();

public long getCustId();

public Timestamp getProtectExpDate();

public Timestamp getChannelDoneDate();

public String getAction();

public Timestamp getMediumExpireDate();

public String getContMedTypeName();

public Timestamp getProtectEffDate();

public Timestamp getChannelEffectiveDate();

public Timestamp getChannelExpireDate();

public String getChannelRemarks();

public Timestamp getChannelCreateDate();

public String getMediumRemarks();

public Timestamp getMediumDoneDate();

public int getPriority();

public long getMediumOrgId();

public long getChannelOrgId();

public Timestamp getMediumEffectiveDate();

public String getChannelState();

public long getCustContRelaId();

public long getMediumCreateOpId();

public String getContNumber();

public long getContMedTypeId();

public int getPerferType();

public String getMediumRegionId();

public int getIsNoDisturbing();

public long getChannelOpId();

public Timestamp getMediumCreateDate();

public String getPostalCode();

public String getMediumState();

public long getMediumCreateOrgId();

public int getPrior();

public String getEmailAddress();


public  void setMediumDoneCode(long value);

public  void setChannelDoneCode(long value);

public  void setAddressId(long value);

public  void setChannelCreateOrgId(long value);

public  void setPreferChannelId(long value);

public  void setMediumOpId(long value);

public  void setChannelCreateOpId(long value);

public  void setFaxNumber(String value);

public  void setAddressCode(String value);

public  void setChannelRegionId(String value);

public  void setUpContMedTypeId(long value);

public  void setPreferChannelName(String value);

public  void setAddressDetail(String value);

public  void setCustId(long value);

public  void setProtectExpDate(Timestamp value);

public  void setChannelDoneDate(Timestamp value);

public  void setAction(String value);

public  void setMediumExpireDate(Timestamp value);

public  void setContMedTypeName(String value);

public  void setProtectEffDate(Timestamp value);

public  void setChannelEffectiveDate(Timestamp value);

public  void setChannelExpireDate(Timestamp value);

public  void setChannelRemarks(String value);

public  void setChannelCreateDate(Timestamp value);

public  void setMediumRemarks(String value);

public  void setMediumDoneDate(Timestamp value);

public  void setPriority(int value);

public  void setMediumOrgId(long value);

public  void setChannelOrgId(long value);

public  void setMediumEffectiveDate(Timestamp value);

public  void setChannelState(String value);

public  void setCustContRelaId(long value);

public  void setMediumCreateOpId(long value);

public  void setContNumber(String value);

public  void setContMedTypeId(long value);

public  void setPerferType(int value);

public  void setMediumRegionId(String value);

public  void setIsNoDisturbing(int value);

public  void setChannelOpId(long value);

public  void setMediumCreateDate(Timestamp value);

public  void setPostalCode(String value);

public  void setMediumState(String value);

public  void setMediumCreateOrgId(long value);

public  void setPrior(int value);

public  void setEmailAddress(String value);
}
