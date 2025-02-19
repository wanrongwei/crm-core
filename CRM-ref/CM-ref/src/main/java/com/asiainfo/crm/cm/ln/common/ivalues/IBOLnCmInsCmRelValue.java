package com.asiainfo.crm.cm.ln.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOLnCmInsCmRelValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_RelaType = "RELA_TYPE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_UserType = "USER_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_EffectiveDateType = "EFFECTIVE_DATE_TYPE";
  public final static  String S_UserRegionCode = "USER_REGION_CODE";
  public final static  String S_CmrelId = "CMREL_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OfferId = "OFFER_ID";
  public final static  String S_ProdCatalogId = "PROD_CATALOG_ID";
  public final static  String S_ExpireDateType = "EXPIRE_DATE_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3";


public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public long getState();

public long getUserId();

public long getRelaType();

public String getRemarks();

public long getUserType();

public long getOrgId();

public long getEffectiveDateType();

public String getUserRegionCode();

public long getCmrelId();

public long getCustId();

public Timestamp getDoneDate();

public long getOfferId();

public long getProdCatalogId();

public long getExpireDateType();

public Timestamp getCreateDate();

public long getDoneCode();

public String getExt1();

public String getExt2();

public String getExt3();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setState(long value);

public  void setUserId(long value);

public  void setRelaType(long value);

public  void setRemarks(String value);

public  void setUserType(long value);

public  void setOrgId(long value);

public  void setEffectiveDateType(long value);

public  void setUserRegionCode(String value);

public  void setCmrelId(long value);

public  void setCustId(long value);

public  void setDoneDate(Timestamp value);

public  void setOfferId(long value);

public  void setProdCatalogId(long value);

public  void setExpireDateType(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setExt3(String value);
}
