package com.asiainfo.crm.cm.hu.party;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmPartyPermissionValue extends DataStructInterface{

  public final static  String S_DoneCode = "done_code";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_RegionId = "region_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateOpId = "create_op_id";
  public final static  String S_RelId = "rel_id";
  public final static  String S_PermissionValue = "permission_value";
  public final static  String S_PermissonType = "permisson_type";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_Action = "ACTION";
  public final static  String S_OrgId = "org_id";
  public final static  String S_PartyId = "party_id";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_State = "state";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_Remarks = "remarks";
  public final static  String S_RefreshType = "REFRESH_TYPE";


public long getDoneCode();

public Timestamp getDoneDate();

public long getCreateOrgId();

public String getRegionId();

public long getOpId();

public long getCreateOpId();

public long getRelId();

public String getPermissionValue();

public long getPermissonType();

public Timestamp getExpireDate();

public String getAction();

public long getOrgId();

public long getPartyId();

public Timestamp getEffectiveDate();

public String getState();

public Timestamp getCreateDate();

public String getRemarks();

public int getRefreshType();


public  void setDoneCode(long value);

public  void setDoneDate(Timestamp value);

public  void setCreateOrgId(long value);

public  void setRegionId(String value);

public  void setOpId(long value);

public  void setCreateOpId(long value);

public  void setRelId(long value);

public  void setPermissionValue(String value);

public  void setPermissonType(long value);

public  void setExpireDate(Timestamp value);

public  void setAction(String value);

public  void setOrgId(long value);

public  void setPartyId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setCreateDate(Timestamp value);

public  void setRemarks(String value);

public  void setRefreshType(int value);
}
