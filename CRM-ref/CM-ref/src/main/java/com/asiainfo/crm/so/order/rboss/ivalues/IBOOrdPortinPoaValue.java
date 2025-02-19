package com.asiainfo.crm.so.order.rboss.ivalues;
import java.sql.Timestamp;

import com.ai.appframe2.common.DataStructInterface;
public interface IBOOrdPortinPoaValue extends DataStructInterface{

  public final static  String S_DoneDate = "done_date";
  public final static  String S_NumberSeries = "number_series";
  public final static  String S_State = "state";
  public final static  String S_PoaState = "poa_state";
  public final static  String S_City = "city";
  public final static  String S_CustName = "cust_name";
  public final static  String S_PortingDate = "porting_date";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_NumberType = "number_type";
  public final static  String S_CheckMode = "check_mode";
  public final static  String S_AccountId = "account_id";
  public final static  String S_PostCode = "post_code";
  public final static  String S_Cpr = "cpr";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_OrdId = "ord_id";
  public final static  String S_IsNeed = "is_need";
  public final static  String S_CustId = "cust_id";
  public final static  String S_IccId = "icc_id";
  public final static  String S_OrgId = "org_id";
  public final static  String S_CustType = "cust_type";
  public final static  String S_IpAddress = "ip_address";
  public final static  String S_Ext1 = "ext1";
  public final static  String S_CurrentSp = "current_sp";
  public final static  String S_Address = "address";
  public final static  String S_Email = "email";
  public final static  String S_Ext2 = "ext2";
  public final static  String S_Ext3 = "ext3";
  public final static  String S_CustomerOrderId = "customer_order_id";
  public final static  String S_ParentCustomerOrderId = "parent_customer_order_id";
  public final static  String S_PoaId = "poa_id";
  public final static  String S_BillId = "bill_id";
  public final static  String S_AccountBillId = "account_bill_id";
  public final static  String S_SubCustId = "sub_cust_id";
  public final static  String S_RejectCode = "reject_code";
  public final static  String S_RejectDesc = "reject_desc";
  public final static  String S_NpStatus = "np_status";
  public final static  String S_ReturnConfirmDate = "return_confirm_date";
  public final static  String S_Birthday = "Birthday";
  public final static  String S_EncryptCode = "encrypt_code";
  
  public final static  String S_ContactEmail = "contact_email";
  public final static  String S_IsAgree = "is_agree";

  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_ExpireDate = "expire_date";
  
public Timestamp getEffectiveDate();
public  void setEffectiveDate(Timestamp value);
  
  
public Timestamp getExpireDate();
public  void setExpireDate(Timestamp value);
  
public Timestamp getDoneDate();

public String getNumberSeries();

public long getState();

public long getPoaState();

public String getCity();

public String getCustName();

public Timestamp getPortingDate();

public long getOpId();

public Timestamp getCreateDate();

public Timestamp getBirthday();

public String getNumberType();

public String getCheckMode();

public String getAccountId();

public long getPostCode();

public String getCpr();

public long getDoneCode();

public long getOrdId();

public String getIsNeed();

public String getCustId();

public String getIccId();

public long getOrgId();

public String getCustType();

public String getIpAddress();

public String getExt1();

public String getCurrentSp();

public String getAddress();

public String getEmail();

public String getExt2();

public String getExt3();

public long getCustomerOrderId();

public long getParentCustomerOrderId();

public long getPoaId();

public String getBillId();

public String getAccountBillId();

public  long getSubCustId();

public  String getRejectCode();

public  String getRejectDesc();

public String getEncryptCode();

public  String getNpStatus();

public  String getReturnConfirmDate();

public String getContactEmail();

public String getIsAgree();

public  void setDoneDate(Timestamp value);

public  void setNumberSeries(String value);

public  void setState(long value);

public  void setPoaState(long value);

public  void setCity(String value);

public  void setCustName(String value);

public void setEncryptCode(String encryptCode);

public  void setPortingDate(Timestamp value);

public  void setOpId(long value);

public  void setCreateDate(Timestamp value);

public  void setBirthday(Timestamp value);

public  void setNumberType(String value);

public  void setCheckMode(String value);

public  void setAccountId(String value);

public  void setPostCode(long value);

public  void setCpr(String value);

public  void setDoneCode(long value);

public  void setOrdId(long value);

public  void setIsNeed(String value);

public  void setCustId(String value);

public  void setIccId(String value);

public  void setOrgId(long value);

public  void setCustType(String value);

public  void setIpAddress(String value);

public  void setExt1(String value);

public  void setCurrentSp(String value);

public  void setAddress(String value);

public  void setEmail(String value);

public  void setExt2(String value);

public  void setExt3(String value);

public  void setCustomerOrderId(long value);

public  void setParentCustomerOrderId(long value);

public  void setPoaId(long value);

public  void setBillId(String value);

public  void setAccountBillId(String value);

public  void setSubCustId(long value);

public  void setRejectCode(String value);

public  void setRejectDesc(String value);

public  void setNpStatus(String value);

public  void setReturnConfirmDate(String value);

public  void setContactEmail(String value);

public  void setIsAgree(String value);

}
