package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class BOCmGroupInformInfoBean extends DataContainer implements DataContainerInterface,IBOCmGroupInformInfoValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.BOCmGroupInformInfo";



  public final static  String S_MaintainerNum = "MAINTAINER_NUM";
  public final static  String S_State = "STATE";
  public final static  String S_Supplier = "SUPPLIER";
  public final static  String S_CostType = "COST_TYPE";
  public final static  String S_CabPropertyOwner = "CAB_PROPERTY_OWNER";
  public final static  String S_CostYear = "COST_YEAR";
  public final static  String S_CostAvgMonthList = "COST_AVG_MONTH_LIST";
  public final static  String S_Operator = "OPERATOR";
  public final static  String S_SecondOperatorList = "SECOND_OPERATOR_LIST";
  public final static  String S_PreferentialPolicy = "PREFERENTIAL_POLICY";
  public final static  String S_ImplTypeList = "IMPL_TYPE_LIST";
  public final static  String S_PropertyType = "PROPERTY_TYPE";
  public final static  String S_SecondOperatorText = "SECOND_OPERATOR_TEXT";
  public final static  String S_MajorOperatorText = "MAJOR_OPERATOR_TEXT";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_MajorOwnerDesc = "MAJOR_OWNER_DESC";
  public final static  String S_DeviceNum = "DEVICE_NUM";
  public final static  String S_ImplTypeText = "IMPL_TYPE_TEXT";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OtherGroupInformation = "OTHER_GROUP_INFORMATION";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_CostAvgMonthText = "COST_AVG_MONTH_TEXT";
  public final static  String S_MajorOperatorList = "MAJOR_OPERATOR_LIST";
  public final static  String S_Costs = "COSTS";
  public final static  String S_IsUsered = "IS_USERED";
  public final static  String S_AdminType = "ADMIN_TYPE";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_InternetMode = "INTERNET_MODE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_LinkScope = "LINK_SCOPE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_HostLocalType = "HOST_LOCAL_TYPE";
  public final static  String S_InformTypeId = "INFORM_TYPE_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ContractExpireDate = "CONTRACT_EXPIRE_DATE";
  public final static  String S_Bandwidth = "BANDWIDTH";
  public final static  String S_EmailSysType = "EMAIL_SYS_TYPE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmGroupInformInfoBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initMaintainerNum(int value){
     this.initProperty(S_MaintainerNum,new Integer(value));
  }
  public  void setMaintainerNum(int value){
     this.set(S_MaintainerNum,new Integer(value));
  }
  public  void setMaintainerNumNull(){
     this.set(S_MaintainerNum,null);
  }

  public int getMaintainerNum(){
        return DataType.getAsInt(this.get(S_MaintainerNum));
  
  }
  public int getMaintainerNumInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MaintainerNum));
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

  public void initSupplier(String value){
     this.initProperty(S_Supplier,value);
  }
  public  void setSupplier(String value){
     this.set(S_Supplier,value);
  }
  public  void setSupplierNull(){
     this.set(S_Supplier,null);
  }

  public String getSupplier(){
       return DataType.getAsString(this.get(S_Supplier));
  
  }
  public String getSupplierInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Supplier));
      }

  public void initCostType(int value){
     this.initProperty(S_CostType,new Integer(value));
  }
  public  void setCostType(int value){
     this.set(S_CostType,new Integer(value));
  }
  public  void setCostTypeNull(){
     this.set(S_CostType,null);
  }

  public int getCostType(){
        return DataType.getAsInt(this.get(S_CostType));
  
  }
  public int getCostTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CostType));
      }

  public void initCabPropertyOwner(int value){
     this.initProperty(S_CabPropertyOwner,new Integer(value));
  }
  public  void setCabPropertyOwner(int value){
     this.set(S_CabPropertyOwner,new Integer(value));
  }
  public  void setCabPropertyOwnerNull(){
     this.set(S_CabPropertyOwner,null);
  }

  public int getCabPropertyOwner(){
        return DataType.getAsInt(this.get(S_CabPropertyOwner));
  
  }
  public int getCabPropertyOwnerInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CabPropertyOwner));
      }

  public void initCostYear(String value){
     this.initProperty(S_CostYear,value);
  }
  public  void setCostYear(String value){
     this.set(S_CostYear,value);
  }
  public  void setCostYearNull(){
     this.set(S_CostYear,null);
  }

  public String getCostYear(){
       return DataType.getAsString(this.get(S_CostYear));
  
  }
  public String getCostYearInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CostYear));
      }

  public void initCostAvgMonthList(int value){
     this.initProperty(S_CostAvgMonthList,new Integer(value));
  }
  public  void setCostAvgMonthList(int value){
     this.set(S_CostAvgMonthList,new Integer(value));
  }
  public  void setCostAvgMonthListNull(){
     this.set(S_CostAvgMonthList,null);
  }

  public int getCostAvgMonthList(){
        return DataType.getAsInt(this.get(S_CostAvgMonthList));
  
  }
  public int getCostAvgMonthListInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CostAvgMonthList));
      }

  public void initOperator(String value){
     this.initProperty(S_Operator,value);
  }
  public  void setOperator(String value){
     this.set(S_Operator,value);
  }
  public  void setOperatorNull(){
     this.set(S_Operator,null);
  }

  public String getOperator(){
       return DataType.getAsString(this.get(S_Operator));
  
  }
  public String getOperatorInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Operator));
      }

  public void initSecondOperatorList(int value){
     this.initProperty(S_SecondOperatorList,new Integer(value));
  }
  public  void setSecondOperatorList(int value){
     this.set(S_SecondOperatorList,new Integer(value));
  }
  public  void setSecondOperatorListNull(){
     this.set(S_SecondOperatorList,null);
  }

  public int getSecondOperatorList(){
        return DataType.getAsInt(this.get(S_SecondOperatorList));
  
  }
  public int getSecondOperatorListInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_SecondOperatorList));
      }

  public void initPreferentialPolicy(String value){
     this.initProperty(S_PreferentialPolicy,value);
  }
  public  void setPreferentialPolicy(String value){
     this.set(S_PreferentialPolicy,value);
  }
  public  void setPreferentialPolicyNull(){
     this.set(S_PreferentialPolicy,null);
  }

  public String getPreferentialPolicy(){
       return DataType.getAsString(this.get(S_PreferentialPolicy));
  
  }
  public String getPreferentialPolicyInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PreferentialPolicy));
      }

  public void initImplTypeList(int value){
     this.initProperty(S_ImplTypeList,new Integer(value));
  }
  public  void setImplTypeList(int value){
     this.set(S_ImplTypeList,new Integer(value));
  }
  public  void setImplTypeListNull(){
     this.set(S_ImplTypeList,null);
  }

  public int getImplTypeList(){
        return DataType.getAsInt(this.get(S_ImplTypeList));
  
  }
  public int getImplTypeListInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ImplTypeList));
      }

  public void initPropertyType(int value){
     this.initProperty(S_PropertyType,new Integer(value));
  }
  public  void setPropertyType(int value){
     this.set(S_PropertyType,new Integer(value));
  }
  public  void setPropertyTypeNull(){
     this.set(S_PropertyType,null);
  }

  public int getPropertyType(){
        return DataType.getAsInt(this.get(S_PropertyType));
  
  }
  public int getPropertyTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PropertyType));
      }

  public void initSecondOperatorText(String value){
     this.initProperty(S_SecondOperatorText,value);
  }
  public  void setSecondOperatorText(String value){
     this.set(S_SecondOperatorText,value);
  }
  public  void setSecondOperatorTextNull(){
     this.set(S_SecondOperatorText,null);
  }

  public String getSecondOperatorText(){
       return DataType.getAsString(this.get(S_SecondOperatorText));
  
  }
  public String getSecondOperatorTextInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SecondOperatorText));
      }

  public void initMajorOperatorText(String value){
     this.initProperty(S_MajorOperatorText,value);
  }
  public  void setMajorOperatorText(String value){
     this.set(S_MajorOperatorText,value);
  }
  public  void setMajorOperatorTextNull(){
     this.set(S_MajorOperatorText,null);
  }

  public String getMajorOperatorText(){
       return DataType.getAsString(this.get(S_MajorOperatorText));
  
  }
  public String getMajorOperatorTextInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MajorOperatorText));
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

  public void initMajorOwnerDesc(String value){
     this.initProperty(S_MajorOwnerDesc,value);
  }
  public  void setMajorOwnerDesc(String value){
     this.set(S_MajorOwnerDesc,value);
  }
  public  void setMajorOwnerDescNull(){
     this.set(S_MajorOwnerDesc,null);
  }

  public String getMajorOwnerDesc(){
       return DataType.getAsString(this.get(S_MajorOwnerDesc));
  
  }
  public String getMajorOwnerDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MajorOwnerDesc));
      }

  public void initDeviceNum(int value){
     this.initProperty(S_DeviceNum,new Integer(value));
  }
  public  void setDeviceNum(int value){
     this.set(S_DeviceNum,new Integer(value));
  }
  public  void setDeviceNumNull(){
     this.set(S_DeviceNum,null);
  }

  public int getDeviceNum(){
        return DataType.getAsInt(this.get(S_DeviceNum));
  
  }
  public int getDeviceNumInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_DeviceNum));
      }

  public void initImplTypeText(String value){
     this.initProperty(S_ImplTypeText,value);
  }
  public  void setImplTypeText(String value){
     this.set(S_ImplTypeText,value);
  }
  public  void setImplTypeTextNull(){
     this.set(S_ImplTypeText,null);
  }

  public String getImplTypeText(){
       return DataType.getAsString(this.get(S_ImplTypeText));
  
  }
  public String getImplTypeTextInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ImplTypeText));
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

  public void initOtherGroupInformation(String value){
     this.initProperty(S_OtherGroupInformation,value);
  }
  public  void setOtherGroupInformation(String value){
     this.set(S_OtherGroupInformation,value);
  }
  public  void setOtherGroupInformationNull(){
     this.set(S_OtherGroupInformation,null);
  }

  public String getOtherGroupInformation(){
       return DataType.getAsString(this.get(S_OtherGroupInformation));
  
  }
  public String getOtherGroupInformationInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OtherGroupInformation));
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

  public void initCostAvgMonthText(String value){
     this.initProperty(S_CostAvgMonthText,value);
  }
  public  void setCostAvgMonthText(String value){
     this.set(S_CostAvgMonthText,value);
  }
  public  void setCostAvgMonthTextNull(){
     this.set(S_CostAvgMonthText,null);
  }

  public String getCostAvgMonthText(){
       return DataType.getAsString(this.get(S_CostAvgMonthText));
  
  }
  public String getCostAvgMonthTextInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CostAvgMonthText));
      }

  public void initMajorOperatorList(int value){
     this.initProperty(S_MajorOperatorList,new Integer(value));
  }
  public  void setMajorOperatorList(int value){
     this.set(S_MajorOperatorList,new Integer(value));
  }
  public  void setMajorOperatorListNull(){
     this.set(S_MajorOperatorList,null);
  }

  public int getMajorOperatorList(){
        return DataType.getAsInt(this.get(S_MajorOperatorList));
  
  }
  public int getMajorOperatorListInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MajorOperatorList));
      }

  public void initCosts(long value){
     this.initProperty(S_Costs,new Long(value));
  }
  public  void setCosts(long value){
     this.set(S_Costs,new Long(value));
  }
  public  void setCostsNull(){
     this.set(S_Costs,null);
  }

  public long getCosts(){
        return DataType.getAsLong(this.get(S_Costs));
  
  }
  public long getCostsInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Costs));
      }

  public void initIsUsered(int value){
     this.initProperty(S_IsUsered,new Integer(value));
  }
  public  void setIsUsered(int value){
     this.set(S_IsUsered,new Integer(value));
  }
  public  void setIsUseredNull(){
     this.set(S_IsUsered,null);
  }

  public int getIsUsered(){
        return DataType.getAsInt(this.get(S_IsUsered));
  
  }
  public int getIsUseredInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsUsered));
      }

  public void initAdminType(int value){
     this.initProperty(S_AdminType,new Integer(value));
  }
  public  void setAdminType(int value){
     this.set(S_AdminType,new Integer(value));
  }
  public  void setAdminTypeNull(){
     this.set(S_AdminType,null);
  }

  public int getAdminType(){
        return DataType.getAsInt(this.get(S_AdminType));
  
  }
  public int getAdminTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_AdminType));
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

  public void initInternetMode(int value){
     this.initProperty(S_InternetMode,new Integer(value));
  }
  public  void setInternetMode(int value){
     this.set(S_InternetMode,new Integer(value));
  }
  public  void setInternetModeNull(){
     this.set(S_InternetMode,null);
  }

  public int getInternetMode(){
        return DataType.getAsInt(this.get(S_InternetMode));
  
  }
  public int getInternetModeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_InternetMode));
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

  public void initLinkScope(int value){
     this.initProperty(S_LinkScope,new Integer(value));
  }
  public  void setLinkScope(int value){
     this.set(S_LinkScope,new Integer(value));
  }
  public  void setLinkScopeNull(){
     this.set(S_LinkScope,null);
  }

  public int getLinkScope(){
        return DataType.getAsInt(this.get(S_LinkScope));
  
  }
  public int getLinkScopeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_LinkScope));
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

  public void initHostLocalType(int value){
     this.initProperty(S_HostLocalType,new Integer(value));
  }
  public  void setHostLocalType(int value){
     this.set(S_HostLocalType,new Integer(value));
  }
  public  void setHostLocalTypeNull(){
     this.set(S_HostLocalType,null);
  }

  public int getHostLocalType(){
        return DataType.getAsInt(this.get(S_HostLocalType));
  
  }
  public int getHostLocalTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_HostLocalType));
      }

  public void initInformTypeId(int value){
     this.initProperty(S_InformTypeId,new Integer(value));
  }
  public  void setInformTypeId(int value){
     this.set(S_InformTypeId,new Integer(value));
  }
  public  void setInformTypeIdNull(){
     this.set(S_InformTypeId,null);
  }

  public int getInformTypeId(){
        return DataType.getAsInt(this.get(S_InformTypeId));
  
  }
  public int getInformTypeIdInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_InformTypeId));
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

  public void initContractExpireDate(Timestamp value){
     this.initProperty(S_ContractExpireDate,value);
  }
  public  void setContractExpireDate(Timestamp value){
     this.set(S_ContractExpireDate,value);
  }
  public  void setContractExpireDateNull(){
     this.set(S_ContractExpireDate,null);
  }

  public Timestamp getContractExpireDate(){
        return DataType.getAsDateTime(this.get(S_ContractExpireDate));
  
  }
  public Timestamp getContractExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ContractExpireDate));
      }

  public void initBandwidth(int value){
     this.initProperty(S_Bandwidth,new Integer(value));
  }
  public  void setBandwidth(int value){
     this.set(S_Bandwidth,new Integer(value));
  }
  public  void setBandwidthNull(){
     this.set(S_Bandwidth,null);
  }

  public int getBandwidth(){
        return DataType.getAsInt(this.get(S_Bandwidth));
  
  }
  public int getBandwidthInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Bandwidth));
      }

  public void initEmailSysType(int value){
     this.initProperty(S_EmailSysType,new Integer(value));
  }
  public  void setEmailSysType(int value){
     this.set(S_EmailSysType,new Integer(value));
  }
  public  void setEmailSysTypeNull(){
     this.set(S_EmailSysType,null);
  }

  public int getEmailSysType(){
        return DataType.getAsInt(this.get(S_EmailSysType));
  
  }
  public int getEmailSysTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_EmailSysType));
      }


 
 }

