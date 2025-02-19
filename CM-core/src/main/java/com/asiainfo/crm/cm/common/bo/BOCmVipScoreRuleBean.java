package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCmVipScoreRuleBean extends DataContainer implements DataContainerInterface,IBOCmVipScoreRuleValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmVipScoreRule";



  public final static  String S_OnlineTime = "ONLINE_TIME";
  public final static  String S_NeedScore = "NEED_SCORE";
  public final static  String S_Id = "ID";
  public final static  String S_ServiceType = "SERVICE_TYPE";
  public final static  String S_ServiceLevel = "SERVICE_LEVEL";
  public final static  String S_Notes = "NOTES";
  public final static  String S_IsVip = "IS_VIP";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmVipScoreRuleBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initOnlineTime(int value){
     this.initProperty(S_OnlineTime,new Integer(value));
  }
  public  void setOnlineTime(int value){
     this.set(S_OnlineTime,new Integer(value));
  }
  public  void setOnlineTimeNull(){
     this.set(S_OnlineTime,null);
  }

  public int getOnlineTime(){
        return DataType.getAsInt(this.get(S_OnlineTime));
  
  }
  public int getOnlineTimeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_OnlineTime));
      }

  public void initNeedScore(long value){
     this.initProperty(S_NeedScore,new Long(value));
  }
  public  void setNeedScore(long value){
     this.set(S_NeedScore,new Long(value));
  }
  public  void setNeedScoreNull(){
     this.set(S_NeedScore,null);
  }

  public long getNeedScore(){
        return DataType.getAsLong(this.get(S_NeedScore));
  
  }
  public long getNeedScoreInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_NeedScore));
      }

  public void initId(long value){
     this.initProperty(S_Id,new Long(value));
  }
  public  void setId(long value){
     this.set(S_Id,new Long(value));
  }
  public  void setIdNull(){
     this.set(S_Id,null);
  }

  public long getId(){
        return DataType.getAsLong(this.get(S_Id));
  
  }
  public long getIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Id));
      }

  public void initServiceType(int value){
     this.initProperty(S_ServiceType,new Integer(value));
  }
  public  void setServiceType(int value){
     this.set(S_ServiceType,new Integer(value));
  }
  public  void setServiceTypeNull(){
     this.set(S_ServiceType,null);
  }

  public int getServiceType(){
        return DataType.getAsInt(this.get(S_ServiceType));
  
  }
  public int getServiceTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ServiceType));
      }

  public void initServiceLevel(int value){
     this.initProperty(S_ServiceLevel,new Integer(value));
  }
  public  void setServiceLevel(int value){
     this.set(S_ServiceLevel,new Integer(value));
  }
  public  void setServiceLevelNull(){
     this.set(S_ServiceLevel,null);
  }

  public int getServiceLevel(){
        return DataType.getAsInt(this.get(S_ServiceLevel));
  
  }
  public int getServiceLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ServiceLevel));
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

  public void initIsVip(int value){
     this.initProperty(S_IsVip,new Integer(value));
  }
  public  void setIsVip(int value){
     this.set(S_IsVip,new Integer(value));
  }
  public  void setIsVipNull(){
     this.set(S_IsVip,null);
  }

  public int getIsVip(){
        return DataType.getAsInt(this.get(S_IsVip));
  
  }
  public int getIsVipInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsVip));
      }


 
 }

