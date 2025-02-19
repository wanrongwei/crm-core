package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxGroupPrepayProvisionValue extends DataStructInterface{

  public final static  String S_BegDate = "BEG_DATE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_CurDiscount = "CUR_DISCOUNT";
  public final static  String S_BusiCode = "BUSI_CODE";
  public final static  String S_EndDate = "END_DATE";
  public final static  String S_ProvisionId = "PROVISION_ID";
  public final static  String S_GroupCountyId = "GROUP_COUNTY_ID";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_CurFee = "CUR_FEE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_UpFee = "UP_FEE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_GroupName = "GROUP_NAME";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_GroupRegionId = "GROUP_REGION_ID";
  public final static  String S_Notes = "NOTES";
  public final static  String S_ProStatus = "PRO_STATUS";


public Timestamp getBegDate();

public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getState();

public long getCurDiscount();

public String getBusiCode();

public Timestamp getEndDate();

public long getProvisionId();

public String getGroupCountyId();

public long getGroupCustId();

public long getCurFee();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public long getUpFee();

public long getCreateOpId();

public String getGroupName();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public long getDoneCode();

public String getGroupRegionId();

public String getNotes();

public int getProStatus();


public  void setBegDate(Timestamp value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setCurDiscount(long value);

public  void setBusiCode(String value);

public  void setEndDate(Timestamp value);

public  void setProvisionId(long value);

public  void setGroupCountyId(String value);

public  void setGroupCustId(long value);

public  void setCurFee(long value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setUpFee(long value);

public  void setCreateOpId(long value);

public  void setGroupName(String value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setGroupRegionId(String value);

public  void setNotes(String value);

public  void setProStatus(int value);
}
