package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxGroupVitalGroupRelValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_VgroupId = "VGROUP_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";


public String getState();

public long getCreateOpId();

public Timestamp getEffectiveDate();

public Timestamp getDoneDate();

public String getNotes();

public long getOrgId();

public Timestamp getCreateDate();

public long getDoneCode();

public String getVgroupId();

public Timestamp getExpireDate();

public long getGroupCustId();

public long getOpId();

public String getRegionId();

public long getCreateOrgId();


public  void setState(String value);

public  void setCreateOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setNotes(String value);

public  void setOrgId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setVgroupId(String value);

public  void setExpireDate(Timestamp value);

public  void setGroupCustId(long value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);
}
