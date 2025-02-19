package com.asiainfo.crm.cm.model.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IAcctBillCustomizeValue extends DataStructInterface{

  public final static  String S_MailType = "MAIL_TYPE";
  public final static  String S_State = "STATE";
  public final static  String S_MailTypeDesc = "MAIL_TYPE_DESC";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_Recipients = "RECIPIENTS";
  public final static  String S_MailProjects = "MAIL_PROJECTS";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ContZipcode = "CONT_ZIPCODE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_BillType = "BILL_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CustomizeId = "CUSTOMIZE_ID";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_MailDate = "MAIL_DATE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_BillPattern = "BILL_PATTERN";
  public final static  String S_BillTypeDesc = "BILL_TYPE_DESC";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ContFax = "CONT_FAX";


public String getMailType();

public String getState();

public String getMailTypeDesc();

public String getRemarks();

public String getRecipients();

public String getMailProjects();

public String getContMobile();

public long getAcctId();

public long getCustId();

public long getCreateOpId();

public String getContZipcode();

public long getDoneCode();

public int getBillType();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public long getCustomizeId();

public String getContAddress();

public long getUserId();

public String getContEmail();

public int getMailDate();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public int getBillPattern();

public String getBillTypeDesc();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public String getContFax();


public  void setMailType(String value);

public  void setState(String value);

public  void setMailTypeDesc(String value);

public  void setRemarks(String value);

public  void setRecipients(String value);

public  void setMailProjects(String value);

public  void setContMobile(String value);

public  void setAcctId(long value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setContZipcode(String value);

public  void setDoneCode(long value);

public  void setBillType(int value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setCustomizeId(long value);

public  void setContAddress(String value);

public  void setUserId(long value);

public  void setContEmail(String value);

public  void setMailDate(int value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setBillPattern(int value);

public  void setBillTypeDesc(String value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setContFax(String value);
}
