package com.asiainfo.crm.res.goods.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOResInstanceValue extends DataStructInterface{

  public final static  String S_OpenDate = "OPEN_DATE";
  public final static  String S_ResInstName = "RES_INST_NAME";
  public final static  String S_CloseDate = "CLOSE_DATE";
  public final static  String S_ManageStatus = "MANAGE_STATUS";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_SalesPrice = "SALES_PRICE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_UseType = "USE_TYPE";
  public final static  String S_IsPerson = "IS_PERSON";
  public final static  String S_ResBatchId = "RES_BATCH_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OpUsableAmount = "OP_USABLE_AMOUNT";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ResSpecId = "RES_SPEC_ID";
  public final static  String S_Unit = "UNIT";
  public final static  String S_AvailDistribute = "AVAIL_DISTRIBUTE";
  public final static  String S_ResStoreId = "RES_STORE_ID";
  public final static  String S_ResStatus = "RES_STATUS";
  public final static  String S_SuppId = "SUPP_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_Amount = "AMOUNT";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_OnWayAmount = "ON_WAY_AMOUNT";
  public final static  String S_OpOnWayAmount = "OP_ON_WAY_AMOUNT";
  public final static  String S_ResInstId = "RES_INST_ID";
  public final static  String S_Receiver = "RECEIVER";


public Timestamp getOpenDate();

public String getResInstName();

public Timestamp getCloseDate();

public String getManageStatus();

public Timestamp getDoneDate();

public int getSalesPrice();

public String getNotes();

public int getUseType();

public String getIsPerson();

public long getResBatchId();

public long getDoneCode();

public long getOpUsableAmount();

public long getOpId();

public String getRegionId();

public long getResSpecId();

public String getUnit();

public long getAvailDistribute();

public long getResStoreId();

public String getResStatus();

public long getSuppId();

public long getOrgId();

public long getAmount();

public String getCountyId();

public long getOnWayAmount();

public long getOpOnWayAmount();

public String getResInstId();

public long getReceiver();


public  void setOpenDate(Timestamp value);

public  void setResInstName(String value);

public  void setCloseDate(Timestamp value);

public  void setManageStatus(String value);

public  void setDoneDate(Timestamp value);

public  void setSalesPrice(int value);

public  void setNotes(String value);

public  void setUseType(int value);

public  void setIsPerson(String value);

public  void setResBatchId(long value);

public  void setDoneCode(long value);

public  void setOpUsableAmount(long value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setResSpecId(long value);

public  void setUnit(String value);

public  void setAvailDistribute(long value);

public  void setResStoreId(long value);

public  void setResStatus(String value);

public  void setSuppId(long value);

public  void setOrgId(long value);

public  void setAmount(long value);

public  void setCountyId(String value);

public  void setOnWayAmount(long value);

public  void setOpOnWayAmount(long value);

public  void setResInstId(String value);

public  void setReceiver(long value);
}
