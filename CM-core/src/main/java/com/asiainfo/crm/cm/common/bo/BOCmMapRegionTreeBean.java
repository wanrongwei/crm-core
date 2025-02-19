package com.asiainfo.crm.cm.common.bo;

import java.sql.Timestamp;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.ServiceManager;
import com.asiainfo.crm.cm.common.ivalues.IBOCmMapRegionTreeValue;

public class BOCmMapRegionTreeBean extends DataContainer implements DataContainerInterface,IBOCmMapRegionTreeValue{

  private static String  m_boName = "com.asiainfo.crm.customer.common.bo.BOCmMapRegionTree";



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

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmMapRegionTreeBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initState(String value){
     this.initProperty(S_State,value);
  }
  public  void setState(String value){
     this.set(S_State,value);
  }
  public  void setStateNull(){
     this.set(S_State,null);
  }

  public String getState(){
       return DataType.getAsString(this.get(S_State));
  
  }
  public String getStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_State));
      }

  public void initFloatingPopulation(long value){
     this.initProperty(S_FloatingPopulation,new Long(value));
  }
  public  void setFloatingPopulation(long value){
     this.set(S_FloatingPopulation,new Long(value));
  }
  public  void setFloatingPopulationNull(){
     this.set(S_FloatingPopulation,null);
  }

  public long getFloatingPopulation(){
        return DataType.getAsLong(this.get(S_FloatingPopulation));
  
  }
  public long getFloatingPopulationInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_FloatingPopulation));
      }

  public void initYearIncome(long value){
     this.initProperty(S_YearIncome,new Long(value));
  }
  public  void setYearIncome(long value){
     this.set(S_YearIncome,new Long(value));
  }
  public  void setYearIncomeNull(){
     this.set(S_YearIncome,null);
  }

  public long getYearIncome(){
        return DataType.getAsLong(this.get(S_YearIncome));
  
  }
  public long getYearIncomeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_YearIncome));
      }

  public void initHasLeaf(int value){
     this.initProperty(S_HasLeaf,new Integer(value));
  }
  public  void setHasLeaf(int value){
     this.set(S_HasLeaf,new Integer(value));
  }
  public  void setHasLeafNull(){
     this.set(S_HasLeaf,null);
  }

  public int getHasLeaf(){
        return DataType.getAsInt(this.get(S_HasLeaf));
  
  }
  public int getHasLeafInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_HasLeaf));
      }

  public void initLocationDesc(String value){
     this.initProperty(S_LocationDesc,value);
  }
  public  void setLocationDesc(String value){
     this.set(S_LocationDesc,value);
  }
  public  void setLocationDescNull(){
     this.set(S_LocationDesc,null);
  }

  public String getLocationDesc(){
       return DataType.getAsString(this.get(S_LocationDesc));
  
  }
  public String getLocationDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LocationDesc));
      }

  public void initRelGroupCustId(long value){
     this.initProperty(S_RelGroupCustId,new Long(value));
  }
  public  void setRelGroupCustId(long value){
     this.set(S_RelGroupCustId,new Long(value));
  }
  public  void setRelGroupCustIdNull(){
     this.set(S_RelGroupCustId,null);
  }

  public long getRelGroupCustId(){
        return DataType.getAsLong(this.get(S_RelGroupCustId));
  
  }
  public long getRelGroupCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelGroupCustId));
      }

  public void initLocationClass(int value){
     this.initProperty(S_LocationClass,new Integer(value));
  }
  public  void setLocationClass(int value){
     this.set(S_LocationClass,new Integer(value));
  }
  public  void setLocationClassNull(){
     this.set(S_LocationClass,null);
  }

  public int getLocationClass(){
        return DataType.getAsInt(this.get(S_LocationClass));
  
  }
  public int getLocationClassInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_LocationClass));
      }

  public void initCreateOpId(long value){
     this.initProperty(S_CreateOpId,new Long(value));
  }
  public  void setCreateOpId(long value){
     this.set(S_CreateOpId,new Long(value));
  }
  public  void setCreateOpIdNull(){
     this.set(S_CreateOpId,null);
  }

  public long getCreateOpId(){
        return DataType.getAsLong(this.get(S_CreateOpId));
  
  }
  public long getCreateOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CreateOpId));
      }

  public void initAgentWorkDept(String value){
     this.initProperty(S_AgentWorkDept,value);
  }
  public  void setAgentWorkDept(String value){
     this.set(S_AgentWorkDept,value);
  }
  public  void setAgentWorkDeptNull(){
     this.set(S_AgentWorkDept,null);
  }

  public String getAgentWorkDept(){
       return DataType.getAsString(this.get(S_AgentWorkDept));
  
  }
  public String getAgentWorkDeptInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AgentWorkDept));
      }

  public void initParentLocationId(long value){
     this.initProperty(S_ParentLocationId,new Long(value));
  }
  public  void setParentLocationId(long value){
     this.set(S_ParentLocationId,new Long(value));
  }
  public  void setParentLocationIdNull(){
     this.set(S_ParentLocationId,null);
  }

  public long getParentLocationId(){
        return DataType.getAsLong(this.get(S_ParentLocationId));
  
  }
  public long getParentLocationIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ParentLocationId));
      }

  public void initDoneCode(long value){
     this.initProperty(S_DoneCode,new Long(value));
  }
  public  void setDoneCode(long value){
     this.set(S_DoneCode,new Long(value));
  }
  public  void setDoneCodeNull(){
     this.set(S_DoneCode,null);
  }

  public long getDoneCode(){
        return DataType.getAsLong(this.get(S_DoneCode));
  
  }
  public long getDoneCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DoneCode));
      }

  public void initNotes(String value){
     this.initProperty(S_Notes,value);
  }
  public  void setNotes(String value){
     this.set(S_Notes,value);
  }
  public  void setNotesNull(){
     this.set(S_Notes,null);
  }

  public String getNotes(){
       return DataType.getAsString(this.get(S_Notes));
  
  }
  public String getNotesInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Notes));
      }

  public void initExpireDate(Timestamp value){
     this.initProperty(S_ExpireDate,value);
  }
  public  void setExpireDate(Timestamp value){
     this.set(S_ExpireDate,value);
  }
  public  void setExpireDateNull(){
     this.set(S_ExpireDate,null);
  }

  public Timestamp getExpireDate(){
        return DataType.getAsDateTime(this.get(S_ExpireDate));
  
  }
  public Timestamp getExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ExpireDate));
      }

  public void initIsModel(int value){
     this.initProperty(S_IsModel,new Integer(value));
  }
  public  void setIsModel(int value){
     this.set(S_IsModel,new Integer(value));
  }
  public  void setIsModelNull(){
     this.set(S_IsModel,null);
  }

  public int getIsModel(){
        return DataType.getAsInt(this.get(S_IsModel));
  
  }
  public int getIsModelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsModel));
      }

  public void initEffectiveDate(Timestamp value){
     this.initProperty(S_EffectiveDate,value);
  }
  public  void setEffectiveDate(Timestamp value){
     this.set(S_EffectiveDate,value);
  }
  public  void setEffectiveDateNull(){
     this.set(S_EffectiveDate,null);
  }

  public Timestamp getEffectiveDate(){
        return DataType.getAsDateTime(this.get(S_EffectiveDate));
  
  }
  public Timestamp getEffectiveDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_EffectiveDate));
      }

  public void initOpId(long value){
     this.initProperty(S_OpId,new Long(value));
  }
  public  void setOpId(long value){
     this.set(S_OpId,new Long(value));
  }
  public  void setOpIdNull(){
     this.set(S_OpId,null);
  }

  public long getOpId(){
        return DataType.getAsLong(this.get(S_OpId));
  
  }
  public long getOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OpId));
      }

  public void initSignalCover(String value){
     this.initProperty(S_SignalCover,value);
  }
  public  void setSignalCover(String value){
     this.set(S_SignalCover,value);
  }
  public  void setSignalCoverNull(){
     this.set(S_SignalCover,null);
  }

  public String getSignalCover(){
       return DataType.getAsString(this.get(S_SignalCover));
  
  }
  public String getSignalCoverInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SignalCover));
      }

  public void initLocationType(int value){
     this.initProperty(S_LocationType,new Integer(value));
  }
  public  void setLocationType(int value){
     this.set(S_LocationType,new Integer(value));
  }
  public  void setLocationTypeNull(){
     this.set(S_LocationType,null);
  }

  public int getLocationType(){
        return DataType.getAsInt(this.get(S_LocationType));
  
  }
  public int getLocationTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_LocationType));
      }

  public void initAgentName(String value){
     this.initProperty(S_AgentName,value);
  }
  public  void setAgentName(String value){
     this.set(S_AgentName,value);
  }
  public  void setAgentNameNull(){
     this.set(S_AgentName,null);
  }

  public String getAgentName(){
       return DataType.getAsString(this.get(S_AgentName));
  
  }
  public String getAgentNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AgentName));
      }

  public void initLocationName(String value){
     this.initProperty(S_LocationName,value);
  }
  public  void setLocationName(String value){
     this.set(S_LocationName,value);
  }
  public  void setLocationNameNull(){
     this.set(S_LocationName,null);
  }

  public String getLocationName(){
       return DataType.getAsString(this.get(S_LocationName));
  
  }
  public String getLocationNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LocationName));
      }

  public void initAgentPhone(String value){
     this.initProperty(S_AgentPhone,value);
  }
  public  void setAgentPhone(String value){
     this.set(S_AgentPhone,value);
  }
  public  void setAgentPhoneNull(){
     this.set(S_AgentPhone,null);
  }

  public String getAgentPhone(){
       return DataType.getAsString(this.get(S_AgentPhone));
  
  }
  public String getAgentPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AgentPhone));
      }

  public void initAgentJob(String value){
     this.initProperty(S_AgentJob,value);
  }
  public  void setAgentJob(String value){
     this.set(S_AgentJob,value);
  }
  public  void setAgentJobNull(){
     this.set(S_AgentJob,null);
  }

  public String getAgentJob(){
       return DataType.getAsString(this.get(S_AgentJob));
  
  }
  public String getAgentJobInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AgentJob));
      }

  public void initDeptStaffNum(long value){
     this.initProperty(S_DeptStaffNum,new Long(value));
  }
  public  void setDeptStaffNum(long value){
     this.set(S_DeptStaffNum,new Long(value));
  }
  public  void setDeptStaffNumNull(){
     this.set(S_DeptStaffNum,null);
  }

  public long getDeptStaffNum(){
        return DataType.getAsLong(this.get(S_DeptStaffNum));
  
  }
  public long getDeptStaffNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DeptStaffNum));
      }

  public void initOrgId(long value){
     this.initProperty(S_OrgId,new Long(value));
  }
  public  void setOrgId(long value){
     this.set(S_OrgId,new Long(value));
  }
  public  void setOrgIdNull(){
     this.set(S_OrgId,null);
  }

  public long getOrgId(){
        return DataType.getAsLong(this.get(S_OrgId));
  
  }
  public long getOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OrgId));
      }

  public void initRegionId(String value){
     this.initProperty(S_RegionId,value);
  }
  public  void setRegionId(String value){
     this.set(S_RegionId,value);
  }
  public  void setRegionIdNull(){
     this.set(S_RegionId,null);
  }

  public String getRegionId(){
       return DataType.getAsString(this.get(S_RegionId));
  
  }
  public String getRegionIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RegionId));
      }

  public void initCreateOrgId(long value){
     this.initProperty(S_CreateOrgId,new Long(value));
  }
  public  void setCreateOrgId(long value){
     this.set(S_CreateOrgId,new Long(value));
  }
  public  void setCreateOrgIdNull(){
     this.set(S_CreateOrgId,null);
  }

  public long getCreateOrgId(){
        return DataType.getAsLong(this.get(S_CreateOrgId));
  
  }
  public long getCreateOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CreateOrgId));
      }

  public void initLocationId(long value){
     this.initProperty(S_LocationId,new Long(value));
  }
  public  void setLocationId(long value){
     this.set(S_LocationId,new Long(value));
  }
  public  void setLocationIdNull(){
     this.set(S_LocationId,null);
  }

  public long getLocationId(){
        return DataType.getAsLong(this.get(S_LocationId));
  
  }
  public long getLocationIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LocationId));
      }

  public void initDoneDate(Timestamp value){
     this.initProperty(S_DoneDate,value);
  }
  public  void setDoneDate(Timestamp value){
     this.set(S_DoneDate,value);
  }
  public  void setDoneDateNull(){
     this.set(S_DoneDate,null);
  }

  public Timestamp getDoneDate(){
        return DataType.getAsDateTime(this.get(S_DoneDate));
  
  }
  public Timestamp getDoneDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_DoneDate));
      }

  public void initCreateDate(Timestamp value){
     this.initProperty(S_CreateDate,value);
  }
  public  void setCreateDate(Timestamp value){
     this.set(S_CreateDate,value);
  }
  public  void setCreateDateNull(){
     this.set(S_CreateDate,null);
  }

  public Timestamp getCreateDate(){
        return DataType.getAsDateTime(this.get(S_CreateDate));
  
  }
  public Timestamp getCreateDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CreateDate));
      }

  public void initModelNo(long value){
     this.initProperty(S_ModelNo,new Long(value));
  }
  public  void setModelNo(long value){
     this.set(S_ModelNo,new Long(value));
  }
  public  void setModelNoNull(){
     this.set(S_ModelNo,null);
  }

  public long getModelNo(){
        return DataType.getAsLong(this.get(S_ModelNo));
  
  }
  public long getModelNoInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ModelNo));
      }


 
 }

