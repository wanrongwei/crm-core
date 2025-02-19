package com.asiainfo.crm.res.rescfg.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOResImsiNumSegmentValue extends DataStructInterface{

  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ResNumberHlr = "RES_NUMBER_HLR";
  public final static  String S_ResImsiSegment = "RES_IMSI_SEGMENT";
  public final static  String S_HlrCode = "HLR_CODE";
  public final static  String S_RsrvStr1 = "RSRV_STR1";
  public final static  String S_RsrvStr2 = "RSRV_STR2";
  public final static  String S_RsrvStr3 = "RSRV_STR3";
  public final static  String S_RsrvTag1 = "RSRV_TAG1";
  public final static  String S_RsrvTag2 = "RSRV_TAG2";

public String getRsrvStr1();

public String getRsrvStr2();

public String getRsrvStr3();

public String getRsrvTag1();

public String getRsrvTag2();

public String getHlrCode();
  
public Timestamp getEffectiveDate();

public Timestamp getDoneDate();

public String getNotes();

public long getOrgId();

public Timestamp getCreateDate();

public long getDoneCode();

public String getCountyId();

public Timestamp getExpireDate();

public long getOpId();

public String getRegionId();

public String getResNumberHlr();

public String getResImsiSegment();


public  void setEffectiveDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setNotes(String value);

public  void setOrgId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);


public  void setCountyId(String value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setResNumberHlr(String value);

public  void setResImsiSegment(String value);

public void setHlrCode(String value);

public void setRsrvStr1(String value);

public void setRsrvStr2(String  value);

public void setRsrvStr3(String  value);

public void setRsrvTag1(String value);

public void setRsrvTag2(String value);

}
