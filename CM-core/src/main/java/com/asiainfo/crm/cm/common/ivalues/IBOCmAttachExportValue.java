package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmAttachExportValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_FunctionCode = "FUNCTION_CODE";
  public final static  String S_ExportParameter = "EXPORT_PARAMETER";
  public final static  String S_Reason = "REASON";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ColCode = "COL_CODE";
  public final static  String S_AttacyName = "ATTACY_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_FileName = "FILE_NAME";
  public final static  String S_AttachId = "ATTACH_ID";
  public final static  String S_ClearDate = "CLEAR_DATE";
  public final static  String S_MethCode = "METH_CODE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_FunctionName = "FUNCTION_NAME";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_FileSize = "FILE_SIZE";
  public final static  String S_FileExt = "FILE_EXT";


public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getState();

public String getFunctionCode();

public String getExportParameter();

public String getReason();

public String getRemarks();

public String getColCode();

public String getAttacyName();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public String getFileName();

public long getAttachId();

public Timestamp getClearDate();

public String getMethCode();

public long getCreateOpId();

public String getFunctionName();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public long getDoneCode();

public long getFileSize();

public String getFileExt();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setFunctionCode(String value);

public  void setExportParameter(String value);

public  void setReason(String value);

public  void setRemarks(String value);

public  void setColCode(String value);

public  void setAttacyName(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setFileName(String value);

public  void setAttachId(long value);

public  void setClearDate(Timestamp value);

public  void setMethCode(String value);

public  void setCreateOpId(long value);

public  void setFunctionName(String value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setFileSize(long value);

public  void setFileExt(String value);
}
