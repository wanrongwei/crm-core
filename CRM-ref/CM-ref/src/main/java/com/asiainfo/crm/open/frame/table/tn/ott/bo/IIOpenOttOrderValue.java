package com.asiainfo.crm.open.frame.table.tn.ott.bo;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IIOpenOttOrderValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_HandDate = "HAND_DATE";
  public final static  String S_Acceptdate = "ACCEPTDATE";
  public final static  String S_Mainserverid = "MAINSERVERID";
  public final static  String S_FinishDate = "FINISH_DATE";
  public final static  String S_Locality = "LOCALITY";
  public final static  String S_Tradetypecode = "TRADETYPECODE";
  public final static  String S_Orignalsonbr = "ORIGNALSONBR";
  public final static  String S_Countrycode = "COUNTRYCODE";
  public final static  String S_Sonbr = "SONBR";
  public final static  String S_Ext5 = "EXT5";
  public final static  String S_OrderNbr = "ORDER_NBR";
  public final static  String S_Relasonbr = "RELASONBR";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Sotype = "SOTYPE";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_Ext4 = "EXT4";
  public final static  String S_Receipt = "RECEIPT";


public long getState();

public Timestamp getHandDate();

public Timestamp getAcceptdate();

public String getMainserverid();

public Timestamp getFinishDate();

public String getLocality();

public long getTradetypecode();

public String getOrignalsonbr();

public String getCountrycode();

public long getSonbr();

public String getExt5();

public long getOrderNbr();

public String getRelasonbr();

public Timestamp getCreateDate();

public String getExt1();

public long getSotype();

public String getExt2();

public String getExt3();

public String getExt4();


public  void setState(long value);

public  void setHandDate(Timestamp value);

public  void setAcceptdate(Timestamp value);

public  void setMainserverid(String value);

public  void setFinishDate(Timestamp value);

public  void setLocality(String value);

public  void setTradetypecode(long value);

public  void setOrignalsonbr(String value);

public  void setCountrycode(String value);

public  void setSonbr(long value);

public  void setExt5(String value);

public  void setOrderNbr(long value);

public  void setRelasonbr(String value);

public  void setCreateDate(Timestamp value);

public  void setExt1(String value);

public  void setSotype(long value);

public  void setExt2(String value);

public  void setExt3(String value);

public  void setExt4(String value);

public String getReceipt();

public void setReceipt(String c);
}
