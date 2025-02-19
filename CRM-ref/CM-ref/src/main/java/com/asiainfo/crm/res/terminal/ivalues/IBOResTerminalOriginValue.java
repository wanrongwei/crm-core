package com.asiainfo.crm.res.terminal.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOResTerminalOriginValue extends DataStructInterface{

  public final static  String S_Remarks = "REMARKS";
  public final static  String S_Supplier = "SUPPLIER";
  public final static  String S_SecOrgId = "SEC_ORG_ID";
  public final static  String S_ResCode = "RES_CODE";
  public final static  String S_ResRuleId = "RES_RULE_ID";
  public final static  String S_ConfigId = "CONFIG_ID";
  public final static  String S_Status = "STATUS";
  public final static  String S_ResStatus = "RES_STATUS";
  public final static  String S_SalePrice = "SALE_PRICE";
  public final static  String S_CheckResult = "CHECK_RESULT";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_Id = "ID";
  public final static  String S_ColorId = "COLOR_ID";
  public final static  String S_UseType = "USE_TYPE";
  public final static  String S_ResSpecId = "RES_SPEC_ID";
  public final static  String S_ResStoreId = "RES_STORE_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_UseRange = "USE_RANGE";
  public final static  String S_SalesChannel = "SALES_CHANNEL";
  public final static  String S_ResInstId = "RES_INST_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_IccId = "ICC_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_PayPrice = "PAY_PRICE";
  public final static  String S_Sn = "SN";
  public final static  String S_MatCode = "MAT_CODE";
  public final static  String S_Amount = "AMOUNT";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_InstorePrice = "INSTORE_PRICE";
  public final static  String S_TerminalPrice = "TERMINAL_PRICE";
  public final static  String S_Imei = "IMEI";
  public final static  String S_BatchId = "BATCH_ID";
  public final static  String S_ManageStatus = "MANAGE_STATUS";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_IsTenancy = "IS_TENANCY";
  public final static  String S_FactoryId = "FACTORY_ID";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";


public String getRemarks();

public long getSupplier();

public long getSecOrgId();

public String getResCode();

public long getResRuleId();

public long getConfigId();

public String getStatus();

public String getResStatus();

public long getSalePrice();

public String getCheckResult();

public long getCustId();

public long getId();

public long getColorId();

public long getUseType();

public long getResSpecId();

public long getResStoreId();

public long getDoneCode();

public long getUseRange();

public String getSalesChannel();

public String getResInstId();

public Timestamp getExpireDate();

public String getIccId();

public Timestamp getEffectiveDate();

public long getOpId();

public long getPayPrice();

public String getSn();

public String getMatCode();

public long getAmount();

public long getOrgId();

public String getRegionId();

public long getInstorePrice();

public long getTerminalPrice();

public String getImei();

public String getBatchId();

public String getManageStatus();

public Timestamp getDoneDate();

public String getIsTenancy();

public String getFactoryId();

public String getBillId();

public Timestamp getCreateDate();


public  void setRemarks(String value);

public  void setSupplier(long value);

public  void setSecOrgId(long value);

public  void setResCode(String value);

public  void setResRuleId(long value);

public  void setConfigId(long value);

public  void setStatus(String value);

public  void setResStatus(String value);

public  void setSalePrice(long value);

public  void setCheckResult(String value);

public  void setCustId(long value);

public  void setId(long value);

public  void setColorId(long value);

public  void setUseType(long value);

public  void setResSpecId(long value);

public  void setResStoreId(long value);

public  void setDoneCode(long value);

public  void setUseRange(long value);

public  void setSalesChannel(String value);

public  void setResInstId(String value);

public  void setExpireDate(Timestamp value);

public  void setIccId(String value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setPayPrice(long value);

public  void setSn(String value);

public  void setMatCode(String value);

public  void setAmount(long value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setInstorePrice(long value);

public  void setTerminalPrice(long value);

public  void setImei(String value);

public  void setBatchId(String value);

public  void setManageStatus(String value);

public  void setDoneDate(Timestamp value);

public  void setIsTenancy(String value);

public  void setFactoryId(String value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);
}
