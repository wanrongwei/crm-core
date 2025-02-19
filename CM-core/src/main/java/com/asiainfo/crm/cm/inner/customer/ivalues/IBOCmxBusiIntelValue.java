package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxBusiIntelValue extends DataStructInterface{

  public final static  String S_TollFee = "TOLL_FEE";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_IndivCustType = "INDIV_CUST_TYPE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_OfferName = "OFFER_NAME";
  public final static  String S_Occupation = "OCCUPATION";
  public final static  String S_EndDate = "END_DATE";
  public final static  String S_BrandName = "BRAND_NAME";
  public final static  String S_NewbusiName = "NEWBUSI_NAME";
  public final static  String S_RoamFee = "ROAM_FEE";
  public final static  String S_ScoreSumReduce = "SCORE_SUM_REDUCE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_NewbusiInfo = "NEWBUSI_INFO";
  public final static  String S_StartDate = "START_DATE";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_OpTime = "OP_TIME";
  public final static  String S_TotalFee = "TOTAL_FEE";
  public final static  String S_Imei = "IMEI";
  public final static  String S_ResType = "RES_TYPE";
  public final static  String S_BasecallFee = "BASECALL_FEE";
  public final static  String S_NewbusiFee = "NEWBUSI_FEE";
  public final static  String S_FactoryId = "FACTORY_ID";
  public final static  String S_ElseFee = "ELSE_FEE";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";


public String getTollFee();

public Timestamp getBirthday();

public String getIndivCustType();

public long getUserId();

public String getOfferName();

public int getOccupation();

public Timestamp getEndDate();

public String getBrandName();

public String getNewbusiName();

public String getRoamFee();

public long getScoreSumReduce();

public String getRegionId();

public String getNewbusiInfo();

public Timestamp getStartDate();

public String getCustName();

public String getOpTime();

public String getTotalFee();

public String getImei();

public String getResType();

public String getBasecallFee();

public String getNewbusiFee();

public String getFactoryId();

public String getElseFee();

public int getCreditLevel();


public  void setTollFee(String value);

public  void setBirthday(Timestamp value);

public  void setIndivCustType(String value);

public  void setUserId(long value);

public  void setOfferName(String value);

public  void setOccupation(int value);

public  void setEndDate(Timestamp value);

public  void setBrandName(String value);

public  void setNewbusiName(String value);

public  void setRoamFee(String value);

public  void setScoreSumReduce(long value);

public  void setRegionId(String value);

public  void setNewbusiInfo(String value);

public  void setStartDate(Timestamp value);

public  void setCustName(String value);

public  void setOpTime(String value);

public  void setTotalFee(String value);

public  void setImei(String value);

public  void setResType(String value);

public  void setBasecallFee(String value);

public  void setNewbusiFee(String value);

public  void setFactoryId(String value);

public  void setElseFee(String value);

public  void setCreditLevel(int value);
}
