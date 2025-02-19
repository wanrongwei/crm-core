package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmFamilyMemberValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_RelTypeId = "REL_TYPE_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_MemberCustId = "MEMBER_CUST_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_MemberRole = "MEMBER_ROLE";
  public final static  String S_CustRelId = "CUST_REL_ID";
  public final static  String S_MemberCustRegionId = "MEMBER_CUST_REGION_ID";
  public final static  String S_CustId = "CUST_ID";


public String getState();

public long getCreateOpId();

public Timestamp getEffectiveDate();

public Timestamp getDoneDate();

public String getRemarks();

public long getRelTypeId();

public long getOrgId();

public Timestamp getCreateDate();

public long getDoneCode();

public String getRegionId();

public Timestamp getExpireDate();

public long getMemberCustId();

public long getOpId();

public long getCreateOrgId();

public int getMemberRole();

public long getCustRelId();

public String getMemberCustRegionId();

public long getCustId();


public  void setState(String value);

public  void setCreateOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setRemarks(String value);

public  void setRelTypeId(long value);

public  void setOrgId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setRegionId(String value);

public  void setExpireDate(Timestamp value);

public  void setMemberCustId(long value);

public  void setOpId(long value);

public  void setCreateOrgId(long value);

public  void setMemberRole(int value);

public  void setCustRelId(long value);

public  void setMemberCustRegionId(String value);

public  void setCustId(long value);
}
