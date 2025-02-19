package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCmGsBaseStationBean extends DataContainer implements DataContainerInterface,IBOCmGsBaseStationValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmGsBaseStation";



  public final static  String S_State = "STATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_AuditSts = "AUDIT_STS";
  public final static  String S_BaseCname = "BASE_CNAME";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_LacId = "LAC_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_BaseName = "BASE_NAME";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_CoverSchools = "COVER_SCHOOLS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_AuditId = "AUDIT_ID";
  public final static  String S_BaseStationId = "BASE_STATION_ID";
  public final static  String S_AuditNote = "AUDIT_NOTE";
  public final static  String S_CellId = "CELL_ID";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_BaseType = "BASE_TYPE";
  public final static  String S_GsmType = "GSM_TYPE";
  public final static  String S_SchoolId = "SCHOOL_ID";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmGsBaseStationBean() throws AIException{
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

  public void initBaseCname(String value){
     this.initProperty(S_BaseCname,value);
  }
  public  void setBaseCname(String value){
     this.set(S_BaseCname,value);
  }
  public  void setBaseCnameNull(){
     this.set(S_BaseCname,null);
  }

  public String getBaseCname(){
       return DataType.getAsString(this.get(S_BaseCname));
  
  }
  public String getBaseCnameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BaseCname));
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

  public void initLacId(String value){
     this.initProperty(S_LacId,value);
  }
  public  void setLacId(String value){
     this.set(S_LacId,value);
  }
  public  void setLacIdNull(){
     this.set(S_LacId,null);
  }

  public String getLacId(){
       return DataType.getAsString(this.get(S_LacId));
  
  }
  public String getLacIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LacId));
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

  public void initBaseName(String value){
     this.initProperty(S_BaseName,value);
  }
  public  void setBaseName(String value){
     this.set(S_BaseName,value);
  }
  public  void setBaseNameNull(){
     this.set(S_BaseName,null);
  }

  public String getBaseName(){
       return DataType.getAsString(this.get(S_BaseName));
  
  }
  public String getBaseNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BaseName));
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

  public void initCoverSchools(int value){
     this.initProperty(S_CoverSchools,new Integer(value));
  }
  public  void setCoverSchools(int value){
     this.set(S_CoverSchools,new Integer(value));
  }
  public  void setCoverSchoolsNull(){
     this.set(S_CoverSchools,null);
  }

  public int getCoverSchools(){
        return DataType.getAsInt(this.get(S_CoverSchools));
  
  }
  public int getCoverSchoolsInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CoverSchools));
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

  public void initBaseStationId(long value){
     this.initProperty(S_BaseStationId,new Long(value));
  }
  public  void setBaseStationId(long value){
     this.set(S_BaseStationId,new Long(value));
  }
  public  void setBaseStationIdNull(){
     this.set(S_BaseStationId,null);
  }

  public long getBaseStationId(){
        return DataType.getAsLong(this.get(S_BaseStationId));
  
  }
  public long getBaseStationIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BaseStationId));
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

  public void initCellId(String value){
     this.initProperty(S_CellId,value);
  }
  public  void setCellId(String value){
     this.set(S_CellId,value);
  }
  public  void setCellIdNull(){
     this.set(S_CellId,null);
  }

  public String getCellId(){
       return DataType.getAsString(this.get(S_CellId));
  
  }
  public String getCellIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CellId));
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

  public void initBaseType(int value){
     this.initProperty(S_BaseType,new Integer(value));
  }
  public  void setBaseType(int value){
     this.set(S_BaseType,new Integer(value));
  }
  public  void setBaseTypeNull(){
     this.set(S_BaseType,null);
  }

  public int getBaseType(){
        return DataType.getAsInt(this.get(S_BaseType));
  
  }
  public int getBaseTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_BaseType));
      }

  public void initGsmType(int value){
     this.initProperty(S_GsmType,new Integer(value));
  }
  public  void setGsmType(int value){
     this.set(S_GsmType,new Integer(value));
  }
  public  void setGsmTypeNull(){
     this.set(S_GsmType,null);
  }

  public int getGsmType(){
        return DataType.getAsInt(this.get(S_GsmType));
  
  }
  public int getGsmTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_GsmType));
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


 
 }

