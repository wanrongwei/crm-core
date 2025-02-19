package com.asiainfo.crm.cm.cp.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.cp.ivalues.*;

public class QBOCmPartnerInfoBean extends DataContainer implements DataContainerInterface,IQBOCmPartnerInfoValue{

  private static String  m_boName = "com.asiainfo.crm.cm.cp.bo.QBOCmPartnerInfo";



  public final static  String S_PartnerType = "PARTNER_TYPE";
  public final static  String S_TypeDesc = "TYPE_DESC";
  public final static  String S_Name = "NAME";
  public final static  String S_PartnerTypeDtl = "PARTNER_TYPE_DTL";
  public final static  String S_StatusType = "STATUS_TYPE";
  public final static  String S_Id = "ID";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmPartnerInfoBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initPartnerType(long value){
     this.initProperty(S_PartnerType,new Long(value));
  }
  public  void setPartnerType(long value){
     this.set(S_PartnerType,new Long(value));
  }
  public  void setPartnerTypeNull(){
     this.set(S_PartnerType,null);
  }

  public long getPartnerType(){
        return DataType.getAsLong(this.get(S_PartnerType));
  
  }
  public long getPartnerTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PartnerType));
      }

  public void initTypeDesc(String value){
     this.initProperty(S_TypeDesc,value);
  }
  public  void setTypeDesc(String value){
     this.set(S_TypeDesc,value);
  }
  public  void setTypeDescNull(){
     this.set(S_TypeDesc,null);
  }

  public String getTypeDesc(){
       return DataType.getAsString(this.get(S_TypeDesc));
  
  }
  public String getTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TypeDesc));
      }

  public void initName(String value){
     this.initProperty(S_Name,value);
  }
  public  void setName(String value){
     this.set(S_Name,value);
  }
  public  void setNameNull(){
     this.set(S_Name,null);
  }

  public String getName(){
       return DataType.getAsString(this.get(S_Name));
  
  }
  public String getNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Name));
      }

  public void initPartnerTypeDtl(long value){
     this.initProperty(S_PartnerTypeDtl,new Long(value));
  }
  public  void setPartnerTypeDtl(long value){
     this.set(S_PartnerTypeDtl,new Long(value));
  }
  public  void setPartnerTypeDtlNull(){
     this.set(S_PartnerTypeDtl,null);
  }

  public long getPartnerTypeDtl(){
        return DataType.getAsLong(this.get(S_PartnerTypeDtl));
  
  }
  public long getPartnerTypeDtlInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PartnerTypeDtl));
      }

  public void initStatusType(long value){
     this.initProperty(S_StatusType,new Long(value));
  }
  public  void setStatusType(long value){
     this.set(S_StatusType,new Long(value));
  }
  public  void setStatusTypeNull(){
     this.set(S_StatusType,null);
  }

  public long getStatusType(){
        return DataType.getAsLong(this.get(S_StatusType));
  
  }
  public long getStatusTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_StatusType));
      }

  public void initId(String value){
     this.initProperty(S_Id,value);
  }
  public  void setId(String value){
     this.set(S_Id,value);
  }
  public  void setIdNull(){
     this.set(S_Id,null);
  }

  public String getId(){
       return DataType.getAsString(this.get(S_Id));
  
  }
  public String getIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Id));
      }


 
 }

