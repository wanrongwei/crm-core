package com.asiainfo.crm.cm.customer.account.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxGroupAccountValue extends DataStructInterface{

  public final static  String S_DeptId = "DEPT_ID";
  public final static  String S_State = "STATE";
  public final static  String S_IsPrepaytag = "IS_PREPAYTAG";
  public final static  String S_ContName = "CONT_NAME";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_PayCycle = "PAY_CYCLE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_IsSendBill = "IS_SEND_BILL";
  public final static  String S_IsSendMessage = "IS_SEND_MESSAGE";
  public final static  String S_ContCertType = "CONT_CERT_TYPE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_AcctRealType = "ACCT_REAL_TYPE";
  public final static  String S_AccAliasName = "ACC_ALIAS_NAME";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_AcctType = "ACCT_TYPE";
  public final static  String S_CreditTerm = "CREDIT_TERM";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_AcctBusiType = "ACCT_BUSI_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_NoticeFlag = "NOTICE_FLAG";
  public final static  String S_ContCertCode = "CONT_CERT_CODE";


public long getDeptId();

public String getState();

public int getIsPrepaytag();

public String getContName();

public long getCreditValue();

public String getContMobile();

public long getAcctId();

public long getCreateOpId();

public int getPayCycle();

public long getDoneCode();

public int getIsSendBill();

public int getIsSendMessage();

public int getContCertType();

public String getNotes();

public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public int getAcctRealType();

public String getAccAliasName();

public long getGroupCustId();

public int getAcctType();

public int getCreditTerm();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public String getCountyId();

public Timestamp getDoneDate();

public int getAcctBusiType();

public Timestamp getCreateDate();

public int getNoticeFlag();

public String getContCertCode();


public  void setDeptId(long value);

public  void setState(String value);

public  void setIsPrepaytag(int value);

public  void setContName(String value);

public  void setCreditValue(long value);

public  void setContMobile(String value);

public  void setAcctId(long value);

public  void setCreateOpId(long value);

public  void setPayCycle(int value);

public  void setDoneCode(long value);

public  void setIsSendBill(int value);

public  void setIsSendMessage(int value);

public  void setContCertType(int value);

public  void setNotes(String value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setAcctRealType(int value);

public  void setAccAliasName(String value);

public  void setGroupCustId(long value);

public  void setAcctType(int value);

public  void setCreditTerm(int value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCountyId(String value);

public  void setDoneDate(Timestamp value);

public  void setAcctBusiType(int value);

public  void setCreateDate(Timestamp value);

public  void setNoticeFlag(int value);

public  void setContCertCode(String value);
}
