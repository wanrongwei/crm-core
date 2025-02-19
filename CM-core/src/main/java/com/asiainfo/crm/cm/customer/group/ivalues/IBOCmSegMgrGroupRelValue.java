package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmSegMgrGroupRelValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ZipCode = "ZIP_CODE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_RelId = "REL_ID";
  public final static  String S_SegmentId = "SEGMENT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_GroupCode = "GROUP_CODE";


public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public long getZipCode();

public String getState();

public String getRemarks();

public long getOrgId();

public long getCreateOrgId();

public String getRegionId();

public long getRelId();

public long getSegmentId();

public long getCreateOpId();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public long getDoneCode();

public String getGroupCode();


public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setZipCode(long value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setRegionId(String value);

public  void setRelId(long value);

public  void setSegmentId(long value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setGroupCode(String value);
}
