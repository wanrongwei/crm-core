package com.asiainfo.crm.ci.interaction.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCiInteractionValue extends DataStructInterface{

  public final static  String S_SrcInteractionEntityId = "SRC_INTERACTION_ENTITY_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_AccountId = "ACCOUNT_ID";
  public final static  String S_ChannelId = "CHANNEL_ID";
  public final static  String S_CustRegionId = "CUST_REGION_ID";
  public final static  String S_Remark = "REMARK";
  public final static  String S_SrcSysId = "SRC_SYS_ID";
  public final static  String S_ContactId = "CONTACT_ID";
  public final static  String S_MediaType = "MEDIA_TYPE";
  public final static  String S_TenantId = "TENANT_ID";
  public final static  String S_SrcInteractionId = "SRC_INTERACTION_ID";
  public final static  String S_ResultDetail = "RESULT_DETAIL";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_InteractionType = "INTERACTION_TYPE";
  public final static  String S_InteractionId = "INTERACTION_ID";
  public final static  String S_CompleteTime = "COMPLETE_TIME";
  public final static  String S_InteractionResult = "INTERACTION_RESULT";
  public final static  String S_InteractionTime = "INTERACTION_TIME";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_SrcBusiType = "SRC_BUSI_TYPE";
  public final static  String S_EventState = "EVENT_STATE";
  public final static  String S_UpInteractionId = "UP_INTERACTION_ID";
  public final static  String S_Msisdn = "MSISDN";


public String getSrcInteractionEntityId();

public long getOpId();

public long getAccountId();

public long getChannelId();

public String getCustRegionId();

public String getRemark();

public String getSrcSysId();

public long getContactId();

public String getMediaType();

public String getTenantId();

public String getSrcInteractionId();

public String getResultDetail();

public long getOrgId();

public long getInteractionType();

public long getInteractionId();

public Timestamp getCompleteTime();

public long getInteractionResult();

public Timestamp getInteractionTime();

public long getCustId();

public String getSrcBusiType();

public long getEventState();

public long getUpInteractionId();

public String getMsisdn();


public  void setSrcInteractionEntityId(String value);

public  void setOpId(long value);

public  void setAccountId(long value);

public  void setChannelId(long value);

public  void setCustRegionId(String value);

public  void setRemark(String value);

public  void setSrcSysId(String value);

public  void setContactId(long value);

public  void setMediaType(String value);

public  void setTenantId(String value);

public  void setSrcInteractionId(String value);

public  void setResultDetail(String value);

public  void setOrgId(long value);

public  void setInteractionType(long value);

public  void setInteractionId(long value);

public  void setCompleteTime(Timestamp value);

public  void setInteractionResult(long value);

public  void setInteractionTime(Timestamp value);

public  void setCustId(long value);

public  void setSrcBusiType(String value);

public  void setEventState(long value);

public  void setUpInteractionId(long value);

public  void setMsisdn(String value);
}
