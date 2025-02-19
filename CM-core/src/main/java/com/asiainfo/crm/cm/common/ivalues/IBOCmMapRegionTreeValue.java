package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmMapRegionTreeValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_FloatingPopulation = "FLOATING_POPULATION";
  public final static  String S_YearIncome = "YEAR_INCOME";
  public final static  String S_HasLeaf = "HAS_LEAF";
  public final static  String S_LocationDesc = "LOCATION_DESC";
  public final static  String S_RelGroupCustId = "REL_GROUP_CUST_ID";
  public final static  String S_LocationClass = "LOCATION_CLASS";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_AgentWorkDept = "AGENT_WORK_DEPT";
  public final static  String S_ParentLocationId = "PARENT_LOCATION_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_IsModel = "IS_MODEL";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_SignalCover = "SIGNAL_COVER";
  public final static  String S_LocationType = "LOCATION_TYPE";
  public final static  String S_AgentName = "AGENT_NAME";
  public final static  String S_LocationName = "LOCATION_NAME";
  public final static  String S_AgentPhone = "AGENT_PHONE";
  public final static  String S_AgentJob = "AGENT_JOB";
  public final static  String S_DeptStaffNum = "DEPT_STAFF_NUM";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_LocationId = "LOCATION_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ModelNo = "MODEL_NO";


public String getState();

public long getFloatingPopulation();

public long getYearIncome();

public int getHasLeaf();

public String getLocationDesc();

public long getRelGroupCustId();

public int getLocationClass();

public long getCreateOpId();

public String getAgentWorkDept();

public long getParentLocationId();

public long getDoneCode();

public String getNotes();

public Timestamp getExpireDate();

public int getIsModel();

public Timestamp getEffectiveDate();

public long getOpId();

public String getSignalCover();

public int getLocationType();

public String getAgentName();

public String getLocationName();

public String getAgentPhone();

public String getAgentJob();

public long getDeptStaffNum();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public long getLocationId();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public long getModelNo();


public  void setState(String value);

public  void setFloatingPopulation(long value);

public  void setYearIncome(long value);

public  void setHasLeaf(int value);

public  void setLocationDesc(String value);

public  void setRelGroupCustId(long value);

public  void setLocationClass(int value);

public  void setCreateOpId(long value);

public  void setAgentWorkDept(String value);

public  void setParentLocationId(long value);

public  void setDoneCode(long value);

public  void setNotes(String value);

public  void setExpireDate(Timestamp value);

public  void setIsModel(int value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setSignalCover(String value);

public  void setLocationType(int value);

public  void setAgentName(String value);

public  void setLocationName(String value);

public  void setAgentPhone(String value);

public  void setAgentJob(String value);

public  void setDeptStaffNum(long value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setLocationId(long value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setModelNo(long value);
}
