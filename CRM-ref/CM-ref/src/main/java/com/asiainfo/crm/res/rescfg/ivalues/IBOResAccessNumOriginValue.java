package com.asiainfo.crm.res.rescfg.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOResAccessNumOriginValue extends DataStructInterface{

  public final static  String S_ResStatus = "RES_STATUS";
  public final static  String S_ManageStatus = "MANAGE_STATUS";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_UseType = "USE_TYPE";
  public final static  String S_ChooseLevel = "CHOOSE_LEVEL";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_TradeId = "TRADE_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ResUsedId = "RES_USED_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ResId = "RES_ID";
  public final static  String S_PlanId = "PLAN_ID";
  public final static  String S_ResNumberHlr = "RES_NUMBER_HLR";
  public final static  String S_ResSpecId = "RES_SPEC_ID";
  public final static  String S_ResInstId = "RES_INST_ID";
  public final static  String S_ResStoreId = "RES_STORE_ID";
  public final static  String S_PreDate = "PRE_DATE";
  public Timestamp getPreDate();
  public void setPreDate(Timestamp value);
public String getResStatus();

public String getManageStatus();

public Timestamp getDoneDate();

public String getNotes();

public int getUseType();

public int getChooseLevel();

public long getOrgId();

public int getTradeId();

public long getDoneCode();

public long getResUsedId();

public long getOpId();

public String getRegionId();

public String getResId();

public long getPlanId();

public String getResNumberHlr();

public long getResSpecId();

public String getResInstId();

public long getResStoreId();


public  void setResStatus(String value);

public  void setManageStatus(String value);

public  void setDoneDate(Timestamp value);

public  void setNotes(String value);

public  void setUseType(int value);

public  void setChooseLevel(int value);

public  void setOrgId(long value);

public  void setTradeId(int value);

public  void setDoneCode(long value);

public  void setResUsedId(long value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setResId(String value);

public  void setPlanId(long value);

public  void setResNumberHlr(String value);

public  void setResSpecId(long value);

public  void setResInstId(String value);

public  void setResStoreId(long value);
}
