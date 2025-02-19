package com.asiainfo.crm.so.batchOrd.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOOrdBatSingleOrderValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_WfTaskId = "WF_TASK_ID";
  public final static  String S_BatchOrderId = "BATCH_ORDER_ID";
  public final static  String S_UpdateDate = "UPDATE_DATE";
  public final static  String S_FileId = "FILE_ID";
  public final static  String S_Remark = "REMARK";
  public final static  String S_DeliveryOrderId = "DELIVERY_ORDER_ID";
  public final static  String S_SingleOrderId = "SINGLE_ORDER_ID";
  public final static  String S_Ext1 = "EXT_1";
  public final static  String S_KeyColId = "KEY_COL_ID";
  public final static  String S_Ext4 = "EXT_4";
  public final static  String S_Ext3 = "EXT_3";
  public final static  String S_Ext2 = "EXT_2";
  public final static  String S_Id = "ID";
  public final static  String S_KeyColValue = "KEY_COL_VALUE";
  public final static  String S_ModId = "MOD_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_KeyColName = "KEY_COL_NAME";
  public final static  String S_CustId = "CUST_ID";

public String getState();

public String getWfTaskId();

public long getBatchOrderId();

public Timestamp getUpdateDate();

public long getFileId();

public String getRemark();

public long getDeliveryOrderId();

public long getSingleOrderId();

public String getExt1();

public long getKeyColId();

public String getExt4();

public String getExt3();

public String getExt2();

public long getId();

public String getKeyColValue();

public long getModId();

public Timestamp getCreateDate();

public String getKeyColName();

public long getCustId();


public  void setState(String value);

public  void setWfTaskId(String value);

public  void setBatchOrderId(long value);

public  void setUpdateDate(Timestamp value);

public  void setFileId(long value);

public  void setRemark(String value);

public  void setDeliveryOrderId(long value);

public  void setSingleOrderId(long value);

public  void setExt1(String value);

public  void setKeyColId(long value);

public  void setExt4(String value);

public  void setExt3(String value);

public  void setExt2(String value);

public  void setId(long value);

public  void setKeyColValue(String value);

public  void setModId(long value);

public  void setCreateDate(Timestamp value);

public  void setKeyColName(String value);

public  void setCustId(long value);

}
