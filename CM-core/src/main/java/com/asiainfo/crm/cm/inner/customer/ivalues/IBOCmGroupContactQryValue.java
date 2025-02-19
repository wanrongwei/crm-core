package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupContactQryValue extends DataStructInterface{

  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_ContNameQry = "CONT_NAME_QRY";
  public final static  String S_ContName = "CONT_NAME";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_LastName = "LAST_NAME";


public String getFirstName();

public long getCustId();

public String getMiddleName();

public String getLastNameQry();

public long getContId();

public String getFirstNameQry();

public String getContNameQry();

public String getContName();

public String getMiddleNameQry();

public String getLastName();


public  void setFirstName(String value);

public  void setCustId(long value);

public  void setMiddleName(String value);

public  void setLastNameQry(String value);

public  void setContId(long value);

public  void setFirstNameQry(String value);

public  void setContNameQry(String value);

public  void setContName(String value);

public  void setMiddleNameQry(String value);

public  void setLastName(String value);
}
