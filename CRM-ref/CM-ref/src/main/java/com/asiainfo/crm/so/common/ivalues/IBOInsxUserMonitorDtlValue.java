package com.asiainfo.crm.so.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOInsxUserMonitorDtlValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_MonitorBusi = "MONITOR_BUSI";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_OrderId = "ORDER_ID";
  public final static  String S_MonitorServ = "MONITOR_SERV";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_RegionCode = "REGION_CODE";


public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public long getUserId();

public String getRemarks();

public long getMonitorBusi();

public long getOrgId();

public long getOrderId();

public long getMonitorServ();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public long getDoneCode();

public String getRegionCode();


public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setUserId(long value);

public  void setRemarks(String value);

public  void setMonitorBusi(long value);

public  void setOrgId(long value);

public  void setOrderId(long value);

public  void setMonitorServ(long value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setRegionCode(String value);
}
