package com.asiainfo.crm.res.rescfg.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOResNumberHlrValue extends DataStructInterface{

  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_NetId = "NET_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_HlrSegment = "HLR_SEGMENT";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_HlrName = "HLR_NAME";
  public final static  String S_GsmSegment = "GSM_SEGMENT";
  public final static  String S_NumberHlrHflag = "NUMBER_HLR_HFLAG";
  public final static  String S_GenerationType = "GENERATION_TYPE";


public Timestamp getEffectiveDate();

public String getNetId();

public Timestamp getDoneDate();

public String getNotes();

public long getOrgId();

public Timestamp getCreateDate();

public long getDoneCode();

public String getHlrSegment();

public String getRegionId();

public Timestamp getExpireDate();

public long getOpId();

public String getHlrName();

public int getGsmSegment();

public String getNumberHlrHflag();

public String getGenerationType();


public  void setEffectiveDate(Timestamp value);

public  void setNetId(String value);

public  void setDoneDate(Timestamp value);

public  void setNotes(String value);

public  void setOrgId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setHlrSegment(String value);

public  void setRegionId(String value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setHlrName(String value);

public  void setGsmSegment(int value);

public  void setNumberHlrHflag(String value);

public  void setGenerationType(String value);
}
