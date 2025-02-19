package com.asiainfo.crm.res.rescfg.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOResPatternAllRuleValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_PatternDefId = "PATTERN_DEF_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_PatternId = "PATTERN_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_PatternSegId = "PATTERN_SEG_ID";
  public final static  String S_ResType = "RES_TYPE";
  public final static  String S_PatternName = "PATTERN_NAME";
  //public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_Priorty = "PRIORTY";
  public String getPatternName();
  public void setPatternName(String value);
  public long getPriorty();
  //public long getGroupId();
  //public void setGroupId(long value);
  public void setPriorty(long value);
public String getState();

public Timestamp getEffectiveDate();

public long getPatternDefId();

public Timestamp getDoneDate();

public String getNotes();

public long getPatternId();

public long getOrgId();

public Timestamp getCreateDate();

public long getDoneCode();

public Timestamp getExpireDate();

public long getOpId();

public String getRegionId();

public long getPatternSegId();

public int getResType();


public  void setState(String value);

public  void setEffectiveDate(Timestamp value);

public  void setPatternDefId(long value);

public  void setDoneDate(Timestamp value);

public  void setNotes(String value);

public  void setPatternId(long value);

public  void setOrgId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setPatternSegId(long value);

public  void setResType(int value);
}
