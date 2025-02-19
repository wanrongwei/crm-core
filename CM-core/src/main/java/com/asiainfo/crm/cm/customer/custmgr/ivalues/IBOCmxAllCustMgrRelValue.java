package com.asiainfo.crm.cm.customer.custmgr.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxAllCustMgrRelValue extends DataStructInterface{

  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_UserBillId = "USER_BILL_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_RelType = "REL_TYPE";
  public final static  String S_ProcessState = "PROCESS_STATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ManagerBillId = "MANAGER_BILL_ID";
  public final static  String S_MgrType = "MGR_TYPE";
  public final static  String S_OperType = "OPER_TYPE";


public String getRegionId();

public String getUserBillId();

public long getCustId();

public int getRelType();

public int getProcessState();

public Timestamp getDoneDate();

public String getManagerBillId();

public int getMgrType();

public int getOperType();


public  void setRegionId(String value);

public  void setUserBillId(String value);

public  void setCustId(long value);

public  void setRelType(int value);

public  void setProcessState(int value);

public  void setDoneDate(Timestamp value);

public  void setManagerBillId(String value);

public  void setMgrType(int value);

public  void setOperType(int value);
}
