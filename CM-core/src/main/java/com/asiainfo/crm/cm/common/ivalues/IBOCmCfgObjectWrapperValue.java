package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCfgObjectWrapperValue extends DataStructInterface{

  public final static  String S_ObjectName = "OBJECT_NAME";
  public final static  String S_DispAttrName = "DISP_ATTR_NAME";
  public final static  String S_State = "STATE";
  public final static  String S_AttrGetter = "ATTR_GETTER";
  public final static  String S_AttrName = "ATTR_NAME";
  public final static  String S_DispAttrGetter = "DISP_ATTR_GETTER";
  public final static  String S_DispAttrValueGetter = "DISP_ATTR_VALUE_GETTER";
  public final static  String S_DispAttrSetter = "DISP_ATTR_SETTER";
  public final static  String S_DispAttrParamDatatype = "DISP_ATTR_PARAM_DATATYPE";
  public final static  String S_DispAttrService = "DISP_ATTR_SERVICE";
  public final static  String S_DispAttrParam = "DISP_ATTR_PARAM";
  public final static  String S_ObjType = "OBJ_TYPE";
  public final static  String S_DispAttrValue = "DISP_ATTR_VALUE";


public String getObjectName();

public String getDispAttrName();

public String getState();

public String getAttrGetter();

public String getAttrName();

public String getDispAttrGetter();

public String getDispAttrValueGetter();

public String getDispAttrSetter();

public String getDispAttrParamDatatype();

public String getDispAttrService();

public String getDispAttrParam();

public int getObjType();

public String getDispAttrValue();


public  void setObjectName(String value);

public  void setDispAttrName(String value);

public  void setState(String value);

public  void setAttrGetter(String value);

public  void setAttrName(String value);

public  void setDispAttrGetter(String value);

public  void setDispAttrValueGetter(String value);

public  void setDispAttrSetter(String value);

public  void setDispAttrParamDatatype(String value);

public  void setDispAttrService(String value);

public  void setDispAttrParam(String value);

public  void setObjType(int value);

public  void setDispAttrValue(String value);
}
