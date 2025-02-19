package com.asiainfo.crm.ci.spec.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCiChannelValue extends DataStructInterface{

  public final static  String S_OpId = "OP_ID";
  public final static  String S_ChannelId = "CHANNEL_ID";
  public final static  String S_EventMaxTryTimes = "EVENT_MAX_TRY_TIMES";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ChannelCode = "CHANNEL_CODE";
  public final static  String S_EventFireInterval = "EVENT_FIRE_INTERVAL";
  public final static  String S_Remark = "REMARK";
  public final static  String S_ContactTimeout = "CONTACT_TIMEOUT";
  public final static  String S_ChannelNameI18n = "CHANNEL_NAME_I18N";
  public final static  String S_ChannelName = "CHANNEL_NAME";
  public final static  String S_OrgId = "ORG_ID";


public long getOpId();

public long getChannelId();

public long getEventMaxTryTimes();

public Timestamp getDoneDate();

public String getChannelCode();

public long getEventFireInterval();

public String getRemark();

public long getContactTimeout();

public String getChannelNameI18n();

public String getChannelName();

public long getOrgId();


public  void setOpId(long value);

public  void setChannelId(long value);

public  void setEventMaxTryTimes(long value);

public  void setDoneDate(Timestamp value);

public  void setChannelCode(String value);

public  void setEventFireInterval(long value);

public  void setRemark(String value);

public  void setContactTimeout(long value);

public  void setChannelNameI18n(String value);

public  void setChannelName(String value);

public  void setOrgId(long value);
}
