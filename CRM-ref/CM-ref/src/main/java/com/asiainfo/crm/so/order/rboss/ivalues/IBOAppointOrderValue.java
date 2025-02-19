package com.asiainfo.crm.so.order.rboss.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOAppointOrderValue extends DataStructInterface{

  public final static  String S_AppointTime = "APPOINT_TIME";
  public final static  String S_OrderType = "ORDER_TYPE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_BusinessId = "BUSINESS_ID";
  public final static  String S_State = "STATE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_ProductId = "PRODUCT_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_AppointId = "APPOINT_ID";
  public final static  String S_ExtOffer = "EXT_OFFER";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OfferId = "OFFER_ID";
  public final static  String S_ProdInstId = "PROD_INST_ID";
  public final static  String S_CustomerOrderId = "CUSTOMER_ORDER_ID";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_ServeId = "SERVE_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OfferInstId = "OFFER_INST_ID";


public Timestamp getAppointTime();

public String getOrderType();

public long getOpId();

public long getBusinessId();

public String getState();

public long getUserId();

public long getProductId();

public String getRemarks();

public long getOrgId();

public String getRegionId();

public long getAppointId();

public String getExtOffer();

public long getAcctId();

public long getCustId();

public Timestamp getDoneDate();

public long getOfferId();

public long getProdInstId();

public long getCustomerOrderId();

public String getBillId();

public long getServeId();

public Timestamp getCreateDate();

public long getDoneCode();

public long getOfferInstId();


public  void setAppointTime(Timestamp value);

public  void setOrderType(String value);

public  void setOpId(long value);

public  void setBusinessId(long value);

public  void setState(String value);

public  void setUserId(long value);

public  void setProductId(long value);

public  void setRemarks(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setAppointId(long value);

public  void setExtOffer(String value);

public  void setAcctId(long value);

public  void setCustId(long value);

public  void setDoneDate(Timestamp value);

public  void setOfferId(long value);

public  void setProdInstId(long value);

public  void setCustomerOrderId(long value);

public  void setBillId(String value);

public  void setServeId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setOfferInstId(long value);
}
