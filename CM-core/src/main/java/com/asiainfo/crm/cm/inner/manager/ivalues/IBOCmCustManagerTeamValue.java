package com.asiainfo.crm.cm.inner.manager.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCustManagerTeamValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionDetail = "REGION_DETAIL";
  public final static  String S_TeamId = "TEAM_ID";
  public final static  String S_ParentTeamId = "PARENT_TEAM_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_TeamName = "TEAM_NAME";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_RegionCode = "REGION_CODE";


public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getState();

public int getCountyCode();

public String getRemarks();

public long getProvinceId();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public long getRegionDetail();

public long getTeamId();

public long getParentTeamId();

public long getCreateOpId();

public Timestamp getDoneDate();

public String getTeamName();

public Timestamp getCreateDate();

public long getDoneCode();

public int getRegionCode();


public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setState(String value);

public  void setCountyCode(int value);

public  void setRemarks(String value);

public  void setProvinceId(long value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setRegionDetail(long value);

public  void setTeamId(long value);

public  void setParentTeamId(long value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setTeamName(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setRegionCode(int value);
}
