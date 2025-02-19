package com.asiainfo.crm.cm.inner.contact.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmContactContMedAndMedTypeValue extends DataStructInterface{

  public final static  String S_AddressId = "ADDRESS_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ContRelaId = "CONT_RELA_ID";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_FaxNumber = "FAX_NUMBER";
  public final static  String S_AddressCode = "ADDRESS_CODE";
  public final static  String S_UpContMedTypeId = "UP_CONT_MED_TYPE_ID";
  public final static  String S_AddressDetail = "ADDRESS_DETAIL";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ProtectExpDate = "PROTECT_EXP_DATE";
  public final static  String S_UseType = "USE_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ContMedTypeName = "CONT_MED_TYPE_NAME";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_ProtectEffDate = "PROTECT_EFF_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_Priority = "PRIORITY";
  public final static  String S_ContNumber = "CONT_NUMBER";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ContMedTypeId = "CONT_MED_TYPE_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_IsNoDisturbing = "IS_NO_DISTURBING";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_PostalCode = "POSTAL_CODE";
  public final static  String S_EmailAddress = "EMAIL_ADDRESS";


public long getAddressId();

public String getState();

public String getRemarks();

public long getContRelaId();

public long getContId();

public String getFaxNumber();

public String getAddressCode();

public long getUpContMedTypeId();

public String getAddressDetail();

public long getCreateOpId();

public Timestamp getProtectExpDate();

public int getUseType();

public long getDoneCode();

public String getContMedTypeName();

public Timestamp getExpireDate();

public Timestamp getProtectEffDate();

public Timestamp getEffectiveDate();

public long getOpId();

public int getPriority();

public String getContNumber();

public long getOrgId();

public long getCreateOrgId();

public long getContMedTypeId();

public String getRegionId();

public int getIsNoDisturbing();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public String getPostalCode();

public String getEmailAddress();


public  void setAddressId(long value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setContRelaId(long value);

public  void setContId(long value);

public  void setFaxNumber(String value);

public  void setAddressCode(String value);

public  void setUpContMedTypeId(long value);

public  void setAddressDetail(String value);

public  void setCreateOpId(long value);

public  void setProtectExpDate(Timestamp value);

public  void setUseType(int value);

public  void setDoneCode(long value);

public  void setContMedTypeName(String value);

public  void setExpireDate(Timestamp value);

public  void setProtectEffDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setPriority(int value);

public  void setContNumber(String value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setContMedTypeId(long value);

public  void setRegionId(String value);

public  void setIsNoDisturbing(int value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setPostalCode(String value);

public  void setEmailAddress(String value);
}
