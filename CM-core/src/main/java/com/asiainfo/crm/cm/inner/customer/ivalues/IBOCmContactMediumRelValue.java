package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmContactMediumRelValue extends DataStructInterface{

  public final static  String S_ContRelaId = "cont_rela_id";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_RelaId = "rela_id";
  public final static  String S_State = "state";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_RegionId = "region_id";
  public final static  String S_Remarks = "remarks";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_OrgId = "org_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_CustContId = "cust_cont_id";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_CreateOpId = "create_op_id";


public long getContRelaId();

public Timestamp getExpireDate();

public Timestamp getDoneDate();

public long getRelaId();

public String getState();

public long getDoneCode();

public String getRegionId();

public String getRemarks();

public long getCreateOrgId();

public long getOrgId();

public long getOpId();

public Timestamp getCreateDate();

public long getCustContId();

public Timestamp getEffectiveDate();

public long getCreateOpId();


public  void setContRelaId(long value);

public  void setExpireDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setRelaId(long value);

public  void setState(String value);

public  void setDoneCode(long value);

public  void setRegionId(String value);

public  void setRemarks(String value);

public  void setCreateOrgId(long value);

public  void setOrgId(long value);

public  void setOpId(long value);

public  void setCreateDate(Timestamp value);

public  void setCustContId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setCreateOpId(long value);
}
