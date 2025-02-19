package com.asiainfo.crm.res.paycard.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOResPayCardValue extends DataStructInterface{

  public final static  String S_LockStatus = "LOCK_STATUS";
  public final static  String S_CardState = "CARD_STATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ManageStatus = "MANAGE_STATUS";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_UseType = "USE_TYPE";
  public final static  String S_PaycardId = "PAYCARD_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_SaleObj = "SALE_OBJ";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_BatchId = "BATCH_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_SaleFee = "SALE_FEE";
  public final static  String S_CardPassword = "CARD_PASSWORD";
  public final static  String S_ResId = "RES_ID";
  public final static  String S_CardType = "CARD_TYPE";
  public final static  String S_ResEventId = "RES_EVENT_ID";
  public final static  String S_ChargeDate = "CHARGE_DATE";
  public final static  String S_ResSpecId = "RES_SPEC_ID";
  public final static  String S_OutDoneCode = "OUT_DONE_CODE";
  public final static  String S_ResStoreId = "RES_STORE_ID";
  public final static  String S_ResName = "RES_NAME";
  public final static  String S_ValidDay = "VALID_DAY";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_PkgId = "PKG_ID";
  public final static  String S_CardFee = "CARD_FEE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_SaleDate = "SALE_DATE";
  public final static  String S_SecOrgId = "SEC_ORG_ID";
  public final static  String S_PresentObj = "PRESENT_OBJ";
  public final static  String S_ResInstId = "RES_INST_ID";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_Receiver = "RECEIVER";
  public final static  String S_RsrvStr1 = "RSRV_STR1";
  public final static  String S_RsrvStr2 = "RSRV_STR2";
  public final static  String S_RsrvStr3 = "RSRV_STR3";
  public final static  String S_FactoryId = "FACTORY_ID";
  public final static  String S_RsrvNum1 = "RSRV_NUM1";
  public final static  String S_RsrvNum2 = "RSRV_NUM2";

public String getLockStatus();

public String getCardState();

public Timestamp getEffectiveDate();

public String getManageStatus();

public Timestamp getDoneDate();

public String getNotes();

public String getUseType();

public String getPaycardId();

public Timestamp getCreateDate();

public long getSaleObj();

public long getDoneCode();

public String getBatchId();

public long getOpId();

public String getRegionId();

public long getSaleFee();

public String getCardPassword();

public long getResId();

public String getCardType();

public long getResEventId();

public Timestamp getChargeDate();

public long getResSpecId();

public String getOutDoneCode();

public long getResStoreId();

public String getResName();

public int getValidDay();

public long getOrgId();

public String getPkgId();

public long getCardFee();

public Timestamp getExpireDate();

public String getCountyId();

public Timestamp getSaleDate();

public long getSecOrgId();

public int getPresentObj();

public String getResInstId();

public String getBillId();

public long getReceiver();

public String getRsrvStr1();

public String getRsrvStr2();

public String getRsrvStr3();

public String getFactoryId();

public long getRsrvNum1();

public long getRsrvNum2();

public  void setLockStatus(String value);

public  void setCardState(String value);

public  void setEffectiveDate(Timestamp value);

public  void setManageStatus(String value);

public  void setDoneDate(Timestamp value);

public  void setNotes(String value);

public  void setUseType(String value);

public  void setPaycardId(String value);

public  void setCreateDate(Timestamp value);

public  void setSaleObj(long value);

public  void setDoneCode(long value);

public  void setBatchId(String value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setSaleFee(long value);

public  void setCardPassword(String value);

public  void setResId(long value);

public  void setCardType(String value);

public  void setResEventId(long value);

public  void setChargeDate(Timestamp value);

public  void setResSpecId(long value);

public  void setOutDoneCode(String value);

public  void setResStoreId(long value);

public  void setResName(String value);

public  void setValidDay(int value);

public  void setOrgId(long value);

public  void setPkgId(String value);

public  void setCardFee(long value);

public  void setExpireDate(Timestamp value);

public  void setCountyId(String value);

public  void setSaleDate(Timestamp value);

public  void setSecOrgId(long value);

public  void setPresentObj(int value);

public  void setResInstId(String value);

public  void setBillId(String value);

public  void setReceiver(long value);

public  void setRsrvStr1(String value);

public  void setRsrvStr2(String value);

public  void setRsrvStr3(String value);

public  void setFactoryId(String value);

public  void setRsrvNum1(long value);

public  void setRsrvNum2(long value);

}
