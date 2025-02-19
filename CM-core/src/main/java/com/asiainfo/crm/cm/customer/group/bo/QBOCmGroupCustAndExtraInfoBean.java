package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class QBOCmGroupCustAndExtraInfoBean extends DataContainer implements DataContainerInterface,IQBOCmGroupCustAndExtraInfoValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.QBOCmGroupCustAndExtraInfo";



  public final static  String S_PostAddress = "POST_ADDRESS";
  public final static  String S_CustLevel = "CUST_LEVEL";
  public final static  String S_GroupCountyId = "GROUP_COUNTY_ID";
  public final static  String S_BusiArea = "BUSI_AREA";
  public final static  String S_GroupProvinceId = "GROUP_PROVINCE_ID";
  public final static  String S_JobSpec = "JOB_SPEC";
  public final static  String S_Latitude = "LATITUDE";
  public final static  String S_GroupOfficeNetwork = "GROUP_OFFICE_NETWORK";
  public final static  String S_BaseCustId = "BASE_CUST_ID";
  public final static  String S_SaOperId = "SA_OPER_ID";
  public final static  String S_PostCity = "POST_CITY";
  public final static  String S_GroupSubRegionType = "GROUP_SUB_REGION_TYPE";
  public final static  String S_GroupTownId = "GROUP_TOWN_ID";
  public final static  String S_CustPassword = "CUST_PASSWORD";
  public final static  String S_OrganBillboard = "ORGAN_BILLBOARD";
  public final static  String S_CustCertExpire = "CUST_CERT_EXPIRE";
  public final static  String S_GroupCityId = "GROUP_CITY_ID";
  public final static  String S_CustZipcode = "CUST_ZIPCODE";
  public final static  String S_EcCode = "EC_CODE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_ChnlCityId = "CHNL_CITY_ID";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_VillageSvrPoint = "VILLAGE_SVR_POINT";
  public final static  String S_GroupGlory = "GROUP_GLORY";
  public final static  String S_TradeGroupClustId = "TRADE_GROUP_CLUST_ID";
  public final static  String S_IsSetupAlone = "IS_SETUP_ALONE";
  public final static  String S_TownBusinessHall = "TOWN_BUSINESS_HALL";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ServiceBrand = "SERVICE_BRAND";
  public final static  String S_GroupSignType = "GROUP_SIGN_TYPE";
  public final static  String S_NeedCallGroupData = "NEED_CALL_GROUP_DATA";
  public final static  String S_LegalCustId = "LEGAL_CUST_ID";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_ComBudget = "COM_BUDGET";
  public final static  String S_CustAddress = "CUST_ADDRESS";
  public final static  String S_IsProvGrpManaged = "IS_PROV_GRP_MANAGED";
  public final static  String S_FieldService = "FIELD_SERVICE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_OutdoorStaffRate = "OUTDOOR_STAFF_RATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CreditPayLevel = "CREDIT_PAY_LEVEL";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_IsHaved = "IS_HAVED";
  public final static  String S_CustStatus = "CUST_STATUS";
  public final static  String S_LocalParentOrganId = "LOCAL_PARENT_ORGAN_ID";
  public final static  String S_ParentCustId = "PARENT_CUST_ID";
  public final static  String S_GroupInfo = "GROUP_INFO";
  public final static  String S_HqName = "HQ_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_Agent = "AGENT";
  public final static  String S_DefectType = "DEFECT_TYPE";
  public final static  String S_GroupVillegeId = "GROUP_VILLEGE_ID";
  public final static  String S_Longitude = "LONGITUDE";
  public final static  String S_DeptLeaderPhone = "DEPT_LEADER_PHONE";
  public final static  String S_GroupInformTrade = "GROUP_INFORM_TRADE";
  public final static  String S_PostProvince = "POST_PROVINCE";
  public final static  String S_GroupPayType = "GROUP_PAY_TYPE";
  public final static  String S_GroupRegionType = "GROUP_REGION_TYPE";
  public final static  String S_ChnlRegionType = "CHNL_REGION_TYPE";
  public final static  String S_GroupDate = "GROUP_DATE";
  public final static  String S_CustCertType = "CUST_CERT_TYPE";
  public final static  String S_CustCertCode = "CUST_CERT_CODE";
  public final static  String S_OrganType = "ORGAN_TYPE";
  public final static  String S_ChnlRegionDetail = "CHNL_REGION_DETAIL";
  public final static  String S_InfoFilePath = "INFO_FILE_PATH";
  public final static  String S_OthUseDtl = "OTH_USE_DTL";
  public final static  String S_TaxId = "TAX_ID";
  public final static  String S_MultiProvince = "MULTI_PROVINCE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ServChnl = "SERV_CHNL";
  public final static  String S_ProvGroupType = "PROV_GROUP_TYPE";
  public final static  String S_ProdDevChnl = "PROD_DEV_CHNL";
  public final static  String S_DeptLeaderJob = "DEPT_LEADER_JOB";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_ChnlProvinceId = "CHNL_PROVINCE_ID";
  public final static  String S_TradeGroupClustLevel = "TRADE_GROUP_CLUST_LEVEL";
  public final static  String S_SaleAgency = "SALE_AGENCY";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_StaffAmount = "STAFF_AMOUNT";
  public final static  String S_InformDeptName = "INFORM_DEPT_NAME";
  public final static  String S_VpmnCustId = "VPMN_CUST_ID";
  public final static  String S_ServiceGarrison = "SERVICE_GARRISON";
  public final static  String S_DevelopType = "DEVELOP_TYPE";
  public final static  String S_GroupStatus = "GROUP_STATUS";
  public final static  String S_IsTop100 = "IS_TOP100";
  public final static  String S_GroupIntro = "GROUP_INTRO";
  public final static  String S_State = "STATE";
  public final static  String S_ConsultWithCont = "CONSULT_WITH_CONT";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_LocalParentOrgan = "LOCAL_PARENT_ORGAN";
  public final static  String S_GroupCulture = "GROUP_CULTURE";
  public final static  String S_AssetClass = "ASSET_CLASS";
  public final static  String S_UnicomUserNum = "UNICOM_USER_NUM";
  public final static  String S_ContName = "CONT_NAME";
  public final static  String S_InforFlag = "INFOR_FLAG";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_DeptLeader = "DEPT_LEADER";
  public final static  String S_GroupType = "GROUP_TYPE";
  public final static  String S_RelGroupCustId = "REL_GROUP_CUST_ID";
  public final static  String S_PostPostcode = "POST_POSTCODE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_QuestionType = "QUESTION_TYPE";
  public final static  String S_ContPhone2 = "CONT_PHONE2";
  public final static  String S_ContPhone1 = "CONT_PHONE1";
  public final static  String S_Notes = "NOTES";
  public final static  String S_GarrisonPeriod = "GARRISON_PERIOD";
  public final static  String S_TelecomUserNum = "TELECOM_USER_NUM";
  public final static  String S_LegalCustName = "LEGAL_CUST_NAME";
  public final static  String S_PartnerId = "PARTNER_ID";
  public final static  String S_CmccUserNum = "CMCC_USER_NUM";
  public final static  String S_EmphasisBrand = "EMPHASIS_BRAND";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_InfoFileName = "INFO_FILE_NAME";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_OutdoorStaffNum = "OUTDOOR_STAFF_NUM";
  public final static  String S_Vocation3 = "VOCATION3";
  public final static  String S_ProdStatus = "PROD_STATUS";
  public final static  String S_CoreMemNum = "CORE_MEM_NUM";
  public final static  String S_DevChnl = "DEV_CHNL";
  public final static  String S_Vocation1 = "VOCATION1";
  public final static  String S_Vocation2 = "VOCATION2";
  public final static  String S_IncomeClass = "INCOME_CLASS";
  public final static  String S_CompetitorInfo = "COMPETITOR_INFO";
  public final static  String S_ContFax = "CONT_FAX";
  public final static  String S_CustCertAddress = "CUST_CERT_ADDRESS";
  public final static  String S_GroupWeb = "GROUP_WEB";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmGroupCustAndExtraInfoBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initPostAddress(String value){
     this.initProperty(S_PostAddress,value);
  }
  public  void setPostAddress(String value){
     this.set(S_PostAddress,value);
  }
  public  void setPostAddressNull(){
     this.set(S_PostAddress,null);
  }

  public String getPostAddress(){
       return DataType.getAsString(this.get(S_PostAddress));
  
  }
  public String getPostAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PostAddress));
      }

  public void initCustLevel(long value){
     this.initProperty(S_CustLevel,new Long(value));
  }
  public  void setCustLevel(long value){
     this.set(S_CustLevel,new Long(value));
  }
  public  void setCustLevelNull(){
     this.set(S_CustLevel,null);
  }

  public long getCustLevel(){
        return DataType.getAsLong(this.get(S_CustLevel));
  
  }
  public long getCustLevelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustLevel));
      }

  public void initGroupCountyId(long value){
     this.initProperty(S_GroupCountyId,new Long(value));
  }
  public  void setGroupCountyId(long value){
     this.set(S_GroupCountyId,new Long(value));
  }
  public  void setGroupCountyIdNull(){
     this.set(S_GroupCountyId,null);
  }

  public long getGroupCountyId(){
        return DataType.getAsLong(this.get(S_GroupCountyId));
  
  }
  public long getGroupCountyIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupCountyId));
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

  public void initGroupProvinceId(long value){
     this.initProperty(S_GroupProvinceId,new Long(value));
  }
  public  void setGroupProvinceId(long value){
     this.set(S_GroupProvinceId,new Long(value));
  }
  public  void setGroupProvinceIdNull(){
     this.set(S_GroupProvinceId,null);
  }

  public long getGroupProvinceId(){
        return DataType.getAsLong(this.get(S_GroupProvinceId));
  
  }
  public long getGroupProvinceIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupProvinceId));
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

  public void initBaseCustId(long value){
     this.initProperty(S_BaseCustId,new Long(value));
  }
  public  void setBaseCustId(long value){
     this.set(S_BaseCustId,new Long(value));
  }
  public  void setBaseCustIdNull(){
     this.set(S_BaseCustId,null);
  }

  public long getBaseCustId(){
        return DataType.getAsLong(this.get(S_BaseCustId));
  
  }
  public long getBaseCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BaseCustId));
      }

  public void initSaOperId(long value){
     this.initProperty(S_SaOperId,new Long(value));
  }
  public  void setSaOperId(long value){
     this.set(S_SaOperId,new Long(value));
  }
  public  void setSaOperIdNull(){
     this.set(S_SaOperId,null);
  }

  public long getSaOperId(){
        return DataType.getAsLong(this.get(S_SaOperId));
  
  }
  public long getSaOperIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SaOperId));
      }

  public void initPostCity(long value){
     this.initProperty(S_PostCity,new Long(value));
  }
  public  void setPostCity(long value){
     this.set(S_PostCity,new Long(value));
  }
  public  void setPostCityNull(){
     this.set(S_PostCity,null);
  }

  public long getPostCity(){
        return DataType.getAsLong(this.get(S_PostCity));
  
  }
  public long getPostCityInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PostCity));
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

  public void initGroupTownId(long value){
     this.initProperty(S_GroupTownId,new Long(value));
  }
  public  void setGroupTownId(long value){
     this.set(S_GroupTownId,new Long(value));
  }
  public  void setGroupTownIdNull(){
     this.set(S_GroupTownId,null);
  }

  public long getGroupTownId(){
        return DataType.getAsLong(this.get(S_GroupTownId));
  
  }
  public long getGroupTownIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupTownId));
      }

  public void initCustPassword(String value){
     this.initProperty(S_CustPassword,value);
  }
  public  void setCustPassword(String value){
     this.set(S_CustPassword,value);
  }
  public  void setCustPasswordNull(){
     this.set(S_CustPassword,null);
  }

  public String getCustPassword(){
       return DataType.getAsString(this.get(S_CustPassword));
  
  }
  public String getCustPasswordInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustPassword));
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

  public void initCustCertExpire(Timestamp value){
     this.initProperty(S_CustCertExpire,value);
  }
  public  void setCustCertExpire(Timestamp value){
     this.set(S_CustCertExpire,value);
  }
  public  void setCustCertExpireNull(){
     this.set(S_CustCertExpire,null);
  }

  public Timestamp getCustCertExpire(){
        return DataType.getAsDateTime(this.get(S_CustCertExpire));
  
  }
  public Timestamp getCustCertExpireInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CustCertExpire));
      }

  public void initGroupCityId(long value){
     this.initProperty(S_GroupCityId,new Long(value));
  }
  public  void setGroupCityId(long value){
     this.set(S_GroupCityId,new Long(value));
  }
  public  void setGroupCityIdNull(){
     this.set(S_GroupCityId,null);
  }

  public long getGroupCityId(){
        return DataType.getAsLong(this.get(S_GroupCityId));
  
  }
  public long getGroupCityIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupCityId));
      }

  public void initCustZipcode(String value){
     this.initProperty(S_CustZipcode,value);
  }
  public  void setCustZipcode(String value){
     this.set(S_CustZipcode,value);
  }
  public  void setCustZipcodeNull(){
     this.set(S_CustZipcode,null);
  }

  public String getCustZipcode(){
       return DataType.getAsString(this.get(S_CustZipcode));
  
  }
  public String getCustZipcodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustZipcode));
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

  public void initChnlCityId(String value){
     this.initProperty(S_ChnlCityId,value);
  }
  public  void setChnlCityId(String value){
     this.set(S_ChnlCityId,value);
  }
  public  void setChnlCityIdNull(){
     this.set(S_ChnlCityId,null);
  }

  public String getChnlCityId(){
       return DataType.getAsString(this.get(S_ChnlCityId));
  
  }
  public String getChnlCityIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ChnlCityId));
      }

  public void initGroupId(long value){
     this.initProperty(S_GroupId,new Long(value));
  }
  public  void setGroupId(long value){
     this.set(S_GroupId,new Long(value));
  }
  public  void setGroupIdNull(){
     this.set(S_GroupId,null);
  }

  public long getGroupId(){
        return DataType.getAsLong(this.get(S_GroupId));
  
  }
  public long getGroupIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupId));
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

  public void initIsSetupAlone(long value){
     this.initProperty(S_IsSetupAlone,new Long(value));
  }
  public  void setIsSetupAlone(long value){
     this.set(S_IsSetupAlone,new Long(value));
  }
  public  void setIsSetupAloneNull(){
     this.set(S_IsSetupAlone,null);
  }

  public long getIsSetupAlone(){
        return DataType.getAsLong(this.get(S_IsSetupAlone));
  
  }
  public long getIsSetupAloneInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsSetupAlone));
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

  public void initServiceBrand(long value){
     this.initProperty(S_ServiceBrand,new Long(value));
  }
  public  void setServiceBrand(long value){
     this.set(S_ServiceBrand,new Long(value));
  }
  public  void setServiceBrandNull(){
     this.set(S_ServiceBrand,null);
  }

  public long getServiceBrand(){
        return DataType.getAsLong(this.get(S_ServiceBrand));
  
  }
  public long getServiceBrandInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ServiceBrand));
      }

  public void initGroupSignType(long value){
     this.initProperty(S_GroupSignType,new Long(value));
  }
  public  void setGroupSignType(long value){
     this.set(S_GroupSignType,new Long(value));
  }
  public  void setGroupSignTypeNull(){
     this.set(S_GroupSignType,null);
  }

  public long getGroupSignType(){
        return DataType.getAsLong(this.get(S_GroupSignType));
  
  }
  public long getGroupSignTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupSignType));
      }

  public void initNeedCallGroupData(long value){
     this.initProperty(S_NeedCallGroupData,new Long(value));
  }
  public  void setNeedCallGroupData(long value){
     this.set(S_NeedCallGroupData,new Long(value));
  }
  public  void setNeedCallGroupDataNull(){
     this.set(S_NeedCallGroupData,null);
  }

  public long getNeedCallGroupData(){
        return DataType.getAsLong(this.get(S_NeedCallGroupData));
  
  }
  public long getNeedCallGroupDataInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_NeedCallGroupData));
      }

  public void initLegalCustId(long value){
     this.initProperty(S_LegalCustId,new Long(value));
  }
  public  void setLegalCustId(long value){
     this.set(S_LegalCustId,new Long(value));
  }
  public  void setLegalCustIdNull(){
     this.set(S_LegalCustId,null);
  }

  public long getLegalCustId(){
        return DataType.getAsLong(this.get(S_LegalCustId));
  
  }
  public long getLegalCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LegalCustId));
      }

  public void initNationality(long value){
     this.initProperty(S_Nationality,new Long(value));
  }
  public  void setNationality(long value){
     this.set(S_Nationality,new Long(value));
  }
  public  void setNationalityNull(){
     this.set(S_Nationality,null);
  }

  public long getNationality(){
        return DataType.getAsLong(this.get(S_Nationality));
  
  }
  public long getNationalityInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Nationality));
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

  public void initCustAddress(String value){
     this.initProperty(S_CustAddress,value);
  }
  public  void setCustAddress(String value){
     this.set(S_CustAddress,value);
  }
  public  void setCustAddressNull(){
     this.set(S_CustAddress,null);
  }

  public String getCustAddress(){
       return DataType.getAsString(this.get(S_CustAddress));
  
  }
  public String getCustAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustAddress));
      }

  public void initIsProvGrpManaged(long value){
     this.initProperty(S_IsProvGrpManaged,new Long(value));
  }
  public  void setIsProvGrpManaged(long value){
     this.set(S_IsProvGrpManaged,new Long(value));
  }
  public  void setIsProvGrpManagedNull(){
     this.set(S_IsProvGrpManaged,null);
  }

  public long getIsProvGrpManaged(){
        return DataType.getAsLong(this.get(S_IsProvGrpManaged));
  
  }
  public long getIsProvGrpManagedInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsProvGrpManaged));
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

  public void initCreditPayLevel(long value){
     this.initProperty(S_CreditPayLevel,new Long(value));
  }
  public  void setCreditPayLevel(long value){
     this.set(S_CreditPayLevel,new Long(value));
  }
  public  void setCreditPayLevelNull(){
     this.set(S_CreditPayLevel,null);
  }

  public long getCreditPayLevel(){
        return DataType.getAsLong(this.get(S_CreditPayLevel));
  
  }
  public long getCreditPayLevelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CreditPayLevel));
      }

  public void initCreditLevel(long value){
     this.initProperty(S_CreditLevel,new Long(value));
  }
  public  void setCreditLevel(long value){
     this.set(S_CreditLevel,new Long(value));
  }
  public  void setCreditLevelNull(){
     this.set(S_CreditLevel,null);
  }

  public long getCreditLevel(){
        return DataType.getAsLong(this.get(S_CreditLevel));
  
  }
  public long getCreditLevelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CreditLevel));
      }

  public void initIsHaved(long value){
     this.initProperty(S_IsHaved,new Long(value));
  }
  public  void setIsHaved(long value){
     this.set(S_IsHaved,new Long(value));
  }
  public  void setIsHavedNull(){
     this.set(S_IsHaved,null);
  }

  public long getIsHaved(){
        return DataType.getAsLong(this.get(S_IsHaved));
  
  }
  public long getIsHavedInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsHaved));
      }

  public void initCustStatus(long value){
     this.initProperty(S_CustStatus,new Long(value));
  }
  public  void setCustStatus(long value){
     this.set(S_CustStatus,new Long(value));
  }
  public  void setCustStatusNull(){
     this.set(S_CustStatus,null);
  }

  public long getCustStatus(){
        return DataType.getAsLong(this.get(S_CustStatus));
  
  }
  public long getCustStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustStatus));
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

  public void initParentCustId(long value){
     this.initProperty(S_ParentCustId,new Long(value));
  }
  public  void setParentCustId(long value){
     this.set(S_ParentCustId,new Long(value));
  }
  public  void setParentCustIdNull(){
     this.set(S_ParentCustId,null);
  }

  public long getParentCustId(){
        return DataType.getAsLong(this.get(S_ParentCustId));
  
  }
  public long getParentCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ParentCustId));
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

  public void initDefectType(long value){
     this.initProperty(S_DefectType,new Long(value));
  }
  public  void setDefectType(long value){
     this.set(S_DefectType,new Long(value));
  }
  public  void setDefectTypeNull(){
     this.set(S_DefectType,null);
  }

  public long getDefectType(){
        return DataType.getAsLong(this.get(S_DefectType));
  
  }
  public long getDefectTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DefectType));
      }

  public void initGroupVillegeId(long value){
     this.initProperty(S_GroupVillegeId,new Long(value));
  }
  public  void setGroupVillegeId(long value){
     this.set(S_GroupVillegeId,new Long(value));
  }
  public  void setGroupVillegeIdNull(){
     this.set(S_GroupVillegeId,null);
  }

  public long getGroupVillegeId(){
        return DataType.getAsLong(this.get(S_GroupVillegeId));
  
  }
  public long getGroupVillegeIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupVillegeId));
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

  public void initPostProvince(long value){
     this.initProperty(S_PostProvince,new Long(value));
  }
  public  void setPostProvince(long value){
     this.set(S_PostProvince,new Long(value));
  }
  public  void setPostProvinceNull(){
     this.set(S_PostProvince,null);
  }

  public long getPostProvince(){
        return DataType.getAsLong(this.get(S_PostProvince));
  
  }
  public long getPostProvinceInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PostProvince));
      }

  public void initGroupPayType(long value){
     this.initProperty(S_GroupPayType,new Long(value));
  }
  public  void setGroupPayType(long value){
     this.set(S_GroupPayType,new Long(value));
  }
  public  void setGroupPayTypeNull(){
     this.set(S_GroupPayType,null);
  }

  public long getGroupPayType(){
        return DataType.getAsLong(this.get(S_GroupPayType));
  
  }
  public long getGroupPayTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupPayType));
      }

  public void initGroupRegionType(long value){
     this.initProperty(S_GroupRegionType,new Long(value));
  }
  public  void setGroupRegionType(long value){
     this.set(S_GroupRegionType,new Long(value));
  }
  public  void setGroupRegionTypeNull(){
     this.set(S_GroupRegionType,null);
  }

  public long getGroupRegionType(){
        return DataType.getAsLong(this.get(S_GroupRegionType));
  
  }
  public long getGroupRegionTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupRegionType));
      }

  public void initChnlRegionType(String value){
     this.initProperty(S_ChnlRegionType,value);
  }
  public  void setChnlRegionType(String value){
     this.set(S_ChnlRegionType,value);
  }
  public  void setChnlRegionTypeNull(){
     this.set(S_ChnlRegionType,null);
  }

  public String getChnlRegionType(){
       return DataType.getAsString(this.get(S_ChnlRegionType));
  
  }
  public String getChnlRegionTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ChnlRegionType));
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

  public void initCustCertType(long value){
     this.initProperty(S_CustCertType,new Long(value));
  }
  public  void setCustCertType(long value){
     this.set(S_CustCertType,new Long(value));
  }
  public  void setCustCertTypeNull(){
     this.set(S_CustCertType,null);
  }

  public long getCustCertType(){
        return DataType.getAsLong(this.get(S_CustCertType));
  
  }
  public long getCustCertTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustCertType));
      }

  public void initCustCertCode(String value){
     this.initProperty(S_CustCertCode,value);
  }
  public  void setCustCertCode(String value){
     this.set(S_CustCertCode,value);
  }
  public  void setCustCertCodeNull(){
     this.set(S_CustCertCode,null);
  }

  public String getCustCertCode(){
       return DataType.getAsString(this.get(S_CustCertCode));
  
  }
  public String getCustCertCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustCertCode));
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

  public void initChnlRegionDetail(long value){
     this.initProperty(S_ChnlRegionDetail,new Long(value));
  }
  public  void setChnlRegionDetail(long value){
     this.set(S_ChnlRegionDetail,new Long(value));
  }
  public  void setChnlRegionDetailNull(){
     this.set(S_ChnlRegionDetail,null);
  }

  public long getChnlRegionDetail(){
        return DataType.getAsLong(this.get(S_ChnlRegionDetail));
  
  }
  public long getChnlRegionDetailInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ChnlRegionDetail));
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

  public void initTaxId(String value){
     this.initProperty(S_TaxId,value);
  }
  public  void setTaxId(String value){
     this.set(S_TaxId,value);
  }
  public  void setTaxIdNull(){
     this.set(S_TaxId,null);
  }

  public String getTaxId(){
       return DataType.getAsString(this.get(S_TaxId));
  
  }
  public String getTaxIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TaxId));
      }

  public void initMultiProvince(long value){
     this.initProperty(S_MultiProvince,new Long(value));
  }
  public  void setMultiProvince(long value){
     this.set(S_MultiProvince,new Long(value));
  }
  public  void setMultiProvinceNull(){
     this.set(S_MultiProvince,null);
  }

  public long getMultiProvince(){
        return DataType.getAsLong(this.get(S_MultiProvince));
  
  }
  public long getMultiProvinceInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MultiProvince));
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

  public void initServChnl(long value){
     this.initProperty(S_ServChnl,new Long(value));
  }
  public  void setServChnl(long value){
     this.set(S_ServChnl,new Long(value));
  }
  public  void setServChnlNull(){
     this.set(S_ServChnl,null);
  }

  public long getServChnl(){
        return DataType.getAsLong(this.get(S_ServChnl));
  
  }
  public long getServChnlInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ServChnl));
      }

  public void initProvGroupType(long value){
     this.initProperty(S_ProvGroupType,new Long(value));
  }
  public  void setProvGroupType(long value){
     this.set(S_ProvGroupType,new Long(value));
  }
  public  void setProvGroupTypeNull(){
     this.set(S_ProvGroupType,null);
  }

  public long getProvGroupType(){
        return DataType.getAsLong(this.get(S_ProvGroupType));
  
  }
  public long getProvGroupTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ProvGroupType));
      }

  public void initProdDevChnl(long value){
     this.initProperty(S_ProdDevChnl,new Long(value));
  }
  public  void setProdDevChnl(long value){
     this.set(S_ProdDevChnl,new Long(value));
  }
  public  void setProdDevChnlNull(){
     this.set(S_ProdDevChnl,null);
  }

  public long getProdDevChnl(){
        return DataType.getAsLong(this.get(S_ProdDevChnl));
  
  }
  public long getProdDevChnlInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ProdDevChnl));
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

  public void initContEmail(String value){
     this.initProperty(S_ContEmail,value);
  }
  public  void setContEmail(String value){
     this.set(S_ContEmail,value);
  }
  public  void setContEmailNull(){
     this.set(S_ContEmail,null);
  }

  public String getContEmail(){
       return DataType.getAsString(this.get(S_ContEmail));
  
  }
  public String getContEmailInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContEmail));
      }

  public void initChnlProvinceId(long value){
     this.initProperty(S_ChnlProvinceId,new Long(value));
  }
  public  void setChnlProvinceId(long value){
     this.set(S_ChnlProvinceId,new Long(value));
  }
  public  void setChnlProvinceIdNull(){
     this.set(S_ChnlProvinceId,null);
  }

  public long getChnlProvinceId(){
        return DataType.getAsLong(this.get(S_ChnlProvinceId));
  
  }
  public long getChnlProvinceIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ChnlProvinceId));
      }

  public void initTradeGroupClustLevel(long value){
     this.initProperty(S_TradeGroupClustLevel,new Long(value));
  }
  public  void setTradeGroupClustLevel(long value){
     this.set(S_TradeGroupClustLevel,new Long(value));
  }
  public  void setTradeGroupClustLevelNull(){
     this.set(S_TradeGroupClustLevel,null);
  }

  public long getTradeGroupClustLevel(){
        return DataType.getAsLong(this.get(S_TradeGroupClustLevel));
  
  }
  public long getTradeGroupClustLevelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_TradeGroupClustLevel));
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

  public void initCustName(String value){
     this.initProperty(S_CustName,value);
  }
  public  void setCustName(String value){
     this.set(S_CustName,value);
  }
  public  void setCustNameNull(){
     this.set(S_CustName,null);
  }

  public String getCustName(){
       return DataType.getAsString(this.get(S_CustName));
  
  }
  public String getCustNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustName));
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

  public void initServiceGarrison(long value){
     this.initProperty(S_ServiceGarrison,new Long(value));
  }
  public  void setServiceGarrison(long value){
     this.set(S_ServiceGarrison,new Long(value));
  }
  public  void setServiceGarrisonNull(){
     this.set(S_ServiceGarrison,null);
  }

  public long getServiceGarrison(){
        return DataType.getAsLong(this.get(S_ServiceGarrison));
  
  }
  public long getServiceGarrisonInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ServiceGarrison));
      }

  public void initDevelopType(long value){
     this.initProperty(S_DevelopType,new Long(value));
  }
  public  void setDevelopType(long value){
     this.set(S_DevelopType,new Long(value));
  }
  public  void setDevelopTypeNull(){
     this.set(S_DevelopType,null);
  }

  public long getDevelopType(){
        return DataType.getAsLong(this.get(S_DevelopType));
  
  }
  public long getDevelopTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DevelopType));
      }

  public void initGroupStatus(long value){
     this.initProperty(S_GroupStatus,new Long(value));
  }
  public  void setGroupStatus(long value){
     this.set(S_GroupStatus,new Long(value));
  }
  public  void setGroupStatusNull(){
     this.set(S_GroupStatus,null);
  }

  public long getGroupStatus(){
        return DataType.getAsLong(this.get(S_GroupStatus));
  
  }
  public long getGroupStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupStatus));
      }

  public void initIsTop100(long value){
     this.initProperty(S_IsTop100,new Long(value));
  }
  public  void setIsTop100(long value){
     this.set(S_IsTop100,new Long(value));
  }
  public  void setIsTop100Null(){
     this.set(S_IsTop100,null);
  }

  public long getIsTop100(){
        return DataType.getAsLong(this.get(S_IsTop100));
  
  }
  public long getIsTop100InitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsTop100));
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

  public void initAssetClass(long value){
     this.initProperty(S_AssetClass,new Long(value));
  }
  public  void setAssetClass(long value){
     this.set(S_AssetClass,new Long(value));
  }
  public  void setAssetClassNull(){
     this.set(S_AssetClass,null);
  }

  public long getAssetClass(){
        return DataType.getAsLong(this.get(S_AssetClass));
  
  }
  public long getAssetClassInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AssetClass));
      }

  public void initUnicomUserNum(long value){
     this.initProperty(S_UnicomUserNum,new Long(value));
  }
  public  void setUnicomUserNum(long value){
     this.set(S_UnicomUserNum,new Long(value));
  }
  public  void setUnicomUserNumNull(){
     this.set(S_UnicomUserNum,null);
  }

  public long getUnicomUserNum(){
        return DataType.getAsLong(this.get(S_UnicomUserNum));
  
  }
  public long getUnicomUserNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_UnicomUserNum));
      }

  public void initContName(String value){
     this.initProperty(S_ContName,value);
  }
  public  void setContName(String value){
     this.set(S_ContName,value);
  }
  public  void setContNameNull(){
     this.set(S_ContName,null);
  }

  public String getContName(){
       return DataType.getAsString(this.get(S_ContName));
  
  }
  public String getContNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContName));
      }

  public void initInforFlag(long value){
     this.initProperty(S_InforFlag,new Long(value));
  }
  public  void setInforFlag(long value){
     this.set(S_InforFlag,new Long(value));
  }
  public  void setInforFlagNull(){
     this.set(S_InforFlag,null);
  }

  public long getInforFlag(){
        return DataType.getAsLong(this.get(S_InforFlag));
  
  }
  public long getInforFlagInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_InforFlag));
      }

  public void initShortName(String value){
     this.initProperty(S_ShortName,value);
  }
  public  void setShortName(String value){
     this.set(S_ShortName,value);
  }
  public  void setShortNameNull(){
     this.set(S_ShortName,null);
  }

  public String getShortName(){
       return DataType.getAsString(this.get(S_ShortName));
  
  }
  public String getShortNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ShortName));
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

  public void initGroupType(long value){
     this.initProperty(S_GroupType,new Long(value));
  }
  public  void setGroupType(long value){
     this.set(S_GroupType,new Long(value));
  }
  public  void setGroupTypeNull(){
     this.set(S_GroupType,null);
  }

  public long getGroupType(){
        return DataType.getAsLong(this.get(S_GroupType));
  
  }
  public long getGroupTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupType));
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

  public void initPostPostcode(long value){
     this.initProperty(S_PostPostcode,new Long(value));
  }
  public  void setPostPostcode(long value){
     this.set(S_PostPostcode,new Long(value));
  }
  public  void setPostPostcodeNull(){
     this.set(S_PostPostcode,null);
  }

  public long getPostPostcode(){
        return DataType.getAsLong(this.get(S_PostPostcode));
  
  }
  public long getPostPostcodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PostPostcode));
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

  public void initQuestionType(long value){
     this.initProperty(S_QuestionType,new Long(value));
  }
  public  void setQuestionType(long value){
     this.set(S_QuestionType,new Long(value));
  }
  public  void setQuestionTypeNull(){
     this.set(S_QuestionType,null);
  }

  public long getQuestionType(){
        return DataType.getAsLong(this.get(S_QuestionType));
  
  }
  public long getQuestionTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_QuestionType));
      }

  public void initContPhone2(String value){
     this.initProperty(S_ContPhone2,value);
  }
  public  void setContPhone2(String value){
     this.set(S_ContPhone2,value);
  }
  public  void setContPhone2Null(){
     this.set(S_ContPhone2,null);
  }

  public String getContPhone2(){
       return DataType.getAsString(this.get(S_ContPhone2));
  
  }
  public String getContPhone2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContPhone2));
      }

  public void initContPhone1(String value){
     this.initProperty(S_ContPhone1,value);
  }
  public  void setContPhone1(String value){
     this.set(S_ContPhone1,value);
  }
  public  void setContPhone1Null(){
     this.set(S_ContPhone1,null);
  }

  public String getContPhone1(){
       return DataType.getAsString(this.get(S_ContPhone1));
  
  }
  public String getContPhone1InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContPhone1));
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

  public void initTelecomUserNum(long value){
     this.initProperty(S_TelecomUserNum,new Long(value));
  }
  public  void setTelecomUserNum(long value){
     this.set(S_TelecomUserNum,new Long(value));
  }
  public  void setTelecomUserNumNull(){
     this.set(S_TelecomUserNum,null);
  }

  public long getTelecomUserNum(){
        return DataType.getAsLong(this.get(S_TelecomUserNum));
  
  }
  public long getTelecomUserNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_TelecomUserNum));
      }

  public void initLegalCustName(String value){
     this.initProperty(S_LegalCustName,value);
  }
  public  void setLegalCustName(String value){
     this.set(S_LegalCustName,value);
  }
  public  void setLegalCustNameNull(){
     this.set(S_LegalCustName,null);
  }

  public String getLegalCustName(){
       return DataType.getAsString(this.get(S_LegalCustName));
  
  }
  public String getLegalCustNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LegalCustName));
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

  public void initCmccUserNum(long value){
     this.initProperty(S_CmccUserNum,new Long(value));
  }
  public  void setCmccUserNum(long value){
     this.set(S_CmccUserNum,new Long(value));
  }
  public  void setCmccUserNumNull(){
     this.set(S_CmccUserNum,null);
  }

  public long getCmccUserNum(){
        return DataType.getAsLong(this.get(S_CmccUserNum));
  
  }
  public long getCmccUserNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CmccUserNum));
      }

  public void initEmphasisBrand(long value){
     this.initProperty(S_EmphasisBrand,new Long(value));
  }
  public  void setEmphasisBrand(long value){
     this.set(S_EmphasisBrand,new Long(value));
  }
  public  void setEmphasisBrandNull(){
     this.set(S_EmphasisBrand,null);
  }

  public long getEmphasisBrand(){
        return DataType.getAsLong(this.get(S_EmphasisBrand));
  
  }
  public long getEmphasisBrandInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_EmphasisBrand));
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

  public void initOutdoorStaffNum(long value){
     this.initProperty(S_OutdoorStaffNum,new Long(value));
  }
  public  void setOutdoorStaffNum(long value){
     this.set(S_OutdoorStaffNum,new Long(value));
  }
  public  void setOutdoorStaffNumNull(){
     this.set(S_OutdoorStaffNum,null);
  }

  public long getOutdoorStaffNum(){
        return DataType.getAsLong(this.get(S_OutdoorStaffNum));
  
  }
  public long getOutdoorStaffNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OutdoorStaffNum));
      }

  public void initVocation3(long value){
     this.initProperty(S_Vocation3,new Long(value));
  }
  public  void setVocation3(long value){
     this.set(S_Vocation3,new Long(value));
  }
  public  void setVocation3Null(){
     this.set(S_Vocation3,null);
  }

  public long getVocation3(){
        return DataType.getAsLong(this.get(S_Vocation3));
  
  }
  public long getVocation3InitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Vocation3));
      }

  public void initProdStatus(long value){
     this.initProperty(S_ProdStatus,new Long(value));
  }
  public  void setProdStatus(long value){
     this.set(S_ProdStatus,new Long(value));
  }
  public  void setProdStatusNull(){
     this.set(S_ProdStatus,null);
  }

  public long getProdStatus(){
        return DataType.getAsLong(this.get(S_ProdStatus));
  
  }
  public long getProdStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ProdStatus));
      }

  public void initCoreMemNum(long value){
     this.initProperty(S_CoreMemNum,new Long(value));
  }
  public  void setCoreMemNum(long value){
     this.set(S_CoreMemNum,new Long(value));
  }
  public  void setCoreMemNumNull(){
     this.set(S_CoreMemNum,null);
  }

  public long getCoreMemNum(){
        return DataType.getAsLong(this.get(S_CoreMemNum));
  
  }
  public long getCoreMemNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CoreMemNum));
      }

  public void initDevChnl(long value){
     this.initProperty(S_DevChnl,new Long(value));
  }
  public  void setDevChnl(long value){
     this.set(S_DevChnl,new Long(value));
  }
  public  void setDevChnlNull(){
     this.set(S_DevChnl,null);
  }

  public long getDevChnl(){
        return DataType.getAsLong(this.get(S_DevChnl));
  
  }
  public long getDevChnlInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DevChnl));
      }

  public void initVocation1(long value){
     this.initProperty(S_Vocation1,new Long(value));
  }
  public  void setVocation1(long value){
     this.set(S_Vocation1,new Long(value));
  }
  public  void setVocation1Null(){
     this.set(S_Vocation1,null);
  }

  public long getVocation1(){
        return DataType.getAsLong(this.get(S_Vocation1));
  
  }
  public long getVocation1InitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Vocation1));
      }

  public void initVocation2(long value){
     this.initProperty(S_Vocation2,new Long(value));
  }
  public  void setVocation2(long value){
     this.set(S_Vocation2,new Long(value));
  }
  public  void setVocation2Null(){
     this.set(S_Vocation2,null);
  }

  public long getVocation2(){
        return DataType.getAsLong(this.get(S_Vocation2));
  
  }
  public long getVocation2InitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Vocation2));
      }

  public void initIncomeClass(long value){
     this.initProperty(S_IncomeClass,new Long(value));
  }
  public  void setIncomeClass(long value){
     this.set(S_IncomeClass,new Long(value));
  }
  public  void setIncomeClassNull(){
     this.set(S_IncomeClass,null);
  }

  public long getIncomeClass(){
        return DataType.getAsLong(this.get(S_IncomeClass));
  
  }
  public long getIncomeClassInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IncomeClass));
      }

  public void initCompetitorInfo(String value){
     this.initProperty(S_CompetitorInfo,value);
  }
  public  void setCompetitorInfo(String value){
     this.set(S_CompetitorInfo,value);
  }
  public  void setCompetitorInfoNull(){
     this.set(S_CompetitorInfo,null);
  }

  public String getCompetitorInfo(){
       return DataType.getAsString(this.get(S_CompetitorInfo));
  
  }
  public String getCompetitorInfoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CompetitorInfo));
      }

  public void initContFax(String value){
     this.initProperty(S_ContFax,value);
  }
  public  void setContFax(String value){
     this.set(S_ContFax,value);
  }
  public  void setContFaxNull(){
     this.set(S_ContFax,null);
  }

  public String getContFax(){
       return DataType.getAsString(this.get(S_ContFax));
  
  }
  public String getContFaxInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContFax));
      }

  public void initCustCertAddress(String value){
     this.initProperty(S_CustCertAddress,value);
  }
  public  void setCustCertAddress(String value){
     this.set(S_CustCertAddress,value);
  }
  public  void setCustCertAddressNull(){
     this.set(S_CustCertAddress,null);
  }

  public String getCustCertAddress(){
       return DataType.getAsString(this.get(S_CustCertAddress));
  
  }
  public String getCustCertAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustCertAddress));
      }

  public void initGroupWeb(String value){
     this.initProperty(S_GroupWeb,value);
  }
  public  void setGroupWeb(String value){
     this.set(S_GroupWeb,value);
  }
  public  void setGroupWebNull(){
     this.set(S_GroupWeb,null);
  }

  public String getGroupWeb(){
       return DataType.getAsString(this.get(S_GroupWeb));
  
  }
  public String getGroupWebInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupWeb));
      }


 
 }

