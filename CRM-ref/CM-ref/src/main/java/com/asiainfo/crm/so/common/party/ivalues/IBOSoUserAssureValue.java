package com.asiainfo.crm.so.common.party.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOSoUserAssureValue extends DataStructInterface{

  public final static  String S_AssureId = "ASSURE_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_PhoneNum = "PHONE_NUM";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_AsName = "AS_NAME";
  public final static  String S_AsAddress = "AS_ADDRESS";
  public final static  String S_CustomerOrderId = "CUSTOMER_ORDER_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Email = "EMAIL";
  public final static  String S_OfferInstId = "OFFER_INST_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_AsCustId = "AS_CUST_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_PostCode = "POST_CODE";
  public final static  String S_ValidDate = "VALID_DATE";
  public final static  String S_AssureItem = "ASSURE_ITEM";
  public final static  String S_AsCertCode = "AS_CERT_CODE";
  public final static  String S_AssureMode = "ASSURE_MODE";
  public final static  String S_AsAcctId = "AS_ACCT_ID";
  public final static  String S_CheckPerson = "CHECK_PERSON";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_BusinessId = "BUSINESS_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_AssureType = "ASSURE_TYPE";
  public final static  String S_AsUserId = "AS_USER_ID";
  public final static  String S_AsCertType = "AS_CERT_TYPE";


public long getAssureId();

public Timestamp getDoneDate();

public String getPhoneNum();

public String getRemarks();

public String getAsName();

public String getAsAddress();

public long getCustomerOrderId();

public Timestamp getCreateDate();

public long getDoneCode();

public String getEmail();

public long getOfferInstId();

public long getOpId();

public String getRegionId();

public long getAsCustId();

public long getUserId();

public int getPostCode();

public Timestamp getValidDate();

public long getAssureItem();

public String getAsCertCode();

public int getAssureMode();

public long getAsAcctId();

public String getCheckPerson();

public long getOrgId();

public long getBusinessId();

public Timestamp getExpireDate();

public int getAssureType();

public long getAsUserId();

public int getAsCertType();


public  void setAssureId(long value);

public  void setDoneDate(Timestamp value);

public  void setPhoneNum(String value);

public  void setRemarks(String value);

public  void setAsName(String value);

public  void setAsAddress(String value);

public  void setCustomerOrderId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setEmail(String value);

public  void setOfferInstId(long value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setAsCustId(long value);

public  void setUserId(long value);

public  void setPostCode(int value);

public  void setValidDate(Timestamp value);

public  void setAssureItem(long value);

public  void setAsCertCode(String value);

public  void setAssureMode(int value);

public  void setAsAcctId(long value);

public  void setCheckPerson(String value);

public  void setOrgId(long value);

public  void setBusinessId(long value);

public  void setExpireDate(Timestamp value);

public  void setAssureType(int value);

public  void setAsUserId(long value);

public  void setAsCertType(int value);
}
