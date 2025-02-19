package com.asiainfo.crm.so.order.rboss.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOOrdOttWimpValue extends DataStructInterface{

  public final static  String S_OpId = "OP_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_UserNameType = "USER_NAME_TYPE";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ProductType = "PRODUCT_TYPE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_UserName = "USER_NAME";
  public final static  String S_ActiveDate = "ACTIVE_DATE";
  public final static  String S_ActiveState = "ACTIVE_STATE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_Email = "EMAIL";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Msisdn = "MSISDN";
  public final static  String S_OrdOttWimpId = "ORD_OTT_WIMP_ID";


public long getOpId();

public long getUserId();

public String getUserNameType();

public String getCustType();

public long getOrgId();

public String getRegionId();

public String getProductType();

public long getCustId();

public String getUserName();

public Timestamp getActiveDate();

public String getActiveState();

public String getBillId();

public String getEmail();

public Timestamp getCreateDate();

public String getMsisdn();

public long getOrdOttWimpId();


public  void setOpId(long value);

public  void setUserId(long value);

public  void setUserNameType(String value);

public  void setCustType(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setProductType(String value);

public  void setCustId(long value);

public  void setUserName(String value);

public  void setActiveDate(Timestamp value);

public  void setActiveState(String value);

public  void setBillId(String value);

public  void setEmail(String value);

public  void setCreateDate(Timestamp value);

public  void setMsisdn(String value);

public  void setOrdOttWimpId(long value);
}
