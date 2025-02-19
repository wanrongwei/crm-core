package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class BOCmGroupExtraInfoBean extends DataContainer implements DataContainerInterface,IBOCmGroupExtraInfoValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.BOCmGroupExtraInfo";



  public final static  String S_DeptLeaderPhone = "DEPT_LEADER_PHONE";
  public final static  String S_GroupInformTrade = "GROUP_INFORM_TRADE";
  public final static  String S_GroupPayType = "GROUP_PAY_TYPE";
  public final static  String S_GroupRegionType = "GROUP_REGION_TYPE";
  public final static  String S_BusiArea = "BUSI_AREA";
  public final static  String S_JobSpec = "JOB_SPEC";
  public final static  String S_Latitude = "LATITUDE";
  public final static  String S_GroupDate = "GROUP_DATE";
  public final static  String S_GroupOfficeNetwork = "GROUP_OFFICE_NETWORK";
  public final static  String S_GroupSubRegionType = "GROUP_SUB_REGION_TYPE";
  public final static  String S_OrganType = "ORGAN_TYPE";
  public final static  String S_OrganBillboard = "ORGAN_BILLBOARD";
  public final static  String S_InfoFilePath = "INFO_FILE_PATH";
  public final static  String S_OthUseDtl = "OTH_USE_DTL";
  public final static  String S_EcCode = "EC_CODE";
  public final static  String S_MultiProvince = "MULTI_PROVINCE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ServChnl = "SERV_CHNL";
  public final static  String S_VillageSvrPoint = "VILLAGE_SVR_POINT";
  public final static  String S_ProvGroupType = "PROV_GROUP_TYPE";
  public final static  String S_ProdDevChnl = "PROD_DEV_CHNL";
  public final static  String S_DeptLeaderJob = "DEPT_LEADER_JOB";
  public final static  String S_GroupGlory = "GROUP_GLORY";
  public final static  String S_TradeGroupClustId = "TRADE_GROUP_CLUST_ID";
  public final static  String S_IsSetupAlone = "IS_SETUP_ALONE";
  public final static  String S_TradeGroupClustLevel = "TRADE_GROUP_CLUST_LEVEL";
  public final static  String S_SaleAgency = "SALE_AGENCY";
  public final static  String S_StaffAmount = "STAFF_AMOUNT";
  public final static  String S_InformDeptName = "INFORM_DEPT_NAME";
  public final static  String S_TownBusinessHall = "TOWN_BUSINESS_HALL";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_VpmnCustId = "VPMN_CUST_ID";
  public final static  String S_ServiceGarrison = "SERVICE_GARRISON";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_IsTop100 = "IS_TOP100";
  public final static  String S_ServiceBrand = "SERVICE_BRAND";
  public final static  String S_GroupIntro = "GROUP_INTRO";
  public final static  String S_GroupSignType = "GROUP_SIGN_TYPE";
  public final static  String S_NeedCallGroupData = "NEED_CALL_GROUP_DATA";
  public final static  String S_State = "STATE";
  public final static  String S_ConsultWithCont = "CONSULT_WITH_CONT";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_LocalParentOrgan = "LOCAL_PARENT_ORGAN";
  public final static  String S_GroupCulture = "GROUP_CULTURE";
  public final static  String S_AssetClass = "ASSET_CLASS";
  public final static  String S_UnicomUserNum = "UNICOM_USER_NUM";
  public final static  String S_InforFlag = "INFOR_FLAG";
  public final static  String S_DeptLeader = "DEPT_LEADER";
  public final static  String S_ComBudget = "COM_BUDGET";
  public final static  String S_IsProvGrpManaged = "IS_PROV_GRP_MANAGED";
  public final static  String S_RelGroupCustId = "REL_GROUP_CUST_ID";
  public final static  String S_FieldService = "FIELD_SERVICE";
  public final static  String S_OutdoorStaffRate = "OUTDOOR_STAFF_RATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_QuestionType = "QUESTION_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CreditPayLevel = "CREDIT_PAY_LEVEL";
  public final static  String S_Notes = "NOTES";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_GarrisonPeriod = "GARRISON_PERIOD";
  public final static  String S_TelecomUserNum = "TELECOM_USER_NUM";
  public final static  String S_LocalParentOrganId = "LOCAL_PARENT_ORGAN_ID";
  public final static  String S_CmccUserNum = "CMCC_USER_NUM";
  public final static  String S_EmphasisBrand = "EMPHASIS_BRAND";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_GroupInfo = "GROUP_INFO";
  public final static  String S_InfoFileName = "INFO_FILE_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_HqName = "HQ_NAME";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OutdoorStaffNum = "OUTDOOR_STAFF_NUM";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_Agent = "AGENT";
  public final static  String S_Vocation3 = "VOCATION3";
  public final static  String S_ProdStatus = "PROD_STATUS";
  public final static  String S_DefectType = "DEFECT_TYPE";
  public final static  String S_DevChnl = "DEV_CHNL";
  public final static  String S_Vocation1 = "VOCATION1";
  public final static  String S_Vocation2 = "VOCATION2";
  public final static  String S_Longitude = "LONGITUDE";
  public final static  String S_IncomeClass = "INCOME_CLASS";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmGroupExtraInfoBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initDeptLeaderPhone(String value){
     this.initProperty(S_DeptLeaderPhone,value);
  }
  public  void setDeptLeaderPhone(String value){
     this.set(S_DeptLeaderPhone,value);
  }
  public  void setDeptLeaderPhoneNull(){
     this.set(S_DeptLeaderPhone,null);
  }

  public String getDeptLeaderPhone(){
       return DataType.getAsString(this.get(S_DeptLeaderPhone));
  
  }
  public String getDeptLeaderPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DeptLeaderPhone));
      }

  public void initGroupInformTrade(String value){
     this.initProperty(S_GroupInformTrade,value);
  }
  public  void setGroupInformTrade(String value){
     this.set(S_GroupInformTrade,value);
  }
  public  void setGroupInformTradeNull(){
     this.set(S_GroupInformTrade,null);
  }

  public String getGroupInformTrade(){
       return DataType.getAsString(this.get(S_GroupInformTrade));
  
  }
  public String getGroupInformTradeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupInformTrade));
      }

  public void initGroupPayType(int value){
     this.initProperty(S_GroupPayType,new Integer(value));
  }
  public  void setGroupPayType(int value){
     this.set(S_GroupPayType,new Integer(value));
  }
  public  void setGroupPayTypeNull(){
     this.set(S_GroupPayType,null);
  }

  public int getGroupPayType(){
        return DataType.getAsInt(this.get(S_GroupPayType));
  
  }
  public int getGroupPayTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_GroupPayType));
      }

  public void initGroupRegionType(int value){
     this.initProperty(S_GroupRegionType,new Integer(value));
  }
  public  void setGroupRegionType(int value){
     this.set(S_GroupRegionType,new Integer(value));
  }
  public  void setGroupRegionTypeNull(){
     this.set(S_GroupRegionType,null);
  }

  public int getGroupRegionType(){
        return DataType.getAsInt(this.get(S_GroupRegionType));
  
  }
  public int getGroupRegionTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_GroupRegionType));
      }

  public void initBusiArea(String value){
     this.initProperty(S_BusiArea,value);
  }
  public  void setBusiArea(String value){
     this.set(S_BusiArea,value);
  }
  public  void setBusiAreaNull(){
     this.set(S_BusiArea,null);
  }

  public String getBusiArea(){
       return DataType.getAsString(this.get(S_BusiArea));
  
  }
  public String getBusiAreaInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BusiArea));
      }

  public void initJobSpec(String value){
     this.initProperty(S_JobSpec,value);
  }
  public  void setJobSpec(String value){
     this.set(S_JobSpec,value);
  }
  public  void setJobSpecNull(){
     this.set(S_JobSpec,null);
  }

  public String getJobSpec(){
       return DataType.getAsString(this.get(S_JobSpec));
  
  }
  public String getJobSpecInitialValue(){
        return DataType.getAsString(this.getOldObj(S_JobSpec));
      }

  public void initLatitude(String value){
     this.initProperty(S_Latitude,value);
  }
  public  void setLatitude(String value){
     this.set(S_Latitude,value);
  }
  public  void setLatitudeNull(){
     this.set(S_Latitude,null);
  }

  public String getLatitude(){
       return DataType.getAsString(this.get(S_Latitude));
  
  }
  public String getLatitudeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Latitude));
      }

  public void initGroupDate(Timestamp value){
     this.initProperty(S_GroupDate,value);
  }
  public  void setGroupDate(Timestamp value){
     this.set(S_GroupDate,value);
  }
  public  void setGroupDateNull(){
     this.set(S_GroupDate,null);
  }

  public Timestamp getGroupDate(){
        return DataType.getAsDateTime(this.get(S_GroupDate));
  
  }
  public Timestamp getGroupDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_GroupDate));
      }

  public void initGroupOfficeNetwork(String value){
     this.initProperty(S_GroupOfficeNetwork,value);
  }
  public  void setGroupOfficeNetwork(String value){
     this.set(S_GroupOfficeNetwork,value);
  }
  public  void setGroupOfficeNetworkNull(){
     this.set(S_GroupOfficeNetwork,null);
  }

  public String getGroupOfficeNetwork(){
       return DataType.getAsString(this.get(S_GroupOfficeNetwork));
  
  }
  public String getGroupOfficeNetworkInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupOfficeNetwork));
      }

  public void initGroupSubRegionType(String value){
     this.initProperty(S_GroupSubRegionType,value);
  }
  public  void setGroupSubRegionType(String value){
     this.set(S_GroupSubRegionType,value);
  }
  public  void setGroupSubRegionTypeNull(){
     this.set(S_GroupSubRegionType,null);
  }

  public String getGroupSubRegionType(){
       return DataType.getAsString(this.get(S_GroupSubRegionType));
  
  }
  public String getGroupSubRegionTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupSubRegionType));
      }

  public void initOrganType(String value){
     this.initProperty(S_OrganType,value);
  }
  public  void setOrganType(String value){
     this.set(S_OrganType,value);
  }
  public  void setOrganTypeNull(){
     this.set(S_OrganType,null);
  }

  public String getOrganType(){
       return DataType.getAsString(this.get(S_OrganType));
  
  }
  public String getOrganTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OrganType));
      }

  public void initOrganBillboard(String value){
     this.initProperty(S_OrganBillboard,value);
  }
  public  void setOrganBillboard(String value){
     this.set(S_OrganBillboard,value);
  }
  public  void setOrganBillboardNull(){
     this.set(S_OrganBillboard,null);
  }

  public String getOrganBillboard(){
       return DataType.getAsString(this.get(S_OrganBillboard));
  
  }
  public String getOrganBillboardInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OrganBillboard));
      }

  public void initInfoFilePath(String value){
     this.initProperty(S_InfoFilePath,value);
  }
  public  void setInfoFilePath(String value){
     this.set(S_InfoFilePath,value);
  }
  public  void setInfoFilePathNull(){
     this.set(S_InfoFilePath,null);
  }

  public String getInfoFilePath(){
       return DataType.getAsString(this.get(S_InfoFilePath));
  
  }
  public String getInfoFilePathInitialValue(){
        return DataType.getAsString(this.getOldObj(S_InfoFilePath));
      }

  public void initOthUseDtl(String value){
     this.initProperty(S_OthUseDtl,value);
  }
  public  void setOthUseDtl(String value){
     this.set(S_OthUseDtl,value);
  }
  public  void setOthUseDtlNull(){
     this.set(S_OthUseDtl,null);
  }

  public String getOthUseDtl(){
       return DataType.getAsString(this.get(S_OthUseDtl));
  
  }
  public String getOthUseDtlInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OthUseDtl));
      }

  public void initEcCode(String value){
     this.initProperty(S_EcCode,value);
  }
  public  void setEcCode(String value){
     this.set(S_EcCode,value);
  }
  public  void setEcCodeNull(){
     this.set(S_EcCode,null);
  }

  public String getEcCode(){
       return DataType.getAsString(this.get(S_EcCode));
  
  }
  public String getEcCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EcCode));
      }

  public void initMultiProvince(int value){
     this.initProperty(S_MultiProvince,new Integer(value));
  }
  public  void setMultiProvince(int value){
     this.set(S_MultiProvince,new Integer(value));
  }
  public  void setMultiProvinceNull(){
     this.set(S_MultiProvince,null);
  }

  public int getMultiProvince(){
        return DataType.getAsInt(this.get(S_MultiProvince));
  
  }
  public int getMultiProvinceInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MultiProvince));
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

  public void initServChnl(int value){
     this.initProperty(S_ServChnl,new Integer(value));
  }
  public  void setServChnl(int value){
     this.set(S_ServChnl,new Integer(value));
  }
  public  void setServChnlNull(){
     this.set(S_ServChnl,null);
  }

  public int getServChnl(){
        return DataType.getAsInt(this.get(S_ServChnl));
  
  }
  public int getServChnlInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ServChnl));
      }

  public void initVillageSvrPoint(String value){
     this.initProperty(S_VillageSvrPoint,value);
  }
  public  void setVillageSvrPoint(String value){
     this.set(S_VillageSvrPoint,value);
  }
  public  void setVillageSvrPointNull(){
     this.set(S_VillageSvrPoint,null);
  }

  public String getVillageSvrPoint(){
       return DataType.getAsString(this.get(S_VillageSvrPoint));
  
  }
  public String getVillageSvrPointInitialValue(){
        return DataType.getAsString(this.getOldObj(S_VillageSvrPoint));
      }

  public void initProvGroupType(int value){
     this.initProperty(S_ProvGroupType,new Integer(value));
  }
  public  void setProvGroupType(int value){
     this.set(S_ProvGroupType,new Integer(value));
  }
  public  void setProvGroupTypeNull(){
     this.set(S_ProvGroupType,null);
  }

  public int getProvGroupType(){
        return DataType.getAsInt(this.get(S_ProvGroupType));
  
  }
  public int getProvGroupTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ProvGroupType));
      }

  public void initProdDevChnl(int value){
     this.initProperty(S_ProdDevChnl,new Integer(value));
  }
  public  void setProdDevChnl(int value){
     this.set(S_ProdDevChnl,new Integer(value));
  }
  public  void setProdDevChnlNull(){
     this.set(S_ProdDevChnl,null);
  }

  public int getProdDevChnl(){
        return DataType.getAsInt(this.get(S_ProdDevChnl));
  
  }
  public int getProdDevChnlInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ProdDevChnl));
      }

  public void initDeptLeaderJob(String value){
     this.initProperty(S_DeptLeaderJob,value);
  }
  public  void setDeptLeaderJob(String value){
     this.set(S_DeptLeaderJob,value);
  }
  public  void setDeptLeaderJobNull(){
     this.set(S_DeptLeaderJob,null);
  }

  public String getDeptLeaderJob(){
       return DataType.getAsString(this.get(S_DeptLeaderJob));
  
  }
  public String getDeptLeaderJobInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DeptLeaderJob));
      }

  public void initGroupGlory(String value){
     this.initProperty(S_GroupGlory,value);
  }
  public  void setGroupGlory(String value){
     this.set(S_GroupGlory,value);
  }
  public  void setGroupGloryNull(){
     this.set(S_GroupGlory,null);
  }

  public String getGroupGlory(){
       return DataType.getAsString(this.get(S_GroupGlory));
  
  }
  public String getGroupGloryInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupGlory));
      }

  public void initTradeGroupClustId(long value){
     this.initProperty(S_TradeGroupClustId,new Long(value));
  }
  public  void setTradeGroupClustId(long value){
     this.set(S_TradeGroupClustId,new Long(value));
  }
  public  void setTradeGroupClustIdNull(){
     this.set(S_TradeGroupClustId,null);
  }

  public long getTradeGroupClustId(){
        return DataType.getAsLong(this.get(S_TradeGroupClustId));
  
  }
  public long getTradeGroupClustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_TradeGroupClustId));
      }

  public void initIsSetupAlone(int value){
     this.initProperty(S_IsSetupAlone,new Integer(value));
  }
  public  void setIsSetupAlone(int value){
     this.set(S_IsSetupAlone,new Integer(value));
  }
  public  void setIsSetupAloneNull(){
     this.set(S_IsSetupAlone,null);
  }

  public int getIsSetupAlone(){
        return DataType.getAsInt(this.get(S_IsSetupAlone));
  
  }
  public int getIsSetupAloneInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsSetupAlone));
      }

  public void initTradeGroupClustLevel(int value){
     this.initProperty(S_TradeGroupClustLevel,new Integer(value));
  }
  public  void setTradeGroupClustLevel(int value){
     this.set(S_TradeGroupClustLevel,new Integer(value));
  }
  public  void setTradeGroupClustLevelNull(){
     this.set(S_TradeGroupClustLevel,null);
  }

  public int getTradeGroupClustLevel(){
        return DataType.getAsInt(this.get(S_TradeGroupClustLevel));
  
  }
  public int getTradeGroupClustLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_TradeGroupClustLevel));
      }

  public void initSaleAgency(String value){
     this.initProperty(S_SaleAgency,value);
  }
  public  void setSaleAgency(String value){
     this.set(S_SaleAgency,value);
  }
  public  void setSaleAgencyNull(){
     this.set(S_SaleAgency,null);
  }

  public String getSaleAgency(){
       return DataType.getAsString(this.get(S_SaleAgency));
  
  }
  public String getSaleAgencyInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SaleAgency));
      }

  public void initStaffAmount(long value){
     this.initProperty(S_StaffAmount,new Long(value));
  }
  public  void setStaffAmount(long value){
     this.set(S_StaffAmount,new Long(value));
  }
  public  void setStaffAmountNull(){
     this.set(S_StaffAmount,null);
  }

  public long getStaffAmount(){
        return DataType.getAsLong(this.get(S_StaffAmount));
  
  }
  public long getStaffAmountInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_StaffAmount));
      }

  public void initInformDeptName(String value){
     this.initProperty(S_InformDeptName,value);
  }
  public  void setInformDeptName(String value){
     this.set(S_InformDeptName,value);
  }
  public  void setInformDeptNameNull(){
     this.set(S_InformDeptName,null);
  }

  public String getInformDeptName(){
       return DataType.getAsString(this.get(S_InformDeptName));
  
  }
  public String getInformDeptNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_InformDeptName));
      }

  public void initTownBusinessHall(String value){
     this.initProperty(S_TownBusinessHall,value);
  }
  public  void setTownBusinessHall(String value){
     this.set(S_TownBusinessHall,value);
  }
  public  void setTownBusinessHallNull(){
     this.set(S_TownBusinessHall,null);
  }

  public String getTownBusinessHall(){
       return DataType.getAsString(this.get(S_TownBusinessHall));
  
  }
  public String getTownBusinessHallInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TownBusinessHall));
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

  public void initVpmnCustId(long value){
     this.initProperty(S_VpmnCustId,new Long(value));
  }
  public  void setVpmnCustId(long value){
     this.set(S_VpmnCustId,new Long(value));
  }
  public  void setVpmnCustIdNull(){
     this.set(S_VpmnCustId,null);
  }

  public long getVpmnCustId(){
        return DataType.getAsLong(this.get(S_VpmnCustId));
  
  }
  public long getVpmnCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_VpmnCustId));
      }

  public void initServiceGarrison(int value){
     this.initProperty(S_ServiceGarrison,new Integer(value));
  }
  public  void setServiceGarrison(int value){
     this.set(S_ServiceGarrison,new Integer(value));
  }
  public  void setServiceGarrisonNull(){
     this.set(S_ServiceGarrison,null);
  }

  public int getServiceGarrison(){
        return DataType.getAsInt(this.get(S_ServiceGarrison));
  
  }
  public int getServiceGarrisonInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ServiceGarrison));
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

  public void initIsTop100(int value){
     this.initProperty(S_IsTop100,new Integer(value));
  }
  public  void setIsTop100(int value){
     this.set(S_IsTop100,new Integer(value));
  }
  public  void setIsTop100Null(){
     this.set(S_IsTop100,null);
  }

  public int getIsTop100(){
        return DataType.getAsInt(this.get(S_IsTop100));
  
  }
  public int getIsTop100InitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsTop100));
      }

  public void initServiceBrand(int value){
     this.initProperty(S_ServiceBrand,new Integer(value));
  }
  public  void setServiceBrand(int value){
     this.set(S_ServiceBrand,new Integer(value));
  }
  public  void setServiceBrandNull(){
     this.set(S_ServiceBrand,null);
  }

  public int getServiceBrand(){
        return DataType.getAsInt(this.get(S_ServiceBrand));
  
  }
  public int getServiceBrandInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ServiceBrand));
      }

  public void initGroupIntro(String value){
     this.initProperty(S_GroupIntro,value);
  }
  public  void setGroupIntro(String value){
     this.set(S_GroupIntro,value);
  }
  public  void setGroupIntroNull(){
     this.set(S_GroupIntro,null);
  }

  public String getGroupIntro(){
       return DataType.getAsString(this.get(S_GroupIntro));
  
  }
  public String getGroupIntroInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupIntro));
      }

  public void initGroupSignType(int value){
     this.initProperty(S_GroupSignType,new Integer(value));
  }
  public  void setGroupSignType(int value){
     this.set(S_GroupSignType,new Integer(value));
  }
  public  void setGroupSignTypeNull(){
     this.set(S_GroupSignType,null);
  }

  public int getGroupSignType(){
        return DataType.getAsInt(this.get(S_GroupSignType));
  
  }
  public int getGroupSignTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_GroupSignType));
      }

  public void initNeedCallGroupData(int value){
     this.initProperty(S_NeedCallGroupData,new Integer(value));
  }
  public  void setNeedCallGroupData(int value){
     this.set(S_NeedCallGroupData,new Integer(value));
  }
  public  void setNeedCallGroupDataNull(){
     this.set(S_NeedCallGroupData,null);
  }

  public int getNeedCallGroupData(){
        return DataType.getAsInt(this.get(S_NeedCallGroupData));
  
  }
  public int getNeedCallGroupDataInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_NeedCallGroupData));
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

  public void initConsultWithCont(String value){
     this.initProperty(S_ConsultWithCont,value);
  }
  public  void setConsultWithCont(String value){
     this.set(S_ConsultWithCont,value);
  }
  public  void setConsultWithContNull(){
     this.set(S_ConsultWithCont,null);
  }

  public String getConsultWithCont(){
       return DataType.getAsString(this.get(S_ConsultWithCont));
  
  }
  public String getConsultWithContInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ConsultWithCont));
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

  public void initLocalParentOrgan(String value){
     this.initProperty(S_LocalParentOrgan,value);
  }
  public  void setLocalParentOrgan(String value){
     this.set(S_LocalParentOrgan,value);
  }
  public  void setLocalParentOrganNull(){
     this.set(S_LocalParentOrgan,null);
  }

  public String getLocalParentOrgan(){
       return DataType.getAsString(this.get(S_LocalParentOrgan));
  
  }
  public String getLocalParentOrganInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LocalParentOrgan));
      }

  public void initGroupCulture(String value){
     this.initProperty(S_GroupCulture,value);
  }
  public  void setGroupCulture(String value){
     this.set(S_GroupCulture,value);
  }
  public  void setGroupCultureNull(){
     this.set(S_GroupCulture,null);
  }

  public String getGroupCulture(){
       return DataType.getAsString(this.get(S_GroupCulture));
  
  }
  public String getGroupCultureInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupCulture));
      }

  public void initAssetClass(int value){
     this.initProperty(S_AssetClass,new Integer(value));
  }
  public  void setAssetClass(int value){
     this.set(S_AssetClass,new Integer(value));
  }
  public  void setAssetClassNull(){
     this.set(S_AssetClass,null);
  }

  public int getAssetClass(){
        return DataType.getAsInt(this.get(S_AssetClass));
  
  }
  public int getAssetClassInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_AssetClass));
      }

  public void initUnicomUserNum(int value){
     this.initProperty(S_UnicomUserNum,new Integer(value));
  }
  public  void setUnicomUserNum(int value){
     this.set(S_UnicomUserNum,new Integer(value));
  }
  public  void setUnicomUserNumNull(){
     this.set(S_UnicomUserNum,null);
  }

  public int getUnicomUserNum(){
        return DataType.getAsInt(this.get(S_UnicomUserNum));
  
  }
  public int getUnicomUserNumInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_UnicomUserNum));
      }

  public void initInforFlag(int value){
     this.initProperty(S_InforFlag,new Integer(value));
  }
  public  void setInforFlag(int value){
     this.set(S_InforFlag,new Integer(value));
  }
  public  void setInforFlagNull(){
     this.set(S_InforFlag,null);
  }

  public int getInforFlag(){
        return DataType.getAsInt(this.get(S_InforFlag));
  
  }
  public int getInforFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_InforFlag));
      }

  public void initDeptLeader(String value){
     this.initProperty(S_DeptLeader,value);
  }
  public  void setDeptLeader(String value){
     this.set(S_DeptLeader,value);
  }
  public  void setDeptLeaderNull(){
     this.set(S_DeptLeader,null);
  }

  public String getDeptLeader(){
       return DataType.getAsString(this.get(S_DeptLeader));
  
  }
  public String getDeptLeaderInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DeptLeader));
      }

  public void initComBudget(long value){
     this.initProperty(S_ComBudget,new Long(value));
  }
  public  void setComBudget(long value){
     this.set(S_ComBudget,new Long(value));
  }
  public  void setComBudgetNull(){
     this.set(S_ComBudget,null);
  }

  public long getComBudget(){
        return DataType.getAsLong(this.get(S_ComBudget));
  
  }
  public long getComBudgetInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ComBudget));
      }

  public void initIsProvGrpManaged(int value){
     this.initProperty(S_IsProvGrpManaged,new Integer(value));
  }
  public  void setIsProvGrpManaged(int value){
     this.set(S_IsProvGrpManaged,new Integer(value));
  }
  public  void setIsProvGrpManagedNull(){
     this.set(S_IsProvGrpManaged,null);
  }

  public int getIsProvGrpManaged(){
        return DataType.getAsInt(this.get(S_IsProvGrpManaged));
  
  }
  public int getIsProvGrpManagedInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsProvGrpManaged));
      }

  public void initRelGroupCustId(long value){
     this.initProperty(S_RelGroupCustId,new Long(value));
  }
  public  void setRelGroupCustId(long value){
     this.set(S_RelGroupCustId,new Long(value));
  }
  public  void setRelGroupCustIdNull(){
     this.set(S_RelGroupCustId,null);
  }

  public long getRelGroupCustId(){
        return DataType.getAsLong(this.get(S_RelGroupCustId));
  
  }
  public long getRelGroupCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelGroupCustId));
      }

  public void initFieldService(String value){
     this.initProperty(S_FieldService,value);
  }
  public  void setFieldService(String value){
     this.set(S_FieldService,value);
  }
  public  void setFieldServiceNull(){
     this.set(S_FieldService,null);
  }

  public String getFieldService(){
       return DataType.getAsString(this.get(S_FieldService));
  
  }
  public String getFieldServiceInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FieldService));
      }

  public void initOutdoorStaffRate(String value){
     this.initProperty(S_OutdoorStaffRate,value);
  }
  public  void setOutdoorStaffRate(String value){
     this.set(S_OutdoorStaffRate,value);
  }
  public  void setOutdoorStaffRateNull(){
     this.set(S_OutdoorStaffRate,null);
  }

  public String getOutdoorStaffRate(){
       return DataType.getAsString(this.get(S_OutdoorStaffRate));
  
  }
  public String getOutdoorStaffRateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OutdoorStaffRate));
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

  public void initQuestionType(int value){
     this.initProperty(S_QuestionType,new Integer(value));
  }
  public  void setQuestionType(int value){
     this.set(S_QuestionType,new Integer(value));
  }
  public  void setQuestionTypeNull(){
     this.set(S_QuestionType,null);
  }

  public int getQuestionType(){
        return DataType.getAsInt(this.get(S_QuestionType));
  
  }
  public int getQuestionTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_QuestionType));
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

  public void initCreditPayLevel(int value){
     this.initProperty(S_CreditPayLevel,new Integer(value));
  }
  public  void setCreditPayLevel(int value){
     this.set(S_CreditPayLevel,new Integer(value));
  }
  public  void setCreditPayLevelNull(){
     this.set(S_CreditPayLevel,null);
  }

  public int getCreditPayLevel(){
        return DataType.getAsInt(this.get(S_CreditPayLevel));
  
  }
  public int getCreditPayLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CreditPayLevel));
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

  public void initCreditLevel(int value){
     this.initProperty(S_CreditLevel,new Integer(value));
  }
  public  void setCreditLevel(int value){
     this.set(S_CreditLevel,new Integer(value));
  }
  public  void setCreditLevelNull(){
     this.set(S_CreditLevel,null);
  }

  public int getCreditLevel(){
        return DataType.getAsInt(this.get(S_CreditLevel));
  
  }
  public int getCreditLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CreditLevel));
      }

  public void initGarrisonPeriod(String value){
     this.initProperty(S_GarrisonPeriod,value);
  }
  public  void setGarrisonPeriod(String value){
     this.set(S_GarrisonPeriod,value);
  }
  public  void setGarrisonPeriodNull(){
     this.set(S_GarrisonPeriod,null);
  }

  public String getGarrisonPeriod(){
       return DataType.getAsString(this.get(S_GarrisonPeriod));
  
  }
  public String getGarrisonPeriodInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GarrisonPeriod));
      }

  public void initTelecomUserNum(int value){
     this.initProperty(S_TelecomUserNum,new Integer(value));
  }
  public  void setTelecomUserNum(int value){
     this.set(S_TelecomUserNum,new Integer(value));
  }
  public  void setTelecomUserNumNull(){
     this.set(S_TelecomUserNum,null);
  }

  public int getTelecomUserNum(){
        return DataType.getAsInt(this.get(S_TelecomUserNum));
  
  }
  public int getTelecomUserNumInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_TelecomUserNum));
      }

  public void initLocalParentOrganId(long value){
     this.initProperty(S_LocalParentOrganId,new Long(value));
  }
  public  void setLocalParentOrganId(long value){
     this.set(S_LocalParentOrganId,new Long(value));
  }
  public  void setLocalParentOrganIdNull(){
     this.set(S_LocalParentOrganId,null);
  }

  public long getLocalParentOrganId(){
        return DataType.getAsLong(this.get(S_LocalParentOrganId));
  
  }
  public long getLocalParentOrganIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LocalParentOrganId));
      }

  public void initCmccUserNum(int value){
     this.initProperty(S_CmccUserNum,new Integer(value));
  }
  public  void setCmccUserNum(int value){
     this.set(S_CmccUserNum,new Integer(value));
  }
  public  void setCmccUserNumNull(){
     this.set(S_CmccUserNum,null);
  }

  public int getCmccUserNum(){
        return DataType.getAsInt(this.get(S_CmccUserNum));
  
  }
  public int getCmccUserNumInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CmccUserNum));
      }

  public void initEmphasisBrand(int value){
     this.initProperty(S_EmphasisBrand,new Integer(value));
  }
  public  void setEmphasisBrand(int value){
     this.set(S_EmphasisBrand,new Integer(value));
  }
  public  void setEmphasisBrandNull(){
     this.set(S_EmphasisBrand,null);
  }

  public int getEmphasisBrand(){
        return DataType.getAsInt(this.get(S_EmphasisBrand));
  
  }
  public int getEmphasisBrandInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_EmphasisBrand));
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

  public void initGroupInfo(String value){
     this.initProperty(S_GroupInfo,value);
  }
  public  void setGroupInfo(String value){
     this.set(S_GroupInfo,value);
  }
  public  void setGroupInfoNull(){
     this.set(S_GroupInfo,null);
  }

  public String getGroupInfo(){
       return DataType.getAsString(this.get(S_GroupInfo));
  
  }
  public String getGroupInfoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupInfo));
      }

  public void initInfoFileName(String value){
     this.initProperty(S_InfoFileName,value);
  }
  public  void setInfoFileName(String value){
     this.set(S_InfoFileName,value);
  }
  public  void setInfoFileNameNull(){
     this.set(S_InfoFileName,null);
  }

  public String getInfoFileName(){
       return DataType.getAsString(this.get(S_InfoFileName));
  
  }
  public String getInfoFileNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_InfoFileName));
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

  public void initHqName(String value){
     this.initProperty(S_HqName,value);
  }
  public  void setHqName(String value){
     this.set(S_HqName,value);
  }
  public  void setHqNameNull(){
     this.set(S_HqName,null);
  }

  public String getHqName(){
       return DataType.getAsString(this.get(S_HqName));
  
  }
  public String getHqNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_HqName));
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

  public void initOutdoorStaffNum(int value){
     this.initProperty(S_OutdoorStaffNum,new Integer(value));
  }
  public  void setOutdoorStaffNum(int value){
     this.set(S_OutdoorStaffNum,new Integer(value));
  }
  public  void setOutdoorStaffNumNull(){
     this.set(S_OutdoorStaffNum,null);
  }

  public int getOutdoorStaffNum(){
        return DataType.getAsInt(this.get(S_OutdoorStaffNum));
  
  }
  public int getOutdoorStaffNumInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_OutdoorStaffNum));
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

  public void initAgent(String value){
     this.initProperty(S_Agent,value);
  }
  public  void setAgent(String value){
     this.set(S_Agent,value);
  }
  public  void setAgentNull(){
     this.set(S_Agent,null);
  }

  public String getAgent(){
       return DataType.getAsString(this.get(S_Agent));
  
  }
  public String getAgentInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Agent));
      }

  public void initVocation3(int value){
     this.initProperty(S_Vocation3,new Integer(value));
  }
  public  void setVocation3(int value){
     this.set(S_Vocation3,new Integer(value));
  }
  public  void setVocation3Null(){
     this.set(S_Vocation3,null);
  }

  public int getVocation3(){
        return DataType.getAsInt(this.get(S_Vocation3));
  
  }
  public int getVocation3InitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Vocation3));
      }

  public void initProdStatus(int value){
     this.initProperty(S_ProdStatus,new Integer(value));
  }
  public  void setProdStatus(int value){
     this.set(S_ProdStatus,new Integer(value));
  }
  public  void setProdStatusNull(){
     this.set(S_ProdStatus,null);
  }

  public int getProdStatus(){
        return DataType.getAsInt(this.get(S_ProdStatus));
  
  }
  public int getProdStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ProdStatus));
      }

  public void initDefectType(int value){
     this.initProperty(S_DefectType,new Integer(value));
  }
  public  void setDefectType(int value){
     this.set(S_DefectType,new Integer(value));
  }
  public  void setDefectTypeNull(){
     this.set(S_DefectType,null);
  }

  public int getDefectType(){
        return DataType.getAsInt(this.get(S_DefectType));
  
  }
  public int getDefectTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_DefectType));
      }

  public void initDevChnl(int value){
     this.initProperty(S_DevChnl,new Integer(value));
  }
  public  void setDevChnl(int value){
     this.set(S_DevChnl,new Integer(value));
  }
  public  void setDevChnlNull(){
     this.set(S_DevChnl,null);
  }

  public int getDevChnl(){
        return DataType.getAsInt(this.get(S_DevChnl));
  
  }
  public int getDevChnlInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_DevChnl));
      }

  public void initVocation1(int value){
     this.initProperty(S_Vocation1,new Integer(value));
  }
  public  void setVocation1(int value){
     this.set(S_Vocation1,new Integer(value));
  }
  public  void setVocation1Null(){
     this.set(S_Vocation1,null);
  }

  public int getVocation1(){
        return DataType.getAsInt(this.get(S_Vocation1));
  
  }
  public int getVocation1InitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Vocation1));
      }

  public void initVocation2(int value){
     this.initProperty(S_Vocation2,new Integer(value));
  }
  public  void setVocation2(int value){
     this.set(S_Vocation2,new Integer(value));
  }
  public  void setVocation2Null(){
     this.set(S_Vocation2,null);
  }

  public int getVocation2(){
        return DataType.getAsInt(this.get(S_Vocation2));
  
  }
  public int getVocation2InitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Vocation2));
      }

  public void initLongitude(String value){
     this.initProperty(S_Longitude,value);
  }
  public  void setLongitude(String value){
     this.set(S_Longitude,value);
  }
  public  void setLongitudeNull(){
     this.set(S_Longitude,null);
  }

  public String getLongitude(){
       return DataType.getAsString(this.get(S_Longitude));
  
  }
  public String getLongitudeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Longitude));
      }

  public void initIncomeClass(int value){
     this.initProperty(S_IncomeClass,new Integer(value));
  }
  public  void setIncomeClass(int value){
     this.set(S_IncomeClass,new Integer(value));
  }
  public  void setIncomeClassNull(){
     this.set(S_IncomeClass,null);
  }

  public int getIncomeClass(){
        return DataType.getAsInt(this.get(S_IncomeClass));
  
  }
  public int getIncomeClassInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IncomeClass));
      }


 
 }

