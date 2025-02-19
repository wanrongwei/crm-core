package com.asiainfo.crm.cm.dk.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmPayChannelValue extends DataStructInterface{

  public final static  String S_Cvr = "CVR";
  public final static  String S_CardType = "CARD_TYPE";
  public final static  String S_Cpr = "CPR";
  public final static  String S_CardExpiryDate = "CARD_EXPIRY_DATE";
  public final static  String S_ChId = "CH_ID";
  public final static  String S_PbsEffDate = "PBS_EFF_DATE";
  public final static  String S_ExpiryDate = "EXPIRY_DATE";
  public final static  String S_PbsSts = "PBS_STS";
  public final static  String S_CardId = "CARD_ID";
  public final static  String S_CardTypeName = "CARD_TYPE_NAME";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_PaymentType = "PAYMENT_TYPE";
  public final static  String S_BankId = "BANK_ID";
  public final static  String S_FastPayment = "FAST_PAYMENT";
  public final static  String S_Fee = "FEE";


public String getCvr();

public int getCardType();

public String getCpr();

public String getCardExpiryDate();

public String getChId();

public Timestamp getPbsEffDate();

public Timestamp getExpiryDate();

public int getPbsSts();

public String getCardId();

public String getCardTypeName();

public long getAcctId();

public int getPaymentType();

public String getBankId();

public int getFastPayment();

public String getFee();


public  void setCvr(String value);

public  void setCardType(int value);

public  void setCpr(String value);

public  void setCardExpiryDate(String value);

public  void setChId(String value);

public  void setPbsEffDate(Timestamp value);

public  void setExpiryDate(Timestamp value);

public  void setPbsSts(int value);

public  void setCardId(String value);

public  void setCardTypeName(String value);

public  void setAcctId(long value);

public  void setPaymentType(int value);

public  void setBankId(String value);

public  void setFastPayment(int value);

public  void setFee(String value);
}
