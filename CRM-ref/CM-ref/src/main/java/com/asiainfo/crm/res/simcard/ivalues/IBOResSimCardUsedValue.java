package com.asiainfo.crm.res.simcard.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOResSimCardUsedValue extends DataStructInterface{

  public final static  String S_EncKi = "ENC_KI";
  public final static  String S_ResEventId = "RES_EVENT_ID";
  public final static  String S_SecOrgId = "SEC_ORG_ID";
  public final static  String S_SaleStatus = "SALE_STATUS";
  public final static  String S_ResStatus = "RES_STATUS";
  public final static  String S_Pin2 = "PIN2";
  public final static  String S_Pin1 = "PIN1";
  public final static  String S_PsStatus = "PS_STATUS";
  public final static  String S_DomainType = "DOMAIN_TYPE";
  public final static  String S_CardMakeType = "CARD_MAKE_TYPE";
  public final static  String S_Puk2 = "PUK2";
  public final static  String S_Ki = "KI";
  public final static  String S_UseType = "USE_TYPE";
  public final static  String S_StockInDate = "STOCK_IN_DATE";
  public final static  String S_ResSpecId = "RES_SPEC_ID";
  public final static  String S_ResStoreId = "RES_STORE_ID";
  public final static  String S_ResNumberHlr = "RES_NUMBER_HLR";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Opc = "OPC";
  public final static  String S_ResInstId = "RES_INST_ID";
  public final static  String S_Puk1 = "PUK1";
  public final static  String S_CardDataType = "CARD_DATA_TYPE";
  public final static  String S_IsKiLogin = "IS_KI_LOGIN";
  public final static  String S_IccId = "ICC_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_WriteType = "WRITE_TYPE";
  public final static  String S_CardType = "CARD_TYPE";
  public final static  String S_Receiver = "RECEIVER";
  public final static  String S_Imsi = "IMSI";
  public final static  String S_Sn = "SN";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_IsBakCard = "IS_BAK_CARD";
  public final static  String S_ResPrice = "RES_PRICE";
  public final static  String S_BatchId = "BATCH_ID";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_ManageStatus = "MANAGE_STATUS";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OfferId = "OFFER_ID";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";


public String getEncKi();

public long getResEventId();

public long getSecOrgId();

public int getSaleStatus();

public String getResStatus();

public String getPin2();

public String getPin1();

public String getPsStatus();

public String getDomainType();

public String getCardMakeType();

public String getPuk2();

public String getKi();

public int getUseType();

public Timestamp getStockInDate();

public long getResSpecId();

public long getResStoreId();

public String getResNumberHlr();

public long getDoneCode();

public String getOpc();

public String getResInstId();

public String getPuk1();

public String getCardDataType();

public String getIsKiLogin();

public String getIccId();

public long getOpId();

public String getWriteType();

public String getCardType();

public String getReceiver();

public String getImsi();

public String getSn();

public long getOrgId();

public String getRegionId();

public String getIsBakCard();

public long getResPrice();

public String getBatchId();

public String getCountyId();

public String getManageStatus();

public Timestamp getDoneDate();

public long getOfferId();

public String getBillId();

public String getExt1();

public String getExt2();


public  void setEncKi(String value);

public  void setResEventId(long value);

public  void setSecOrgId(long value);

public  void setSaleStatus(int value);

public  void setResStatus(String value);

public  void setPin2(String value);

public  void setPin1(String value);

public  void setPsStatus(String value);

public  void setDomainType(String value);

public  void setCardMakeType(String value);

public  void setPuk2(String value);

public  void setKi(String value);

public  void setUseType(int value);

public  void setStockInDate(Timestamp value);

public  void setResSpecId(long value);

public  void setResStoreId(long value);

public  void setResNumberHlr(String value);

public  void setDoneCode(long value);

public  void setOpc(String value);

public  void setResInstId(String value);

public  void setPuk1(String value);

public  void setCardDataType(String value);

public  void setIsKiLogin(String value);

public  void setIccId(String value);

public  void setOpId(long value);

public  void setWriteType(String value);

public  void setCardType(String value);

public  void setReceiver(String value);

public  void setImsi(String value);

public  void setSn(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setIsBakCard(String value);

public  void setResPrice(long value);

public  void setBatchId(String value);

public  void setCountyId(String value);

public  void setManageStatus(String value);

public  void setDoneDate(Timestamp value);

public  void setOfferId(long value);

public  void setBillId(String value);

public  void setExt1(String value);

public  void setExt2(String value);
}
