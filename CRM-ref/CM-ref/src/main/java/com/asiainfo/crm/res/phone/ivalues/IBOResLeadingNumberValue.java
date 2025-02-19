package com.asiainfo.crm.res.phone.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOResLeadingNumberValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_LeadingNum = "LEADING_NUM";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_SeqId = "SEQ_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_ManualExport = "MANUAL_EXPORT";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3"; 
  public final static  String S_Ext4 = "EXT4";


public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public long getState();

public String getLeadingNum();

public long getOrgId();

public String getRegionId();

public String getCustName();

public String getCustId();

public String getCountyId();

public Timestamp getDoneDate();

public long getSeqId();

public Timestamp getCreateDate();

public String getNotes();

public String getManualExport();

public String getExt1();

public String getExt2();

public String getExt3();

public String getExt4();


public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setState(long value);

public  void setLeadingNum(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCustName(String value);

public  void setCustId(String value);

public  void setCountyId(String value);

public  void setDoneDate(Timestamp value);

public  void setSeqId(long value);

public  void setCreateDate(Timestamp value);

public  void setNotes(String value);

public  void setManualExport(String value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setExt3(String value);

public  void setExt4(String value);
}
