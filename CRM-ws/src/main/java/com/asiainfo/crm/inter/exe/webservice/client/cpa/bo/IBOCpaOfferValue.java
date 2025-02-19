package com.asiainfo.crm.inter.exe.webservice.client.cpa.bo;
import java.sql.Timestamp;

import com.ai.appframe2.common.DataStructInterface;
public interface IBOCpaOfferValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_OfferName = "OFFER_NAME";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OfferId = "OFFER_ID";
  public final static  String S_OfferSeq = "OFFER_SEQ";
  public final static  String S_Ext5 = "EXT5";
  public final static  String S_StateDate = "STATE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_Ext4 = "EXT4";


public String getState();

public String getOfferName();

public String getRemarks();

public String getOfferId();

public long getOfferSeq();

public String getExt5();

public Timestamp getStateDate();

public Timestamp getCreateDate();

public String getExt1();

public String getExt2();

public String getExt3();

public String getExt4();


public  void setState(String value);

public  void setOfferName(String value);

public  void setRemarks(String value);

public  void setOfferId(String value);

public  void setOfferSeq(long value);

public  void setExt5(String value);

public  void setStateDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setExt3(String value);

public  void setExt4(String value);
}
