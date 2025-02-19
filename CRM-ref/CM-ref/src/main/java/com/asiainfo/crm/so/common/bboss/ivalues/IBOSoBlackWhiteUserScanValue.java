package com.asiainfo.crm.so.common.bboss.ivalues;

import com.ai.appframe2.common.DataStructInterface;

import java.sql.Timestamp;

public interface IBOSoBlackWhiteUserScanValue extends DataStructInterface{

  public final static  String S_Remarks = "REMARKS";
  public final static  String S_Status = "STATUS";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_ServCode = "SERV_CODE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ProdName = "PROD_NAME";
  public final static  String S_UpPtFile = "UP_PT_FILE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_BlackWhiteId = "BLACK_WHITE_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_OprCode = "OPR_CODE";
  public final static  String S_UpLocFile = "UP_LOC_FILE";
  public final static  String S_UpGwFile = "UP_GW_FILE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OfferId = "OFFER_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BizCode = "BIZ_CODE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_BusiId = "BUSI_ID";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_OfferInstId = "OFFER_INST_ID";


public String getRemarks();

public String getStatus();

public long getCustId();

public String getServCode();

public long getDoneCode();

public String getProdName();

public String getUpPtFile();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getBlackWhiteId();

public long getOpId();

public String getOprCode();

public String getUpLocFile();

public String getUpGwFile();

public long getOrgId();

public String getRegionId();

public long getOfferId();

public Timestamp getDoneDate();

public String getBizCode();

public Timestamp getCreateDate();

public String getExt1();

public String getExt2();

public long getBusiId();

public String getExt3();

public long getOfferInstId();


public  void setRemarks(String value);

public  void setStatus(String value);

public  void setCustId(long value);

public  void setServCode(String value);

public  void setDoneCode(long value);

public  void setProdName(String value);

public  void setUpPtFile(String value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setBlackWhiteId(long value);

public  void setOpId(long value);

public  void setOprCode(String value);

public  void setUpLocFile(String value);

public  void setUpGwFile(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setOfferId(long value);

public  void setDoneDate(Timestamp value);

public  void setBizCode(String value);

public  void setCreateDate(Timestamp value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setBusiId(long value);

public  void setExt3(String value);

public  void setOfferInstId(long value);
}
