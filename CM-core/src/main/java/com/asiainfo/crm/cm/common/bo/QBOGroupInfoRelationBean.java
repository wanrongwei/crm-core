package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class QBOGroupInfoRelationBean extends DataContainer implements DataContainerInterface,IQBOGroupInfoRelationValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.QBOGroupInfoRelation";



  public final static  String S_SoNbr = "SO_NBR";
  public final static  String S_SoDate = "SO_DATE";
  public final static  String S_GroupSeq = "GROUP_SEQ";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_Notes = "NOTES";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_AuditStatus = "AUDIT_STATUS";
  public final static  String S_GroupName = "GROUP_NAME";
  public final static  String S_LinkPhone = "LINK_PHONE";
  public final static  String S_DelAuditId = "DEL_AUDIT_ID";
  public final static  String S_GroupStatus = "GROUP_STATUS";
  public final static  String S_DelAuditDate = "DEL_AUDIT_DATE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOGroupInfoRelationBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initSoNbr(long value){
     this.initProperty(S_SoNbr,new Long(value));
  }
  public  void setSoNbr(long value){
     this.set(S_SoNbr,new Long(value));
  }
  public  void setSoNbrNull(){
     this.set(S_SoNbr,null);
  }

  public long getSoNbr(){
        return DataType.getAsLong(this.get(S_SoNbr));
  
  }
  public long getSoNbrInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SoNbr));
      }

  public void initSoDate(Timestamp value){
     this.initProperty(S_SoDate,value);
  }
  public  void setSoDate(Timestamp value){
     this.set(S_SoDate,value);
  }
  public  void setSoDateNull(){
     this.set(S_SoDate,null);
  }

  public Timestamp getSoDate(){
        return DataType.getAsDateTime(this.get(S_SoDate));
  
  }
  public Timestamp getSoDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_SoDate));
      }

  public void initGroupSeq(String value){
     this.initProperty(S_GroupSeq,value);
  }
  public  void setGroupSeq(String value){
     this.set(S_GroupSeq,value);
  }
  public  void setGroupSeqNull(){
     this.set(S_GroupSeq,null);
  }

  public String getGroupSeq(){
       return DataType.getAsString(this.get(S_GroupSeq));
  
  }
  public String getGroupSeqInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupSeq));
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

  public void initAuditStatus(long value){
     this.initProperty(S_AuditStatus,new Long(value));
  }
  public  void setAuditStatus(long value){
     this.set(S_AuditStatus,new Long(value));
  }
  public  void setAuditStatusNull(){
     this.set(S_AuditStatus,null);
  }

  public long getAuditStatus(){
        return DataType.getAsLong(this.get(S_AuditStatus));
  
  }
  public long getAuditStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AuditStatus));
      }

  public void initGroupName(String value){
     this.initProperty(S_GroupName,value);
  }
  public  void setGroupName(String value){
     this.set(S_GroupName,value);
  }
  public  void setGroupNameNull(){
     this.set(S_GroupName,null);
  }

  public String getGroupName(){
       return DataType.getAsString(this.get(S_GroupName));
  
  }
  public String getGroupNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupName));
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

  public void initDelAuditId(long value){
     this.initProperty(S_DelAuditId,new Long(value));
  }
  public  void setDelAuditId(long value){
     this.set(S_DelAuditId,new Long(value));
  }
  public  void setDelAuditIdNull(){
     this.set(S_DelAuditId,null);
  }

  public long getDelAuditId(){
        return DataType.getAsLong(this.get(S_DelAuditId));
  
  }
  public long getDelAuditIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DelAuditId));
      }

  public void initGroupStatus(long value){
     this.initProperty(S_GroupStatus,new Long(value));
  }
  public  void setGroupStatus(long value){
     this.set(S_GroupStatus,new Long(value));
  }
  public  void setGroupStatusNull(){
     this.set(S_GroupStatus,null);
  }

  public long getGroupStatus(){
        return DataType.getAsLong(this.get(S_GroupStatus));
  
  }
  public long getGroupStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupStatus));
      }

  public void initDelAuditDate(Timestamp value){
     this.initProperty(S_DelAuditDate,value);
  }
  public  void setDelAuditDate(Timestamp value){
     this.set(S_DelAuditDate,value);
  }
  public  void setDelAuditDateNull(){
     this.set(S_DelAuditDate,null);
  }

  public Timestamp getDelAuditDate(){
        return DataType.getAsDateTime(this.get(S_DelAuditDate));
  
  }
  public Timestamp getDelAuditDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_DelAuditDate));
      }


 
 }

