package com.asiainfo.crm.so.common.party.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOOrdxIntfControlValue extends DataStructInterface{

  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_IntfType = "INTF_TYPE";
  public final static  String S_IntfId = "INTF_ID";
  public final static  String S_ResultCode = "RESULT_CODE";
  public final static  String S_UpdateDate = "UPDATE_DATE";
  public final static  String S_RelatCustomerOrderId = "RELAT_CUSTOMER_ORDER_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_ResultMsg = "RESULT_MSG";
  public final static  String S_OrderId = "ORDER_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_SessionId = "SESSION_ID";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ControlId = "CONTROL_ID";


public long getOpId();

public String getState();

public String getIntfType();

public String getIntfId();

public String getResultCode();

public Timestamp getUpdateDate();

public long getRelatCustomerOrderId();

public long getOrgId();

public String getResultMsg();

public String getOrderId();

public long getCustId();

public String getSessionId();

public String getBillId();

public Timestamp getCreateDate();

public long getControlId();


public  void setOpId(long value);

public  void setState(String value);

public  void setIntfType(String value);

public  void setIntfId(String value);

public  void setResultCode(String value);

public  void setUpdateDate(Timestamp value);

public  void setRelatCustomerOrderId(long value);

public  void setOrgId(long value);

public  void setResultMsg(String value);

public  void setOrderId(String value);

public  void setCustId(long value);

public  void setSessionId(String value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setControlId(long value);
}
