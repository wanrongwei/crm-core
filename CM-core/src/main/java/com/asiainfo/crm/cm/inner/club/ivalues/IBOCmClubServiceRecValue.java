package com.asiainfo.crm.cm.inner.club.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmClubServiceRecValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_SuiteAmount = "SUITE_AMOUNT";
  public final static  String S_ServiceId = "SERVICE_ID";
  public final static  String S_MemberId = "MEMBER_ID";
  public final static  String S_ValueType = "VALUE_TYPE";
  public final static  String S_RecordId = "RECORD_ID";
  public final static  String S_PaymentId = "PAYMENT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_RoamFlag = "ROAM_FLAG";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ProvinceCode = "PROVINCE_CODE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ServiceContent = "SERVICE_CONTENT";
  public final static  String S_ValueAmount = "VALUE_AMOUNT";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OptSeq = "OPT_SEQ";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ServicePlace = "SERVICE_PLACE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ServiceDate = "SERVICE_DATE";
  public final static  String S_ServiceSource = "SERVICE_SOURCE";


public String getState();

public String getRemarks();

public long getSuiteAmount();

public long getServiceId();

public long getMemberId();

public int getValueType();

public long getRecordId();

public String getPaymentId();

public long getCreateOpId();

public int getRoamFlag();

public long getDoneCode();

public String getProvinceCode();

public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getServiceContent();

public long getValueAmount();

public long getOrgId();

public long getCreateOrgId();

public String getRegionId();

public long getOptSeq();

public Timestamp getDoneDate();

public String getServicePlace();

public Timestamp getCreateDate();

public Timestamp getServiceDate();

public int getServiceSource();


public  void setState(String value);

public  void setRemarks(String value);

public  void setSuiteAmount(long value);

public  void setServiceId(long value);

public  void setMemberId(long value);

public  void setValueType(int value);

public  void setRecordId(long value);

public  void setPaymentId(String value);

public  void setCreateOpId(long value);

public  void setRoamFlag(int value);

public  void setDoneCode(long value);

public  void setProvinceCode(String value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setServiceContent(String value);

public  void setValueAmount(long value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setRegionId(String value);

public  void setOptSeq(long value);

public  void setDoneDate(Timestamp value);

public  void setServicePlace(String value);

public  void setCreateDate(Timestamp value);

public  void setServiceDate(Timestamp value);

public  void setServiceSource(int value);
}
