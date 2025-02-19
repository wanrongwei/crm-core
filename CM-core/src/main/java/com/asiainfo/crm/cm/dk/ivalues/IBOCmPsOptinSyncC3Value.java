package com.asiainfo.crm.cm.dk.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmPsOptinSyncC3Value extends DataStructInterface{

  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_State = "state";
  public final static  String S_RegionId = "region_id";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_Remarks = "remarks";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_RecordId = "record_id";
  public final static  String S_OrgId = "org_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_County = "county";
  public final static  String S_Action = "action";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_BillId = "bill_id";
  public final static  String S_CreateOpId = "create_op_id";
  public final static  String S_OptinFlag = "optin_flag";


public Timestamp getExpireDate();

public Timestamp getDoneDate();

public String getState();

public String getRegionId();

public long getDoneCode();

public String getRemarks();

public long getCreateOrgId();

public long getRecordId();

public long getOrgId();

public long getOpId();

public Timestamp getCreateDate();

public String getCounty();

public long getAction();

public Timestamp getEffectiveDate();

public String getBillId();

public long getCreateOpId();

public String getOptinFlag();


public  void setExpireDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setState(String value);

public  void setRegionId(String value);

public  void setDoneCode(long value);

public  void setRemarks(String value);

public  void setCreateOrgId(long value);

public  void setRecordId(long value);

public  void setOrgId(long value);

public  void setOpId(long value);

public  void setCreateDate(Timestamp value);

public  void setCounty(String value);

public  void setAction(long value);

public  void setEffectiveDate(Timestamp value);

public  void setBillId(String value);

public  void setCreateOpId(long value);

public  void setOptinFlag(String value);
}
