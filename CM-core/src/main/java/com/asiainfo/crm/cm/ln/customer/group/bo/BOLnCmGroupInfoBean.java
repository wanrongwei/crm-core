package com.asiainfo.crm.cm.ln.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.ln.customer.group.ivalues.*;

public class BOLnCmGroupInfoBean extends DataContainer implements DataContainerInterface,IBOLnCmGroupInfoValue{

  private static String  m_boName = "com.asiainfo.crm.cm.ln.customer.group.bo.BOLnCmGroupInfo";



  public final static  String S_Profit = "PROFIT";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_HasPhoto = "HAS_PHOTO";
  public final static  String S_SalesContext = "SALES_CONTEXT";
  public final static  String S_EntScale = "ENT_SCALE";
  public final static  String S_ServChannel = "SERV_CHANNEL";
  public final static  String S_PostCity = "POST_CITY";
  public final static  String S_EffectType = "EFFECT_TYPE";
  public final static  String S_ServBeginTime = "SERV_BEGIN_TIME";
  public final static  String S_CustPassword = "CUST_PASSWORD";
  public final static  String S_CertificateFilePath = "CERTIFICATE_FILE_PATH";
  public final static  String S_CustCertExpire = "CUST_CERT_EXPIRE";
  public final static  String S_CustLanguage = "CUST_LANGUAGE";
  public final static  String S_CustZipcode = "CUST_ZIPCODE";
  public final static  String S_EcCode = "EC_CODE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_SpecWayType = "SPEC_WAY_TYPE";
  public final static  String S_RankingType = "RANKING_TYPE";
  public final static  String S_GroupFax = "GROUP_FAX";
  public final static  String S_UnionNum = "UNION_NUM";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_IsOa = "IS_OA";
  public final static  String S_HeadOffice = "HEAD_OFFICE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_LegalCustId = "LEGAL_CUST_ID";
  public final static  String S_HopeDiscount = "HOPE_DISCOUNT";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_VillegeId = "VILLEGE_ID";
  public final static  String S_CustAddress = "CUST_ADDRESS";
  public final static  String S_CgxBudget = "CGX_BUDGET";
  public final static  String S_WriteOffNum = "WRITE_OFF_NUM";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_ServProtocolPath = "SERV_PROTOCOL_PATH";
  public final static  String S_CustServiceLevel = "CUST_SERVICE_LEVEL";
  public final static  String S_ProdDesc = "PROD_DESC";
  public final static  String S_SingOverlay = "SING_OVERLAY";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_CustStatus = "CUST_STATUS";
  public final static  String S_ParentCustId = "PARENT_CUST_ID";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_SubVocation = "SUB_VOCATION";
  public final static  String S_FavorBusi = "FAVOR_BUSI";
  public final static  String S_IsWebsite = "IS_WEBSITE";
  public final static  String S_PostProvince = "POST_PROVINCE";
  public final static  String S_GroupCreditLevel = "GROUP_CREDIT_LEVEL";
  public final static  String S_EntFund = "ENT_FUND";
  public final static  String S_ImpVocationInfo = "IMP_VOCATION_INFO";
  public final static  String S_CustCertType = "CUST_CERT_TYPE";
  public final static  String S_Vocation = "VOCATION";
  public final static  String S_CustCertCode = "CUST_CERT_CODE";
  public final static  String S_TownId = "TOWN_ID";
  public final static  String S_EmpAvgFee = "EMP_AVG_FEE";
  public final static  String S_CompeterInfo = "COMPETER_INFO";
  public final static  String S_OthUseDtl = "OTH_USE_DTL";
  public final static  String S_TaxId = "TAX_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_IsNetwork = "IS_NETWORK";
  public final static  String S_HqNumber = "HQ_NUMBER";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_CustCertEffdate = "CUST_CERT_EFFDATE";
  public final static  String S_StaffAmount = "STAFF_AMOUNT";
  public final static  String S_DevelopType = "DEVELOP_TYPE";
  public final static  String S_WirelessNum = "WIRELESS_NUM";
  public final static  String S_ServiceLevel = "SERVICE_LEVEL";
  public final static  String S_State = "STATE";
  public final static  String S_RegAmount = "REG_AMOUNT";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_SecVocation = "SEC_VOCATION";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_GroupType = "GROUP_TYPE";
  public final static  String S_GroupSubType = "GROUP_SUB_TYPE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_WriteOffAmount = "WRITE_OFF_AMOUNT";
  public final static  String S_Rememeberday = "REMEMEBERDAY";
  public final static  String S_ExpenseType = "EXPENSE_TYPE";
  public final static  String S_IsSwitch = "IS_SWITCH";
  public final static  String S_MobileNum = "MOBILE_NUM";
  public final static  String S_LegalCustName = "LEGAL_CUST_NAME";
  public final static  String S_CustServiceId = "CUST_SERVICE_ID";
  public final static  String S_GrpOrgType = "GRP_ORG_TYPE";
  public final static  String S_Turnover = "TURNOVER";
  public final static  String S_IsEmail = "IS_EMAIL";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_IsErp = "IS_ERP";
  public final static  String S_ServEndTime = "SERV_END_TIME";
  public final static  String S_GrpOrgCode = "GRP_ORG_CODE";
  public final static  String S_UserNum = "USER_NUM";
  public final static  String S_GroupWeb = "GROUP_WEB";
  public final static  String S_CustCertAddress = "CUST_CERT_ADDRESS";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOLnCmGroupInfoBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initProfit(long value){
     this.initProperty(S_Profit,new Long(value));
  }
  public  void setProfit(long value){
     this.set(S_Profit,new Long(value));
  }
  public  void setProfitNull(){
     this.set(S_Profit,null);
  }

