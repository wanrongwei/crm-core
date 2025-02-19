package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCfgSpecListTypeValue extends DataStructInterface{

  public final static  String S_TypeName = "TYPE_NAME";
  public final static  String S_State = "STATE";
  public final static  String S_TypeDesc = "TYPE_DESC";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_TypeLevel = "TYPE_LEVEL";
  public final static  String S_TypeId = "TYPE_ID";
  public final static  String S_ParentTypeId = "PARENT_TYPE_ID";


public String getTypeName();

public String getState();

public String getTypeDesc();

public String getRemarks();

public int getTypeLevel();

public int getTypeId();

public int getParentTypeId();


public  void setTypeName(String value);

public  void setState(String value);

public  void setTypeDesc(String value);

public  void setRemarks(String value);

public  void setTypeLevel(int value);

public  void setTypeId(int value);

public  void setParentTypeId(int value);
}
