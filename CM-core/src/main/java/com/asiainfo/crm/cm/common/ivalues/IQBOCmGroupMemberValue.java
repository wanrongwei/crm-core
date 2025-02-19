package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmGroupMemberValue extends DataStructInterface{

  public final static  String S_CityId = "CITY_ID";
  public final static  String S_CustServiceId = "CUST_SERVICE_ID";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_MemberNameQry = "MEMBER_NAME_QRY";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_MemberName = "MEMBER_NAME";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_MemberType = "MEMBER_TYPE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CustServiceLevel = "CUST_SERVICE_LEVEL";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_Brand = "BRAND";


public String getCityId();

public String getCustServiceId();

public String getLastNameQry();

public String getLastName();

public String getCustName();

public String getMemberNameQry();

public String getFirstName();

public long getCustId();

public String getMiddleName();

public String getCountyId();

public String getMemberName();

public String getFirstNameQry();

public long getMemberType();

public String getBillId();

public long getCustServiceLevel();

public Timestamp getCreateDate();

public String getMiddleNameQry();

public String getBrand();


public  void setCityId(String value);

public  void setCustServiceId(String value);

public  void setLastNameQry(String value);

public  void setLastName(String value);

public  void setCustName(String value);

public  void setMemberNameQry(String value);

public  void setFirstName(String value);

public  void setCustId(long value);

public  void setMiddleName(String value);

public  void setCountyId(String value);

public  void setMemberName(String value);

public  void setFirstNameQry(String value);

public  void setMemberType(long value);

public  void setBillId(String value);

public  void setCustServiceLevel(long value);

public  void setCreateDate(Timestamp value);

public  void setMiddleNameQry(String value);

public  void setBrand(String value);
}
