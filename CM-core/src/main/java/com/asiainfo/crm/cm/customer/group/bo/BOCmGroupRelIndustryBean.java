package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class BOCmGroupRelIndustryBean extends DataContainer implements DataContainerInterface,IBOCmGroupRelIndustryValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.BOCmGroupRelIndustry";



  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_IndustryId4 = "INDUSTRY_ID_4";
  public final static  String S_IndustryId3 = "INDUSTRY_ID_3";
  public final static  String S_IndustryId = "INDUSTRY_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RelId = "REL_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_Sort = "SORT";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_IndustryId1 = "INDUSTRY_ID_1";
  public final static  String S_IndustryId2 = "INDUSTRY_ID_2";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Action = "ACTION";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmGroupRelIndustryBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   throw new AIException("Cannot reset ObjectType");
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

  public void initIndustryId4(String value){
     this.initProperty(S_IndustryId4,value);
  }
  public  void setIndustryId4(String value){
     this.set(S_IndustryId4,value);
  }
  public  void setIndustryId4Null(){
     this.set(S_IndustryId4,null);
  }

  public String getIndustryId4(){
       return DataType.getAsString(this.get(S_IndustryId4));
  
  }
  public String getIndustryId4InitialValue(){
        return DataType.getAsString(this.getOldObj(S_IndustryId4));
      }

  public void initIndustryId3(String value){
     this.initProperty(S_IndustryId3,value);
  }
  public  void setIndustryId3(String value){
     this.set(S_IndustryId3,value);
  }
  public  void setIndustryId3Null(){
     this.set(S_IndustryId3,null);
  }

  public String getIndustryId3(){
       return DataType.getAsString(this.get(S_IndustryId3));
  
  }
  public String getIndustryId3InitialValue(){
        return DataType.getAsString(this.getOldObj(S_IndustryId3));
      }

  public void initIndustryId(String value){
     this.initProperty(S_IndustryId,value);
  }
  public  void setIndustryId(String value){
     this.set(S_IndustryId,value);
  }
  public  void setIndustryIdNull(){
     this.set(S_IndustryId,null);
  }

  public String getIndustryId(){
       return DataType.getAsString(this.get(S_IndustryId));
  
  }
  public String getIndustryIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IndustryId));
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

  public void initRelId(long value){
     this.initProperty(S_RelId,new Long(value));
  }
  public  void setRelId(long value){
     this.set(S_RelId,new Long(value));
  }
  public  void setRelIdNull(){
     this.set(S_RelId,null);
  }

  public long getRelId(){
        return DataType.getAsLong(this.get(S_RelId));
  
  }
  public long getRelIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelId));
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

  public void initSort(long value){
     this.initProperty(S_Sort,new Long(value));
  }
  public  void setSort(long value){
     this.set(S_Sort,new Long(value));
  }
  public  void setSortNull(){
     this.set(S_Sort,null);
  }

  public long getSort(){
        return DataType.getAsLong(this.get(S_Sort));
  
  }
  public long getSortInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Sort));
      }

  public void initCustId(long value){
     this.initProperty(S_CustId,new Long(value));
  }
  public  void setCustId(long value){
     this.set(S_CustId,new Long(value));
  }
  public  void setCustIdNull(){
     this.set(S_CustId,null);
  }

  public long getCustId(){
        return DataType.getAsLong(this.get(S_CustId));
  
  }
  public long getCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustId));
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

  public void initIndustryId1(String value){
     this.initProperty(S_IndustryId1,value);
  }
  public  void setIndustryId1(String value){
     this.set(S_IndustryId1,value);
  }
  public  void setIndustryId1Null(){
     this.set(S_IndustryId1,null);
  }

  public String getIndustryId1(){
       return DataType.getAsString(this.get(S_IndustryId1));
  
  }
  public String getIndustryId1InitialValue(){
        return DataType.getAsString(this.getOldObj(S_IndustryId1));
      }

  public void initIndustryId2(String value){
     this.initProperty(S_IndustryId2,value);
  }
  public  void setIndustryId2(String value){
     this.set(S_IndustryId2,value);
  }
  public  void setIndustryId2Null(){
     this.set(S_IndustryId2,null);
  }

  public String getIndustryId2(){
       return DataType.getAsString(this.get(S_IndustryId2));
  
  }
  public String getIndustryId2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_IndustryId2));
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

  public void initAction(String value){
     this.initProperty(S_Action,value);
  }
  public  void setAction(String value){
     this.set(S_Action,value);
  }
  public  void setActionNull(){
     this.set(S_Action,null);
  }

  public String getAction(){
       return DataType.getAsString(this.get(S_Action));
  
  }
  public String getActionInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Action));
      }


 
 }

