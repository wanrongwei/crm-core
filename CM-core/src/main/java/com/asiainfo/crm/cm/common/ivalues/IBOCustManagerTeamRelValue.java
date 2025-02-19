package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCustManagerTeamRelValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ManagerId = "MANAGER_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_TeamId = "TEAM_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RoleType = "ROLE_TYPE";


public String getState();

public long getCreateOpId();

public Timestamp getEffectiveDate();

public long getManagerId();

public Timestamp getDoneDate();

public long getOrgId();

public String getRemarks();

public Timestamp getCreateDate();

public long getTeamId();

public long getDoneCode();

public Timestamp getExpireDate();

public long getOpId();

public String getRegionId();

public long getCreateOrgId();

public int getRoleType();


public  void setState(String value);

public  void setCreateOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setManagerId(long value);

public  void setDoneDate(Timestamp value);

public  void setOrgId(long value);

public  void setRemarks(String value);

public  void setCreateDate(Timestamp value);

public  void setTeamId(long value);

public  void setDoneCode(long value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setRoleType(int value);
}
