package com.asiainfo.crm.cm.ln.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupCustomerAuditValue extends DataStructInterface{

  public final static  String S_MemberCustId = "MEMBER_CUST_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_Job = "JOB";
  public final static  String S_BrandName = "BRAND_NAME";
  public final static  String S_GroupType = "GROUP_TYPE";
  public final static  String S_Deptment = "DEPTMENT";
  public final static  String S_CustAddress = "CUST_ADDRESS";
  public final static  String S_ShortNum = "SHORT_NUM";
  public final static  String S_PlanName = "PLAN_NAME";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_MemberName = "MEMBER_NAME";
  public final static  String S_AuditId = "AUDIT_ID";
  public final static  String S_MemberType = "MEMBER_TYPE";
  public final static  String S_RegionId2 = "REGION_ID2";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_AuditStatus = "AUDIT_STATUS";
  public final static  String S_CustZipcode = "CUST_ZIPCODE";
  public final static  String S_AuditType = "AUDIT_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_AuditDesc = "AUDIT_DESC";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_MemberState = "MEMBER_STATE";
  public final static  String S_PlanId = "PLAN_ID";
  public final static  String S_BrandId = "BRAND_ID";
  public final static  String S_MemberCreateDate = "MEMBER_CREATE_DATE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ManagerId = "MANAGER_ID";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_AuditDate = "AUDIT_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ClassId = "CLASS_ID";
  public final static  String S_AuditManagerId = "AUDIT_MANAGER_ID";
  public final static  String S_IsVip = "IS_VIP";


public long getMemberCustId();

public String getState();

public String getRemarks();

public String getJob();

public String getBrandName();

public int getGroupType();

public String getDeptment();

public String getCustAddress();

public String getShortNum();

public String getPlanName();

public String getContMobile();

public long getCustId();

public long getCreateOpId();

public String getMemberName();

public long getAuditId();

public int getMemberType();

public String getRegionId2();

public long getDoneCode();

public int getOperType();

public int getAuditStatus();

public String getCustZipcode();

public int getAuditType();

public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getAuditDesc();

public long getUserId();

public int getMemberState();

public long getPlanId();

public long getBrandId();

public Timestamp getMemberCreateDate();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public long getManagerId();

public String getCountyId();

public Timestamp getAuditDate();

public Timestamp getDoneDate();

public String getBillId();

public Timestamp getCreateDate();

public int getClassId();

public long getAuditManagerId();

public int getIsVip();


public  void setMemberCustId(long value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setJob(String value);

public  void setBrandName(String value);

public  void setGroupType(int value);

public  void setDeptment(String value);

public  void setCustAddress(String value);

public  void setShortNum(String value);

public  void setPlanName(String value);

public  void setContMobile(String value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setMemberName(String value);

public  void setAuditId(long value);

public  void setMemberType(int value);

public  void setRegionId2(String value);

public  void setDoneCode(long value);

public  void setOperType(int value);

public  void setAuditStatus(int value);

public  void setCustZipcode(String value);

public  void setAuditType(int value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setAuditDesc(String value);

public  void setUserId(long value);

public  void setMemberState(int value);

public  void setPlanId(long value);

public  void setBrandId(long value);

public  void setMemberCreateDate(Timestamp value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setManagerId(long value);

public  void setCountyId(String value);

public  void setAuditDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setClassId(int value);

public  void setAuditManagerId(long value);

public  void setIsVip(int value);
}
