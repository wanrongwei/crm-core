package com.asiainfo.crm.agreement.template.termtemplate.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOAgrTermTemplateValue extends DataStructInterface{

  public final static  String S_TemplateStatus = "TEMPLATE_STATUS";
  public final static  String S_State = "STATE";
  public final static  String S_OperatorId = "OPERATOR_ID";
  public final static  String S_IsNewver = "IS_NEWVER";
  public final static  String S_StatusDate = "STATUS_DATE";
  public final static  String S_ExpDate = "EXP_DATE";
  public final static  String S_TermTitle = "TERM_TITLE";
  public final static  String S_AgrLevelId = "AGR_LEVEL_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OrganizationId = "ORGANIZATION_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_Description = "DESCRIPTION";
  public final static  String S_TermCode = "TERM_CODE";
  public final static  String S_TermTemplateId = "TERM_TEMPLATE_ID";
  public final static  String S_EffDate = "EFF_DATE";
  public final static  String S_AgrDocUrl = "AGR_DOC_URL";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_OwnerType = "OWNER_TYPE";
  public final static  String S_UpTermTemplateId = "UP_TERM_TEMPLATE_ID";
  public final static  String S_VersionCode = "VERSION_CODE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OfferId = "OFFER_ID";
  public final static  String S_AgrLevel = "AGR_LEVEL";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_TermType = "TERM_TYPE";
  public final static  String S_IsHistory = "IS_HISTORY";


public String getTemplateStatus();

public long getState();

public long getOperatorId();

public String getIsNewver();

public Timestamp getStatusDate();

public Timestamp getExpDate();

public String getTermTitle();

public long getAgrLevelId();

public long getCreateOpId();

public String getDoneCode();

public long getOrganizationId();

public long getOpId();

public String getDescription();

public String getTermCode();

public long getTermTemplateId();

public Timestamp getEffDate();

public String getAgrDocUrl();

public long getOrgId();

public long getCreateOrgId();

public String getOwnerType();

public long getUpTermTemplateId();

public String getVersionCode();

public Timestamp getDoneDate();

public long getOfferId();

public String getAgrLevel();

public Timestamp getCreateDate();

public String getTermType();

public long getIsHistory();


public  void setTemplateStatus(String value);

public  void setState(long value);

public  void setOperatorId(long value);

public  void setIsNewver(String value);

public  void setStatusDate(Timestamp value);

public  void setExpDate(Timestamp value);

public  void setTermTitle(String value);

public  void setAgrLevelId(long value);

public  void setCreateOpId(long value);

public  void setDoneCode(String value);

public  void setOrganizationId(long value);

public  void setOpId(long value);

public  void setDescription(String value);

public  void setTermCode(String value);

public  void setTermTemplateId(long value);

public  void setEffDate(Timestamp value);

public  void setAgrDocUrl(String value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setOwnerType(String value);

public  void setUpTermTemplateId(long value);

public  void setVersionCode(String value);

public  void setDoneDate(Timestamp value);

public  void setOfferId(long value);

public  void setAgrLevel(String value);

public  void setCreateDate(Timestamp value);

public  void setTermType(String value);

public  void setIsHistory(long value);
}
