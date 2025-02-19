package com.asiainfo.crm.res.rescfg.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOResViaplayVoucherValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_RsrvStr2 = "RSRV_STR2";
  public final static  String S_ResEventId = "RES_EVENT_ID";
  public final static  String S_RsrvStr3 = "RSRV_STR3";
  public final static  String S_SecOrgId = "SEC_ORG_ID";
  public final static  String S_EndDate = "END_DATE";
  public final static  String S_ResStatus = "RES_STATUS";
  public final static  String S_SeqId = "SEQ_ID";
  public final static  String S_StockInDate = "STOCK_IN_DATE";
  public final static  String S_ResSpecId = "RES_SPEC_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ResStoreId = "RES_STORE_ID";
  public final static  String S_Notes = "NOTES";
  public final static  String S_ResInstId = "RES_INST_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_UseDoneCode = "USE_DONE_CODE";
  public final static  String S_Receiver = "RECEIVER";
  public final static  String S_BusiCode = "BUSI_CODE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_StartDate = "START_DATE";
  public final static  String S_VoucherCode = "VOUCHER_CODE";
  public final static  String S_BatchId = "BATCH_ID";
  public final static  String S_UseDate = "USE_DATE";
  public final static  String S_ManageStatus = "MANAGE_STATUS";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_RsrvNum1 = "RSRV_NUM1";
  public final static  String S_RsrvNum2 = "RSRV_NUM2";


public String getState();

public String getRsrvStr2();

public long getResEventId();

public String getRsrvStr3();

public long getSecOrgId();

public Timestamp getEndDate();

public String getResStatus();

public String getSeqId();

public Timestamp getStockInDate();

public long getResSpecId();

public long getDoneCode();

public long getResStoreId();

public String getNotes();

public String getResInstId();

public long getOpId();

public long getUseDoneCode();

public String getReceiver();

public long getBusiCode();

public long getOrgId();

public String getRegionId();

public Timestamp getStartDate();

public String getVoucherCode();

public String getBatchId();

public Timestamp getUseDate();

public String getManageStatus();

public String getCountyId();

public Timestamp getDoneDate();

public long getRsrvNum1();

public long getRsrvNum2();


public  void setState(String value);

public  void setRsrvStr2(String value);

public  void setResEventId(long value);

public  void setRsrvStr3(String value);

public  void setSecOrgId(long value);

public  void setEndDate(Timestamp value);

public  void setResStatus(String value);

public  void setSeqId(String value);

public  void setStockInDate(Timestamp value);

public  void setResSpecId(long value);

public  void setDoneCode(long value);

public  void setResStoreId(long value);

public  void setNotes(String value);

public  void setResInstId(String value);

public  void setOpId(long value);

public  void setUseDoneCode(long value);

public  void setReceiver(String value);

public  void setBusiCode(long value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setStartDate(Timestamp value);

public  void setVoucherCode(String value);

public  void setBatchId(String value);

public  void setUseDate(Timestamp value);

public  void setManageStatus(String value);

public  void setCountyId(String value);

public  void setDoneDate(Timestamp value);

public  void setRsrvNum1(long value);

public  void setRsrvNum2(long value);
}
