package com.asiainfo.crm.cm.bi2oneframe.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.bi2oneframe.ivalues.*;

public class BOCmSceneMarketingBean extends DataContainer implements DataContainerInterface,IBOCmSceneMarketingValue{

  private static String  m_boName = "com.asiainfo.crm.cm.bi2oneframe.bo.BOCmSceneMarketing";



  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ThreeMonVoiceFee = "THREE_MON_VOICE_FEE";
  public final static  String S_LastMonSmFee = "LAST_MON_SM_FEE";
  public final static  String S_LastMonWlanFee = "LAST_MON_WLAN_FEE";
  public final static  String S_LastMonGprsFee = "LAST_MON_GPRS_FEE";
  public final static  String S_LastMonGprsFlux = "LAST_MON_GPRS_FLUX";
  public final static  String S_DataId = "DATA_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ThreeMonCallTime = "THREE_MON_CALL_TIME";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ThreeMonGprsFlux = "THREE_MON_GPRS_FLUX";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_LastMonCallTime = "LAST_MON_CALL_TIME";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_LastMonMou = "LAST_MON_MOU";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_LastMonCallFee = "LAST_MON_CALL_FEE";
  public final static  String S_LastMonRoamingFee = "LAST_MON_ROAMING_FEE";
  public final static  String S_LastMonWlanFlux = "LAST_MON_WLAN_FLUX";
  public final static  String S_LastMonArpu = "LAST_MON_ARPU";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ThreeMonSmFee = "THREE_MON_SM_FEE";
  public final static  String S_LastMonSmFeeNum = "LAST_MON_SM_FEE_NUM";
  public final static  String S_LastMonFeeFlux = "LAST_MON_FEE_FLUX";
  public final static  String S_CreateVestDepartement = "CREATE_VEST_DEPARTEMENT";
  public final static  String S_LastMonSmNum = "LAST_MON_SM_NUM";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ThreeMonSmNum = "THREE_MON_SM_NUM";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmSceneMarketingBean() throws AIException{
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

  public void initThreeMonVoiceFee(long value){
     this.initProperty(S_ThreeMonVoiceFee,new Long(value));
  }
  public  void setThreeMonVoiceFee(long value){
     this.set(S_ThreeMonVoiceFee,new Long(value));
  }
  public  void setThreeMonVoiceFeeNull(){
     this.set(S_ThreeMonVoiceFee,null);
  }

  public long getThreeMonVoiceFee(){
        return DataType.getAsLong(this.get(S_ThreeMonVoiceFee));
  
  }
  public long getThreeMonVoiceFeeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ThreeMonVoiceFee));
      }

  public void initLastMonSmFee(long value){
     this.initProperty(S_LastMonSmFee,new Long(value));
  }
  public  void setLastMonSmFee(long value){
     this.set(S_LastMonSmFee,new Long(value));
  }
  public  void setLastMonSmFeeNull(){
     this.set(S_LastMonSmFee,null);
  }

  public long getLastMonSmFee(){
        return DataType.getAsLong(this.get(S_LastMonSmFee));
  
  }
  public long getLastMonSmFeeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LastMonSmFee));
      }

  public void initLastMonWlanFee(long value){
     this.initProperty(S_LastMonWlanFee,new Long(value));
  }
  public  void setLastMonWlanFee(long value){
     this.set(S_LastMonWlanFee,new Long(value));
  }
  public  void setLastMonWlanFeeNull(){
     this.set(S_LastMonWlanFee,null);
  }

  public long getLastMonWlanFee(){
        return DataType.getAsLong(this.get(S_LastMonWlanFee));
  
  }
  public long getLastMonWlanFeeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LastMonWlanFee));
      }

  public void initLastMonGprsFee(long value){
     this.initProperty(S_LastMonGprsFee,new Long(value));
  }
  public  void setLastMonGprsFee(long value){
     this.set(S_LastMonGprsFee,new Long(value));
  }
  public  void setLastMonGprsFeeNull(){
     this.set(S_LastMonGprsFee,null);
  }

  public long getLastMonGprsFee(){
        return DataType.getAsLong(this.get(S_LastMonGprsFee));
  
  }
  public long getLastMonGprsFeeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LastMonGprsFee));
      }

  public void initLastMonGprsFlux(long value){
     this.initProperty(S_LastMonGprsFlux,new Long(value));
  }
  public  void setLastMonGprsFlux(long value){
     this.set(S_LastMonGprsFlux,new Long(value));
  }
  public  void setLastMonGprsFluxNull(){
     this.set(S_LastMonGprsFlux,null);
  }

  public long getLastMonGprsFlux(){
        return DataType.getAsLong(this.get(S_LastMonGprsFlux));
  
  }
  public long getLastMonGprsFluxInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LastMonGprsFlux));
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

  public void initThreeMonCallTime(long value){
     this.initProperty(S_ThreeMonCallTime,new Long(value));
  }
  public  void setThreeMonCallTime(long value){
     this.set(S_ThreeMonCallTime,new Long(value));
  }
  public  void setThreeMonCallTimeNull(){
     this.set(S_ThreeMonCallTime,null);
  }

  public long getThreeMonCallTime(){
        return DataType.getAsLong(this.get(S_ThreeMonCallTime));
  
  }
  public long getThreeMonCallTimeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ThreeMonCallTime));
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

  public void initThreeMonGprsFlux(long value){
     this.initProperty(S_ThreeMonGprsFlux,new Long(value));
  }
  public  void setThreeMonGprsFlux(long value){
     this.set(S_ThreeMonGprsFlux,new Long(value));
  }
  public  void setThreeMonGprsFluxNull(){
     this.set(S_ThreeMonGprsFlux,null);
  }

  public long getThreeMonGprsFlux(){
        return DataType.getAsLong(this.get(S_ThreeMonGprsFlux));
  
  }
  public long getThreeMonGprsFluxInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ThreeMonGprsFlux));
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

  public void initLastMonCallTime(long value){
     this.initProperty(S_LastMonCallTime,new Long(value));
  }
  public  void setLastMonCallTime(long value){
     this.set(S_LastMonCallTime,new Long(value));
  }
  public  void setLastMonCallTimeNull(){
     this.set(S_LastMonCallTime,null);
  }

  public long getLastMonCallTime(){
        return DataType.getAsLong(this.get(S_LastMonCallTime));
  
  }
  public long getLastMonCallTimeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LastMonCallTime));
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

  public void initLastMonMou(long value){
     this.initProperty(S_LastMonMou,new Long(value));
  }
  public  void setLastMonMou(long value){
     this.set(S_LastMonMou,new Long(value));
  }
  public  void setLastMonMouNull(){
     this.set(S_LastMonMou,null);
  }

  public long getLastMonMou(){
        return DataType.getAsLong(this.get(S_LastMonMou));
  
  }
  public long getLastMonMouInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LastMonMou));
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

  public void initLastMonCallFee(long value){
     this.initProperty(S_LastMonCallFee,new Long(value));
  }
  public  void setLastMonCallFee(long value){
     this.set(S_LastMonCallFee,new Long(value));
  }
  public  void setLastMonCallFeeNull(){
     this.set(S_LastMonCallFee,null);
  }

  public long getLastMonCallFee(){
        return DataType.getAsLong(this.get(S_LastMonCallFee));
  
  }
  public long getLastMonCallFeeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LastMonCallFee));
      }

  public void initLastMonRoamingFee(long value){
     this.initProperty(S_LastMonRoamingFee,new Long(value));
  }
  public  void setLastMonRoamingFee(long value){
     this.set(S_LastMonRoamingFee,new Long(value));
  }
  public  void setLastMonRoamingFeeNull(){
     this.set(S_LastMonRoamingFee,null);
  }

  public long getLastMonRoamingFee(){
        return DataType.getAsLong(this.get(S_LastMonRoamingFee));
  
  }
  public long getLastMonRoamingFeeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LastMonRoamingFee));
      }

  public void initLastMonWlanFlux(long value){
     this.initProperty(S_LastMonWlanFlux,new Long(value));
  }
  public  void setLastMonWlanFlux(long value){
     this.set(S_LastMonWlanFlux,new Long(value));
  }
  public  void setLastMonWlanFluxNull(){
     this.set(S_LastMonWlanFlux,null);
  }

  public long getLastMonWlanFlux(){
        return DataType.getAsLong(this.get(S_LastMonWlanFlux));
  
  }
  public long getLastMonWlanFluxInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LastMonWlanFlux));
      }

  public void initLastMonArpu(String value){
     this.initProperty(S_LastMonArpu,value);
  }
  public  void setLastMonArpu(String value){
     this.set(S_LastMonArpu,value);
  }
  public  void setLastMonArpuNull(){
     this.set(S_LastMonArpu,null);
  }

  public String getLastMonArpu(){
       return DataType.getAsString(this.get(S_LastMonArpu));
  
  }
  public String getLastMonArpuInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LastMonArpu));
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

  public void initThreeMonSmFee(long value){
     this.initProperty(S_ThreeMonSmFee,new Long(value));
  }
  public  void setThreeMonSmFee(long value){
     this.set(S_ThreeMonSmFee,new Long(value));
  }
  public  void setThreeMonSmFeeNull(){
     this.set(S_ThreeMonSmFee,null);
  }

  public long getThreeMonSmFee(){
        return DataType.getAsLong(this.get(S_ThreeMonSmFee));
  
  }
  public long getThreeMonSmFeeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ThreeMonSmFee));
      }

  public void initLastMonSmFeeNum(long value){
     this.initProperty(S_LastMonSmFeeNum,new Long(value));
  }
  public  void setLastMonSmFeeNum(long value){
     this.set(S_LastMonSmFeeNum,new Long(value));
  }
  public  void setLastMonSmFeeNumNull(){
     this.set(S_LastMonSmFeeNum,null);
  }

  public long getLastMonSmFeeNum(){
        return DataType.getAsLong(this.get(S_LastMonSmFeeNum));
  
  }
  public long getLastMonSmFeeNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LastMonSmFeeNum));
      }

  public void initLastMonFeeFlux(long value){
     this.initProperty(S_LastMonFeeFlux,new Long(value));
  }
  public  void setLastMonFeeFlux(long value){
     this.set(S_LastMonFeeFlux,new Long(value));
  }
  public  void setLastMonFeeFluxNull(){
     this.set(S_LastMonFeeFlux,null);
  }

  public long getLastMonFeeFlux(){
        return DataType.getAsLong(this.get(S_LastMonFeeFlux));
  
  }
  public long getLastMonFeeFluxInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LastMonFeeFlux));
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

  public void initLastMonSmNum(long value){
     this.initProperty(S_LastMonSmNum,new Long(value));
  }
  public  void setLastMonSmNum(long value){
     this.set(S_LastMonSmNum,new Long(value));
  }
  public  void setLastMonSmNumNull(){
     this.set(S_LastMonSmNum,null);
  }

  public long getLastMonSmNum(){
        return DataType.getAsLong(this.get(S_LastMonSmNum));
  
  }
  public long getLastMonSmNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LastMonSmNum));
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

  public void initThreeMonSmNum(long value){
     this.initProperty(S_ThreeMonSmNum,new Long(value));
  }
  public  void setThreeMonSmNum(long value){
     this.set(S_ThreeMonSmNum,new Long(value));
  }
  public  void setThreeMonSmNumNull(){
     this.set(S_ThreeMonSmNum,null);
  }

  public long getThreeMonSmNum(){
        return DataType.getAsLong(this.get(S_ThreeMonSmNum));
  
  }
  public long getThreeMonSmNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ThreeMonSmNum));
      }


 
 }

