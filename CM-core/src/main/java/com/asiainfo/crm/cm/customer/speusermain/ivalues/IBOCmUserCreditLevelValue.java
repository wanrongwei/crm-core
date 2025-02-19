package com.asiainfo.crm.cm.customer.speusermain.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmUserCreditLevelValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_ArrearsFlag = "ARREARS_FLAG";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_LastCreditLevel = "LAST_CREDIT_LEVEL";
  public final static  String S_TempId = "TEMP_ID";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";


public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getState();

public int getArrearsFlag();

public String getCityId();

public String getRemarks();

public int getCreditValue();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public String getCustName();

public int getLastCreditLevel();

public long getTempId();

public long getAcctId();

public long getCreateOpId();

public Timestamp getDoneDate();

public String getBillId();

public Timestamp getCreateDate();

public long getDoneCode();

public int getCreditLevel();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setArrearsFlag(int value);

public  void setCityId(String value);

public  void setRemarks(String value);

public  void setCreditValue(int value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCustName(String value);

public  void setLastCreditLevel(int value);

public  void setTempId(long value);

public  void setAcctId(long value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setCreditLevel(int value);
}
