package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmAttachExColValue extends DataStructInterface{

  public final static  String S_FieldCode = "FIELD_CODE";
  public final static  String S_FieldName = "FIELD_NAME";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ColCode = "COL_CODE";
  public final static  String S_AttachColId = "ATTACH_COL_ID";


public String getFieldCode();

public String getFieldName();

public String getRemarks();

public String getColCode();

public long getAttachColId();


public  void setFieldCode(String value);

public  void setFieldName(String value);

public  void setRemarks(String value);

public  void setColCode(String value);

public  void setAttachColId(long value);
}