  public long getProfit(){
        return DataType.getAsLong(this.get(S_Profit));
  
  }
  public long getProfitInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Profit));
      }

  public void initCityId(String value){
     this.initProperty(S_CityId,value);
  }
  public  void setCityId(String value){
     this.set(S_CityId,value);
  }
  public  void setCityIdNull(){
     this.set(S_CityId,null);
  }

  public String getCityId(){
       return DataType.getAsString(this.get(S_CityId));
  
  }
  public String getCityIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CityId));
      }

  public void initHasPhoto(long value){
     this.initProperty(S_HasPhoto,new Long(value));
  }
  public  void setHasPhoto(long value){
     this.set(S_HasPhoto,new Long(value));
  }
  public  void setHasPhotoNull(){
     this.set(S_HasPhoto,null);
  }

  public long getHasPhoto(){
        return DataType.getAsLong(this.get(S_HasPhoto));
  
  }
  public long getHasPhotoInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_HasPhoto));
      }

  public void initSalesContext(String value){
     this.initProperty(S_SalesContext,value);
  }
  public  void setSalesContext(String value){
     this.set(S_SalesContext,value);
  }
  public  void setSalesContextNull(){
     this.set(S_SalesContext,null);
  }

  public String getSalesContext(){
       return DataType.getAsString(this.get(S_SalesContext));
  
  }
  public String getSalesContextInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SalesContext));
      }

  public void initEntScale(long value){
     this.initProperty(S_EntScale,new Long(value));
  }
  public  void setEntScale(long value){
     this.set(S_EntScale,new Long(value));
  }
  public  void setEntScaleNull(){
     this.set(S_EntScale,null);
  }

  public long getEntScale(){
        return DataType.getAsLong(this.get(S_EntScale));
  
  }
  public long getEntScaleInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_EntScale));
      }

  public void initServChannel(String value){
     this.initProperty(S_ServChannel,value);
  }
  public  void setServChannel(String value){
     this.set(S_ServChannel,value);
  }
  public  void setServChannelNull(){
     this.set(S_ServChannel,null);
  }

  public String getServChannel(){
       return DataType.getAsString(this.get(S_ServChannel));
  
  }
  public String getServChannelInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ServChannel));
      }

  public void initPostCity(String value){
     this.initProperty(S_PostCity,value);
  }
  public  void setPostCity(String value){
     this.set(S_PostCity,value);
  }
  public  void setPostCityNull(){
     this.set(S_PostCity,null);
  }

  public String getPostCity(){
       return DataType.getAsString(this.get(S_PostCity));
  
  }
  public String getPostCityInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PostCity));
      }

  public void initEffectType(long value){
     this.initProperty(S_EffectType,new Long(value));
  }
  public  void setEffectType(long value){
     this.set(S_EffectType,new Long(value));
  }
  public  void setEffectTypeNull(){
     this.set(S_EffectType,null);
  }

  public long getEffectType(){
        return DataType.getAsLong(this.get(S_EffectType));
  
  }
  public long getEffectTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_EffectType));
      }

  public void initServBeginTime(Timestamp value){
     this.initProperty(S_ServBeginTime,value);
  }
  public  void setServBeginTime(Timestamp value){
     this.set(S_ServBeginTime,value);
  }
  public  void setServBeginTimeNull(){
     this.set(S_ServBeginTime,null);
  }

  public Timestamp getServBeginTime(){
        return DataType.getAsDateTime(this.get(S_ServBeginTime));
  
  }
  public Timestamp getServBeginTimeInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ServBeginTime));
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

  public void initCertificateFilePath(String value){
     this.initProperty(S_CertificateFilePath,value);
  }
  public  void setCertificateFilePath(String value){
     this.set(S_CertificateFilePath,value);
  }
  public  void setCertificateFilePathNull(){
     this.set(S_CertificateFilePath,null);
  }

  public String getCertificateFilePath(){
       return DataType.getAsString(this.get(S_CertificateFilePath));
  
  }
  public String getCertificateFilePathInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CertificateFilePath));
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

  public void initCustLanguage(String value){
     this.initProperty(S_CustLanguage,value);
  }
  public  void setCustLanguage(String value){
     this.set(S_CustLanguage,value);
  }
  public  void setCustLanguageNull(){
     this.set(S_CustLanguage,null);
  }

  public String getCustLanguage(){
       return DataType.getAsString(this.get(S_CustLanguage));
  
  }
  public String getCustLanguageInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustLanguage));
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

  public void initSpecWayType(String value){
     this.initProperty(S_SpecWayType,value);
  }
  public  void setSpecWayType(String value){
     this.set(S_SpecWayType,value);
  }
  public  void setSpecWayTypeNull(){
     this.set(S_SpecWayType,null);
  }

  public String getSpecWayType(){
       return DataType.getAsString(this.get(S_SpecWayType));
  
  }
  public String getSpecWayTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SpecWayType));
      }

  public void initRankingType(long value){
     this.initProperty(S_RankingType,new Long(value));
  }
  public  void setRankingType(long value){
     this.set(S_RankingType,new Long(value));
  }
  public  void setRankingTypeNull(){
     this.set(S_RankingType,null);
  }

  public long getRankingType(){
        return DataType.getAsLong(this.get(S_RankingType));
  
  }
  public long getRankingTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RankingType));
      }

  public void initGroupFax(String value){
     this.initProperty(S_GroupFax,value);
  }
  public  void setGroupFax(String value){
     this.set(S_GroupFax,value);
  }
  public  void setGroupFaxNull(){
     this.set(S_GroupFax,null);
  }

  public String getGroupFax(){
       return DataType.getAsString(this.get(S_GroupFax));
  
  }
  public String getGroupFaxInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupFax));
      }

  public void initUnionNum(long value){
     this.initProperty(S_UnionNum,new Long(value));
  }
  public  void setUnionNum(long value){
     this.set(S_UnionNum,new Long(value));
  }
  public  void setUnionNumNull(){
     this.set(S_UnionNum,null);
  }

  public long getUnionNum(){
        return DataType.getAsLong(this.get(S_UnionNum));
  
  }
  public long getUnionNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_UnionNum));
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

  public void initIsOa(long value){
     this.initProperty(S_IsOa,new Long(value));
  }
  public  void setIsOa(long value){
     this.set(S_IsOa,new Long(value));
  }
  public  void setIsOaNull(){
     this.set(S_IsOa,null);
  }

  public long getIsOa(){
        return DataType.getAsLong(this.get(S_IsOa));
  
  }
  public long getIsOaInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsOa));
      }

  public void initHeadOffice(String value){
     this.initProperty(S_HeadOffice,value);
  }
  public  void setHeadOffice(String value){
     this.set(S_HeadOffice,value);
  }
  public  void setHeadOfficeNull(){
     this.set(S_HeadOffice,null);
  }

  public String getHeadOffice(){
       return DataType.getAsString(this.get(S_HeadOffice));
  
  }
  public String getHeadOfficeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_HeadOffice));
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

  public void initPartyId(long value){
     this.initProperty(S_PartyId,new Long(value));
  }
  public  void setPartyId(long value){
     this.set(S_PartyId,new Long(value));
  }
  public  void setPartyIdNull(){
     this.set(S_PartyId,null);
  }

  public long getPartyId(){
        return DataType.getAsLong(this.get(S_PartyId));
  
  }
  public long getPartyIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PartyId));
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

  public void initHopeDiscount(String value){
     this.initProperty(S_HopeDiscount,value);
  }
  public  void setHopeDiscount(String value){
     this.set(S_HopeDiscount,value);
  }
  public  void setHopeDiscountNull(){
     this.set(S_HopeDiscount,null);
  }

  public String getHopeDiscount(){
       return DataType.getAsString(this.get(S_HopeDiscount));
  
  }
  public String getHopeDiscountInitialValue(){
        return DataType.getAsString(this.getOldObj(S_HopeDiscount));
      }

  public void initNationality(String value){
     this.initProperty(S_Nationality,value);
  }
  public  void setNationality(String value){
     this.set(S_Nationality,value);
  }
  public  void setNationalityNull(){
     this.set(S_Nationality,null);
  }

  public String getNationality(){
       return DataType.getAsString(this.get(S_Nationality));
  
  }
  public String getNationalityInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Nationality));
      }

  public void initVillegeId(long value){
     this.initProperty(S_VillegeId,new Long(value));
  }
  public  void setVillegeId(long value){
     this.set(S_VillegeId,new Long(value));
  }
  public  void setVillegeIdNull(){
     this.set(S_VillegeId,null);
  }

  public long getVillegeId(){
        return DataType.getAsLong(this.get(S_VillegeId));
  
  }
  public long getVillegeIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_VillegeId));
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

  public void initCgxBudget(long value){
     this.initProperty(S_CgxBudget,new Long(value));
  }
  public  void setCgxBudget(long value){
     this.set(S_CgxBudget,new Long(value));
  }
  public  void setCgxBudgetNull(){
     this.set(S_CgxBudget,null);
  }

  public long getCgxBudget(){
        return DataType.getAsLong(this.get(S_CgxBudget));
  
  }
  public long getCgxBudgetInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CgxBudget));
      }

  public void initWriteOffNum(long value){
     this.initProperty(S_WriteOffNum,new Long(value));
  }
  public  void setWriteOffNum(long value){
     this.set(S_WriteOffNum,new Long(value));
  }
  public  void setWriteOffNumNull(){
     this.set(S_WriteOffNum,null);
  }

  public long getWriteOffNum(){
        return DataType.getAsLong(this.get(S_WriteOffNum));
  
  }
  public long getWriteOffNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_WriteOffNum));
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

  public void initServProtocolPath(String value){
     this.initProperty(S_ServProtocolPath,value);
  }
  public  void setServProtocolPath(String value){
     this.set(S_ServProtocolPath,value);
  }
  public  void setServProtocolPathNull(){
     this.set(S_ServProtocolPath,null);
  }

  public String getServProtocolPath(){
       return DataType.getAsString(this.get(S_ServProtocolPath));
  
  }
  public String getServProtocolPathInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ServProtocolPath));
      }

  public void initCustServiceLevel(long value){
     this.initProperty(S_CustServiceLevel,new Long(value));
  }
  public  void setCustServiceLevel(long value){
     this.set(S_CustServiceLevel,new Long(value));
  }
  public  void setCustServiceLevelNull(){
     this.set(S_CustServiceLevel,null);
  }

  public long getCustServiceLevel(){
        return DataType.getAsLong(this.get(S_CustServiceLevel));
  
  }
  public long getCustServiceLevelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustServiceLevel));
      }

  public void initProdDesc(String value){
     this.initProperty(S_ProdDesc,value);
  }
  public  void setProdDesc(String value){
     this.set(S_ProdDesc,value);
  }
  public  void setProdDescNull(){
     this.set(S_ProdDesc,null);
  }

  public String getProdDesc(){
       return DataType.getAsString(this.get(S_ProdDesc));
  
  }
  public String getProdDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ProdDesc));
      }

  public void initSingOverlay(String value){
     this.initProperty(S_SingOverlay,value);
  }
  public  void setSingOverlay(String value){
     this.set(S_SingOverlay,value);
  }
  public  void setSingOverlayNull(){
     this.set(S_SingOverlay,null);
  }

  public String getSingOverlay(){
       return DataType.getAsString(this.get(S_SingOverlay));
  
  }
  public String getSingOverlayInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SingOverlay));
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

  public void initProvinceId(String value){
     this.initProperty(S_ProvinceId,value);
  }
  public  void setProvinceId(String value){
     this.set(S_ProvinceId,value);
  }
  public  void setProvinceIdNull(){
     this.set(S_ProvinceId,null);
  }

  public String getProvinceId(){
       return DataType.getAsString(this.get(S_ProvinceId));
  
  }
  public String getProvinceIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ProvinceId));
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

  public void initSubVocation(long value){
     this.initProperty(S_SubVocation,new Long(value));
  }
  public  void setSubVocation(long value){
     this.set(S_SubVocation,new Long(value));
  }
  public  void setSubVocationNull(){
     this.set(S_SubVocation,null);
  }

  public long getSubVocation(){
        return DataType.getAsLong(this.get(S_SubVocation));
  
  }
  public long getSubVocationInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SubVocation));
      }

  public void initFavorBusi(String value){
     this.initProperty(S_FavorBusi,value);
  }
  public  void setFavorBusi(String value){
     this.set(S_FavorBusi,value);
  }
  public  void setFavorBusiNull(){
     this.set(S_FavorBusi,null);
  }

  public String getFavorBusi(){
       return DataType.getAsString(this.get(S_FavorBusi));
  
  }
  public String getFavorBusiInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FavorBusi));
      }

  public void initIsWebsite(long value){
     this.initProperty(S_IsWebsite,new Long(value));
  }
  public  void setIsWebsite(long value){
     this.set(S_IsWebsite,new Long(value));
  }
  public  void setIsWebsiteNull(){
     this.set(S_IsWebsite,null);
  }

  public long getIsWebsite(){
        return DataType.getAsLong(this.get(S_IsWebsite));
  
  }
  public long getIsWebsiteInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsWebsite));
      }

  public void initPostProvince(String value){
     this.initProperty(S_PostProvince,value);
  }
  public  void setPostProvince(String value){
     this.set(S_PostProvince,value);
  }
  public  void setPostProvinceNull(){
     this.set(S_PostProvince,null);
  }

  public String getPostProvince(){
       return DataType.getAsString(this.get(S_PostProvince));
  
  }
  public String getPostProvinceInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PostProvince));
      }

  public void initGroupCreditLevel(long value){
     this.initProperty(S_GroupCreditLevel,new Long(value));
  }
  public  void setGroupCreditLevel(long value){
     this.set(S_GroupCreditLevel,new Long(value));
  }
  public  void setGroupCreditLevelNull(){
     this.set(S_GroupCreditLevel,null);
  }

  public long getGroupCreditLevel(){
        return DataType.getAsLong(this.get(S_GroupCreditLevel));
  
  }
  public long getGroupCreditLevelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupCreditLevel));
      }

  public void initEntFund(long value){
     this.initProperty(S_EntFund,new Long(value));
  }
  public  void setEntFund(long value){
     this.set(S_EntFund,new Long(value));
  }
  public  void setEntFundNull(){
     this.set(S_EntFund,null);
  }

  public long getEntFund(){
        return DataType.getAsLong(this.get(S_EntFund));
  
  }
  public long getEntFundInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_EntFund));
      }

  public void initImpVocationInfo(long value){
     this.initProperty(S_ImpVocationInfo,new Long(value));
  }
  public  void setImpVocationInfo(long value){
     this.set(S_ImpVocationInfo,new Long(value));
  }
  public  void setImpVocationInfoNull(){
     this.set(S_ImpVocationInfo,null);
  }

  public long getImpVocationInfo(){
        return DataType.getAsLong(this.get(S_ImpVocationInfo));
  
  }
  public long getImpVocationInfoInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ImpVocationInfo));
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

  public void initVocation(long value){
     this.initProperty(S_Vocation,new Long(value));
  }
  public  void setVocation(long value){
     this.set(S_Vocation,new Long(value));
  }
  public  void setVocationNull(){
     this.set(S_Vocation,null);
  }

  public long getVocation(){
        return DataType.getAsLong(this.get(S_Vocation));
  
  }
  public long getVocationInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Vocation));
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

  public void initTownId(long value){
     this.initProperty(S_TownId,new Long(value));
  }
  public  void setTownId(long value){
     this.set(S_TownId,new Long(value));
  }
  public  void setTownIdNull(){
     this.set(S_TownId,null);
  }

  public long getTownId(){
        return DataType.getAsLong(this.get(S_TownId));
  
  }
  public long getTownIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_TownId));
      }

  public void initEmpAvgFee(long value){
     this.initProperty(S_EmpAvgFee,new Long(value));
  }
  public  void setEmpAvgFee(long value){
     this.set(S_EmpAvgFee,new Long(value));
  }
  public  void setEmpAvgFeeNull(){
     this.set(S_EmpAvgFee,null);
  }

  public long getEmpAvgFee(){
        return DataType.getAsLong(this.get(S_EmpAvgFee));
  
  }
  public long getEmpAvgFeeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_EmpAvgFee));
      }

  public void initCompeterInfo(String value){
     this.initProperty(S_CompeterInfo,value);
  }
  public  void setCompeterInfo(String value){
     this.set(S_CompeterInfo,value);
  }
  public  void setCompeterInfoNull(){
     this.set(S_CompeterInfo,null);
  }

  public String getCompeterInfo(){
       return DataType.getAsString(this.get(S_CompeterInfo));
  
  }
  public String getCompeterInfoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CompeterInfo));
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

  public void initIsNetwork(long value){
     this.initProperty(S_IsNetwork,new Long(value));
  }
  public  void setIsNetwork(long value){
     this.set(S_IsNetwork,new Long(value));
  }
  public  void setIsNetworkNull(){
     this.set(S_IsNetwork,null);
  }

  public long getIsNetwork(){
        return DataType.getAsLong(this.get(S_IsNetwork));
  
  }
  public long getIsNetworkInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsNetwork));
      }

  public void initHqNumber(String value){
     this.initProperty(S_HqNumber,value);
  }
  public  void setHqNumber(String value){
     this.set(S_HqNumber,value);
  }
  public  void setHqNumberNull(){
     this.set(S_HqNumber,null);
  }

  public String getHqNumber(){
       return DataType.getAsString(this.get(S_HqNumber));
  
  }
  public String getHqNumberInitialValue(){
        return DataType.getAsString(this.getOldObj(S_HqNumber));
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

  public void initCustCertEffdate(Timestamp value){
     this.initProperty(S_CustCertEffdate,value);
  }
  public  void setCustCertEffdate(Timestamp value){
     this.set(S_CustCertEffdate,value);
  }
  public  void setCustCertEffdateNull(){
     this.set(S_CustCertEffdate,null);
  }

  public Timestamp getCustCertEffdate(){
        return DataType.getAsDateTime(this.get(S_CustCertEffdate));
  
  }
  public Timestamp getCustCertEffdateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CustCertEffdate));
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

  public void initWirelessNum(long value){
     this.initProperty(S_WirelessNum,new Long(value));
  }
  public  void setWirelessNum(long value){
     this.set(S_WirelessNum,new Long(value));
  }
  public  void setWirelessNumNull(){
     this.set(S_WirelessNum,null);
  }

  public long getWirelessNum(){
        return DataType.getAsLong(this.get(S_WirelessNum));
  
  }
  public long getWirelessNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_WirelessNum));
      }

  public void initServiceLevel(long value){
     this.initProperty(S_ServiceLevel,new Long(value));
  }
  public  void setServiceLevel(long value){
     this.set(S_ServiceLevel,new Long(value));
  }
  public  void setServiceLevelNull(){
     this.set(S_ServiceLevel,null);
  }

  public long getServiceLevel(){
        return DataType.getAsLong(this.get(S_ServiceLevel));
  
  }
  public long getServiceLevelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ServiceLevel));
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

  public void initRegAmount(long value){
     this.initProperty(S_RegAmount,new Long(value));
  }
  public  void setRegAmount(long value){
     this.set(S_RegAmount,new Long(value));
  }
  public  void setRegAmountNull(){
     this.set(S_RegAmount,null);
  }

  public long getRegAmount(){
        return DataType.getAsLong(this.get(S_RegAmount));
  
  }
  public long getRegAmountInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RegAmount));
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

  public void initSecVocation(long value){
     this.initProperty(S_SecVocation,new Long(value));
  }
  public  void setSecVocation(long value){
     this.set(S_SecVocation,new Long(value));
  }
  public  void setSecVocationNull(){
     this.set(S_SecVocation,null);
  }

  public long getSecVocation(){
        return DataType.getAsLong(this.get(S_SecVocation));
  
  }
  public long getSecVocationInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SecVocation));
      }

  public void initCreditValue(long value){
     this.initProperty(S_CreditValue,new Long(value));
  }
  public  void setCreditValue(long value){
     this.set(S_CreditValue,new Long(value));
  }
  public  void setCreditValueNull(){
     this.set(S_CreditValue,null);
  }

  public long getCreditValue(){
        return DataType.getAsLong(this.get(S_CreditValue));
  
  }
  public long getCreditValueInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CreditValue));
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

  public void initGroupSubType(long value){
     this.initProperty(S_GroupSubType,new Long(value));
  }
  public  void setGroupSubType(long value){
     this.set(S_GroupSubType,new Long(value));
  }
  public  void setGroupSubTypeNull(){
     this.set(S_GroupSubType,null);
  }

  public long getGroupSubType(){
        return DataType.getAsLong(this.get(S_GroupSubType));
  
  }
  public long getGroupSubTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupSubType));
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

  public void initWriteOffAmount(long value){
     this.initProperty(S_WriteOffAmount,new Long(value));
  }
  public  void setWriteOffAmount(long value){
     this.set(S_WriteOffAmount,new Long(value));
  }
  public  void setWriteOffAmountNull(){
     this.set(S_WriteOffAmount,null);
  }

  public long getWriteOffAmount(){
        return DataType.getAsLong(this.get(S_WriteOffAmount));
  
  }
  public long getWriteOffAmountInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_WriteOffAmount));
      }

  public void initRememeberday(Timestamp value){
     this.initProperty(S_Rememeberday,value);
  }
  public  void setRememeberday(Timestamp value){
     this.set(S_Rememeberday,value);
  }
  public  void setRememeberdayNull(){
     this.set(S_Rememeberday,null);
  }

  public Timestamp getRememeberday(){
        return DataType.getAsDateTime(this.get(S_Rememeberday));
  
  }
  public Timestamp getRememeberdayInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_Rememeberday));
      }

  public void initExpenseType(long value){
     this.initProperty(S_ExpenseType,new Long(value));
  }
  public  void setExpenseType(long value){
     this.set(S_ExpenseType,new Long(value));
  }
  public  void setExpenseTypeNull(){
     this.set(S_ExpenseType,null);
  }

  public long getExpenseType(){
        return DataType.getAsLong(this.get(S_ExpenseType));
  
  }
  public long getExpenseTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ExpenseType));
      }

  public void initIsSwitch(long value){
     this.initProperty(S_IsSwitch,new Long(value));
  }
  public  void setIsSwitch(long value){
     this.set(S_IsSwitch,new Long(value));
  }
  public  void setIsSwitchNull(){
     this.set(S_IsSwitch,null);
  }

  public long getIsSwitch(){
        return DataType.getAsLong(this.get(S_IsSwitch));
  
  }
  public long getIsSwitchInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsSwitch));
      }

  public void initMobileNum(long value){
     this.initProperty(S_MobileNum,new Long(value));
  }
  public  void setMobileNum(long value){
     this.set(S_MobileNum,new Long(value));
  }
  public  void setMobileNumNull(){
     this.set(S_MobileNum,null);
  }

  public long getMobileNum(){
        return DataType.getAsLong(this.get(S_MobileNum));
  
  }
  public long getMobileNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MobileNum));
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

  public void initCustServiceId(String value){
     this.initProperty(S_CustServiceId,value);
  }
  public  void setCustServiceId(String value){
     this.set(S_CustServiceId,value);
  }
  public  void setCustServiceIdNull(){
     this.set(S_CustServiceId,null);
  }

  public String getCustServiceId(){
       return DataType.getAsString(this.get(S_CustServiceId));
  
  }
  public String getCustServiceIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustServiceId));
      }

  public void initGrpOrgType(String value){
     this.initProperty(S_GrpOrgType,value);
  }
  public  void setGrpOrgType(String value){
     this.set(S_GrpOrgType,value);
  }
  public  void setGrpOrgTypeNull(){
     this.set(S_GrpOrgType,null);
  }

  public String getGrpOrgType(){
       return DataType.getAsString(this.get(S_GrpOrgType));
  
  }
  public String getGrpOrgTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GrpOrgType));
      }

  public void initTurnover(long value){
     this.initProperty(S_Turnover,new Long(value));
  }
  public  void setTurnover(long value){
     this.set(S_Turnover,new Long(value));
  }
  public  void setTurnoverNull(){
     this.set(S_Turnover,null);
  }

  public long getTurnover(){
        return DataType.getAsLong(this.get(S_Turnover));
  
  }
  public long getTurnoverInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Turnover));
      }

  public void initIsEmail(long value){
     this.initProperty(S_IsEmail,new Long(value));
  }
  public  void setIsEmail(long value){
     this.set(S_IsEmail,new Long(value));
  }
  public  void setIsEmailNull(){
     this.set(S_IsEmail,null);
  }

  public long getIsEmail(){
        return DataType.getAsLong(this.get(S_IsEmail));
  
  }
  public long getIsEmailInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsEmail));
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

  public void initCountyId(String value){
     this.initProperty(S_CountyId,value);
  }
  public  void setCountyId(String value){
     this.set(S_CountyId,value);
  }
  public  void setCountyIdNull(){
     this.set(S_CountyId,null);
  }

  public String getCountyId(){
       return DataType.getAsString(this.get(S_CountyId));
  
  }
  public String getCountyIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CountyId));
      }

  public void initIsErp(long value){
     this.initProperty(S_IsErp,new Long(value));
  }
  public  void setIsErp(long value){
     this.set(S_IsErp,new Long(value));
  }
  public  void setIsErpNull(){
     this.set(S_IsErp,null);
  }

  public long getIsErp(){
        return DataType.getAsLong(this.get(S_IsErp));
  
  }
  public long getIsErpInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsErp));
      }

  public void initServEndTime(Timestamp value){
     this.initProperty(S_ServEndTime,value);
  }
  public  void setServEndTime(Timestamp value){
     this.set(S_ServEndTime,value);
  }
  public  void setServEndTimeNull(){
     this.set(S_ServEndTime,null);
  }

  public Timestamp getServEndTime(){
        return DataType.getAsDateTime(this.get(S_ServEndTime));
  
  }
  public Timestamp getServEndTimeInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ServEndTime));
      }

  public void initGrpOrgCode(String value){
     this.initProperty(S_GrpOrgCode,value);
  }
  public  void setGrpOrgCode(String value){
     this.set(S_GrpOrgCode,value);
  }
  public  void setGrpOrgCodeNull(){
     this.set(S_GrpOrgCode,null);
  }

  public String getGrpOrgCode(){
       return DataType.getAsString(this.get(S_GrpOrgCode));
  
  }
  public String getGrpOrgCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GrpOrgCode));
      }

  public void initUserNum(long value){
     this.initProperty(S_UserNum,new Long(value));
  }
  public  void setUserNum(long value){
     this.set(S_UserNum,new Long(value));
  }
  public  void setUserNumNull(){
     this.set(S_UserNum,null);
  }

  public long getUserNum(){
        return DataType.getAsLong(this.get(S_UserNum));
  
  }
  public long getUserNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_UserNum));
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


 
 }

