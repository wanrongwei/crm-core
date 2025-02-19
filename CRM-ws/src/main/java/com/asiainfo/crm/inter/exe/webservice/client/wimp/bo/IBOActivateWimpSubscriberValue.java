package com.asiainfo.crm.inter.exe.webservice.client.wimp.bo;
import com.ai.appframe2.common.DataStructInterface;

import java.sql.Date;
import java.sql.Timestamp;
public interface IBOActivateWimpSubscriberValue extends DataStructInterface{

  public final static  String S_ExtractDate = "extract_date";
  public final static  String S_Username = "username";
  public final static  String S_ActivationDate = "activation_date";
  public final static  String S_Customerid = "customerid";
  public final static  String S_InsertTime = "insert_time";
  public final static  String S_Subscriberid = "subscriberId";
  public final static  String S_LastStreamDate = "last_stream_date";
  public final static  String S_Filedate = "filedate";


public Date getExtractDate();

public String getUsername();

public Date getActivationDate();

public String getCustomerid();

public Timestamp getInsertTime();

public long getSubscriberid();

public Date getLastStreamDate();

public String getFiledate();


public  void setExtractDate(Date value);

public  void setUsername(String value);

public  void setActivationDate(Date value);

public  void setCustomerid(String value);

public  void setInsertTime(Timestamp value);

public  void setSubscriberid(long value);

public  void setLastStreamDate(Date value);

public  void setFiledate(String value);
}
