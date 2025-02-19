package com.asiainfo.crm.cm.inner.customer.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.customer.ivalues.*;

public class BOCmCustSegmentBean extends DataContainer implements DataContainerInterface,IBOCmCustSegmentValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.customer.bo.BOCmCustSegment";



  public final static  String S_AllowCreditCalculated = "allow_credit_calculated";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_State = "state";
  public final static  String S_RegionId = "region_id";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_SegmentName = "segment_name";
  public final static  String S_Remarks = "remarks";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_OrgId = "org_id";
  public final static  String S_SegmentId = "segment_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_UpSegmentId = "up_segment_id";
  public final static  String S_AllowApprovable = "allow_approvable";
  public final static  String S_AllowInheritable = "allow_inheritable";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_ProcessDef = "process_def";
  public final static  String S_AllowRevisable = "allow_revisable";
  public final static  String S_CreateOpId = "create_op_id";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmCustSegmentBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initAllowCreditCalculated(long value){
     this.initProperty(S_AllowCreditCalculated,new Long(value));
  }
  public  void setAllowCreditCalculated(long value){
     this.set(S_AllowCreditCalculated,new Long(value));
  }
  public  void setAllowCreditCalculatedNull(){
     this.set(S_AllowCreditCalculated,null);
  }

  public long getAllowCreditCalculated(){
        return DataType.getAsLong(this.get(S_AllowCreditCalculated));
  
  }
  public long getAllowCreditCalculatedInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AllowCreditCalculated));
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

  public void initSegmentName(String value){
     this.initProperty(S_SegmentName,value);
  }
  public  void setSegmentName(String value){
     this.set(S_SegmentName,value);
  }
  public  void setSegmentNameNull(){
     this.set(S_SegmentName,null);
  }

  public String getSegmentName(){
       return DataType.getAsString(this.get(S_SegmentName));
  
  }
  public String getSegmentNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SegmentName));
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

  public void initSegmentId(long value){
     this.initProperty(S_SegmentId,new Long(value));
  }
  public  void setSegmentId(long value){
     this.set(S_SegmentId,new Long(value));
  }
  public  void setSegmentIdNull(){
     this.set(S_SegmentId,null);
  }

  public long getSegmentId(){
        return DataType.getAsLong(this.get(S_SegmentId));
  
  }
  public long getSegmentIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SegmentId));
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

  public void initUpSegmentId(long value){
     this.initProperty(S_UpSegmentId,new Long(value));
  }
  public  void setUpSegmentId(long value){
     this.set(S_UpSegmentId,new Long(value));
  }
  public  void setUpSegmentIdNull(){
     this.set(S_UpSegmentId,null);
  }

  public long getUpSegmentId(){
        return DataType.getAsLong(this.get(S_UpSegmentId));
  
  }
  public long getUpSegmentIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_UpSegmentId));
      }

  public void initAllowApprovable(long value){
     this.initProperty(S_AllowApprovable,new Long(value));
  }
  public  void setAllowApprovable(long value){
     this.set(S_AllowApprovable,new Long(value));
  }
  public  void setAllowApprovableNull(){
     this.set(S_AllowApprovable,null);
  }

  public long getAllowApprovable(){
        return DataType.getAsLong(this.get(S_AllowApprovable));
  
  }
  public long getAllowApprovableInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AllowApprovable));
      }

  public void initAllowInheritable(long value){
     this.initProperty(S_AllowInheritable,new Long(value));
  }
  public  void setAllowInheritable(long value){
     this.set(S_AllowInheritable,new Long(value));
  }
  public  void setAllowInheritableNull(){
     this.set(S_AllowInheritable,null);
  }

  public long getAllowInheritable(){
        return DataType.getAsLong(this.get(S_AllowInheritable));
  
  }
  public long getAllowInheritableInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AllowInheritable));
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

  public void initProcessDef(String value){
     this.initProperty(S_ProcessDef,value);
  }
  public  void setProcessDef(String value){
     this.set(S_ProcessDef,value);
  }
  public  void setProcessDefNull(){
     this.set(S_ProcessDef,null);
  }

  public String getProcessDef(){
       return DataType.getAsString(this.get(S_ProcessDef));
  
  }
  public String getProcessDefInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ProcessDef));
      }

  public void initAllowRevisable(long value){
     this.initProperty(S_AllowRevisable,new Long(value));
  }
  public  void setAllowRevisable(long value){
     this.set(S_AllowRevisable,new Long(value));
  }
  public  void setAllowRevisableNull(){
     this.set(S_AllowRevisable,null);
  }

  public long getAllowRevisable(){
        return DataType.getAsLong(this.get(S_AllowRevisable));
  
  }
  public long getAllowRevisableInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AllowRevisable));
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


 
 }

