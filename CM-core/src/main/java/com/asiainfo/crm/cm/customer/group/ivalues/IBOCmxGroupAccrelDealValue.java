package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxGroupAccrelDealValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_DealType = "DEAL_TYPE";
  public final static  String S_DoneNotes = "DONE_NOTES";
  public final static  String S_AcctCountyId = "ACCT_COUNTY_ID";
  public final static  String S_AcctRegionId = "ACCT_REGION_ID";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_GroupName = "GROUP_NAME";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_DealNotes = "DEAL_NOTES";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_SendDate = "SEND_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_DealId = "DEAL_ID";
  public final static  String S_ManagerName = "MANAGER_NAME";
  public final static  String S_FirstDate = "FIRST_DATE";
  public final static  String S_DealStatus = "DEAL_STATUS";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_OfficePhone = "OFFICE_PHONE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ManagerId = "MANAGER_ID";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";


public String getState();

public int getDealType();

public String getDoneNotes();

public String getAcctCountyId();

public String getAcctRegionId();

public long getAcctId();

public long getCreateOpId();

public String getGroupName();

public long getDoneCode();

public String getNotes();

public String getDealNotes();

public Timestamp getExpireDate();

public Timestamp getSendDate();

public Timestamp getEffectiveDate();

public long getOpId();

public long getDealId();

public String getManagerName();

public Timestamp getFirstDate();

public int getDealStatus();

public long getGroupCustId();

public String getOfficePhone();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public long getManagerId();

public String getCountyId();

public Timestamp getDoneDate();

public String getBillId();

public Timestamp getCreateDate();


public  void setState(String value);

public  void setDealType(int value);

public  void setDoneNotes(String value);

public  void setAcctCountyId(String value);

public  void setAcctRegionId(String value);

public  void setAcctId(long value);

public  void setCreateOpId(long value);

public  void setGroupName(String value);

public  void setDoneCode(long value);

public  void setNotes(String value);

public  void setDealNotes(String value);

public  void setExpireDate(Timestamp value);

public  void setSendDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setDealId(long value);

public  void setManagerName(String value);

public  void setFirstDate(Timestamp value);

public  void setDealStatus(int value);

public  void setGroupCustId(long value);

public  void setOfficePhone(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setManagerId(long value);

public  void setCountyId(String value);

public  void setDoneDate(Timestamp value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);
}
