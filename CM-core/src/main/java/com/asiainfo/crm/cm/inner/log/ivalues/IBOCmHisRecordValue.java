package com.asiainfo.crm.cm.inner.log.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmHisRecordValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_HId = "H_ID";
  public final static  String S_ObjId = "OBJ_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ObjName = "OBJ_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ObjType = "OBJ_TYPE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_DetailRecord4 = "DETAIL_RECORD_4";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_DetailRecord1 = "DETAIL_RECORD_1";
  public final static  String S_DetailRecord3 = "DETAIL_RECORD_3";
  public final static  String S_SimpleRecord = "SIMPLE_RECORD";
  public final static  String S_DetailRecord2 = "DETAIL_RECORD_2";


public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getState();

public long getHId();

public long getObjId();

public String getRemarks();

public String getObjName();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public long getCreateOpId();

public int getObjType();

public Timestamp getDoneDate();

public String getDetailRecord4();

public Timestamp getCreateDate();

public long getDoneCode();

public String getDetailRecord1();

public String getDetailRecord3();

public String getSimpleRecord();

public String getDetailRecord2();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setHId(long value);

public  void setObjId(long value);

public  void setRemarks(String value);

public  void setObjName(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCreateOpId(long value);

public  void setObjType(int value);

public  void setDoneDate(Timestamp value);

public  void setDetailRecord4(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setDetailRecord1(String value);

public  void setDetailRecord3(String value);

public  void setSimpleRecord(String value);

public  void setDetailRecord2(String value);
}
