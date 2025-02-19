package com.asiainfo.crm.common.bo;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.*;
import com.asiainfo.crm.common.ivalues.IBOBsParaDetailValue;

import java.sql.Timestamp;

public class BOBsParaDetailBean extends DataContainer implements DataContainerInterface, IBOBsParaDetailValue {

  private static String  m_boName = "com.asiainfo.crm.common.bo.BOBsParaDetail";



  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ParaType = "PARA_TYPE";
  public final static  String S_Para5 = "PARA5";
  public final static  String S_StateDate = "STATE_DATE";
  public final static  String S_Para4 = "PARA4";
  public final static  String S_ParaCode = "PARA_CODE";
  public final static  String S_Para1 = "PARA1";
  public final static  String S_ParaName = "PARA_NAME";
  public final static  String S_ParaDesc = "PARA_DESC";
  public final static  String S_Para3 = "PARA3";
  public final static  String S_Para2 = "PARA2";
  public final static  String S_RegionId = "REGION_ID";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOBsParaDetailBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initParaType(String value){
     this.initProperty(S_ParaType,value);
  }
  public  void setParaType(String value){
     this.set(S_ParaType,value);
  }
  public  void setParaTypeNull(){
     this.set(S_ParaType,null);
  }

  public String getParaType(){
       return DataType.getAsString(this.get(S_ParaType));
  
  }
  public String getParaTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ParaType));
      }

  public void initPara5(String value){
     this.initProperty(S_Para5,value);
  }
  public  void setPara5(String value){
     this.set(S_Para5,value);
  }
  public  void setPara5Null(){
     this.set(S_Para5,null);
  }

  public String getPara5(){
       return DataType.getAsString(this.get(S_Para5));
  
  }
  public String getPara5InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Para5));
      }

  public void initStateDate(Timestamp value){
     this.initProperty(S_StateDate,value);
  }
  public  void setStateDate(Timestamp value){
     this.set(S_StateDate,value);
  }
  public  void setStateDateNull(){
     this.set(S_StateDate,null);
  }

  public Timestamp getStateDate(){
        return DataType.getAsDateTime(this.get(S_StateDate));
  
  }
  public Timestamp getStateDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_StateDate));
      }

  public void initPara4(String value){
     this.initProperty(S_Para4,value);
  }
  public  void setPara4(String value){
     this.set(S_Para4,value);
  }
  public  void setPara4Null(){
     this.set(S_Para4,null);
  }

  public String getPara4(){
       return DataType.getAsString(this.get(S_Para4));
  
  }
  public String getPara4InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Para4));
      }

  public void initParaCode(String value){
     this.initProperty(S_ParaCode,value);
  }
  public  void setParaCode(String value){
     this.set(S_ParaCode,value);
  }
  public  void setParaCodeNull(){
     this.set(S_ParaCode,null);
  }

  public String getParaCode(){
       return DataType.getAsString(this.get(S_ParaCode));
  
  }
  public String getParaCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ParaCode));
      }

  public void initPara1(String value){
     this.initProperty(S_Para1,value);
  }
  public  void setPara1(String value){
     this.set(S_Para1,value);
  }
  public  void setPara1Null(){
     this.set(S_Para1,null);
  }

  public String getPara1(){
       return DataType.getAsString(this.get(S_Para1));
  
  }
  public String getPara1InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Para1));
      }

  public void initParaName(String value){
     this.initProperty(S_ParaName,value);
  }
  public  void setParaName(String value){
     this.set(S_ParaName,value);
  }
  public  void setParaNameNull(){
     this.set(S_ParaName,null);
  }

  public String getParaName(){
       return DataType.getAsString(this.get(S_ParaName));
  
  }
  public String getParaNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ParaName));
      }

  public void initParaDesc(String value){
     this.initProperty(S_ParaDesc,value);
  }
  public  void setParaDesc(String value){
     this.set(S_ParaDesc,value);
  }
  public  void setParaDescNull(){
     this.set(S_ParaDesc,null);
  }

  public String getParaDesc(){
       return DataType.getAsString(this.get(S_ParaDesc));
  
  }
  public String getParaDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ParaDesc));
      }

  public void initPara3(String value){
     this.initProperty(S_Para3,value);
  }
  public  void setPara3(String value){
     this.set(S_Para3,value);
  }
  public  void setPara3Null(){
     this.set(S_Para3,null);
  }

  public String getPara3(){
       return DataType.getAsString(this.get(S_Para3));
  
  }
  public String getPara3InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Para3));
      }

  public void initPara2(String value){
     this.initProperty(S_Para2,value);
  }
  public  void setPara2(String value){
     this.set(S_Para2,value);
  }
  public  void setPara2Null(){
     this.set(S_Para2,null);
  }

  public String getPara2(){
       return DataType.getAsString(this.get(S_Para2));
  
  }
  public String getPara2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Para2));
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


 
 }

