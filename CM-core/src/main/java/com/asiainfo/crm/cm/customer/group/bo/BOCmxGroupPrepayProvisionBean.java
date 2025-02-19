package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class BOCmxGroupPrepayProvisionBean extends DataContainer implements DataContainerInterface,IBOCmxGroupPrepayProvisionValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.BOCmxGroupPrepayProvision";



  public final static  String S_BegDate = "BEG_DATE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_CurDiscount = "CUR_DISCOUNT";
  public final static  String S_BusiCode = "BUSI_CODE";
  public final static  String S_EndDate = "END_DATE";
  public final static  String S_ProvisionId = "PROVISION_ID";
  public final static  String S_GroupCountyId = "GROUP_COUNTY_ID";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_CurFee = "CUR_FEE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_UpFee = "UP_FEE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_GroupName = "GROUP_NAME";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_GroupRegionId = "GROUP_REGION_ID";
  public final static  String S_Notes = "NOTES";
  public final static  String S_ProStatus = "PRO_STATUS";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmxGroupPrepayProvisionBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initBegDate(Timestamp value){
     this.initProperty(S_BegDate,value);
  }
  public  void setBegDate(Timestamp value){
     this.set(S_BegDate,value);
  }
  public  void setBegDateNull(){
     this.set(S_BegDate,null);
  }

  public Timestamp getBegDate(){
        return DataType.getAsDateTime(this.get(S_BegDate));
  
  }
  public Timestamp getBegDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_BegDate));
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

  public void initCurDiscount(long value){
     this.initProperty(S_CurDiscount,new Long(value));
  }
  public  void setCurDiscount(long value){
     this.set(S_CurDiscount,new Long(value));
  }
  public  void setCurDiscountNull(){
     this.set(S_CurDiscount,null);
  }

  public long getCurDiscount(){
        return DataType.getAsLong(this.get(S_CurDiscount));
  
  }
  public long getCurDiscountInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CurDiscount));
      }

  public void initBusiCode(String value){
     this.initProperty(S_BusiCode,value);
  }
  public  void setBusiCode(String value){
     this.set(S_BusiCode,value);
  }
  public  void setBusiCodeNull(){
     this.set(S_BusiCode,null);
  }

  public String getBusiCode(){
       return DataType.getAsString(this.get(S_BusiCode));
  
  }
  public String getBusiCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BusiCode));
      }

  public void initEndDate(Timestamp value){
     this.initProperty(S_EndDate,value);
  }
  public  void setEndDate(Timestamp value){
     this.set(S_EndDate,value);
  }
  public  void setEndDateNull(){
     this.set(S_EndDate,null);
  }

  public Timestamp getEndDate(){
        return DataType.getAsDateTime(this.get(S_EndDate));
  
  }
  public Timestamp getEndDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_EndDate));
      }

  public void initProvisionId(long value){
     this.initProperty(S_ProvisionId,new Long(value));
  }
  public  void setProvisionId(long value){
     this.set(S_ProvisionId,new Long(value));
  }
  public  void setProvisionIdNull(){
     this.set(S_ProvisionId,null);
  }

  public long getProvisionId(){
        return DataType.getAsLong(this.get(S_ProvisionId));
  
  }
  public long getProvisionIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ProvisionId));
      }

  public void initGroupCountyId(String value){
     this.initProperty(S_GroupCountyId,value);
  }
  public  void setGroupCountyId(String value){
     this.set(S_GroupCountyId,value);
  }
  public  void setGroupCountyIdNull(){
     this.set(S_GroupCountyId,null);
  }

  public String getGroupCountyId(){
       return DataType.getAsString(this.get(S_GroupCountyId));
  
  }
  public String getGroupCountyIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupCountyId));
      }

  public void initGroupCustId(long value){
     this.initProperty(S_GroupCustId,new Long(value));
  }
  public  void setGroupCustId(long value){
     this.set(S_GroupCustId,new Long(value));
  }
  public  void setGroupCustIdNull(){
     this.set(S_GroupCustId,null);
  }

  public long getGroupCustId(){
        return DataType.getAsLong(this.get(S_GroupCustId));
  
  }
  public long getGroupCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupCustId));
      }

  public void initCurFee(long value){
     this.initProperty(S_CurFee,new Long(value));
  }
  public  void setCurFee(long value){
     this.set(S_CurFee,new Long(value));
  }
  public  void setCurFeeNull(){
     this.set(S_CurFee,null);
  }

  public long getCurFee(){
        return DataType.getAsLong(this.get(S_CurFee));
  
  }
  public long getCurFeeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CurFee));
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

  public void initUpFee(long value){
     this.initProperty(S_UpFee,new Long(value));
  }
  public  void setUpFee(long value){
     this.set(S_UpFee,new Long(value));
  }
  public  void setUpFeeNull(){
     this.set(S_UpFee,null);
  }

  public long getUpFee(){
        return DataType.getAsLong(this.get(S_UpFee));
  
  }
  public long getUpFeeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_UpFee));
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

  public void initGroupName(String value){
     this.initProperty(S_GroupName,value);
  }
  public  void setGroupName(String value){
     this.set(S_GroupName,value);
  }
  public  void setGroupNameNull(){
     this.set(S_GroupName,null);
  }

  public String getGroupName(){
       return DataType.getAsString(this.get(S_GroupName));
  
  }
  public String getGroupNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupName));
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

  public void initGroupRegionId(String value){
     this.initProperty(S_GroupRegionId,value);
  }
  public  void setGroupRegionId(String value){
     this.set(S_GroupRegionId,value);
  }
  public  void setGroupRegionIdNull(){
     this.set(S_GroupRegionId,null);
  }

  public String getGroupRegionId(){
       return DataType.getAsString(this.get(S_GroupRegionId));
  
  }
  public String getGroupRegionIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupRegionId));
      }

  public void initNotes(String value){
     this.initProperty(S_Notes,value);
  }
  public  void setNotes(String value){
     this.set(S_Notes,value);
  }
  public  void setNotesNull(){
     this.set(S_Notes,null);
  }

  public String getNotes(){
       return DataType.getAsString(this.get(S_Notes));
  
  }
  public String getNotesInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Notes));
      }

  public void initProStatus(int value){
     this.initProperty(S_ProStatus,new Integer(value));
  }
  public  void setProStatus(int value){
     this.set(S_ProStatus,new Integer(value));
  }
  public  void setProStatusNull(){
     this.set(S_ProStatus,null);
  }

  public int getProStatus(){
        return DataType.getAsInt(this.get(S_ProStatus));
  
  }
  public int getProStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ProStatus));
      }


 
 }

