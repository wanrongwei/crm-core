package com.asiainfo.crm.res.rescfg.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOResPhoneLevelDefineValue extends DataStructInterface{

  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_SimFee = "SIM_FEE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_ReserveFee = "RESERVE_FEE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ResLevel = "RES_LEVEL";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_LevelName = "LEVEL_NAME";
  public final static  String S_FerruleFee = "FERRULE_FEE";


public Timestamp getEffectiveDate();

public long getSimFee();

public Timestamp getDoneDate();

public String getNotes();

public long getOrgId();

public long getReserveFee();

public Timestamp getCreateDate();

public long getDoneCode();

public int getResLevel();

public Timestamp getExpireDate();

public long getOpId();

public String getRegionId();

public String getLevelName();

public long getFerruleFee();


public  void setEffectiveDate(Timestamp value);

public  void setSimFee(long value);

public  void setDoneDate(Timestamp value);

public  void setNotes(String value);

public  void setOrgId(long value);

public  void setReserveFee(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setResLevel(int value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setLevelName(String value);

public  void setFerruleFee(long value);
}
