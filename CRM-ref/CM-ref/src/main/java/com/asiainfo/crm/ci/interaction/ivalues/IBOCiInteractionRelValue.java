package com.asiainfo.crm.ci.interaction.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCiInteractionRelValue extends DataStructInterface{

  public final static  String S_InteractionId = "INTERACTION_ID";
  public final static  String S_InteractionTime = "INTERACTION_TIME";
  public final static  String S_DownInteractionId = "DOWN_INTERACTION_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_InteractionRelId = "INTERACTION_REL_ID";
  public final static  String S_TenantId = "TENANT_ID";


public long getInteractionId();

public Timestamp getInteractionTime();

public long getDownInteractionId();

public long getCustId();

public long getInteractionRelId();

public String getTenantId();


public  void setInteractionId(long value);

public  void setInteractionTime(Timestamp value);

public  void setDownInteractionId(long value);

public  void setCustId(long value);

public  void setInteractionRelId(long value);

public  void setTenantId(String value);
}
