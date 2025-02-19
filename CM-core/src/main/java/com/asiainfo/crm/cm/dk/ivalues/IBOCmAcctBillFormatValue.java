package com.asiainfo.crm.cm.dk.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmAcctBillFormatValue extends DataStructInterface{

  public final static  String S_OioOrderCode = "OIO_ORDER_CODE";
  public final static  String S_BillFormat = "BILL_FORMAT";
  public final static  String S_OioUblProfile = "OIO_UBL_PROFILE";
  public final static  String S_SidePrinting = "SIDE_PRINTING";
  public final static  String S_Language = "LANGUAGE";
  public final static  String S_Ean = "EAN";
  public final static  String S_IsCharge = "IS_CHARGE";
  public final static  String S_PrintBill = "PRINT_BILL";
  public final static  String S_EanQualificator = "EAN_QUALIFICATOR";
  public final static  String S_OioUtsProfile = "OIO_UTS_PROFILE";
  public final static  String S_OioCotactName = "OIO_COTACT_NAME";
  public final static  String S_DeliveryMethod = "DELIVERY_METHOD";
  public final static  String S_DueDays = "DUE_DAYS";
  public final static  String S_EffectiveMethod = "EFFECTIVE_METHOD";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_OioAccountCode = "OIO_ACCOUNT_CODE";
  public final static  String S_BillingType = "BILLING_TYPE";
  public final static  String S_Fee = "FEE";
  public final static  String S_SendPdf = "SEND_PDF";


public String getOioOrderCode();

public String getBillFormat();

public String getOioUblProfile();

public String getSidePrinting();

public int getLanguage();

public String getEan();

public int getIsCharge();

public int getPrintBill();

public int getSendPdf();

public String getEanQualificator();

public String getOioUtsProfile();

public String getOioCotactName();

public int getDeliveryMethod();

public String getDueDays();

public String getEffectiveMethod();

public long getAcctId();

public String getOioAccountCode();

public int getBillingType();

public String getFee();


public  void setOioOrderCode(String value);

public  void setBillFormat(String value);

public  void setOioUblProfile(String value);

public  void setSidePrinting(String value);

public  void setLanguage(int value);

public  void setEan(String value);

public  void setIsCharge(int value);

public  void setPrintBill(int value);

public  void setSendPdf(int value);

public  void setEanQualificator(String value);

public  void setOioUtsProfile(String value);

public  void setOioCotactName(String value);

public  void setDeliveryMethod(int value);

public  void setDueDays(String value);

public  void setEffectiveMethod(String value);

public  void setAcctId(long value);

public  void setOioAccountCode(String value);

public  void setBillingType(int value);

public  void setFee(String value);
}
