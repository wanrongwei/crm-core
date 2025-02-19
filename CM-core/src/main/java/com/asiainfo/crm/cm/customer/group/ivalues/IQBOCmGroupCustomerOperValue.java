package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmGroupCustomerOperValue extends DataStructInterface{

  public final static  String S_MemberDesc = "member_desc";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_MemberType = "member_type";
  public final static  String S_MemberRole = "member_role";
  public final static  String S_BOpId = "B_op_id";
  public final static  String S_CustRelId = "cust_rel_id";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_OperatorId = "operator_id";
  public final static  String S_RelaId = "rela_id";
  public final static  String S_State = "state";
  public final static  String S_RegionId = "region_id";
  public final static  String S_BCreateDate = "B_create_date";
  public final static  String S_Remarks = "remarks";
  public final static  String S_BState = "B_state";
  public final static  String S_MemberStatus = "member_status";
  public final static  String S_LastNameQry = "last_name_qry";
  public final static  String S_BRemarks = "B_remarks";
  public final static  String S_FirstName = "first_name";
  public final static  String S_DeptId = "dept_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_BDoneCode = "B_done_code";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_FirstNameQry = "first_name_qry";
  public final static  String S_BExpireDate = "B_expire_date";
  public final static  String S_UserId = "user_id";
  public final static  String S_BOrgId = "B_org_id";
  public final static  String S_MemberPosition = "member_position";
  public final static  String S_CreateOpId = "create_op_id";
  public final static  String S_BRegionId = "B_region_id";
  public final static  String S_BCreateOrgId = "B_create_org_id";
  public final static  String S_MiddleName = "middle_name";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_BCreateOpId = "B_create_op_id";
  public final static  String S_CustId = "cust_id";
  public final static  String S_CustRegionId = "cust_region_id";
  public final static  String S_OrgId = "org_id";
  public final static  String S_MemberCustId = "member_cust_id";
  public final static  String S_BEffectiveDate = "B_effective_date";
  public final static  String S_BDoneDate = "B_done_date";
  public final static  String S_MemberNameQry = "member_name_qry";
  public final static  String S_LastName = "last_name";
  public final static  String S_Brand = "brand";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_ProvideId = "provide_id";
  public final static  String S_MiddleNameQry = "middle_name_qry";
  public final static  String S_MemberName = "member_name";
  public final static  String S_BillId = "bill_id";


public String getMemberDesc();

public Timestamp getExpireDate();

public int getMemberType();

public int getMemberRole();

public long getBOpId();

public long getCustRelId();

public Timestamp getDoneDate();

public long getOperatorId();

public long getRelaId();

public String getState();

public String getRegionId();

public Timestamp getBCreateDate();

public String getRemarks();

public String getBState();

public int getMemberStatus();

public String getLastNameQry();

public String getBRemarks();

public String getFirstName();

public long getDeptId();

public long getOpId();

public long getBDoneCode();

public Timestamp getCreateDate();

public String getFirstNameQry();

public Timestamp getBExpireDate();

public long getUserId();

public long getBOrgId();

public String getMemberPosition();

public long getCreateOpId();

public String getBRegionId();

public long getBCreateOrgId();

public String getMiddleName();

public long getDoneCode();

public long getBCreateOpId();

public long getCustId();

public String getCustRegionId();

public long getOrgId();

public long getMemberCustId();

public Timestamp getBEffectiveDate();

public Timestamp getBDoneDate();

public String getMemberNameQry();

public String getLastName();

public String getBrand();

public Timestamp getEffectiveDate();

public int getProvideId();

public String getMiddleNameQry();

public String getMemberName();

public String getBillId();


public  void setMemberDesc(String value);

public  void setExpireDate(Timestamp value);

public  void setMemberType(int value);

public  void setMemberRole(int value);

public  void setBOpId(long value);

public  void setCustRelId(long value);

public  void setDoneDate(Timestamp value);

public  void setOperatorId(long value);

public  void setRelaId(long value);

public  void setState(String value);

public  void setRegionId(String value);

public  void setBCreateDate(Timestamp value);

public  void setRemarks(String value);

public  void setBState(String value);

public  void setMemberStatus(int value);

public  void setLastNameQry(String value);

public  void setBRemarks(String value);

public  void setFirstName(String value);

public  void setDeptId(long value);

public  void setOpId(long value);

public  void setBDoneCode(long value);

public  void setCreateDate(Timestamp value);

public  void setFirstNameQry(String value);

public  void setBExpireDate(Timestamp value);

public  void setUserId(long value);

public  void setBOrgId(long value);

public  void setMemberPosition(String value);

public  void setCreateOpId(long value);

public  void setBRegionId(String value);

public  void setBCreateOrgId(long value);

public  void setMiddleName(String value);

public  void setDoneCode(long value);

public  void setBCreateOpId(long value);

public  void setCustId(long value);

public  void setCustRegionId(String value);

public  void setOrgId(long value);

public  void setMemberCustId(long value);

public  void setBEffectiveDate(Timestamp value);

public  void setBDoneDate(Timestamp value);

public  void setMemberNameQry(String value);

public  void setLastName(String value);

public  void setBrand(String value);

public  void setEffectiveDate(Timestamp value);

public  void setProvideId(int value);

public  void setMiddleNameQry(String value);

public  void setMemberName(String value);

public  void setBillId(String value);
}
