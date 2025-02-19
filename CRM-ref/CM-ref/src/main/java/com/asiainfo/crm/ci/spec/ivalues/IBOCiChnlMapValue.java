package com.asiainfo.crm.ci.spec.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCiChnlMapValue extends DataStructInterface{

  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_ChannelId = "CHANNEL_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Remark = "REMARK";
  public final static  String S_SrcSysId = "SRC_SYS_ID";
  public final static  String S_ChnlMappingId = "CHNL_MAPPING_ID";
  public final static  String S_SrcSysChnlId = "SRC_SYS_CHNL_ID";
  public final static  String S_OrgId = "ORG_ID";


public long getOpId();

public long getState();

public long getChannelId();

public Timestamp getDoneDate();

public String getRemark();

public String getSrcSysId();

public long getChnlMappingId();

public String getSrcSysChnlId();

public long getOrgId();


public  void setOpId(long value);

public  void setState(long value);

public  void setChannelId(long value);

public  void setDoneDate(Timestamp value);

public  void setRemark(String value);

public  void setSrcSysId(String value);

public  void setChnlMappingId(long value);

public  void setSrcSysChnlId(String value);

public  void setOrgId(long value);
}
