package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCmGsStudInfoBean extends DataContainer implements DataContainerInterface,IBOCmGsStudInfoValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmGsStudInfo";



  public final static  String S_Degree = "DEGREE";
  public final static  String S_ClassName = "CLASS_NAME";
  public final static  String S_State = "STATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_AuditSts = "AUDIT_STS";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_IdCode = "ID_CODE";
  public final static  String S_Year = "YEAR";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_IdentifyMethod = "IDENTIFY_METHOD";
  public final static  String S_StudId = "STUD_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_Academy = "ACADEMY";
  public final static  String S_Brand = "BRAND";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_AuditId = "AUDIT_ID";
  public final static  String S_AuditNote = "AUDIT_NOTE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_SchoolId = "SCHOOL_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_PhoneId = "PHONE_ID";
  public final static  String S_Gender = "GENDER";
  public final static  String S_HomeAddress = "HOME_ADDRESS";
  public final static  String S_Name = "NAME";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmGsStudInfoBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initDegree(int value){
     this.initProperty(S_Degree,new Integer(value));
  }
  public  void setDegree(int value){
     this.set(S_Degree,new Integer(value));
  }
  public  void setDegreeNull(){
     this.set(S_Degree,null);
  }

  public int getDegree(){
        return DataType.getAsInt(this.get(S_Degree));
  
  }
  public int getDegreeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Degree));
      }

  public void initClassName(String value){
     this.initProperty(S_ClassName,value);
  }
  public  void setClassName(String value){
     this.set(S_ClassName,value);
  }
  public  void setClassNameNull(){
     this.set(S_ClassName,null);
  }

  public String getClassName(){
       return DataType.getAsString(this.get(S_ClassName));
  
  }
  public String getClassNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ClassName));
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

  public void initAuditSts(int value){
     this.initProperty(S_AuditSts,new Integer(value));
  }
  public  void setAuditSts(int value){
     this.set(S_AuditSts,new Integer(value));
  }
  public  void setAuditStsNull(){
     this.set(S_AuditSts,null);
  }

  public int getAuditSts(){
        return DataType.getAsInt(this.get(S_AuditSts));
  
  }
  public int getAuditStsInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_AuditSts));
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

  public void initIdCode(String value){
     this.initProperty(S_IdCode,value);
  }
  public  void setIdCode(String value){
     this.set(S_IdCode,value);
  }
  public  void setIdCodeNull(){
     this.set(S_IdCode,null);
  }

  public String getIdCode(){
       return DataType.getAsString(this.get(S_IdCode));
  
  }
  public String getIdCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IdCode));
      }

  public void initYear(String value){
     this.initProperty(S_Year,value);
  }
  public  void setYear(String value){
     this.set(S_Year,value);
  }
  public  void setYearNull(){
     this.set(S_Year,null);
  }

  public String getYear(){
       return DataType.getAsString(this.get(S_Year));
  
  }
  public String getYearInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Year));
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

  public void initIdentifyMethod(int value){
     this.initProperty(S_IdentifyMethod,new Integer(value));
  }
  public  void setIdentifyMethod(int value){
     this.set(S_IdentifyMethod,new Integer(value));
  }
  public  void setIdentifyMethodNull(){
     this.set(S_IdentifyMethod,null);
  }

  public int getIdentifyMethod(){
        return DataType.getAsInt(this.get(S_IdentifyMethod));
  
  }
  public int getIdentifyMethodInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IdentifyMethod));
      }

  public void initStudId(long value){
     this.initProperty(S_StudId,new Long(value));
  }
  public  void setStudId(long value){
     this.set(S_StudId,new Long(value));
  }
  public  void setStudIdNull(){
     this.set(S_StudId,null);
  }

  public long getStudId(){
        return DataType.getAsLong(this.get(S_StudId));
  
  }
  public long getStudIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_StudId));
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

  public void initAcademy(String value){
     this.initProperty(S_Academy,value);
  }
  public  void setAcademy(String value){
     this.set(S_Academy,value);
  }
  public  void setAcademyNull(){
     this.set(S_Academy,null);
  }

  public String getAcademy(){
       return DataType.getAsString(this.get(S_Academy));
  
  }
  public String getAcademyInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Academy));
      }

  public void initBrand(int value){
     this.initProperty(S_Brand,new Integer(value));
  }
  public  void setBrand(int value){
     this.set(S_Brand,new Integer(value));
  }
  public  void setBrandNull(){
     this.set(S_Brand,null);
  }

  public int getBrand(){
        return DataType.getAsInt(this.get(S_Brand));
  
  }
  public int getBrandInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Brand));
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

  public void initAuditId(long value){
     this.initProperty(S_AuditId,new Long(value));
  }
  public  void setAuditId(long value){
     this.set(S_AuditId,new Long(value));
  }
  public  void setAuditIdNull(){
     this.set(S_AuditId,null);
  }

  public long getAuditId(){
        return DataType.getAsLong(this.get(S_AuditId));
  
  }
  public long getAuditIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AuditId));
      }

  public void initAuditNote(String value){
     this.initProperty(S_AuditNote,value);
  }
  public  void setAuditNote(String value){
     this.set(S_AuditNote,value);
  }
  public  void setAuditNoteNull(){
     this.set(S_AuditNote,null);
  }

  public String getAuditNote(){
       return DataType.getAsString(this.get(S_AuditNote));
  
  }
  public String getAuditNoteInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AuditNote));
      }

  public void initOperType(int value){
     this.initProperty(S_OperType,new Integer(value));
  }
  public  void setOperType(int value){
     this.set(S_OperType,new Integer(value));
  }
  public  void setOperTypeNull(){
     this.set(S_OperType,null);
  }

  public int getOperType(){
        return DataType.getAsInt(this.get(S_OperType));
  
  }
  public int getOperTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_OperType));
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

  public void initSchoolId(long value){
     this.initProperty(S_SchoolId,new Long(value));
  }
  public  void setSchoolId(long value){
     this.set(S_SchoolId,new Long(value));
  }
  public  void setSchoolIdNull(){
     this.set(S_SchoolId,null);
  }

  public long getSchoolId(){
        return DataType.getAsLong(this.get(S_SchoolId));
  
  }
  public long getSchoolIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SchoolId));
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

  public void initPhoneId(String value){
     this.initProperty(S_PhoneId,value);
  }
  public  void setPhoneId(String value){
     this.set(S_PhoneId,value);
  }
  public  void setPhoneIdNull(){
     this.set(S_PhoneId,null);
  }

  public String getPhoneId(){
       return DataType.getAsString(this.get(S_PhoneId));
  
  }
  public String getPhoneIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PhoneId));
      }

  public void initGender(int value){
     this.initProperty(S_Gender,new Integer(value));
  }
  public  void setGender(int value){
     this.set(S_Gender,new Integer(value));
  }
  public  void setGenderNull(){
     this.set(S_Gender,null);
  }

  public int getGender(){
        return DataType.getAsInt(this.get(S_Gender));
  
  }
  public int getGenderInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Gender));
      }

  public void initHomeAddress(String value){
     this.initProperty(S_HomeAddress,value);
  }
  public  void setHomeAddress(String value){
     this.set(S_HomeAddress,value);
  }
  public  void setHomeAddressNull(){
     this.set(S_HomeAddress,null);
  }

  public String getHomeAddress(){
       return DataType.getAsString(this.get(S_HomeAddress));
  
  }
  public String getHomeAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_HomeAddress));
      }

  public void initName(String value){
     this.initProperty(S_Name,value);
  }
  public  void setName(String value){
     this.set(S_Name,value);
  }
  public  void setNameNull(){
     this.set(S_Name,null);
  }

  public String getName(){
       return DataType.getAsString(this.get(S_Name));
  
  }
  public String getNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Name));
      }


 
 }

