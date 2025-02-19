package com.asiainfo.crm.cm.exe.tf.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmPsBusiRecValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_BusinessId = "BUSINESS_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_RelObjectType = "REL_OBJECT_TYPE";
  public final static  String S_RelObjectDetail = "REL_OBJECT_DETAIL";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RelObjectId = "REL_OBJECT_ID";
  public final static  String S_RecordId = "RECORD_ID";


public String getState();

public long getCreateOpId();

public Timestamp getEffectiveDate();

public Timestamp getDoneDate();

public String getRemarks();

public long getOrgId();

public Timestamp getCreateDate();

public long getBusinessId();

public long getDoneCode();

public String getRelObjectType();

public String getRelObjectDetail();

public Timestamp getExpireDate();

public long getOpId();

public String getRegionId();

public long getCreateOrgId();

public long getRelObjectId();

public long getRecordId();


public  void setState(String value);

public  void setCreateOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setRemarks(String value);

public  void setOrgId(long value);

public  void setCreateDate(Timestamp value);

public  void setBusinessId(long value);

public  void setDoneCode(long value);

public  void setRelObjectType(String value);

public  void setRelObjectDetail(String value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setRelObjectId(long value);

public  void setRecordId(long value);
}
