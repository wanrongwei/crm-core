package com.asiainfo.crm.cm.ln.account.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxAcctBankRelValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_Actiondate = "ACTIONDATE";
  public final static  String S_BankAccount = "BANK_ACCOUNT";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_BusiCode = "BUSI_CODE";
  public final static  String S_AccountExpireDate = "ACCOUNT_EXPIRE_DATE";
  public final static  String S_PfSeq = "PF_SEQ";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RelId = "REL_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_Credit = "CREDIT";
  public final static  String S_IdCard = "ID_CARD";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BankCode = "BANK_CODE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_PayMethod = "PAY_METHOD";
  public final static  String S_BankAccountType = "BANK_ACCOUNT_TYPE";


public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getState();

public String getActiondate();

public String getBankAccount();

public String getRemarks();

public long getBusiCode();

public String getAccountExpireDate();

public String getPfSeq();

public long getOrgId();

public long getRelId();

public long getCreateOrgId();

public String getCredit();

public String getIdCard();

public long getAcctId();

public long getCreateOpId();

public Timestamp getDoneDate();

public String getBankCode();

public String getBillId();

public Timestamp getCreateDate();

public long getDoneCode();

public int getPayMethod();

public int getBankAccountType();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setActiondate(String value);

public  void setBankAccount(String value);

public  void setRemarks(String value);

public  void setBusiCode(long value);

public  void setAccountExpireDate(String value);

public  void setPfSeq(String value);

public  void setOrgId(long value);

public  void setRelId(long value);

public  void setCreateOrgId(long value);

public  void setCredit(String value);

public  void setIdCard(String value);

public  void setAcctId(long value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setBankCode(String value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setPayMethod(int value);

public  void setBankAccountType(int value);
}
