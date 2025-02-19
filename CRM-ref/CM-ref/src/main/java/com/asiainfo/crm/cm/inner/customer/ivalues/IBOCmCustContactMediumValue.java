package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCustContactMediumValue extends DataStructInterface{

  public final static  String S_AddressId = "ADDRESS_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_FaxNumber = "FAX_NUMBER";
  public final static  String S_AddressCode = "ADDRESS_CODE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_AddressDetail = "ADDRESS_DETAIL";
  public final static  String S_ProtectExpDate = "PROTECT_EXP_DATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ContactPerson = "CONTACT_PERSON";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ProtectEffDate = "PROTECT_EFF_DATE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_Priority = "PRIORITY";
  public final static  String S_CustContRelaId = "CUST_CONT_RELA_ID";
  public final static  String S_ContNumber = "CONT_NUMBER";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ContMedTypeId = "CONT_MED_TYPE_ID";
  public final static  String S_IsNoDisturbing = "IS_NO_DISTURBING";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Ext5 = "EXT5";
  public final static  String S_Ext6 = "EXT6";
  public final static  String S_PostalCode = "POSTAL_CODE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_EmailAddress = "EMAIL_ADDRESS";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_Ext4 = "EXT4";


public long getAddressId();

public String getState();

public String getRemarks();

public String getFaxNumber();

public String getAddressCode();

public long getCustId();

public String getAddressDetail();

public Timestamp getProtectExpDate();

public long getCreateOpId();

public String getContactPerson();

public long getDoneCode();

public Timestamp getProtectEffDate();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public long getPriority();

public long getCustContRelaId();

public String getContNumber();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public long getContMedTypeId();

public long getIsNoDisturbing();

public Timestamp getDoneDate();

public String getExt5();

public String getExt6();

public String getPostalCode();

public Timestamp getCreateDate();

public String getExt1();

public String getExt2();

public String getEmailAddress();

public String getExt3();

public String getExt4();


public  void setAddressId(long value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setFaxNumber(String value);

public  void setAddressCode(String value);

public  void setCustId(long value);

public  void setAddressDetail(String value);

public  void setProtectExpDate(Timestamp value);

public  void setCreateOpId(long value);

public  void setContactPerson(String value);

public  void setDoneCode(long value);

public  void setProtectEffDate(Timestamp value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setPriority(long value);

public  void setCustContRelaId(long value);

public  void setContNumber(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setContMedTypeId(long value);

public  void setIsNoDisturbing(long value);

public  void setDoneDate(Timestamp value);

public  void setExt5(String value);

public  void setExt6(String value);

public  void setPostalCode(String value);

public  void setCreateDate(Timestamp value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setEmailAddress(String value);

public  void setExt3(String value);

public  void setExt4(String value);
}
