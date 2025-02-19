package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class QBOTownTypeCountBean extends DataContainer implements DataContainerInterface,IQBOTownTypeCountValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.QBOTownTypeCount";



  public final static  String S_LocationClass = "LOCATION_CLASS";
  public final static  String S_LocationClassClass = "LOCATION_CLASS_CLASS";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOTownTypeCountBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initLocationClass(long value){
     this.initProperty(S_LocationClass,new Long(value));
  }
  public  void setLocationClass(long value){
     this.set(S_LocationClass,new Long(value));
  }
  public  void setLocationClassNull(){
     this.set(S_LocationClass,null);
  }

  public long getLocationClass(){
        return DataType.getAsLong(this.get(S_LocationClass));
  
  }
  public long getLocationClassInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LocationClass));
      }

  public void initLocationClassClass(long value){
     this.initProperty(S_LocationClassClass,new Long(value));
  }
  public  void setLocationClassClass(long value){
     this.set(S_LocationClassClass,new Long(value));
  }
  public  void setLocationClassClassNull(){
     this.set(S_LocationClassClass,null);
  }

  public long getLocationClassClass(){
        return DataType.getAsLong(this.get(S_LocationClassClass));
  
  }
  public long getLocationClassClassInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LocationClassClass));
      }


 
 }

