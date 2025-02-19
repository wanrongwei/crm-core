package com.asiainfo.crm.cm.dk.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmAcctContactValue extends DataStructInterface{

  public final static  String S_AddressId = "ADDRESS_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ContactName = "CONTACT_NAME";
  public final static  String S_AddressDetail = "ADDRESS_DETAIL";
  public final static  String S_MobilePhone = "MOBILE_PHONE";
  public final static  String S_Operation = "OPERATION";
  public final static  String S_Email = "EMAIL";
  public final static  String S_EffectiveWay = "EFFECTIVE_WAY";
  public final static  String S_ContactId = "CONTACT_ID";
  public final static  String S_ContactType = "CONTACT_TYPE";


public String getAddressId();

public Timestamp getEffectiveDate();

public String getContactName();

public String getAddressDetail();

public String getMobilePhone();

public String getOperation();

public String getEmail();

public String getEffectiveWay();

public long getContactId();

public int getContactType();


public  void setAddressId(String value);

public  void setEffectiveDate(Timestamp value);

public  void setContactName(String value);

public  void setAddressDetail(String value);

public  void setMobilePhone(String value);

public  void setOperation(String value);

public  void setEmail(String value);

public  void setEffectiveWay(String value);

public  void setContactId(long value);

public  void setContactType(int value);
}
