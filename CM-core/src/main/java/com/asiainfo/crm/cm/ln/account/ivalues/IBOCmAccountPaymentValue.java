package com.asiainfo.crm.cm.ln.account.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmAccountPaymentValue extends DataStructInterface{

  public final static  String S_BankContract = "BANK_CONTRACT";
  public final static  String S_CycleDoneCode = "CYCLE_DONE_CODE";
  public final static  String S_BillCycleFlag = "BILL_CYCLE_FLAG";
  public final static  String S_CycleReason = "CYCLE_REASON";
  public final static  String S_CycleExpireDate = "CYCLE_EXPIRE_DATE";
  public final static  String S_AcctBehalfPhone = "ACCT_BEHALF_PHONE";
  public final static  String S_AcctCreateOpId = "ACCT_CREATE_OP_ID";
  public final static  String S_AcctName = "ACCT_NAME";
  public final static  String S_PayEffectiveDate = "PAY_EFFECTIVE_DATE";
  public final static  String S_CycleCreateOpId = "CYCLE_CREATE_OP_ID";
  public final static  String S_PayDoneDate = "PAY_DONE_DATE";
  public final static  String S_PaymentId = "PAYMENT_ID";
  public final static  String S_PayOpId = "PAY_OP_ID";
  public final static  String S_AcctCreateOrgId = "ACCT_CREATE_ORG_ID";
  public final static  String S_CycleOrgId = "CYCLE_ORG_ID";
  public final static  String S_AcctDoneDate = "ACCT_DONE_DATE";
  public final static  String S_AcctType = "ACCT_TYPE";
  public final static  String S_PaymentBankCode = "PAYMENT_BANK_CODE";
  public final static  String S_PayCreateDate = "PAY_CREATE_DATE";
  public final static  String S_AcctEffectiveDate = "ACCT_EFFECTIVE_DATE";
  public final static  String S_InstallmentFlag = "INSTALLMENT_FLAG";
  public final static  String S_PaymentAccount = "PAYMENT_ACCOUNT";
  public final static  String S_PaymentAccountName = "PAYMENT_ACCOUNT_NAME";
  public final static  String S_AcctCreateDate = "ACCT_CREATE_DATE";
  public final static  String S_PayCreateOrgId = "PAY_CREATE_ORG_ID";
  public final static  String S_AcctOrgId = "ACCT_ORG_ID";
  public final static  String S_BillDay = "BILL_DAY";
  public final static  String S_AcctDoneCode = "ACCT_DONE_CODE";
  public final static  String S_CycleCreateDate = "CYCLE_CREATE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CycleEffectiveDate = "CYCLE_EFFECTIVE_DATE";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_AcctOpId = "ACCT_OP_ID";
  public final static  String S_PayState = "PAY_STATE";
  public final static  String S_PayOrgId = "PAY_ORG_ID";
  public final static  String S_PayExpireDate = "PAY_EXPIRE_DATE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CycleOpId = "CYCLE_OP_ID";
  public final static  String S_AcctState = "ACCT_STATE";
  public final static  String S_AcctStatus = "ACCT_STATUS";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_CycleCreateOrgId = "CYCLE_CREATE_ORG_ID";
  public final static  String S_CycleDoneDate = "CYCLE_DONE_DATE";
  public final static  String S_CycleUnit = "CYCLE_UNIT";
  public final static  String S_PaymentAccountType = "PAYMENT_ACCOUNT_TYPE";
  public final static  String S_Priority = "PRIORITY";
  public final static  String S_PayCreateOpId = "PAY_CREATE_OP_ID";
  public final static  String S_CycleId = "CYCLE_ID";
  public final static  String S_CycleState = "CYCLE_STATE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CycleType = "CYCLE_TYPE";
  public final static  String S_UrgeStopFlag = "URGE_STOP_FLAG";
  public final static  String S_AcctPassword = "ACCT_PASSWORD";
  public final static  String S_PayDoneCode = "PAY_DONE_CODE";
  public final static  String S_AcctExpireDate = "ACCT_EXPIRE_DATE";
  public final static  String S_PayMethod = "PAY_METHOD";


public String getBankContract();

public long getCycleDoneCode();

public int getBillCycleFlag();

public String getCycleReason();

public Timestamp getCycleExpireDate();

public String getAcctBehalfPhone();

public long getAcctCreateOpId();

public String getAcctName();

public Timestamp getPayEffectiveDate();

public long getCycleCreateOpId();

public Timestamp getPayDoneDate();

public long getPaymentId();

public long getPayOpId();

public long getAcctCreateOrgId();

public long getCycleOrgId();

public Timestamp getAcctDoneDate();

public int getAcctType();

public String getPaymentBankCode();

public Timestamp getPayCreateDate();

public Timestamp getAcctEffectiveDate();

public int getInstallmentFlag();

public String getPaymentAccount();

public String getPaymentAccountName();

public Timestamp getAcctCreateDate();

public long getPayCreateOrgId();

public long getAcctOrgId();

public int getBillDay();

public long getAcctDoneCode();

public Timestamp getCycleCreateDate();

public String getRemarks();

public Timestamp getCycleEffectiveDate();

public long getCreditValue();

public long getAcctOpId();

public String getPayState();

public long getPayOrgId();

public Timestamp getPayExpireDate();

public long getCustId();

public long getAcctId();

public long getCycleOpId();

public String getAcctState();

public int getAcctStatus();

public int getCreditLevel();

public long getCycleCreateOrgId();

public Timestamp getCycleDoneDate();

public int getCycleUnit();

public int getPaymentAccountType();

public int getPriority();

public long getPayCreateOpId();

public long getCycleId();

public String getCycleState();

public String getRegionId();

public int getCycleType();

public String getUrgeStopFlag();

public String getAcctPassword();

public long getPayDoneCode();

public Timestamp getAcctExpireDate();

public int getPayMethod();


public  void setBankContract(String value);

public  void setCycleDoneCode(long value);

public  void setBillCycleFlag(int value);

public  void setCycleReason(String value);

public  void setCycleExpireDate(Timestamp value);

public  void setAcctBehalfPhone(String value);

public  void setAcctCreateOpId(long value);

public  void setAcctName(String value);

public  void setPayEffectiveDate(Timestamp value);

public  void setCycleCreateOpId(long value);

public  void setPayDoneDate(Timestamp value);

public  void setPaymentId(long value);

public  void setPayOpId(long value);

public  void setAcctCreateOrgId(long value);

public  void setCycleOrgId(long value);

public  void setAcctDoneDate(Timestamp value);

public  void setAcctType(int value);

public  void setPaymentBankCode(String value);

public  void setPayCreateDate(Timestamp value);

public  void setAcctEffectiveDate(Timestamp value);

public  void setInstallmentFlag(int value);

public  void setPaymentAccount(String value);

public  void setPaymentAccountName(String value);

public  void setAcctCreateDate(Timestamp value);

public  void setPayCreateOrgId(long value);

public  void setAcctOrgId(long value);

public  void setBillDay(int value);

public  void setAcctDoneCode(long value);

public  void setCycleCreateDate(Timestamp value);

public  void setRemarks(String value);

public  void setCycleEffectiveDate(Timestamp value);

public  void setCreditValue(long value);

public  void setAcctOpId(long value);

public  void setPayState(String value);

public  void setPayOrgId(long value);

public  void setPayExpireDate(Timestamp value);

public  void setCustId(long value);

public  void setAcctId(long value);

public  void setCycleOpId(long value);

public  void setAcctState(String value);

public  void setAcctStatus(int value);

public  void setCreditLevel(int value);

public  void setCycleCreateOrgId(long value);

public  void setCycleDoneDate(Timestamp value);

public  void setCycleUnit(int value);

public  void setPaymentAccountType(int value);

public  void setPriority(int value);

public  void setPayCreateOpId(long value);

public  void setCycleId(long value);

public  void setCycleState(String value);

public  void setRegionId(String value);

public  void setCycleType(int value);

public  void setUrgeStopFlag(String value);

public  void setAcctPassword(String value);

public  void setPayDoneCode(long value);

public  void setAcctExpireDate(Timestamp value);

public  void setPayMethod(int value);
}
