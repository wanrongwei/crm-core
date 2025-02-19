package com.asiainfo.crm.cm.inner.customer.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.customer.ivalues.*;

public class BOCmxGroupAddInfoBean extends DataContainer implements DataContainerInterface,IBOCmxGroupAddInfoValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.customer.bo.BOCmxGroupAddInfo";



  public final static  String S_PostAddress = "POST_ADDRESS";
  public final static  String S_Profit = "PROFIT";
  public final static  String S_KernelLevel = "KERNEL_LEVEL";
  public final static  String S_PostProvince = "POST_PROVINCE";
  public final static  String S_SingleBusinessScope = "SINGLE_BUSINESS_SCOPE";
  public final static  String S_Arpu = "ARPU";
  public final static  String S_PostCity = "POST_CITY";
  public final static  String S_OrganType = "ORGAN_TYPE";
  public final static  String S_SpecailImportantLevel = "SPECAIL_IMPORTANT_LEVEL";
  public final static  String S_ClusterCustomerType = "CLUSTER_CUSTOMER_TYPE";
  public final static  String S_OthUseDtl = "OTH_USE_DTL";
  public final static  String S_TaxId = "TAX_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ClusterType = "CLUSTER_TYPE";
  public final static  String S_SaleScope = "SALE_SCOPE";
  public final static  String S_UnionNum = "UNION_NUM";
  public final static  String S_Brief = "BRIEF";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_WirelessNum = "WIRELESS_NUM";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_RegionSpecial = "REGION_SPECIAL";
  public final static  String S_IsStandard = "IS_STANDARD";
  public final static  String S_CreditDegree = "CREDIT_DEGREE";
  public final static  String S_PostPostcode = "POST_POSTCODE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ExpenseType = "EXPENSE_TYPE";
  public final static  String S_Email = "EMAIL";
  public final static  String S_ProdDesc = "PROD_DESC";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_EspVocation = "ESP_VOCATION";
  public final static  String S_VpmnNum = "VPMN_NUM";
  public final static  String S_MobileNum = "MOBILE_NUM";
  public final static  String S_CommunicationExpense = "COMMUNICATION_EXPENSE";
  public final static  String S_ServiceChannel = "SERVICE_CHANNEL";
  public final static  String S_Turnover = "TURNOVER";
  public final static  String S_AAttitude = "A_ATTITUDE";
  public final static  String S_Brname = "BRNAME";
  public final static  String S_Contact = "CONTACT";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_PayType = "PAY_TYPE";
  public final static  String S_CompelereInfo = "COMPELERE_INFO";
  public final static  String S_Msisdn = "MSISDN";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmxGroupAddInfoBean() throws AIException{
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

  public void initKernelLevel(int value){
     this.initProperty(S_KernelLevel,new Integer(value));
  }
  public  void setKernelLevel(int value){
     this.set(S_KernelLevel,new Integer(value));
  }
  public  void setKernelLevelNull(){
     this.set(S_KernelLevel,null);
  }

  public int getKernelLevel(){
        return DataType.getAsInt(this.get(S_KernelLevel));
  
  }
  public int getKernelLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_KernelLevel));
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

  public void initSingleBusinessScope(int value){
     this.initProperty(S_SingleBusinessScope,new Integer(value));
  }
  public  void setSingleBusinessScope(int value){
     this.set(S_SingleBusinessScope,new Integer(value));
  }
  public  void setSingleBusinessScopeNull(){
     this.set(S_SingleBusinessScope,null);
  }

  public int getSingleBusinessScope(){
        return DataType.getAsInt(this.get(S_SingleBusinessScope));
  
  }
  public int getSingleBusinessScopeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_SingleBusinessScope));
      }

  public void initArpu(long value){
     this.initProperty(S_Arpu,new Long(value));
  }
  public  void setArpu(long value){
     this.set(S_Arpu,new Long(value));
  }
  public  void setArpuNull(){
     this.set(S_Arpu,null);
  }

  public long getArpu(){
        return DataType.getAsLong(this.get(S_Arpu));
  
  }
  public long getArpuInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Arpu));
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

  public void initOrganType(int value){
     this.initProperty(S_OrganType,new Integer(value));
  }
  public  void setOrganType(int value){
     this.set(S_OrganType,new Integer(value));
  }
  public  void setOrganTypeNull(){
     this.set(S_OrganType,null);
  }

  public int getOrganType(){
        return DataType.getAsInt(this.get(S_OrganType));
  
  }
  public int getOrganTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_OrganType));
      }

  public void initSpecailImportantLevel(int value){
     this.initProperty(S_SpecailImportantLevel,new Integer(value));
  }
  public  void setSpecailImportantLevel(int value){
     this.set(S_SpecailImportantLevel,new Integer(value));
  }
  public  void setSpecailImportantLevelNull(){
     this.set(S_SpecailImportantLevel,null);
  }

  public int getSpecailImportantLevel(){
        return DataType.getAsInt(this.get(S_SpecailImportantLevel));
  
  }
  public int getSpecailImportantLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_SpecailImportantLevel));
      }

  public void initClusterCustomerType(int value){
     this.initProperty(S_ClusterCustomerType,new Integer(value));
  }
  public  void setClusterCustomerType(int value){
     this.set(S_ClusterCustomerType,new Integer(value));
  }
  public  void setClusterCustomerTypeNull(){
     this.set(S_ClusterCustomerType,null);
  }

  public int getClusterCustomerType(){
        return DataType.getAsInt(this.get(S_ClusterCustomerType));
  
  }
  public int getClusterCustomerTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ClusterCustomerType));
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

  public void initClusterType(int value){
     this.initProperty(S_ClusterType,new Integer(value));
  }
  public  void setClusterType(int value){
     this.set(S_ClusterType,new Integer(value));
  }
  public  void setClusterTypeNull(){
     this.set(S_ClusterType,null);
  }

  public int getClusterType(){
        return DataType.getAsInt(this.get(S_ClusterType));
  
  }
  public int getClusterTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ClusterType));
      }

  public void initSaleScope(String value){
     this.initProperty(S_SaleScope,value);
  }
  public  void setSaleScope(String value){
     this.set(S_SaleScope,value);
  }
  public  void setSaleScopeNull(){
     this.set(S_SaleScope,null);
  }

  public String getSaleScope(){
       return DataType.getAsString(this.get(S_SaleScope));
  
  }
  public String getSaleScopeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SaleScope));
      }

  public void initUnionNum(int value){
     this.initProperty(S_UnionNum,new Integer(value));
  }
  public  void setUnionNum(int value){
     this.set(S_UnionNum,new Integer(value));
  }
  public  void setUnionNumNull(){
     this.set(S_UnionNum,null);
  }

  public int getUnionNum(){
        return DataType.getAsInt(this.get(S_UnionNum));
  
  }
  public int getUnionNumInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_UnionNum));
      }

  public void initBrief(String value){
     this.initProperty(S_Brief,value);
  }
  public  void setBrief(String value){
     this.set(S_Brief,value);
  }
  public  void setBriefNull(){
     this.set(S_Brief,null);
  }

  public String getBrief(){
       return DataType.getAsString(this.get(S_Brief));
  
  }
  public String getBriefInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Brief));
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

  public void initWirelessNum(int value){
     this.initProperty(S_WirelessNum,new Integer(value));
  }
  public  void setWirelessNum(int value){
     this.set(S_WirelessNum,new Integer(value));
  }
  public  void setWirelessNumNull(){
     this.set(S_WirelessNum,null);
  }

  public int getWirelessNum(){
        return DataType.getAsInt(this.get(S_WirelessNum));
  
  }
  public int getWirelessNumInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_WirelessNum));
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

  public void initRegionSpecial(int value){
     this.initProperty(S_RegionSpecial,new Integer(value));
  }
  public  void setRegionSpecial(int value){
     this.set(S_RegionSpecial,new Integer(value));
  }
  public  void setRegionSpecialNull(){
     this.set(S_RegionSpecial,null);
  }

  public int getRegionSpecial(){
        return DataType.getAsInt(this.get(S_RegionSpecial));
  
  }
  public int getRegionSpecialInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_RegionSpecial));
      }

  public void initIsStandard(int value){
     this.initProperty(S_IsStandard,new Integer(value));
  }
  public  void setIsStandard(int value){
     this.set(S_IsStandard,new Integer(value));
  }
  public  void setIsStandardNull(){
     this.set(S_IsStandard,null);
  }

  public int getIsStandard(){
        return DataType.getAsInt(this.get(S_IsStandard));
  
  }
  public int getIsStandardInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsStandard));
      }

  public void initCreditDegree(int value){
     this.initProperty(S_CreditDegree,new Integer(value));
  }
  public  void setCreditDegree(int value){
     this.set(S_CreditDegree,new Integer(value));
  }
  public  void setCreditDegreeNull(){
     this.set(S_CreditDegree,null);
  }

  public int getCreditDegree(){
        return DataType.getAsInt(this.get(S_CreditDegree));
  
  }
  public int getCreditDegreeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CreditDegree));
      }

  public void initPostPostcode(String value){
     this.initProperty(S_PostPostcode,value);
  }
  public  void setPostPostcode(String value){
     this.set(S_PostPostcode,value);
  }
  public  void setPostPostcodeNull(){
     this.set(S_PostPostcode,null);
  }

  public String getPostPostcode(){
       return DataType.getAsString(this.get(S_PostPostcode));
  
  }
  public String getPostPostcodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PostPostcode));
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

  public void initExpenseType(int value){
     this.initProperty(S_ExpenseType,new Integer(value));
  }
  public  void setExpenseType(int value){
     this.set(S_ExpenseType,new Integer(value));
  }
  public  void setExpenseTypeNull(){
     this.set(S_ExpenseType,null);
  }

  public int getExpenseType(){
        return DataType.getAsInt(this.get(S_ExpenseType));
  
  }
  public int getExpenseTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ExpenseType));
      }

  public void initEmail(String value){
     this.initProperty(S_Email,value);
  }
  public  void setEmail(String value){
     this.set(S_Email,value);
  }
  public  void setEmailNull(){
     this.set(S_Email,null);
  }

  public String getEmail(){
       return DataType.getAsString(this.get(S_Email));
  
  }
  public String getEmailInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Email));
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

  public void initEspVocation(int value){
     this.initProperty(S_EspVocation,new Integer(value));
  }
  public  void setEspVocation(int value){
     this.set(S_EspVocation,new Integer(value));
  }
  public  void setEspVocationNull(){
     this.set(S_EspVocation,null);
  }

  public int getEspVocation(){
        return DataType.getAsInt(this.get(S_EspVocation));
  
  }
  public int getEspVocationInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_EspVocation));
      }

  public void initVpmnNum(long value){
     this.initProperty(S_VpmnNum,new Long(value));
  }
  public  void setVpmnNum(long value){
     this.set(S_VpmnNum,new Long(value));
  }
  public  void setVpmnNumNull(){
     this.set(S_VpmnNum,null);
  }

  public long getVpmnNum(){
        return DataType.getAsLong(this.get(S_VpmnNum));
  
  }
  public long getVpmnNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_VpmnNum));
      }

  public void initMobileNum(int value){
     this.initProperty(S_MobileNum,new Integer(value));
  }
  public  void setMobileNum(int value){
     this.set(S_MobileNum,new Integer(value));
  }
  public  void setMobileNumNull(){
     this.set(S_MobileNum,null);
  }

  public int getMobileNum(){
        return DataType.getAsInt(this.get(S_MobileNum));
  
  }
  public int getMobileNumInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MobileNum));
      }

  public void initCommunicationExpense(long value){
     this.initProperty(S_CommunicationExpense,new Long(value));
  }
  public  void setCommunicationExpense(long value){
     this.set(S_CommunicationExpense,new Long(value));
  }
  public  void setCommunicationExpenseNull(){
     this.set(S_CommunicationExpense,null);
  }

  public long getCommunicationExpense(){
        return DataType.getAsLong(this.get(S_CommunicationExpense));
  
  }
  public long getCommunicationExpenseInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CommunicationExpense));
      }

  public void initServiceChannel(int value){
     this.initProperty(S_ServiceChannel,new Integer(value));
  }
  public  void setServiceChannel(int value){
     this.set(S_ServiceChannel,new Integer(value));
  }
  public  void setServiceChannelNull(){
     this.set(S_ServiceChannel,null);
  }

  public int getServiceChannel(){
        return DataType.getAsInt(this.get(S_ServiceChannel));
  
  }
  public int getServiceChannelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ServiceChannel));
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

  public void initAAttitude(int value){
     this.initProperty(S_AAttitude,new Integer(value));
  }
  public  void setAAttitude(int value){
     this.set(S_AAttitude,new Integer(value));
  }
  public  void setAAttitudeNull(){
     this.set(S_AAttitude,null);
  }

  public int getAAttitude(){
        return DataType.getAsInt(this.get(S_AAttitude));
  
  }
  public int getAAttitudeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_AAttitude));
      }

  public void initBrname(String value){
     this.initProperty(S_Brname,value);
  }
  public  void setBrname(String value){
     this.set(S_Brname,value);
  }
  public  void setBrnameNull(){
     this.set(S_Brname,null);
  }

  public String getBrname(){
       return DataType.getAsString(this.get(S_Brname));
  
  }
  public String getBrnameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Brname));
      }

  public void initContact(String value){
     this.initProperty(S_Contact,value);
  }
  public  void setContact(String value){
     this.set(S_Contact,value);
  }
  public  void setContactNull(){
     this.set(S_Contact,null);
  }

  public String getContact(){
       return DataType.getAsString(this.get(S_Contact));
  
  }
  public String getContactInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Contact));
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

  public void initPayType(int value){
     this.initProperty(S_PayType,new Integer(value));
  }
  public  void setPayType(int value){
     this.set(S_PayType,new Integer(value));
  }
  public  void setPayTypeNull(){
     this.set(S_PayType,null);
  }

  public int getPayType(){
        return DataType.getAsInt(this.get(S_PayType));
  
  }
  public int getPayTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PayType));
      }

  public void initCompelereInfo(String value){
     this.initProperty(S_CompelereInfo,value);
  }
  public  void setCompelereInfo(String value){
     this.set(S_CompelereInfo,value);
  }
  public  void setCompelereInfoNull(){
     this.set(S_CompelereInfo,null);
  }

  public String getCompelereInfo(){
       return DataType.getAsString(this.get(S_CompelereInfo));
  
  }
  public String getCompelereInfoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CompelereInfo));
      }

  public void initMsisdn(String value){
     this.initProperty(S_Msisdn,value);
  }
  public  void setMsisdn(String value){
     this.set(S_Msisdn,value);
  }
  public  void setMsisdnNull(){
     this.set(S_Msisdn,null);
  }

  public String getMsisdn(){
       return DataType.getAsString(this.get(S_Msisdn));
  
  }
  public String getMsisdnInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Msisdn));
      }


 
 }

