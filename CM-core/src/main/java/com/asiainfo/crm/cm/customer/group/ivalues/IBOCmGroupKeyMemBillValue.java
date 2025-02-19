package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupKeyMemBillValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_KernelLevel = "KERNEL_LEVEL";
  public final static  String S_State = "STATE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_MemUserId = "MEM_USER_ID";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_KernelId = "KERNEL_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_KernelType = "KERNEL_TYPE";
  public final static  String S_VipLevel = "VIP_LEVEL";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_MemberType = "MEMBER_TYPE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_UserStatus = "USER_STATUS";
  public final static  String S_Notes = "NOTES";
  public final static  String S_MemberLevel = "MEMBER_LEVEL";


public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public int getKernelLevel();

public String getState();

public long getUserId();

public long getMemUserId();

public long getGroupCustId();

public long getOrgId();

public long getKernelId();

public String getRegionId();

public long getCreateOrgId();

public int getKernelType();

public int getVipLevel();

public long getCreateOpId();

public Timestamp getDoneDate();

public int getMemberType();

public String getBillId();

public Timestamp getCreateDate();

public long getDoneCode();

public String getUserStatus();

public String getNotes();

public int getMemberLevel();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setKernelLevel(int value);

public  void setState(String value);

public  void setUserId(long value);

public  void setMemUserId(long value);

public  void setGroupCustId(long value);

public  void setOrgId(long value);

public  void setKernelId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setKernelType(int value);

public  void setVipLevel(int value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setMemberType(int value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setUserStatus(String value);

public  void setNotes(String value);

public  void setMemberLevel(int value);
}
