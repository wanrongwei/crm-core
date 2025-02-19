package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmPsPublicDealValue extends DataStructInterface{

  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_State = "state";
  public final static  String S_RegionId = "region_id";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_Remarks = "remarks";
  public final static  String S_PartyId = "party_id";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_EntityId = "entity_id";
  public final static  String S_RecordId = "record_id";
  public final static  String S_OrgId = "org_id";
  public final static  String S_PsParam = "ps_param";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_EntityType = "entity_type";
  public final static  String S_ExecAction = "exec_action";
  public final static  String S_CreateOpId = "create_op_id";


public Timestamp getExpireDate();

public Timestamp getDoneDate();

public String getState();

public String getRegionId();

public long getDoneCode();

public String getRemarks();

public long getPartyId();

public long getCreateOrgId();

public long getEntityId();

public long getRecordId();

public long getOrgId();

public String getPsParam();

public long getOpId();

public Timestamp getCreateDate();

public Timestamp getEffectiveDate();

public long getEntityType();

public long getExecAction();

public long getCreateOpId();


public  void setExpireDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setState(String value);

public  void setRegionId(String value);

public  void setDoneCode(long value);

public  void setRemarks(String value);

public  void setPartyId(long value);

public  void setCreateOrgId(long value);

public  void setEntityId(long value);

public  void setRecordId(long value);

public  void setOrgId(long value);

public  void setPsParam(String value);

public  void setOpId(long value);

public  void setCreateDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setEntityType(long value);

public  void setExecAction(long value);

public  void setCreateOpId(long value);
}
