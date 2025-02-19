package com.asiainfo.crm.inter.exe.webservice.client.phobook.ivalues;
import com.ai.appframe2.common.DataStructInterface;  
import java.sql.Timestamp;
public interface IBOIntPhoBookValue extends DataStructInterface{

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


public String getTelephoneServiceTypeCode();

public long getAddressId();

public String getAnonymousPrepaidIndicator();

public String getEmploymentPositionName();

public String getPostCodeIdentifier();

public String getTelephoneSubscriber();

public String getPersonMiddleName();

public String getStatus();

public String getPersonGivenName();

public String getOrgnizationName();

public String getTelephoneSubscriberProtectionCode();

public String getStreetName();

public String getStreetBuildingIdentifier();

public String getDistrictSubdivisionIdentifier();

public String getDanishTelephoneNumberIdentifier();

public String getPersonSurnameName();

public Timestamp getCreateDate();

public String getTelephoneSpecificUsageCode();


public  void setTelephoneServiceTypeCode(String value);

public  void setAddressId(long value);

public  void setAnonymousPrepaidIndicator(String value);

public  void setEmploymentPositionName(String value);

public  void setPostCodeIdentifier(String value);

public  void setTelephoneSubscriber(String value);

public  void setPersonMiddleName(String value);

public  void setStatus(String value);

public  void setPersonGivenName(String value);

public  void setOrgnizationName(String value);

public  void setTelephoneSubscriberProtectionCode(String value);

public  void setStreetName(String value);

public  void setStreetBuildingIdentifier(String value);

public  void setDistrictSubdivisionIdentifier(String value);

public  void setDanishTelephoneNumberIdentifier(String value);

public  void setPersonSurnameName(String value);

public  void setCreateDate(Timestamp value);

public  void setTelephoneSpecificUsageCode(String value);
}
