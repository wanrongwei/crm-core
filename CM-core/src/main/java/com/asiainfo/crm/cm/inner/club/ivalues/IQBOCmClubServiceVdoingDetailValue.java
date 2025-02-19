package com.asiainfo.crm.cm.inner.club.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmClubServiceVdoingDetailValue extends DataStructInterface{

  public final static  String S_DefaultTimes = "DEFAULT_TIMES";
  public final static  String S_DimensionType = "DIMENSION_TYPE";
  public final static  String S_DimensionWeight = "DIMENSION_WEIGHT";
  public final static  String S_DimensionId = "DIMENSION_ID";
  public final static  String S_TotalTimes = "TOTAL_TIMES";
  public final static  String S_ServiceId = "SERVICE_ID";
  public final static  String S_DetailId = "DETAIL_ID";
  public final static  String S_DetailType = "DETAIL_TYPE";


public int getDefaultTimes();

public int getDimensionType();

public int getDimensionWeight();

public long getDimensionId();

public int getTotalTimes();

public long getServiceId();

public long getDetailId();

public String getDetailType();


public  void setDefaultTimes(int value);

public  void setDimensionType(int value);

public  void setDimensionWeight(int value);

public  void setDimensionId(long value);

public  void setTotalTimes(int value);

public  void setServiceId(long value);

public  void setDetailId(long value);

public  void setDetailType(String value);
}
