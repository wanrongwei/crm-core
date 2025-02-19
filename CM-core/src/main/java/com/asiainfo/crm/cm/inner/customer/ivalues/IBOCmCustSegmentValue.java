package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCustSegmentValue extends DataStructInterface{

  public final static  String S_AllowCreditCalculated = "allow_credit_calculated";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_State = "state";
  public final static  String S_RegionId = "region_id";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_SegmentName = "segment_name";
  public final static  String S_Remarks = "remarks";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_OrgId = "org_id";
  public final static  String S_SegmentId = "segment_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_UpSegmentId = "up_segment_id";
  public final static  String S_AllowApprovable = "allow_approvable";
  public final static  String S_AllowInheritable = "allow_inheritable";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_ProcessDef = "process_def";
  public final static  String S_AllowRevisable = "allow_revisable";
  public final static  String S_CreateOpId = "create_op_id";


public long getAllowCreditCalculated();

public Timestamp getExpireDate();

public Timestamp getDoneDate();

public String getState();

public String getRegionId();

public long getDoneCode();

public String getSegmentName();

public String getRemarks();

public long getCreateOrgId();

public long getOrgId();

public long getSegmentId();

public long getOpId();

public Timestamp getCreateDate();

public long getUpSegmentId();

public long getAllowApprovable();

public long getAllowInheritable();

public Timestamp getEffectiveDate();

public String getProcessDef();

public long getAllowRevisable();

public long getCreateOpId();


public  void setAllowCreditCalculated(long value);

public  void setExpireDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setState(String value);

public  void setRegionId(String value);

public  void setDoneCode(long value);

public  void setSegmentName(String value);

public  void setRemarks(String value);

public  void setCreateOrgId(long value);

public  void setOrgId(long value);

public  void setSegmentId(long value);

public  void setOpId(long value);

public  void setCreateDate(Timestamp value);

public  void setUpSegmentId(long value);

public  void setAllowApprovable(long value);

public  void setAllowInheritable(long value);

public  void setEffectiveDate(Timestamp value);

public  void setProcessDef(String value);

public  void setAllowRevisable(long value);

public  void setCreateOpId(long value);
}
