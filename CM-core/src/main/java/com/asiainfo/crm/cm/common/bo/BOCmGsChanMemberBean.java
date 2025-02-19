package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCmGsChanMemberBean extends DataContainer implements DataContainerInterface,IBOCmGsChanMemberValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmGsChanMember";



  public final static  String S_WorkArea = "WORK_AREA";
  public final static  String S_State = "STATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_Headship = "HEADSHIP";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_GraduateDate = "GRADUATE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_TeamName = "TEAM_NAME";
  public final static  String S_MemberId = "MEMBER_ID";
  public final static  String S_IsPrincipal = "IS_PRINCIPAL";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_AuditSts = "AUDIT_STS";
  public final static  String S_MemberName = "MEMBER_NAME";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_MemberPhone = "MEMBER_PHONE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_Salariat = "SALARIAT";
  public final static  String S_MemberGender = "MEMBER_GENDER";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_TeamId = "TEAM_ID";
  public final static  String S_AuditId = "AUDIT_ID";
  public final static  String S_WorkType = "WORK_TYPE";
  public final static  String S_AuditNote = "AUDIT_NOTE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_SchoolId = "SCHOOL_ID";
  public final static  String S_MemberDegree = "MEMBER_DEGREE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmGsChanMemberBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initWorkArea(String value){
     this.initProperty(S_WorkArea,value);
  }
  public  void setWorkArea(String value){
     this.set(S_WorkArea,value);
  }
  public  void setWorkAreaNull(){
     this.set(S_WorkArea,null);
  }

  public String getWorkArea(){
       return DataType.getAsString(this.get(S_WorkArea));
  
  }
  public String getWorkAreaInitialValue(){
        return DataType.getAsString(this.getOldObj(S_WorkArea));
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

  public void initHeadship(String value){
     this.initProperty(S_Headship,value);
  }
  public  void setHeadship(String value){
     this.set(S_Headship,value);
  }
  public  void setHeadshipNull(){
     this.set(S_Headship,null);
  }

  public String getHeadship(){
       return DataType.getAsString(this.get(S_Headship));
  
  }
  public String getHeadshipInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Headship));
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

  public void initGraduateDate(Timestamp value){
     this.initProperty(S_GraduateDate,value);
  }
  public  void setGraduateDate(Timestamp value){
     this.set(S_GraduateDate,value);
  }
  public  void setGraduateDateNull(){
     this.set(S_GraduateDate,null);
  }

  public Timestamp getGraduateDate(){
        return DataType.getAsDateTime(this.get(S_GraduateDate));
  
  }
  public Timestamp getGraduateDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_GraduateDate));
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

  public void initTeamName(String value){
     this.initProperty(S_TeamName,value);
  }
  public  void setTeamName(String value){
     this.set(S_TeamName,value);
  }
  public  void setTeamNameNull(){
     this.set(S_TeamName,null);
  }

  public String getTeamName(){
       return DataType.getAsString(this.get(S_TeamName));
  
  }
  public String getTeamNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TeamName));
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

  public void initIsPrincipal(int value){
     this.initProperty(S_IsPrincipal,new Integer(value));
  }
  public  void setIsPrincipal(int value){
     this.set(S_IsPrincipal,new Integer(value));
  }
  public  void setIsPrincipalNull(){
     this.set(S_IsPrincipal,null);
  }

  public int getIsPrincipal(){
        return DataType.getAsInt(this.get(S_IsPrincipal));
  
  }
  public int getIsPrincipalInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsPrincipal));
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

  public void initMemberName(String value){
     this.initProperty(S_MemberName,value);
  }
  public  void setMemberName(String value){
     this.set(S_MemberName,value);
  }
  public  void setMemberNameNull(){
     this.set(S_MemberName,null);
  }

  public String getMemberName(){
       return DataType.getAsString(this.get(S_MemberName));
  
  }
  public String getMemberNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MemberName));
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

  public void initMemberPhone(String value){
     this.initProperty(S_MemberPhone,value);
  }
  public  void setMemberPhone(String value){
     this.set(S_MemberPhone,value);
  }
  public  void setMemberPhoneNull(){
     this.set(S_MemberPhone,null);
  }

  public String getMemberPhone(){
       return DataType.getAsString(this.get(S_MemberPhone));
  
  }
  public String getMemberPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MemberPhone));
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

  public void initSalariat(String value){
     this.initProperty(S_Salariat,value);
  }
  public  void setSalariat(String value){
     this.set(S_Salariat,value);
  }
  public  void setSalariatNull(){
     this.set(S_Salariat,null);
  }

  public String getSalariat(){
       return DataType.getAsString(this.get(S_Salariat));
  
  }
  public String getSalariatInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Salariat));
      }

  public void initMemberGender(int value){
     this.initProperty(S_MemberGender,new Integer(value));
  }
  public  void setMemberGender(int value){
     this.set(S_MemberGender,new Integer(value));
  }
  public  void setMemberGenderNull(){
     this.set(S_MemberGender,null);
  }

  public int getMemberGender(){
        return DataType.getAsInt(this.get(S_MemberGender));
  
  }
  public int getMemberGenderInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MemberGender));
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

  public void initTeamId(long value){
     this.initProperty(S_TeamId,new Long(value));
  }
  public  void setTeamId(long value){
     this.set(S_TeamId,new Long(value));
  }
  public  void setTeamIdNull(){
     this.set(S_TeamId,null);
  }

  public long getTeamId(){
        return DataType.getAsLong(this.get(S_TeamId));
  
  }
  public long getTeamIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_TeamId));
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

  public void initWorkType(int value){
     this.initProperty(S_WorkType,new Integer(value));
  }
  public  void setWorkType(int value){
     this.set(S_WorkType,new Integer(value));
  }
  public  void setWorkTypeNull(){
     this.set(S_WorkType,null);
  }

  public int getWorkType(){
        return DataType.getAsInt(this.get(S_WorkType));
  
  }
  public int getWorkTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_WorkType));
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

  public void initMemberDegree(int value){
     this.initProperty(S_MemberDegree,new Integer(value));
  }
  public  void setMemberDegree(int value){
     this.set(S_MemberDegree,new Integer(value));
  }
  public  void setMemberDegreeNull(){
     this.set(S_MemberDegree,null);
  }

  public int getMemberDegree(){
        return DataType.getAsInt(this.get(S_MemberDegree));
  
  }
  public int getMemberDegreeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MemberDegree));
      }


 
 }

