package com.asiainfo.crm.res.terminal.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOResOperOrderTerminalValue extends DataStructInterface{

  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_TerminalName = "TERMINAL_NAME";
  public final static  String S_Ext = "EXT";
  public final static  String S_SrcOrgId = "SRC_ORG_ID";
  public final static  String S_HoldCol1 = "HOLD_COL1";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_NewSeriesCode = "NEW_SERIES_CODE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_SalesChannel = "SALES_CHANNEL";
  public final static  String S_Status = "STATUS";
  public final static  String S_ValidMoney = "VALID_MONEY";
  public final static  String S_ResEventId = "RES_EVENT_ID";
  public final static  String S_BegId = "BEG_ID";
  public final static  String S_RebatePrice = "REBATE_PRICE";
  public final static  String S_ResTypeId = "RES_TYPE_ID";
  public final static  String S_ResSpecId = "RES_SPEC_ID";
  public final static  String S_RcvAmount = "RCV_AMOUNT";
  public final static  String S_HoldCol2 = "HOLD_COL2";
  public final static  String S_DistrAmount = "DISTR_AMOUNT";
  public final static  String S_ResStatus = "RES_STATUS";
  public final static  String S_HoldCol5 = "HOLD_COL5";
  public final static  String S_SrcStoreId = "SRC_STORE_ID";
  public final static  String S_DestStoreId = "DEST_STORE_ID";
  public final static  String S_HoldCol8 = "HOLD_COL8";
  public final static  String S_PayType = "PAY_TYPE";
  public final static  String S_BusinessId = "BUSINESS_ID";
  public final static  String S_EndId = "END_ID";
  public final static  String S_Amount = "AMOUNT";
  public final static  String S_Usepoints = "USEPOINTS";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_HoldCol7 = "HOLD_COL7";
  public final static  String S_DestOrgId = "DEST_ORG_ID";
  public final static  String S_SaleOpId = "SALE_OP_ID";
  public final static  String S_HoldCol6 = "HOLD_COL6";
  public final static  String S_OrderDtlId = "ORDER_DTL_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DepreciationMoney = "DEPRECIATION_MONEY";
  public final static  String S_ManageStatus = "MANAGE_STATUS";
  public final static  String S_Notes = "NOTES";
  public final static  String S_PhoneNum = "PHONE_NUM";
  public final static  String S_UseType = "USE_TYPE";
  public final static  String S_ColorId = "COLOR_ID";
  public final static  String S_HoldCol9 = "HOLD_COL9";
  public final static  String S_HoldCol4 = "HOLD_COL4";
  public final static  String S_UseRange = "USE_RANGE";
  public final static  String S_SaletotalMoney = "SALETOTAL_MONEY";
  public final static  String S_AgentName = "AGENT_NAME";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_HoldCol3 = "HOLD_COL3";
  public final static  String S_TerminalFee = "TERMINAL_FEE";
  public final static  String S_AreaId = "AREA_ID";
  public final static  String S_IsOut = "IS_OUT";
  public final static  String S_SalePrice = "SALE_PRICE";
  public final static  String S_OpOrg = "OP_ORG";
  public final static  String S_OldSeriesCode = "OLD_SERIES_CODE";
  public final static  String S_Accessories = "ACCESSORIES";
  public final static  String S_ConfigId = "CONFIG_ID";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_RejectAmount = "REJECT_AMOUNT";
  public final static  String S_Supplier = "SUPPLIER";
  public final static  String S_FactoryId = "FACTORY_ID";
  public final static  String S_PartnerId = "PARTNER_ID";
  public final static  String S_ResInstId = "RES_INST_ID";
  public final static  String S_IsChange = "IS_CHANGE";
  public final static  String S_Receiver = "RECEIVER";
  public final static  String S_ChangeSale = "CHANGE_SALE";

public Timestamp getDoneDate();

public String getTerminalName();

public String getExt();

public long getSrcOrgId();

public String getHoldCol1();

public Timestamp getCreateDate();

public long getDoneCode();

public String getNewSeriesCode();

public long getOpId();

public String getSalesChannel();

public String getStatus();

public long getValidMoney();

public long getResEventId();

public String getBegId();

public long getRebatePrice();

public long getResTypeId();

public long getResSpecId();

public String getRcvAmount();

public String getHoldCol2();

public String getDistrAmount();

public String getResStatus();

public String getHoldCol5();

public long getSrcStoreId();

public long getDestStoreId();

public String getHoldCol8();

public long getPayType();

public long getBusinessId();

public String getEndId();

public long getAmount();

public long getUsepoints();

public Timestamp getExpireDate();

public String getHoldCol7();

public long getDestOrgId();

public long getSaleOpId();

public String getHoldCol6();

public long getOrderDtlId();

public Timestamp getEffectiveDate();

public long getDepreciationMoney();

public String getManageStatus();

public String getNotes();

public String getPhoneNum();

public int getUseType();

public long getColorId();

public String getHoldCol9();

public String getHoldCol4();

public long getUseRange();

public long getSaletotalMoney();

public String getAgentName();

public String getRegionId();

public String getHoldCol3();

public long getTerminalFee();

public long getAreaId();

public String getIsOut();

public long getSalePrice();

public long getChangeSale();

public long getOpOrg();

public String getOldSeriesCode();

public String getAccessories();

public long getConfigId();

public String getCountyId();

public String getRejectAmount();

public long getSupplier();

public String getFactoryId();

public long getPartnerId();

public String getResInstId();

public String getIsChange();

public long getReceiver();


public  void setDoneDate(Timestamp value);

public  void setTerminalName(String value);

public  void setExt(String value);

public  void setSrcOrgId(long value);

public  void setHoldCol1(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setNewSeriesCode(String value);

public  void setOpId(long value);

public  void setSalesChannel(String value);

public  void setStatus(String value);

public  void setValidMoney(long value);

public  void setResEventId(long value);

public  void setBegId(String value);

public  void setRebatePrice(long value);

public  void setResTypeId(long value);

public  void setResSpecId(long value);

public  void setRcvAmount(String value);

public  void setHoldCol2(String value);

public  void setDistrAmount(String value);

public  void setResStatus(String value);

public  void setHoldCol5(String value);

public  void setSrcStoreId(long value);

public  void setDestStoreId(long value);

public  void setHoldCol8(String value);

public  void setPayType(long value);

public  void setBusinessId(long value);

public  void setEndId(String value);

public  void setAmount(long value);

public  void setUsepoints(long value);

public  void setExpireDate(Timestamp value);

public  void setHoldCol7(String value);

public  void setDestOrgId(long value);

public  void setSaleOpId(long value);

public  void setHoldCol6(String value);

public  void setOrderDtlId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setDepreciationMoney(long value);

public  void setManageStatus(String value);

public  void setNotes(String value);

public  void setPhoneNum(String value);

public  void setUseType(int value);

public  void setColorId(long value);

public  void setHoldCol9(String value);

public  void setHoldCol4(String value);

public  void setUseRange(long value);

public  void setSaletotalMoney(long value);

public  void setAgentName(String value);

public  void setRegionId(String value);

public  void setHoldCol3(String value);

public  void setTerminalFee(long value);

public  void setAreaId(long value);

public  void setIsOut(String value);

public  void setSalePrice(long value);

public  void setChangeSale(long value);

public  void setOpOrg(long value);

public  void setOldSeriesCode(String value);

public  void setAccessories(String value);

public  void setConfigId(long value);

public  void setCountyId(String value);

public  void setRejectAmount(String value);

public  void setSupplier(long value);

public  void setFactoryId(String value);

public  void setPartnerId(long value);

public  void setResInstId(String value);

public  void setIsChange(String value);

public  void setReceiver(long value);
}
