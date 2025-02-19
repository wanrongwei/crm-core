package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCfgSpecListTypeRelValue extends DataStructInterface{

  public final static  String S_RelId = "REL_ID";
  public final static  String S_State = "STATE";
  public final static  String S_RelTypeId = "REL_TYPE_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_RelDesc = "REL_DESC";
  public final static  String S_RelType = "REL_TYPE";
  public final static  String S_TypeId = "TYPE_ID";


public int getRelId();

public String getState();

public int getRelTypeId();

public String getRemarks();

public String getRelDesc();

public int getRelType();

public int getTypeId();


public  void setRelId(int value);

public  void setState(String value);

public  void setRelTypeId(int value);

public  void setRemarks(String value);

public  void setRelDesc(String value);

public  void setRelType(int value);

public  void setTypeId(int value);
}
