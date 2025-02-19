package com.asiainfo.crm.cm.model.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IClubActionRecValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_RecordStatus = "RECORD_STATUS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_ActionContent = "ACTION_CONTENT";
  public final static  String S_MemberId = "MEMBER_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ValueType = "VALUE_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ValueAmount = "VALUE_AMOUNT";
  public final static  String S_RecordId = "RECORD_ID";
  public final static  String S_ActionId = "ACTION_ID";
  public final static  String S_ActionPlace = "ACTION_PLACE";
  public final static  String S_ActionDate = "ACTION_DATE";


public String getState();

public long getCreateOpId();

public Timestamp getEffectiveDate();

public Timestamp getDoneDate();

public String getRemarks();

public int getRecordStatus();

public long getOrgId();

public String getActionContent();

public long getMemberId();

public Timestamp getCreateDate();

public int getValueType();

public long getDoneCode();

public String getRegionId();

public Timestamp getExpireDate();

public long getOpId();

public long getCreateOrgId();

public long getValueAmount();

public long getRecordId();

public long getActionId();

public String getActionPlace();

public Timestamp getActionDate();


public  void setState(String value);

public  void setCreateOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setRemarks(String value);

public  void setRecordStatus(int value);

public  void setOrgId(long value);

public  void setActionContent(String value);

public  void setMemberId(long value);

public  void setCreateDate(Timestamp value);

public  void setValueType(int value);

public  void setDoneCode(long value);

public  void setRegionId(String value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setCreateOrgId(long value);

public  void setValueAmount(long value);

public  void setRecordId(long value);

public  void setActionId(long value);

public  void setActionPlace(String value);

public  void setActionDate(Timestamp value);
}
