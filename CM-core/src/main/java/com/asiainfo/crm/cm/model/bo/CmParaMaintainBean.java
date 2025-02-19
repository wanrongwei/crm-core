package com.asiainfo.crm.cm.model.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.model.ivalues.*;

public class CmParaMaintainBean extends DataContainer implements DataContainerInterface,ICmParaMaintainValue{

  private static String  m_boName = "com.asiainfo.crm.cm.model.bo.CmParaMaintain";



  public final static  String S_Linker = "LINKER";
  public final static  String S_State = "STATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_MaintainOrgId = "MAINTAIN_ORG_ID";
  public final static  String S_RegionCode = "REGION_CODE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_Fax = "FAX";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Phone = "PHONE";
  public final static  String S_Email = "EMAIL";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_FactoryType = "FACTORY_TYPE";
  public final static  String S_Description = "DESCRIPTION";
  public final static  String S_MiantainName = "MIANTAIN_NAME";
  public final static  String S_FactoryId = "FACTORY_ID";
  public final static  String S_Address = "ADDRESS";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public CmParaMaintainBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initLinker(String value){
     this.initProperty(S_Linker,value);
  }
  public  void setLinker(String value){
     this.set(S_Linker,value);
  }
  public  void setLinkerNull(){
     this.set(S_Linker,null);
  }

