package com.asiainfo.crm.cm.inner.customer.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.customer.ivalues.*;

public class BOCmxGroupInformInfoBean extends DataContainer implements DataContainerInterface,IBOCmxGroupInformInfoValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.customer.bo.BOCmxGroupInformInfo";



  public final static  String S_MaintainerNum = "MAINTAINER_NUM";
  public final static  String S_State = "STATE";
  public final static  String S_Supplier = "SUPPLIER";
  public final static  String S_Operator = "OPERATOR";
  public final static  String S_PropertyType = "PROPERTY_TYPE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DeviceNum = "DEVICE_NUM";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_Costs = "COSTS";
  public final static  String S_IsUsered = "IS_USERED";
  public final static  String S_AdminType = "ADMIN_TYPE";
  public final static  String S_ConnMode = "CONN_MODE";
  public final static  String S_InternetMode = "INTERNET_MODE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_LinkScope = "LINK_SCOPE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_HostLocalType = "HOST_LOCAL_TYPE";
  public final static  String S_InformTypeId = "INFORM_TYPE_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
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
  public BOCmxGroupInformInfoBean() throws AIException{
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

  public void initCosts(double value){
     this.initProperty(S_Costs,new Double(value));
  }
  public  void setCosts(double value){
     this.set(S_Costs,new Double(value));
  }
  public  void setCostsNull(){
     this.set(S_Costs,null);
  }

  public double getCosts(){
        return DataType.getAsDouble(this.get(S_Costs));
  
  }
  public double getCostsInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_Costs));
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

  public void initConnMode(String value){
     this.initProperty(S_ConnMode,value);
  }
  public  void setConnMode(String value){
     this.set(S_ConnMode,value);
  }
  public  void setConnModeNull(){
     this.set(S_ConnMode,null);
  }

  public String getConnMode(){
       return DataType.getAsString(this.get(S_ConnMode));
  
  }
  public String getConnModeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ConnMode));
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

  public void initBandwidth(long value){
     this.initProperty(S_Bandwidth,new Long(value));
  }
  public  void setBandwidth(long value){
     this.set(S_Bandwidth,new Long(value));
  }
  public  void setBandwidthNull(){
     this.set(S_Bandwidth,null);
  }

  public long getBandwidth(){
        return DataType.getAsLong(this.get(S_Bandwidth));
  
  }
  public long getBandwidthInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Bandwidth));
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

