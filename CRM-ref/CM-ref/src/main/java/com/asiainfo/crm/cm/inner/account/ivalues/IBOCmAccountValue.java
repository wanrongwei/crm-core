package com.asiainfo.crm.cm.inner.account.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmAccountValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_BillCycleFlag = "BILL_CYCLE_FLAG";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_AcctType = "ACCT_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_AcctBehalfPhone = "ACCT_BEHALF_PHONE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_AcctName = "ACCT_NAME";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_InstallmentFlag = "INSTALLMENT_FLAG";
  public final static  String S_UrgeStopFlag = "URGE_STOP_FLAG";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_AcctPassword = "ACCT_PASSWORD";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_AcctStatus = "ACCT_STATUS";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";


public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getState();

public String getRemarks();

public long getBillCycleFlag();

public long getCreditValue();

public long getAcctType();

public long getOrgId();

public String getAcctBehalfPhone();

public String getRegionId();

public String getAcctName();

public long getCreateOrgId();

public long getInstallmentFlag();

public String getUrgeStopFlag();

public long getAcctId();

public long getCustId();

public String getAcctPassword();

public long getCreateOpId();

public Timestamp getDoneDate();

public long getDoneCode();

public Timestamp getCreateDate();

public long getAcctStatus();

public long getCreditLevel();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setBillCycleFlag(long value);

public  void setCreditValue(long value);

public  void setAcctType(long value);

public  void setOrgId(long value);

public  void setAcctBehalfPhone(String value);

public  void setRegionId(String value);

public  void setAcctName(String value);

public  void setCreateOrgId(long value);

public  void setInstallmentFlag(long value);

public  void setUrgeStopFlag(String value);

public  void setAcctId(long value);

public  void setCustId(long value);

public  void setAcctPassword(String value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setDoneCode(long value);

public  void setCreateDate(Timestamp value);

public  void setAcctStatus(long value);

public  void setCreditLevel(long value);
}
