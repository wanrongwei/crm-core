package com.asiainfo.crm.so.common.party.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBORcmdServiceValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_OfferName = "OFFER_NAME";
  public final static  String S_Quarter = "QUARTER";
  public final static  String S_Year = "YEAR";
  public final static  String S_Status = "STATUS";
  public final static  String S_ServiceId = "SERVICE_ID";
  public final static  String S_FeeType = "FEE_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_Result = "RESULT";
  public final static  String S_BatchId = "BATCH_ID";
  public final static  String S_BaseFee = "BASE_FEE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OfferId = "OFFER_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OfferDesc = "OFFER_DESC";
  public final static  String S_ServiceType = "SERVICE_TYPE";
  public final static  String S_Month = "MONTH";


public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getOfferName();

public String getQuarter();

public String getYear();

public int getStatus();

public long getServiceId();

public int getFeeType();

public long getOrgId();

public String getResult();

public String getBatchId();

public String getBaseFee();

public Timestamp getDoneDate();

public long getOfferId();

public Timestamp getCreateDate();

public long getDoneCode();

public String getOfferDesc();

public long getServiceType();

public String getMonth();


public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setOfferName(String value);

public  void setQuarter(String value);

public  void setYear(String value);

public  void setStatus(int value);

public  void setServiceId(long value);

public  void setFeeType(int value);

public  void setOrgId(long value);

public  void setResult(String value);

public  void setBatchId(String value);

public  void setBaseFee(String value);

public  void setDoneDate(Timestamp value);

public  void setOfferId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setOfferDesc(String value);

public  void setServiceType(long value);

public  void setMonth(String value);
}
