package com.asiainfo.crm.agreement.agreement.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOAgrAgreementHValue extends DataStructInterface{

  public final static  String S_OwnerId = "OWNER_ID";
  public final static  String S_State = "STATE";
  public final static  String S_OperatorId = "OPERATOR_ID";
  public final static  String S_StatusTime = "STATUS_TIME";
  public final static  String S_ParentCreateDate = "PARENT_CREATE_DATE";
  public final static  String S_AgrBarCode = "AGR_BAR_CODE";
  public final static  String S_SecrecyLevel = "SECRECY_LEVEL";
  public final static  String S_IsAddendum = "IS_ADDENDUM";
  public final static  String S_EmailStatus = "EMAIL_STATUS";
  public final static  String S_AgrSourceObjId = "AGR_SOURCE_OBJ_ID";
  public final static  String S_UpAgreementId = "UP_AGREEMENT_ID";
  public final static  String S_IsNewver = "IS_NEWVER";
  public final static  String S_BillCycle = "BILL_CYCLE";
  public final static  String S_RenewTimes = "RENEW_TIMES";
  public final static  String S_ExpDate = "EXP_DATE";
  public final static  String S_AgrSource = "AGR_SOURCE";
  public final static  String S_AgrLevelId = "AGR_LEVEL_ID";
  public final static  String S_AgrSourceBizId = "AGR_SOURCE_BIZ_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_BillNo = "BILL_NO";
  public final static  String S_RenewCircle = "RENEW_CIRCLE";
  public final static  String S_OrganizationId = "ORGANIZATION_ID";
  public final static  String S_AgrTempVersionId = "AGR_TEMP_VERSION_ID";
  public final static  String S_BreachStatus = "BREACH_STATUS";
  public final static  String S_PaymentTerms = "PAYMENT_TERMS";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_AgreementCode = "AGREEMENT_CODE";
  public final static  String S_SignPlace = "SIGN_PLACE";
  public final static  String S_AgreementStatus = "AGREEMENT_STATUS";
  public final static  String S_Description = "DESCRIPTION";
  public final static  String S_AgreementName = "AGREEMENT_NAME";
  public final static  String S_AgrVersionCode = "AGR_VERSION_CODE";
  public final static  String S_AgrVersionId = "AGR_VERSION_ID";
  public final static  String S_EffDate = "EFF_DATE";
  public final static  String S_AgrDocUrl = "AGR_DOC_URL";
  public final static  String S_AgreementId = "AGREEMENT_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_AgrTypeId = "AGR_TYPE_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_OwnerType = "OWNER_TYPE";
  public final static  String S_AgreementTempCode = "AGREEMENT_TEMP_CODE";
  public final static  String S_AutoRenew = "AUTO_RENEW";
  public final static  String S_AgreementTemplateId = "AGREEMENT_TEMPLATE_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_AgreementHisId = "AGREEMENT_HIS_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_SignTime = "SIGN_TIME";


public long getOwnerId();

public long getState();

public long getOperatorId();

public Timestamp getStatusTime();

public Timestamp getParentCreateDate();

public String getAgrBarCode();

public String getSecrecyLevel();

public long getIsAddendum();

public String getEmailStatus();

public long getAgrSourceObjId();

public long getUpAgreementId();

public String getIsNewver();

public String getBillCycle();

public long getRenewTimes();

public Timestamp getExpDate();

public String getAgrSource();

public long getAgrLevelId();

public String getAgrSourceBizId();

public long getCreateOpId();

public String getDoneCode();

public String getBillNo();

public String getRenewCircle();

public long getOrganizationId();

public long getAgrTempVersionId();

public String getBreachStatus();

public String getPaymentTerms();

public long getOpId();

public String getAgreementCode();

public String getSignPlace();

public long getAgreementStatus();

public String getDescription();

public String getAgreementName();

public String getAgrVersionCode();

public long getAgrVersionId();

public Timestamp getEffDate();

public String getAgrDocUrl();

public long getAgreementId();

public long getOrgId();

public long getAgrTypeId();

public long getCreateOrgId();

public String getOwnerType();

public String getAgreementTempCode();

public String getAutoRenew();

public long getAgreementTemplateId();

public Timestamp getDoneDate();

public long getAgreementHisId();

public Timestamp getCreateDate();

public Timestamp getSignTime();


public  void setOwnerId(long value);

public  void setState(long value);

public  void setOperatorId(long value);

public  void setStatusTime(Timestamp value);

public  void setParentCreateDate(Timestamp value);

public  void setAgrBarCode(String value);

public  void setSecrecyLevel(String value);

public  void setIsAddendum(long value);

public  void setEmailStatus(String value);

public  void setAgrSourceObjId(long value);

public  void setUpAgreementId(long value);

public  void setIsNewver(String value);

public  void setBillCycle(String value);

public  void setRenewTimes(long value);

public  void setExpDate(Timestamp value);

public  void setAgrSource(String value);

public  void setAgrLevelId(long value);

public  void setAgrSourceBizId(String value);

public  void setCreateOpId(long value);

public  void setDoneCode(String value);

public  void setBillNo(String value);

public  void setRenewCircle(String value);

public  void setOrganizationId(long value);

public  void setAgrTempVersionId(long value);

public  void setBreachStatus(String value);

public  void setPaymentTerms(String value);

public  void setOpId(long value);

public  void setAgreementCode(String value);

public  void setSignPlace(String value);

public  void setAgreementStatus(long value);

public  void setDescription(String value);

public  void setAgreementName(String value);

public  void setAgrVersionCode(String value);

public  void setAgrVersionId(long value);

public  void setEffDate(Timestamp value);

public  void setAgrDocUrl(String value);

public  void setAgreementId(long value);

public  void setOrgId(long value);

public  void setAgrTypeId(long value);

public  void setCreateOrgId(long value);

public  void setOwnerType(String value);

public  void setAgreementTempCode(String value);

public  void setAutoRenew(String value);

public  void setAgreementTemplateId(long value);

public  void setDoneDate(Timestamp value);

public  void setAgreementHisId(long value);

public  void setCreateDate(Timestamp value);

public  void setSignTime(Timestamp value);

public  void setCvrNo(String value);

public String getCvrNo();
}