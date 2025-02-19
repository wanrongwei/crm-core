package com.asiainfo.crm.cm.inner.customer.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.customer.ivalues.*;

public class QBOCmGroupOrgDifferBean extends DataContainer implements DataContainerInterface,IQBOCmGroupOrgDifferValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.customer.bo.QBOCmGroupOrgDiffer";



  public final static  String S_DeptId = "DEPT_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_ImportSource = "IMPORT_SOURCE";
  public final static  String S_DeptName = "DEPT_NAME";
  public final static  String S_ParentCustservId = "PARENT_CUSTSERV_ID";
  public final static  String S_ParentDeptNameOld = "PARENT_DEPT_NAME_OLD";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ParentDeptId = "PARENT_DEPT_ID";
  public final static  String S_ImportParentDeptId = "IMPORT_PARENT_DEPT_ID";
  public final static  String S_DifferId = "DIFFER_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CustServiceId = "CUST_SERVICE_ID";
  public final static  String S_ParentDeptNameNew = "PARENT_DEPT_NAME_NEW";
  public final static  String S_ParentCustId = "PARENT_CUST_ID";
  public final static  String S_ImportDate = "IMPORT_DATE";
  public final static  String S_ImportParentCustservId = "IMPORT_PARENT_CUSTSERV_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ProcessStatus = "PROCESS_STATUS";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_IsAlert = "IS_ALERT";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ImportParentCustId = "IMPORT_PARENT_CUST_ID";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmGroupOrgDifferBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   throw new AIException("Cannot reset ObjectType");
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

  public void initPartyId(long value){
     this.initProperty(S_PartyId,new Long(value));
  }
  public  void setPartyId(long value){
     this.set(S_PartyId,new Long(value));
  }
  public  void setPartyIdNull(){
     this.set(S_PartyId,null);
  }

  public long getPartyId(){
        return DataType.getAsLong(this.get(S_PartyId));
  
  }
  public long getPartyIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PartyId));
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

  public void initDeptName(String value){
     this.initProperty(S_DeptName,value);
  }
  public  void setDeptName(String value){
     this.set(S_DeptName,value);
  }
  public  void setDeptNameNull(){
     this.set(S_DeptName,null);
  }

  public String getDeptName(){
       return DataType.getAsString(this.get(S_DeptName));
  
  }
  public String getDeptNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DeptName));
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

  public void initParentDeptNameOld(String value){
     this.initProperty(S_ParentDeptNameOld,value);
  }
  public  void setParentDeptNameOld(String value){
     this.set(S_ParentDeptNameOld,value);
  }
  public  void setParentDeptNameOldNull(){
     this.set(S_ParentDeptNameOld,null);
  }

  public String getParentDeptNameOld(){
       return DataType.getAsString(this.get(S_ParentDeptNameOld));
  
  }
  public String getParentDeptNameOldInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ParentDeptNameOld));
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

  public void initParentDeptNameNew(String value){
     this.initProperty(S_ParentDeptNameNew,value);
  }
  public  void setParentDeptNameNew(String value){
     this.set(S_ParentDeptNameNew,value);
  }
  public  void setParentDeptNameNewNull(){
     this.set(S_ParentDeptNameNew,null);
  }

  public String getParentDeptNameNew(){
       return DataType.getAsString(this.get(S_ParentDeptNameNew));
  
  }
  public String getParentDeptNameNewInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ParentDeptNameNew));
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

  public void initProcessStatus(int value){
     this.initProperty(S_ProcessStatus,new Integer(value));
  }
  public  void setProcessStatus(int value){
     this.set(S_ProcessStatus,new Integer(value));
  }
  public  void setProcessStatusNull(){
     this.set(S_ProcessStatus,null);
  }

  public int getProcessStatus(){
        return DataType.getAsInt(this.get(S_ProcessStatus));
  
  }
  public int getProcessStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ProcessStatus));
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

  public void initIsAlert(int value){
     this.initProperty(S_IsAlert,new Integer(value));
  }
  public  void setIsAlert(int value){
     this.set(S_IsAlert,new Integer(value));
  }
  public  void setIsAlertNull(){
     this.set(S_IsAlert,null);
  }

  public int getIsAlert(){
        return DataType.getAsInt(this.get(S_IsAlert));
  
  }
  public int getIsAlertInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsAlert));
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


 
 }

