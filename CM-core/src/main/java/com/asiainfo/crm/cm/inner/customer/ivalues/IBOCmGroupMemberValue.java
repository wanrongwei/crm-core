package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupMemberValue extends DataStructInterface{

  public final static  String S_DeptId = "DEPT_ID";
  public final static  String S_MemberCustId = "MEMBER_CUST_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CustRegionId = "CUST_REGION_ID";
  public final static  String S_MemberNameQry = "MEMBER_NAME_QRY";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_MemberName = "MEMBER_NAME";
  public final static  String S_MemberType = "MEMBER_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_MemberRole = "MEMBER_ROLE";
  public final static  String S_CustRelId = "CUST_REL_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_MemberStatus = "MEMBER_STATUS";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_MemberPosition = "MEMBER_POSITION";
  public final static  String S_ProvideId = "PROVIDE_ID";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_MemberDesc = "MEMBER_DESC";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_Brand = "BRAND";


public long getDeptId();

public long getMemberCustId();

public String getState();

public String getRemarks();

public String getCustRegionId();

public String getMemberNameQry();

public String getFirstName();

public long getCustId();

public long getCreateOpId();

public String getMemberName();

public int getMemberType();

public long getDoneCode();

public int getMemberRole();

public long getCustRelId();

public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public long getUserId();

public String getLastNameQry();

public int getMemberStatus();

public String getLastName();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public String getMemberPosition();

public int getProvideId();

public String getMiddleName();

public Timestamp getDoneDate();

public String getMemberDesc();

public String getFirstNameQry();

public String getBillId();

public Timestamp getCreateDate();

public String getMiddleNameQry();

public String getBrand();


public  void setDeptId(long value);

public  void setMemberCustId(long value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setCustRegionId(String value);

public  void setMemberNameQry(String value);

public  void setFirstName(String value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setMemberName(String value);

public  void setMemberType(int value);

public  void setDoneCode(long value);

public  void setMemberRole(int value);

public  void setCustRelId(long value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setUserId(long value);

public  void setLastNameQry(String value);

public  void setMemberStatus(int value);

public  void setLastName(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setMemberPosition(String value);

public  void setProvideId(int value);

public  void setMiddleName(String value);

public  void setDoneDate(Timestamp value);

public  void setMemberDesc(String value);

public  void setFirstNameQry(String value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setMiddleNameQry(String value);

public  void setBrand(String value);
}
