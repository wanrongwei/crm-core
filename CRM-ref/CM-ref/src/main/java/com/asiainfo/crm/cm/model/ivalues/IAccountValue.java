package com.asiainfo.crm.cm.model.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IAccountValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_BillCycleFlag = "BILL_CYCLE_FLAG";
  public final static  String S_BillCycleFlagDesc = "BILL_CYCLE_FLAG_DESC";
  public final static  String S_AcctStatusDesc = "ACCT_STATUS_DESC";
  public final static  String S_AcctPayMethodText = "ACCT_PAY_METHOD_TEXT";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_AcctBehalfPhone = "ACCT_BEHALF_PHONE";
  public final static  String S_AcctAliasName = "ACCT_ALIAS_NAME";
  public final static  String S_AcctName = "ACCT_NAME";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_CustTypeDesc = "CUST_TYPE_DESC";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_CustCertCode = "CUST_CERT_CODE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_AcctStatus = "ACCT_STATUS";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_AcctTypeDesc = "ACCT_TYPE_DESC";
  public final static  String S_RelType = "REL_TYPE";
  public final static  String S_RelCustId = "REL_CUST_ID";
  public final static  String S_AcctType = "ACCT_TYPE";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_RelTypeDesc = "REL_TYPE_DESC";
  public final static  String S_InstallmentFlag = "INSTALLMENT_FLAG";
  public final static  String S_CreditLevelDesc = "CREDIT_LEVEL_DESC";
  public final static  String S_UrgeStopFlag = "URGE_STOP_FLAG";
  public final static  String S_AcctPassword = "ACCT_PASSWORD";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_UrgeStopFlagDesc = "URGE_STOP_FLAG_DESC";
  public final static  String S_CreateDate = "CREATE_DATE";


public String getState();

public String getRemarks();

public int getBillCycleFlag();

public String getBillCycleFlagDesc();

public String getAcctStatusDesc();

public String getAcctPayMethodText();

public long getCreditValue();

public String getAcctBehalfPhone();

public String getAcctAliasName();

public String getAcctName();

public String getFirstName();

public String getCustTypeDesc();

public long getAcctId();

public long getCustId();

public long getCreateOpId();

public String getCustCertCode();

public long getDoneCode();

public int getAcctStatus();

public int getCreditLevel();

public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getAcctTypeDesc();

public int getRelType();

public long getRelCustId();

public int getAcctType();

public int getCustType();

public String getLastName();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public String getCustName();

public String getRelTypeDesc();

public int getInstallmentFlag();

public String getCreditLevelDesc();

public String getUrgeStopFlag();

public String getAcctPassword();

public Timestamp getDoneDate();

public String getUrgeStopFlagDesc();

public Timestamp getCreateDate();


public  void setState(String value);

public  void setRemarks(String value);

public  void setBillCycleFlag(int value);

public  void setBillCycleFlagDesc(String value);

public  void setAcctStatusDesc(String value);

public  void setAcctPayMethodText(String value);

public  void setCreditValue(long value);

public  void setAcctBehalfPhone(String value);

public  void setAcctAliasName(String value);

public  void setAcctName(String value);

public  void setFirstName(String value);

public  void setCustTypeDesc(String value);

public  void setAcctId(long value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setCustCertCode(String value);

public  void setDoneCode(long value);

public  void setAcctStatus(int value);

public  void setCreditLevel(int value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setAcctTypeDesc(String value);

public  void setRelType(int value);

public  void setRelCustId(long value);

public  void setAcctType(int value);

public  void setCustType(int value);

public  void setLastName(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCustName(String value);

public  void setRelTypeDesc(String value);

public  void setInstallmentFlag(int value);

public  void setCreditLevelDesc(String value);

public  void setUrgeStopFlag(String value);

public  void setAcctPassword(String value);

public  void setDoneDate(Timestamp value);

public  void setUrgeStopFlagDesc(String value);

public  void setCreateDate(Timestamp value);
}
