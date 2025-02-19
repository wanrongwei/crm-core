package com.asiainfo.crm.cm.common.bo;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.*;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgObjectWrapperValue;

public class BOCmCfgObjectWrapperBean extends DataContainer implements DataContainerInterface, IBOCmCfgObjectWrapperValue {

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmCfgObjectWrapper";



  public final static  String S_ObjectName = "OBJECT_NAME";
  public final static  String S_DispAttrName = "DISP_ATTR_NAME";
  public final static  String S_State = "STATE";
  public final static  String S_AttrGetter = "ATTR_GETTER";
  public final static  String S_AttrName = "ATTR_NAME";
  public final static  String S_DispAttrGetter = "DISP_ATTR_GETTER";
  public final static  String S_DispAttrValueGetter = "DISP_ATTR_VALUE_GETTER";
  public final static  String S_DispAttrSetter = "DISP_ATTR_SETTER";
  public final static  String S_DispAttrParamDatatype = "DISP_ATTR_PARAM_DATATYPE";
  public final static  String S_DispAttrService = "DISP_ATTR_SERVICE";
  public final static  String S_DispAttrParam = "DISP_ATTR_PARAM";
  public final static  String S_ObjType = "OBJ_TYPE";
  public final static  String S_DispAttrValue = "DISP_ATTR_VALUE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmCfgObjectWrapperBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initObjectName(String value){
     this.initProperty(S_ObjectName,value);
  }
  public  void setObjectName(String value){
     this.set(S_ObjectName,value);
  }
  public  void setObjectNameNull(){
     this.set(S_ObjectName,null);
  }

  public String getObjectName(){
       return DataType.getAsString(this.get(S_ObjectName));
  
  }
  public String getObjectNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ObjectName));
      }

  public void initDispAttrName(String value){
     this.initProperty(S_DispAttrName,value);
  }
  public  void setDispAttrName(String value){
     this.set(S_DispAttrName,value);
  }
  public  void setDispAttrNameNull(){
     this.set(S_DispAttrName,null);
  }

  public String getDispAttrName(){
       return DataType.getAsString(this.get(S_DispAttrName));
  
  }
  public String getDispAttrNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DispAttrName));
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

  public void initAttrGetter(String value){
     this.initProperty(S_AttrGetter,value);
  }
  public  void setAttrGetter(String value){
     this.set(S_AttrGetter,value);
  }
  public  void setAttrGetterNull(){
     this.set(S_AttrGetter,null);
  }

  public String getAttrGetter(){
       return DataType.getAsString(this.get(S_AttrGetter));
  
  }
  public String getAttrGetterInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AttrGetter));
      }

  public void initAttrName(String value){
     this.initProperty(S_AttrName,value);
  }
  public  void setAttrName(String value){
     this.set(S_AttrName,value);
  }
  public  void setAttrNameNull(){
     this.set(S_AttrName,null);
  }

  public String getAttrName(){
       return DataType.getAsString(this.get(S_AttrName));
  
  }
  public String getAttrNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AttrName));
      }

  public void initDispAttrGetter(String value){
     this.initProperty(S_DispAttrGetter,value);
  }
  public  void setDispAttrGetter(String value){
     this.set(S_DispAttrGetter,value);
  }
  public  void setDispAttrGetterNull(){
     this.set(S_DispAttrGetter,null);
  }

  public String getDispAttrGetter(){
       return DataType.getAsString(this.get(S_DispAttrGetter));
  
  }
  public String getDispAttrGetterInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DispAttrGetter));
      }

  public void initDispAttrValueGetter(String value){
     this.initProperty(S_DispAttrValueGetter,value);
  }
  public  void setDispAttrValueGetter(String value){
     this.set(S_DispAttrValueGetter,value);
  }
  public  void setDispAttrValueGetterNull(){
     this.set(S_DispAttrValueGetter,null);
  }

  public String getDispAttrValueGetter(){
       return DataType.getAsString(this.get(S_DispAttrValueGetter));
  
  }
  public String getDispAttrValueGetterInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DispAttrValueGetter));
      }

  public void initDispAttrSetter(String value){
     this.initProperty(S_DispAttrSetter,value);
  }
  public  void setDispAttrSetter(String value){
     this.set(S_DispAttrSetter,value);
  }
  public  void setDispAttrSetterNull(){
     this.set(S_DispAttrSetter,null);
  }

  public String getDispAttrSetter(){
       return DataType.getAsString(this.get(S_DispAttrSetter));
  
  }
  public String getDispAttrSetterInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DispAttrSetter));
      }

  public void initDispAttrParamDatatype(String value){
     this.initProperty(S_DispAttrParamDatatype,value);
  }
  public  void setDispAttrParamDatatype(String value){
     this.set(S_DispAttrParamDatatype,value);
  }
  public  void setDispAttrParamDatatypeNull(){
     this.set(S_DispAttrParamDatatype,null);
  }

  public String getDispAttrParamDatatype(){
       return DataType.getAsString(this.get(S_DispAttrParamDatatype));
  
  }
  public String getDispAttrParamDatatypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DispAttrParamDatatype));
      }

  public void initDispAttrService(String value){
     this.initProperty(S_DispAttrService,value);
  }
  public  void setDispAttrService(String value){
     this.set(S_DispAttrService,value);
  }
  public  void setDispAttrServiceNull(){
     this.set(S_DispAttrService,null);
  }

  public String getDispAttrService(){
       return DataType.getAsString(this.get(S_DispAttrService));
  
  }
  public String getDispAttrServiceInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DispAttrService));
      }

  public void initDispAttrParam(String value){
     this.initProperty(S_DispAttrParam,value);
  }
  public  void setDispAttrParam(String value){
     this.set(S_DispAttrParam,value);
  }
  public  void setDispAttrParamNull(){
     this.set(S_DispAttrParam,null);
  }

  public String getDispAttrParam(){
       return DataType.getAsString(this.get(S_DispAttrParam));
  
  }
  public String getDispAttrParamInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DispAttrParam));
      }

  public void initObjType(int value){
     this.initProperty(S_ObjType,new Integer(value));
  }
  public  void setObjType(int value){
     this.set(S_ObjType,new Integer(value));
  }
  public  void setObjTypeNull(){
     this.set(S_ObjType,null);
  }

  public int getObjType(){
        return DataType.getAsInt(this.get(S_ObjType));
  
  }
  public int getObjTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ObjType));
      }

  public void initDispAttrValue(String value){
     this.initProperty(S_DispAttrValue,value);
  }
  public  void setDispAttrValue(String value){
     this.set(S_DispAttrValue,value);
  }
  public  void setDispAttrValueNull(){
     this.set(S_DispAttrValue,null);
  }

  public String getDispAttrValue(){
       return DataType.getAsString(this.get(S_DispAttrValue));
  
  }
  public String getDispAttrValueInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DispAttrValue));
      }


 
 }

