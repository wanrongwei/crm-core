package com.asiainfo.crm.so.common.party.ivalues;
import com.ai.appframe2.common.DataStructInterface;
public interface IBOInsSrvAttrIdxValue extends DataStructInterface{

  public final static  String S_AttrInstId = "ATTR_INST_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ProdInstId = "PROD_INST_ID";
  public final static  String S_AttrId = "ATTR_ID";
  public final static  String S_AttrValue = "ATTR_VALUE";
  public final static  String S_ServiceInstId = "SERVICE_INST_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_AttrIdxInstId = "ATTR_IDX_INST_ID";
  public final static  String S_OfferInstId = "OFFER_INST_ID";


public long getAttrInstId();

public String getRegionId();

public long getProdInstId();

public long getAttrId();

public String getAttrValue();

public long getServiceInstId();

public long getUserId();

public long getAttrIdxInstId();

public long getOfferInstId();


public  void setAttrInstId(long value);

public  void setRegionId(String value);

public  void setProdInstId(long value);

public  void setAttrId(long value);

public  void setAttrValue(String value);

public  void setServiceInstId(long value);

public  void setUserId(long value);

public  void setAttrIdxInstId(long value);

public  void setOfferInstId(long value);
}
