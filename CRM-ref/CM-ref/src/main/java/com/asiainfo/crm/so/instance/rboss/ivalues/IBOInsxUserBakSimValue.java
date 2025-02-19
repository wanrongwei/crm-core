package com.asiainfo.crm.so.instance.rboss.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOInsxUserBakSimValue extends DataStructInterface{

  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_ActiveTime = "ACTIVE_TIME";
  public final static  String S_IccId = "ICC_ID";
  public final static  String S_SimCode = "SIM_CODE";
  public final static  String S_BakSimInfoId = "BAK_SIM_INFO_ID";
  public final static  String S_FreeUseDate = "FREE_USE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_BusinessId = "BUSINESS_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ActiveDate = "ACTIVE_DATE";
  public final static  String S_FreeUseTime = "FREE_USE_TIME";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_Status = "STATUS";
  public final static  String S_SimGoodsType = "SIM_GOODS_TYPE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_ImsiId = "IMSI_ID";


public Timestamp getEffectiveDate();

public Timestamp getDoneDate();

public String getNotes();

public long getOrgId();

public int getActiveTime();

public String getIccId();

public int getSimCode();

public long getBakSimInfoId();

public Timestamp getFreeUseDate();

public Timestamp getCreateDate();

public long getBusinessId();

public long getDoneCode();

public Timestamp getActiveDate();

public int getFreeUseTime();

public String getRegionId();

public long getOpId();

public Timestamp getExpireDate();

public int getStatus();

public String getSimGoodsType();

public long getUserId();

public String getImsiId();


public  void setEffectiveDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setNotes(String value);

public  void setOrgId(long value);

public  void setActiveTime(int value);

public  void setIccId(String value);

public  void setSimCode(int value);

public  void setBakSimInfoId(long value);

public  void setFreeUseDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setBusinessId(long value);

public  void setDoneCode(long value);

public  void setActiveDate(Timestamp value);

public  void setFreeUseTime(int value);

public  void setRegionId(String value);

public  void setOpId(long value);

public  void setExpireDate(Timestamp value);

public  void setStatus(int value);

public  void setSimGoodsType(String value);

public  void setUserId(long value);

public  void setImsiId(String value);
}
