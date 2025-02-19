package com.asiainfo.crm.cm.custgroup.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupLogValue extends DataStructInterface{

  public final static  String S_LogInfo6 = "LOG_INFO6";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_LogInfo5 = "LOG_INFO5";
  public final static  String S_EventCreateDate = "EVENT_CREATE_DATE";
  public final static  String S_LogCreator = "LOG_CREATOR";
  public final static  String S_LogInfo2 = "LOG_INFO2";
  public final static  String S_OperatorObjectId = "OPERATOR_OBJECT_ID";
  public final static  String S_LogInfo1 = "LOG_INFO1";
  public final static  String S_LogInfoIndex = "LOG_INFO_INDEX";
  public final static  String S_LogInfo4 = "LOG_INFO4";
  public final static  String S_LogInfo3 = "LOG_INFO3";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_LogEventType = "LOG_EVENT_TYPE";
  public final static  String S_LogType = "LOG_TYPE";
  public final static  String S_BatchDealId = "BATCH_DEAL_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_LogId = "LOG_ID";
  public final static  String S_LogLevel = "LOG_LEVEL";


public String getLogInfo6();

public long getCreateOpId();

public String getLogInfo5();

public Timestamp getEventCreateDate();

public long getLogCreator();

public String getLogInfo2();

public long getOperatorObjectId();

public String getLogInfo1();

public long getLogInfoIndex();

public String getLogInfo4();

public String getLogInfo3();

public long getGroupId();

public Timestamp getCreateDate();

public String getLogEventType();

public long getLogType();

public String getBatchDealId();

public long getCreateOrgId();

public long getLogId();

public long getLogLevel();


public  void setLogInfo6(String value);

public  void setCreateOpId(long value);

public  void setLogInfo5(String value);

public  void setEventCreateDate(Timestamp value);

public  void setLogCreator(long value);

public  void setLogInfo2(String value);

public  void setOperatorObjectId(long value);

public  void setLogInfo1(String value);

public  void setLogInfoIndex(long value);

public  void setLogInfo4(String value);

public  void setLogInfo3(String value);

public  void setGroupId(long value);

public  void setCreateDate(Timestamp value);

public  void setLogEventType(String value);

public  void setLogType(long value);

public  void setBatchDealId(String value);

public  void setCreateOrgId(long value);

public  void setLogId(long value);

public  void setLogLevel(long value);
}
