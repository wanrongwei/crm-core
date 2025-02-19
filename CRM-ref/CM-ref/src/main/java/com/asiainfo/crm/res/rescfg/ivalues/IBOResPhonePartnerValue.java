package com.asiainfo.crm.res.rescfg.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOResPhonePartnerValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_PartnerCountry = "PARTNER_COUNTRY";
  public final static  String S_PartnerNetwork = "PARTNER_NETWORK";
  public final static  String S_PartnerId = "PARTNER_ID";
  public final static  String S_ProductId = "PRODUCT_ID";
  public final static  String S_ResUsedId = "RES_USED_ID";
  public final static  String S_ResStatus = "RES_STATUS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ManageStatus = "MANAGE_STATUS";
  public final static  String S_ChooseLevel = "CHOOSE_LEVEL";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ResId = "RES_ID";
  public final static  String S_UseType = "USE_TYPE";
  public final static  String S_ResSpecId = "RES_SPEC_ID";
  public final static  String S_ResStoreId = "RES_STORE_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ResInstId = "RES_INST_ID";
  public final static  String S_Notes = "NOTES";
  public final static  String S_PartnerMsisdn = "PARTNER_MSISDN";


public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getPartnerCountry();

public String getPartnerNetwork();

public int getPartnerId();

public long getProductId();

public long getResUsedId();

public String getResStatus();

public long getOrgId();

public String getRegionId();

public String getManageStatus();

public int getChooseLevel();

public Timestamp getDoneDate();

public String getResId();

public int getUseType();

public long getResSpecId();

public long getResStoreId();

public Timestamp getCreateDate();

public long getDoneCode();

public String getResInstId();

public String getNotes();

public String getPartnerMsisdn();


public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setPartnerCountry(String value);

public  void setPartnerNetwork(String value);

public  void setPartnerId(int value);

public  void setProductId(long value);

public  void setResUsedId(long value);

public  void setResStatus(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setManageStatus(String value);

public  void setChooseLevel(int value);

public  void setDoneDate(Timestamp value);

public  void setResId(String value);

public  void setUseType(int value);

public  void setResSpecId(long value);

public  void setResStoreId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setResInstId(String value);

public  void setNotes(String value);

public  void setPartnerMsisdn(String value);
}
