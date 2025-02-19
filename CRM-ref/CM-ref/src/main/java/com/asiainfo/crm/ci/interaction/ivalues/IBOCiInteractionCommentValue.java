package com.asiainfo.crm.ci.interaction.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCiInteractionCommentValue extends DataStructInterface{

  public final static  String S_OpId = "OP_ID";
  public final static  String S_CommentId = "COMMENT_ID";
  public final static  String S_ChannelCode = "CHANNEL_CODE";
  public final static  String S_SrcSysId = "SRC_SYS_ID";
  public final static  String S_TenantId = "TENANT_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_Visible = "VISIBLE";
  public final static  String S_InteractionId = "INTERACTION_ID";
  public final static  String S_InteractionTime = "INTERACTION_TIME";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_SrcCommentId = "SRC_COMMENT_ID";
  public final static  String S_Comment = "COMMENT";
  public final static  String S_CreateDate = "CREATE_DATE";


public long getOpId();

public long getCommentId();

public String getChannelCode();

public String getSrcSysId();

public String getTenantId();

public long getOrgId();

public long getVisible();

public long getInteractionId();

public Timestamp getInteractionTime();

public long getCustId();

public long getSrcCommentId();

public String getComment();

public Timestamp getCreateDate();


public  void setOpId(long value);

public  void setCommentId(long value);

public  void setChannelCode(String value);

public  void setSrcSysId(String value);

public  void setTenantId(String value);

public  void setOrgId(long value);

public  void setVisible(long value);

public  void setInteractionId(long value);

public  void setInteractionTime(Timestamp value);

public  void setCustId(long value);

public  void setSrcCommentId(long value);

public  void setComment(String value);

public  void setCreateDate(Timestamp value);
}
