package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmVipScoreRuleValue extends DataStructInterface{

  public final static  String S_OnlineTime = "ONLINE_TIME";
  public final static  String S_NeedScore = "NEED_SCORE";
  public final static  String S_Id = "ID";
  public final static  String S_ServiceType = "SERVICE_TYPE";
  public final static  String S_ServiceLevel = "SERVICE_LEVEL";
  public final static  String S_Notes = "NOTES";
  public final static  String S_IsVip = "IS_VIP";


public int getOnlineTime();

public long getNeedScore();

public long getId();

public int getServiceType();

public int getServiceLevel();

public String getNotes();

public int getIsVip();


public  void setOnlineTime(int value);

public  void setNeedScore(long value);

public  void setId(long value);

public  void setServiceType(int value);

public  void setServiceLevel(int value);

public  void setNotes(String value);

public  void setIsVip(int value);
}
