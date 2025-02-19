package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOBsOperatorsValue extends DataStructInterface{

  public final static  String S_Note = "NOTE";
  public final static  String S_OperatorsName = "OPERATORS_NAME";
  public final static  String S_OperatorsGroup = "OPERATORS_GROUP";
  public final static  String S_OperatorsId = "OPERATORS_ID";
  public final static  String S_State = "STATE";
  public final static  String S_OperatorsType = "OPERATORS_TYPE";
  public final static  String S_OperatorsCode = "operators_code";


public String getNote();

public String getOperatorsName();

public String getOperatorsGroup();

public long getOperatorsId();

public String getState();

public String getOperatorsType();

public String getOperatorsCode();


public  void setNote(String value);

public  void setOperatorsName(String value);

public  void setOperatorsGroup(String value);

public  void setOperatorsId(long value);

public  void setState(String value);

public  void setOperatorsType(String value);

public  void setOperatorsCode(String value);
}
