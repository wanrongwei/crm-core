package com.asiainfo.crm.so.common.party.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOInsOttCustValue extends DataStructInterface{

  public final static  String S_ID = "ID";
  public final static  String S_State = "STATE";
  public final static  String S_AdminLevel = "ADMIN_LEVEL";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_LoginName = "LOGIN_NAME";
  public final static  String S_PhoneNumber = "PHONE_NUMBER";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Email = "EMAIL";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_Zip = "ZIP";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_CustomerAddress = "CUSTOMER_ADDRESS";
  public final static  String S_DealState = "DEAL_STATE";
  public final static  String S_CustomerName = "CUSTOMER_NAME";
  public final static  String S_Password = "PASSWORD";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_Domain = "DOMAIN";
  public final static  String S_PhoneCountryCode = "PHONE_COUNTRY_CODE";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_City = "CITY";
  public final static  String S_PhoneAreaCode = "PHONE_AREA_CODE";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_CustId = "CUST_ID";

public long getID();
  
public String getState();

public String getAdminLevel();

public Timestamp getDoneDate();

public String getLoginName();

public String getPhoneNumber();

public String getRemarks();

public Timestamp getCreateDate();

public String getExt1();

public long getDoneCode();

public String getEmail();

public long getOpId();

public String getRegionId();

public String getZip();

public long getUserId();

public String getCustomerAddress();

public long getDealState();

public String getCustomerName();

public String getPassword();

public long getOrgId();

public String getDomain();

public String getPhoneCountryCode();

public String getLastName();

public String getMiddleName();

public String getFirstName();

public String getCity();

public String getPhoneAreaCode();

public String getExt2();

public long getCustId();

public  void setID(long value);

public  void setState(String value);

public  void setAdminLevel(String value);

public  void setDoneDate(Timestamp value);

public  void setLoginName(String value);

public  void setPhoneNumber(String value);

public  void setRemarks(String value);

public  void setCreateDate(Timestamp value);

public  void setExt1(String value);

public  void setDoneCode(long value);

public  void setEmail(String value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setZip(String value);

public  void setUserId(long value);

public  void setCustomerAddress(String value);

public  void setDealState(long value);

public  void setCustomerName(String value);

public  void setPassword(String value);

public  void setOrgId(long value);

public  void setDomain(String value);

public  void setPhoneCountryCode(String value);

public  void setLastName(String value);

public  void setMiddleName(String value);

public  void setFirstName(String value);

public  void setCity(String value);

public  void setPhoneAreaCode(String value);

public  void setExt2(String value);

public  void setCustId(long value);
}
