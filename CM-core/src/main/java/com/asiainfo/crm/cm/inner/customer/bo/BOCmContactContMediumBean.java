package com.asiainfo.crm.cm.inner.customer.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.customer.ivalues.*;

public class BOCmContactContMediumBean extends DataContainer implements DataContainerInterface,IBOCmContactContMediumValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.customer.bo.BOCmContactContMedium";



  public final static  String S_AddressId = "ADDRESS_ID";
  public final static  String S_UpContMedTypeId = "up_cont_med_type_id";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ContRelaId = "CONT_RELA_ID";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_FaxNumber = "FAX_NUMBER";
  public final static  String S_AddressCode = "ADDRESS_CODE";
  public final static  String S_AddressDetail = "ADDRESS_DETAIL";
  public final static  String S_ProtectExpDate = "PROTECT_EXP_DATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Action = "ACTION";
  public final static  String S_ProtectEffDate = "PROTECT_EFF_DATE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_Priority = "PRIORITY";
  public final static  String S_UseType = "use_type";
  public final static  String S_IsProtected = "IS_PROTECTED";
  public final static  String S_ContMedTypeName = "cont_med_type_name";
  public final static  String S_ContNumber = "CONT_NUMBER";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ContMedTypeId = "CONT_MED_TYPE_ID";
  public final static  String S_RelaId = "RELA_ID";
  public final static  String S_IsNoDisturbing = "IS_NO_DISTURBING";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_PostalCode = "POSTAL_CODE";
  public final static  String S_CustContId = "CUST_CONT_ID";
  public final static  String S_EmailAddress = "EMAIL_ADDRESS";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmContactContMediumBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initContRelaId(long value){
     this.initProperty(S_ContRelaId,new Long(value));
  }
  public  void setContRelaId(long value){
     this.set(S_ContRelaId,new Long(value));
  }
  public  void setContRelaIdNull(){
     this.set(S_ContRelaId,null);
  }

  public long getContRelaId(){
        return DataType.getAsLong(this.get(S_ContRelaId));
  
  }
  public long getContRelaIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ContRelaId));
      }

  public void initContId(long value){
     this.initProperty(S_ContId,new Long(value));
  }
  public  void setContId(long value){
     this.set(S_ContId,new Long(value));
  }
  public  void setContIdNull(){
     this.set(S_ContId,null);
  }

  public long getContId(){
        return DataType.getAsLong(this.get(S_ContId));
  
  }
  public long getContIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ContId));
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

  public void initUseType(int value){
     this.initProperty(S_UseType,new Integer(value));
  }
  public  void setUseType(int value){
     this.set(S_UseType,new Integer(value));
  }
  public  void setUseTypeNull(){
     this.set(S_UseType,null);
  }

  public int getUseType(){
        return DataType.getAsInt(this.get(S_UseType));
  
  }
  public int getUseTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_UseType));
      }

  public void initIsProtected(String value){
     this.initProperty(S_IsProtected,value);
  }
  public  void setIsProtected(String value){
     this.set(S_IsProtected,value);
  }
  public  void setIsProtectedNull(){
     this.set(S_IsProtected,null);
  }

  public String getIsProtected(){
       return DataType.getAsString(this.get(S_IsProtected));
  
  }
  public String getIsProtectedInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IsProtected));
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

  public void initRelaId(long value){
     this.initProperty(S_RelaId,new Long(value));
  }
  public  void setRelaId(long value){
     this.set(S_RelaId,new Long(value));
  }
  public  void setRelaIdNull(){
     this.set(S_RelaId,null);
  }

  public long getRelaId(){
        return DataType.getAsLong(this.get(S_RelaId));
  
  }
  public long getRelaIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelaId));
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

  public void initCustContId(long value){
     this.initProperty(S_CustContId,new Long(value));
  }
  public  void setCustContId(long value){
     this.set(S_CustContId,new Long(value));
  }
  public  void setCustContIdNull(){
     this.set(S_CustContId,null);
  }

  public long getCustContId(){
        return DataType.getAsLong(this.get(S_CustContId));
  
  }
  public long getCustContIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustContId));
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

