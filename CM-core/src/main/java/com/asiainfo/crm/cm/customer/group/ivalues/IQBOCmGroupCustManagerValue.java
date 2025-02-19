package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmGroupCustManagerValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_RelType = "REL_TYPE";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_OfficeTel = "OFFICE_TEL";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_HomeTel = "HOME_TEL";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_MgrId = "MGR_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_JobDesc = "JOB_DESC";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_StaffName = "STAFF_NAME";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_Email = "EMAIL";
  public final static  String S_RegionCode = "REGION_CODE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_Notes = "NOTES";


public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getState();

public String getCountyCode();

public long getRelType();

public long getGroupCustId();

public String getOfficeTel();

public long getOrgId();

public String getHomeTel();

public String getRegionId();

public long getCreateOrgId();

public long getMgrId();

public long getCreateOpId();

public String getJobDesc();

public Timestamp getDoneDate();

public String getStaffName();

public String getBillId();

public String getEmail();

public String getRegionCode();

public Timestamp getCreateDate();

public long getDoneCode();

public long getOperType();

public String getNotes();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setCountyCode(String value);

public  void setRelType(long value);

public  void setGroupCustId(long value);

public  void setOfficeTel(String value);

public  void setOrgId(long value);

public  void setHomeTel(String value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setMgrId(long value);

public  void setCreateOpId(long value);

public  void setJobDesc(String value);

public  void setDoneDate(Timestamp value);

public  void setStaffName(String value);

public  void setBillId(String value);

public  void setEmail(String value);

public  void setRegionCode(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setOperType(long value);

public  void setNotes(String value);
}
