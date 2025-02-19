package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCustSegmentRelaValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_NotifyType = "NOTIFY_TYPE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_IsCreditRecalculated = "IS_CREDIT_RECALCULATED";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_IsRevisable = "IS_REVISABLE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RelaId = "RELA_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_SegmentId = "SEGMENT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_IsCreditCalculated = "IS_CREDIT_CALCULATED";
  public final static  String S_NoticePeriod = "NOTICE_PERIOD";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_IsApprovable = "IS_APPROVABLE";
  public final static  String S_IsInheritable = "IS_INHERITABLE";

  

public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getState();

public long getNotifyType();

public String getRemarks();

public long getIsCreditRecalculated();

public long getOrgId();

public long getIsRevisable();

public String getRegionId();

public long getCreateOrgId();

public long getRelaId();

public long getCustId();

public long getSegmentId();

public long getCreateOpId();

public Timestamp getDoneDate();

public long getIsCreditCalculated();

public long getNoticePeriod();

public Timestamp getCreateDate();

public long getDoneCode();

public long getIsApprovable();

public long getIsInheritable();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setNotifyType(long value);

public  void setRemarks(String value);

public  void setIsCreditRecalculated(long value);

public  void setOrgId(long value);

public  void setIsRevisable(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setRelaId(long value);

public  void setCustId(long value);

public  void setSegmentId(long value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setIsCreditCalculated(long value);

public  void setNoticePeriod(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setIsApprovable(long value);

public  void setIsInheritable(long value);
}
