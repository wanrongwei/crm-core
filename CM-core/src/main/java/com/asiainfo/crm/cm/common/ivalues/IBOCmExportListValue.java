package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmExportListValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ExportId = "EXPORT_ID";
  public final static  String S_TableInfo = "TABLE_INFO";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ColumnTitles = "COLUMN_TITLES";
  public final static  String S_FileName = "FILE_NAME";
  public final static  String S_FtpFileName = "FTP_FILE_NAME";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ConditionStr = "CONDITION_STR";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";


public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getExportId();

public String getTableInfo();

public String getState();

public String getRemarks();

public long getCreateOrgId();

public String getColumnTitles();

public String getFileName();

public String getFtpFileName();

public long getCreateOpId();

public Timestamp getDoneDate();

public String getConditionStr();

public Timestamp getCreateDate();

public long getDoneCode();


public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setExportId(long value);

public  void setTableInfo(String value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setCreateOrgId(long value);

public  void setColumnTitles(String value);

public  void setFileName(String value);

public  void setFtpFileName(String value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setConditionStr(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);
}
