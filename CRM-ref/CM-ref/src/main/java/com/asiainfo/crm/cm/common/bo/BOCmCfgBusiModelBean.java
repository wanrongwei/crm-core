package com.asiainfo.crm.cm.common.bo;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.*;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgBusiModelValue;

import java.sql.Timestamp;

public class BOCmCfgBusiModelBean extends DataContainer implements DataContainerInterface,IBOCmCfgBusiModelValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmCfgBusiModel";



  public final static  String S_State = "STATE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_BusiModelImpl = "BUSI_MODEL_IMPL";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_BusiModelInterface = "BUSI_MODEL_INTERFACE";
  public final static  String S_BusiModelId = "BUSI_MODEL_ID";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmCfgBusiModelBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initBusiModelImpl(String value){
     this.initProperty(S_BusiModelImpl,value);
  }
  public  void setBusiModelImpl(String value){
     this.set(S_BusiModelImpl,value);
  }
  public  void setBusiModelImplNull(){
     this.set(S_BusiModelImpl,null);
  }

  public String getBusiModelImpl(){
       return DataType.getAsString(this.get(S_BusiModelImpl));
  
  }
  public String getBusiModelImplInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BusiModelImpl));
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

  public void initBusiModelInterface(String value){
     this.initProperty(S_BusiModelInterface,value);
  }
  public  void setBusiModelInterface(String value){
     this.set(S_BusiModelInterface,value);
  }
  public  void setBusiModelInterfaceNull(){
     this.set(S_BusiModelInterface,null);
  }

  public String getBusiModelInterface(){
       return DataType.getAsString(this.get(S_BusiModelInterface));
  
  }
  public String getBusiModelInterfaceInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BusiModelInterface));
      }

  public void initBusiModelId(long value){
     this.initProperty(S_BusiModelId,new Long(value));
  }
  public  void setBusiModelId(long value){
     this.set(S_BusiModelId,new Long(value));
  }
  public  void setBusiModelIdNull(){
     this.set(S_BusiModelId,null);
  }

  public long getBusiModelId(){
        return DataType.getAsLong(this.get(S_BusiModelId));
  
  }
  public long getBusiModelIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BusiModelId));
      }


 
 }

