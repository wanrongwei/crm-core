package com.asiainfo.crm.ci.spec.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCiInteractionAttrValue extends DataStructInterface{

  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_IsDisplay = "IS_DISPLAY";
  public final static  String S_InteractionAttrId = "INTERACTION_ATTR_ID";
  public final static  String S_InteractionTypeId = "INTERACTION_TYPE_ID";
  public final static  String S_ValueTransMode = "VALUE_TRANS_MODE";
  public final static  String S_InteractionAttrNameI18n = "INTERACTION_ATTR_NAME_I18N";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_InteractionAttrDesc = "INTERACTION_ATTR_DESC";
  public final static  String S_ValueTransfer = "VALUE_TRANSFER";
  public final static  String S_InteractionAttrName = "INTERACTION_ATTR_NAME";
  public final static  String S_InteractionAttrCode = "INTERACTION_ATTR_CODE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Remakr = "REMAKR";


public long getOpId();

public long getState();

public long getIsDisplay();

public long getInteractionAttrId();

public long getInteractionTypeId();

public long getValueTransMode();

public String getInteractionAttrNameI18n();

public long getOrgId();

public String getInteractionAttrDesc();

public String getValueTransfer();

public String getInteractionAttrName();

public String getInteractionAttrCode();

public Timestamp getDoneDate();

public String getRemakr();


public  void setOpId(long value);

public  void setState(long value);

public  void setIsDisplay(long value);

public  void setInteractionAttrId(long value);

public  void setInteractionTypeId(long value);

public  void setValueTransMode(long value);

public  void setInteractionAttrNameI18n(String value);

public  void setOrgId(long value);

public  void setInteractionAttrDesc(String value);

public  void setValueTransfer(String value);

public  void setInteractionAttrName(String value);

public  void setInteractionAttrCode(String value);

public  void setDoneDate(Timestamp value);

public  void setRemakr(String value);
}
