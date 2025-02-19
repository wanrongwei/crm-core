package com.asiainfo.crm.cm.ln.club.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.ln.club.ivalues.*;

public class BOLnCmxClubMemberBean extends DataContainer implements DataContainerInterface,IBOLnCmxClubMemberValue{

  private static String  m_boName = "com.asiainfo.crm.cm.ln.club.bo.BOLnCmxClubMember";



  public final static  String S_CertCode = "CERT_CODE";
  public final static  String S_State = "STATE";
  public final static  String S_EnterpriseNature = "ENTERPRISE_NATURE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_HasPhoto = "HAS_PHOTO";
  public final static  String S_LunarBirthday = "LUNAR_BIRTHDAY";
  public final static  String S_HomeTel = "HOME_TEL";
  public final static  String S_MemberId = "MEMBER_ID";
  public final static  String S_RealZipcodeAdd = "REAL_ZIPCODE_ADD";
  public final static  String S_RealTheOffice = "REAL_THE_OFFICE";
  public final static  String S_ChildSts = "CHILD_STS";
  public final static  String S_HobbyId = "HOBBY_ID";
  public final static  String S_PolitiFeature = "POLITI_FEATURE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_RealJobCompany = "REAL_JOB_COMPANY";
  public final static  String S_QqNo = "QQ_NO";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_RealGender = "REAL_GENDER";
  public final static  String S_RealContactPhone = "REAL_CONTACT_PHONE";
  public final static  String S_AnnualIncome = "ANNUAL_INCOME";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_RealEmail = "REAL_EMAIL";
  public final static  String S_RealCustName = "REAL_CUST_NAME";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_KeyPersonType = "KEY_PERSON_TYPE";
  public final static  String S_IsWhiteName = "IS_WHITE_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_FetionNo = "FETION_NO";
  public final static  String S_CertType = "CERT_TYPE";
  public final static  String S_RealPost = "REAL_POST";
  public final static  String S_RealContactAdd = "REAL_CONTACT_ADD";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_IdCardNo = "ID_CARD_NO";
  public final static  String S_RealOfficePhone = "REAL_OFFICE_PHONE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_MainBirthType = "MAIN_BIRTH_TYPE";
  public final static  String S_IsFullData = "IS_FULL_DATA";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOLnCmxClubMemberBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initCertCode(String value){
     this.initProperty(S_CertCode,value);
  }
  public  void setCertCode(String value){
     this.set(S_CertCode,value);
  }
  public  void setCertCodeNull(){
     this.set(S_CertCode,null);
  }

  public String getCertCode(){
       return DataType.getAsString(this.get(S_CertCode));
  
  }
  public String getCertCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CertCode));
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

  public void initMemberId(long value){
     this.initProperty(S_MemberId,new Long(value));
  }
  public  void setMemberId(long value){
     this.set(S_MemberId,new Long(value));
  }
  public  void setMemberIdNull(){
     this.set(S_MemberId,null);
  }

  public long getMemberId(){
        return DataType.getAsLong(this.get(S_MemberId));
  
  }
  public long getMemberIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MemberId));
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

  public void initUserId(long value){
     this.initProperty(S_UserId,new Long(value));
  }
  public  void setUserId(long value){
     this.set(S_UserId,new Long(value));
  }
  public  void setUserIdNull(){
     this.set(S_UserId,null);
  }

  public long getUserId(){
        return DataType.getAsLong(this.get(S_UserId));
  
  }
  public long getUserIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_UserId));
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

  public void initCertType(int value){
     this.initProperty(S_CertType,new Integer(value));
  }
  public  void setCertType(int value){
     this.set(S_CertType,new Integer(value));
  }
  public  void setCertTypeNull(){
     this.set(S_CertType,null);
  }

  public int getCertType(){
        return DataType.getAsInt(this.get(S_CertType));
  
  }
  public int getCertTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CertType));
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


 
 }

