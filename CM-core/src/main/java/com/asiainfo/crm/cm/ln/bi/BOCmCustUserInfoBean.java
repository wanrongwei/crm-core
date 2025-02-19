package com.asiainfo.crm.cm.ln.bi;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.ln.bi.*;

public class BOCmCustUserInfoBean extends DataContainer implements DataContainerInterface,IBOCmCustUserInfoValue{

  private static String  m_boName = "com.asiainfo.crm.cm.ln.bi.BOCmCustUserInfo";



  public final static  String S_IsToplevelUser = "IS_TOPLEVEL_USER";
  public final static  String S_State = "STATE";
  public final static  String S_InprovDistanceTime = "INPROV_DISTANCE_TIME";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_Arpu = "ARPU";
  public final static  String S_UserRegionId = "USER_REGION_ID";
  public final static  String S_OutprovRoamTime = "OUTPROV_ROAM_TIME";
  public final static  String S_IsGroupUser = "IS_GROUP_USER";
  public final static  String S_EveningCallTime = "EVENING_CALL_TIME";
  public final static  String S_IsFamilyUser = "IS_FAMILY_USER";
  public final static  String S_DataId = "DATA_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_InNetTime = "IN_NET_TIME";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_AfternoonCallTime = "AFTERNOON_CALL_TIME";
  public final static  String S_InternationalTime = "INTERNATIONAL_TIME";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_IsKeyUser = "IS_KEY_USER";
  public final static  String S_InternationalRoamTime = "INTERNATIONAL_ROAM_TIME";
  public final static  String S_NightCallTime = "NIGHT_CALL_TIME";
  public final static  String S_IsReinUser = "IS_REIN_USER";
  public final static  String S_LeaveWaring = "LEAVE_WARING";
  public final static  String S_MorningCallTime = "MORNING_CALL_TIME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_InprovRoamTime = "INPROV_ROAM_TIME";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_IsOpenGprs = "IS_OPEN_GPRS";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmCustUserInfoBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initIsToplevelUser(int value){
     this.initProperty(S_IsToplevelUser,new Integer(value));
  }
  public  void setIsToplevelUser(int value){
     this.set(S_IsToplevelUser,new Integer(value));
  }
  public  void setIsToplevelUserNull(){
     this.set(S_IsToplevelUser,null);
  }

  public int getIsToplevelUser(){
        return DataType.getAsInt(this.get(S_IsToplevelUser));
  
  }
  public int getIsToplevelUserInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsToplevelUser));
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

  public void initInprovDistanceTime(String value){
     this.initProperty(S_InprovDistanceTime,value);
  }
  public  void setInprovDistanceTime(String value){
     this.set(S_InprovDistanceTime,value);
  }
  public  void setInprovDistanceTimeNull(){
     this.set(S_InprovDistanceTime,null);
  }

  public String getInprovDistanceTime(){
       return DataType.getAsString(this.get(S_InprovDistanceTime));
  
  }
  public String getInprovDistanceTimeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_InprovDistanceTime));
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

  public void initArpu(String value){
     this.initProperty(S_Arpu,value);
  }
  public  void setArpu(String value){
     this.set(S_Arpu,value);
  }
  public  void setArpuNull(){
     this.set(S_Arpu,null);
  }

  public String getArpu(){
       return DataType.getAsString(this.get(S_Arpu));
  
  }
  public String getArpuInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Arpu));
      }

  public void initUserRegionId(String value){
     this.initProperty(S_UserRegionId,value);
  }
  public  void setUserRegionId(String value){
     this.set(S_UserRegionId,value);
  }
  public  void setUserRegionIdNull(){
     this.set(S_UserRegionId,null);
  }

  public String getUserRegionId(){
       return DataType.getAsString(this.get(S_UserRegionId));
  
  }
  public String getUserRegionIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_UserRegionId));
      }

  public void initOutprovRoamTime(String value){
     this.initProperty(S_OutprovRoamTime,value);
  }
  public  void setOutprovRoamTime(String value){
     this.set(S_OutprovRoamTime,value);
  }
  public  void setOutprovRoamTimeNull(){
     this.set(S_OutprovRoamTime,null);
  }

  public String getOutprovRoamTime(){
       return DataType.getAsString(this.get(S_OutprovRoamTime));
  
  }
  public String getOutprovRoamTimeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OutprovRoamTime));
      }

  public void initIsGroupUser(int value){
     this.initProperty(S_IsGroupUser,new Integer(value));
  }
  public  void setIsGroupUser(int value){
     this.set(S_IsGroupUser,new Integer(value));
  }
  public  void setIsGroupUserNull(){
     this.set(S_IsGroupUser,null);
  }

  public int getIsGroupUser(){
        return DataType.getAsInt(this.get(S_IsGroupUser));
  
  }
  public int getIsGroupUserInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsGroupUser));
      }

  public void initEveningCallTime(String value){
     this.initProperty(S_EveningCallTime,value);
  }
  public  void setEveningCallTime(String value){
     this.set(S_EveningCallTime,value);
  }
  public  void setEveningCallTimeNull(){
     this.set(S_EveningCallTime,null);
  }

  public String getEveningCallTime(){
       return DataType.getAsString(this.get(S_EveningCallTime));
  
  }
  public String getEveningCallTimeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EveningCallTime));
      }

  public void initIsFamilyUser(int value){
     this.initProperty(S_IsFamilyUser,new Integer(value));
  }
  public  void setIsFamilyUser(int value){
     this.set(S_IsFamilyUser,new Integer(value));
  }
  public  void setIsFamilyUserNull(){
     this.set(S_IsFamilyUser,null);
  }

  public int getIsFamilyUser(){
        return DataType.getAsInt(this.get(S_IsFamilyUser));
  
  }
  public int getIsFamilyUserInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsFamilyUser));
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

  public void initInNetTime(String value){
     this.initProperty(S_InNetTime,value);
  }
  public  void setInNetTime(String value){
     this.set(S_InNetTime,value);
  }
  public  void setInNetTimeNull(){
     this.set(S_InNetTime,null);
  }

  public String getInNetTime(){
       return DataType.getAsString(this.get(S_InNetTime));
  
  }
  public String getInNetTimeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_InNetTime));
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

  public void initAfternoonCallTime(String value){
     this.initProperty(S_AfternoonCallTime,value);
  }
  public  void setAfternoonCallTime(String value){
     this.set(S_AfternoonCallTime,value);
  }
  public  void setAfternoonCallTimeNull(){
     this.set(S_AfternoonCallTime,null);
  }

  public String getAfternoonCallTime(){
       return DataType.getAsString(this.get(S_AfternoonCallTime));
  
  }
  public String getAfternoonCallTimeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AfternoonCallTime));
      }

  public void initInternationalTime(String value){
     this.initProperty(S_InternationalTime,value);
  }
  public  void setInternationalTime(String value){
     this.set(S_InternationalTime,value);
  }
  public  void setInternationalTimeNull(){
     this.set(S_InternationalTime,null);
  }

  public String getInternationalTime(){
       return DataType.getAsString(this.get(S_InternationalTime));
  
  }
  public String getInternationalTimeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_InternationalTime));
      }

  public void initUserId(long value){
     this.initProperty(S_UserId,new Long(value));
  }
  public  void setUserId(long value){
     this.set(S_UserId,new Long(value));
  }
  public  void setUserIdNull(){
     this.set(S_UserId,null);
  }

  public long getUserId(){
        return DataType.getAsLong(this.get(S_UserId));
  
  }
  public long getUserIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_UserId));
      }

  public void initIsKeyUser(int value){
     this.initProperty(S_IsKeyUser,new Integer(value));
  }
  public  void setIsKeyUser(int value){
     this.set(S_IsKeyUser,new Integer(value));
  }
  public  void setIsKeyUserNull(){
     this.set(S_IsKeyUser,null);
  }

  public int getIsKeyUser(){
        return DataType.getAsInt(this.get(S_IsKeyUser));
  
  }
  public int getIsKeyUserInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsKeyUser));
      }

  public void initInternationalRoamTime(String value){
     this.initProperty(S_InternationalRoamTime,value);
  }
  public  void setInternationalRoamTime(String value){
     this.set(S_InternationalRoamTime,value);
  }
  public  void setInternationalRoamTimeNull(){
     this.set(S_InternationalRoamTime,null);
  }

  public String getInternationalRoamTime(){
       return DataType.getAsString(this.get(S_InternationalRoamTime));
  
  }
  public String getInternationalRoamTimeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_InternationalRoamTime));
      }

  public void initNightCallTime(String value){
     this.initProperty(S_NightCallTime,value);
  }
  public  void setNightCallTime(String value){
     this.set(S_NightCallTime,value);
  }
  public  void setNightCallTimeNull(){
     this.set(S_NightCallTime,null);
  }

  public String getNightCallTime(){
       return DataType.getAsString(this.get(S_NightCallTime));
  
  }
  public String getNightCallTimeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_NightCallTime));
      }

  public void initIsReinUser(int value){
     this.initProperty(S_IsReinUser,new Integer(value));
  }
  public  void setIsReinUser(int value){
     this.set(S_IsReinUser,new Integer(value));
  }
  public  void setIsReinUserNull(){
     this.set(S_IsReinUser,null);
  }

  public int getIsReinUser(){
        return DataType.getAsInt(this.get(S_IsReinUser));
  
  }
  public int getIsReinUserInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsReinUser));
      }

  public void initLeaveWaring(String value){
     this.initProperty(S_LeaveWaring,value);
  }
  public  void setLeaveWaring(String value){
     this.set(S_LeaveWaring,value);
  }
  public  void setLeaveWaringNull(){
     this.set(S_LeaveWaring,null);
  }

  public String getLeaveWaring(){
       return DataType.getAsString(this.get(S_LeaveWaring));
  
  }
  public String getLeaveWaringInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LeaveWaring));
      }

  public void initMorningCallTime(String value){
     this.initProperty(S_MorningCallTime,value);
  }
  public  void setMorningCallTime(String value){
     this.set(S_MorningCallTime,value);
  }
  public  void setMorningCallTimeNull(){
     this.set(S_MorningCallTime,null);
  }

  public String getMorningCallTime(){
       return DataType.getAsString(this.get(S_MorningCallTime));
  
  }
  public String getMorningCallTimeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MorningCallTime));
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

  public void initInprovRoamTime(String value){
     this.initProperty(S_InprovRoamTime,value);
  }
  public  void setInprovRoamTime(String value){
     this.set(S_InprovRoamTime,value);
  }
  public  void setInprovRoamTimeNull(){
     this.set(S_InprovRoamTime,null);
  }

  public String getInprovRoamTime(){
       return DataType.getAsString(this.get(S_InprovRoamTime));
  
  }
  public String getInprovRoamTimeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_InprovRoamTime));
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

  public void initIsOpenGprs(int value){
     this.initProperty(S_IsOpenGprs,new Integer(value));
  }
  public  void setIsOpenGprs(int value){
     this.set(S_IsOpenGprs,new Integer(value));
  }
  public  void setIsOpenGprsNull(){
     this.set(S_IsOpenGprs,null);
  }

  public int getIsOpenGprs(){
        return DataType.getAsInt(this.get(S_IsOpenGprs));
  
  }
  public int getIsOpenGprsInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsOpenGprs));
      }


 
 }

