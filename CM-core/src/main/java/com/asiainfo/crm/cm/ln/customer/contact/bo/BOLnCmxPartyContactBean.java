package com.asiainfo.crm.cm.ln.customer.contact.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.ln.customer.contact.ivalues.*;

public class BOLnCmxPartyContactBean extends DataContainer implements DataContainerInterface,IBOLnCmxPartyContactValue{

  private static String  m_boName = "com.asiainfo.crm.cm.ln.customer.contact.bo.BOLnCmxPartyContact";



  public final static  String S_IdFileName = "ID_FILE_NAME";
  public final static  String S_Belief = "BELIEF";
  public final static  String S_HasPhoto = "HAS_PHOTO";
  public final static  String S_LunarBirthday = "LUNAR_BIRTHDAY";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_ProtoValidDate = "PROTO_VALID_DATE";
  public final static  String S_IdExpireDate = "ID_EXPIRE_DATE";
  public final static  String S_CharacterDesc = "CHARACTER_DESC";
  public final static  String S_PriRelate = "PRI_RELATE";
  public final static  String S_IncomeLevel = "INCOME_LEVEL";
  public final static  String S_Phoneld = "PHONELD";
  public final static  String S_IsGroupUser = "IS_GROUP_USER";
  public final static  String S_PolitiFeature = "POLITI_FEATURE";
  public final static  String S_PhoneType = "PHONE_TYPE";
  public final static  String S_Vocation = "VOCATION";
  public final static  String S_RealContactPhone = "REAL_CONTACT_PHONE";
  public final static  String S_Position = "POSITION";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_Occupation = "OCCUPATION";
  public final static  String S_OtherBillId = "OTHER_BILL_ID";
  public final static  String S_ImportFamily = "IMPORT_FAMILY";
  public final static  String S_IdValidDate = "ID_VALID_DATE";
  public final static  String S_FetionNo = "FETION_NO";
  public final static  String S_RealPost = "REAL_POST";
  public final static  String S_RealContactAdd = "REAL_CONTACT_ADD";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_RealOfficePhone = "REAL_OFFICE_PHONE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_ProtoExpireDate = "PROTO_EXPIRE_DATE";
  public final static  String S_EnterpriseNature = "ENTERPRISE_NATURE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_OtherHobby = "OTHER_HOBBY";
  public final static  String S_SecurityId = "SECURITY_ID";
  public final static  String S_GroupType = "GROUP_TYPE";
  public final static  String S_HomeTel = "HOME_TEL";
  public final static  String S_RealZipcodeAdd = "REAL_ZIPCODE_ADD";
  public final static  String S_RealTheOffice = "REAL_THE_OFFICE";
  public final static  String S_CarNo = "CAR_NO";
  public final static  String S_ChildSts = "CHILD_STS";
  public final static  String S_Outflag = "OUTFLAG";
  public final static  String S_HobbyId = "HOBBY_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_RealJobCompany = "REAL_JOB_COMPANY";
  public final static  String S_QqNo = "QQ_NO";
  public final static  String S_MemberType = "MEMBER_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_RealGender = "REAL_GENDER";
  public final static  String S_AnnualIncome = "ANNUAL_INCOME";
  public final static  String S_RealEmail = "REAL_EMAIL";
  public final static  String S_RealCustName = "REAL_CUST_NAME";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_DomainName = "DOMAIN_NAME";
  public final static  String S_ProtoFileName = "PROTO_FILE_NAME";
  public final static  String S_KeyPersonType = "KEY_PERSON_TYPE";
  public final static  String S_IsWhiteName = "IS_WHITE_NAME";
  public final static  String S_LinkPhone = "LINK_PHONE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_WorkAddress = "WORK_ADDRESS";
  public final static  String S_SubVocation = "SUB_VOCATION";
  public final static  String S_ProvideId = "PROVIDE_ID";
  public final static  String S_IdCardNo = "ID_CARD_NO";
  public final static  String S_MemberDesc = "MEMBER_DESC";
  public final static  String S_MemberJob = "MEMBER_JOB";
  public final static  String S_AuthCode = "AUTH_CODE";
  public final static  String S_Workdept = "WORKDEPT";
  public final static  String S_Brand = "BRAND";
  public final static  String S_MainBirthType = "MAIN_BIRTH_TYPE";
  public final static  String S_IsFullData = "IS_FULL_DATA";
  public final static  String S_IsSendSms = "IS_SEND_SMS";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOLnCmxPartyContactBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initIdFileName(String value){
     this.initProperty(S_IdFileName,value);
  }
  public  void setIdFileName(String value){
     this.set(S_IdFileName,value);
  }
  public  void setIdFileNameNull(){
     this.set(S_IdFileName,null);
  }

