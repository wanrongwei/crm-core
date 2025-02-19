package com.asiainfo.crm.cm.inner.customer.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.customer.ivalues.*;

public class BOCmxGroupCreditPointRecBean extends DataContainer implements DataContainerInterface,IBOCmxGroupCreditPointRecValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.customer.bo.BOCmxGroupCreditPointRec";



  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_BeforeAdjustPoints = "BEFORE_ADJUST_POINTS";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PointsType = "POINTS_TYPE";
  public final static  String S_Exti = "EXTI";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_RecId = "REC_ID";
  public final static  String S_AdjustReason = "ADJUST_REASON";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_AdjustDirection = "ADJUST_DIRECTION";
  public final static  String S_AfterAdjustPoints = "AFTER_ADJUST_POINTS";
  public final static  String S_OpName = "OP_NAME";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_AdjustPoints = "ADJUST_POINTS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Ext2 = "EXT2";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmxGroupCreditPointRecBean() throws AIException{
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

  public void initBeforeAdjustPoints(double value){
     this.initProperty(S_BeforeAdjustPoints,new Double(value));
  }
  public  void setBeforeAdjustPoints(double value){
     this.set(S_BeforeAdjustPoints,new Double(value));
  }
  public  void setBeforeAdjustPointsNull(){
     this.set(S_BeforeAdjustPoints,null);
  }

  public double getBeforeAdjustPoints(){
        return DataType.getAsDouble(this.get(S_BeforeAdjustPoints));
  
  }
  public double getBeforeAdjustPointsInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_BeforeAdjustPoints));
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

  public void initPointsType(int value){
     this.initProperty(S_PointsType,new Integer(value));
  }
  public  void setPointsType(int value){
     this.set(S_PointsType,new Integer(value));
  }
  public  void setPointsTypeNull(){
     this.set(S_PointsType,null);
  }

  public int getPointsType(){
        return DataType.getAsInt(this.get(S_PointsType));
  
  }
  public int getPointsTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PointsType));
      }

  public void initExti(long value){
     this.initProperty(S_Exti,new Long(value));
  }
  public  void setExti(long value){
     this.set(S_Exti,new Long(value));
  }
  public  void setExtiNull(){
     this.set(S_Exti,null);
  }

  public long getExti(){
        return DataType.getAsLong(this.get(S_Exti));
  
  }
  public long getExtiInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Exti));
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

  public void initRecId(long value){
     this.initProperty(S_RecId,new Long(value));
  }
  public  void setRecId(long value){
     this.set(S_RecId,new Long(value));
  }
  public  void setRecIdNull(){
     this.set(S_RecId,null);
  }

  public long getRecId(){
        return DataType.getAsLong(this.get(S_RecId));
  
  }
  public long getRecIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RecId));
      }

  public void initAdjustReason(String value){
     this.initProperty(S_AdjustReason,value);
  }
  public  void setAdjustReason(String value){
     this.set(S_AdjustReason,value);
  }
  public  void setAdjustReasonNull(){
     this.set(S_AdjustReason,null);
  }

  public String getAdjustReason(){
       return DataType.getAsString(this.get(S_AdjustReason));
  
  }
  public String getAdjustReasonInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AdjustReason));
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

  public void initAdjustDirection(int value){
     this.initProperty(S_AdjustDirection,new Integer(value));
  }
  public  void setAdjustDirection(int value){
     this.set(S_AdjustDirection,new Integer(value));
  }
  public  void setAdjustDirectionNull(){
     this.set(S_AdjustDirection,null);
  }

  public int getAdjustDirection(){
        return DataType.getAsInt(this.get(S_AdjustDirection));
  
  }
  public int getAdjustDirectionInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_AdjustDirection));
      }

  public void initAfterAdjustPoints(double value){
     this.initProperty(S_AfterAdjustPoints,new Double(value));
  }
  public  void setAfterAdjustPoints(double value){
     this.set(S_AfterAdjustPoints,new Double(value));
  }
  public  void setAfterAdjustPointsNull(){
     this.set(S_AfterAdjustPoints,null);
  }

  public double getAfterAdjustPoints(){
        return DataType.getAsDouble(this.get(S_AfterAdjustPoints));
  
  }
  public double getAfterAdjustPointsInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_AfterAdjustPoints));
      }

  public void initOpName(String value){
     this.initProperty(S_OpName,value);
  }
  public  void setOpName(String value){
     this.set(S_OpName,value);
  }
  public  void setOpNameNull(){
     this.set(S_OpName,null);
  }

  public String getOpName(){
       return DataType.getAsString(this.get(S_OpName));
  
  }
  public String getOpNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OpName));
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

  public void initAdjustPoints(double value){
     this.initProperty(S_AdjustPoints,new Double(value));
  }
  public  void setAdjustPoints(double value){
     this.set(S_AdjustPoints,new Double(value));
  }
  public  void setAdjustPointsNull(){
     this.set(S_AdjustPoints,null);
  }

  public double getAdjustPoints(){
        return DataType.getAsDouble(this.get(S_AdjustPoints));
  
  }
  public double getAdjustPointsInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_AdjustPoints));
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

  public void initExt2(String value){
     this.initProperty(S_Ext2,value);
  }
  public  void setExt2(String value){
     this.set(S_Ext2,value);
  }
  public  void setExt2Null(){
     this.set(S_Ext2,null);
  }

  public String getExt2(){
       return DataType.getAsString(this.get(S_Ext2));
  
  }
  public String getExt2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext2));
      }


 
 }

