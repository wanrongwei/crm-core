package com.asiainfo.crm.agreement.agreement.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOAgrCatalogNegotiateHValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OwnerId = "OWNER_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_AttrName = "ATTR_NAME";
  public final static  String S_AgrVersionId = "AGR_VERSION_ID";
  public final static  String S_DiscountValue = "DISCOUNT_VALUE";
  public final static  String S_AgreementId = "AGREEMENT_ID";
  public final static  String S_CatalogId = "CATALOG_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ParentCatalogName = "PARENT_CATALOG_NAME";
  public final static  String S_AgrCatalogNegotiateId = "AGR_CATALOG_NEGOTIATE_ID";
  public final static  String S_ValidDate = "VALID_DATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ParentCatalogId = "PARENT_CATALOG_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CatalogName = "CATALOG_NAME";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_AttrId = "ATTR_ID";
  public final static  String S_DiscountType = "DISCOUNT_TYPE";


public Timestamp getExpireDate();

public long getOwnerId();

public long getOpId();

public long getState();

public String getAttrName();

public long getAgrVersionId();

public long getDiscountValue();

public long getAgreementId();

public long getCatalogId();

public long getOrgId();

public long getCreateOrgId();

public String getParentCatalogName();

public long getAgrCatalogNegotiateId();

public Timestamp getValidDate();

public long getCreateOpId();

public long getParentCatalogId();

public Timestamp getDoneDate();

public String getCatalogName();

public String getDoneCode();

public Timestamp getCreateDate();

public long getAttrId();

public String getDiscountType();


public  void setExpireDate(Timestamp value);

public  void setOwnerId(long value);

public  void setOpId(long value);

public  void setState(long value);

public  void setAttrName(String value);

public  void setAgrVersionId(long value);

public  void setDiscountValue(long value);

public  void setAgreementId(long value);

public  void setCatalogId(long value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setParentCatalogName(String value);

public  void setAgrCatalogNegotiateId(long value);

public  void setValidDate(Timestamp value);

public  void setCreateOpId(long value);

public  void setParentCatalogId(long value);

public  void setDoneDate(Timestamp value);

public  void setCatalogName(String value);

public  void setDoneCode(String value);

public  void setCreateDate(Timestamp value);

public  void setAttrId(long value);

public  void setDiscountType(String value);
}
