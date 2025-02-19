package com.asiainfo.crm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;

public interface IBOBsSoOrdDepositeCfgValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_DealService = "DEAL_SERVICE";
  public final static  String S_ConfigId = "CONFIG_ID";
  public final static  String S_OfferId = "OFFER_ID";
  public final static  String S_CheckService = "CHECK_SERVICE";
  public final static  String S_AttrId = "ATTR_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ServiceId = "SERVICE_ID";
  public final static  String S_BusinessId = "BUSINESS_ID";
  public final static  String S_ProductType = "PRODUCT_TYPE";
  public final static  String S_ProductId = "PRODUCT_ID";
  public final static  String S_OfferType = "OFFER_TYPE";


public String getState();

public String getDealService();

public int getConfigId();

public long getOfferId();

public String getCheckService();

public long getAttrId();

public String getRemarks();

public long getServiceId();

public long getBusinessId();

public String getProductType();

public long getProductId();

public String getOfferType();


public  void setState(String value);

public  void setDealService(String value);

public  void setConfigId(int value);

public  void setOfferId(long value);

public  void setCheckService(String value);

public  void setAttrId(long value);

public  void setRemarks(String value);

public  void setServiceId(long value);

public  void setBusinessId(long value);

public  void setProductType(String value);

public  void setProductId(long value);

public  void setOfferType(String value);
}
