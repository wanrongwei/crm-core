package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCustGroupValue extends DataStructInterface{

  public final static  String S_CustGroupCode = "cust_group_code";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_CustGroupName = "cust_group_name";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_State = "state";
  public final static  String S_RegionId = "region_id";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_CustGroupDesc = "cust_group_desc";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_OrgId = "org_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_CustGroupId = "cust_group_id";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_CreateOpId = "create_op_id";


public String getCustGroupCode();

public Timestamp getExpireDate();

public String getCustGroupName();

public Timestamp getDoneDate();

public String getState();

public String getRegionId();

public long getDoneCode();

public String getCustGroupDesc();

public long getCreateOrgId();

public long getOrgId();

public long getOpId();

public Timestamp getCreateDate();

public long getCustGroupId();

public Timestamp getEffectiveDate();

public long getCreateOpId();


public  void setCustGroupCode(String value);

public  void setExpireDate(Timestamp value);

public  void setCustGroupName(String value);

public  void setDoneDate(Timestamp value);

public  void setState(String value);

public  void setRegionId(String value);

public  void setDoneCode(long value);

public  void setCustGroupDesc(String value);

public  void setCreateOrgId(long value);

public  void setOrgId(long value);

public  void setOpId(long value);

public  void setCreateDate(Timestamp value);

public  void setCustGroupId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setCreateOpId(long value);
}
