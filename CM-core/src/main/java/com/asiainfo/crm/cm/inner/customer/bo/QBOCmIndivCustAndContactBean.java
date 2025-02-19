package com.asiainfo.crm.cm.inner.customer.bo;

import java.sql.Timestamp;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.ServiceManager;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmIndivCustAndContactValue;

public class QBOCmIndivCustAndContactBean extends DataContainer implements DataContainerInterface,IQBOCmIndivCustAndContactValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.customer.bo.QBOCmIndivCustAndContact";



  public final static  String S_State = "STATE";
  public final static  String S_CustLevel = "CUST_LEVEL";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Occupation = "OCCUPATION";
  public final static  String S_CustCertExpire = "CUST_CERT_EXPIRE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CustCertAddress = "CUST_CERT_ADDRESS";
  public final static  String S_CustStatus = "CUST_STATUS";
  public final static  String S_MarryStatus = "MARRY_STATUS";
  public final static  String S_BaseCustId = "BASE_CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_CustZipcode = "CUST_ZIPCODE";
  public final static  String S_RealNameFlag = "REAL_NAME_FLAG";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_ContPhone = "CONT_PHONE";
  public final static  String S_Lunar = "LUNAR";
  public final static  String S_ContName = "CONT_NAME";
  public final static  String S_RelCustId = "REL_CUST_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_RelCustType = "REL_CUST_TYPE";
  public final static  String S_ContEffectiveDate = "CONT_EFFECTIVE_DATE";
  public final static  String S_CustCertCode = "CUST_CERT_CODE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_AllowAgent = "ALLOW_AGENT";
  public final static  String S_VipNo = "VIP_NO";
  public final static  String S_AdminFamilyId = "ADMIN_FAMILY_ID";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_ContExpireDate = "CONT_EXPIRE_DATE";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_ContType = "CONT_TYPE";
  public final static  String S_OtherContMedium = "OTHER_CONT_MEDIUM";
  public final static  String S_ContZipcode = "CONT_ZIPCODE";
  public final static  String S_ContGender = "CONT_GENDER";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CustCertType = "CUST_CERT_TYPE";
  public final static  String S_ContFax = "CONT_FAX";
  public final static  String S_EntryChnl = "ENTRY_CHNL";
  public final static  String S_CustAddress = "CUST_ADDRESS";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_IndivCustId = "INDIV_CUST_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CharacterDesc = "CHARACTER_DESC";
  public final static  String S_PriorContMetohd = "PRIOR_CONT_METOHD";
  public final static  String S_Gender = "GENDER";
  public final static  String S_ContractNo = "CONTRACT_NO";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmIndivCustAndContactBean() throws AIException{
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

  public void initCustLevel(long value){
     this.initProperty(S_CustLevel,new Long(value));
  }
  public  void setCustLevel(long value){
     this.set(S_CustLevel,new Long(value));
  }
  public  void setCustLevelNull(){
     this.set(S_CustLevel,null);
  }

  public long getCustLevel(){
        return DataType.getAsLong(this.get(S_CustLevel));
  
  }
  public long getCustLevelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustLevel));
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

  public void initOccupation(long value){
     this.initProperty(S_Occupation,new Long(value));
  }
  public  void setOccupation(long value){
     this.set(S_Occupation,new Long(value));
  }
  public  void setOccupationNull(){
     this.set(S_Occupation,null);
  }

  public long getOccupation(){
        return DataType.getAsLong(this.get(S_Occupation));
  
  }
  public long getOccupationInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Occupation));
      }

  public void initCustCertExpire(Timestamp value){
     this.initProperty(S_CustCertExpire,value);
  }
  public  void setCustCertExpire(Timestamp value){
     this.set(S_CustCertExpire,value);
  }
  public  void setCustCertExpireNull(){
     this.set(S_CustCertExpire,null);
  }

  public Timestamp getCustCertExpire(){
        return DataType.getAsDateTime(this.get(S_CustCertExpire));
  
  }
  public Timestamp getCustCertExpireInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CustCertExpire));
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

  public void initCustName(String value){
     this.initProperty(S_CustName,value);
  }
  public  void setCustName(String value){
     this.set(S_CustName,value);
  }
  public  void setCustNameNull(){
     this.set(S_CustName,null);
  }

  public String getCustName(){
       return DataType.getAsString(this.get(S_CustName));
  
  }
  public String getCustNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustName));
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

  public void initCustCertAddress(String value){
     this.initProperty(S_CustCertAddress,value);
  }
  public  void setCustCertAddress(String value){
     this.set(S_CustCertAddress,value);
  }
  public  void setCustCertAddressNull(){
     this.set(S_CustCertAddress,null);
  }

  public String getCustCertAddress(){
       return DataType.getAsString(this.get(S_CustCertAddress));
  
  }
  public String getCustCertAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustCertAddress));
      }

  public void initCustStatus(long value){
     this.initProperty(S_CustStatus,new Long(value));
  }
  public  void setCustStatus(long value){
     this.set(S_CustStatus,new Long(value));
  }
  public  void setCustStatusNull(){
     this.set(S_CustStatus,null);
  }

  public long getCustStatus(){
        return DataType.getAsLong(this.get(S_CustStatus));
  
  }
  public long getCustStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustStatus));
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

  public void initBaseCustId(long value){
     this.initProperty(S_BaseCustId,new Long(value));
  }
  public  void setBaseCustId(long value){
     this.set(S_BaseCustId,new Long(value));
  }
  public  void setBaseCustIdNull(){
     this.set(S_BaseCustId,null);
  }

  public long getBaseCustId(){
        return DataType.getAsLong(this.get(S_BaseCustId));
  
  }
  public long getBaseCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BaseCustId));
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

  public void initContMobile(String value){
     this.initProperty(S_ContMobile,value);
  }
  public  void setContMobile(String value){
     this.set(S_ContMobile,value);
  }
  public  void setContMobileNull(){
     this.set(S_ContMobile,null);
  }

  public String getContMobile(){
       return DataType.getAsString(this.get(S_ContMobile));
  
  }
  public String getContMobileInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContMobile));
      }

  public void initCustZipcode(String value){
     this.initProperty(S_CustZipcode,value);
  }
  public  void setCustZipcode(String value){
     this.set(S_CustZipcode,value);
  }
  public  void setCustZipcodeNull(){
     this.set(S_CustZipcode,null);
  }

  public String getCustZipcode(){
       return DataType.getAsString(this.get(S_CustZipcode));
  
  }
  public String getCustZipcodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustZipcode));
      }

  public void initRealNameFlag(long value){
     this.initProperty(S_RealNameFlag,new Long(value));
  }
  public  void setRealNameFlag(long value){
     this.set(S_RealNameFlag,new Long(value));
  }
  public  void setRealNameFlagNull(){
     this.set(S_RealNameFlag,null);
  }

  public long getRealNameFlag(){
        return DataType.getAsLong(this.get(S_RealNameFlag));
  
  }
  public long getRealNameFlagInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RealNameFlag));
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

  public void initContPhone(String value){
     this.initProperty(S_ContPhone,value);
  }
  public  void setContPhone(String value){
     this.set(S_ContPhone,value);
  }
  public  void setContPhoneNull(){
     this.set(S_ContPhone,null);
  }

  public String getContPhone(){
       return DataType.getAsString(this.get(S_ContPhone));
  
  }
  public String getContPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContPhone));
      }

  public void initLunar(long value){
     this.initProperty(S_Lunar,new Long(value));
  }
  public  void setLunar(long value){
     this.set(S_Lunar,new Long(value));
  }
  public  void setLunarNull(){
     this.set(S_Lunar,null);
  }

  public long getLunar(){
        return DataType.getAsLong(this.get(S_Lunar));
  
  }
  public long getLunarInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Lunar));
      }

  public void initContName(String value){
     this.initProperty(S_ContName,value);
  }
  public  void setContName(String value){
     this.set(S_ContName,value);
  }
  public  void setContNameNull(){
     this.set(S_ContName,null);
  }

  public String getContName(){
       return DataType.getAsString(this.get(S_ContName));
  
  }
  public String getContNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContName));
      }

  public void initRelCustId(long value){
     this.initProperty(S_RelCustId,new Long(value));
  }
  public  void setRelCustId(long value){
     this.set(S_RelCustId,new Long(value));
  }
  public  void setRelCustIdNull(){
     this.set(S_RelCustId,null);
  }

  public long getRelCustId(){
        return DataType.getAsLong(this.get(S_RelCustId));
  
  }
  public long getRelCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelCustId));
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

  public void initRelCustType(long value){
     this.initProperty(S_RelCustType,new Long(value));
  }
  public  void setRelCustType(long value){
     this.set(S_RelCustType,new Long(value));
  }
  public  void setRelCustTypeNull(){
     this.set(S_RelCustType,null);
  }

  public long getRelCustType(){
        return DataType.getAsLong(this.get(S_RelCustType));
  
  }
  public long getRelCustTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelCustType));
      }

  public void initContEffectiveDate(Timestamp value){
     this.initProperty(S_ContEffectiveDate,value);
  }
  public  void setContEffectiveDate(Timestamp value){
     this.set(S_ContEffectiveDate,value);
  }
  public  void setContEffectiveDateNull(){
     this.set(S_ContEffectiveDate,null);
  }

  public Timestamp getContEffectiveDate(){
        return DataType.getAsDateTime(this.get(S_ContEffectiveDate));
  
  }
  public Timestamp getContEffectiveDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ContEffectiveDate));
      }

  public void initCustCertCode(String value){
     this.initProperty(S_CustCertCode,value);
  }
  public  void setCustCertCode(String value){
     this.set(S_CustCertCode,value);
  }
  public  void setCustCertCodeNull(){
     this.set(S_CustCertCode,null);
  }

  public String getCustCertCode(){
       return DataType.getAsString(this.get(S_CustCertCode));
  
  }
  public String getCustCertCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustCertCode));
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

  public void initAllowAgent(long value){
     this.initProperty(S_AllowAgent,new Long(value));
  }
  public  void setAllowAgent(long value){
     this.set(S_AllowAgent,new Long(value));
  }
  public  void setAllowAgentNull(){
     this.set(S_AllowAgent,null);
  }

  public long getAllowAgent(){
        return DataType.getAsLong(this.get(S_AllowAgent));
  
  }
  public long getAllowAgentInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AllowAgent));
      }

  public void initVipNo(String value){
     this.initProperty(S_VipNo,value);
  }
  public  void setVipNo(String value){
     this.set(S_VipNo,value);
  }
  public  void setVipNoNull(){
     this.set(S_VipNo,null);
  }

  public String getVipNo(){
       return DataType.getAsString(this.get(S_VipNo));
  
  }
  public String getVipNoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_VipNo));
      }

  public void initAdminFamilyId(long value){
     this.initProperty(S_AdminFamilyId,new Long(value));
  }
  public  void setAdminFamilyId(long value){
     this.set(S_AdminFamilyId,new Long(value));
  }
  public  void setAdminFamilyIdNull(){
     this.set(S_AdminFamilyId,null);
  }

  public long getAdminFamilyId(){
        return DataType.getAsLong(this.get(S_AdminFamilyId));
  
  }
  public long getAdminFamilyIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AdminFamilyId));
      }

  public void initContEmail(String value){
     this.initProperty(S_ContEmail,value);
  }
  public  void setContEmail(String value){
     this.set(S_ContEmail,value);
  }
  public  void setContEmailNull(){
     this.set(S_ContEmail,null);
  }

  public String getContEmail(){
       return DataType.getAsString(this.get(S_ContEmail));
  
  }
  public String getContEmailInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContEmail));
      }

  public void initContExpireDate(Timestamp value){
     this.initProperty(S_ContExpireDate,value);
  }
  public  void setContExpireDate(Timestamp value){
     this.set(S_ContExpireDate,value);
  }
  public  void setContExpireDateNull(){
     this.set(S_ContExpireDate,null);
  }

  public Timestamp getContExpireDate(){
        return DataType.getAsDateTime(this.get(S_ContExpireDate));
  
  }
  public Timestamp getContExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ContExpireDate));
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

  public void initContAddress(String value){
     this.initProperty(S_ContAddress,value);
  }
  public  void setContAddress(String value){
     this.set(S_ContAddress,value);
  }
  public  void setContAddressNull(){
     this.set(S_ContAddress,null);
  }

  public String getContAddress(){
       return DataType.getAsString(this.get(S_ContAddress));
  
  }
  public String getContAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContAddress));
      }

  public void initContType(long value){
     this.initProperty(S_ContType,new Long(value));
  }
  public  void setContType(long value){
     this.set(S_ContType,new Long(value));
  }
  public  void setContTypeNull(){
     this.set(S_ContType,null);
  }

  public long getContType(){
        return DataType.getAsLong(this.get(S_ContType));
  
  }
  public long getContTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ContType));
      }

  public void initOtherContMedium(String value){
     this.initProperty(S_OtherContMedium,value);
  }
  public  void setOtherContMedium(String value){
     this.set(S_OtherContMedium,value);
  }
  public  void setOtherContMediumNull(){
     this.set(S_OtherContMedium,null);
  }

  public String getOtherContMedium(){
       return DataType.getAsString(this.get(S_OtherContMedium));
  
  }
  public String getOtherContMediumInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OtherContMedium));
      }

  public void initContZipcode(String value){
     this.initProperty(S_ContZipcode,value);
  }
  public  void setContZipcode(String value){
     this.set(S_ContZipcode,value);
  }
  public  void setContZipcodeNull(){
     this.set(S_ContZipcode,null);
  }

  public String getContZipcode(){
       return DataType.getAsString(this.get(S_ContZipcode));
  
  }
  public String getContZipcodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContZipcode));
      }

  public void initContGender(long value){
     this.initProperty(S_ContGender,new Long(value));
  }
  public  void setContGender(long value){
     this.set(S_ContGender,new Long(value));
  }
  public  void setContGenderNull(){
     this.set(S_ContGender,null);
  }

  public long getContGender(){
        return DataType.getAsLong(this.get(S_ContGender));
  
  }
  public long getContGenderInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ContGender));
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

  public void initCustCertType(long value){
     this.initProperty(S_CustCertType,new Long(value));
  }
  public  void setCustCertType(long value){
     this.set(S_CustCertType,new Long(value));
  }
  public  void setCustCertTypeNull(){
     this.set(S_CustCertType,null);
  }

  public long getCustCertType(){
        return DataType.getAsLong(this.get(S_CustCertType));
  
  }
  public long getCustCertTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustCertType));
      }

  public void initContFax(String value){
     this.initProperty(S_ContFax,value);
  }
  public  void setContFax(String value){
     this.set(S_ContFax,value);
  }
  public  void setContFaxNull(){
     this.set(S_ContFax,null);
  }

  public String getContFax(){
       return DataType.getAsString(this.get(S_ContFax));
  
  }
  public String getContFaxInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContFax));
      }

  public void initEntryChnl(long value){
     this.initProperty(S_EntryChnl,new Long(value));
  }
  public  void setEntryChnl(long value){
     this.set(S_EntryChnl,new Long(value));
  }
  public  void setEntryChnlNull(){
     this.set(S_EntryChnl,null);
  }

  public long getEntryChnl(){
        return DataType.getAsLong(this.get(S_EntryChnl));
  
  }
  public long getEntryChnlInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_EntryChnl));
      }

  public void initCustAddress(String value){
     this.initProperty(S_CustAddress,value);
  }
  public  void setCustAddress(String value){
     this.set(S_CustAddress,value);
  }
  public  void setCustAddressNull(){
     this.set(S_CustAddress,null);
  }

  public String getCustAddress(){
       return DataType.getAsString(this.get(S_CustAddress));
  
  }
  public String getCustAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustAddress));
      }

  public void initCountyId(String value){
     this.initProperty(S_CountyId,value);
  }
  public  void setCountyId(String value){
     this.set(S_CountyId,value);
  }
  public  void setCountyIdNull(){
     this.set(S_CountyId,null);
  }

  public String getCountyId(){
       return DataType.getAsString(this.get(S_CountyId));
  
  }
  public String getCountyIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CountyId));
      }

  public void initIndivCustId(long value){
     this.initProperty(S_IndivCustId,new Long(value));
  }
  public  void setIndivCustId(long value){
     this.set(S_IndivCustId,new Long(value));
  }
  public  void setIndivCustIdNull(){
     this.set(S_IndivCustId,null);
  }

  public long getIndivCustId(){
        return DataType.getAsLong(this.get(S_IndivCustId));
  
  }
  public long getIndivCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IndivCustId));
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

  public void initPriorContMetohd(long value){
     this.initProperty(S_PriorContMetohd,new Long(value));
  }
  public  void setPriorContMetohd(long value){
     this.set(S_PriorContMetohd,new Long(value));
  }
  public  void setPriorContMetohdNull(){
     this.set(S_PriorContMetohd,null);
  }

  public long getPriorContMetohd(){
        return DataType.getAsLong(this.get(S_PriorContMetohd));
  
  }
  public long getPriorContMetohdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PriorContMetohd));
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

  public void initContractNo(String value){
     this.initProperty(S_ContractNo,value);
  }
  public  void setContractNo(String value){
     this.set(S_ContractNo,value);
  }
  public  void setContractNoNull(){
     this.set(S_ContractNo,null);
  }

  public String getContractNo(){
       return DataType.getAsString(this.get(S_ContractNo));
  
  }
  public String getContractNoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContractNo));
      }


 
 }

