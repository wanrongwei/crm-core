package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBoCmCustSegmentValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_NotifyType = "NOTIFY_TYPE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_AllowCreditCalculated = "ALLOW_CREDIT_CALCULATED";
  public final static  String S_UpSegmentId = "UP_SEGMENT_ID";
  public final static  String S_SegmentName = "SEGMENT_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RelId = "REL_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_AllowRevisable = "ALLOW_REVISABLE";
  public final static  String S_AllowInheritable = "ALLOW_INHERITABLE";
  public final static  String S_SegmentId = "SEGMENT_ID";
  public final static  String S_AllowManual = "ALLOW_MANUAL";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ProcessDef = "PROCESS_DEF";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_NoticePeriod = "NOTICE_PERIOD";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_AllowApprovable = "ALLOW_APPROVABLE";


public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getState();

public long getNotifyType();

public String getRemarks();

public long getAllowCreditCalculated();

public long getUpSegmentId();

public String getSegmentName();

public long getOrgId();

public long getRelId();

public String getRegionId();

public long getCreateOrgId();

public long getAllowRevisable();

public long getAllowInheritable();

public long getSegmentId();

public long getAllowManual();

public long getCreateOpId();

public String getProcessDef();

public Timestamp getDoneDate();

public long getNoticePeriod();

public Timestamp getCreateDate();

public long getDoneCode();

public long getAllowApprovable();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setNotifyType(long value);

public  void setRemarks(String value);

public  void setAllowCreditCalculated(long value);

public  void setUpSegmentId(long value);

public  void setSegmentName(String value);

public  void setOrgId(long value);

public  void setRelId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setAllowRevisable(long value);

public  void setAllowInheritable(long value);

public  void setSegmentId(long value);

public  void setAllowManual(long value);

public  void setCreateOpId(long value);

public  void setProcessDef(String value);

public  void setDoneDate(Timestamp value);

public  void setNoticePeriod(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setAllowApprovable(long value);
}
