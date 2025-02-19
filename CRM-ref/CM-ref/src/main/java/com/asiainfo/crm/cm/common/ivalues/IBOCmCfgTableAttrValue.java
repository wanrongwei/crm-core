package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;

public interface IBOCmCfgTableAttrValue extends DataStructInterface{

  public final static  String S_TableName = "TABLE_NAME";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_AttrDesc = "ATTR_DESC";
  public final static  String S_EditType = "EDIT_TYPE";
  public final static  String S_DecimalNum = "DECIMAL_NUM";
  public final static  String S_IsMust = "IS_MUST";
  public final static  String S_ColSpan = "COL_SPAN";
  public final static  String S_Idx = "IDX";
  public final static  String S_AttrCode = "ATTR_CODE";
  public final static  String S_DefaultValue = "DEFAULT_VALUE";
  public final static  String S_Url = "URL";
  public final static  String S_Length = "LENGTH";
  public final static  String S_DataType = "DATA_TYPE";
  public final static  String S_Title = "TITLE";


public String getTableName();

public String getState();

public String getRemarks();

public String getAttrDesc();

public String getEditType();

public long getDecimalNum();

public String getIsMust();

public int getColSpan();

public long getIdx();

public String getAttrCode();

public String getDefaultValue();

public String getUrl();

public long getLength();

public String getDataType();

public String getTitle();


public  void setTableName(String value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setAttrDesc(String value);

public  void setEditType(String value);

public  void setDecimalNum(long value);

public  void setIsMust(String value);

public  void setColSpan(int value);

public  void setIdx(long value);

public  void setAttrCode(String value);

public  void setDefaultValue(String value);

public  void setUrl(String value);

public  void setLength(long value);

public  void setDataType(String value);

public  void setTitle(String value);
}
