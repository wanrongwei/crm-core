package com.asiainfo.crm.open.core.bo;

import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;

public interface IIOpenProvisionWait extends DataStructInterface{

  public final static  String S_CustOrderId = "CUST_ORDER_ID";
  public final static  String S_State = "STATE";
  public final static  String S_OfferOrderId = "OFFER_ORDER_ID";
  public final static  String S_Platform = "PLATFORM";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Target = "TARGET";
  public final static  String S_SrcSystem = "SRC_SYSTEM";
  public final static  String S_PsService = "PS_SERVICE";
  public final static  String S_SrcSystemCode = "SRC_SYSTEM_CODE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CompleteDate = "COMPLETE_DATE";
  public final static  String S_VmTaskId = "VM_TASK_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_UpiBwoId = "UPI_BWO_ID";
  public final static  String S_Result = "RESULT";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_OperateCode = "OPERATE_CODE";
  public final static  String S_Id = "ID";


public long getCustOrderId();

public String getState();

public long getOfferOrderId();

public String getPlatform();

public Timestamp getCreateDate();

public String getTarget();

public String getSrcSystem();

public String getPsService();

public String getSrcSystemCode();

public String getRegionId();

public Timestamp getCompleteDate();

public long getVmTaskId();

public long getUserId();

public String getUpiBwoId();

public String getResult();

public String getBillId();

public String getOperateCode();

public long getId();


public  void setCustOrderId(long value);

public  void setState(String value);

public  void setOfferOrderId(long value);

public  void setPlatform(String value);

public  void setCreateDate(Timestamp value);

public  void setTarget(String value);

public  void setSrcSystem(String value);

public  void setPsService(String value);

public  void setSrcSystemCode(String value);

public  void setRegionId(String value);

public  void setCompleteDate(Timestamp value);

public  void setVmTaskId(long value);

public  void setUserId(long value);

public  void setUpiBwoId(String value);

public  void setResult(String value);

public  void setBillId(String value);

public  void setOperateCode(String value);

public  void setId(long value);
}
