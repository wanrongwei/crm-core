package com.asiainfo.crm.cm.batch.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmBatchFuncValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_DealService = "DEAL_SERVICE";
  public final static  String S_DealFunc = "DEAL_FUNC";
  public final static  String S_ConfigId = "CONFIG_ID";
  public final static  String S_Notes = "NOTES";
  public final static  String S_BatchName = "BATCH_NAME";


public String getState();

public String getDealService();

public String getDealFunc();

public long getConfigId();

public String getNotes();

public String getBatchName();


public  void setState(String value);

public  void setDealService(String value);

public  void setDealFunc(String value);

public  void setConfigId(long value);

public  void setNotes(String value);

public  void setBatchName(String value);
}
