package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCustContMedTypeValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_ContMedTypeId = "CONT_MED_TYPE_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_UpContMedTypeId = "UP_CONT_MED_TYPE_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_UseType = "USE_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ContMedTypeName = "CONT_MED_TYPE_NAME";


public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getState();

public String getRemarks();

public long getOrgId();

public long getContMedTypeId();

public long getCreateOrgId();

public String getRegionId();

public long getUpContMedTypeId();

public long getCreateOpId();

public Timestamp getDoneDate();

public long getUseType();

public Timestamp getCreateDate();

public long getDoneCode();

public String getContMedTypeName();


public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setOrgId(long value);

public  void setContMedTypeId(long value);

public  void setCreateOrgId(long value);

public  void setRegionId(String value);

public  void setUpContMedTypeId(long value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setUseType(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setContMedTypeName(String value);
}
