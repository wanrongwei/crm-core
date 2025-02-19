package com.asiainfo.crm.cm.inner.customer.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.customer.ivalues.*;

public class BOCmCustPerferInfomationBean extends DataContainer implements DataContainerInterface,IBOCmCustPerferInfomationValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.customer.bo.BOCmCustPerferInfomation";



  public final static  String S_MediumDoneCode = "MEDIUM_DONE_CODE";
  public final static  String S_ChannelDoneCode = "CHANNEL_DONE_CODE";
  public final static  String S_AddressId = "ADDRESS_ID";
  public final static  String S_ChannelCreateOrgId = "CHANNEL_CREATE_ORG_ID";
  public final static  String S_PreferChannelId = "PREFER_CHANNEL_ID";
  public final static  String S_MediumOpId = "MEDIUM_OP_ID";
  public final static  String S_ChannelCreateOpId = "CHANNEL_CREATE_OP_ID";
  public final static  String S_FaxNumber = "FAX_NUMBER";
  public final static  String S_AddressCode = "ADDRESS_CODE";
  public final static  String S_ChannelRegionId = "CHANNEL_REGION_ID";
  public final static  String S_UpContMedTypeId = "UP_CONT_MED_TYPE_ID";
  public final static  String S_PreferChannelName = "PREFER_CHANNEL_NAME";
  public final static  String S_AddressDetail = "ADDRESS_DETAIL";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_ProtectExpDate = "PROTECT_EXP_DATE";
  public final static  String S_ChannelDoneDate = "CHANNEL_DONE_DATE";
  public final static  String S_Action = "ACTION";
  public final static  String S_MediumExpireDate = "MEDIUM_EXPIRE_DATE";
  public final static  String S_ContMedTypeName = "CONT_MED_TYPE_NAME";
  public final static  String S_ProtectEffDate = "PROTECT_EFF_DATE";
  public final static  String S_ChannelEffectiveDate = "CHANNEL_EFFECTIVE_DATE";
  public final static  String S_ChannelExpireDate = "CHANNEL_EXPIRE_DATE";
  public final static  String S_ChannelRemarks = "CHANNEL_REMARKS";
  public final static  String S_ChannelCreateDate = "CHANNEL_CREATE_DATE";
  public final static  String S_MediumRemarks = "MEDIUM_REMARKS";
  public final static  String S_MediumDoneDate = "MEDIUM_DONE_DATE";
  public final static  String S_Priority = "PRIORITY";
  public final static  String S_MediumOrgId = "MEDIUM_ORG_ID";
  public final static  String S_ChannelOrgId = "CHANNEL_ORG_ID";
  public final static  String S_MediumEffectiveDate = "MEDIUM_EFFECTIVE_DATE";
  public final static  String S_ChannelState = "CHANNEL_STATE";
  public final static  String S_CustContRelaId = "CUST_CONT_RELA_ID";
  public final static  String S_MediumCreateOpId = "MEDIUM_CREATE_OP_ID";
  public final static  String S_ContNumber = "CONT_NUMBER";
  public final static  String S_ContMedTypeId = "CONT_MED_TYPE_ID";
  public final static  String S_PerferType = "PERFER_TYPE";
  public final static  String S_MediumRegionId = "MEDIUM_REGION_ID";
  public final static  String S_IsNoDisturbing = "IS_NO_DISTURBING";
  public final static  String S_ChannelOpId = "CHANNEL_OP_ID";
  public final static  String S_MediumCreateDate = "MEDIUM_CREATE_DATE";
  public final static  String S_PostalCode = "POSTAL_CODE";
  public final static  String S_MediumState = "MEDIUM_STATE";
  public final static  String S_MediumCreateOrgId = "MEDIUM_CREATE_ORG_ID";
  public final static  String S_Prior = "PRIOR";
  public final static  String S_EmailAddress = "EMAIL_ADDRESS";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmCustPerferInfomationBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initMediumDoneCode(long value){
     this.initProperty(S_MediumDoneCode,new Long(value));
  }
  public  void setMediumDoneCode(long value){
     this.set(S_MediumDoneCode,new Long(value));
  }
  public  void setMediumDoneCodeNull(){
     this.set(S_MediumDoneCode,null);
  }

  public long getMediumDoneCode(){
        return DataType.getAsLong(this.get(S_MediumDoneCode));
  
  }
  public long getMediumDoneCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MediumDoneCode));
      }

  public void initChannelDoneCode(long value){
     this.initProperty(S_ChannelDoneCode,new Long(value));
  }
  public  void setChannelDoneCode(long value){
     this.set(S_ChannelDoneCode,new Long(value));
  }
  public  void setChannelDoneCodeNull(){
     this.set(S_ChannelDoneCode,null);
  }

  public long getChannelDoneCode(){
        return DataType.getAsLong(this.get(S_ChannelDoneCode));
  
  }
  public long getChannelDoneCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ChannelDoneCode));
      }

  public void initAddressId(long value){
     this.initProperty(S_AddressId,new Long(value));
  }
  public  void setAddressId(long value){
     this.set(S_AddressId,new Long(value));
  }
  public  void setAddressIdNull(){
     this.set(S_AddressId,null);
  }

  public long getAddressId(){
        return DataType.getAsLong(this.get(S_AddressId));
  
  }
  public long getAddressIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AddressId));
      }

  public void initChannelCreateOrgId(long value){
     this.initProperty(S_ChannelCreateOrgId,new Long(value));
  }
  public  void setChannelCreateOrgId(long value){
     this.set(S_ChannelCreateOrgId,new Long(value));
  }
  public  void setChannelCreateOrgIdNull(){
     this.set(S_ChannelCreateOrgId,null);
  }

  public long getChannelCreateOrgId(){
        return DataType.getAsLong(this.get(S_ChannelCreateOrgId));
  
  }
  public long getChannelCreateOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ChannelCreateOrgId));
      }

  public void initPreferChannelId(long value){
     this.initProperty(S_PreferChannelId,new Long(value));
  }
  public  void setPreferChannelId(long value){
     this.set(S_PreferChannelId,new Long(value));
  }
  public  void setPreferChannelIdNull(){
     this.set(S_PreferChannelId,null);
  }

  public long getPreferChannelId(){
        return DataType.getAsLong(this.get(S_PreferChannelId));
  
  }
  public long getPreferChannelIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PreferChannelId));
      }

  public void initMediumOpId(long value){
     this.initProperty(S_MediumOpId,new Long(value));
  }
  public  void setMediumOpId(long value){
     this.set(S_MediumOpId,new Long(value));
  }
  public  void setMediumOpIdNull(){
     this.set(S_MediumOpId,null);
  }

  public long getMediumOpId(){
        return DataType.getAsLong(this.get(S_MediumOpId));
  
  }
  public long getMediumOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MediumOpId));
      }

  public void initChannelCreateOpId(long value){
     this.initProperty(S_ChannelCreateOpId,new Long(value));
  }
  public  void setChannelCreateOpId(long value){
     this.set(S_ChannelCreateOpId,new Long(value));
  }
  public  void setChannelCreateOpIdNull(){
     this.set(S_ChannelCreateOpId,null);
  }

  public long getChannelCreateOpId(){
        return DataType.getAsLong(this.get(S_ChannelCreateOpId));
  
  }
  public long getChannelCreateOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ChannelCreateOpId));
      }

  public void initFaxNumber(String value){
     this.initProperty(S_FaxNumber,value);
  }
  public  void setFaxNumber(String value){
     this.set(S_FaxNumber,value);
  }
  public  void setFaxNumberNull(){
     this.set(S_FaxNumber,null);
  }

  public String getFaxNumber(){
       return DataType.getAsString(this.get(S_FaxNumber));
  
  }
  public String getFaxNumberInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FaxNumber));
      }

  public void initAddressCode(String value){
     this.initProperty(S_AddressCode,value);
  }
  public  void setAddressCode(String value){
     this.set(S_AddressCode,value);
  }
  public  void setAddressCodeNull(){
     this.set(S_AddressCode,null);
  }

  public String getAddressCode(){
       return DataType.getAsString(this.get(S_AddressCode));
  
  }
  public String getAddressCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AddressCode));
      }

  public void initChannelRegionId(String value){
     this.initProperty(S_ChannelRegionId,value);
  }
  public  void setChannelRegionId(String value){
     this.set(S_ChannelRegionId,value);
  }
  public  void setChannelRegionIdNull(){
     this.set(S_ChannelRegionId,null);
  }

  public String getChannelRegionId(){
       return DataType.getAsString(this.get(S_ChannelRegionId));
  
  }
  public String getChannelRegionIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ChannelRegionId));
      }

  public void initUpContMedTypeId(long value){
     this.initProperty(S_UpContMedTypeId,new Long(value));
  }
  public  void setUpContMedTypeId(long value){
     this.set(S_UpContMedTypeId,new Long(value));
  }
  public  void setUpContMedTypeIdNull(){
     this.set(S_UpContMedTypeId,null);
  }

  public long getUpContMedTypeId(){
        return DataType.getAsLong(this.get(S_UpContMedTypeId));
  
  }
  public long getUpContMedTypeIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_UpContMedTypeId));
      }

  public void initPreferChannelName(String value){
     this.initProperty(S_PreferChannelName,value);
  }
  public  void setPreferChannelName(String value){
     this.set(S_PreferChannelName,value);
  }
  public  void setPreferChannelNameNull(){
     this.set(S_PreferChannelName,null);
  }

  public String getPreferChannelName(){
       return DataType.getAsString(this.get(S_PreferChannelName));
  
  }
  public String getPreferChannelNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PreferChannelName));
      }

  public void initAddressDetail(String value){
     this.initProperty(S_AddressDetail,value);
  }
  public  void setAddressDetail(String value){
     this.set(S_AddressDetail,value);
  }
  public  void setAddressDetailNull(){
     this.set(S_AddressDetail,null);
  }

  public String getAddressDetail(){
       return DataType.getAsString(this.get(S_AddressDetail));
  
  }
  public String getAddressDetailInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AddressDetail));
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

  public void initProtectExpDate(Timestamp value){
     this.initProperty(S_ProtectExpDate,value);
  }
  public  void setProtectExpDate(Timestamp value){
     this.set(S_ProtectExpDate,value);
  }
  public  void setProtectExpDateNull(){
     this.set(S_ProtectExpDate,null);
  }

  public Timestamp getProtectExpDate(){
        return DataType.getAsDateTime(this.get(S_ProtectExpDate));
  
  }
  public Timestamp getProtectExpDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ProtectExpDate));
      }

  public void initChannelDoneDate(Timestamp value){
     this.initProperty(S_ChannelDoneDate,value);
  }
  public  void setChannelDoneDate(Timestamp value){
     this.set(S_ChannelDoneDate,value);
  }
  public  void setChannelDoneDateNull(){
     this.set(S_ChannelDoneDate,null);
  }

  public Timestamp getChannelDoneDate(){
        return DataType.getAsDateTime(this.get(S_ChannelDoneDate));
  
  }
  public Timestamp getChannelDoneDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ChannelDoneDate));
      }

  public void initAction(String value){
     this.initProperty(S_Action,value);
  }
  public  void setAction(String value){
     this.set(S_Action,value);
  }
  public  void setActionNull(){
     this.set(S_Action,null);
  }

  public String getAction(){
       return DataType.getAsString(this.get(S_Action));
  
  }
  public String getActionInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Action));
      }

  public void initMediumExpireDate(Timestamp value){
     this.initProperty(S_MediumExpireDate,value);
  }
  public  void setMediumExpireDate(Timestamp value){
     this.set(S_MediumExpireDate,value);
  }
  public  void setMediumExpireDateNull(){
     this.set(S_MediumExpireDate,null);
  }

  public Timestamp getMediumExpireDate(){
        return DataType.getAsDateTime(this.get(S_MediumExpireDate));
  
  }
  public Timestamp getMediumExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_MediumExpireDate));
      }

  public void initContMedTypeName(String value){
     this.initProperty(S_ContMedTypeName,value);
  }
  public  void setContMedTypeName(String value){
     this.set(S_ContMedTypeName,value);
  }
  public  void setContMedTypeNameNull(){
     this.set(S_ContMedTypeName,null);
  }

  public String getContMedTypeName(){
       return DataType.getAsString(this.get(S_ContMedTypeName));
  
  }
  public String getContMedTypeNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContMedTypeName));
      }

  public void initProtectEffDate(Timestamp value){
     this.initProperty(S_ProtectEffDate,value);
  }
  public  void setProtectEffDate(Timestamp value){
     this.set(S_ProtectEffDate,value);
  }
  public  void setProtectEffDateNull(){
     this.set(S_ProtectEffDate,null);
  }

  public Timestamp getProtectEffDate(){
        return DataType.getAsDateTime(this.get(S_ProtectEffDate));
  
  }
  public Timestamp getProtectEffDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ProtectEffDate));
      }

  public void initChannelEffectiveDate(Timestamp value){
     this.initProperty(S_ChannelEffectiveDate,value);
  }
  public  void setChannelEffectiveDate(Timestamp value){
     this.set(S_ChannelEffectiveDate,value);
  }
  public  void setChannelEffectiveDateNull(){
     this.set(S_ChannelEffectiveDate,null);
  }

  public Timestamp getChannelEffectiveDate(){
        return DataType.getAsDateTime(this.get(S_ChannelEffectiveDate));
  
  }
  public Timestamp getChannelEffectiveDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ChannelEffectiveDate));
      }

  public void initChannelExpireDate(Timestamp value){
     this.initProperty(S_ChannelExpireDate,value);
  }
  public  void setChannelExpireDate(Timestamp value){
     this.set(S_ChannelExpireDate,value);
  }
  public  void setChannelExpireDateNull(){
     this.set(S_ChannelExpireDate,null);
  }

  public Timestamp getChannelExpireDate(){
        return DataType.getAsDateTime(this.get(S_ChannelExpireDate));
  
  }
  public Timestamp getChannelExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ChannelExpireDate));
      }

  public void initChannelRemarks(String value){
     this.initProperty(S_ChannelRemarks,value);
  }
  public  void setChannelRemarks(String value){
     this.set(S_ChannelRemarks,value);
  }
  public  void setChannelRemarksNull(){
     this.set(S_ChannelRemarks,null);
  }

  public String getChannelRemarks(){
       return DataType.getAsString(this.get(S_ChannelRemarks));
  
  }
  public String getChannelRemarksInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ChannelRemarks));
      }

  public void initChannelCreateDate(Timestamp value){
     this.initProperty(S_ChannelCreateDate,value);
  }
  public  void setChannelCreateDate(Timestamp value){
     this.set(S_ChannelCreateDate,value);
  }
  public  void setChannelCreateDateNull(){
     this.set(S_ChannelCreateDate,null);
  }

  public Timestamp getChannelCreateDate(){
        return DataType.getAsDateTime(this.get(S_ChannelCreateDate));
  
  }
  public Timestamp getChannelCreateDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ChannelCreateDate));
      }

  public void initMediumRemarks(String value){
     this.initProperty(S_MediumRemarks,value);
  }
  public  void setMediumRemarks(String value){
     this.set(S_MediumRemarks,value);
  }
  public  void setMediumRemarksNull(){
     this.set(S_MediumRemarks,null);
  }

  public String getMediumRemarks(){
       return DataType.getAsString(this.get(S_MediumRemarks));
  
  }
  public String getMediumRemarksInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MediumRemarks));
      }

  public void initMediumDoneDate(Timestamp value){
     this.initProperty(S_MediumDoneDate,value);
  }
  public  void setMediumDoneDate(Timestamp value){
     this.set(S_MediumDoneDate,value);
  }
  public  void setMediumDoneDateNull(){
     this.set(S_MediumDoneDate,null);
  }

  public Timestamp getMediumDoneDate(){
        return DataType.getAsDateTime(this.get(S_MediumDoneDate));
  
  }
  public Timestamp getMediumDoneDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_MediumDoneDate));
      }

  public void initPriority(int value){
     this.initProperty(S_Priority,new Integer(value));
  }
  public  void setPriority(int value){
     this.set(S_Priority,new Integer(value));
  }
  public  void setPriorityNull(){
     this.set(S_Priority,null);
  }

  public int getPriority(){
        return DataType.getAsInt(this.get(S_Priority));
  
  }
  public int getPriorityInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Priority));
      }

  public void initMediumOrgId(long value){
     this.initProperty(S_MediumOrgId,new Long(value));
  }
  public  void setMediumOrgId(long value){
     this.set(S_MediumOrgId,new Long(value));
  }
  public  void setMediumOrgIdNull(){
     this.set(S_MediumOrgId,null);
  }

  public long getMediumOrgId(){
        return DataType.getAsLong(this.get(S_MediumOrgId));
  
  }
  public long getMediumOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MediumOrgId));
      }

  public void initChannelOrgId(long value){
     this.initProperty(S_ChannelOrgId,new Long(value));
  }
  public  void setChannelOrgId(long value){
     this.set(S_ChannelOrgId,new Long(value));
  }
  public  void setChannelOrgIdNull(){
     this.set(S_ChannelOrgId,null);
  }

  public long getChannelOrgId(){
        return DataType.getAsLong(this.get(S_ChannelOrgId));
  
  }
  public long getChannelOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ChannelOrgId));
      }

  public void initMediumEffectiveDate(Timestamp value){
     this.initProperty(S_MediumEffectiveDate,value);
  }
  public  void setMediumEffectiveDate(Timestamp value){
     this.set(S_MediumEffectiveDate,value);
  }
  public  void setMediumEffectiveDateNull(){
     this.set(S_MediumEffectiveDate,null);
  }

  public Timestamp getMediumEffectiveDate(){
        return DataType.getAsDateTime(this.get(S_MediumEffectiveDate));
  
  }
  public Timestamp getMediumEffectiveDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_MediumEffectiveDate));
      }

  public void initChannelState(String value){
     this.initProperty(S_ChannelState,value);
  }
  public  void setChannelState(String value){
     this.set(S_ChannelState,value);
  }
  public  void setChannelStateNull(){
     this.set(S_ChannelState,null);
  }

  public String getChannelState(){
       return DataType.getAsString(this.get(S_ChannelState));
  
  }
  public String getChannelStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ChannelState));
      }

  public void initCustContRelaId(long value){
     this.initProperty(S_CustContRelaId,new Long(value));
  }
  public  void setCustContRelaId(long value){
     this.set(S_CustContRelaId,new Long(value));
  }
  public  void setCustContRelaIdNull(){
     this.set(S_CustContRelaId,null);
  }

  public long getCustContRelaId(){
        return DataType.getAsLong(this.get(S_CustContRelaId));
  
  }
  public long getCustContRelaIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustContRelaId));
      }

  public void initMediumCreateOpId(long value){
     this.initProperty(S_MediumCreateOpId,new Long(value));
  }
  public  void setMediumCreateOpId(long value){
     this.set(S_MediumCreateOpId,new Long(value));
  }
  public  void setMediumCreateOpIdNull(){
     this.set(S_MediumCreateOpId,null);
  }

  public long getMediumCreateOpId(){
        return DataType.getAsLong(this.get(S_MediumCreateOpId));
  
  }
  public long getMediumCreateOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MediumCreateOpId));
      }

  public void initContNumber(String value){
     this.initProperty(S_ContNumber,value);
  }
  public  void setContNumber(String value){
     this.set(S_ContNumber,value);
  }
  public  void setContNumberNull(){
     this.set(S_ContNumber,null);
  }

  public String getContNumber(){
       return DataType.getAsString(this.get(S_ContNumber));
  
  }
  public String getContNumberInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContNumber));
      }

  public void initContMedTypeId(long value){
     this.initProperty(S_ContMedTypeId,new Long(value));
  }
  public  void setContMedTypeId(long value){
     this.set(S_ContMedTypeId,new Long(value));
  }
  public  void setContMedTypeIdNull(){
     this.set(S_ContMedTypeId,null);
  }

  public long getContMedTypeId(){
        return DataType.getAsLong(this.get(S_ContMedTypeId));
  
  }
  public long getContMedTypeIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ContMedTypeId));
      }

  public void initPerferType(int value){
     this.initProperty(S_PerferType,new Integer(value));
  }
  public  void setPerferType(int value){
     this.set(S_PerferType,new Integer(value));
  }
  public  void setPerferTypeNull(){
     this.set(S_PerferType,null);
  }

  public int getPerferType(){
        return DataType.getAsInt(this.get(S_PerferType));
  
  }
  public int getPerferTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PerferType));
      }

  public void initMediumRegionId(String value){
     this.initProperty(S_MediumRegionId,value);
  }
  public  void setMediumRegionId(String value){
     this.set(S_MediumRegionId,value);
  }
  public  void setMediumRegionIdNull(){
     this.set(S_MediumRegionId,null);
  }

  public String getMediumRegionId(){
       return DataType.getAsString(this.get(S_MediumRegionId));
  
  }
  public String getMediumRegionIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MediumRegionId));
      }

  public void initIsNoDisturbing(int value){
     this.initProperty(S_IsNoDisturbing,new Integer(value));
  }
  public  void setIsNoDisturbing(int value){
     this.set(S_IsNoDisturbing,new Integer(value));
  }
  public  void setIsNoDisturbingNull(){
     this.set(S_IsNoDisturbing,null);
  }

  public int getIsNoDisturbing(){
        return DataType.getAsInt(this.get(S_IsNoDisturbing));
  
  }
  public int getIsNoDisturbingInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsNoDisturbing));
      }

  public void initChannelOpId(long value){
     this.initProperty(S_ChannelOpId,new Long(value));
  }
  public  void setChannelOpId(long value){
     this.set(S_ChannelOpId,new Long(value));
  }
  public  void setChannelOpIdNull(){
     this.set(S_ChannelOpId,null);
  }

  public long getChannelOpId(){
        return DataType.getAsLong(this.get(S_ChannelOpId));
  
  }
  public long getChannelOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ChannelOpId));
      }

  public void initMediumCreateDate(Timestamp value){
     this.initProperty(S_MediumCreateDate,value);
  }
  public  void setMediumCreateDate(Timestamp value){
     this.set(S_MediumCreateDate,value);
  }
  public  void setMediumCreateDateNull(){
     this.set(S_MediumCreateDate,null);
  }

  public Timestamp getMediumCreateDate(){
        return DataType.getAsDateTime(this.get(S_MediumCreateDate));
  
  }
  public Timestamp getMediumCreateDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_MediumCreateDate));
      }

  public void initPostalCode(String value){
     this.initProperty(S_PostalCode,value);
  }
  public  void setPostalCode(String value){
     this.set(S_PostalCode,value);
  }
  public  void setPostalCodeNull(){
     this.set(S_PostalCode,null);
  }

  public String getPostalCode(){
       return DataType.getAsString(this.get(S_PostalCode));
  
  }
  public String getPostalCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PostalCode));
      }

  public void initMediumState(String value){
     this.initProperty(S_MediumState,value);
  }
  public  void setMediumState(String value){
     this.set(S_MediumState,value);
  }
  public  void setMediumStateNull(){
     this.set(S_MediumState,null);
  }

  public String getMediumState(){
       return DataType.getAsString(this.get(S_MediumState));
  
  }
  public String getMediumStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MediumState));
      }

  public void initMediumCreateOrgId(long value){
     this.initProperty(S_MediumCreateOrgId,new Long(value));
  }
  public  void setMediumCreateOrgId(long value){
     this.set(S_MediumCreateOrgId,new Long(value));
  }
  public  void setMediumCreateOrgIdNull(){
     this.set(S_MediumCreateOrgId,null);
  }

  public long getMediumCreateOrgId(){
        return DataType.getAsLong(this.get(S_MediumCreateOrgId));
  
  }
  public long getMediumCreateOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MediumCreateOrgId));
      }

  public void initPrior(int value){
     this.initProperty(S_Prior,new Integer(value));
  }
  public  void setPrior(int value){
     this.set(S_Prior,new Integer(value));
  }
  public  void setPriorNull(){
     this.set(S_Prior,null);
  }

  public int getPrior(){
        return DataType.getAsInt(this.get(S_Prior));
  
  }
  public int getPriorInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Prior));
      }

  public void initEmailAddress(String value){
     this.initProperty(S_EmailAddress,value);
  }
  public  void setEmailAddress(String value){
     this.set(S_EmailAddress,value);
  }
  public  void setEmailAddressNull(){
     this.set(S_EmailAddress,null);
  }

  public String getEmailAddress(){
       return DataType.getAsString(this.get(S_EmailAddress));
  
  }
  public String getEmailAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EmailAddress));
      }


 
 }

