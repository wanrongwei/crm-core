package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxCustserviceRelValue extends DataStructInterface{

  public final static  String S_ManagerId = "MANAGER_ID";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_CityCode = "CITY_CODE";
  public final static  String S_CountyName = "COUNTY_NAME";
  public final static  String S_CityName = "CITY_NAME";


public long getManagerId();

public String getCountyCode();

public String getCityCode();

public String getCountyName();

public String getCityName();


public  void setManagerId(long value);

public  void setCountyCode(String value);

public  void setCityCode(String value);

public  void setCountyName(String value);

public  void setCityName(String value);
}
