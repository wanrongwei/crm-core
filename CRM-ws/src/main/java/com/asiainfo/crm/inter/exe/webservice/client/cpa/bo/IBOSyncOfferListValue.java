package com.asiainfo.crm.inter.exe.webservice.client.cpa.bo;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOSyncOfferListValue extends DataStructInterface{

  public final static  String S_Offername = "offerName";
  public final static  String S_Offerid = "offerId";


public String getOffername();

public String getOfferid();


public  void setOffername(String value);

public  void setOfferid(String value);
}
