package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCmGroupSchoolInfoBean extends DataContainer implements DataContainerInterface,IBOCmGroupSchoolInfoValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmGroupSchoolInfo";



  public final static  String S_CtWlan = "CT_WLAN";
  public final static  String S_CuWlan = "CU_WLAN";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_CtSum = "CT_SUM";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CmccWire = "CMCC_WIRE";
  public final static  String S_StudendSum = "STUDEND_SUM";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_AuditSts = "AUDIT_STS";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_SchoolProperty = "SCHOOL_PROPERTY";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_SchoolAddress = "SCHOOL_ADDRESS";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CmccWlan = "CMCC_WLAN";
  public final static  String S_SchoolWap = "SCHOOL_WAP";
  public final static  String S_CtWire = "CT_WIRE";
  public final static  String S_CuSum = "CU_SUM";
  public final static  String S_PschoolId = "PSCHOOL_ID";
  public final static  String S_MasterDept = "MASTER_DEPT";
  public final static  String S_SchoolName = "SCHOOL_NAME";
  public final static  String S_Sts = "STS";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_Longitude = "LONGITUDE";
  public final static  String S_RegionCode = "REGION_CODE";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_SchoolType = "SCHOOL_TYPE";
  public final static  String S_AuditId = "AUDIT_ID";
  public final static  String S_RecruitSum = "RECRUIT_SUM";
  public final static  String S_AuditNote = "AUDIT_NOTE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_Ykt = "YKT";
  public final static  String S_SchoolId = "SCHOOL_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CmccSum = "CMCC_SUM";
  public final static  String S_CuWire = "CU_WIRE";
  public final static  String S_TeacherSum = "TEACHER_SUM";
  public final static  String S_Latitude = "LATITUDE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmGroupSchoolInfoBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initCtWlan(int value){
     this.initProperty(S_CtWlan,new Integer(value));
  }
  public  void setCtWlan(int value){
     this.set(S_CtWlan,new Integer(value));
  }
  public  void setCtWlanNull(){
     this.set(S_CtWlan,null);
  }

  public int getCtWlan(){
        return DataType.getAsInt(this.get(S_CtWlan));
  
  }
  public int getCtWlanInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CtWlan));
      }

  public void initCuWlan(int value){
     this.initProperty(S_CuWlan,new Integer(value));
  }
  public  void setCuWlan(int value){
     this.set(S_CuWlan,new Integer(value));
  }
  public  void setCuWlanNull(){
     this.set(S_CuWlan,null);
  }

  public int getCuWlan(){
        return DataType.getAsInt(this.get(S_CuWlan));
  
  }
  public int getCuWlanInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CuWlan));
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

  public void initCtSum(long value){
     this.initProperty(S_CtSum,new Long(value));
  }
  public  void setCtSum(long value){
     this.set(S_CtSum,new Long(value));
  }
  public  void setCtSumNull(){
     this.set(S_CtSum,null);
  }

  public long getCtSum(){
        return DataType.getAsLong(this.get(S_CtSum));
  
  }
  public long getCtSumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CtSum));
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

  public void initCmccWire(int value){
     this.initProperty(S_CmccWire,new Integer(value));
  }
  public  void setCmccWire(int value){
     this.set(S_CmccWire,new Integer(value));
  }
  public  void setCmccWireNull(){
     this.set(S_CmccWire,null);
  }

  public int getCmccWire(){
        return DataType.getAsInt(this.get(S_CmccWire));
  
  }
  public int getCmccWireInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CmccWire));
      }

  public void initStudendSum(long value){
     this.initProperty(S_StudendSum,new Long(value));
  }
  public  void setStudendSum(long value){
     this.set(S_StudendSum,new Long(value));
  }
  public  void setStudendSumNull(){
     this.set(S_StudendSum,null);
  }

  public long getStudendSum(){
        return DataType.getAsLong(this.get(S_StudendSum));
  
  }
  public long getStudendSumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_StudendSum));
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

  public void initSchoolProperty(int value){
     this.initProperty(S_SchoolProperty,new Integer(value));
  }
  public  void setSchoolProperty(int value){
     this.set(S_SchoolProperty,new Integer(value));
  }
  public  void setSchoolPropertyNull(){
     this.set(S_SchoolProperty,null);
  }

  public int getSchoolProperty(){
        return DataType.getAsInt(this.get(S_SchoolProperty));
  
  }
  public int getSchoolPropertyInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_SchoolProperty));
      }

  public void initCountyCode(long value){
     this.initProperty(S_CountyCode,new Long(value));
  }
  public  void setCountyCode(long value){
     this.set(S_CountyCode,new Long(value));
  }
  public  void setCountyCodeNull(){
     this.set(S_CountyCode,null);
  }

  public long getCountyCode(){
        return DataType.getAsLong(this.get(S_CountyCode));
  
  }
  public long getCountyCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CountyCode));
      }

  public void initSchoolAddress(String value){
     this.initProperty(S_SchoolAddress,value);
  }
  public  void setSchoolAddress(String value){
     this.set(S_SchoolAddress,value);
  }
  public  void setSchoolAddressNull(){
     this.set(S_SchoolAddress,null);
  }

  public String getSchoolAddress(){
       return DataType.getAsString(this.get(S_SchoolAddress));
  
  }
  public String getSchoolAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SchoolAddress));
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

  public void initCmccWlan(int value){
     this.initProperty(S_CmccWlan,new Integer(value));
  }
  public  void setCmccWlan(int value){
     this.set(S_CmccWlan,new Integer(value));
  }
  public  void setCmccWlanNull(){
     this.set(S_CmccWlan,null);
  }

  public int getCmccWlan(){
        return DataType.getAsInt(this.get(S_CmccWlan));
  
  }
  public int getCmccWlanInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CmccWlan));
      }

  public void initSchoolWap(String value){
     this.initProperty(S_SchoolWap,value);
  }
  public  void setSchoolWap(String value){
     this.set(S_SchoolWap,value);
  }
  public  void setSchoolWapNull(){
     this.set(S_SchoolWap,null);
  }

  public String getSchoolWap(){
       return DataType.getAsString(this.get(S_SchoolWap));
  
  }
  public String getSchoolWapInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SchoolWap));
      }

  public void initCtWire(int value){
     this.initProperty(S_CtWire,new Integer(value));
  }
  public  void setCtWire(int value){
     this.set(S_CtWire,new Integer(value));
  }
  public  void setCtWireNull(){
     this.set(S_CtWire,null);
  }

  public int getCtWire(){
        return DataType.getAsInt(this.get(S_CtWire));
  
  }
  public int getCtWireInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CtWire));
      }

  public void initCuSum(long value){
     this.initProperty(S_CuSum,new Long(value));
  }
  public  void setCuSum(long value){
     this.set(S_CuSum,new Long(value));
  }
  public  void setCuSumNull(){
     this.set(S_CuSum,null);
  }

  public long getCuSum(){
        return DataType.getAsLong(this.get(S_CuSum));
  
  }
  public long getCuSumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CuSum));
      }

  public void initPschoolId(long value){
     this.initProperty(S_PschoolId,new Long(value));
  }
  public  void setPschoolId(long value){
     this.set(S_PschoolId,new Long(value));
  }
  public  void setPschoolIdNull(){
     this.set(S_PschoolId,null);
  }

  public long getPschoolId(){
        return DataType.getAsLong(this.get(S_PschoolId));
  
  }
  public long getPschoolIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PschoolId));
      }

  public void initMasterDept(int value){
     this.initProperty(S_MasterDept,new Integer(value));
  }
  public  void setMasterDept(int value){
     this.set(S_MasterDept,new Integer(value));
  }
  public  void setMasterDeptNull(){
     this.set(S_MasterDept,null);
  }

  public int getMasterDept(){
        return DataType.getAsInt(this.get(S_MasterDept));
  
  }
  public int getMasterDeptInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MasterDept));
      }

  public void initSchoolName(String value){
     this.initProperty(S_SchoolName,value);
  }
  public  void setSchoolName(String value){
     this.set(S_SchoolName,value);
  }
  public  void setSchoolNameNull(){
     this.set(S_SchoolName,null);
  }

  public String getSchoolName(){
       return DataType.getAsString(this.get(S_SchoolName));
  
  }
  public String getSchoolNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SchoolName));
      }

  public void initSts(int value){
     this.initProperty(S_Sts,new Integer(value));
  }
  public  void setSts(int value){
     this.set(S_Sts,new Integer(value));
  }
  public  void setStsNull(){
     this.set(S_Sts,null);
  }

  public int getSts(){
        return DataType.getAsInt(this.get(S_Sts));
  
  }
  public int getStsInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Sts));
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

  public void initLongitude(long value){
     this.initProperty(S_Longitude,new Long(value));
  }
  public  void setLongitude(long value){
     this.set(S_Longitude,new Long(value));
  }
  public  void setLongitudeNull(){
     this.set(S_Longitude,null);
  }

  public long getLongitude(){
        return DataType.getAsLong(this.get(S_Longitude));
  
  }
  public long getLongitudeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Longitude));
      }

  public void initRegionCode(int value){
     this.initProperty(S_RegionCode,new Integer(value));
  }
  public  void setRegionCode(int value){
     this.set(S_RegionCode,new Integer(value));
  }
  public  void setRegionCodeNull(){
     this.set(S_RegionCode,null);
  }

  public int getRegionCode(){
        return DataType.getAsInt(this.get(S_RegionCode));
  
  }
  public int getRegionCodeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_RegionCode));
      }

  public void initGroupId(long value){
     this.initProperty(S_GroupId,new Long(value));
  }
  public  void setGroupId(long value){
     this.set(S_GroupId,new Long(value));
  }
  public  void setGroupIdNull(){
     this.set(S_GroupId,null);
  }

  public long getGroupId(){
        return DataType.getAsLong(this.get(S_GroupId));
  
  }
  public long getGroupIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupId));
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

  public void initSchoolType(int value){
     this.initProperty(S_SchoolType,new Integer(value));
  }
  public  void setSchoolType(int value){
     this.set(S_SchoolType,new Integer(value));
  }
  public  void setSchoolTypeNull(){
     this.set(S_SchoolType,null);
  }

  public int getSchoolType(){
        return DataType.getAsInt(this.get(S_SchoolType));
  
  }
  public int getSchoolTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_SchoolType));
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

  public void initRecruitSum(long value){
     this.initProperty(S_RecruitSum,new Long(value));
  }
  public  void setRecruitSum(long value){
     this.set(S_RecruitSum,new Long(value));
  }
  public  void setRecruitSumNull(){
     this.set(S_RecruitSum,null);
  }

  public long getRecruitSum(){
        return DataType.getAsLong(this.get(S_RecruitSum));
  
  }
  public long getRecruitSumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RecruitSum));
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

  public void initYkt(int value){
     this.initProperty(S_Ykt,new Integer(value));
  }
  public  void setYkt(int value){
     this.set(S_Ykt,new Integer(value));
  }
  public  void setYktNull(){
     this.set(S_Ykt,null);
  }

  public int getYkt(){
        return DataType.getAsInt(this.get(S_Ykt));
  
  }
  public int getYktInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Ykt));
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

  public void initCmccSum(long value){
     this.initProperty(S_CmccSum,new Long(value));
  }
  public  void setCmccSum(long value){
     this.set(S_CmccSum,new Long(value));
  }
  public  void setCmccSumNull(){
     this.set(S_CmccSum,null);
  }

  public long getCmccSum(){
        return DataType.getAsLong(this.get(S_CmccSum));
  
  }
  public long getCmccSumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CmccSum));
      }

  public void initCuWire(int value){
     this.initProperty(S_CuWire,new Integer(value));
  }
  public  void setCuWire(int value){
     this.set(S_CuWire,new Integer(value));
  }
  public  void setCuWireNull(){
     this.set(S_CuWire,null);
  }

  public int getCuWire(){
        return DataType.getAsInt(this.get(S_CuWire));
  
  }
  public int getCuWireInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CuWire));
      }

  public void initTeacherSum(long value){
     this.initProperty(S_TeacherSum,new Long(value));
  }
  public  void setTeacherSum(long value){
     this.set(S_TeacherSum,new Long(value));
  }
  public  void setTeacherSumNull(){
     this.set(S_TeacherSum,null);
  }

  public long getTeacherSum(){
        return DataType.getAsLong(this.get(S_TeacherSum));
  
  }
  public long getTeacherSumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_TeacherSum));
      }

  public void initLatitude(long value){
     this.initProperty(S_Latitude,new Long(value));
  }
  public  void setLatitude(long value){
     this.set(S_Latitude,new Long(value));
  }
  public  void setLatitudeNull(){
     this.set(S_Latitude,null);
  }

  public long getLatitude(){
        return DataType.getAsLong(this.get(S_Latitude));
  
  }
  public long getLatitudeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Latitude));
      }


 
 }

