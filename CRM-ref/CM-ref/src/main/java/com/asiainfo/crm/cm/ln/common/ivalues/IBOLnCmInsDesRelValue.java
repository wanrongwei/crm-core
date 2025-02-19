package com.asiainfo.crm.cm.ln.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOLnCmInsDesRelValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_RelaType = "RELA_TYPE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_UserType = "USER_TYPE";
  public final static  String S_EffectiveDateType = "EFFECTIVE_DATE_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_UserRegionCode = "USER_REGION_CODE";
  public final static  String S_CmrelId = "CMREL_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ExpireDateType = "EXPIRE_DATE_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";


public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public long getState();

public long getUserId();

public long getRelaType();

public String getRemarks();

public long getUserType();

public long getEffectiveDateType();

public long getOrgId();

public String getUserRegionCode();

public long getCmrelId();

public long getCustId();

public Timestamp getDoneDate();

public long getExpireDateType();

public Timestamp getCreateDate();

public long getDoneCode();


public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setState(long value);

public  void setUserId(long value);

public  void setRelaType(long value);

public  void setRemarks(String value);

public  void setUserType(long value);

public  void setEffectiveDateType(long value);

public  void setOrgId(long value);

public  void setUserRegionCode(String value);

public  void setCmrelId(long value);

public  void setCustId(long value);

public  void setDoneDate(Timestamp value);

public  void setExpireDateType(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);
}