  public String getLinker(){
       return DataType.getAsString(this.get(S_Linker));
  
  }
  public String getLinkerInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Linker));
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

  public void initCreateOpId(long value){
     this.initProperty(S_CreateOpId,new Long(value));
  }
  public  void setCreateOpId(long value){
     this.set(S_CreateOpId,new Long(value));
  }
  public  void setCreateOpIdNull(){
     this.set(S_CreateOpId,null);
  }

  public long getCreateOpId(){
        return DataType.getAsLong(this.get(S_CreateOpId));
  
  }
  public long getCreateOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CreateOpId));
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

  public void initMaintainOrgId(long value){
     this.initProperty(S_MaintainOrgId,new Long(value));
  }
  public  void setMaintainOrgId(long value){
     this.set(S_MaintainOrgId,new Long(value));
  }
  public  void setMaintainOrgIdNull(){
     this.set(S_MaintainOrgId,null);
  }

  public long getMaintainOrgId(){
        return DataType.getAsLong(this.get(S_MaintainOrgId));
  
  }
  public long getMaintainOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MaintainOrgId));
      }

  public void initRegionCode(int value){
     this.initProperty(S_RegionCode,new Integer(value));
  }
  public  void setRegionCode(int value){
     this.set(S_RegionCode,new Integer(value));
  }
  public  void setRegionCodeNull(){
     this.set(S_RegionCode,null);
  }

  public int getRegionCode(){
        return DataType.getAsInt(this.get(S_RegionCode));
  
  }
  public int getRegionCodeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_RegionCode));
      }

  public void initDoneDate(Timestamp value){
     this.initProperty(S_DoneDate,value);
  }
  public  void setDoneDate(Timestamp value){
     this.set(S_DoneDate,value);
  }
  public  void setDoneDateNull(){
     this.set(S_DoneDate,null);
  }

  public Timestamp getDoneDate(){
        return DataType.getAsDateTime(this.get(S_DoneDate));
  
  }
  public Timestamp getDoneDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_DoneDate));
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

  public void initOrgId(long value){
     this.initProperty(S_OrgId,new Long(value));
  }
  public  void setOrgId(long value){
     this.set(S_OrgId,new Long(value));
  }
  public  void setOrgIdNull(){
     this.set(S_OrgId,null);
  }

  public long getOrgId(){
        return DataType.getAsLong(this.get(S_OrgId));
  
  }
  public long getOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OrgId));
      }

  public void initFax(String value){
     this.initProperty(S_Fax,value);
  }
  public  void setFax(String value){
     this.set(S_Fax,value);
  }
  public  void setFaxNull(){
     this.set(S_Fax,null);
  }

  public String getFax(){
       return DataType.getAsString(this.get(S_Fax));
  
  }
  public String getFaxInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Fax));
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

  public void initDoneCode(long value){
     this.initProperty(S_DoneCode,new Long(value));
  }
  public  void setDoneCode(long value){
     this.set(S_DoneCode,new Long(value));
  }
  public  void setDoneCodeNull(){
     this.set(S_DoneCode,null);
  }

  public long getDoneCode(){
        return DataType.getAsLong(this.get(S_DoneCode));
  
  }
  public long getDoneCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DoneCode));
      }

  public void initPhone(String value){
     this.initProperty(S_Phone,value);
  }
  public  void setPhone(String value){
     this.set(S_Phone,value);
  }
  public  void setPhoneNull(){
     this.set(S_Phone,null);
  }

  public String getPhone(){
       return DataType.getAsString(this.get(S_Phone));
  
  }
  public String getPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Phone));
      }

  public void initEmail(String value){
     this.initProperty(S_Email,value);
  }
  public  void setEmail(String value){
     this.set(S_Email,value);
  }
  public  void setEmailNull(){
     this.set(S_Email,null);
  }

  public String getEmail(){
       return DataType.getAsString(this.get(S_Email));
  
  }
  public String getEmailInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Email));
      }

  public void initCountyCode(int value){
     this.initProperty(S_CountyCode,new Integer(value));
  }
  public  void setCountyCode(int value){
     this.set(S_CountyCode,new Integer(value));
  }
  public  void setCountyCodeNull(){
     this.set(S_CountyCode,null);
  }

  public int getCountyCode(){
        return DataType.getAsInt(this.get(S_CountyCode));
  
  }
  public int getCountyCodeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CountyCode));
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

  public void initCreateOrgId(long value){
     this.initProperty(S_CreateOrgId,new Long(value));
  }
  public  void setCreateOrgId(long value){
     this.set(S_CreateOrgId,new Long(value));
  }
  public  void setCreateOrgIdNull(){
     this.set(S_CreateOrgId,null);
  }

  public long getCreateOrgId(){
        return DataType.getAsLong(this.get(S_CreateOrgId));
  
  }
  public long getCreateOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CreateOrgId));
      }

  public void initFactoryType(int value){
     this.initProperty(S_FactoryType,new Integer(value));
  }
  public  void setFactoryType(int value){
     this.set(S_FactoryType,new Integer(value));
  }
  public  void setFactoryTypeNull(){
     this.set(S_FactoryType,null);
  }

  public int getFactoryType(){
        return DataType.getAsInt(this.get(S_FactoryType));
  
  }
  public int getFactoryTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_FactoryType));
      }

  public void initDescription(String value){
     this.initProperty(S_Description,value);
  }
  public  void setDescription(String value){
     this.set(S_Description,value);
  }
  public  void setDescriptionNull(){
     this.set(S_Description,null);
  }

  public String getDescription(){
       return DataType.getAsString(this.get(S_Description));
  
  }
  public String getDescriptionInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Description));
      }

  public void initMiantainName(String value){
     this.initProperty(S_MiantainName,value);
  }
  public  void setMiantainName(String value){
     this.set(S_MiantainName,value);
  }
  public  void setMiantainNameNull(){
     this.set(S_MiantainName,null);
  }

  public String getMiantainName(){
       return DataType.getAsString(this.get(S_MiantainName));
  
  }
  public String getMiantainNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MiantainName));
      }

  public void initFactoryId(long value){
     this.initProperty(S_FactoryId,new Long(value));
  }
  public  void setFactoryId(long value){
     this.set(S_FactoryId,new Long(value));
  }
  public  void setFactoryIdNull(){
     this.set(S_FactoryId,null);
  }

  public long getFactoryId(){
        return DataType.getAsLong(this.get(S_FactoryId));
  
  }
  public long getFactoryIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_FactoryId));
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


 
 }

