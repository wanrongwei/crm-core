package com.asiainfo.crm.so.common.bboss.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOBbossStopReplyDealValue extends DataStructInterface{

  public final static  String S_NumExt3 = "NUM_EXT3";
  public final static  String S_RegionCode = "REGION_CODE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_Notes = "NOTES";
  public final static  String S_NumExt4 = "NUM_EXT4";
  public final static  String S_CurActionId = "CUR_ACTION_ID";
  public final static  String S_StrExt2 = "STR_EXT2";
  public final static  String S_CustomerOrderId = "CUSTOMER_ORDER_ID";
  public final static  String S_IsstopStatus = "ISSTOP_STATUS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_SendmsgDate = "SENDMSG_DATE";
  public final static  String S_SendmsgAlertDate = "SENDMSG_ALERT_DATE";
  public final static  String S_IssendStatus = "ISSEND_STATUS";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_StrExt1 = "STR_EXT1";
  public final static  String S_AccId = "ACC_ID";
  public final static  String S_StopDate = "STOP_DATE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_ActionStatus = "ACTION_STATUS";


public long getNumExt3();

public long getRegionCode();

public Timestamp getDoneDate();

public long getGroupId();

public String getNotes();

public long getNumExt4();

public int getCurActionId();

public String getStrExt2();

public long getCustomerOrderId();

public int getIsstopStatus();

public Timestamp getCreateDate();

public Timestamp getSendmsgDate();

public Timestamp getSendmsgAlertDate();

public int getIssendStatus();

public long getCountyCode();

public String getStrExt1();

public String getAccId();

public Timestamp getStopDate();

public String getUserId();

public String getBillId();

public int getActionStatus();


public  void setNumExt3(long value);

public  void setRegionCode(long value);

public  void setDoneDate(Timestamp value);

public  void setGroupId(long value);

public  void setNotes(String value);

public  void setNumExt4(long value);

public  void setCurActionId(int value);

public  void setStrExt2(String value);

public  void setCustomerOrderId(long value);

public  void setIsstopStatus(int value);

public  void setCreateDate(Timestamp value);

public  void setSendmsgDate(Timestamp value);

public  void setSendmsgAlertDate(Timestamp value);

public  void setIssendStatus(int value);

public  void setCountyCode(long value);

public  void setStrExt1(String value);

public  void setAccId(String value);

public  void setStopDate(Timestamp value);

public  void setUserId(String value);

public  void setBillId(String value);

public  void setActionStatus(int value);
}
