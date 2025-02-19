package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmInterfaceLogValue extends DataStructInterface{

  public final static  String S_OpId = "OP_ID";
  public final static  String S_LogId = "LOG_ID";
  public final static  String S_ExeParam = "EXE_PARAM";
  public final static  String S_ExeCnt = "EXE_CNT";
  public final static  String S_ExeTime = "EXE_TIME";
  public final static  String S_StartTime = "START_TIME";
  public final static  String S_BusiId = "BUSI_ID";
  public final static  String S_MethodName = "METHOD_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_ExeResult = "EXE_RESULT";


public long getOpId();

public long getLogId();

public String getExeParam();

public long getExeCnt();

public double getExeTime();

public Timestamp getStartTime();

public String getBusiId();

public String getMethodName();

public long getOrgId();

public String getExeResult();


public  void setOpId(long value);

public  void setLogId(long value);

public  void setExeParam(String value);

public  void setExeCnt(long value);

public  void setExeTime(double value);

public  void setStartTime(Timestamp value);

public  void setBusiId(String value);

public  void setMethodName(String value);

public  void setOrgId(long value);

public  void setExeResult(String value);
}
