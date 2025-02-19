package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupMtparchRelaValue extends DataStructInterface{

  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_GroupSeq = "GROUP_SEQ";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_RegionCode = "REGION_CODE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_GroupMtpId = "GROUP_MTP_ID";
  public final static  String S_IsRegionOrg = "IS_REGION_ORG";


public long getCreateOpId();

public Timestamp getEffectiveDate();

public String getGroupSeq();

public Timestamp getDoneDate();

public long getRegionCode();

public String getRemarks();

public long getOrgId();

public Timestamp getCreateDate();

public long getDoneCode();

public String getRegionId();

public Timestamp getExpireDate();

public long getOpId();

public long getCreateOrgId();

public String getGroupMtpId();

public int getIsRegionOrg();


public  void setCreateOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setGroupSeq(String value);

public  void setDoneDate(Timestamp value);

public  void setRegionCode(long value);

public  void setRemarks(String value);

public  void setOrgId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setRegionId(String value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setCreateOrgId(long value);

public  void setGroupMtpId(String value);

public  void setIsRegionOrg(int value);
}
