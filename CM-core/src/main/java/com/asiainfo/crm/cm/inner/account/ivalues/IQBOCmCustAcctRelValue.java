package com.asiainfo.crm.cm.inner.account.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmCustAcctRelValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_BillCycleFlag = "BILL_CYCLE_FLAG";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_AcctBehalfPhone = "ACCT_BEHALF_PHONE";
  public final static  String S_AcctAliasName = "ACCT_ALIAS_NAME";
  public final static  String S_AcctName = "ACCT_NAME";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_AcctStatus = "ACCT_STATUS";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RelCustId = "REL_CUST_ID";
  public final static  String S_RelType = "REL_TYPE";
  public final static  String S_AcctType = "ACCT_TYPE";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_UrgeStopFlag = "URGE_STOP_FLAG";
  public final static  String S_AcctPassword = "ACCT_PASSWORD";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";


public String getState();

public long getBillCycleFlag();

public String getRemarks();

public long getCreditValue();

public String getAcctBehalfPhone();

public String getAcctAliasName();

public String getAcctName();

public long getAcctId();

public long getCustId();

public long getCreateOpId();

public long getDoneCode();

public long getAcctStatus();

public long getCreditLevel();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public long getRelCustId();

public long getRelType();

public long getAcctType();

public long getCustType();

public long getOrgId();

public long getCreateOrgId();

public String getRegionId();

public String getUrgeStopFlag();

public String getAcctPassword();

public Timestamp getDoneDate();

public Timestamp getCreateDate();


public  void setState(String value);

public  void setBillCycleFlag(long value);

public  void setRemarks(String value);

public  void setCreditValue(long value);

public  void setAcctBehalfPhone(String value);

public  void setAcctAliasName(String value);

public  void setAcctName(String value);

public  void setAcctId(long value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setDoneCode(long value);

public  void setAcctStatus(long value);

public  void setCreditLevel(long value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setRelCustId(long value);

public  void setRelType(long value);

public  void setAcctType(long value);

public  void setCustType(long value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setRegionId(String value);

public  void setUrgeStopFlag(String value);

public  void setAcctPassword(String value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);
}