  public String getIdFileName(){
       return DataType.getAsString(this.get(S_IdFileName));
  
  }
  public String getIdFileNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IdFileName));
      }

  public void initBelief(int value){
     this.initProperty(S_Belief,new Integer(value));
  }
  public  void setBelief(int value){
     this.set(S_Belief,new Integer(value));
  }
  public  void setBeliefNull(){
     this.set(S_Belief,null);
  }

  public int getBelief(){
        return DataType.getAsInt(this.get(S_Belief));
  
  }
  public int getBeliefInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Belief));
      }

  public void initHasPhoto(int value){
     this.initProperty(S_HasPhoto,new Integer(value));
  }
  public  void setHasPhoto(int value){
     this.set(S_HasPhoto,new Integer(value));
  }
  public  void setHasPhotoNull(){
     this.set(S_HasPhoto,null);
  }

  public int getHasPhoto(){
        return DataType.getAsInt(this.get(S_HasPhoto));
  
  }
  public int getHasPhotoInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_HasPhoto));
      }

  public void initLunarBirthday(Timestamp value){
     this.initProperty(S_LunarBirthday,value);
  }
  public  void setLunarBirthday(Timestamp value){
     this.set(S_LunarBirthday,value);
  }
  public  void setLunarBirthdayNull(){
     this.set(S_LunarBirthday,null);
  }

  public Timestamp getLunarBirthday(){
        return DataType.getAsDateTime(this.get(S_LunarBirthday));
  
  }
  public Timestamp getLunarBirthdayInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_LunarBirthday));
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

  public void initProtoValidDate(Timestamp value){
     this.initProperty(S_ProtoValidDate,value);
  }
  public  void setProtoValidDate(Timestamp value){
     this.set(S_ProtoValidDate,value);
  }
  public  void setProtoValidDateNull(){
     this.set(S_ProtoValidDate,null);
  }

  public Timestamp getProtoValidDate(){
        return DataType.getAsDateTime(this.get(S_ProtoValidDate));
  
  }
  public Timestamp getProtoValidDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ProtoValidDate));
      }

  public void initIdExpireDate(Timestamp value){
     this.initProperty(S_IdExpireDate,value);
  }
  public  void setIdExpireDate(Timestamp value){
     this.set(S_IdExpireDate,value);
  }
  public  void setIdExpireDateNull(){
     this.set(S_IdExpireDate,null);
  }

  public Timestamp getIdExpireDate(){
        return DataType.getAsDateTime(this.get(S_IdExpireDate));
  
  }
  public Timestamp getIdExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_IdExpireDate));
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

  public void initPriRelate(String value){
     this.initProperty(S_PriRelate,value);
  }
  public  void setPriRelate(String value){
     this.set(S_PriRelate,value);
  }
  public  void setPriRelateNull(){
     this.set(S_PriRelate,null);
  }

  public String getPriRelate(){
       return DataType.getAsString(this.get(S_PriRelate));
  
  }
  public String getPriRelateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PriRelate));
      }

  public void initIncomeLevel(int value){
     this.initProperty(S_IncomeLevel,new Integer(value));
  }
  public  void setIncomeLevel(int value){
     this.set(S_IncomeLevel,new Integer(value));
  }
  public  void setIncomeLevelNull(){
     this.set(S_IncomeLevel,null);
  }

  public int getIncomeLevel(){
        return DataType.getAsInt(this.get(S_IncomeLevel));
  
  }
  public int getIncomeLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IncomeLevel));
      }

  public void initPhoneld(String value){
     this.initProperty(S_Phoneld,value);
  }
  public  void setPhoneld(String value){
     this.set(S_Phoneld,value);
  }
  public  void setPhoneldNull(){
     this.set(S_Phoneld,null);
  }

  public String getPhoneld(){
       return DataType.getAsString(this.get(S_Phoneld));
  
  }
  public String getPhoneldInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Phoneld));
      }

  public void initIsGroupUser(long value){
     this.initProperty(S_IsGroupUser,new Long(value));
  }
  public  void setIsGroupUser(long value){
     this.set(S_IsGroupUser,new Long(value));
  }
  public  void setIsGroupUserNull(){
     this.set(S_IsGroupUser,null);
  }

  public long getIsGroupUser(){
        return DataType.getAsLong(this.get(S_IsGroupUser));
  
  }
  public long getIsGroupUserInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsGroupUser));
      }

  public void initPolitiFeature(int value){
     this.initProperty(S_PolitiFeature,new Integer(value));
  }
  public  void setPolitiFeature(int value){
     this.set(S_PolitiFeature,new Integer(value));
  }
  public  void setPolitiFeatureNull(){
     this.set(S_PolitiFeature,null);
  }

  public int getPolitiFeature(){
        return DataType.getAsInt(this.get(S_PolitiFeature));
  
  }
  public int getPolitiFeatureInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PolitiFeature));
      }

  public void initPhoneType(String value){
     this.initProperty(S_PhoneType,value);
  }
  public  void setPhoneType(String value){
     this.set(S_PhoneType,value);
  }
  public  void setPhoneTypeNull(){
     this.set(S_PhoneType,null);
  }

  public String getPhoneType(){
       return DataType.getAsString(this.get(S_PhoneType));
  
  }
  public String getPhoneTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PhoneType));
      }

  public void initVocation(int value){
     this.initProperty(S_Vocation,new Integer(value));
  }
  public  void setVocation(int value){
     this.set(S_Vocation,new Integer(value));
  }
  public  void setVocationNull(){
     this.set(S_Vocation,null);
  }

  public int getVocation(){
        return DataType.getAsInt(this.get(S_Vocation));
  
  }
  public int getVocationInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Vocation));
      }

  public void initRealContactPhone(String value){
     this.initProperty(S_RealContactPhone,value);
  }
  public  void setRealContactPhone(String value){
     this.set(S_RealContactPhone,value);
  }
  public  void setRealContactPhoneNull(){
     this.set(S_RealContactPhone,null);
  }

  public String getRealContactPhone(){
       return DataType.getAsString(this.get(S_RealContactPhone));
  
  }
  public String getRealContactPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RealContactPhone));
      }

  public void initPosition(int value){
     this.initProperty(S_Position,new Integer(value));
  }
  public  void setPosition(int value){
     this.set(S_Position,new Integer(value));
  }
  public  void setPositionNull(){
     this.set(S_Position,null);
  }

  public int getPosition(){
        return DataType.getAsInt(this.get(S_Position));
  
  }
  public int getPositionInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Position));
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

  public void initOccupation(int value){
     this.initProperty(S_Occupation,new Integer(value));
  }
  public  void setOccupation(int value){
     this.set(S_Occupation,new Integer(value));
  }
  public  void setOccupationNull(){
     this.set(S_Occupation,null);
  }

  public int getOccupation(){
        return DataType.getAsInt(this.get(S_Occupation));
  
  }
  public int getOccupationInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Occupation));
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

  public void initImportFamily(String value){
     this.initProperty(S_ImportFamily,value);
  }
  public  void setImportFamily(String value){
     this.set(S_ImportFamily,value);
  }
  public  void setImportFamilyNull(){
     this.set(S_ImportFamily,null);
  }

  public String getImportFamily(){
       return DataType.getAsString(this.get(S_ImportFamily));
  
  }
  public String getImportFamilyInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ImportFamily));
      }

  public void initIdValidDate(Timestamp value){
     this.initProperty(S_IdValidDate,value);
  }
  public  void setIdValidDate(Timestamp value){
     this.set(S_IdValidDate,value);
  }
  public  void setIdValidDateNull(){
     this.set(S_IdValidDate,null);
  }

  public Timestamp getIdValidDate(){
        return DataType.getAsDateTime(this.get(S_IdValidDate));
  
  }
  public Timestamp getIdValidDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_IdValidDate));
      }

  public void initFetionNo(String value){
     this.initProperty(S_FetionNo,value);
  }
  public  void setFetionNo(String value){
     this.set(S_FetionNo,value);
  }
  public  void setFetionNoNull(){
     this.set(S_FetionNo,null);
  }

  public String getFetionNo(){
       return DataType.getAsString(this.get(S_FetionNo));
  
  }
  public String getFetionNoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FetionNo));
      }

  public void initRealPost(int value){
     this.initProperty(S_RealPost,new Integer(value));
  }
  public  void setRealPost(int value){
     this.set(S_RealPost,new Integer(value));
  }
  public  void setRealPostNull(){
     this.set(S_RealPost,null);
  }

  public int getRealPost(){
        return DataType.getAsInt(this.get(S_RealPost));
  
  }
  public int getRealPostInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_RealPost));
      }

  public void initRealContactAdd(String value){
     this.initProperty(S_RealContactAdd,value);
  }
  public  void setRealContactAdd(String value){
     this.set(S_RealContactAdd,value);
  }
  public  void setRealContactAddNull(){
     this.set(S_RealContactAdd,null);
  }

  public String getRealContactAdd(){
       return DataType.getAsString(this.get(S_RealContactAdd));
  
  }
  public String getRealContactAddInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RealContactAdd));
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

  public void initRealOfficePhone(String value){
     this.initProperty(S_RealOfficePhone,value);
  }
  public  void setRealOfficePhone(String value){
     this.set(S_RealOfficePhone,value);
  }
  public  void setRealOfficePhoneNull(){
     this.set(S_RealOfficePhone,null);
  }

  public String getRealOfficePhone(){
       return DataType.getAsString(this.get(S_RealOfficePhone));
  
  }
  public String getRealOfficePhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RealOfficePhone));
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

  public void initProtoExpireDate(Timestamp value){
     this.initProperty(S_ProtoExpireDate,value);
  }
  public  void setProtoExpireDate(Timestamp value){
     this.set(S_ProtoExpireDate,value);
  }
  public  void setProtoExpireDateNull(){
     this.set(S_ProtoExpireDate,null);
  }

  public Timestamp getProtoExpireDate(){
        return DataType.getAsDateTime(this.get(S_ProtoExpireDate));
  
  }
  public Timestamp getProtoExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ProtoExpireDate));
      }

  public void initEnterpriseNature(String value){
     this.initProperty(S_EnterpriseNature,value);
  }
  public  void setEnterpriseNature(String value){
     this.set(S_EnterpriseNature,value);
  }
  public  void setEnterpriseNatureNull(){
     this.set(S_EnterpriseNature,null);
  }

  public String getEnterpriseNature(){
       return DataType.getAsString(this.get(S_EnterpriseNature));
  
  }
  public String getEnterpriseNatureInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EnterpriseNature));
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

  public void initPartyId(long value){
     this.initProperty(S_PartyId,new Long(value));
  }
  public  void setPartyId(long value){
     this.set(S_PartyId,new Long(value));
  }
  public  void setPartyIdNull(){
     this.set(S_PartyId,null);
  }

  public long getPartyId(){
        return DataType.getAsLong(this.get(S_PartyId));
  
  }
  public long getPartyIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PartyId));
      }

  public void initOtherHobby(String value){
     this.initProperty(S_OtherHobby,value);
  }
  public  void setOtherHobby(String value){
     this.set(S_OtherHobby,value);
  }
  public  void setOtherHobbyNull(){
     this.set(S_OtherHobby,null);
  }

  public String getOtherHobby(){
       return DataType.getAsString(this.get(S_OtherHobby));
  
  }
  public String getOtherHobbyInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OtherHobby));
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

  public void initGroupType(int value){
     this.initProperty(S_GroupType,new Integer(value));
  }
  public  void setGroupType(int value){
     this.set(S_GroupType,new Integer(value));
  }
  public  void setGroupTypeNull(){
     this.set(S_GroupType,null);
  }

  public int getGroupType(){
        return DataType.getAsInt(this.get(S_GroupType));
  
  }
  public int getGroupTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_GroupType));
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

  public void initRealZipcodeAdd(String value){
     this.initProperty(S_RealZipcodeAdd,value);
  }
  public  void setRealZipcodeAdd(String value){
     this.set(S_RealZipcodeAdd,value);
  }
  public  void setRealZipcodeAddNull(){
     this.set(S_RealZipcodeAdd,null);
  }

  public String getRealZipcodeAdd(){
       return DataType.getAsString(this.get(S_RealZipcodeAdd));
  
  }
  public String getRealZipcodeAddInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RealZipcodeAdd));
      }

  public void initRealTheOffice(String value){
     this.initProperty(S_RealTheOffice,value);
  }
  public  void setRealTheOffice(String value){
     this.set(S_RealTheOffice,value);
  }
  public  void setRealTheOfficeNull(){
     this.set(S_RealTheOffice,null);
  }

  public String getRealTheOffice(){
       return DataType.getAsString(this.get(S_RealTheOffice));
  
  }
  public String getRealTheOfficeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RealTheOffice));
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

  public void initChildSts(int value){
     this.initProperty(S_ChildSts,new Integer(value));
  }
  public  void setChildSts(int value){
     this.set(S_ChildSts,new Integer(value));
  }
  public  void setChildStsNull(){
     this.set(S_ChildSts,null);
  }

  public int getChildSts(){
        return DataType.getAsInt(this.get(S_ChildSts));
  
  }
  public int getChildStsInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ChildSts));
      }

  public void initOutflag(int value){
     this.initProperty(S_Outflag,new Integer(value));
  }
  public  void setOutflag(int value){
     this.set(S_Outflag,new Integer(value));
  }
  public  void setOutflagNull(){
     this.set(S_Outflag,null);
  }

  public int getOutflag(){
        return DataType.getAsInt(this.get(S_Outflag));
  
  }
  public int getOutflagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Outflag));
      }

  public void initHobbyId(String value){
     this.initProperty(S_HobbyId,value);
  }
  public  void setHobbyId(String value){
     this.set(S_HobbyId,value);
  }
  public  void setHobbyIdNull(){
     this.set(S_HobbyId,null);
  }

  public String getHobbyId(){
       return DataType.getAsString(this.get(S_HobbyId));
  
  }
  public String getHobbyIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_HobbyId));
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

  public void initRealJobCompany(String value){
     this.initProperty(S_RealJobCompany,value);
  }
  public  void setRealJobCompany(String value){
     this.set(S_RealJobCompany,value);
  }
  public  void setRealJobCompanyNull(){
     this.set(S_RealJobCompany,null);
  }

  public String getRealJobCompany(){
       return DataType.getAsString(this.get(S_RealJobCompany));
  
  }
  public String getRealJobCompanyInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RealJobCompany));
      }

  public void initQqNo(String value){
     this.initProperty(S_QqNo,value);
  }
  public  void setQqNo(String value){
     this.set(S_QqNo,value);
  }
  public  void setQqNoNull(){
     this.set(S_QqNo,null);
  }

  public String getQqNo(){
       return DataType.getAsString(this.get(S_QqNo));
  
  }
  public String getQqNoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_QqNo));
      }

  public void initMemberType(int value){
     this.initProperty(S_MemberType,new Integer(value));
  }
  public  void setMemberType(int value){
     this.set(S_MemberType,new Integer(value));
  }
  public  void setMemberTypeNull(){
     this.set(S_MemberType,null);
  }

  public int getMemberType(){
        return DataType.getAsInt(this.get(S_MemberType));
  
  }
  public int getMemberTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MemberType));
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

  public void initRealGender(int value){
     this.initProperty(S_RealGender,new Integer(value));
  }
  public  void setRealGender(int value){
     this.set(S_RealGender,new Integer(value));
  }
  public  void setRealGenderNull(){
     this.set(S_RealGender,null);
  }

  public int getRealGender(){
        return DataType.getAsInt(this.get(S_RealGender));
  
  }
  public int getRealGenderInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_RealGender));
      }

  public void initAnnualIncome(String value){
     this.initProperty(S_AnnualIncome,value);
  }
  public  void setAnnualIncome(String value){
     this.set(S_AnnualIncome,value);
  }
  public  void setAnnualIncomeNull(){
     this.set(S_AnnualIncome,null);
  }

  public String getAnnualIncome(){
       return DataType.getAsString(this.get(S_AnnualIncome));
  
  }
  public String getAnnualIncomeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AnnualIncome));
      }

  public void initRealEmail(String value){
     this.initProperty(S_RealEmail,value);
  }
  public  void setRealEmail(String value){
     this.set(S_RealEmail,value);
  }
  public  void setRealEmailNull(){
     this.set(S_RealEmail,null);
  }

  public String getRealEmail(){
       return DataType.getAsString(this.get(S_RealEmail));
  
  }
  public String getRealEmailInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RealEmail));
      }

  public void initRealCustName(String value){
     this.initProperty(S_RealCustName,value);
  }
  public  void setRealCustName(String value){
     this.set(S_RealCustName,value);
  }
  public  void setRealCustNameNull(){
     this.set(S_RealCustName,null);
  }

  public String getRealCustName(){
       return DataType.getAsString(this.get(S_RealCustName));
  
  }
  public String getRealCustNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RealCustName));
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

  public void initDomainName(String value){
     this.initProperty(S_DomainName,value);
  }
  public  void setDomainName(String value){
     this.set(S_DomainName,value);
  }
  public  void setDomainNameNull(){
     this.set(S_DomainName,null);
  }

  public String getDomainName(){
       return DataType.getAsString(this.get(S_DomainName));
  
  }
  public String getDomainNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DomainName));
      }

  public void initProtoFileName(String value){
     this.initProperty(S_ProtoFileName,value);
  }
  public  void setProtoFileName(String value){
     this.set(S_ProtoFileName,value);
  }
  public  void setProtoFileNameNull(){
     this.set(S_ProtoFileName,null);
  }

  public String getProtoFileName(){
       return DataType.getAsString(this.get(S_ProtoFileName));
  
  }
  public String getProtoFileNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ProtoFileName));
      }

  public void initKeyPersonType(int value){
     this.initProperty(S_KeyPersonType,new Integer(value));
  }
  public  void setKeyPersonType(int value){
     this.set(S_KeyPersonType,new Integer(value));
  }
  public  void setKeyPersonTypeNull(){
     this.set(S_KeyPersonType,null);
  }

  public int getKeyPersonType(){
        return DataType.getAsInt(this.get(S_KeyPersonType));
  
  }
  public int getKeyPersonTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_KeyPersonType));
      }

  public void initIsWhiteName(int value){
     this.initProperty(S_IsWhiteName,new Integer(value));
  }
  public  void setIsWhiteName(int value){
     this.set(S_IsWhiteName,new Integer(value));
  }
  public  void setIsWhiteNameNull(){
     this.set(S_IsWhiteName,null);
  }

  public int getIsWhiteName(){
        return DataType.getAsInt(this.get(S_IsWhiteName));
  
  }
  public int getIsWhiteNameInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsWhiteName));
      }

  public void initLinkPhone(String value){
     this.initProperty(S_LinkPhone,value);
  }
  public  void setLinkPhone(String value){
     this.set(S_LinkPhone,value);
  }
  public  void setLinkPhoneNull(){
     this.set(S_LinkPhone,null);
  }

  public String getLinkPhone(){
       return DataType.getAsString(this.get(S_LinkPhone));
  
  }
  public String getLinkPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LinkPhone));
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

  public void initWorkAddress(String value){
     this.initProperty(S_WorkAddress,value);
  }
  public  void setWorkAddress(String value){
     this.set(S_WorkAddress,value);
  }
  public  void setWorkAddressNull(){
     this.set(S_WorkAddress,null);
  }

  public String getWorkAddress(){
       return DataType.getAsString(this.get(S_WorkAddress));
  
  }
  public String getWorkAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_WorkAddress));
      }

  public void initSubVocation(int value){
     this.initProperty(S_SubVocation,new Integer(value));
  }
  public  void setSubVocation(int value){
     this.set(S_SubVocation,new Integer(value));
  }
  public  void setSubVocationNull(){
     this.set(S_SubVocation,null);
  }

  public int getSubVocation(){
        return DataType.getAsInt(this.get(S_SubVocation));
  
  }
  public int getSubVocationInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_SubVocation));
      }

  public void initProvideId(int value){
     this.initProperty(S_ProvideId,new Integer(value));
  }
  public  void setProvideId(int value){
     this.set(S_ProvideId,new Integer(value));
  }
  public  void setProvideIdNull(){
     this.set(S_ProvideId,null);
  }

  public int getProvideId(){
        return DataType.getAsInt(this.get(S_ProvideId));
  
  }
  public int getProvideIdInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ProvideId));
      }

  public void initIdCardNo(String value){
     this.initProperty(S_IdCardNo,value);
  }
  public  void setIdCardNo(String value){
     this.set(S_IdCardNo,value);
  }
  public  void setIdCardNoNull(){
     this.set(S_IdCardNo,null);
  }

  public String getIdCardNo(){
       return DataType.getAsString(this.get(S_IdCardNo));
  
  }
  public String getIdCardNoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IdCardNo));
      }

  public void initMemberDesc(String value){
     this.initProperty(S_MemberDesc,value);
  }
  public  void setMemberDesc(String value){
     this.set(S_MemberDesc,value);
  }
  public  void setMemberDescNull(){
     this.set(S_MemberDesc,null);
  }

  public String getMemberDesc(){
       return DataType.getAsString(this.get(S_MemberDesc));
  
  }
  public String getMemberDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MemberDesc));
      }

  public void initMemberJob(String value){
     this.initProperty(S_MemberJob,value);
  }
  public  void setMemberJob(String value){
     this.set(S_MemberJob,value);
  }
  public  void setMemberJobNull(){
     this.set(S_MemberJob,null);
  }

  public String getMemberJob(){
       return DataType.getAsString(this.get(S_MemberJob));
  
  }
  public String getMemberJobInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MemberJob));
      }

  public void initAuthCode(String value){
     this.initProperty(S_AuthCode,value);
  }
  public  void setAuthCode(String value){
     this.set(S_AuthCode,value);
  }
  public  void setAuthCodeNull(){
     this.set(S_AuthCode,null);
  }

  public String getAuthCode(){
       return DataType.getAsString(this.get(S_AuthCode));
  
  }
  public String getAuthCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AuthCode));
      }

  public void initWorkdept(String value){
     this.initProperty(S_Workdept,value);
  }
  public  void setWorkdept(String value){
     this.set(S_Workdept,value);
  }
  public  void setWorkdeptNull(){
     this.set(S_Workdept,null);
  }

  public String getWorkdept(){
       return DataType.getAsString(this.get(S_Workdept));
  
  }
  public String getWorkdeptInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Workdept));
      }

  public void initBrand(String value){
     this.initProperty(S_Brand,value);
  }
  public  void setBrand(String value){
     this.set(S_Brand,value);
  }
  public  void setBrandNull(){
     this.set(S_Brand,null);
  }

  public String getBrand(){
       return DataType.getAsString(this.get(S_Brand));
  
  }
  public String getBrandInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Brand));
      }

  public void initMainBirthType(int value){
     this.initProperty(S_MainBirthType,new Integer(value));
  }
  public  void setMainBirthType(int value){
     this.set(S_MainBirthType,new Integer(value));
  }
  public  void setMainBirthTypeNull(){
     this.set(S_MainBirthType,null);
  }

  public int getMainBirthType(){
        return DataType.getAsInt(this.get(S_MainBirthType));
  
  }
  public int getMainBirthTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MainBirthType));
      }

  public void initIsFullData(int value){
     this.initProperty(S_IsFullData,new Integer(value));
  }
  public  void setIsFullData(int value){
     this.set(S_IsFullData,new Integer(value));
  }
  public  void setIsFullDataNull(){
     this.set(S_IsFullData,null);
  }

  public int getIsFullData(){
        return DataType.getAsInt(this.get(S_IsFullData));
  
  }
  public int getIsFullDataInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsFullData));
      }

  public void initIsSendSms(int value){
     this.initProperty(S_IsSendSms,new Integer(value));
  }
  public  void setIsSendSms(int value){
     this.set(S_IsSendSms,new Integer(value));
  }
  public  void setIsSendSmsNull(){
     this.set(S_IsSendSms,null);
  }

  public int getIsSendSms(){
        return DataType.getAsInt(this.get(S_IsSendSms));
  
  }
  public int getIsSendSmsInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsSendSms));
      }


 
 }

