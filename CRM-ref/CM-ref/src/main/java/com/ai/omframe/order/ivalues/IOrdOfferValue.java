package com.ai.omframe.order.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IOrdOfferValue extends DataStructInterface{

    public final static  String S_SrcSystemType = "SRC_SYSTEM_TYPE";
    public final static  String S_SalePartyRoleId = "SALE_PARTY_ROLE_ID";
    public final static  String S_CancelReason = "CANCEL_REASON";
    public final static  String S_RelatType = "RELAT_TYPE";
    public final static  String S_State = "STATE";
    public final static  String S_CountyCode = "COUNTY_CODE";
    public final static  String S_LastInsDoneCode = "LAST_INS_DONE_CODE";
    public final static  String S_ObjEffectiveDate = "OBJ_EFFECTIVE_DATE";
    public final static  String S_ObjEffectiveType = "OBJ_EFFECTIVE_TYPE";
    public final static  String S_EffectiveDateType = "EFFECTIVE_DATE_TYPE";
    public final static  String S_ExpireProcessType = "EXPIRE_PROCESS_TYPE";
    public final static  String S_ObjExpireType = "OBJ_EXPIRE_TYPE";
    public final static  String S_OldOfferId = "OLD_OFFER_ID";
    public final static  String S_ChannelType = "CHANNEL_TYPE";
    public final static  String S_OrderState = "ORDER_STATE";
    public final static  String S_CustId = "CUST_ID";
    public final static  String S_CreateOpId = "CREATE_OP_ID";
    public final static  String S_CancelDate = "CANCEL_DATE";
    public final static  String S_CustomerOrderId = "CUSTOMER_ORDER_ID";
    public final static  String S_NumExt1 = "NUM_EXT1";
    public final static  String S_InsState = "INS_STATE";
    public final static  String S_DoneCode = "DONE_CODE";
    public final static  String S_InsDoneCode = "INS_DONE_CODE";
    public final static  String S_ObjExpireDate = "OBJ_EXPIRE_DATE";
    public final static  String S_OfferType = "OFFER_TYPE";
    public final static  String S_ExpireDate = "EXPIRE_DATE";
    public final static  String S_OpId = "OP_ID";
    public final static  String S_BusinessId = "BUSINESS_ID";
    public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
    public final static  String S_UserId = "USER_ID";
    public final static  String S_SaleType = "SALE_TYPE";
    public final static  String S_BrandId = "BRAND_ID";
    public final static  String S_OrderName = "ORDER_NAME";
    public final static  String S_CustType = "CUST_TYPE";
    public final static  String S_OldExpireDate = "OLD_EXPIRE_DATE";
    public final static  String S_OrgId = "ORG_ID";
    public final static  String S_RegionId = "REGION_ID";
    public final static  String S_CreateOrgId = "CREATE_ORG_ID";
    public final static  String S_ExtDoneCode = "EXT_DONE_CODE";
    public final static  String S_OfferId = "OFFER_ID";
    public final static  String S_DoneDate = "DONE_DATE";
    public final static  String S_OfferOrderId = "OFFER_ORDER_ID";
    public final static  String S_BusinessType = "BUSINESS_TYPE";
    public final static  String S_ExpireDateType = "EXPIRE_DATE_TYPE";
    public final static  String S_CreateDate = "CREATE_DATE";
    public final static  String S_OfferInstId = "OFFER_INST_ID";
    public final static  String S_OsState = "OS_STATE";


    public int getSrcSystemType();

    public long getSalePartyRoleId();

    public String getCancelReason();

    public String getRelatType();

    public int getState();

    public String getCountyCode();

    public long getLastInsDoneCode();

    public Timestamp getObjEffectiveDate();

    public String getObjEffectiveType();

    public String getEffectiveDateType();

    public int getExpireProcessType();

    public String getObjExpireType();

    public long getOldOfferId();

    public long getChannelType();

    public int getOrderState();

    public long getCustId();

    public long getCreateOpId();

    public Timestamp getCancelDate();

    public long getCustomerOrderId();

    public long getNumExt1();

    public int getInsState();

    public long getDoneCode();

    public long getInsDoneCode();

    public Timestamp getObjExpireDate();

    public String getOfferType();

    public Timestamp getExpireDate();

    public long getOpId();

    public long getBusinessId();

    public Timestamp getEffectiveDate();

    public long getUserId();

    public int getSaleType();

    public long getBrandId();

    public String getOrderName();

    public String getCustType();

    public Timestamp getOldExpireDate();

    public long getOrgId();

    public String getRegionId();

    public long getCreateOrgId();

    public String getExtDoneCode();

    public long getOfferId();

    public Timestamp getDoneDate();

    public long getOfferOrderId();

    public String getBusinessType();

    public String getExpireDateType();

    public Timestamp getCreateDate();

    public long getOfferInstId();

    public String getOsState();


    public  void setSrcSystemType(int value);

    public  void setSalePartyRoleId(long value);

    public  void setCancelReason(String value);

    public  void setRelatType(String value);

    public  void setState(int value);

    public  void setCountyCode(String value);

    public  void setLastInsDoneCode(long value);

    public  void setObjEffectiveDate(Timestamp value);

    public  void setObjEffectiveType(String value);

    public  void setEffectiveDateType(String value);

    public  void setExpireProcessType(int value);

    public  void setObjExpireType(String value);

    public  void setOldOfferId(long value);

    public  void setChannelType(long value);

    public  void setOrderState(int value);

    public  void setCustId(long value);

    public  void setCreateOpId(long value);

    public  void setCancelDate(Timestamp value);

    public  void setCustomerOrderId(long value);

    public  void setNumExt1(long value);

    public  void setInsState(int value);

    public  void setDoneCode(long value);

    public  void setInsDoneCode(long value);

    public  void setObjExpireDate(Timestamp value);

    public  void setOfferType(String value);

    public  void setExpireDate(Timestamp value);

    public  void setOpId(long value);

    public  void setBusinessId(long value);

    public  void setEffectiveDate(Timestamp value);

    public  void setUserId(long value);

    public  void setSaleType(int value);

    public  void setBrandId(long value);

    public  void setOrderName(String value);

    public  void setCustType(String value);

    public  void setOldExpireDate(Timestamp value);

    public  void setOrgId(long value);

    public  void setRegionId(String value);

    public  void setCreateOrgId(long value);

    public  void setExtDoneCode(String value);

    public  void setOfferId(long value);

    public  void setDoneDate(Timestamp value);

    public  void setOfferOrderId(long value);

    public  void setBusinessType(String value);

    public  void setExpireDateType(String value);

    public  void setCreateDate(Timestamp value);

    public  void setOfferInstId(long value);

    public  void setOsState(String value);
}
