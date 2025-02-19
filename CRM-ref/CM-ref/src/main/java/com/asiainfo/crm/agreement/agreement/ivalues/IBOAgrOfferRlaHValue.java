package com.asiainfo.crm.agreement.agreement.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOAgrOfferRlaHValue extends DataStructInterface{

  public final static  String S_BcNetPrice = "BC_NET_PRICE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ValidDate = "VALID_DATE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_AttrName = "ATTR_NAME";
  public final static  String S_IsFuture = "IS_FUTURE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_NegotiateType = "NEGOTIATE_TYPE";
  public final static  String S_ProdName = "PROD_NAME";
  public final static  String S_BcDetail = "BC_DETAIL";
  public final static  String S_OwnerId = "OWNER_ID";
  public final static  String S_BcDisplayType = "BC_DISPLAY_TYPE";
  public final static  String S_AgrOfferRlaId = "AGR_OFFER_RLA_ID";
  public final static  String S_Description = "DESCRIPTION";
  public final static  String S_ProdId = "PROD_ID";
  public final static  String S_RcValue = "RC_VALUE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OfferName = "OFFER_NAME";
  public final static  String S_BcDisplayName = "BC_DISPLAY_NAME";
  public final static  String S_BcPricePlanId = "BC_PRICE_PLAN_ID";
  public final static  String S_DefaultGroup = "DEFAULT_GROUP";
  public final static  String S_OfferId = "OFFER_ID";
  public final static  String S_AgrVersionId = "AGR_VERSION_ID";
  public final static  String S_BcListPrice = "BC_LIST_PRICE";
  public final static  String S_AgrOfferType = "AGR_OFFER_TYPE";
  public final static  String S_DiscountType = "DISCOUNT_TYPE";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_AgreementId = "AGREEMENT_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_NegotiateSrc = "NEGOTIATE_SRC";
  public final static  String S_AttrId = "ATTR_ID";
  public final static  String S_BcPriceId = "BC_PRICE_ID";
  public final static  String S_BcDiscount = "BC_DISCOUNT";


public long getBcNetPrice();

public long getCreateOpId();

public Timestamp getValidDate();

public long getOrgId();

public String getAttrName();

public String getIsFuture();

public long getOpId();

public String getNegotiateType();

public String getProdName();

public String getBcDetail();

public long getOwnerId();

public String getBcDisplayType();

public long getAgrOfferRlaId();

public String getDescription();

public long getProdId();

public long getRcValue();

public long getCreateOrgId();

public Timestamp getExpireDate();

public Timestamp getDoneDate();

public String getDoneCode();

public String getOfferName();

public String getBcDisplayName();

public long getBcPricePlanId();

public String getDefaultGroup();

public long getOfferId();

public long getAgrVersionId();

public long getBcListPrice();

public String getAgrOfferType();

public String getDiscountType();

public String getGroupId();

public long getAgreementId();

public Timestamp getCreateDate();

public String getNegotiateSrc();

public long getAttrId();

public long getBcPriceId();

public long getBcDiscount();


public  void setBcNetPrice(long value);

public  void setCreateOpId(long value);

public  void setValidDate(Timestamp value);

public  void setOrgId(long value);

public  void setAttrName(String value);

public  void setIsFuture(String value);

public  void setOpId(long value);

public  void setNegotiateType(String value);

public  void setProdName(String value);

public  void setBcDetail(String value);

public  void setOwnerId(long value);

public  void setBcDisplayType(String value);

public  void setAgrOfferRlaId(long value);

public  void setDescription(String value);

public  void setProdId(long value);

public  void setRcValue(long value);

public  void setCreateOrgId(long value);

public  void setExpireDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setDoneCode(String value);

public  void setOfferName(String value);

public  void setBcDisplayName(String value);

public  void setBcPricePlanId(long value);

public  void setDefaultGroup(String value);

public  void setOfferId(long value);

public  void setAgrVersionId(long value);

public  void setBcListPrice(long value);

public  void setAgrOfferType(String value);

public  void setDiscountType(String value);

public  void setGroupId(String value);

public  void setAgreementId(long value);

public  void setCreateDate(Timestamp value);

public  void setNegotiateSrc(String value);

public  void setAttrId(long value);

public  void setBcPriceId(long value);

public  void setBcDiscount(long value);
}
