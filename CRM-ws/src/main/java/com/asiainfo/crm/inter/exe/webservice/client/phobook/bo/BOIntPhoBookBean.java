package com.asiainfo.crm.inter.exe.webservice.client.phobook.bo;


import java.sql.Timestamp;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.ServiceManager;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.ivalues.IBOIntPhoBookValue;

public class BOIntPhoBookBean extends DataContainer implements DataContainerInterface,IBOIntPhoBookValue{

  private static String  m_boName = "com.asiainfo.crm.inter.ws.bo.BOIntPhoBook";



  public final static  String S_TelephoneServiceTypeCode = "TELEPHONE_SERVICE_TYPE_CODE";
  public final static  String S_AddressId = "ADDRESS_ID";
  public final static  String S_AnonymousPrepaidIndicator = "ANONYMOUS_PREPAID_INDICATOR";
  public final static  String S_EmploymentPositionName = "EMPLOYMENT_POSITION_NAME";
  public final static  String S_PostCodeIdentifier = "POST_CODE_IDENTIFIER";
  public final static  String S_TelephoneSubscriber = "TELEPHONE_SUBSCRIBER";
  public final static  String S_PersonMiddleName = "PERSON_MIDDLE_NAME";
  public final static  String S_Status = "STATUS";
  public final static  String S_PersonGivenName = "PERSON_GIVEN_NAME";
  public final static  String S_OrgnizationName = "ORGNIZATION_NAME";
  public final static  String S_TelephoneSubscriberProtectionCode = "TELEPHONE_SUBSCRIBER_PROTECTION_CODE";
  public final static  String S_StreetName = "STREET_NAME";
  public final static  String S_StreetBuildingIdentifier = "STREET_BUILDING_IDENTIFIER";
  public final static  String S_DistrictSubdivisionIdentifier = "DISTRICT_SUBDIVISION_IDENTIFIER";
  public final static  String S_DanishTelephoneNumberIdentifier = "DANISH_TELEPHONE_NUMBER_IDENTIFIER";
  public final static  String S_PersonSurnameName = "PERSON_SURNAME_NAME";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_TelephoneSpecificUsageCode = "TELEPHONE_SPECIFIC_USAGE_CODE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOIntPhoBookBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initTelephoneServiceTypeCode(String value){
     this.initProperty(S_TelephoneServiceTypeCode,value);
  }
  public  void setTelephoneServiceTypeCode(String value){
     this.set(S_TelephoneServiceTypeCode,value);
  }
  public  void setTelephoneServiceTypeCodeNull(){
     this.set(S_TelephoneServiceTypeCode,null);
  }

  public String getTelephoneServiceTypeCode(){
       return DataType.getAsString(this.get(S_TelephoneServiceTypeCode));
  
  }
  public String getTelephoneServiceTypeCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TelephoneServiceTypeCode));
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

  public void initAnonymousPrepaidIndicator(String value){
     this.initProperty(S_AnonymousPrepaidIndicator,value);
  }
  public  void setAnonymousPrepaidIndicator(String value){
     this.set(S_AnonymousPrepaidIndicator,value);
  }
  public  void setAnonymousPrepaidIndicatorNull(){
     this.set(S_AnonymousPrepaidIndicator,null);
  }

  public String getAnonymousPrepaidIndicator(){
       return DataType.getAsString(this.get(S_AnonymousPrepaidIndicator));
  
  }
  public String getAnonymousPrepaidIndicatorInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AnonymousPrepaidIndicator));
      }

  public void initEmploymentPositionName(String value){
     this.initProperty(S_EmploymentPositionName,value);
  }
  public  void setEmploymentPositionName(String value){
     this.set(S_EmploymentPositionName,value);
  }
  public  void setEmploymentPositionNameNull(){
     this.set(S_EmploymentPositionName,null);
  }

  public String getEmploymentPositionName(){
       return DataType.getAsString(this.get(S_EmploymentPositionName));
  
  }
  public String getEmploymentPositionNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EmploymentPositionName));
      }

  public void initPostCodeIdentifier(String value){
     this.initProperty(S_PostCodeIdentifier,value);
  }
  public  void setPostCodeIdentifier(String value){
     this.set(S_PostCodeIdentifier,value);
  }
  public  void setPostCodeIdentifierNull(){
     this.set(S_PostCodeIdentifier,null);
  }

  public String getPostCodeIdentifier(){
       return DataType.getAsString(this.get(S_PostCodeIdentifier));
  
  }
  public String getPostCodeIdentifierInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PostCodeIdentifier));
      }

  public void initTelephoneSubscriber(String value){
     this.initProperty(S_TelephoneSubscriber,value);
  }
  public  void setTelephoneSubscriber(String value){
     this.set(S_TelephoneSubscriber,value);
  }
  public  void setTelephoneSubscriberNull(){
     this.set(S_TelephoneSubscriber,null);
  }

  public String getTelephoneSubscriber(){
       return DataType.getAsString(this.get(S_TelephoneSubscriber));
  
  }
  public String getTelephoneSubscriberInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TelephoneSubscriber));
      }

  public void initPersonMiddleName(String value){
     this.initProperty(S_PersonMiddleName,value);
  }
  public  void setPersonMiddleName(String value){
     this.set(S_PersonMiddleName,value);
  }
  public  void setPersonMiddleNameNull(){
     this.set(S_PersonMiddleName,null);
  }

  public String getPersonMiddleName(){
       return DataType.getAsString(this.get(S_PersonMiddleName));
  
  }
  public String getPersonMiddleNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PersonMiddleName));
      }

  public void initStatus(String value){
     this.initProperty(S_Status,value);
  }
  public  void setStatus(String value){
     this.set(S_Status,value);
  }
  public  void setStatusNull(){
     this.set(S_Status,null);
  }

  public String getStatus(){
       return DataType.getAsString(this.get(S_Status));
  
  }
  public String getStatusInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Status));
      }

  public void initPersonGivenName(String value){
     this.initProperty(S_PersonGivenName,value);
  }
  public  void setPersonGivenName(String value){
     this.set(S_PersonGivenName,value);
  }
  public  void setPersonGivenNameNull(){
     this.set(S_PersonGivenName,null);
  }

  public String getPersonGivenName(){
       return DataType.getAsString(this.get(S_PersonGivenName));
  
  }
  public String getPersonGivenNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PersonGivenName));
      }

  public void initOrgnizationName(String value){
     this.initProperty(S_OrgnizationName,value);
  }
  public  void setOrgnizationName(String value){
     this.set(S_OrgnizationName,value);
  }
  public  void setOrgnizationNameNull(){
     this.set(S_OrgnizationName,null);
  }

  public String getOrgnizationName(){
       return DataType.getAsString(this.get(S_OrgnizationName));
  
  }
  public String getOrgnizationNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OrgnizationName));
      }

  public void initTelephoneSubscriberProtectionCode(String value){
     this.initProperty(S_TelephoneSubscriberProtectionCode,value);
  }
  public  void setTelephoneSubscriberProtectionCode(String value){
     this.set(S_TelephoneSubscriberProtectionCode,value);
  }
  public  void setTelephoneSubscriberProtectionCodeNull(){
     this.set(S_TelephoneSubscriberProtectionCode,null);
  }

  public String getTelephoneSubscriberProtectionCode(){
       return DataType.getAsString(this.get(S_TelephoneSubscriberProtectionCode));
  
  }
  public String getTelephoneSubscriberProtectionCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TelephoneSubscriberProtectionCode));
      }

  public void initStreetName(String value){
     this.initProperty(S_StreetName,value);
  }
  public  void setStreetName(String value){
     this.set(S_StreetName,value);
  }
  public  void setStreetNameNull(){
     this.set(S_StreetName,null);
  }

  public String getStreetName(){
       return DataType.getAsString(this.get(S_StreetName));
  
  }
  public String getStreetNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_StreetName));
      }

  public void initStreetBuildingIdentifier(String value){
     this.initProperty(S_StreetBuildingIdentifier,value);
  }
  public  void setStreetBuildingIdentifier(String value){
     this.set(S_StreetBuildingIdentifier,value);
  }
  public  void setStreetBuildingIdentifierNull(){
     this.set(S_StreetBuildingIdentifier,null);
  }

  public String getStreetBuildingIdentifier(){
       return DataType.getAsString(this.get(S_StreetBuildingIdentifier));
  
  }
  public String getStreetBuildingIdentifierInitialValue(){
        return DataType.getAsString(this.getOldObj(S_StreetBuildingIdentifier));
      }

  public void initDistrictSubdivisionIdentifier(String value){
     this.initProperty(S_DistrictSubdivisionIdentifier,value);
  }
  public  void setDistrictSubdivisionIdentifier(String value){
     this.set(S_DistrictSubdivisionIdentifier,value);
  }
  public  void setDistrictSubdivisionIdentifierNull(){
     this.set(S_DistrictSubdivisionIdentifier,null);
  }

  public String getDistrictSubdivisionIdentifier(){
       return DataType.getAsString(this.get(S_DistrictSubdivisionIdentifier));
  
  }
  public String getDistrictSubdivisionIdentifierInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DistrictSubdivisionIdentifier));
      }

  public void initDanishTelephoneNumberIdentifier(String value){
     this.initProperty(S_DanishTelephoneNumberIdentifier,value);
  }
  public  void setDanishTelephoneNumberIdentifier(String value){
     this.set(S_DanishTelephoneNumberIdentifier,value);
  }
  public  void setDanishTelephoneNumberIdentifierNull(){
     this.set(S_DanishTelephoneNumberIdentifier,null);
  }

  public String getDanishTelephoneNumberIdentifier(){
       return DataType.getAsString(this.get(S_DanishTelephoneNumberIdentifier));
  
  }
  public String getDanishTelephoneNumberIdentifierInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DanishTelephoneNumberIdentifier));
      }

  public void initPersonSurnameName(String value){
     this.initProperty(S_PersonSurnameName,value);
  }
  public  void setPersonSurnameName(String value){
     this.set(S_PersonSurnameName,value);
  }
  public  void setPersonSurnameNameNull(){
     this.set(S_PersonSurnameName,null);
  }

  public String getPersonSurnameName(){
       return DataType.getAsString(this.get(S_PersonSurnameName));
  
  }
  public String getPersonSurnameNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PersonSurnameName));
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

  public void initTelephoneSpecificUsageCode(String value){
     this.initProperty(S_TelephoneSpecificUsageCode,value);
  }
  public  void setTelephoneSpecificUsageCode(String value){
     this.set(S_TelephoneSpecificUsageCode,value);
  }
  public  void setTelephoneSpecificUsageCodeNull(){
     this.set(S_TelephoneSpecificUsageCode,null);
  }

  public String getTelephoneSpecificUsageCode(){
       return DataType.getAsString(this.get(S_TelephoneSpecificUsageCode));
  
  }
  public String getTelephoneSpecificUsageCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TelephoneSpecificUsageCode));
      }


 
 }

