package com.asiainfo.crm.inter.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;

public interface IBOInfExceptionKeywordsValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_KeyWord = "KEY_WORD";
  public final static  String S_ExceptionClass = "EXCEPTION_CLASS";
  public final static  String S_MapCode = "MAP_CODE";


public String getState();

public String getKeyWord();

public String getExceptionClass();

public String getMapCode();


public  void setState(String value);

public  void setKeyWord(String value);

public  void setExceptionClass(String value);

public  void setMapCode(String value);
}
