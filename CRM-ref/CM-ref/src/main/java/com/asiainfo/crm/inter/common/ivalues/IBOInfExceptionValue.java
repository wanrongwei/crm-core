package com.asiainfo.crm.inter.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;

public interface IBOInfExceptionValue extends DataStructInterface{

  public final static  String S_ExceptionCode = "EXCEPTION_CODE";
  public final static  String S_State = "STATE";
  public final static  String S_MsgTransExpr = "MSG_TRANS_EXPR";
  public final static  String S_ExceptionClass = "EXCEPTION_CLASS";
  public final static  String S_MsgTransClass = "MSG_TRANS_CLASS";
  public final static  String S_MsgAfterTrans = "MSG_AFTER_TRANS";


public String getExceptionCode();

public String getState();

public String getMsgTransExpr();

public String getExceptionClass();

public String getMsgTransClass();

public String getMsgAfterTrans();


public  void setExceptionCode(String value);

public  void setState(String value);

public  void setMsgTransExpr(String value);

public  void setExceptionClass(String value);

public  void setMsgTransClass(String value);

public  void setMsgAfterTrans(String value);
}
