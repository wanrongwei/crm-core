package com.asiainfo.crm.cm.bi2oneframe.bo;

import java.sql.Timestamp;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.ServiceManager;
import com.asiainfo.crm.cm.bi2oneframe.ivalues.IBOCmCallMarketingValue;

public class BOCmCallMarketingBean extends DataContainer implements DataContainerInterface,IBOCmCallMarketingValue{

  private static String  m_boName = "com.asiainfo.crm.cm.bi2oneframe.bo.BOCmCallMarketing";



  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_UserHobby = "USER_HOBBY";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_AccessDate = "ACCESS_DATE";
  public final static  String S_SendMmsNum = "SEND_MMS_NUM";
  public final static  String S_SendSmNum = "SEND_SM_NUM";
  public final static  String S_NewBusiFee = "NEW_BUSI_FEE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CreateVestDepartement = "CREATE_VEST_DEPARTEMENT";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DataId = "DATA_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CurrentMonFee = "CURRENT_MON_FEE";
  public final static  String S_IsMobilePayAcct = "IS_MOBILE_PAY_ACCT";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_GprsFlux = "GPRS_FLUX";
  public final static  String S_LastMonFee = "LAST_MON_FEE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmCallMarketingBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
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

  public void initUserHobby(String value){
     this.initProperty(S_UserHobby,value);
  }
  public  void setUserHobby(String value){
     this.set(S_UserHobby,value);
  }
  public  void setUserHobbyNull(){
     this.set(S_UserHobby,null);
  }

  public String getUserHobby(){
       return DataType.getAsString(this.get(S_UserHobby));
  
  }
  public String getUserHobbyInitialValue(){
        return DataType.getAsString(this.getOldObj(S_UserHobby));
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

  public void initAccessDate(Timestamp value){
     this.initProperty(S_AccessDate,value);
  }
  public  void setAccessDate(Timestamp value){
     this.set(S_AccessDate,value);
  }
  public  void setAccessDateNull(){
     this.set(S_AccessDate,null);
  }

  public Timestamp getAccessDate(){
        return DataType.getAsDateTime(this.get(S_AccessDate));
  
  }
  public Timestamp getAccessDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_AccessDate));
      }

  public void initSendMmsNum(long value){
     this.initProperty(S_SendMmsNum,new Long(value));
  }
  public  void setSendMmsNum(long value){
     this.set(S_SendMmsNum,new Long(value));
  }
  public  void setSendMmsNumNull(){
     this.set(S_SendMmsNum,null);
  }

  public long getSendMmsNum(){
        return DataType.getAsLong(this.get(S_SendMmsNum));
  
  }
  public long getSendMmsNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SendMmsNum));
      }

  public void initSendSmNum(long value){
     this.initProperty(S_SendSmNum,new Long(value));
  }
  public  void setSendSmNum(long value){
     this.set(S_SendSmNum,new Long(value));
  }
  public  void setSendSmNumNull(){
     this.set(S_SendSmNum,null);
  }

  public long getSendSmNum(){
        return DataType.getAsLong(this.get(S_SendSmNum));
  
  }
  public long getSendSmNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SendSmNum));
      }

  public void initNewBusiFee(long value){
     this.initProperty(S_NewBusiFee,new Long(value));
  }
  public  void setNewBusiFee(long value){
     this.set(S_NewBusiFee,new Long(value));
  }
  public  void setNewBusiFeeNull(){
     this.set(S_NewBusiFee,null);
  }

  public long getNewBusiFee(){
        return DataType.getAsLong(this.get(S_NewBusiFee));
  
  }
  public long getNewBusiFeeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_NewBusiFee));
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

  public void initCurrentMonFee(long value){
     this.initProperty(S_CurrentMonFee,new Long(value));
  }
  public  void setCurrentMonFee(long value){
     this.set(S_CurrentMonFee,new Long(value));
  }
  public  void setCurrentMonFeeNull(){
     this.set(S_CurrentMonFee,null);
  }

  public long getCurrentMonFee(){
        return DataType.getAsLong(this.get(S_CurrentMonFee));
  
  }
  public long getCurrentMonFeeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CurrentMonFee));
      }

  public void initIsMobilePayAcct(String value){
     this.initProperty(S_IsMobilePayAcct,value);
  }
  public  void setIsMobilePayAcct(String value){
     this.set(S_IsMobilePayAcct,value);
  }
  public  void setIsMobilePayAcctNull(){
     this.set(S_IsMobilePayAcct,null);
  }

  public String getIsMobilePayAcct(){
       return DataType.getAsString(this.get(S_IsMobilePayAcct));
  
  }
  public String getIsMobilePayAcctInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IsMobilePayAcct));
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

  public void initGprsFlux(long value){
     this.initProperty(S_GprsFlux,new Long(value));
  }
  public  void setGprsFlux(long value){
     this.set(S_GprsFlux,new Long(value));
  }
  public  void setGprsFluxNull(){
     this.set(S_GprsFlux,null);
  }

  public long getGprsFlux(){
        return DataType.getAsLong(this.get(S_GprsFlux));
  
  }
  public long getGprsFluxInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GprsFlux));
      }

  public void initLastMonFee(long value){
     this.initProperty(S_LastMonFee,new Long(value));
  }
  public  void setLastMonFee(long value){
     this.set(S_LastMonFee,new Long(value));
  }
  public  void setLastMonFeeNull(){
     this.set(S_LastMonFee,null);
  }

  public long getLastMonFee(){
        return DataType.getAsLong(this.get(S_LastMonFee));
  
  }
  public long getLastMonFeeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LastMonFee));
      }


 
 }

