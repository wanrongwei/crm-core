package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class QBOCmGroupCustMgrRelBean extends DataContainer implements DataContainerInterface,IQBOCmGroupCustMgrRelValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.QBOCmGroupCustMgrRel";



  public final static  String S_StaffType = "STAFF_TYPE";
  public final static  String S_PoliticsFace = "POLITICS_FACE";
  public final static  String S_NationalType = "NATIONAL_TYPE";
  public final static  String S_Postcode = "POSTCODE";
  public final static  String S_EducationLevel = "EDUCATION_LEVEL";
  public final static  String S_SecurityId = "SECURITY_ID";
  public final static  String S_CharacterDesc = "CHARACTER_DESC";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_IncomeLevel = "INCOME_LEVEL";
  public final static  String S_ContactAddress = "CONTACT_ADDRESS";
  public final static  String S_BcMgr = "BC_MGR";
  public final static  String S_HomeTel = "HOME_TEL";
  public final static  String S_CarNo = "CAR_NO";
  public final static  String S_AlarmBillId = "ALARM_BILL_ID";
  public final static  String S_CardNo = "CARD_NO";
  public final static  String S_MarryStatus = "MARRY_STATUS";
  public final static  String S_StaffName = "STAFF_NAME";
  public final static  String S_Email = "EMAIL";
  public final static  String S_CardTypeId = "CARD_TYPE_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_FaxId = "FAX_ID";
  public final static  String S_EnglishName = "ENGLISH_NAME";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_RelType = "REL_TYPE";
  public final static  String S_StaffLevel = "STAFF_LEVEL";
  public final static  String S_JobCompany = "JOB_COMPANY";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_OfficeTel = "OFFICE_TEL";
  public final static  String S_FamilyInfo = "FAMILY_INFO";
  public final static  String S_JobPosition = "JOB_POSITION";
  public final static  String S_StaffId = "STAFF_ID";
  public final static  String S_MgrId = "MGR_ID";
  public final static  String S_WirelessCall = "WIRELESS_CALL";
  public final static  String S_DistrictId = "DISTRICT_ID";
  public final static  String S_Gender = "GENDER";
  public final static  String S_JobDesc = "JOB_DESC";
  public final static  String S_SupStaffId = "SUP_STAFF_ID";
  public final static  String S_Religion = "RELIGION";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_ManagerType = "MANAGER_TYPE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmGroupCustMgrRelBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initStaffType(long value){
     this.initProperty(S_StaffType,new Long(value));
  }
  public  void setStaffType(long value){
     this.set(S_StaffType,new Long(value));
  }
  public  void setStaffTypeNull(){
     this.set(S_StaffType,null);
  }

  public long getStaffType(){
        return DataType.getAsLong(this.get(S_StaffType));
  
  }
  public long getStaffTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_StaffType));
      }

  public void initPoliticsFace(long value){
     this.initProperty(S_PoliticsFace,new Long(value));
  }
  public  void setPoliticsFace(long value){
     this.set(S_PoliticsFace,new Long(value));
  }
  public  void setPoliticsFaceNull(){
     this.set(S_PoliticsFace,null);
  }

  public long getPoliticsFace(){
        return DataType.getAsLong(this.get(S_PoliticsFace));
  
  }
  public long getPoliticsFaceInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PoliticsFace));
      }

  public void initNationalType(long value){
     this.initProperty(S_NationalType,new Long(value));
  }
  public  void setNationalType(long value){
     this.set(S_NationalType,new Long(value));
  }
  public  void setNationalTypeNull(){
     this.set(S_NationalType,null);
  }

  public long getNationalType(){
        return DataType.getAsLong(this.get(S_NationalType));
  
  }
  public long getNationalTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_NationalType));
      }

  public void initPostcode(long value){
     this.initProperty(S_Postcode,new Long(value));
  }
  public  void setPostcode(long value){
     this.set(S_Postcode,new Long(value));
  }
  public  void setPostcodeNull(){
     this.set(S_Postcode,null);
  }

  public long getPostcode(){
        return DataType.getAsLong(this.get(S_Postcode));
  
  }
  public long getPostcodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Postcode));
      }

  public void initEducationLevel(long value){
     this.initProperty(S_EducationLevel,new Long(value));
  }
  public  void setEducationLevel(long value){
     this.set(S_EducationLevel,new Long(value));
  }
  public  void setEducationLevelNull(){
     this.set(S_EducationLevel,null);
  }

  public long getEducationLevel(){
        return DataType.getAsLong(this.get(S_EducationLevel));
  
  }
  public long getEducationLevelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_EducationLevel));
      }

  public void initSecurityId(String value){
     this.initProperty(S_SecurityId,value);
  }
  public  void setSecurityId(String value){
     this.set(S_SecurityId,value);
  }
  public  void setSecurityIdNull(){
     this.set(S_SecurityId,null);
  }

  public String getSecurityId(){
       return DataType.getAsString(this.get(S_SecurityId));
  
  }
  public String getSecurityIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SecurityId));
      }

  public void initCharacterDesc(String value){
     this.initProperty(S_CharacterDesc,value);
  }
  public  void setCharacterDesc(String value){
     this.set(S_CharacterDesc,value);
  }
  public  void setCharacterDescNull(){
     this.set(S_CharacterDesc,null);
  }

  public String getCharacterDesc(){
       return DataType.getAsString(this.get(S_CharacterDesc));
  
  }
  public String getCharacterDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CharacterDesc));
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

  public void initIncomeLevel(long value){
     this.initProperty(S_IncomeLevel,new Long(value));
  }
  public  void setIncomeLevel(long value){
     this.set(S_IncomeLevel,new Long(value));
  }
  public  void setIncomeLevelNull(){
     this.set(S_IncomeLevel,null);
  }

  public long getIncomeLevel(){
        return DataType.getAsLong(this.get(S_IncomeLevel));
  
  }
  public long getIncomeLevelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IncomeLevel));
      }

  public void initContactAddress(String value){
     this.initProperty(S_ContactAddress,value);
  }
  public  void setContactAddress(String value){
     this.set(S_ContactAddress,value);
  }
  public  void setContactAddressNull(){
     this.set(S_ContactAddress,null);
  }

  public String getContactAddress(){
       return DataType.getAsString(this.get(S_ContactAddress));
  
  }
  public String getContactAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContactAddress));
      }

  public void initBcMgr(String value){
     this.initProperty(S_BcMgr,value);
  }
  public  void setBcMgr(String value){
     this.set(S_BcMgr,value);
  }
  public  void setBcMgrNull(){
     this.set(S_BcMgr,null);
  }

  public String getBcMgr(){
       return DataType.getAsString(this.get(S_BcMgr));
  
  }
  public String getBcMgrInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BcMgr));
      }

  public void initHomeTel(String value){
     this.initProperty(S_HomeTel,value);
  }
  public  void setHomeTel(String value){
     this.set(S_HomeTel,value);
  }
  public  void setHomeTelNull(){
     this.set(S_HomeTel,null);
  }

  public String getHomeTel(){
       return DataType.getAsString(this.get(S_HomeTel));
  
  }
  public String getHomeTelInitialValue(){
        return DataType.getAsString(this.getOldObj(S_HomeTel));
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

  public void initAlarmBillId(String value){
     this.initProperty(S_AlarmBillId,value);
  }
  public  void setAlarmBillId(String value){
     this.set(S_AlarmBillId,value);
  }
  public  void setAlarmBillIdNull(){
     this.set(S_AlarmBillId,null);
  }

  public String getAlarmBillId(){
       return DataType.getAsString(this.get(S_AlarmBillId));
  
  }
  public String getAlarmBillIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AlarmBillId));
      }

  public void initCardNo(String value){
     this.initProperty(S_CardNo,value);
  }
  public  void setCardNo(String value){
     this.set(S_CardNo,value);
  }
  public  void setCardNoNull(){
     this.set(S_CardNo,null);
  }

  public String getCardNo(){
       return DataType.getAsString(this.get(S_CardNo));
  
  }
  public String getCardNoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CardNo));
      }

  public void initMarryStatus(long value){
     this.initProperty(S_MarryStatus,new Long(value));
  }
  public  void setMarryStatus(long value){
     this.set(S_MarryStatus,new Long(value));
  }
  public  void setMarryStatusNull(){
     this.set(S_MarryStatus,null);
  }

  public long getMarryStatus(){
        return DataType.getAsLong(this.get(S_MarryStatus));
  
  }
  public long getMarryStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MarryStatus));
      }

  public void initStaffName(String value){
     this.initProperty(S_StaffName,value);
  }
  public  void setStaffName(String value){
     this.set(S_StaffName,value);
  }
  public  void setStaffNameNull(){
     this.set(S_StaffName,null);
  }

  public String getStaffName(){
       return DataType.getAsString(this.get(S_StaffName));
  
  }
  public String getStaffNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_StaffName));
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

  public void initCardTypeId(long value){
     this.initProperty(S_CardTypeId,new Long(value));
  }
  public  void setCardTypeId(long value){
     this.set(S_CardTypeId,new Long(value));
  }
  public  void setCardTypeIdNull(){
     this.set(S_CardTypeId,null);
  }

  public long getCardTypeId(){
        return DataType.getAsLong(this.get(S_CardTypeId));
  
  }
  public long getCardTypeIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CardTypeId));
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

  public void initOperType(long value){
     this.initProperty(S_OperType,new Long(value));
  }
  public  void setOperType(long value){
     this.set(S_OperType,new Long(value));
  }
  public  void setOperTypeNull(){
     this.set(S_OperType,null);
  }

  public long getOperType(){
        return DataType.getAsLong(this.get(S_OperType));
  
  }
  public long getOperTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OperType));
      }

  public void initFaxId(String value){
     this.initProperty(S_FaxId,value);
  }
  public  void setFaxId(String value){
     this.set(S_FaxId,value);
  }
  public  void setFaxIdNull(){
     this.set(S_FaxId,null);
  }

  public String getFaxId(){
       return DataType.getAsString(this.get(S_FaxId));
  
  }
  public String getFaxIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FaxId));
      }

  public void initEnglishName(String value){
     this.initProperty(S_EnglishName,value);
  }
  public  void setEnglishName(String value){
     this.set(S_EnglishName,value);
  }
  public  void setEnglishNameNull(){
     this.set(S_EnglishName,null);
  }

  public String getEnglishName(){
       return DataType.getAsString(this.get(S_EnglishName));
  
  }
  public String getEnglishNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EnglishName));
      }

  public void initBirthday(Timestamp value){
     this.initProperty(S_Birthday,value);
  }
  public  void setBirthday(Timestamp value){
     this.set(S_Birthday,value);
  }
  public  void setBirthdayNull(){
     this.set(S_Birthday,null);
  }

  public Timestamp getBirthday(){
        return DataType.getAsDateTime(this.get(S_Birthday));
  
  }
  public Timestamp getBirthdayInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_Birthday));
      }

  public void initRelType(long value){
     this.initProperty(S_RelType,new Long(value));
  }
  public  void setRelType(long value){
     this.set(S_RelType,new Long(value));
  }
  public  void setRelTypeNull(){
     this.set(S_RelType,null);
  }

  public long getRelType(){
        return DataType.getAsLong(this.get(S_RelType));
  
  }
  public long getRelTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelType));
      }

  public void initStaffLevel(long value){
     this.initProperty(S_StaffLevel,new Long(value));
  }
  public  void setStaffLevel(long value){
     this.set(S_StaffLevel,new Long(value));
  }
  public  void setStaffLevelNull(){
     this.set(S_StaffLevel,null);
  }

  public long getStaffLevel(){
        return DataType.getAsLong(this.get(S_StaffLevel));
  
  }
  public long getStaffLevelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_StaffLevel));
      }

  public void initJobCompany(String value){
     this.initProperty(S_JobCompany,value);
  }
  public  void setJobCompany(String value){
     this.set(S_JobCompany,value);
  }
  public  void setJobCompanyNull(){
     this.set(S_JobCompany,null);
  }

  public String getJobCompany(){
       return DataType.getAsString(this.get(S_JobCompany));
  
  }
  public String getJobCompanyInitialValue(){
        return DataType.getAsString(this.getOldObj(S_JobCompany));
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

  public void initOfficeTel(String value){
     this.initProperty(S_OfficeTel,value);
  }
  public  void setOfficeTel(String value){
     this.set(S_OfficeTel,value);
  }
  public  void setOfficeTelNull(){
     this.set(S_OfficeTel,null);
  }

  public String getOfficeTel(){
       return DataType.getAsString(this.get(S_OfficeTel));
  
  }
  public String getOfficeTelInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OfficeTel));
      }

  public void initFamilyInfo(String value){
     this.initProperty(S_FamilyInfo,value);
  }
  public  void setFamilyInfo(String value){
     this.set(S_FamilyInfo,value);
  }
  public  void setFamilyInfoNull(){
     this.set(S_FamilyInfo,null);
  }

  public String getFamilyInfo(){
       return DataType.getAsString(this.get(S_FamilyInfo));
  
  }
  public String getFamilyInfoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FamilyInfo));
      }

  public void initJobPosition(String value){
     this.initProperty(S_JobPosition,value);
  }
  public  void setJobPosition(String value){
     this.set(S_JobPosition,value);
  }
  public  void setJobPositionNull(){
     this.set(S_JobPosition,null);
  }

  public String getJobPosition(){
       return DataType.getAsString(this.get(S_JobPosition));
  
  }
  public String getJobPositionInitialValue(){
        return DataType.getAsString(this.getOldObj(S_JobPosition));
      }

  public void initStaffId(long value){
     this.initProperty(S_StaffId,new Long(value));
  }
  public  void setStaffId(long value){
     this.set(S_StaffId,new Long(value));
  }
  public  void setStaffIdNull(){
     this.set(S_StaffId,null);
  }

  public long getStaffId(){
        return DataType.getAsLong(this.get(S_StaffId));
  
  }
  public long getStaffIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_StaffId));
      }

  public void initMgrId(long value){
     this.initProperty(S_MgrId,new Long(value));
  }
  public  void setMgrId(long value){
     this.set(S_MgrId,new Long(value));
  }
  public  void setMgrIdNull(){
     this.set(S_MgrId,null);
  }

  public long getMgrId(){
        return DataType.getAsLong(this.get(S_MgrId));
  
  }
  public long getMgrIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MgrId));
      }

  public void initWirelessCall(String value){
     this.initProperty(S_WirelessCall,value);
  }
  public  void setWirelessCall(String value){
     this.set(S_WirelessCall,value);
  }
  public  void setWirelessCallNull(){
     this.set(S_WirelessCall,null);
  }

  public String getWirelessCall(){
       return DataType.getAsString(this.get(S_WirelessCall));
  
  }
  public String getWirelessCallInitialValue(){
        return DataType.getAsString(this.getOldObj(S_WirelessCall));
      }

  public void initDistrictId(String value){
     this.initProperty(S_DistrictId,value);
  }
  public  void setDistrictId(String value){
     this.set(S_DistrictId,value);
  }
  public  void setDistrictIdNull(){
     this.set(S_DistrictId,null);
  }

  public String getDistrictId(){
       return DataType.getAsString(this.get(S_DistrictId));
  
  }
  public String getDistrictIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DistrictId));
      }

  public void initGender(long value){
     this.initProperty(S_Gender,new Long(value));
  }
  public  void setGender(long value){
     this.set(S_Gender,new Long(value));
  }
  public  void setGenderNull(){
     this.set(S_Gender,null);
  }

  public long getGender(){
        return DataType.getAsLong(this.get(S_Gender));
  
  }
  public long getGenderInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Gender));
      }

  public void initJobDesc(String value){
     this.initProperty(S_JobDesc,value);
  }
  public  void setJobDesc(String value){
     this.set(S_JobDesc,value);
  }
  public  void setJobDescNull(){
     this.set(S_JobDesc,null);
  }

  public String getJobDesc(){
       return DataType.getAsString(this.get(S_JobDesc));
  
  }
  public String getJobDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_JobDesc));
      }

  public void initSupStaffId(long value){
     this.initProperty(S_SupStaffId,new Long(value));
  }
  public  void setSupStaffId(long value){
     this.set(S_SupStaffId,new Long(value));
  }
  public  void setSupStaffIdNull(){
     this.set(S_SupStaffId,null);
  }

  public long getSupStaffId(){
        return DataType.getAsLong(this.get(S_SupStaffId));
  
  }
  public long getSupStaffIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SupStaffId));
      }

  public void initReligion(long value){
     this.initProperty(S_Religion,new Long(value));
  }
  public  void setReligion(long value){
     this.set(S_Religion,new Long(value));
  }
  public  void setReligionNull(){
     this.set(S_Religion,null);
  }

  public long getReligion(){
        return DataType.getAsLong(this.get(S_Religion));
  
  }
  public long getReligionInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Religion));
      }

  public void initBillId(String value){
     this.initProperty(S_BillId,value);
  }
  public  void setBillId(String value){
     this.set(S_BillId,value);
  }
  public  void setBillIdNull(){
     this.set(S_BillId,null);
  }

  public String getBillId(){
       return DataType.getAsString(this.get(S_BillId));
  
  }
  public String getBillIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BillId));
      }

  public void initManagerType(long value){
     this.initProperty(S_ManagerType,new Long(value));
  }
  public  void setManagerType(long value){
     this.set(S_ManagerType,new Long(value));
  }
  public  void setManagerTypeNull(){
     this.set(S_ManagerType,null);
  }

  public long getManagerType(){
        return DataType.getAsLong(this.get(S_ManagerType));
  
  }
  public long getManagerTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ManagerType));
      }


 
 }

