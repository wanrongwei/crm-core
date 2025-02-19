package com.asiainfo.crm.cm.batch.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmBatchDealResultValue extends DataStructInterface{

  public final static  String S_ErrorReason = "ERROR_REASON";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_FileContent = "FILE_CONTENT";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_BatchDataDetailId = "BATCH_DATA_DETAIL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ConfigId = "CONFIG_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_BatchDataId = "BATCH_DATA_ID";
  public final static  String S_ResultType = "RESULT_TYPE";


public String getErrorReason();

public long getCreateOpId();

public Timestamp getEffectiveDate();

public String getFileContent();

public Timestamp getDoneDate();

public String getNotes();

public long getOrgId();

public long getBatchDataDetailId();

public Timestamp getCreateDate();

public long getDoneCode();

public String getRegionId();

public long getOpId();

public long getConfigId();

public Timestamp getExpireDate();

public long getCreateOrgId();

public long getBatchDataId();

public int getResultType();


public  void setErrorReason(String value);

public  void setCreateOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setFileContent(String value);

public  void setDoneDate(Timestamp value);

public  void setNotes(String value);

public  void setOrgId(long value);

public  void setBatchDataDetailId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setRegionId(String value);

public  void setOpId(long value);

public  void setConfigId(long value);

public  void setExpireDate(Timestamp value);

public  void setCreateOrgId(long value);

public  void setBatchDataId(long value);

public  void setResultType(int value);
}
