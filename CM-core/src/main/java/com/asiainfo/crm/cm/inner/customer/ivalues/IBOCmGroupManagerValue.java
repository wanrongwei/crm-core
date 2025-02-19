package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupManagerValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_RelId = "REL_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ManagerId = "MANAGER_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RelType = "REL_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CustId = "CUST_ID";


public String getState();

public long getCreateOpId();

public long getRelId();

public Timestamp getEffectiveDate();

public long getManagerId();

public Timestamp getDoneDate();

public String getRemarks();

public long getOrgId();

public int getRelType();

public Timestamp getCreateDate();

public long getDoneCode();

public int getOperType();

public Timestamp getExpireDate();

public long getOpId();

public String getRegionId();

public long getCreateOrgId();

public long getCustId();


public  void setState(String value);

public  void setCreateOpId(long value);

public  void setRelId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setManagerId(long value);

public  void setDoneDate(Timestamp value);

public  void setRemarks(String value);

public  void setOrgId(long value);

public  void setRelType(int value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setOperType(int value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCustId(long value);
}
