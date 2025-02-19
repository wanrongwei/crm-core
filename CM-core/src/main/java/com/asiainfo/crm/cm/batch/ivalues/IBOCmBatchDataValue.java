package com.asiainfo.crm.cm.batch.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmBatchDataValue extends DataStructInterface{

  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_BatchOperFields = "BATCH_OPER_FIELDS";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ErrorCount = "ERROR_COUNT";
  public final static  String S_SuccessCount = "SUCCESS_COUNT";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ConfigId = "CONFIG_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_BatchDataId = "BATCH_DATA_ID";
  public final static  String S_TotalCount = "TOTAL_COUNT";


public long getCreateOpId();

public Timestamp getEffectiveDate();

public String getBatchOperFields();

public Timestamp getDoneDate();

public String getNotes();

public long getOrgId();

public Timestamp getCreateDate();

public long getDoneCode();

public int getErrorCount();

public int getSuccessCount();

public String getRegionId();

public long getConfigId();

public Timestamp getExpireDate();

public long getOpId();

public long getCreateOrgId();

public long getBatchDataId();

public int getTotalCount();


public  void setCreateOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setBatchOperFields(String value);

public  void setDoneDate(Timestamp value);

public  void setNotes(String value);

public  void setOrgId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setErrorCount(int value);

public  void setSuccessCount(int value);

public  void setRegionId(String value);

public  void setConfigId(long value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setCreateOrgId(long value);

public  void setBatchDataId(long value);

public  void setTotalCount(int value);
}
