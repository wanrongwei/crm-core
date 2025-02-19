package com.asiainfo.crm.cm.cp.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.cp.ivalues.*;

public class BOCmPartnerBusiInfoBean extends DataContainer implements DataContainerInterface,IBOCmPartnerBusiInfoValue{

  private static String  m_boName = "com.asiainfo.crm.cm.cp.bo.BOCmPartnerBusiInfo";



  public final static  String S_CustomerInfo = "CUSTOMER_INFO";
  public final static  String S_AccessNumber = "ACCESS_NUMBER";
  public final static  String S_ServDesc = "SERV_DESC";
  public final static  String S_MaxItemMonthly = "MAX_ITEM_MONTHLY";
  public final static  String S_ModeId = "MODE_ID";
  public final static  String S_ProviceCode = "PROVICE_CODE";
  public final static  String S_EndDate = "END_DATE";
  public final static  String S_TypeDtlId = "TYPE_DTL_ID";
  public final static  String S_GatewayCode = "GATEWAY_CODE";
  public final static  String S_ZhSignText = "ZH_SIGN_TEXT";
  public final static  String S_ServiceId = "SERVICE_ID";
  public final static  String S_PauseDesc = "PAUSE_DESC";
  public final static  String S_FieldType = "FIELD_TYPE";
  public final static  String S_Version = "VERSION";
  public final static  String S_ServLevel = "SERV_LEVEL";
  public final static  String S_ServCode = "SERV_CODE";
  public final static  String S_ExpertTel = "EXPERT_TEL";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_MoAccessNum = "MO_ACCESS_NUM";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_Name = "NAME";
  public final static  String S_EnSignText = "EN_SIGN_TEXT";
  public final static  String S_PrechargeFlag = "PRECHARGE_FLAG";
  public final static  String S_BusiDataSt = "BUSI_DATA_ST";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_BusiId = "BUSI_ID";
  public final static  String S_FieldTypeDtl = "FIELD_TYPE_DTL";
  public final static  String S_SignDate = "SIGN_DATE";
  public final static  String S_ServiceInfo = "SERVICE_INFO";
  public final static  String S_State = "STATE";
  public final static  String S_SignStatus = "SIGN_STATUS";
  public final static  String S_AccessModel = "ACCESS_MODEL";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_DefaultLang = "DEFAULT_LANG";
  public final static  String S_BillingMode = "BILLING_MODE";
  public final static  String S_Status = "STATUS";
  public final static  String S_EndDesc = "END_DESC";
  public final static  String S_BusiPhase = "BUSI_PHASE";
  public final static  String S_ExpertNum = "EXPERT_NUM";
  public final static  String S_FieldDesc = "FIELD_DESC";
  public final static  String S_MaxItemDayly = "MAX_ITEM_DAYLY";
  public final static  String S_DatabaseFlag = "DATABASE_FLAG";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ServiceType = "SERVICE_TYPE";
  public final static  String S_ProvUrl = "PROV_URL";
  public final static  String S_ApplyId = "APPLY_ID";
  public final static  String S_OldIoNbr = "OLD_IO_NBR";
  public final static  String S_PartnerId = "PARTNER_ID";
  public final static  String S_ValidDesc = "VALID_DESC";
  public final static  String S_BusiProperty = "BUSI_PROPERTY";
  public final static  String S_IbusiType = "IBUSI_TYPE";
  public final static  String S_BusiCode = "BUSI_CODE";
  public final static  String S_Property = "PROPERTY";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_BusiDataDate = "BUSI_DATA_DATE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_IntroUrl = "INTRO_URL";
  public final static  String S_PauseDate = "PAUSE_DATE";
  public final static  String S_TextSignFlag = "TEXT_SIGN_FLAG";
  public final static  String S_ExtField2 = "EXT_FIELD2";
  public final static  String S_ExtField3 = "EXT_FIELD3";
  public final static  String S_ExtField1 = "EXT_FIELD1";
  public final static  String S_TypeId = "TYPE_ID";
  public final static  String S_ExtField4 = "EXT_FIELD4";
  public final static  String S_ExtField5 = "EXT_FIELD5";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmPartnerBusiInfoBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initCustomerInfo(String value){
     this.initProperty(S_CustomerInfo,value);
  }
  public  void setCustomerInfo(String value){
     this.set(S_CustomerInfo,value);
  }
  public  void setCustomerInfoNull(){
     this.set(S_CustomerInfo,null);
  }

