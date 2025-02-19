package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupCustMemUserValue extends DataStructInterface{

  public final static  String S_IsFromunion = "IS_FROMUNION";
  public final static  String S_State = "STATE";
  public final static  String S_UserRegionId = "USER_REGION_ID";
  public final static  String S_MemUserId = "MEM_USER_ID";
  public final static  String S_ServiceId = "SERVICE_ID";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_MemberType = "MEMBER_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CustRelId = "CUST_REL_ID";
  public final static  String S_Notes = "NOTES";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_MemberAppType = "MEMBER_APP_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_IsHighvalue = "IS_HIGHVALUE";
  public final static  String S_VipLevel = "VIP_LEVEL";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OldBillId = "OLD_BILL_ID";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_UserStatus = "USER_STATUS";
  public final static  String S_MemberLevel = "MEMBER_LEVEL";


public int getIsFromunion();

public String getState();

public String getUserRegionId();

public long getMemUserId();

public String getServiceId();

public long getAcctId();

public long getCreateOpId();

public int getMemberType();

public long getDoneCode();

public long getCustRelId();

public String getNotes();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public long getUserId();

public long getGroupCustId();

public int getMemberAppType();

public long getOrgId();

public long getCreateOrgId();

public String getRegionId();

public int getIsHighvalue();

public int getVipLevel();

public Timestamp getDoneDate();

public String getOldBillId();

public String getBillId();

public Timestamp getCreateDate();

public int getUserStatus();

public int getMemberLevel();


public  void setIsFromunion(int value);

public  void setState(String value);

public  void setUserRegionId(String value);

public  void setMemUserId(long value);

public  void setServiceId(String value);

public  void setAcctId(long value);

public  void setCreateOpId(long value);

public  void setMemberType(int value);

public  void setDoneCode(long value);

public  void setCustRelId(long value);

public  void setNotes(String value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setUserId(long value);

public  void setGroupCustId(long value);

public  void setMemberAppType(int value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setRegionId(String value);

public  void setIsHighvalue(int value);

public  void setVipLevel(int value);

public  void setDoneDate(Timestamp value);

public  void setOldBillId(String value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setUserStatus(int value);

public  void setMemberLevel(int value);
}
