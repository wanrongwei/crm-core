package com.asiainfo.crm.inter.sms.so.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOSmsBatchPendingTempValue extends DataStructInterface{

  public final static  String S_Area = "AREA";
  public final static  String S_Senddate = "SENDDATE";
  public final static  String S_Sendflag = "SENDFLAG";
  public final static  String S_BatchTaskSeq = "BATCH_TASK_SEQ";
  public final static  String S_TemplateId = "TEMPLATE_ID";
  public final static  String S_Pri = "PRI";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_Port = "PORT";
  public final static  String S_Destnum = "DESTNUM";
  public final static  String S_Optcode = "OPTCODE";
  public final static  String S_Optsn = "OPTSN";
  public final static  String S_Srctype = "SRCTYPE";
  public final static  String S_CompleteMsg = "COMPLETE_MSG";
  public final static  String S_MediaTaskId = "MEDIA_TASK_ID";
  public final static  String S_Optdate = "OPTDATE";
  public final static  String S_Rtndata = "RTNDATA";
  public final static  String S_Smstype = "SMSTYPE";


public String getArea();

public Timestamp getSenddate();

public String getSendflag();

public String getBatchTaskSeq();

public String getTemplateId();

public String getPri();

public String getRegionId();

public String getPort();

public String getDestnum();

public String getOptcode();

public String getOptsn();

public String getSrctype();

public String getCompleteMsg();

public String getMediaTaskId();

public Timestamp getOptdate();

public String getRtndata();

public String getSmstype();


public  void setArea(String value);

public  void setSenddate(Timestamp value);

public  void setSendflag(String value);

public  void setBatchTaskSeq(String value);

public  void setTemplateId(String value);

public  void setPri(String value);

public  void setRegionId(String value);

public  void setPort(String value);

public  void setDestnum(String value);

public  void setOptcode(String value);

public  void setOptsn(String value);

public  void setSrctype(String value);

public  void setCompleteMsg(String value);

public  void setMediaTaskId(String value);

public  void setOptdate(Timestamp value);

public  void setRtndata(String value);

public  void setSmstype(String value);
}
