package com.asiainfo.crm.cm.inner.customer.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.customer.ivalues.*;

public class BOCmxIndivCustExtBean extends DataContainer implements DataContainerInterface,IBOCmxIndivCustExtValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.customer.bo.BOCmxIndivCustExt";



  public final static  String S_State = "STATE";
  public final static  String S_EnterType = "ENTER_TYPE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_IssuingAuthority = "ISSUING_AUTHORITY";
  public final static  String S_IsOutnetCust = "IS_OUTNET_CUST";
  public final static  String S_ActivateChannelType = "ACTIVATE_CHANNEL_TYPE";
  public final static  String S_OtherAddress = "OTHER_ADDRESS";
  public final static  String S_GlobalRoamingSecondCrede = "GLOBAL_ROAMING_SECOND_CREDE";
  public final static  String S_CarNo = "CAR_NO";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_MobilePhoneType = "MOBILE_PHONE_TYPE";
  public final static  String S_OtherContAddress = "OTHER_CONT_ADDRESS";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Department = "DEPARTMENT";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_OtherBillId = "OTHER_BILL_ID";
  public final static  String S_AuthId = "AUTH_ID";
  public final static  String S_EnterTestNumber = "ENTER_TEST_NUMBER";
  public final static  String S_HotsellSource = "HOTSELL_SOURCE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OriginalOutnetBillId = "ORIGINAL_OUTNET_BILL_ID";
  public final static  String S_OtherContName = "OTHER_CONT_NAME";
  public final static  String S_CreateDate = "CREATE_DATE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmxIndivCustExtBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initEnterType(int value){
     this.initProperty(S_EnterType,new Integer(value));
  }
  public  void setEnterType(int value){
     this.set(S_EnterType,new Integer(value));
  }
  public  void setEnterTypeNull(){
     this.set(S_EnterType,null);
  }

  public int getEnterType(){
        return DataType.getAsInt(this.get(S_EnterType));
  
  }
  public int getEnterTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_EnterType));
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

  public void initIssuingAuthority(String value){
     this.initProperty(S_IssuingAuthority,value);
  }
  public  void setIssuingAuthority(String value){
     this.set(S_IssuingAuthority,value);
  }
  public  void setIssuingAuthorityNull(){
     this.set(S_IssuingAuthority,null);
  }

  public String getIssuingAuthority(){
       return DataType.getAsString(this.get(S_IssuingAuthority));
  
  }
  public String getIssuingAuthorityInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IssuingAuthority));
      }

  public void initIsOutnetCust(int value){
     this.initProperty(S_IsOutnetCust,new Integer(value));
  }
  public  void setIsOutnetCust(int value){
     this.set(S_IsOutnetCust,new Integer(value));
  }
  public  void setIsOutnetCustNull(){
     this.set(S_IsOutnetCust,null);
  }

  public int getIsOutnetCust(){
        return DataType.getAsInt(this.get(S_IsOutnetCust));
  
  }
  public int getIsOutnetCustInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsOutnetCust));
      }

  public void initActivateChannelType(int value){
     this.initProperty(S_ActivateChannelType,new Integer(value));
  }
  public  void setActivateChannelType(int value){
     this.set(S_ActivateChannelType,new Integer(value));
  }
  public  void setActivateChannelTypeNull(){
     this.set(S_ActivateChannelType,null);
  }

  public int getActivateChannelType(){
        return DataType.getAsInt(this.get(S_ActivateChannelType));
  
  }
  public int getActivateChannelTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ActivateChannelType));
      }

  public void initOtherAddress(String value){
     this.initProperty(S_OtherAddress,value);
  }
  public  void setOtherAddress(String value){
     this.set(S_OtherAddress,value);
  }
  public  void setOtherAddressNull(){
     this.set(S_OtherAddress,null);
  }

  public String getOtherAddress(){
       return DataType.getAsString(this.get(S_OtherAddress));
  
  }
  public String getOtherAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OtherAddress));
      }

  public void initGlobalRoamingSecondCrede(String value){
     this.initProperty(S_GlobalRoamingSecondCrede,value);
  }
  public  void setGlobalRoamingSecondCrede(String value){
     this.set(S_GlobalRoamingSecondCrede,value);
  }
  public  void setGlobalRoamingSecondCredeNull(){
     this.set(S_GlobalRoamingSecondCrede,null);
  }

  public String getGlobalRoamingSecondCrede(){
       return DataType.getAsString(this.get(S_GlobalRoamingSecondCrede));
  
  }
  public String getGlobalRoamingSecondCredeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GlobalRoamingSecondCrede));
      }

  public void initCarNo(String value){
     this.initProperty(S_CarNo,value);
  }
  public  void setCarNo(String value){
     this.set(S_CarNo,value);
  }
  public  void setCarNoNull(){
     this.set(S_CarNo,null);
  }

  public String getCarNo(){
       return DataType.getAsString(this.get(S_CarNo));
  
  }
  public String getCarNoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CarNo));
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

  public void initMobilePhoneType(String value){
     this.initProperty(S_MobilePhoneType,value);
  }
  public  void setMobilePhoneType(String value){
     this.set(S_MobilePhoneType,value);
  }
  public  void setMobilePhoneTypeNull(){
     this.set(S_MobilePhoneType,null);
  }

  public String getMobilePhoneType(){
       return DataType.getAsString(this.get(S_MobilePhoneType));
  
  }
  public String getMobilePhoneTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MobilePhoneType));
      }

  public void initOtherContAddress(String value){
     this.initProperty(S_OtherContAddress,value);
  }
  public  void setOtherContAddress(String value){
     this.set(S_OtherContAddress,value);
  }
  public  void setOtherContAddressNull(){
     this.set(S_OtherContAddress,null);
  }

  public String getOtherContAddress(){
       return DataType.getAsString(this.get(S_OtherContAddress));
  
  }
  public String getOtherContAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OtherContAddress));
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

  public void initDepartment(String value){
     this.initProperty(S_Department,value);
  }
  public  void setDepartment(String value){
     this.set(S_Department,value);
  }
  public  void setDepartmentNull(){
     this.set(S_Department,null);
  }

  public String getDepartment(){
       return DataType.getAsString(this.get(S_Department));
  
  }
  public String getDepartmentInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Department));
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

  public void initOtherBillId(String value){
     this.initProperty(S_OtherBillId,value);
  }
  public  void setOtherBillId(String value){
     this.set(S_OtherBillId,value);
  }
  public  void setOtherBillIdNull(){
     this.set(S_OtherBillId,null);
  }

  public String getOtherBillId(){
       return DataType.getAsString(this.get(S_OtherBillId));
  
  }
  public String getOtherBillIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OtherBillId));
      }

  public void initAuthId(String value){
     this.initProperty(S_AuthId,value);
  }
  public  void setAuthId(String value){
     this.set(S_AuthId,value);
  }
  public  void setAuthIdNull(){
     this.set(S_AuthId,null);
  }

  public String getAuthId(){
       return DataType.getAsString(this.get(S_AuthId));
  
  }
  public String getAuthIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AuthId));
      }

  public void initEnterTestNumber(String value){
     this.initProperty(S_EnterTestNumber,value);
  }
  public  void setEnterTestNumber(String value){
     this.set(S_EnterTestNumber,value);
  }
  public  void setEnterTestNumberNull(){
     this.set(S_EnterTestNumber,null);
  }

  public String getEnterTestNumber(){
       return DataType.getAsString(this.get(S_EnterTestNumber));
  
  }
  public String getEnterTestNumberInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EnterTestNumber));
      }

  public void initHotsellSource(int value){
     this.initProperty(S_HotsellSource,new Integer(value));
  }
  public  void setHotsellSource(int value){
     this.set(S_HotsellSource,new Integer(value));
  }
  public  void setHotsellSourceNull(){
     this.set(S_HotsellSource,null);
  }

  public int getHotsellSource(){
        return DataType.getAsInt(this.get(S_HotsellSource));
  
  }
  public int getHotsellSourceInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_HotsellSource));
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

  public void initOriginalOutnetBillId(String value){
     this.initProperty(S_OriginalOutnetBillId,value);
  }
  public  void setOriginalOutnetBillId(String value){
     this.set(S_OriginalOutnetBillId,value);
  }
  public  void setOriginalOutnetBillIdNull(){
     this.set(S_OriginalOutnetBillId,null);
  }

  public String getOriginalOutnetBillId(){
       return DataType.getAsString(this.get(S_OriginalOutnetBillId));
  
  }
  public String getOriginalOutnetBillIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OriginalOutnetBillId));
      }

  public void initOtherContName(String value){
     this.initProperty(S_OtherContName,value);
  }
  public  void setOtherContName(String value){
     this.set(S_OtherContName,value);
  }
  public  void setOtherContNameNull(){
     this.set(S_OtherContName,null);
  }

  public String getOtherContName(){
       return DataType.getAsString(this.get(S_OtherContName));
  
  }
  public String getOtherContNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OtherContName));
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


 
 }

