package com.asiainfo.crm.so.instance.rboss.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.so.instance.rboss.ivalues.*;

public class BOInsxUserBakSimBean extends DataContainer implements DataContainerInterface,IBOInsxUserBakSimValue{

  private static String  m_boName = "com.asiainfo.crm.so.instance.rboss.bo.BOInsxUserBakSim";



  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_ActiveTime = "ACTIVE_TIME";
  public final static  String S_IccId = "ICC_ID";
  public final static  String S_SimCode = "SIM_CODE";
  public final static  String S_BakSimInfoId = "BAK_SIM_INFO_ID";
  public final static  String S_FreeUseDate = "FREE_USE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_BusinessId = "BUSINESS_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ActiveDate = "ACTIVE_DATE";
  public final static  String S_FreeUseTime = "FREE_USE_TIME";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_Status = "STATUS";
  public final static  String S_SimGoodsType = "SIM_GOODS_TYPE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_ImsiId = "IMSI_ID";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOInsxUserBakSimBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initActiveTime(int value){
     this.initProperty(S_ActiveTime,new Integer(value));
  }
  public  void setActiveTime(int value){
     this.set(S_ActiveTime,new Integer(value));
  }
  public  void setActiveTimeNull(){
     this.set(S_ActiveTime,null);
  }

  public int getActiveTime(){
        return DataType.getAsInt(this.get(S_ActiveTime));
  
  }
  public int getActiveTimeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ActiveTime));
      }

  public void initIccId(String value){
     this.initProperty(S_IccId,value);
  }
  public  void setIccId(String value){
     this.set(S_IccId,value);
  }
  public  void setIccIdNull(){
     this.set(S_IccId,null);
  }

  public String getIccId(){
       return DataType.getAsString(this.get(S_IccId));
  
  }
  public String getIccIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IccId));
      }

  public void initSimCode(int value){
     this.initProperty(S_SimCode,new Integer(value));
  }
  public  void setSimCode(int value){
     this.set(S_SimCode,new Integer(value));
  }
  public  void setSimCodeNull(){
     this.set(S_SimCode,null);
  }

  public int getSimCode(){
        return DataType.getAsInt(this.get(S_SimCode));
  
  }
  public int getSimCodeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_SimCode));
      }

  public void initBakSimInfoId(long value){
     this.initProperty(S_BakSimInfoId,new Long(value));
  }
  public  void setBakSimInfoId(long value){
     this.set(S_BakSimInfoId,new Long(value));
  }
  public  void setBakSimInfoIdNull(){
     this.set(S_BakSimInfoId,null);
  }

  public long getBakSimInfoId(){
        return DataType.getAsLong(this.get(S_BakSimInfoId));
  
  }
  public long getBakSimInfoIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BakSimInfoId));
      }

  public void initFreeUseDate(Timestamp value){
     this.initProperty(S_FreeUseDate,value);
  }
  public  void setFreeUseDate(Timestamp value){
     this.set(S_FreeUseDate,value);
  }
  public  void setFreeUseDateNull(){
     this.set(S_FreeUseDate,null);
  }

  public Timestamp getFreeUseDate(){
        return DataType.getAsDateTime(this.get(S_FreeUseDate));
  
  }
  public Timestamp getFreeUseDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_FreeUseDate));
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

  public void initBusinessId(long value){
     this.initProperty(S_BusinessId,new Long(value));
  }
  public  void setBusinessId(long value){
     this.set(S_BusinessId,new Long(value));
  }
  public  void setBusinessIdNull(){
     this.set(S_BusinessId,null);
  }

  public long getBusinessId(){
        return DataType.getAsLong(this.get(S_BusinessId));
  
  }
  public long getBusinessIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BusinessId));
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

  public void initActiveDate(Timestamp value){
     this.initProperty(S_ActiveDate,value);
  }
  public  void setActiveDate(Timestamp value){
     this.set(S_ActiveDate,value);
  }
  public  void setActiveDateNull(){
     this.set(S_ActiveDate,null);
  }

  public Timestamp getActiveDate(){
        return DataType.getAsDateTime(this.get(S_ActiveDate));
  
  }
  public Timestamp getActiveDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ActiveDate));
      }

  public void initFreeUseTime(int value){
     this.initProperty(S_FreeUseTime,new Integer(value));
  }
  public  void setFreeUseTime(int value){
     this.set(S_FreeUseTime,new Integer(value));
  }
  public  void setFreeUseTimeNull(){
     this.set(S_FreeUseTime,null);
  }

  public int getFreeUseTime(){
        return DataType.getAsInt(this.get(S_FreeUseTime));
  
  }
  public int getFreeUseTimeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_FreeUseTime));
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

  public void initStatus(int value){
     this.initProperty(S_Status,new Integer(value));
  }
  public  void setStatus(int value){
     this.set(S_Status,new Integer(value));
  }
  public  void setStatusNull(){
     this.set(S_Status,null);
  }

  public int getStatus(){
        return DataType.getAsInt(this.get(S_Status));
  
  }
  public int getStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Status));
      }

  public void initSimGoodsType(String value){
     this.initProperty(S_SimGoodsType,value);
  }
  public  void setSimGoodsType(String value){
     this.set(S_SimGoodsType,value);
  }
  public  void setSimGoodsTypeNull(){
     this.set(S_SimGoodsType,null);
  }

  public String getSimGoodsType(){
       return DataType.getAsString(this.get(S_SimGoodsType));
  
  }
  public String getSimGoodsTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SimGoodsType));
      }

  public void initUserId(long value){
     this.initProperty(S_UserId,new Long(value));
  }
  public  void setUserId(long value){
     this.set(S_UserId,new Long(value));
  }
  public  void setUserIdNull(){
     this.set(S_UserId,null);
  }

  public long getUserId(){
        return DataType.getAsLong(this.get(S_UserId));
  
  }
  public long getUserIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_UserId));
      }

  public void initImsiId(String value){
     this.initProperty(S_ImsiId,value);
  }
  public  void setImsiId(String value){
     this.set(S_ImsiId,value);
  }
  public  void setImsiIdNull(){
     this.set(S_ImsiId,null);
  }

  public String getImsiId(){
       return DataType.getAsString(this.get(S_ImsiId));
  
  }
  public String getImsiIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ImsiId));
      }


 
 }

