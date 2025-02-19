package com.asiainfo.crm.agreement.template.agrtemplate.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOAgrTempVerHisValue extends DataStructInterface{

  public final static  String S_TemplateStatus = "TEMPLATE_STATUS";
  public final static  String S_State = "STATE";
  public final static  String S_UpTemplateId = "UP_TEMPLATE_ID";
  public final static  String S_OperatorId = "OPERATOR_ID";
  public final static  String S_StatusTime = "STATUS_TIME";
  public final static  String S_IsAddendum = "IS_ADDENDUM";
  public final static  String S_AgrLevelId = "AGR_LEVEL_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_VerCreateOpId = "VER_CREATE_OP_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OrganizationId = "ORGANIZATION_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_TemplateCode = "TEMPLATE_CODE";
  public final static  String S_SelfCode = "SELF_CODE";
  public final static  String S_AgrVersionId = "AGR_VERSION_ID";
  public final static  String S_AgrDocUrl = "AGR_DOC_URL";
  public final static  String S_VerCreateDate = "VER_CREATE_DATE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_AgrTypeId = "AGR_TYPE_ID";
  public final static  String S_ModifyReason = "MODIFY_REASON";
  public final static  String S_AgreementTemplateId = "AGREEMENT_TEMPLATE_ID";
  public final static  String S_VersionCode = "VERSION_CODE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_AgreementTemplateHId = "AGREEMENT_TEMPLATE_H_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_AgreementTemplateName = "AGREEMENT_TEMPLATE_NAME";
  public final static  String S_IsNewver = "IS_NEWVER";
  public final static  String S_Language = "LANGUAGE";


public String getTemplateStatus();

public int getState();

public long getUpTemplateId();

public long getOperatorId();

public Timestamp getStatusTime();

public int getIsAddendum();

public long getAgrLevelId();

public long getCreateOpId();

public long getVerCreateOpId();

public String getDoneCode();

public long getOrganizationId();

public long getOpId();

public long getTemplateCode();

public String getSelfCode();

public long getAgrVersionId();

public String getAgrDocUrl();

public Timestamp getVerCreateDate();

public long getOrgId();

public long getCreateOrgId();

public long getAgrTypeId();

public String getModifyReason();

public long getAgreementTemplateId();

public String getVersionCode();

public Timestamp getDoneDate();

public long getAgreementTemplateHId();

public Timestamp getCreateDate();

public String getAgreementTemplateName();

public String getIsNewver();

public String getLanguage();


public  void setTemplateStatus(String value);

public  void setState(int value);

public  void setUpTemplateId(long value);

public  void setOperatorId(long value);

public  void setStatusTime(Timestamp value);

public  void setIsAddendum(int value);

public  void setAgrLevelId(long value);

public  void setCreateOpId(long value);

public  void setVerCreateOpId(long value);

public  void setDoneCode(String value);

public  void setOrganizationId(long value);

public  void setOpId(long value);

public  void setTemplateCode(long value);

public  void setSelfCode(String value);

public  void setAgrVersionId(long value);

public  void setAgrDocUrl(String value);

public  void setVerCreateDate(Timestamp value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setAgrTypeId(long value);

public  void setModifyReason(String value);

public  void setAgreementTemplateId(long value);

public  void setVersionCode(String value);

public  void setDoneDate(Timestamp value);

public  void setAgreementTemplateHId(long value);

public  void setCreateDate(Timestamp value);

public  void setAgreementTemplateName(String value);

public void setIsNewver(String value);

public  void setLanguage(String value);
}
