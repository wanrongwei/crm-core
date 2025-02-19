package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCustManagerTeamBean extends DataContainer implements DataContainerInterface,IBOCustManagerTeamValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCustManagerTeam";



  public final static  String S_State = "STATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ParentTeamId = "PARENT_TEAM_ID";
  public final static  String S_RegionCode = "REGION_CODE";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_TeamName = "TEAM_NAME";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_TeamId = "TEAM_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionDetail = "REGION_DETAIL";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCustManagerTeamBean() throws AIException{
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

  public void initParentTeamId(long value){
     this.initProperty(S_ParentTeamId,new Long(value));
  }
  public  void setParentTeamId(long value){
     this.set(S_ParentTeamId,new Long(value));
  }
  public  void setParentTeamIdNull(){
     this.set(S_ParentTeamId,null);
  }

  public long getParentTeamId(){
        return DataType.getAsLong(this.get(S_ParentTeamId));
  
  }
  public long getParentTeamIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ParentTeamId));
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

  public void initProvinceId(long value){
     this.initProperty(S_ProvinceId,new Long(value));
  }
  public  void setProvinceId(long value){
     this.set(S_ProvinceId,new Long(value));
  }
  public  void setProvinceIdNull(){
     this.set(S_ProvinceId,null);
  }

  public long getProvinceId(){
        return DataType.getAsLong(this.get(S_ProvinceId));
  
  }
  public long getProvinceIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ProvinceId));
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

  public void initTeamName(String value){
     this.initProperty(S_TeamName,value);
  }
  public  void setTeamName(String value){
     this.set(S_TeamName,value);
  }
  public  void setTeamNameNull(){
     this.set(S_TeamName,null);
  }

  public String getTeamName(){
       return DataType.getAsString(this.get(S_TeamName));
  
  }
  public String getTeamNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TeamName));
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

  public void initTeamId(long value){
     this.initProperty(S_TeamId,new Long(value));
  }
  public  void setTeamId(long value){
     this.set(S_TeamId,new Long(value));
  }
  public  void setTeamIdNull(){
     this.set(S_TeamId,null);
  }

  public long getTeamId(){
        return DataType.getAsLong(this.get(S_TeamId));
  
  }
  public long getTeamIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_TeamId));
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

  public void initRegionDetail(long value){
     this.initProperty(S_RegionDetail,new Long(value));
  }
  public  void setRegionDetail(long value){
     this.set(S_RegionDetail,new Long(value));
  }
  public  void setRegionDetailNull(){
     this.set(S_RegionDetail,null);
  }

  public long getRegionDetail(){
        return DataType.getAsLong(this.get(S_RegionDetail));
  
  }
  public long getRegionDetailInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RegionDetail));
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


 
 }

