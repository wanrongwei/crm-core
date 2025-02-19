package com.asiainfo.crm.so.osebatch.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOSoShopCartValue extends DataStructInterface{

  public final static  String S_DefaultBillId = "default_bill_id";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_State = "state";
  public final static  String S_TenantId = "tenant_id";
  public final static  String S_Remarks = "remarks";
  public final static  String S_CustId = "cust_id";
  public final static  String S_Id = "id";
  public final static  String S_OrgId = "org_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_DefaultUserId = "default_user_id";
  public final static  String S_PayType = "pay_type";

public String getDefaultBillId();

public Timestamp getExpireDate();

public Timestamp getDoneDate();

public long getDoneCode();

public String getState();

public String getTenantId();

public String getRemarks();

public long getCustId();

public long getId();

public long getOrgId();

public long getOpId();

public Timestamp getCreateDate();

public Timestamp getEffectiveDate();

public long getDefaultUserId();

public String getPayType();

public  void setDefaultBillId(String value);

public  void setExpireDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setDoneCode(long value);

public  void setState(String value);

public  void setTenantId(String value);

public  void setRemarks(String value);

public  void setCustId(long value);

public  void setId(long value);

public  void setOrgId(long value);

public  void setOpId(long value);

public  void setCreateDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setDefaultUserId(long value);

public  void setPayType(String value);
}
