package com.asiainfo.crm.cm.dk.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.dk.ivalues.*;

public class BOCmGroupApprovalBean extends DataContainer implements DataContainerInterface,IBOCmGroupApprovalValue{

  private static String  m_boName = "com.asiainfo.crm.cm.dk.bo.BOCmGroupApproval";



  public final static  String S_WkFlowName = "wk_flow_name";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_TaskId = "task_id";
  public final static  String S_State = "state";
  public final static  String S_RegionId = "region_id";
  public final static  String S_Remarks = "remarks";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_RootCustId = "root_cust_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_Action = "action";
  public final static  String S_WkFlowId = "wk_flow_id";
  public final static  String S_CurrentInfo = "current_info";
  public final static  String S_CreateOpId = "create_op_id";
  public final static  String S_ApprovalDetail = "approval_detail";
  public final static  String S_Approver = "approver";
  public final static  String S_ApprovalStatus = "approval_status";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_Resource = "resource";
  public final static  String S_ApproverId = "approver_id";
  public final static  String S_CustId = "cust_id";
  public final static  String S_OrgId = "org_id";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_ApplyChangeInfo = "apply_change_info";
  public final static  String S_PsType = "ps_type";
  public final static  String S_ApprovalDate = "approval_date";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_ApprovalResults = "approval_results";
  public final static  String S_Step = "step";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmGroupApprovalBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initWkFlowName(String value){
     this.initProperty(S_WkFlowName,value);
  }
  public  void setWkFlowName(String value){
     this.set(S_WkFlowName,value);
  }
  public  void setWkFlowNameNull(){
     this.set(S_WkFlowName,null);
  }

