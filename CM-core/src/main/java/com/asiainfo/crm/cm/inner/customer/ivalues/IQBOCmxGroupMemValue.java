package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmxGroupMemValue extends DataStructInterface{

  public final static  String S_DeptId = "DEPT_ID";
  public final static  String S_IsFromunion = "IS_FROMUNION";
  public final static  String S_MemberCustId = "MEMBER_CUST_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CustRegionId = "CUST_REGION_ID";
  public final static  String S_AcctName = "ACCT_NAME";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_MemberName = "MEMBER_NAME";
  public final static  String S_MemberType = "MEMBER_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_MemberRole = "MEMBER_ROLE";
  public final static  String S_CustRelId = "CUST_REL_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_MemberStatus = "MEMBER_STATUS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_MemberPosition = "MEMBER_POSITION";
  public final static  String S_VipCardNo = "VIP_CARD_NO";
  public final static  String S_IsHighvalue = "IS_HIGHVALUE";
  public final static  String S_VipLevel = "VIP_LEVEL";
  public final static  String S_Gender = "GENDER";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_MemberLevel = "MEMBER_LEVEL";


public long getDeptId();

public long getIsFromunion();

public long getMemberCustId();

public String getState();

public String getRemarks();

public String getCustRegionId();

public String getAcctName();

public long getCustId();

public long getAcctId();

public long getCreateOpId();

public String getMemberName();

public long getMemberType();

public long getDoneCode();

public long getMemberRole();

public long getCustRelId();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public long getUserId();

public long getMemberStatus();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public String getMemberPosition();

public String getVipCardNo();

public long getIsHighvalue();

public long getVipLevel();

public long getGender();

public Timestamp getDoneDate();

public String getBillId();

public Timestamp getCreateDate();

public long getMemberLevel();


public  void setDeptId(long value);

public  void setIsFromunion(long value);

public  void setMemberCustId(long value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setCustRegionId(String value);

public  void setAcctName(String value);

public  void setCustId(long value);

public  void setAcctId(long value);

public  void setCreateOpId(long value);

public  void setMemberName(String value);

public  void setMemberType(long value);

public  void setDoneCode(long value);

public  void setMemberRole(long value);

public  void setCustRelId(long value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setUserId(long value);

public  void setMemberStatus(long value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setMemberPosition(String value);

public  void setVipCardNo(String value);

public  void setIsHighvalue(long value);

public  void setVipLevel(long value);

public  void setGender(long value);

public  void setDoneDate(Timestamp value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setMemberLevel(long value);
}
