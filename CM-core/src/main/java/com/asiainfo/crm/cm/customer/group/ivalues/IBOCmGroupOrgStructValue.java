package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupOrgStructValue extends DataStructInterface{

  public final static  String S_DeptId = "DEPT_ID";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_State = "STATE";
  public final static  String S_DeptType = "DEPT_TYPE";
  public final static  String S_DeptName = "DEPT_NAME";
  public final static  String S_HasLeaf = "HAS_LEAF";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ParentDeptId = "PARENT_DEPT_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_DeptLevel = "DEPT_LEVEL";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_Principal = "PRINCIPAL";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_DeptFunc = "DEPT_FUNC";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_RelObjectId = "REL_OBJECT_ID";
  public final static  String S_PrincipalTel = "PRINCIPAL_TEL";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_RegionCode = "REGION_CODE";


public long getDeptId();

public String getCountyCode();

public String getState();

public int getDeptType();

public String getDeptName();

public long getHasLeaf();

public long getCreateOpId();

public long getParentDeptId();

public long getDoneCode();

public String getNotes();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public int getDeptLevel();

public long getGroupCustId();

public String getPrincipal();

public long getOrgId();

public long getCreateOrgId();

public String getRegionId();

public String getDeptFunc();

public Timestamp getDoneDate();

public long getRelObjectId();

public String getPrincipalTel();

public Timestamp getCreateDate();

public String getRegionCode();


public  void setDeptId(long value);

public  void setCountyCode(String value);

public  void setState(String value);

public  void setDeptType(int value);

public  void setDeptName(String value);

public  void setHasLeaf(long value);

public  void setCreateOpId(long value);

public  void setParentDeptId(long value);

public  void setDoneCode(long value);

public  void setNotes(String value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setDeptLevel(int value);

public  void setGroupCustId(long value);

public  void setPrincipal(String value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setRegionId(String value);

public  void setDeptFunc(String value);

public  void setDoneDate(Timestamp value);

public  void setRelObjectId(long value);

public  void setPrincipalTel(String value);

public  void setCreateDate(Timestamp value);

public  void setRegionCode(String value);
}
