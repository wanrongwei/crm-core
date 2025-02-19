package com.asiainfo.crm.cm.inner.account.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmAcctPaymentValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_PaymentAccountType = "PAYMENT_ACCOUNT_TYPE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_PaymentBankCode = "PAYMENT_BANK_CODE";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_Priority = "PRIORITY";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_BankContract = "BANK_CONTRACT";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_PaymentAccountExpireDate = "PAYMENT_ACCOUNT_EXPIRE_DATE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_PaymentAccount = "PAYMENT_ACCOUNT";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_PaymentAccountName = "PAYMENT_ACCOUNT_NAME";
  public final static  String S_PayMethod = "PAY_METHOD";
  public final static  String S_PaymentId = "PAYMENT_ID";


public String getState();

public long getCreateOpId();

public Timestamp getEffectiveDate();

public int getPaymentAccountType();

public Timestamp getDoneDate();

public String getPaymentBankCode();

public long getAcctId();

public int getPriority();

public String getRemarks();

public String getBankContract();

public long getOrgId();

public Timestamp getCreateDate();

public long getDoneCode();

public Timestamp getPaymentAccountExpireDate();

public String getRegionId();

public Timestamp getExpireDate();

public long getOpId();

public String getPaymentAccount();

public long getCreateOrgId();

public String getPaymentAccountName();

public int getPayMethod();

public long getPaymentId();


public  void setState(String value);

public  void setCreateOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setPaymentAccountType(int value);

public  void setDoneDate(Timestamp value);

public  void setPaymentBankCode(String value);

public  void setAcctId(long value);

public  void setPriority(int value);

public  void setRemarks(String value);

public  void setBankContract(String value);

public  void setOrgId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setPaymentAccountExpireDate(Timestamp value);

public  void setRegionId(String value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setPaymentAccount(String value);

public  void setCreateOrgId(long value);

public  void setPaymentAccountName(String value);

public  void setPayMethod(int value);

public  void setPaymentId(long value);
}
