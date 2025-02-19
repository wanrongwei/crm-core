package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCustPreferChannelValue extends DataStructInterface{

  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_PreferChannelName = "prefer_channel_name";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_State = "state";
  public final static  String S_RegionId = "region_id";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_Remarks = "remarks";
  public final static  String S_PerferType = "perfer_type";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_CustId = "cust_id";
  public final static  String S_Prior = "prior";
  public final static  String S_OrgId = "org_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_PreferChannelId = "prefer_channel_id";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_CustContRelaId = "cust_cont_rela_id";
  public final static  String S_CreateOpId = "create_op_id";


public Timestamp getExpireDate();

public String getPreferChannelName();

public Timestamp getDoneDate();

public String getState();

public String getRegionId();

public long getDoneCode();

public String getRemarks();

public long getPerferType();

public long getCreateOrgId();

public long getCustId();

public long getPrior();

public long getOrgId();

public long getOpId();

public Timestamp getCreateDate();

public long getPreferChannelId();

public Timestamp getEffectiveDate();

public long getCustContRelaId();

public long getCreateOpId();


public  void setExpireDate(Timestamp value);

public  void setPreferChannelName(String value);

public  void setDoneDate(Timestamp value);

public  void setState(String value);

public  void setRegionId(String value);

public  void setDoneCode(long value);

public  void setRemarks(String value);

public  void setPerferType(long value);

public  void setCreateOrgId(long value);

public  void setCustId(long value);

public  void setPrior(long value);

public  void setOrgId(long value);

public  void setOpId(long value);

public  void setCreateDate(Timestamp value);

public  void setPreferChannelId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setCustContRelaId(long value);

public  void setCreateOpId(long value);
}
