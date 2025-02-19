package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupContactBindingValue extends DataStructInterface{

  public final static  String S_ContId = "cont_id";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_State = "state";
  public final static  String S_RegionId = "region_id";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_Remarks = "remarks";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_CustId = "cust_id";
  public final static  String S_OrgId = "org_id";
  public final static  String S_Ext5 = "ext5";
  public final static  String S_Ext6 = "ext6";
  public final static  String S_OpId = "op_id";
  public final static  String S_BindingEvent = "binding_event";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_Ext1 = "ext1";
  public final static  String S_Ext2 = "ext2";
  public final static  String S_RelId = "rel_id";
  public final static  String S_Ext3 = "ext3";
  public final static  String S_Ext4 = "ext4";
  public final static  String S_IsNotify = "is_notify";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_CreateOpId = "create_op_id";


public long getContId();

public Timestamp getExpireDate();

public Timestamp getDoneDate();

public String getState();

public String getRegionId();

public long getDoneCode();

public String getRemarks();

public long getCreateOrgId();

public long getCustId();

public long getOrgId();

public String getExt5();

public String getExt6();

public long getOpId();

public long getBindingEvent();

public Timestamp getCreateDate();

public String getExt1();

public String getExt2();

public long getRelId();

public String getExt3();

public String getExt4();

public long getIsNotify();

public Timestamp getEffectiveDate();

public long getCreateOpId();


public  void setContId(long value);

public  void setExpireDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setState(String value);

public  void setRegionId(String value);

public  void setDoneCode(long value);

public  void setRemarks(String value);

public  void setCreateOrgId(long value);

public  void setCustId(long value);

public  void setOrgId(long value);

public  void setExt5(String value);

public  void setExt6(String value);

public  void setOpId(long value);

public  void setBindingEvent(long value);

public  void setCreateDate(Timestamp value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setRelId(long value);

public  void setExt3(String value);

public  void setExt4(String value);

public  void setIsNotify(long value);

public  void setEffectiveDate(Timestamp value);

public  void setCreateOpId(long value);
}
