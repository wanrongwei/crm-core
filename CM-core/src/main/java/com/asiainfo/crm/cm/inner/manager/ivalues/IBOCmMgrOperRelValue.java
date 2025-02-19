package com.asiainfo.crm.cm.inner.manager.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmMgrOperRelValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Name = "NAME";
  public final static  String S_OperatorId = "OPERATOR_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_StaffId = "STAFF_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Code = "CODE";


public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getState();

public String getName();

public long getOperatorId();

public String getRemarks();

public long getOrgId();

public long getCreateOrgId();

public long getStaffId();

public long getCreateOpId();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public long getDoneCode();

public String getCode();


public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setState(String value);

public  void setName(String value);

public  void setOperatorId(long value);

public  void setRemarks(String value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setStaffId(long value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setCode(String value);
}
