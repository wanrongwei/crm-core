package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOAccountValue extends DataStructInterface{

  public final static  String S_PayPhone = "PAY_PHONE";
  public final static  String S_BankContract = "BANK_CONTRACT";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_AcctServiceId = "ACCT_SERVICE_ID";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_StopRemind = "STOP_REMIND";
  public final static  String S_AcctName = "ACCT_NAME";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_PaymentId = "PAYMENT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ContZipcode = "CONT_ZIPCODE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_AcctStatus = "ACCT_STATUS";
  public final static  String S_CollectionRemind = "COLLECTION_REMIND";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_AcctSubType = "ACCT_SUB_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_PaymentAccountType = "PAYMENT_ACCOUNT_TYPE";
  public final static  String S_Priority = "PRIORITY";
  public final static  String S_MainPhone = "MAIN_PHONE";
  public final static  String S_SmallAcctBankNum = "SMALL_ACCT_BANK_NUM";
  public final static  String S_AcctType = "ACCT_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_PaymentBankCode = "PAYMENT_BANK_CODE";
  public final static  String S_PaymentAccount = "PAYMENT_ACCOUNT";
  public final static  String S_PaymentAccountName = "PAYMENT_ACCOUNT_NAME";
  public final static  String S_UrgeStopFlag = "URGE_STOP_FLAG";
  public final static  String S_AcctPassword = "ACCT_PASSWORD";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_PayRemind = "PAY_REMIND";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_PayMethod = "PAY_METHOD";


public String getPayPhone();

public String getBankContract();

public String getState();

public String getRemarks();

public String getAcctServiceId();

public long getCreditValue();

public String getStopRemind();

public String getAcctName();

public long getAcctId();

public long getCustId();

public long getPaymentId();

public long getCreateOpId();

public long getContZipcode();

public long getDoneCode();

public long getAcctStatus();

public String getCollectionRemind();

public long getCreditLevel();

public long getAcctSubType();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getContAddress();

public long getPaymentAccountType();

public long getPriority();

public String getMainPhone();

public long getSmallAcctBankNum();

public long getAcctType();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public String getPaymentBankCode();

public String getPaymentAccount();

public String getPaymentAccountName();

public String getUrgeStopFlag();

public String getAcctPassword();

public Timestamp getDoneDate();

public String getPayRemind();

public Timestamp getCreateDate();

public long getPayMethod();


public  void setPayPhone(String value);

public  void setBankContract(String value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setAcctServiceId(String value);

public  void setCreditValue(long value);

public  void setStopRemind(String value);

public  void setAcctName(String value);

public  void setAcctId(long value);

public  void setCustId(long value);

public  void setPaymentId(long value);

public  void setCreateOpId(long value);

public  void setContZipcode(long value);

public  void setDoneCode(long value);

public  void setAcctStatus(long value);

public  void setCollectionRemind(String value);

public  void setCreditLevel(long value);

public  void setAcctSubType(long value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setContAddress(String value);

public  void setPaymentAccountType(long value);

public  void setPriority(long value);

public  void setMainPhone(String value);

public  void setSmallAcctBankNum(long value);

public  void setAcctType(long value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setPaymentBankCode(String value);

public  void setPaymentAccount(String value);

public  void setPaymentAccountName(String value);

public  void setUrgeStopFlag(String value);

public  void setAcctPassword(String value);

public  void setDoneDate(Timestamp value);

public  void setPayRemind(String value);

public  void setCreateDate(Timestamp value);

public  void setPayMethod(long value);
}
