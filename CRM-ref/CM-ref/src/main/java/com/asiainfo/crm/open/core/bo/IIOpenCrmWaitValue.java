package com.asiainfo.crm.open.core.bo;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IIOpenCrmWaitValue extends DataStructInterface{

  public final static  String S_Reamark = "REAMARK";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_TotalCount = "TOTAL_COUNT";
  public final static  String S_Status = "STATUS";
  public final static  String S_CompleteDate = "COMPLETE_DATE";
  public final static  String S_OrderId = "ORDER_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_RemainCount = "REMAIN_COUNT";
  public final static  String S_TaskId = "TASK_ID";


public String getReamark();

public long getUserId();

public long getTotalCount();

public String getStatus();

public Timestamp getCompleteDate();

public long getOrderId();

public Timestamp getCreateDate();

public long getDoneCode();

public String getExt1();

public String getExt2();

public String getExt3();

public long getRemainCount();

public String getTaskId();


public  void setReamark(String value);

public  void setUserId(long value);

public  void setTotalCount(long value);

public  void setStatus(String value);

public  void setCompleteDate(Timestamp value);

public  void setOrderId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setExt3(String value);

public  void setRemainCount(long value);

public  void setTaskId(String value);
}
