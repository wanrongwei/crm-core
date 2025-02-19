package com.asiainfo.crm.inter.exe.webservice.client.cpr.log.ivalues;
import com.ai.appframe2.common.DataStructInterface; 
import java.sql.Timestamp;
public interface IBOInterCallLogValue extends DataStructInterface{

  public final static  String S_LogId = "LOG_ID";
  public final static  String S_CallDescrip = "CALL_DESCRIP";
  public final static  String S_Pnr = "PNR";
  public final static  String S_CallState = "CALL_STATE";
  public final static  String S_CallTime = "CALL_TIME";


public long getLogId();

public String getCallDescrip();

public String getPnr();

public String getCallState();

public Timestamp getCallTime();


public  void setLogId(long value);

public  void setCallDescrip(String value);

public  void setPnr(String value);

public  void setCallState(String value);

public  void setCallTime(Timestamp value);
}