  public String getCustomerInfo(){
       return DataType.getAsString(this.get(S_CustomerInfo));
  
  }
  public String getCustomerInfoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustomerInfo));
      }

  public void initAccessNumber(String value){
     this.initProperty(S_AccessNumber,value);
  }
  public  void setAccessNumber(String value){
     this.set(S_AccessNumber,value);
  }
  public  void setAccessNumberNull(){
     this.set(S_AccessNumber,null);
  }

  public String getAccessNumber(){
       return DataType.getAsString(this.get(S_AccessNumber));
  
  }
  public String getAccessNumberInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AccessNumber));
      }

  public void initServDesc(String value){
     this.initProperty(S_ServDesc,value);
  }
  public  void setServDesc(String value){
     this.set(S_ServDesc,value);
  }
  public  void setServDescNull(){
     this.set(S_ServDesc,null);
  }

  public String getServDesc(){
       return DataType.getAsString(this.get(S_ServDesc));
  
  }
  public String getServDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ServDesc));
      }

  public void initMaxItemMonthly(long value){
     this.initProperty(S_MaxItemMonthly,new Long(value));
  }
  public  void setMaxItemMonthly(long value){
     this.set(S_MaxItemMonthly,new Long(value));
  }
  public  void setMaxItemMonthlyNull(){
     this.set(S_MaxItemMonthly,null);
  }

  public long getMaxItemMonthly(){
        return DataType.getAsLong(this.get(S_MaxItemMonthly));
  
  }
  public long getMaxItemMonthlyInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MaxItemMonthly));
      }

  public void initModeId(long value){
     this.initProperty(S_ModeId,new Long(value));
  }
  public  void setModeId(long value){
     this.set(S_ModeId,new Long(value));
  }
  public  void setModeIdNull(){
     this.set(S_ModeId,null);
  }

  public long getModeId(){
        return DataType.getAsLong(this.get(S_ModeId));
  
  }
  public long getModeIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ModeId));
      }

  public void initProviceCode(String value){
     this.initProperty(S_ProviceCode,value);
  }
  public  void setProviceCode(String value){
     this.set(S_ProviceCode,value);
  }
  public  void setProviceCodeNull(){
     this.set(S_ProviceCode,null);
  }

  public String getProviceCode(){
       return DataType.getAsString(this.get(S_ProviceCode));
  
  }
  public String getProviceCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ProviceCode));
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

  public void initTypeDtlId(long value){
     this.initProperty(S_TypeDtlId,new Long(value));
  }
  public  void setTypeDtlId(long value){
     this.set(S_TypeDtlId,new Long(value));
  }
  public  void setTypeDtlIdNull(){
     this.set(S_TypeDtlId,null);
  }

  public long getTypeDtlId(){
        return DataType.getAsLong(this.get(S_TypeDtlId));
  
  }
  public long getTypeDtlIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_TypeDtlId));
      }

  public void initGatewayCode(String value){
     this.initProperty(S_GatewayCode,value);
  }
  public  void setGatewayCode(String value){
     this.set(S_GatewayCode,value);
  }
  public  void setGatewayCodeNull(){
     this.set(S_GatewayCode,null);
  }

  public String getGatewayCode(){
       return DataType.getAsString(this.get(S_GatewayCode));
  
  }
  public String getGatewayCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GatewayCode));
      }

  public void initZhSignText(String value){
     this.initProperty(S_ZhSignText,value);
  }
  public  void setZhSignText(String value){
     this.set(S_ZhSignText,value);
  }
  public  void setZhSignTextNull(){
     this.set(S_ZhSignText,null);
  }

  public String getZhSignText(){
       return DataType.getAsString(this.get(S_ZhSignText));
  
  }
  public String getZhSignTextInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ZhSignText));
      }

  public void initServiceId(long value){
     this.initProperty(S_ServiceId,new Long(value));
  }
  public  void setServiceId(long value){
     this.set(S_ServiceId,new Long(value));
  }
  public  void setServiceIdNull(){
     this.set(S_ServiceId,null);
  }

  public long getServiceId(){
        return DataType.getAsLong(this.get(S_ServiceId));
  
  }
  public long getServiceIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ServiceId));
      }

  public void initPauseDesc(String value){
     this.initProperty(S_PauseDesc,value);
  }
  public  void setPauseDesc(String value){
     this.set(S_PauseDesc,value);
  }
  public  void setPauseDescNull(){
     this.set(S_PauseDesc,null);
  }

  public String getPauseDesc(){
       return DataType.getAsString(this.get(S_PauseDesc));
  
  }
  public String getPauseDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PauseDesc));
      }

  public void initFieldType(int value){
     this.initProperty(S_FieldType,new Integer(value));
  }
  public  void setFieldType(int value){
     this.set(S_FieldType,new Integer(value));
  }
  public  void setFieldTypeNull(){
     this.set(S_FieldType,null);
  }

  public int getFieldType(){
        return DataType.getAsInt(this.get(S_FieldType));
  
  }
  public int getFieldTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_FieldType));
      }

  public void initVersion(String value){
     this.initProperty(S_Version,value);
  }
  public  void setVersion(String value){
     this.set(S_Version,value);
  }
  public  void setVersionNull(){
     this.set(S_Version,null);
  }

  public String getVersion(){
       return DataType.getAsString(this.get(S_Version));
  
  }
  public String getVersionInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Version));
      }

  public void initServLevel(int value){
     this.initProperty(S_ServLevel,new Integer(value));
  }
  public  void setServLevel(int value){
     this.set(S_ServLevel,new Integer(value));
  }
  public  void setServLevelNull(){
     this.set(S_ServLevel,null);
  }

  public int getServLevel(){
        return DataType.getAsInt(this.get(S_ServLevel));
  
  }
  public int getServLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ServLevel));
      }

  public void initServCode(String value){
     this.initProperty(S_ServCode,value);
  }
  public  void setServCode(String value){
     this.set(S_ServCode,value);
  }
  public  void setServCodeNull(){
     this.set(S_ServCode,null);
  }

  public String getServCode(){
       return DataType.getAsString(this.get(S_ServCode));
  
  }
  public String getServCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ServCode));
      }

  public void initExpertTel(String value){
     this.initProperty(S_ExpertTel,value);
  }
  public  void setExpertTel(String value){
     this.set(S_ExpertTel,value);
  }
  public  void setExpertTelNull(){
     this.set(S_ExpertTel,null);
  }

  public String getExpertTel(){
       return DataType.getAsString(this.get(S_ExpertTel));
  
  }
  public String getExpertTelInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ExpertTel));
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

  public void initMoAccessNum(String value){
     this.initProperty(S_MoAccessNum,value);
  }
  public  void setMoAccessNum(String value){
     this.set(S_MoAccessNum,value);
  }
  public  void setMoAccessNumNull(){
     this.set(S_MoAccessNum,null);
  }

  public String getMoAccessNum(){
       return DataType.getAsString(this.get(S_MoAccessNum));
  
  }
  public String getMoAccessNumInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MoAccessNum));
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

  public void initEnSignText(String value){
     this.initProperty(S_EnSignText,value);
  }
  public  void setEnSignText(String value){
     this.set(S_EnSignText,value);
  }
  public  void setEnSignTextNull(){
     this.set(S_EnSignText,null);
  }

  public String getEnSignText(){
       return DataType.getAsString(this.get(S_EnSignText));
  
  }
  public String getEnSignTextInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EnSignText));
      }

  public void initPrechargeFlag(int value){
     this.initProperty(S_PrechargeFlag,new Integer(value));
  }
  public  void setPrechargeFlag(int value){
     this.set(S_PrechargeFlag,new Integer(value));
  }
  public  void setPrechargeFlagNull(){
     this.set(S_PrechargeFlag,null);
  }

  public int getPrechargeFlag(){
        return DataType.getAsInt(this.get(S_PrechargeFlag));
  
  }
  public int getPrechargeFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PrechargeFlag));
      }

  public void initBusiDataSt(int value){
     this.initProperty(S_BusiDataSt,new Integer(value));
  }
  public  void setBusiDataSt(int value){
     this.set(S_BusiDataSt,new Integer(value));
  }
  public  void setBusiDataStNull(){
     this.set(S_BusiDataSt,null);
  }

  public int getBusiDataSt(){
        return DataType.getAsInt(this.get(S_BusiDataSt));
  
  }
  public int getBusiDataStInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_BusiDataSt));
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

  public void initBusiId(long value){
     this.initProperty(S_BusiId,new Long(value));
  }
  public  void setBusiId(long value){
     this.set(S_BusiId,new Long(value));
  }
  public  void setBusiIdNull(){
     this.set(S_BusiId,null);
  }

  public long getBusiId(){
        return DataType.getAsLong(this.get(S_BusiId));
  
  }
  public long getBusiIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BusiId));
      }

  public void initFieldTypeDtl(int value){
     this.initProperty(S_FieldTypeDtl,new Integer(value));
  }
  public  void setFieldTypeDtl(int value){
     this.set(S_FieldTypeDtl,new Integer(value));
  }
  public  void setFieldTypeDtlNull(){
     this.set(S_FieldTypeDtl,null);
  }

  public int getFieldTypeDtl(){
        return DataType.getAsInt(this.get(S_FieldTypeDtl));
  
  }
  public int getFieldTypeDtlInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_FieldTypeDtl));
      }

  public void initSignDate(Timestamp value){
     this.initProperty(S_SignDate,value);
  }
  public  void setSignDate(Timestamp value){
     this.set(S_SignDate,value);
  }
  public  void setSignDateNull(){
     this.set(S_SignDate,null);
  }

  public Timestamp getSignDate(){
        return DataType.getAsDateTime(this.get(S_SignDate));
  
  }
  public Timestamp getSignDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_SignDate));
      }

  public void initServiceInfo(String value){
     this.initProperty(S_ServiceInfo,value);
  }
  public  void setServiceInfo(String value){
     this.set(S_ServiceInfo,value);
  }
  public  void setServiceInfoNull(){
     this.set(S_ServiceInfo,null);
  }

  public String getServiceInfo(){
       return DataType.getAsString(this.get(S_ServiceInfo));
  
  }
  public String getServiceInfoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ServiceInfo));
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

  public void initSignStatus(int value){
     this.initProperty(S_SignStatus,new Integer(value));
  }
  public  void setSignStatus(int value){
     this.set(S_SignStatus,new Integer(value));
  }
  public  void setSignStatusNull(){
     this.set(S_SignStatus,null);
  }

  public int getSignStatus(){
        return DataType.getAsInt(this.get(S_SignStatus));
  
  }
  public int getSignStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_SignStatus));
      }

  public void initAccessModel(int value){
     this.initProperty(S_AccessModel,new Integer(value));
  }
  public  void setAccessModel(int value){
     this.set(S_AccessModel,new Integer(value));
  }
  public  void setAccessModelNull(){
     this.set(S_AccessModel,null);
  }

  public int getAccessModel(){
        return DataType.getAsInt(this.get(S_AccessModel));
  
  }
  public int getAccessModelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_AccessModel));
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

  public void initDefaultLang(int value){
     this.initProperty(S_DefaultLang,new Integer(value));
  }
  public  void setDefaultLang(int value){
     this.set(S_DefaultLang,new Integer(value));
  }
  public  void setDefaultLangNull(){
     this.set(S_DefaultLang,null);
  }

  public int getDefaultLang(){
        return DataType.getAsInt(this.get(S_DefaultLang));
  
  }
  public int getDefaultLangInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_DefaultLang));
      }

  public void initBillingMode(int value){
     this.initProperty(S_BillingMode,new Integer(value));
  }
  public  void setBillingMode(int value){
     this.set(S_BillingMode,new Integer(value));
  }
  public  void setBillingModeNull(){
     this.set(S_BillingMode,null);
  }

  public int getBillingMode(){
        return DataType.getAsInt(this.get(S_BillingMode));
  
  }
  public int getBillingModeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_BillingMode));
      }

  public void initStatus(int value){
     this.initProperty(S_Status,new Integer(value));
  }
  public  void setStatus(int value){
     this.set(S_Status,new Integer(value));
  }
  public  void setStatusNull(){
     this.set(S_Status,null);
  }

  public int getStatus(){
        return DataType.getAsInt(this.get(S_Status));
  
  }
  public int getStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Status));
      }

  public void initEndDesc(String value){
     this.initProperty(S_EndDesc,value);
  }
  public  void setEndDesc(String value){
     this.set(S_EndDesc,value);
  }
  public  void setEndDescNull(){
     this.set(S_EndDesc,null);
  }

  public String getEndDesc(){
       return DataType.getAsString(this.get(S_EndDesc));
  
  }
  public String getEndDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EndDesc));
      }

  public void initBusiPhase(int value){
     this.initProperty(S_BusiPhase,new Integer(value));
  }
  public  void setBusiPhase(int value){
     this.set(S_BusiPhase,new Integer(value));
  }
  public  void setBusiPhaseNull(){
     this.set(S_BusiPhase,null);
  }

  public int getBusiPhase(){
        return DataType.getAsInt(this.get(S_BusiPhase));
  
  }
  public int getBusiPhaseInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_BusiPhase));
      }

  public void initExpertNum(int value){
     this.initProperty(S_ExpertNum,new Integer(value));
  }
  public  void setExpertNum(int value){
     this.set(S_ExpertNum,new Integer(value));
  }
  public  void setExpertNumNull(){
     this.set(S_ExpertNum,null);
  }

  public int getExpertNum(){
        return DataType.getAsInt(this.get(S_ExpertNum));
  
  }
  public int getExpertNumInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ExpertNum));
      }

  public void initFieldDesc(String value){
     this.initProperty(S_FieldDesc,value);
  }
  public  void setFieldDesc(String value){
     this.set(S_FieldDesc,value);
  }
  public  void setFieldDescNull(){
     this.set(S_FieldDesc,null);
  }

  public String getFieldDesc(){
       return DataType.getAsString(this.get(S_FieldDesc));
  
  }
  public String getFieldDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FieldDesc));
      }

  public void initMaxItemDayly(long value){
     this.initProperty(S_MaxItemDayly,new Long(value));
  }
  public  void setMaxItemDayly(long value){
     this.set(S_MaxItemDayly,new Long(value));
  }
  public  void setMaxItemDaylyNull(){
     this.set(S_MaxItemDayly,null);
  }

  public long getMaxItemDayly(){
        return DataType.getAsLong(this.get(S_MaxItemDayly));
  
  }
  public long getMaxItemDaylyInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MaxItemDayly));
      }

  public void initDatabaseFlag(int value){
     this.initProperty(S_DatabaseFlag,new Integer(value));
  }
  public  void setDatabaseFlag(int value){
     this.set(S_DatabaseFlag,new Integer(value));
  }
  public  void setDatabaseFlagNull(){
     this.set(S_DatabaseFlag,null);
  }

  public int getDatabaseFlag(){
        return DataType.getAsInt(this.get(S_DatabaseFlag));
  
  }
  public int getDatabaseFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_DatabaseFlag));
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

  public void initServiceType(int value){
     this.initProperty(S_ServiceType,new Integer(value));
  }
  public  void setServiceType(int value){
     this.set(S_ServiceType,new Integer(value));
  }
  public  void setServiceTypeNull(){
     this.set(S_ServiceType,null);
  }

  public int getServiceType(){
        return DataType.getAsInt(this.get(S_ServiceType));
  
  }
  public int getServiceTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ServiceType));
      }

  public void initProvUrl(String value){
     this.initProperty(S_ProvUrl,value);
  }
  public  void setProvUrl(String value){
     this.set(S_ProvUrl,value);
  }
  public  void setProvUrlNull(){
     this.set(S_ProvUrl,null);
  }

  public String getProvUrl(){
       return DataType.getAsString(this.get(S_ProvUrl));
  
  }
  public String getProvUrlInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ProvUrl));
      }

  public void initApplyId(long value){
     this.initProperty(S_ApplyId,new Long(value));
  }
  public  void setApplyId(long value){
     this.set(S_ApplyId,new Long(value));
  }
  public  void setApplyIdNull(){
     this.set(S_ApplyId,null);
  }

  public long getApplyId(){
        return DataType.getAsLong(this.get(S_ApplyId));
  
  }
  public long getApplyIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ApplyId));
      }

  public void initOldIoNbr(long value){
     this.initProperty(S_OldIoNbr,new Long(value));
  }
  public  void setOldIoNbr(long value){
     this.set(S_OldIoNbr,new Long(value));
  }
  public  void setOldIoNbrNull(){
     this.set(S_OldIoNbr,null);
  }

  public long getOldIoNbr(){
        return DataType.getAsLong(this.get(S_OldIoNbr));
  
  }
  public long getOldIoNbrInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OldIoNbr));
      }

  public void initPartnerId(long value){
     this.initProperty(S_PartnerId,new Long(value));
  }
  public  void setPartnerId(long value){
     this.set(S_PartnerId,new Long(value));
  }
  public  void setPartnerIdNull(){
     this.set(S_PartnerId,null);
  }

  public long getPartnerId(){
        return DataType.getAsLong(this.get(S_PartnerId));
  
  }
  public long getPartnerIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PartnerId));
      }

  public void initValidDesc(String value){
     this.initProperty(S_ValidDesc,value);
  }
  public  void setValidDesc(String value){
     this.set(S_ValidDesc,value);
  }
  public  void setValidDescNull(){
     this.set(S_ValidDesc,null);
  }

  public String getValidDesc(){
       return DataType.getAsString(this.get(S_ValidDesc));
  
  }
  public String getValidDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ValidDesc));
      }

  public void initBusiProperty(int value){
     this.initProperty(S_BusiProperty,new Integer(value));
  }
  public  void setBusiProperty(int value){
     this.set(S_BusiProperty,new Integer(value));
  }
  public  void setBusiPropertyNull(){
     this.set(S_BusiProperty,null);
  }

  public int getBusiProperty(){
        return DataType.getAsInt(this.get(S_BusiProperty));
  
  }
  public int getBusiPropertyInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_BusiProperty));
      }

  public void initIbusiType(int value){
     this.initProperty(S_IbusiType,new Integer(value));
  }
  public  void setIbusiType(int value){
     this.set(S_IbusiType,new Integer(value));
  }
  public  void setIbusiTypeNull(){
     this.set(S_IbusiType,null);
  }

  public int getIbusiType(){
        return DataType.getAsInt(this.get(S_IbusiType));
  
  }
  public int getIbusiTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IbusiType));
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

  public void initProperty(int value){
     this.initProperty(S_Property,new Integer(value));
  }
  public  void setProperty(int value){
     this.set(S_Property,new Integer(value));
  }
  public  void setPropertyNull(){
     this.set(S_Property,null);
  }

  public int getProperty(){
        return DataType.getAsInt(this.get(S_Property));
  
  }
  public int getPropertyInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Property));
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

  public void initBusiDataDate(Timestamp value){
     this.initProperty(S_BusiDataDate,value);
  }
  public  void setBusiDataDate(Timestamp value){
     this.set(S_BusiDataDate,value);
  }
  public  void setBusiDataDateNull(){
     this.set(S_BusiDataDate,null);
  }

  public Timestamp getBusiDataDate(){
        return DataType.getAsDateTime(this.get(S_BusiDataDate));
  
  }
  public Timestamp getBusiDataDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_BusiDataDate));
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

  public void initIntroUrl(String value){
     this.initProperty(S_IntroUrl,value);
  }
  public  void setIntroUrl(String value){
     this.set(S_IntroUrl,value);
  }
  public  void setIntroUrlNull(){
     this.set(S_IntroUrl,null);
  }

  public String getIntroUrl(){
       return DataType.getAsString(this.get(S_IntroUrl));
  
  }
  public String getIntroUrlInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IntroUrl));
      }

  public void initPauseDate(Timestamp value){
     this.initProperty(S_PauseDate,value);
  }
  public  void setPauseDate(Timestamp value){
     this.set(S_PauseDate,value);
  }
  public  void setPauseDateNull(){
     this.set(S_PauseDate,null);
  }

  public Timestamp getPauseDate(){
        return DataType.getAsDateTime(this.get(S_PauseDate));
  
  }
  public Timestamp getPauseDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_PauseDate));
      }

  public void initTextSignFlag(int value){
     this.initProperty(S_TextSignFlag,new Integer(value));
  }
  public  void setTextSignFlag(int value){
     this.set(S_TextSignFlag,new Integer(value));
  }
  public  void setTextSignFlagNull(){
     this.set(S_TextSignFlag,null);
  }

  public int getTextSignFlag(){
        return DataType.getAsInt(this.get(S_TextSignFlag));
  
  }
  public int getTextSignFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_TextSignFlag));
      }

  public void initExtField2(String value){
     this.initProperty(S_ExtField2,value);
  }
  public  void setExtField2(String value){
     this.set(S_ExtField2,value);
  }
  public  void setExtField2Null(){
     this.set(S_ExtField2,null);
  }

  public String getExtField2(){
       return DataType.getAsString(this.get(S_ExtField2));
  
  }
  public String getExtField2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ExtField2));
      }

  public void initExtField3(String value){
     this.initProperty(S_ExtField3,value);
  }
  public  void setExtField3(String value){
     this.set(S_ExtField3,value);
  }
  public  void setExtField3Null(){
     this.set(S_ExtField3,null);
  }

  public String getExtField3(){
       return DataType.getAsString(this.get(S_ExtField3));
  
  }
  public String getExtField3InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ExtField3));
      }

  public void initExtField1(String value){
     this.initProperty(S_ExtField1,value);
  }
  public  void setExtField1(String value){
     this.set(S_ExtField1,value);
  }
  public  void setExtField1Null(){
     this.set(S_ExtField1,null);
  }

  public String getExtField1(){
       return DataType.getAsString(this.get(S_ExtField1));
  
  }
  public String getExtField1InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ExtField1));
      }

  public void initTypeId(long value){
     this.initProperty(S_TypeId,new Long(value));
  }
  public  void setTypeId(long value){
     this.set(S_TypeId,new Long(value));
  }
  public  void setTypeIdNull(){
     this.set(S_TypeId,null);
  }

  public long getTypeId(){
        return DataType.getAsLong(this.get(S_TypeId));
  
  }
  public long getTypeIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_TypeId));
      }

  public void initExtField4(String value){
     this.initProperty(S_ExtField4,value);
  }
  public  void setExtField4(String value){
     this.set(S_ExtField4,value);
  }
  public  void setExtField4Null(){
     this.set(S_ExtField4,null);
  }

  public String getExtField4(){
       return DataType.getAsString(this.get(S_ExtField4));
  
  }
  public String getExtField4InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ExtField4));
      }

  public void initExtField5(String value){
     this.initProperty(S_ExtField5,value);
  }
  public  void setExtField5(String value){
     this.set(S_ExtField5,value);
  }
  public  void setExtField5Null(){
     this.set(S_ExtField5,null);
  }

  public String getExtField5(){
       return DataType.getAsString(this.get(S_ExtField5));
  
  }
  public String getExtField5InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ExtField5));
      }

 
 }

