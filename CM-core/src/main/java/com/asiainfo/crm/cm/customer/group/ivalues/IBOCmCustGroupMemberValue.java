package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCustGroupMemberValue extends DataStructInterface{

  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_State = "state";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_RegionId = "region_id";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_CustId = "cust_id";
  public final static  String S_OrgId = "org_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_CustGroupId = "cust_group_id";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_CustGroupMemberId = "cust_group_member_id";
  public final static  String S_CreateOpId = "create_op_id";


public Timestamp getExpireDate();

public Timestamp getDoneDate();

public String getState();

public long getDoneCode();

public String getRegionId();

public long getCreateOrgId();

public long getCustId();

public long getOrgId();

public long getOpId();

public Timestamp getCreateDate();

public long getCustGroupId();

public Timestamp getEffectiveDate();

public long getCustGroupMemberId();

public long getCreateOpId();


public  void setExpireDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setState(String value);

public  void setDoneCode(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCustId(long value);

public  void setOrgId(long value);

public  void setOpId(long value);

public  void setCreateDate(Timestamp value);

public  void setCustGroupId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setCustGroupMemberId(long value);

public  void setCreateOpId(long value);
}
