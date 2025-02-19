package com.asiainfo.crm.agreement.monitor.calculate.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOAgrUsrProductRelaValue extends DataStructInterface{

  public final static  String S_CycleType = "CYCLE_TYPE";
  public final static  String S_RelaId = "RELA_ID";
  public final static  String S_State = "STATE";
  public final static  String S_CycleUnit = "CYCLE_UNIT";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_ProductId = "PRODUCT_ID";
  public final static  String S_CustomerId = "CUSTOMER_ID";
  public final static  String S_FirstBillDate = "FIRST_BILL_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_AgreementId = "AGREEMENT_ID";


public String getCycleType();

public long getRelaId();

public long getState();

public long getCycleUnit();

public String getUserId();

public String getProductId();

public long getCustomerId();

public String getFirstBillDate();

public Timestamp getCreateDate();

public long getAgreementId();


public  void setCycleType(String value);

public  void setRelaId(long value);

public  void setState(long value);

public  void setCycleUnit(long value);

public  void setUserId(String value);

public  void setProductId(String value);

public  void setCustomerId(long value);

public  void setFirstBillDate(String value);

public  void setCreateDate(Timestamp value);

public  void setAgreementId(long value);
}
