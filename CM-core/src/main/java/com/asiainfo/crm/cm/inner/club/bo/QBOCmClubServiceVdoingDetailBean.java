package com.asiainfo.crm.cm.inner.club.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.club.ivalues.*;

public class QBOCmClubServiceVdoingDetailBean extends DataContainer implements DataContainerInterface,IQBOCmClubServiceVdoingDetailValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.club.bo.QBOCmClubServiceVdoingDetail";



  public final static  String S_DefaultTimes = "DEFAULT_TIMES";
  public final static  String S_DimensionType = "DIMENSION_TYPE";
  public final static  String S_DimensionWeight = "DIMENSION_WEIGHT";
  public final static  String S_DimensionId = "DIMENSION_ID";
  public final static  String S_TotalTimes = "TOTAL_TIMES";
  public final static  String S_ServiceId = "SERVICE_ID";
  public final static  String S_DetailId = "DETAIL_ID";
  public final static  String S_DetailType = "DETAIL_TYPE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmClubServiceVdoingDetailBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initDefaultTimes(int value){
     this.initProperty(S_DefaultTimes,new Integer(value));
  }
  public  void setDefaultTimes(int value){
     this.set(S_DefaultTimes,new Integer(value));
  }
  public  void setDefaultTimesNull(){
     this.set(S_DefaultTimes,null);
  }

  public int getDefaultTimes(){
        return DataType.getAsInt(this.get(S_DefaultTimes));
  
  }
  public int getDefaultTimesInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_DefaultTimes));
      }

  public void initDimensionType(int value){
     this.initProperty(S_DimensionType,new Integer(value));
  }
  public  void setDimensionType(int value){
     this.set(S_DimensionType,new Integer(value));
  }
  public  void setDimensionTypeNull(){
     this.set(S_DimensionType,null);
  }

  public int getDimensionType(){
        return DataType.getAsInt(this.get(S_DimensionType));
  
  }
  public int getDimensionTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_DimensionType));
      }

  public void initDimensionWeight(int value){
     this.initProperty(S_DimensionWeight,new Integer(value));
  }
  public  void setDimensionWeight(int value){
     this.set(S_DimensionWeight,new Integer(value));
  }
  public  void setDimensionWeightNull(){
     this.set(S_DimensionWeight,null);
  }

  public int getDimensionWeight(){
        return DataType.getAsInt(this.get(S_DimensionWeight));
  
  }
  public int getDimensionWeightInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_DimensionWeight));
      }

  public void initDimensionId(long value){
     this.initProperty(S_DimensionId,new Long(value));
  }
  public  void setDimensionId(long value){
     this.set(S_DimensionId,new Long(value));
  }
  public  void setDimensionIdNull(){
     this.set(S_DimensionId,null);
  }

  public long getDimensionId(){
        return DataType.getAsLong(this.get(S_DimensionId));
  
  }
  public long getDimensionIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DimensionId));
      }

  public void initTotalTimes(int value){
     this.initProperty(S_TotalTimes,new Integer(value));
  }
  public  void setTotalTimes(int value){
     this.set(S_TotalTimes,new Integer(value));
  }
  public  void setTotalTimesNull(){
     this.set(S_TotalTimes,null);
  }

  public int getTotalTimes(){
        return DataType.getAsInt(this.get(S_TotalTimes));
  
  }
  public int getTotalTimesInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_TotalTimes));
      }

  public void initServiceId(long value){
     this.initProperty(S_ServiceId,new Long(value));
  }
  public  void setServiceId(long value){
     this.set(S_ServiceId,new Long(value));
  }
  public  void setServiceIdNull(){
     this.set(S_ServiceId,null);
  }

  public long getServiceId(){
        return DataType.getAsLong(this.get(S_ServiceId));
  
  }
  public long getServiceIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ServiceId));
      }

  public void initDetailId(long value){
     this.initProperty(S_DetailId,new Long(value));
  }
  public  void setDetailId(long value){
     this.set(S_DetailId,new Long(value));
  }
  public  void setDetailIdNull(){
     this.set(S_DetailId,null);
  }

  public long getDetailId(){
        return DataType.getAsLong(this.get(S_DetailId));
  
  }
  public long getDetailIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DetailId));
      }

  public void initDetailType(String value){
     this.initProperty(S_DetailType,value);
  }
  public  void setDetailType(String value){
     this.set(S_DetailType,value);
  }
  public  void setDetailTypeNull(){
     this.set(S_DetailType,null);
  }

  public String getDetailType(){
       return DataType.getAsString(this.get(S_DetailType));
  
  }
  public String getDetailTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DetailType));
      }


 
 }

