package com.asiainfo.crm.cm.model.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IPartyRoleValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_RoleStatus = "ROLE_STATUS";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_EntityId = "ENTITY_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_RoleType = "ROLE_TYPE";
  public final static  String S_PartyRoleId = "PARTY_ROLE_ID";
  public final static  String S_RoleRegionId = "ROLE_REGION_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";


public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getState();

public int getRoleStatus();

public String getRemarks();

public long getPartyId();

public long getOrgId();

public long getCreateOrgId();

public long getEntityId();

public String getRegionId();

public int getRoleType();

public long getPartyRoleId();

public String getRoleRegionId();

public long getCreateOpId();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public long getDoneCode();


public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setState(String value);

public  void setRoleStatus(int value);

public  void setRemarks(String value);

public  void setPartyId(long value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setEntityId(long value);

public  void setRegionId(String value);

public  void setRoleType(int value);

public  void setPartyRoleId(long value);

public  void setRoleRegionId(String value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);
}
