package com.asiainfo.crm.common.bo;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.*;
import com.asiainfo.crm.common.ivalues.IBOBsCommonDistrictValue;

public class BOBsCommonDistrictBean extends DataContainer implements DataContainerInterface, IBOBsCommonDistrictValue {

  private static String  m_boName = "com.asiainfo.crm.common.bo.BOBsCommonDistrict";



  public final static  String S_DistrictDesc = "DISTRICT_DESC";
  public final static  String S_State = "STATE";
  public final static  String S_ParentDistrictId = "PARENT_DISTRICT_ID";
  public final static  String S_SortId = "SORT_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_DistrictType = "DISTRICT_TYPE";
  public final static  String S_DistrictId = "DISTRICT_ID";
  public final static  String S_PostCode = "POST_CODE";
  public final static  String S_AreaCode = "AREA_CODE";
  public final static  String S_DistrictName = "DISTRICT_NAME";
  public final static  String S_DistrictCode = "DISTRICT_CODE";
  public final static  String S_DistrictEnglishName = "DISTRICT_ENGLISH_NAME";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOBsCommonDistrictBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initDistrictDesc(String value){
     this.initProperty(S_DistrictDesc,value);
  }
  public  void setDistrictDesc(String value){
     this.set(S_DistrictDesc,value);
  }
  public  void setDistrictDescNull(){
     this.set(S_DistrictDesc,null);
  }

  public String getDistrictDesc(){
       return DataType.getAsString(this.get(S_DistrictDesc));
  
  }
  public String getDistrictDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DistrictDesc));
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

  public void initParentDistrictId(long value){
     this.initProperty(S_ParentDistrictId,new Long(value));
  }
  public  void setParentDistrictId(long value){
     this.set(S_ParentDistrictId,new Long(value));
  }
  public  void setParentDistrictIdNull(){
     this.set(S_ParentDistrictId,null);
  }

  public long getParentDistrictId(){
        return DataType.getAsLong(this.get(S_ParentDistrictId));
  
  }
  public long getParentDistrictIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ParentDistrictId));
      }

  public void initSortId(long value){
     this.initProperty(S_SortId,new Long(value));
  }
  public  void setSortId(long value){
     this.set(S_SortId,new Long(value));
  }
  public  void setSortIdNull(){
     this.set(S_SortId,null);
  }

  public long getSortId(){
        return DataType.getAsLong(this.get(S_SortId));
  
  }
  public long getSortIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SortId));
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

  public void initDistrictType(int value){
     this.initProperty(S_DistrictType,new Integer(value));
  }
  public  void setDistrictType(int value){
     this.set(S_DistrictType,new Integer(value));
  }
  public  void setDistrictTypeNull(){
     this.set(S_DistrictType,null);
  }

  public int getDistrictType(){
        return DataType.getAsInt(this.get(S_DistrictType));
  
  }
  public int getDistrictTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_DistrictType));
      }

  public void initDistrictId(long value){
     this.initProperty(S_DistrictId,new Long(value));
  }
  public  void setDistrictId(long value){
     this.set(S_DistrictId,new Long(value));
  }
  public  void setDistrictIdNull(){
     this.set(S_DistrictId,null);
  }

  public long getDistrictId(){
        return DataType.getAsLong(this.get(S_DistrictId));
  
  }
  public long getDistrictIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DistrictId));
      }

  public void initPostCode(String value){
     this.initProperty(S_PostCode,value);
  }
  public  void setPostCode(String value){
     this.set(S_PostCode,value);
  }
  public  void setPostCodeNull(){
     this.set(S_PostCode,null);
  }

  public String getPostCode(){
       return DataType.getAsString(this.get(S_PostCode));
  
  }
  public String getPostCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PostCode));
      }

  public void initAreaCode(String value){
     this.initProperty(S_AreaCode,value);
  }
  public  void setAreaCode(String value){
     this.set(S_AreaCode,value);
  }
  public  void setAreaCodeNull(){
     this.set(S_AreaCode,null);
  }

  public String getAreaCode(){
       return DataType.getAsString(this.get(S_AreaCode));
  
  }
  public String getAreaCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AreaCode));
      }

  public void initDistrictName(String value){
     this.initProperty(S_DistrictName,value);
  }
  public  void setDistrictName(String value){
     this.set(S_DistrictName,value);
  }
  public  void setDistrictNameNull(){
     this.set(S_DistrictName,null);
  }

  public String getDistrictName(){
       return DataType.getAsString(this.get(S_DistrictName));
  
  }
  public String getDistrictNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DistrictName));
      }

  public void initDistrictCode(String value){
     this.initProperty(S_DistrictCode,value);
  }
  public  void setDistrictCode(String value){
     this.set(S_DistrictCode,value);
  }
  public  void setDistrictCodeNull(){
     this.set(S_DistrictCode,null);
  }

  public String getDistrictCode(){
       return DataType.getAsString(this.get(S_DistrictCode));
  
  }
  public String getDistrictCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DistrictCode));
      }

  public void initDistrictEnglishName(String value){
     this.initProperty(S_DistrictEnglishName,value);
  }
  public  void setDistrictEnglishName(String value){
     this.set(S_DistrictEnglishName,value);
  }
  public  void setDistrictEnglishNameNull(){
     this.set(S_DistrictEnglishName,null);
  }

  public String getDistrictEnglishName(){
       return DataType.getAsString(this.get(S_DistrictEnglishName));
  
  }
  public String getDistrictEnglishNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DistrictEnglishName));
      }


 
 }

