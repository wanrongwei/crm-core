package com.asiainfo.crm.cm.model.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IAcctPaymentValue extends DataStructInterface{

  public final static  String S_BankContract = "BANK_CONTRACT";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PaymentAccountExpireDate = "PAYMENT_ACCOUNT_EXPIRE_DATE";
  public final static  String S_PaymentAccountTypeDesc = "PAYMENT_ACCOUNT_TYPE_DESC";
  public final static  String S_PaymentBankName = "PAYMENT_BANK_NAME";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_PaymentId = "PAYMENT_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_PayMethodDesc = "PAY_METHOD_DESC";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_PaymentAccountType = "PAYMENT_ACCOUNT_TYPE";
  public final static  String S_Priority = "PRIORITY";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_PaymentBankCode = "PAYMENT_BANK_CODE";
  public final static  String S_PaymentAccount = "PAYMENT_ACCOUNT";
  public final static  String S_PaymentAccountName = "PAYMENT_ACCOUNT_NAME";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_PayMethod = "PAY_METHOD";


public String getBankContract();

public String getState();

public String getRemarks();

public Timestamp getPaymentAccountExpireDate();

public String getPaymentAccountTypeDesc();

public String getPaymentBankName();

public long getAcctId();

public long getCreateOpId();

public long getPaymentId();

public long getDoneCode();

public String getPayMethodDesc();

public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public int getPaymentAccountType();

public int getPriority();

public long getOrgId();

public long getCreateOrgId();

public String getRegionId();

public String getPaymentBankCode();

public String getPaymentAccount();

public String getPaymentAccountName();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public int getPayMethod();


public  void setBankContract(String value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setPaymentAccountExpireDate(Timestamp value);

public  void setPaymentAccountTypeDesc(String value);

public  void setPaymentBankName(String value);

public  void setAcctId(long value);

public  void setCreateOpId(long value);

public  void setPaymentId(long value);

public  void setDoneCode(long value);

public  void setPayMethodDesc(String value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setPaymentAccountType(int value);

public  void setPriority(int value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setRegionId(String value);

public  void setPaymentBankCode(String value);

public  void setPaymentAccount(String value);

public  void setPaymentAccountName(String value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setPayMethod(int value);
}
