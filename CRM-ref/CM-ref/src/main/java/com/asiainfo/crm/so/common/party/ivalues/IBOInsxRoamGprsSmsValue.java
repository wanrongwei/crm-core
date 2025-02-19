package com.asiainfo.crm.so.common.party.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOInsxRoamGprsSmsValue extends DataStructInterface{

  public final static  String S_RecordType = "RECORD_TYPE";
  public final static  String S_Imsi = "IMSI";
  public final static  String S_Charge = "CHARGE";
  public final static  String S_FirstRemindFlag = "FIRST_REMIND_FLAG";
  public final static  String S_StartTime = "START_TIME";
  public final static  String S_TotalVolume = "TOTAL_VOLUME";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OriginalFile = "ORIGINAL_FILE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_StopTime = "STOP_TIME";
  public final static  String S_TimeZoneId = "TIME_ZONE_ID";
  public final static  String S_Duration = "DURATION";
  public final static  String S_Vplmn = "VPLMN";


public int getRecordType();

public String getImsi();

public long getCharge();

public int getFirstRemindFlag();

public Timestamp getStartTime();

public long getTotalVolume();

public String getRegionId();

public String getOriginalFile();

public String getBillId();

public Timestamp getStopTime();

public String getTimeZoneId();

public long getDuration();

public String getVplmn();


public  void setRecordType(int value);

public  void setImsi(String value);

public  void setCharge(long value);

public  void setFirstRemindFlag(int value);

public  void setStartTime(Timestamp value);

public  void setTotalVolume(long value);

public  void setRegionId(String value);

public  void setOriginalFile(String value);

public  void setBillId(String value);

public  void setStopTime(Timestamp value);

public  void setTimeZoneId(String value);

public  void setDuration(long value);

public  void setVplmn(String value);
}
