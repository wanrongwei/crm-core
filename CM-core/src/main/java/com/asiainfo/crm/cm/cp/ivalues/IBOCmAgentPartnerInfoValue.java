package com.asiainfo.crm.cm.cp.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmAgentPartnerInfoValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ChannelId = "CHANNEL_ID";
  public final static  String S_ConfigDesc = "CONFIG_DESC";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_PartnerOrgId = "PARTNER_ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_DependentId = "DEPENDENT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ChannelCity = "CHANNEL_CITY";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";


public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getState();

public String getRemarks();

public long getChannelId();

public String getConfigDesc();

public long getOrgId();

public String getRegionId();

public long getPartnerOrgId();

public long getCreateOrgId();

public long getDependentId();

public long getCreateOpId();

public Timestamp getDoneDate();

public long getChannelCity();

public Timestamp getCreateDate();

public long getDoneCode();


public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setChannelId(long value);

public  void setConfigDesc(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setPartnerOrgId(long value);

public  void setCreateOrgId(long value);

public  void setDependentId(long value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setChannelCity(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);
}
