package com.asiainfo.crm.cm.bi2oneframe.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.bi2oneframe.ivalues.*;

public class BOCmUserChnnHobbyBean extends DataContainer implements DataContainerInterface,IBOCmUserChnnHobbyValue{

  private static String  m_boName = "com.asiainfo.crm.cm.bi2oneframe.bo.BOCmUserChnnHobby";



  public final static  String S_CallTimes = "CALL_TIMES";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_WebOnlineTimes = "WEB_ONLINE_TIMES";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ChangelCallTimes = "CHANGEL_CALL_TIMES";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_SmChannelTimes = "SM_CHANNEL_TIMES";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_IvrChannelTimes = "IVR_CHANNEL_TIMES";
  public final static  String S_CreateVestDepartement = "CREATE_VEST_DEPARTEMENT";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DataId = "DATA_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmUserChnnHobbyBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initCallTimes(long value){
     this.initProperty(S_CallTimes,new Long(value));
  }
  public  void setCallTimes(long value){
     this.set(S_CallTimes,new Long(value));
  }
  public  void setCallTimesNull(){
     this.set(S_CallTimes,null);
  }

  public long getCallTimes(){
        return DataType.getAsLong(this.get(S_CallTimes));
  
  }
  public long getCallTimesInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CallTimes));
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

  public void initWebOnlineTimes(long value){
     this.initProperty(S_WebOnlineTimes,new Long(value));
  }
  public  void setWebOnlineTimes(long value){
     this.set(S_WebOnlineTimes,new Long(value));
  }
  public  void setWebOnlineTimesNull(){
     this.set(S_WebOnlineTimes,null);
  }

  public long getWebOnlineTimes(){
        return DataType.getAsLong(this.get(S_WebOnlineTimes));
  
  }
  public long getWebOnlineTimesInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_WebOnlineTimes));
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

  public void initChangelCallTimes(long value){
     this.initProperty(S_ChangelCallTimes,new Long(value));
  }
  public  void setChangelCallTimes(long value){
     this.set(S_ChangelCallTimes,new Long(value));
  }
  public  void setChangelCallTimesNull(){
     this.set(S_ChangelCallTimes,null);
  }

  public long getChangelCallTimes(){
        return DataType.getAsLong(this.get(S_ChangelCallTimes));
  
  }
  public long getChangelCallTimesInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ChangelCallTimes));
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

  public void initSmChannelTimes(long value){
     this.initProperty(S_SmChannelTimes,new Long(value));
  }
  public  void setSmChannelTimes(long value){
     this.set(S_SmChannelTimes,new Long(value));
  }
  public  void setSmChannelTimesNull(){
     this.set(S_SmChannelTimes,null);
  }

  public long getSmChannelTimes(){
        return DataType.getAsLong(this.get(S_SmChannelTimes));
  
  }
  public long getSmChannelTimesInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SmChannelTimes));
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

  public void initIvrChannelTimes(long value){
     this.initProperty(S_IvrChannelTimes,new Long(value));
  }
  public  void setIvrChannelTimes(long value){
     this.set(S_IvrChannelTimes,new Long(value));
  }
  public  void setIvrChannelTimesNull(){
     this.set(S_IvrChannelTimes,null);
  }

  public long getIvrChannelTimes(){
        return DataType.getAsLong(this.get(S_IvrChannelTimes));
  
  }
  public long getIvrChannelTimesInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IvrChannelTimes));
      }

  public void initCreateVestDepartement(String value){
     this.initProperty(S_CreateVestDepartement,value);
  }
  public  void setCreateVestDepartement(String value){
     this.set(S_CreateVestDepartement,value);
  }
  public  void setCreateVestDepartementNull(){
     this.set(S_CreateVestDepartement,null);
  }

  public String getCreateVestDepartement(){
       return DataType.getAsString(this.get(S_CreateVestDepartement));
  
  }
  public String getCreateVestDepartementInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CreateVestDepartement));
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

  public void initDataId(long value){
     this.initProperty(S_DataId,new Long(value));
  }
  public  void setDataId(long value){
     this.set(S_DataId,new Long(value));
  }
  public  void setDataIdNull(){
     this.set(S_DataId,null);
  }

  public long getDataId(){
        return DataType.getAsLong(this.get(S_DataId));
  
  }
  public long getDataIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DataId));
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

  public void initBillId(String value){
     this.initProperty(S_BillId,value);
  }
  public  void setBillId(String value){
     this.set(S_BillId,value);
  }
  public  void setBillIdNull(){
     this.set(S_BillId,null);
  }

  public String getBillId(){
       return DataType.getAsString(this.get(S_BillId));
  
  }
  public String getBillIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BillId));
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


 
 }