  public String getWkFlowName(){
       return DataType.getAsString(this.get(S_WkFlowName));
  
  }
  public String getWkFlowNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_WkFlowName));
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

  public void initTaskId(String value){
     this.initProperty(S_TaskId,value);
  }
  public  void setTaskId(String value){
     this.set(S_TaskId,value);
  }
  public  void setTaskIdNull(){
     this.set(S_TaskId,null);
  }

  public String getTaskId(){
       return DataType.getAsString(this.get(S_TaskId));
  
  }
  public String getTaskIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TaskId));
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

  public void initRemarks(String value){
     this.initProperty(S_Remarks,value);
  }
  public  void setRemarks(String value){
     this.set(S_Remarks,value);
  }
  public  void setRemarksNull(){
     this.set(S_Remarks,null);
  }

  public String getRemarks(){
       return DataType.getAsString(this.get(S_Remarks));
  
  }
  public String getRemarksInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Remarks));
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

  public void initRootCustId(long value){
     this.initProperty(S_RootCustId,new Long(value));
  }
  public  void setRootCustId(long value){
     this.set(S_RootCustId,new Long(value));
  }
  public  void setRootCustIdNull(){
     this.set(S_RootCustId,null);
  }

  public long getRootCustId(){
        return DataType.getAsLong(this.get(S_RootCustId));
  
  }
  public long getRootCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RootCustId));
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

  public void initAction(String value){
     this.initProperty(S_Action,value);
  }
  public  void setAction(String value){
     this.set(S_Action,value);
  }
  public  void setActionNull(){
     this.set(S_Action,null);
  }

  public String getAction(){
       return DataType.getAsString(this.get(S_Action));
  
  }
  public String getActionInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Action));
      }

  public void initWkFlowId(String value){
     this.initProperty(S_WkFlowId,value);
  }
  public  void setWkFlowId(String value){
     this.set(S_WkFlowId,value);
  }
  public  void setWkFlowIdNull(){
     this.set(S_WkFlowId,null);
  }

  public String getWkFlowId(){
       return DataType.getAsString(this.get(S_WkFlowId));
  
  }
  public String getWkFlowIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_WkFlowId));
      }

  public void initCurrentInfo(String value){
     this.initProperty(S_CurrentInfo,value);
  }
  public  void setCurrentInfo(String value){
     this.set(S_CurrentInfo,value);
  }
  public  void setCurrentInfoNull(){
     this.set(S_CurrentInfo,null);
  }

  public String getCurrentInfo(){
       return DataType.getAsString(this.get(S_CurrentInfo));
  
  }
  public String getCurrentInfoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CurrentInfo));
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

  public void initApprovalDetail(String value){
     this.initProperty(S_ApprovalDetail,value);
  }
  public  void setApprovalDetail(String value){
     this.set(S_ApprovalDetail,value);
  }
  public  void setApprovalDetailNull(){
     this.set(S_ApprovalDetail,null);
  }

  public String getApprovalDetail(){
       return DataType.getAsString(this.get(S_ApprovalDetail));
  
  }
  public String getApprovalDetailInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ApprovalDetail));
      }

  public void initApprover(String value){
     this.initProperty(S_Approver,value);
  }
  public  void setApprover(String value){
     this.set(S_Approver,value);
  }
  public  void setApproverNull(){
     this.set(S_Approver,null);
  }

  public String getApprover(){
       return DataType.getAsString(this.get(S_Approver));
  
  }
  public String getApproverInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Approver));
      }

  public void initApprovalStatus(long value){
     this.initProperty(S_ApprovalStatus,new Long(value));
  }
  public  void setApprovalStatus(long value){
     this.set(S_ApprovalStatus,new Long(value));
  }
  public  void setApprovalStatusNull(){
     this.set(S_ApprovalStatus,null);
  }

  public long getApprovalStatus(){
        return DataType.getAsLong(this.get(S_ApprovalStatus));
  
  }
  public long getApprovalStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ApprovalStatus));
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

  public void initResource(long value){
     this.initProperty(S_Resource,new Long(value));
  }
  public  void setResource(long value){
     this.set(S_Resource,new Long(value));
  }
  public  void setResourceNull(){
     this.set(S_Resource,null);
  }

  public long getResource(){
        return DataType.getAsLong(this.get(S_Resource));
  
  }
  public long getResourceInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Resource));
      }

  public void initApproverId(long value){
     this.initProperty(S_ApproverId,new Long(value));
  }
  public  void setApproverId(long value){
     this.set(S_ApproverId,new Long(value));
  }
  public  void setApproverIdNull(){
     this.set(S_ApproverId,null);
  }

  public long getApproverId(){
        return DataType.getAsLong(this.get(S_ApproverId));
  
  }
  public long getApproverIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ApproverId));
      }

  public void initCustId(long value){
     this.initProperty(S_CustId,new Long(value));
  }
  public  void setCustId(long value){
     this.set(S_CustId,new Long(value));
  }
  public  void setCustIdNull(){
     this.set(S_CustId,null);
  }

  public long getCustId(){
        return DataType.getAsLong(this.get(S_CustId));
  
  }
  public long getCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustId));
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

  public void initCustName(String value){
     this.initProperty(S_CustName,value);
  }
  public  void setCustName(String value){
     this.set(S_CustName,value);
  }
  public  void setCustNameNull(){
     this.set(S_CustName,null);
  }

  public String getCustName(){
       return DataType.getAsString(this.get(S_CustName));
  
  }
  public String getCustNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustName));
      }

  public void initApplyChangeInfo(String value){
     this.initProperty(S_ApplyChangeInfo,value);
  }
  public  void setApplyChangeInfo(String value){
     this.set(S_ApplyChangeInfo,value);
  }
  public  void setApplyChangeInfoNull(){
     this.set(S_ApplyChangeInfo,null);
  }

  public String getApplyChangeInfo(){
       return DataType.getAsString(this.get(S_ApplyChangeInfo));
  
  }
  public String getApplyChangeInfoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ApplyChangeInfo));
      }

  public void initPsType(long value){
     this.initProperty(S_PsType,new Long(value));
  }
  public  void setPsType(long value){
     this.set(S_PsType,new Long(value));
  }
  public  void setPsTypeNull(){
     this.set(S_PsType,null);
  }

  public long getPsType(){
        return DataType.getAsLong(this.get(S_PsType));
  
  }
  public long getPsTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PsType));
      }

  public void initApprovalDate(Timestamp value){
     this.initProperty(S_ApprovalDate,value);
  }
  public  void setApprovalDate(Timestamp value){
     this.set(S_ApprovalDate,value);
  }
  public  void setApprovalDateNull(){
     this.set(S_ApprovalDate,null);
  }

  public Timestamp getApprovalDate(){
        return DataType.getAsDateTime(this.get(S_ApprovalDate));
  
  }
  public Timestamp getApprovalDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ApprovalDate));
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

  public void initApprovalResults(long value){
     this.initProperty(S_ApprovalResults,new Long(value));
  }
  public  void setApprovalResults(long value){
     this.set(S_ApprovalResults,new Long(value));
  }
  public  void setApprovalResultsNull(){
     this.set(S_ApprovalResults,null);
  }

  public long getApprovalResults(){
        return DataType.getAsLong(this.get(S_ApprovalResults));
  
  }
  public long getApprovalResultsInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ApprovalResults));
      }

  public void initStep(long value){
     this.initProperty(S_Step,new Long(value));
  }
  public  void setStep(long value){
     this.set(S_Step,new Long(value));
  }
  public  void setStepNull(){
     this.set(S_Step,null);
  }

  public long getStep(){
        return DataType.getAsLong(this.get(S_Step));
  
  }
  public long getStepInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Step));
      }


 
 }

