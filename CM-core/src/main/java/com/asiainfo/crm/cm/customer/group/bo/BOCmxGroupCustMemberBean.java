package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class BOCmxGroupCustMemberBean extends DataContainer implements DataContainerInterface,IBOCmxGroupCustMemberValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.BOCmxGroupCustMember";



  public final static  String S_Budget = "BUDGET";
  public final static  String S_Profit = "PROFIT";
  public final static  String S_IsWebsite = "IS_WEBSITE";
  public final static  String S_HasPhoto = "HAS_PHOTO";
  public final static  String S_PostProvince = "POST_PROVINCE";
  public final static  String S_SalesContext = "SALES_CONTEXT";
  public final static  String S_GroupCreditLevel = "GROUP_CREDIT_LEVEL";
  public final static  String S_EntFund = "ENT_FUND";
  public final static  String S_ImpVocationInfo = "IMP_VOCATION_INFO";
  public final static  String S_EntScale = "ENT_SCALE";
  public final static  String S_ServChannel = "SERV_CHANNEL";
  public final static  String S_PostCity = "POST_CITY";
  public final static  String S_EffectType = "EFFECT_TYPE";
  public final static  String S_ServBeginTime = "SERV_BEGIN_TIME";
  public final static  String S_CertificateFilePath = "CERTIFICATE_FILE_PATH";
  public final static  String S_CompeterInfo = "COMPETER_INFO";
  public final static  String S_EmpAvgFee = "EMP_AVG_FEE";
  public final static  String S_OthUseDtl = "OTH_USE_DTL";
  public final static  String S_TaxId = "TAX_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_IsNetwork = "IS_NETWORK";
  public final static  String S_SpecWayType = "SPEC_WAY_TYPE";
  public final static  String S_IsVpmn = "IS_VPMN";
  public final static  String S_RankingType = "RANKING_TYPE";
  public final static  String S_UnionNum = "UNION_NUM";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_IsOa = "IS_OA";
  public final static  String S_HeadOffice = "HEAD_OFFICE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_WirelessNum = "WIRELESS_NUM";
  public final static  String S_ServiceLevel = "SERVICE_LEVEL";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_SecVocation = "SEC_VOCATION";
  public final static  String S_HopeDiscount = "HOPE_DISCOUNT";
  public final static  String S_WriteOffNum = "WRITE_OFF_NUM";
  public final static  String S_TaxFlag = "TAX_FLAG";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_ServProtocolPath = "SERV_PROTOCOL_PATH";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_WriteOffAmount = "WRITE_OFF_AMOUNT";
  public final static  String S_Rememeberday = "REMEMEBERDAY";
  public final static  String S_SingOverlay = "SING_OVERLAY";
  public final static  String S_ExpenseType = "EXPENSE_TYPE";
  public final static  String S_IsSwitch = "IS_SWITCH";
  public final static  String S_ProdDesc = "PROD_DESC";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_MobileNum = "MOBILE_NUM";
  public final static  String S_GrpOrgType = "GRP_ORG_TYPE";
  public final static  String S_Turnover = "TURNOVER";
  public final static  String S_IsEmail = "IS_EMAIL";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_FavorBusi = "FAVOR_BUSI";
  public final static  String S_IsErp = "IS_ERP";
  public final static  String S_ServEndTime = "SERV_END_TIME";
  public final static  String S_GrpOrgCode = "GRP_ORG_CODE";
  public final static  String S_UserNum = "USER_NUM";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmxGroupCustMemberBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initBudget(long value){
     this.initProperty(S_Budget,new Long(value));
  }
  public  void setBudget(long value){
     this.set(S_Budget,new Long(value));
  }
  public  void setBudgetNull(){
     this.set(S_Budget,null);
  }

  public long getBudget(){
        return DataType.getAsLong(this.get(S_Budget));
  
  }
  public long getBudgetInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Budget));
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

  public void initIsVpmn(long value){
     this.initProperty(S_IsVpmn,new Long(value));
  }
  public  void setIsVpmn(long value){
     this.set(S_IsVpmn,new Long(value));
  }
  public  void setIsVpmnNull(){
     this.set(S_IsVpmn,null);
  }

  public long getIsVpmn(){
        return DataType.getAsLong(this.get(S_IsVpmn));
  
  }
  public long getIsVpmnInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsVpmn));
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

  public void initTaxFlag(long value){
     this.initProperty(S_TaxFlag,new Long(value));
  }
  public  void setTaxFlag(long value){
     this.set(S_TaxFlag,new Long(value));
  }
  public  void setTaxFlagNull(){
     this.set(S_TaxFlag,null);
  }

  public long getTaxFlag(){
        return DataType.getAsLong(this.get(S_TaxFlag));
  
  }
  public long getTaxFlagInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_TaxFlag));
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


 
 }

