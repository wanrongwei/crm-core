package com.asiainfo.crm.so.common.bboss.ivalues;
import com.ai.appframe2.common.DataStructInterface;

public interface IBOOrdNpOngoingValue extends DataStructInterface{

  public final static  String S_SeqId = "seq_ID";
  public final static  String S_OrderId = "order_ID";
  public final static  String S_OfferStp = "offer_STP";
  public final static  String S_State = "state";
  public final static  String S_Profileid = "ProfileId";
  public final static  String S_BillId = "bill_id";


public long getSeqId();

public long getOrderId();

public String getOfferStp();

public String getState();

public String getProfileid();

public String getBillId();


public  void setSeqId(long value);

public  void setOrderId(long value);

public  void setOfferStp(String value);

public  void setState(String value);

public  void setProfileid(String value);

public  void setBillId(String value);
}
