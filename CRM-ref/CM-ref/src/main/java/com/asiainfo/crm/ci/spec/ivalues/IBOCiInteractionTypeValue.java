package com.asiainfo.crm.ci.spec.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCiInteractionTypeValue extends DataStructInterface{

  public final static  String S_DetailPageWidth = "DETAIL_PAGE_WIDTH";
  public final static  String S_InteractionTypeName = "INTERACTION_TYPE_NAME";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_MacroPageUrl = "MACRO_PAGE_URL";
  public final static  String S_SrcSysId = "SRC_SYS_ID";
  public final static  String S_DetailPageHeight = "DETAIL_PAGE_HEIGHT";
  public final static  String S_InteractionTypeId = "INTERACTION_TYPE_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_SrcInteractionTypeName = "SRC_INTERACTION_TYPE_NAME";
  public final static  String S_QueryPri = "QUERY_PRI";
  public final static  String S_InteractionTypeNameI18n = "INTERACTION_TYPE_NAME_I18N";
  public final static  String S_UpInteractionTypeId = "UP_INTERACTION_TYPE_ID";
  public final static  String S_Remakr = "REMAKR";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_SrcInteractionTypeId = "SRC_INTERACTION_TYPE_ID";
  public final static  String S_EntityDatePos = "ENTITY_DATE_POS";
  public final static  String S_InteractionCategoryId = "INTERACTION_CATEGORY_ID";
  public final static  String S_SrcInteractionTypeDesc = "SRC_INTERACTION_TYPE_DESC";
  public final static  String S_DetailPageUrl = "DETAIL_PAGE_URL";


public long getDetailPageWidth();

public String getInteractionTypeName();

public long getOpId();

public long getState();

public String getMacroPageUrl();

public String getSrcSysId();

public long getDetailPageHeight();

public long getInteractionTypeId();

public long getOrgId();

public String getSrcInteractionTypeName();

public long getQueryPri();

public String getInteractionTypeNameI18n();

public long getUpInteractionTypeId();

public String getRemakr();

public Timestamp getDoneDate();

public String getSrcInteractionTypeId();

public long getEntityDatePos();

public long getInteractionCategoryId();

public String getSrcInteractionTypeDesc();

public String getDetailPageUrl();


public  void setDetailPageWidth(long value);

public  void setInteractionTypeName(String value);

public  void setOpId(long value);

public  void setState(long value);

public  void setMacroPageUrl(String value);

public  void setSrcSysId(String value);

public  void setDetailPageHeight(long value);

public  void setInteractionTypeId(long value);

public  void setOrgId(long value);

public  void setSrcInteractionTypeName(String value);

public  void setQueryPri(long value);

public  void setInteractionTypeNameI18n(String value);

public  void setUpInteractionTypeId(long value);

public  void setRemakr(String value);

public  void setDoneDate(Timestamp value);

public  void setSrcInteractionTypeId(String value);

public  void setEntityDatePos(long value);

public  void setInteractionCategoryId(long value);

public  void setSrcInteractionTypeDesc(String value);

public  void setDetailPageUrl(String value);
}
