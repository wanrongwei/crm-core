package com.asiainfo.crm.cm.model.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IClubServiceRecValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ServiceDate = "SERVICE_DATE";
  public final static  String S_MemberId = "MEMBER_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_SuiteAmount = "SUITE_AMOUNT";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ServicePlace = "SERVICE_PLACE";
  public final static  String S_RecordId = "RECORD_ID";
  public final static  String S_RoamFlag = "ROAM_FLAG";
  public final static  String S_ServiceType = "SERVICE_TYPE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_ValueType = "VALUE_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_ServiceSource = "SERVICE_SOURCE";
  public final static  String S_OptSeq = "OPT_SEQ";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ValueAmount = "VALUE_AMOUNT";
  public final static  String S_ProvinceCode = "PROVINCE_CODE";
  public final static  String S_PaymentId = "PAYMENT_ID";
  public final static  String S_ServiceId = "SERVICE_ID";
  public final static  String S_ServiceContent = "SERVICE_CONTENT";


public String getState();

public Timestamp getEffectiveDate();

public Timestamp getDoneDate();

public String getRemarks();

public Timestamp getServiceDate();

public long getMemberId();

public Timestamp getCreateDate();

public long getDoneCode();

public long getSuiteAmount();

public long getOpId();

public String getRegionId();

public String getServicePlace();

public long getRecordId();

public int getRoamFlag();

public int getServiceType();

public long getCreateOpId();

public long getOrgId();

public int getValueType();

public Timestamp getExpireDate();

public int getServiceSource();

public long getOptSeq();

public long getCreateOrgId();

public long getValueAmount();

public String getProvinceCode();

public String getPaymentId();

public long getServiceId();

public String getServiceContent();


public  void setState(String value);

public  void setEffectiveDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setRemarks(String value);

public  void setServiceDate(Timestamp value);

public  void setMemberId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setSuiteAmount(long value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setServicePlace(String value);

public  void setRecordId(long value);

public  void setRoamFlag(int value);

public  void setServiceType(int value);

public  void setCreateOpId(long value);

public  void setOrgId(long value);

public  void setValueType(int value);

public  void setExpireDate(Timestamp value);

public  void setServiceSource(int value);

public  void setOptSeq(long value);

public  void setCreateOrgId(long value);

public  void setValueAmount(long value);

public  void setProvinceCode(String value);

public  void setPaymentId(String value);

public  void setServiceId(long value);

public  void setServiceContent(String value);
}
