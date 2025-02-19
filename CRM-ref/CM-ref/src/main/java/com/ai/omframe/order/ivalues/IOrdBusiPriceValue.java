package com.ai.omframe.order.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IOrdBusiPriceValue extends DataStructInterface{

    public final static  String S_State = "STATE";
    public final static  String S_OrderNum = "ORDER_NUM";
    public final static  String S_TaxMoney = "TAX_MONEY";
    public final static  String S_Remarks = "REMARKS";
    public final static  String S_CustRegionId = "CUST_REGION_ID";
    public final static  String S_OpRegionId = "OP_REGION_ID";
    public final static  String S_TaxKind = "TAX_KIND";
    public final static  String S_FactPriceitemValue = "FACT_PRICEITEM_VALUE";
    public final static  String S_ObjEffectiveDate = "OBJ_EFFECTIVE_DATE";
    public final static  String S_BusiPriceInstId = "BUSI_PRICE_INST_ID";
    public final static  String S_OrderState = "ORDER_STATE";
    public final static  String S_PriceId = "PRICE_ID";
    public final static  String S_CustomerOrderId = "CUSTOMER_ORDER_ID";
    public final static  String S_ShouldMoney = "SHOULD_MONEY";
    public final static  String S_DoneCode = "DONE_CODE";
    public final static  String S_DistcountMoney = "DISTCOUNT_MONEY";
    public final static  String S_DiscountType = "DISCOUNT_TYPE";
    public final static  String S_ObjExpireDate = "OBJ_EXPIRE_DATE";
    public final static  String S_ExpireDate = "EXPIRE_DATE";
    public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
    public final static  String S_OpId = "OP_ID";
    public final static  String S_PriceitemId = "PRICEITEM_ID";
    public final static  String S_PreTaxMoney = "PRE_TAX_MONEY";
    public final static  String S_TargetAcctId = "TARGET_ACCT_ID";
    public final static  String S_PriceDetailType = "PRICE_DETAIL_TYPE";
    public final static  String S_IsSendReport = "IS_SEND_REPORT";
    public final static  String S_TotalScore = "TOTAL_SCORE";
    public final static  String S_OrgId = "ORG_ID";
    public final static  String S_RegionId = "REGION_ID";
    public final static  String S_FactMoney = "FACT_MONEY";
    public final static  String S_PayType = "PAY_TYPE";
    public final static  String S_DoneDate = "DONE_DATE";
    public final static  String S_Ext5 = "EXT5";
    public final static  String S_CreateDate = "CREATE_DATE";
    public final static  String S_Ext1 = "EXT1";
    public final static  String S_Ext2 = "EXT2";
    public final static  String S_OffUserOrderId = "OFF_USER_ORDER_ID";
    public final static  String S_Ext3 = "EXT3";
    public final static  String S_BusiPriceOrderId = "BUSI_PRICE_ORDER_ID";
    public final static  String S_Ext4 = "EXT4";
    public final static  String S_ChargeMode = "CHARGE_MODE";


    public int getState();

    public long getOrderNum();

    public long getTaxMoney();

    public String getRemarks();

    public String getCustRegionId();

    public String getOpRegionId();

    public String getTaxKind();

    public long getFactPriceitemValue();

    public Timestamp getObjEffectiveDate();

    public long getBusiPriceInstId();

    public long getOrderState();

    public long getPriceId();

    public long getCustomerOrderId();

    public long getShouldMoney();

    public long getDoneCode();

    public long getDistcountMoney();

    public long getDiscountType();

    public Timestamp getObjExpireDate();

    public Timestamp getExpireDate();

    public Timestamp getEffectiveDate();

    public long getOpId();

    public long getPriceitemId();

    public long getPreTaxMoney();

    public long getTargetAcctId();

    public String getPriceDetailType();

    public long getIsSendReport();

    public long getTotalScore();

    public long getOrgId();

    public String getRegionId();

    public long getFactMoney();

    public int getPayType();

    public Timestamp getDoneDate();

    public String getExt5();

    public Timestamp getCreateDate();

    public String getExt1();

    public String getChargeMode();

    public long getOffUserOrderId();

    public long getExt3();

    public long getBusiPriceOrderId();

    public long getExt4();

    public String getExt2();


    public  void setState(int value);

    public  void setOrderNum(long value);

    public  void setTaxMoney(long value);

    public  void setRemarks(String value);

    public  void setCustRegionId(String value);

    public  void setOpRegionId(String value);

    public  void setTaxKind(String value);

    public  void setFactPriceitemValue(long value);

    public  void setObjEffectiveDate(Timestamp value);

    public  void setBusiPriceInstId(long value);

    public  void setOrderState(long value);

    public  void setPriceId(long value);

    public  void setCustomerOrderId(long value);

    public  void setShouldMoney(long value);

    public  void setDoneCode(long value);

    public  void setDistcountMoney(long value);

    public  void setDiscountType(long value);

    public  void setObjExpireDate(Timestamp value);

    public  void setExpireDate(Timestamp value);

    public  void setEffectiveDate(Timestamp value);

    public  void setOpId(long value);

    public  void setPriceitemId(long value);

    public  void setPreTaxMoney(long value);

    public  void setTargetAcctId(long value);

    public  void setPriceDetailType(String value);

    public  void setIsSendReport(long value);

    public  void setTotalScore(long value);

    public  void setOrgId(long value);

    public  void setRegionId(String value);

    public  void setFactMoney(long value);

    public  void setPayType(int value);

    public  void setDoneDate(Timestamp value);

    public  void setExt5(String value);

    public  void setCreateDate(Timestamp value);

    public  void setExt1(String value);

    public  void setExt2(String value);

    public  void setOffUserOrderId(long value);

    public  void setExt3(long value);

    public  void setBusiPriceOrderId(long value);

    public  void setExt4(long value);

    public void setChargeMode(String value);
}
