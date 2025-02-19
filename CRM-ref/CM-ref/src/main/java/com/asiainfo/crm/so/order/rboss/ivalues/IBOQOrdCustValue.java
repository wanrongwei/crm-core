package com.asiainfo.crm.so.order.rboss.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOQOrdCustValue extends DataStructInterface{

  public final static  String S_SourceSystemId = "SOURCE_SYSTEM_ID";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_CustRegionId = "CUST_REGION_ID";
  public final static  String S_OpRegionId = "OP_REGION_ID";
  public final static  String S_VerifyType = "VERIFY_TYPE";
  public final static  String S_PreSoId = "PRE_SO_ID";
  public final static  String S_ChannelType = "CHANNEL_TYPE";
  public final static  String S_OldOrderCode = "OLD_ORDER_CODE";
  public final static  String S_OrderState = "ORDER_STATE";
  public final static  String S_BookingOpenDt = "BOOKING_OPEN_DT";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_OrganizeName = "ORGANIZE_NAME";
  public final static  String S_WorkflowTaskId = "WORKFLOW_TASK_ID";
  public final static  String S_OrderCode = "ORDER_CODE";
  public final static  String S_CertifiTypeId = "CERTIFI_TYPE_ID";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_BusinessName = "BUSINESS_NAME";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BusinessType = "BUSINESS_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_CustState = "CUST_STATE";
  public final static  String S_OrganizeId = "ORGANIZE_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_RepFeePhoneNo = "REP_FEE_PHONE_NO";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_AgencyPerson = "AGENCY_PERSON";
  public final static  String S_Tel = "TEL";
  public final static  String S_AcctState = "ACCT_STATE";
  public final static  String S_CustomerOrderId = "CUSTOMER_ORDER_ID";
  public final static  String S_CertifiCode = "CERTIFI_CODE";
  public final static  String S_StaffName = "STAFF_NAME";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CeaseReason = "CEASE_REASON";
  public final static  String S_BusinessId = "BUSINESS_ID";
  public final static  String S_PartnerId = "PARTNER_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_BookingHomeDt = "BOOKING_HOME_DT";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ExtDoneCode = "EXT_DONE_CODE";
  public final static  String S_FactMoney = "FACT_MONEY";
  public final static  String S_StaffId = "STAFF_ID";
  public final static  String S_PayType = "PAY_TYPE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_WrrantNo = "WRRANT_NO";
  public final static  String S_ExtDoneType = "EXT_DONE_TYPE";


public long getSourceSystemId();

public String getCountyCode();

public String getCustRegionId();

public String getOpRegionId();

public String getVerifyType();

public String getPreSoId();

public long getChannelType();

public String getOldOrderCode();

public long getOrderState();

public Timestamp getBookingOpenDt();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getOrganizeName();

public String getWorkflowTaskId();

public String getOrderCode();

public long getCertifiTypeId();

public String getCustType();

public String getCustName();

public String getBusinessName();

public Timestamp getDoneDate();

public String getBusinessType();

public Timestamp getCreateDate();

public String getCustState();

public long getOrganizeId();

public long getState();

public String getRemarks();

public String getRepFeePhoneNo();

public long getCustId();

public String getAgencyPerson();

public String getTel();

public String getAcctState();

public long getCustomerOrderId();

public String getCertifiCode();

public String getStaffName();

public long getDoneCode();

public String getCeaseReason();

public long getBusinessId();

public long getPartnerId();

public long getUserId();

public Timestamp getBookingHomeDt();

public long getOrgId();

public String getRegionId();

public String getExtDoneCode();

public long getFactMoney();

public long getStaffId();

public long getPayType();

public String getBillId();

public String getWrrantNo();

public String getExtDoneType();


public  void setSourceSystemId(long value);

public  void setCountyCode(String value);

public  void setCustRegionId(String value);

public  void setOpRegionId(String value);

public  void setVerifyType(String value);

public  void setPreSoId(String value);

public  void setChannelType(long value);

public  void setOldOrderCode(String value);

public  void setOrderState(long value);

public  void setBookingOpenDt(Timestamp value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setOrganizeName(String value);

public  void setWorkflowTaskId(String value);

public  void setOrderCode(String value);

public  void setCertifiTypeId(long value);

public  void setCustType(String value);

public  void setCustName(String value);

public  void setBusinessName(String value);

public  void setDoneDate(Timestamp value);

public  void setBusinessType(String value);

public  void setCreateDate(Timestamp value);

public  void setCustState(String value);

public  void setOrganizeId(long value);

public  void setState(long value);

public  void setRemarks(String value);

public  void setRepFeePhoneNo(String value);

public  void setCustId(long value);

public  void setAgencyPerson(String value);

public  void setTel(String value);

public  void setAcctState(String value);

public  void setCustomerOrderId(long value);

public  void setCertifiCode(String value);

public  void setStaffName(String value);

public  void setDoneCode(long value);

public  void setCeaseReason(String value);

public  void setBusinessId(long value);

public  void setPartnerId(long value);

public  void setUserId(long value);

public  void setBookingHomeDt(Timestamp value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setExtDoneCode(String value);

public  void setFactMoney(long value);

public  void setStaffId(long value);

public  void setPayType(long value);

public  void setBillId(String value);

public  void setWrrantNo(String value);

public  void setExtDoneType(String value);
}
