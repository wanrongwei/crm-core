package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCreditMappingValue extends DataStructInterface{

  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";


public String getRegionId();

public long getCreditValue();

public int getCustType();

public int getCreditLevel();


public  void setRegionId(String value);

public  void setCreditValue(long value);

public  void setCustType(int value);

public  void setCreditLevel(int value);
}
