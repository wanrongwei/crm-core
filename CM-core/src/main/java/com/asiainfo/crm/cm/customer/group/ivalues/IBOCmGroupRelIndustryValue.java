package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupRelIndustryValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_IndustryId4 = "INDUSTRY_ID_4";
  public final static  String S_IndustryId3 = "INDUSTRY_ID_3";
  public final static  String S_IndustryId = "INDUSTRY_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RelId = "REL_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_Sort = "SORT";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_IndustryId1 = "INDUSTRY_ID_1";
  public final static  String S_IndustryId2 = "INDUSTRY_ID_2";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Action = "ACTION";


public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getState();

public String getRemarks();

public String getIndustryId4();

public String getIndustryId3();

public String getIndustryId();

public long getOrgId();

public long getRelId();

public String getRegionId();

public long getCreateOrgId();

public long getSort();

public long getCustId();

public long getCreateOpId();

public Timestamp getDoneDate();

public String getIndustryId1();

public String getIndustryId2();

public Timestamp getCreateDate();

public long getDoneCode();

public String getAction();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setIndustryId4(String value);

public  void setIndustryId3(String value);

public  void setIndustryId(String value);

public  void setOrgId(long value);

public  void setRelId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setSort(long value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setIndustryId1(String value);

public  void setIndustryId2(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setAction(String value);
}
