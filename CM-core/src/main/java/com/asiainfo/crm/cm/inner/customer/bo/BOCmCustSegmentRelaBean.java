package com.asiainfo.crm.cm.inner.customer.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.customer.ivalues.*;

public class BOCmCustSegmentRelaBean extends DataContainer implements DataContainerInterface,IBOCmCustSegmentRelaValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.customer.bo.BOCmCustSegmentRela";



  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_NotifyType = "NOTIFY_TYPE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_IsCreditRecalculated = "IS_CREDIT_RECALCULATED";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_IsRevisable = "IS_REVISABLE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RelaId = "RELA_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_SegmentId = "SEGMENT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_IsCreditCalculated = "IS_CREDIT_CALCULATED";
  public final static  String S_NoticePeriod = "NOTICE_PERIOD";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_IsApprovable = "IS_APPROVABLE";
  public final static  String S_IsInheritable = "IS_INHERITABLE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmCustSegmentRelaBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initNotifyType(long value){
     this.initProperty(S_NotifyType,new Long(value));
  }
  public  void setNotifyType(long value){
     this.set(S_NotifyType,new Long(value));
  }
  public  void setNotifyTypeNull(){
     this.set(S_NotifyType,null);
  }

  public long getNotifyType(){
        return DataType.getAsLong(this.get(S_NotifyType));
  
  }
  public long getNotifyTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_NotifyType));
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

  public void initIsCreditRecalculated(long value){
     this.initProperty(S_IsCreditRecalculated,new Long(value));
  }
  public  void setIsCreditRecalculated(long value){
     this.set(S_IsCreditRecalculated,new Long(value));
  }
  public  void setIsCreditRecalculatedNull(){
     this.set(S_IsCreditRecalculated,null);
  }

  public long getIsCreditRecalculated(){
        return DataType.getAsLong(this.get(S_IsCreditRecalculated));
  
  }
  public long getIsCreditRecalculatedInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsCreditRecalculated));
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

  public void initIsRevisable(long value){
     this.initProperty(S_IsRevisable,new Long(value));
  }
  public  void setIsRevisable(long value){
     this.set(S_IsRevisable,new Long(value));
  }
  public  void setIsRevisableNull(){
     this.set(S_IsRevisable,null);
  }

  public long getIsRevisable(){
        return DataType.getAsLong(this.get(S_IsRevisable));
  
  }
  public long getIsRevisableInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsRevisable));
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

  public void initRelaId(long value){
     this.initProperty(S_RelaId,new Long(value));
  }
  public  void setRelaId(long value){
     this.set(S_RelaId,new Long(value));
  }
  public  void setRelaIdNull(){
     this.set(S_RelaId,null);
  }

  public long getRelaId(){
        return DataType.getAsLong(this.get(S_RelaId));
  
  }
  public long getRelaIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelaId));
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

  public void initIsCreditCalculated(long value){
     this.initProperty(S_IsCreditCalculated,new Long(value));
  }
  public  void setIsCreditCalculated(long value){
     this.set(S_IsCreditCalculated,new Long(value));
  }
  public  void setIsCreditCalculatedNull(){
     this.set(S_IsCreditCalculated,null);
  }

  public long getIsCreditCalculated(){
        return DataType.getAsLong(this.get(S_IsCreditCalculated));
  
  }
  public long getIsCreditCalculatedInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsCreditCalculated));
      }

  public void initNoticePeriod(long value){
     this.initProperty(S_NoticePeriod,new Long(value));
  }
  public  void setNoticePeriod(long value){
     this.set(S_NoticePeriod,new Long(value));
  }
  public  void setNoticePeriodNull(){
     this.set(S_NoticePeriod,null);
  }

  public long getNoticePeriod(){
        return DataType.getAsLong(this.get(S_NoticePeriod));
  
  }
  public long getNoticePeriodInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_NoticePeriod));
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

  public void initIsApprovable(long value){
     this.initProperty(S_IsApprovable,new Long(value));
  }
  public  void setIsApprovable(long value){
     this.set(S_IsApprovable,new Long(value));
  }
  public  void setIsApprovableNull(){
     this.set(S_IsApprovable,null);
  }

  public long getIsApprovable(){
        return DataType.getAsLong(this.get(S_IsApprovable));
  
  }
  public long getIsApprovableInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsApprovable));
      }

  public void initIsInheritable(long value){
     this.initProperty(S_IsInheritable,new Long(value));
  }
  public  void setIsInheritable(long value){
     this.set(S_IsInheritable,new Long(value));
  }
  public  void setIsInheritableNull(){
     this.set(S_IsInheritable,null);
  }

  public long getIsInheritable(){
        return DataType.getAsLong(this.get(S_IsInheritable));
  
  }
  public long getIsInheritableInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsInheritable));
      }


 
 }

