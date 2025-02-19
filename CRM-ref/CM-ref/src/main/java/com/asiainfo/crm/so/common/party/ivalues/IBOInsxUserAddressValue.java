package com.asiainfo.crm.so.common.party.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOInsxUserAddressValue extends DataStructInterface{

  public final static  String S_AddressId = "ADDRESS_ID";
  public final static  String S_MunicipalCode = "MUNICIPAL_CODE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_DoorNo = "DOOR_NO";
  public final static  String S_UpdateDate = "UPDATE_DATE";
  public final static  String S_LineProductInfo = "LINE_PRODUCT_INFO";
  public final static  String S_RelatCustomerOrderId = "RELAT_CUSTOMER_ORDER_ID";
  public final static  String S_Street = "STREET";
  public final static  String S_MainDoor = "MAIN_DOOR";
  public final static  String S_County = "COUNTY";
  public final static  String S_CoInfo = "CO_INFO";
  public final static  String S_Floor = "FLOOR";
  public final static  String S_CaptureInfo = "CAPTURE_INFO";
  public final static  String S_DetailAddr = "DETAIL_ADDR";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ZipCode = "ZIP_CODE";
  public final static  String S_HouseNo = "HOUSE_NO";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_Country = "COUNTRY";
  public final static  String S_PreAddressId = "PRE_ADDRESS_ID";
  public final static  String S_StandardAddrName = "STANDARD_ADDR_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_DistrictId = "DISTRICT_ID";
  public final static  String S_StandardAddrId = "STANDARD_ADDR_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_City = "CITY";
  public final static  String S_ExchangeId = "EXCHANGE_ID";


public long getAddressId();

public String getMunicipalCode();

public String getState();

public String getRemarks();

public String getDoorNo();

public Timestamp getUpdateDate();

public String getLineProductInfo();

public long getRelatCustomerOrderId();

public String getStreet();

public String getMainDoor();

public String getCounty();

public String getCoInfo();

public String getFloor();

public String getCaptureInfo();

public String getDetailAddr();

public long getOpId();

public String getZipCode();

public String getHouseNo();

public long getUserId();

public String getCountry();

public long getPreAddressId();

public String getStandardAddrName();

public long getOrgId();

public long getDistrictId();

public long getStandardAddrId();

public Timestamp getCreateDate();

public String getCity();

public String getExchangeId();


public  void setAddressId(long value);

public  void setMunicipalCode(String value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setDoorNo(String value);

public  void setUpdateDate(Timestamp value);

public  void setLineProductInfo(String value);

public  void setRelatCustomerOrderId(long value);

public  void setStreet(String value);

public  void setMainDoor(String value);

public  void setCounty(String value);

public  void setCoInfo(String value);

public  void setFloor(String value);

public  void setCaptureInfo(String value);

public  void setDetailAddr(String value);

public  void setOpId(long value);

public  void setZipCode(String value);

public  void setHouseNo(String value);

public  void setUserId(long value);

public  void setCountry(String value);

public  void setPreAddressId(long value);

public  void setStandardAddrName(String value);

public  void setOrgId(long value);

public  void setDistrictId(long value);

public  void setStandardAddrId(long value);

public  void setCreateDate(Timestamp value);

public  void setCity(String value);

public  void setExchangeId(String value);
}
