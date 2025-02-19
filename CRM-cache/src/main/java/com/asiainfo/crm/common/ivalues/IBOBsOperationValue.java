package com.asiainfo.crm.common.ivalues;

import com.ai.appframe2.common.DataStructInterface;

import java.sql.Timestamp;
public interface IBOBsOperationValue extends DataStructInterface{

  public final static  String S_BusinessId = "BUSINESS_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Name = "NAME";
  public final static  String S_IncomeType = "INCOME_TYPE";
  public final static  String S_ConMsgFlag = "CON_MSG_FLAG";
  public final static  String S_LogFlag = "LOG_FLAG";
  public final static  String S_StateDate = "STATE_DATE";
  public final static  String S_TemplateId = "TEMPLATE_ID";
  public final static  String S_ReverseBusinessId = "REVERSE_BUSINESS_ID";
  public final static  String S_SpanFlag = "SPAN_FLAG";
  public final static  String S_ChannelType = "CHANNEL_TYPE";
  public final static  String S_BillFlag = "BILL_FLAG";
  public final static  String S_SpanBusinessId = "SPAN_BUSINESS_ID";
  public final static  String S_FeeMsgFlag = "FEE_MSG_FLAG";
  public final static  String S_ModuleCode = "MODULE_CODE";
  public final static  String S_ReportFlag = "REPORT_FLAG";
  public final static  String S_PriLevel = "PRI_LEVEL";
  public final static  String S_Notes = "NOTES";


public long getBusinessId();

public String getState();

public String getName();

public int getIncomeType();

public String getConMsgFlag();

public String getLogFlag();

public Timestamp getStateDate();

public String getTemplateId();

public long getReverseBusinessId();

public String getSpanFlag();

public int getChannelType();

public String getBillFlag();

public long getSpanBusinessId();

public String getFeeMsgFlag();

public String getModuleCode();

public String getReportFlag();

public int getPriLevel();

public String getNotes();


public  void setBusinessId(long value);

public  void setState(String value);

public  void setName(String value);

public  void setIncomeType(int value);

public  void setConMsgFlag(String value);

public  void setLogFlag(String value);

public  void setStateDate(Timestamp value);

public  void setTemplateId(String value);

public  void setReverseBusinessId(long value);

public  void setSpanFlag(String value);

public  void setChannelType(int value);

public  void setBillFlag(String value);

public  void setSpanBusinessId(long value);

public  void setFeeMsgFlag(String value);

public  void setModuleCode(String value);

public  void setReportFlag(String value);

public  void setPriLevel(int value);

public  void setNotes(String value);
}
