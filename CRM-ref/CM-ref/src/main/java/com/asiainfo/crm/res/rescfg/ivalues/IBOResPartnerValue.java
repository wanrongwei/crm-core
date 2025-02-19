package com.asiainfo.crm.res.rescfg.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOResPartnerValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ContactInfo = "CONTACT_INFO";
  public final static  String S_SaleType = "SALE_TYPE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_Province = "PROVINCE";
  public final static  String S_CooperateLevel = "COOPERATE_LEVEL";
  public final static  String S_PartnerShortName = "PARTNER_SHORT_NAME";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CooperateType = "COOPERATE_TYPE";
  public final static  String S_PartnerName = "PARTNER_NAME";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_SuppAddr = "SUPP_ADDR";
  public final static  String S_CooperateMode = "COOPERATE_MODE";
  public final static  String S_OpOrg = "OP_ORG";
  public final static  String S_PartnerEnglishName = "PARTNER_ENGLISH_NAME";
  public final static  String S_Country = "COUNTRY";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CooperateRegion = "COOPERATE_REGION";
  public final static  String S_City = "CITY";
  public final static  String S_SuppOpId = "SUPP_OP_ID";
  public final static  String S_Vocation = "VOCATION";
  public final static  String S_PartnerId = "PARTNER_ID";
  public final static  String S_ContactName = "CONTACT_NAME";


public String getState();

public Timestamp getEffectiveDate();

public Timestamp getDoneDate();

public String getContactInfo();

public String getSaleType();

public String getNotes();

public String getProvince();

public String getCooperateLevel();

public String getPartnerShortName();

public String getDoneCode();

public String getCooperateType();

public String getPartnerName();

public long getOpId();

public String getRegionId();

public String getSuppAddr();

public String getCooperateMode();

public long getOpOrg();

public String getPartnerEnglishName();

public long getCountry();

public Timestamp getExpireDate();

public String getCooperateRegion();

public long getCity();

public long getSuppOpId();

public long getVocation();

public long getPartnerId();

public String getContactName();


public  void setState(String value);

public  void setEffectiveDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setContactInfo(String value);

public  void setSaleType(String value);

public  void setNotes(String value);

public  void setProvince(String value);

public  void setCooperateLevel(String value);

public  void setPartnerShortName(String value);

public  void setDoneCode(String value);

public  void setCooperateType(String value);

public  void setPartnerName(String value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setSuppAddr(String value);

public  void setCooperateMode(String value);

public  void setOpOrg(long value);

public  void setPartnerEnglishName(String value);

public  void setCountry(long value);

public  void setExpireDate(Timestamp value);

public  void setCooperateRegion(String value);

public  void setCity(long value);

public  void setSuppOpId(long value);

public  void setVocation(long value);

public  void setPartnerId(long value);

public  void setContactName(String value);
}
