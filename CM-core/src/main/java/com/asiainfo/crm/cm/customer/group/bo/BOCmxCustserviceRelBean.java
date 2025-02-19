package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class BOCmxCustserviceRelBean extends DataContainer implements DataContainerInterface,IBOCmxCustserviceRelValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.BOCmxCustserviceRel";



  public final static  String S_ManagerId = "MANAGER_ID";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_CityCode = "CITY_CODE";
  public final static  String S_CountyName = "COUNTY_NAME";
  public final static  String S_CityName = "CITY_NAME";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmxCustserviceRelBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initManagerId(long value){
     this.initProperty(S_ManagerId,new Long(value));
  }
  public  void setManagerId(long value){
     this.set(S_ManagerId,new Long(value));
  }
  public  void setManagerIdNull(){
     this.set(S_ManagerId,null);
  }

  public long getManagerId(){
        return DataType.getAsLong(this.get(S_ManagerId));
  
  }
  public long getManagerIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ManagerId));
      }

  public void initCountyCode(String value){
     this.initProperty(S_CountyCode,value);
  }
  public  void setCountyCode(String value){
     this.set(S_CountyCode,value);
  }
  public  void setCountyCodeNull(){
     this.set(S_CountyCode,null);
  }

  public String getCountyCode(){
       return DataType.getAsString(this.get(S_CountyCode));
  
  }
  public String getCountyCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CountyCode));
      }

  public void initCityCode(String value){
     this.initProperty(S_CityCode,value);
  }
  public  void setCityCode(String value){
     this.set(S_CityCode,value);
  }
  public  void setCityCodeNull(){
     this.set(S_CityCode,null);
  }

  public String getCityCode(){
       return DataType.getAsString(this.get(S_CityCode));
  
  }
  public String getCityCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CityCode));
      }

  public void initCountyName(String value){
     this.initProperty(S_CountyName,value);
  }
  public  void setCountyName(String value){
     this.set(S_CountyName,value);
  }
  public  void setCountyNameNull(){
     this.set(S_CountyName,null);
  }

  public String getCountyName(){
       return DataType.getAsString(this.get(S_CountyName));
  
  }
  public String getCountyNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CountyName));
      }

  public void initCityName(String value){
     this.initProperty(S_CityName,value);
  }
  public  void setCityName(String value){
     this.set(S_CityName,value);
  }
  public  void setCityNameNull(){
     this.set(S_CityName,null);
  }

  public String getCityName(){
       return DataType.getAsString(this.get(S_CityName));
  
  }
  public String getCityNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CityName));
      }


 
 }

