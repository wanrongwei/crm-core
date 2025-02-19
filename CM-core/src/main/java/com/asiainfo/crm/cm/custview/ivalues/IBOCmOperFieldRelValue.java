package com.asiainfo.crm.cm.custview.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmOperFieldRelValue extends DataStructInterface{

  public final static  String S_FieldName = "FIELD_NAME";
  public final static  String S_State = "STATE";
  public final static  String S_OperId = "OPER_ID";
  public final static  String S_BceFrameId = "BCE_FRAME_ID";
  public final static  String S_ViewId = "VIEW_ID";
  public final static  String S_FieldRelId = "FIELD_REL_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_BceFormId = "BCE_FORM_ID";
  public final static  String S_Sort = "SORT";


public String getFieldName();

public String getState();

public long getOperId();

public long getBceFrameId();

public long getViewId();

public long getFieldRelId();

public String getRemarks();

public String getBceFormId();

public int getSort();


public  void setFieldName(String value);

public  void setState(String value);

public  void setOperId(long value);

public  void setBceFrameId(long value);

public  void setViewId(long value);

public  void setFieldRelId(long value);

public  void setRemarks(String value);

public  void setBceFormId(String value);

public  void setSort(int value);
}
