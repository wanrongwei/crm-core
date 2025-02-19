package com.asiainfo.crm.ci.spec.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCiInteractionCategoryValue extends DataStructInterface{

  public final static  String S_OpId = "OP_ID";
  public final static  String S_InteractionCategoryNameI18n = "INTERACTION_CATEGORY_NAME_I18N";
  public final static  String S_Remakr = "REMAKR";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_InteractionCategoryId = "INTERACTION_CATEGORY_ID";
  public final static  String S_ParentCategoryId = "PARENT_CATEGORY_ID";
  public final static  String S_InteractionCategoryName = "INTERACTION_CATEGORY_NAME";
  public final static  String S_OrgId = "ORG_ID";


public long getOpId();

public String getInteractionCategoryNameI18n();

public String getRemakr();

public Timestamp getDoneDate();

public long getInteractionCategoryId();

public long getParentCategoryId();

public String getInteractionCategoryName();

public long getOrgId();


public  void setOpId(long value);

public  void setInteractionCategoryNameI18n(String value);

public  void setRemakr(String value);

public  void setDoneDate(Timestamp value);

public  void setInteractionCategoryId(long value);

public  void setParentCategoryId(long value);

public  void setInteractionCategoryName(String value);

public  void setOrgId(long value);
}
