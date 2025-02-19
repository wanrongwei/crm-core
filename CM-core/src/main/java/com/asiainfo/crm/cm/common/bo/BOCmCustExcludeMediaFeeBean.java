package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCmCustExcludeMediaFeeBean extends DataContainer implements DataContainerInterface,IBOCmCustExcludeMediaFeeValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmCustExcludeMediaFee";



  public final static  String S_RegionCode = "REGION_CODE";
  public final static  String S_LastUpdateDate = "LAST_UPDATE_DATE";
  public final static  String S_Name2 = "NAME2";
  public final static  String S_Name = "NAME";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_City = "CITY";
  public final static  String S_Address = "ADDRESS";
  public final static  String S_ApprovalNumber = "APPROVAL_NUMBER";
  public final static  String S_PostCode = "POST_CODE";
  public final static  String S_CvrNumber = "CVR_NUMBER";
  public final static  String S_Id = "ID";
  public final static  String S_Address2 = "ADDRESS2";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmCustExcludeMediaFeeBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initRegionCode(String value){
     this.initProperty(S_RegionCode,value);
  }
  public  void setRegionCode(String value){
     this.set(S_RegionCode,value);
  }
  public  void setRegionCodeNull(){
     this.set(S_RegionCode,null);
  }

  public String getRegionCode(){
       return DataType.getAsString(this.get(S_RegionCode));
  
  }
  public String getRegionCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RegionCode));
      }

  public void initLastUpdateDate(Timestamp value){
     this.initProperty(S_LastUpdateDate,value);
  }
  public  void setLastUpdateDate(Timestamp value){
     this.set(S_LastUpdateDate,value);
  }
  public  void setLastUpdateDateNull(){
     this.set(S_LastUpdateDate,null);
  }

  public Timestamp getLastUpdateDate(){
        return DataType.getAsDateTime(this.get(S_LastUpdateDate));
  
  }
  public Timestamp getLastUpdateDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_LastUpdateDate));
      }

  public void initName2(String value){
     this.initProperty(S_Name2,value);
  }
  public  void setName2(String value){
     this.set(S_Name2,value);
  }
  public  void setName2Null(){
     this.set(S_Name2,null);
  }

  public String getName2(){
       return DataType.getAsString(this.get(S_Name2));
  
  }
  public String getName2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Name2));
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

  public void initExt1(String value){
     this.initProperty(S_Ext1,value);
  }
  public  void setExt1(String value){
     this.set(S_Ext1,value);
  }
  public  void setExt1Null(){
     this.set(S_Ext1,null);
  }

  public String getExt1(){
       return DataType.getAsString(this.get(S_Ext1));
  
  }
  public String getExt1InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext1));
      }

  public void initExt2(String value){
     this.initProperty(S_Ext2,value);
  }
  public  void setExt2(String value){
     this.set(S_Ext2,value);
  }
  public  void setExt2Null(){
     this.set(S_Ext2,null);
  }

  public String getExt2(){
       return DataType.getAsString(this.get(S_Ext2));
  
  }
  public String getExt2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext2));
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

  public void initExt3(String value){
     this.initProperty(S_Ext3,value);
  }
  public  void setExt3(String value){
     this.set(S_Ext3,value);
  }
  public  void setExt3Null(){
     this.set(S_Ext3,null);
  }

  public String getExt3(){
       return DataType.getAsString(this.get(S_Ext3));
  
  }
  public String getExt3InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext3));
      }

  public void initCity(String value){
     this.initProperty(S_City,value);
  }
  public  void setCity(String value){
     this.set(S_City,value);
  }
  public  void setCityNull(){
     this.set(S_City,null);
  }

  public String getCity(){
       return DataType.getAsString(this.get(S_City));
  
  }
  public String getCityInitialValue(){
        return DataType.getAsString(this.getOldObj(S_City));
      }

  public void initAddress(String value){
     this.initProperty(S_Address,value);
  }
  public  void setAddress(String value){
     this.set(S_Address,value);
  }
  public  void setAddressNull(){
     this.set(S_Address,null);
  }

  public String getAddress(){
       return DataType.getAsString(this.get(S_Address));
  
  }
  public String getAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Address));
      }

  public void initApprovalNumber(String value){
     this.initProperty(S_ApprovalNumber,value);
  }
  public  void setApprovalNumber(String value){
     this.set(S_ApprovalNumber,value);
  }
  public  void setApprovalNumberNull(){
     this.set(S_ApprovalNumber,null);
  }

  public String getApprovalNumber(){
       return DataType.getAsString(this.get(S_ApprovalNumber));
  
  }
  public String getApprovalNumberInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ApprovalNumber));
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

  public void initCvrNumber(String value){
     this.initProperty(S_CvrNumber,value);
  }
  public  void setCvrNumber(String value){
     this.set(S_CvrNumber,value);
  }
  public  void setCvrNumberNull(){
     this.set(S_CvrNumber,null);
  }

  public String getCvrNumber(){
       return DataType.getAsString(this.get(S_CvrNumber));
  
  }
  public String getCvrNumberInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CvrNumber));
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

  public void initAddress2(String value){
     this.initProperty(S_Address2,value);
  }
  public  void setAddress2(String value){
     this.set(S_Address2,value);
  }
  public  void setAddress2Null(){
     this.set(S_Address2,null);
  }

  public String getAddress2(){
       return DataType.getAsString(this.get(S_Address2));
  
  }
  public String getAddress2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Address2));
      }


 
 }

