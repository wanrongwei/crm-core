package com.asiainfo.crm.cm.inner.customer.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.customer.ivalues.*;

public class BOCmGroupOrgDifferBean extends DataContainer implements DataContainerInterface,IBOCmGroupOrgDifferValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgDiffer";



  public final static  String S_ImportSource = "import_source";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_ParentCustId = "parent_cust_id";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_State = "state";
  public final static  String S_RegionId = "region_id";
  public final static  String S_ImportDate = "import_date";
  public final static  String S_CustServiceId = "cust_service_id";
  public final static  String S_Remarks = "remarks";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_DeptId = "dept_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_ProcessStatus = "process_status";
  public final static  String S_ImportParentCustId = "import_parent_cust_id";
  public final static  String S_ParentCustservId = "parent_custserv_id";
  public final static  String S_ImportParentCustservId = "import_parent_custserv_id";
  public final static  String S_IsAlert = "is_alert";
  public final static  String S_CreateOpId = "create_op_id";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_CustId = "cust_id";
  public final static  String S_ImportParentDeptId = "import_parent_dept_id";
  public final static  String S_OrgId = "org_id";
  public final static  String S_DifferId = "differ_id";
  public final static  String S_ParentDeptId = "parent_dept_id";
  public final static  String S_EffectiveDate = "effective_date";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmGroupOrgDifferBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   throw new AIException("Cannot reset ObjectType");
 }


  public void initImportSource(String value){
     this.initProperty(S_ImportSource,value);
  }
  public  void setImportSource(String value){
     this.set(S_ImportSource,value);
  }
  public  void setImportSourceNull(){
     this.set(S_ImportSource,null);
  }

  public String getImportSource(){
       return DataType.getAsString(this.get(S_ImportSource));
  
  }
  public String getImportSourceInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ImportSource));
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

  public void initParentCustId(long value){
     this.initProperty(S_ParentCustId,new Long(value));
  }
  public  void setParentCustId(long value){
     this.set(S_ParentCustId,new Long(value));
  }
  public  void setParentCustIdNull(){
     this.set(S_ParentCustId,null);
  }

  public long getParentCustId(){
        return DataType.getAsLong(this.get(S_ParentCustId));
  
  }
  public long getParentCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ParentCustId));
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

  public void initImportDate(Timestamp value){
     this.initProperty(S_ImportDate,value);
  }
  public  void setImportDate(Timestamp value){
     this.set(S_ImportDate,value);
  }
  public  void setImportDateNull(){
     this.set(S_ImportDate,null);
  }

  public Timestamp getImportDate(){
        return DataType.getAsDateTime(this.get(S_ImportDate));
  
  }
  public Timestamp getImportDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ImportDate));
      }

  public void initCustServiceId(String value){
     this.initProperty(S_CustServiceId,value);
  }
  public  void setCustServiceId(String value){
     this.set(S_CustServiceId,value);
  }
  public  void setCustServiceIdNull(){
     this.set(S_CustServiceId,null);
  }

  public String getCustServiceId(){
       return DataType.getAsString(this.get(S_CustServiceId));
  
  }
  public String getCustServiceIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustServiceId));
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

  public void initDeptId(long value){
     this.initProperty(S_DeptId,new Long(value));
  }
  public  void setDeptId(long value){
     this.set(S_DeptId,new Long(value));
  }
  public  void setDeptIdNull(){
     this.set(S_DeptId,null);
  }

  public long getDeptId(){
        return DataType.getAsLong(this.get(S_DeptId));
  
  }
  public long getDeptIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DeptId));
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

  public void initProcessStatus(long value){
     this.initProperty(S_ProcessStatus,new Long(value));
  }
  public  void setProcessStatus(long value){
     this.set(S_ProcessStatus,new Long(value));
  }
  public  void setProcessStatusNull(){
     this.set(S_ProcessStatus,null);
  }

  public long getProcessStatus(){
        return DataType.getAsLong(this.get(S_ProcessStatus));
  
  }
  public long getProcessStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ProcessStatus));
      }

  public void initImportParentCustId(long value){
     this.initProperty(S_ImportParentCustId,new Long(value));
  }
  public  void setImportParentCustId(long value){
     this.set(S_ImportParentCustId,new Long(value));
  }
  public  void setImportParentCustIdNull(){
     this.set(S_ImportParentCustId,null);
  }

  public long getImportParentCustId(){
        return DataType.getAsLong(this.get(S_ImportParentCustId));
  
  }
  public long getImportParentCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ImportParentCustId));
      }

  public void initParentCustservId(String value){
     this.initProperty(S_ParentCustservId,value);
  }
  public  void setParentCustservId(String value){
     this.set(S_ParentCustservId,value);
  }
  public  void setParentCustservIdNull(){
     this.set(S_ParentCustservId,null);
  }

  public String getParentCustservId(){
       return DataType.getAsString(this.get(S_ParentCustservId));
  
  }
  public String getParentCustservIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ParentCustservId));
      }

  public void initImportParentCustservId(String value){
     this.initProperty(S_ImportParentCustservId,value);
  }
  public  void setImportParentCustservId(String value){
     this.set(S_ImportParentCustservId,value);
  }
  public  void setImportParentCustservIdNull(){
     this.set(S_ImportParentCustservId,null);
  }

  public String getImportParentCustservId(){
       return DataType.getAsString(this.get(S_ImportParentCustservId));
  
  }
  public String getImportParentCustservIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ImportParentCustservId));
      }

  public void initIsAlert(long value){
     this.initProperty(S_IsAlert,new Long(value));
  }
  public  void setIsAlert(long value){
     this.set(S_IsAlert,new Long(value));
  }
  public  void setIsAlertNull(){
     this.set(S_IsAlert,null);
  }

  public long getIsAlert(){
        return DataType.getAsLong(this.get(S_IsAlert));
  
  }
  public long getIsAlertInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsAlert));
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

  public void initImportParentDeptId(long value){
     this.initProperty(S_ImportParentDeptId,new Long(value));
  }
  public  void setImportParentDeptId(long value){
     this.set(S_ImportParentDeptId,new Long(value));
  }
  public  void setImportParentDeptIdNull(){
     this.set(S_ImportParentDeptId,null);
  }

  public long getImportParentDeptId(){
        return DataType.getAsLong(this.get(S_ImportParentDeptId));
  
  }
  public long getImportParentDeptIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ImportParentDeptId));
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

  public void initDifferId(long value){
     this.initProperty(S_DifferId,new Long(value));
  }
  public  void setDifferId(long value){
     this.set(S_DifferId,new Long(value));
  }
  public  void setDifferIdNull(){
     this.set(S_DifferId,null);
  }

  public long getDifferId(){
        return DataType.getAsLong(this.get(S_DifferId));
  
  }
  public long getDifferIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DifferId));
      }

  public void initParentDeptId(long value){
     this.initProperty(S_ParentDeptId,new Long(value));
  }
  public  void setParentDeptId(long value){
     this.set(S_ParentDeptId,new Long(value));
  }
  public  void setParentDeptIdNull(){
     this.set(S_ParentDeptId,null);
  }

  public long getParentDeptId(){
        return DataType.getAsLong(this.get(S_ParentDeptId));
  
  }
  public long getParentDeptIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ParentDeptId));
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


 
 }

