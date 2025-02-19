package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxCustLanguageValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_LastLang3 = "LAST_LANG3";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_DefaultLang = "DEFAULT_LANG";
  public final static  String S_LastLang1 = "LAST_LANG1";
  public final static  String S_LastLang2 = "LAST_LANG2";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_RelObjectId = "REL_OBJECT_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_RelObjectType = "REL_OBJECT_TYPE";


public Timestamp getExpireDate();

public int getLastLang3();

public Timestamp getEffectiveDate();

public long getOpId();

public String getState();

public String getRemarks();

public int getDefaultLang();

public int getLastLang1();

public int getLastLang2();

public long getOrgId();

public long getCreateOrgId();

public long getCreateOpId();

public Timestamp getDoneDate();

public long getRelObjectId();

public Timestamp getCreateDate();

public long getDoneCode();

public int getRelObjectType();


public  void setExpireDate(Timestamp value);

public  void setLastLang3(int value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setDefaultLang(int value);

public  void setLastLang1(int value);

public  void setLastLang2(int value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setRelObjectId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setRelObjectType(int value);
}
