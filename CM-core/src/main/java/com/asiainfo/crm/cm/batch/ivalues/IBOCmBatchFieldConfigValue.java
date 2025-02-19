package com.asiainfo.crm.cm.batch.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmBatchFieldConfigValue extends DataStructInterface{

  public final static  String S_DbCol = "DB_COL";
  public final static  String S_State = "STATE";
  public final static  String S_IsNull = "IS_NULL";
  public final static  String S_DsParam = "DS_PARAM";
  public final static  String S_DsService = "DS_SERVICE";
  public final static  String S_FieldCfgId = "FIELD_CFG_ID";
  public final static  String S_ConfigId = "CONFIG_ID";
  public final static  String S_DsMethod = "DS_METHOD";
  public final static  String S_DescText = "DESC_TEXT";
  public final static  String S_DsValue = "DS_VALUE";
  public final static  String S_FieldTitle = "FIELD_TITLE";
  public final static  String S_Sort = "SORT";
  public final static  String S_DsDisplay = "DS_DISPLAY";
  public final static  String S_DescType = "DESC_TYPE";
  public final static  String S_FieldRel = "FIELD_REL";


public String getDbCol();

public String getState();

public int getIsNull();

public String getDsParam();

public String getDsService();

public long getFieldCfgId();

public long getConfigId();

public String getDsMethod();

public String getDescText();

public String getDsValue();

public String getFieldTitle();

public int getSort();

public String getDsDisplay();

public int getDescType();

public long getFieldRel();


public  void setDbCol(String value);

public  void setState(String value);

public  void setIsNull(int value);

public  void setDsParam(String value);

public  void setDsService(String value);

public  void setFieldCfgId(long value);

public  void setConfigId(long value);

public  void setDsMethod(String value);

public  void setDescText(String value);

public  void setDsValue(String value);

public  void setFieldTitle(String value);

public  void setSort(int value);

public  void setDsDisplay(String value);

public  void setDescType(int value);

public  void setFieldRel(long value);
}
