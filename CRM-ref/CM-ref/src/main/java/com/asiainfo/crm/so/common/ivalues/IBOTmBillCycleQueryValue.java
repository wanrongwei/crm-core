package com.asiainfo.crm.so.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.common.DataType;

import java.sql.Timestamp;
import java.util.ArrayList;
public interface IBOTmBillCycleQueryValue extends DataStructInterface{
	
  public final static  String S_OfferId = "OFFERID";
  public final static  String S_OfferInstId = "OFFERINSTID";
  public final static  String S_BusinessId = "BUSINESSID";
  public final static  String S_InstallmentFlag = "INSTALLMENTFLAG";
  public final static  String S_EffInfo = "EFFINFO";
  public final static  String S_Reason = "REASON";

public String getOfferId();

public String getOfferInstId();

public String getBusinessId();

public String getInstallmentFlag();

public String getEffInfo();

public String getReason();



public  void setOfferId(String value);

public  void setOfferInstId(String value);

public  void setBusinessId(String value);

public  void setInstallmentFlag(String value);

public  void setEffInfo(String value);

public  void setReason(String value);

  void setIccID(String value);
  String getIccID();
  void setMaterialID(String value);
  String getMaterialID();
}
