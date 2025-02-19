package com.asiainfo.crm.cm.customer.indiv.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmCustomerContactValue extends DataStructInterface{

  public final static  String S_AddressId = "ADDRESS_ID";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_CustId = "CUST_ID";


public long getAddressId();

public String getCustName();

public long getCustId();


public  void setAddressId(long value);

public  void setCustName(String value);

public  void setCustId(long value);
}
