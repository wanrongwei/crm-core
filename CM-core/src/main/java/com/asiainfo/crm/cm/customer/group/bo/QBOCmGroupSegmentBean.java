package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class QBOCmGroupSegmentBean extends DataContainer implements DataContainerInterface,IQBOCmGroupSegmentValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.QBOCmGroupSegment";



  public final static  String S_SegmentAttrType = "SEGMENT_ATTR_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_TableName = "TABLE_NAME";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_Seq = "SEQ";
  public final static  String S_AttrituteName = "ATTRITUTE_NAME";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RelaId = "RELA_ID";
  public final static  String S_AllowInheritable = "ALLOW_INHERITABLE";
  public final static  String S_SegmentAttrId = "SEGMENT_ATTR_ID";
  public final static  String S_ColumnName = "COLUMN_NAME";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_IsInheritable = "IS_INHERITABLE";
  public final static  String S_IsApprovable = "IS_APPROVABLE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmGroupSegmentBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initSegmentAttrType(int value){
     this.initProperty(S_SegmentAttrType,new Integer(value));
  }
  public  void setSegmentAttrType(int value){
     this.set(S_SegmentAttrType,new Integer(value));
  }
  public  void setSegmentAttrTypeNull(){
     this.set(S_SegmentAttrType,null);
  }

  public int getSegmentAttrType(){
        return DataType.getAsInt(this.get(S_SegmentAttrType));
  
  }
  public int getSegmentAttrTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_SegmentAttrType));
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

  public void initTableName(String value){
     this.initProperty(S_TableName,value);
  }
  public  void setTableName(String value){
     this.set(S_TableName,value);
  }
  public  void setTableNameNull(){
     this.set(S_TableName,null);
  }

  public String getTableName(){
       return DataType.getAsString(this.get(S_TableName));
  
  }
  public String getTableNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TableName));
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

  public void initSeq(int value){
     this.initProperty(S_Seq,new Integer(value));
  }
  public  void setSeq(int value){
     this.set(S_Seq,new Integer(value));
  }
  public  void setSeqNull(){
     this.set(S_Seq,null);
  }

  public int getSeq(){
        return DataType.getAsInt(this.get(S_Seq));
  
  }
  public int getSeqInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Seq));
      }

  public void initAttrituteName(String value){
     this.initProperty(S_AttrituteName,value);
  }
  public  void setAttrituteName(String value){
     this.set(S_AttrituteName,value);
  }
  public  void setAttrituteNameNull(){
     this.set(S_AttrituteName,null);
  }

  public String getAttrituteName(){
       return DataType.getAsString(this.get(S_AttrituteName));
  
  }
  public String getAttrituteNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AttrituteName));
      }

  public void initCustType(int value){
     this.initProperty(S_CustType,new Integer(value));
  }
  public  void setCustType(int value){
     this.set(S_CustType,new Integer(value));
  }
  public  void setCustTypeNull(){
     this.set(S_CustType,null);
  }

  public int getCustType(){
        return DataType.getAsInt(this.get(S_CustType));
  
  }
  public int getCustTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CustType));
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

  public void initRelaId(long value){
     this.initProperty(S_RelaId,new Long(value));
  }
  public  void setRelaId(long value){
     this.set(S_RelaId,new Long(value));
  }
  public  void setRelaIdNull(){
     this.set(S_RelaId,null);
  }

  public long getRelaId(){
        return DataType.getAsLong(this.get(S_RelaId));
  
  }
  public long getRelaIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelaId));
      }

  public void initAllowInheritable(int value){
     this.initProperty(S_AllowInheritable,new Integer(value));
  }
  public  void setAllowInheritable(int value){
     this.set(S_AllowInheritable,new Integer(value));
  }
  public  void setAllowInheritableNull(){
     this.set(S_AllowInheritable,null);
  }

  public int getAllowInheritable(){
        return DataType.getAsInt(this.get(S_AllowInheritable));
  
  }
  public int getAllowInheritableInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_AllowInheritable));
      }

  public void initSegmentAttrId(long value){
     this.initProperty(S_SegmentAttrId,new Long(value));
  }
  public  void setSegmentAttrId(long value){
     this.set(S_SegmentAttrId,new Long(value));
  }
  public  void setSegmentAttrIdNull(){
     this.set(S_SegmentAttrId,null);
  }

  public long getSegmentAttrId(){
        return DataType.getAsLong(this.get(S_SegmentAttrId));
  
  }
  public long getSegmentAttrIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SegmentAttrId));
      }

  public void initColumnName(String value){
     this.initProperty(S_ColumnName,value);
  }
  public  void setColumnName(String value){
     this.set(S_ColumnName,value);
  }
  public  void setColumnNameNull(){
     this.set(S_ColumnName,null);
  }

  public String getColumnName(){
       return DataType.getAsString(this.get(S_ColumnName));
  
  }
  public String getColumnNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ColumnName));
      }

  public void initCustId(long value){
     this.initProperty(S_CustId,new Long(value));
  }
  public  void setCustId(long value){
     this.set(S_CustId,new Long(value));
  }
  public  void setCustIdNull(){
     this.set(S_CustId,null);
  }

  public long getCustId(){
        return DataType.getAsLong(this.get(S_CustId));
  
  }
  public long getCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustId));
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

  public void initIsInheritable(int value){
     this.initProperty(S_IsInheritable,new Integer(value));
  }
  public  void setIsInheritable(int value){
     this.set(S_IsInheritable,new Integer(value));
  }
  public  void setIsInheritableNull(){
     this.set(S_IsInheritable,null);
  }

  public int getIsInheritable(){
        return DataType.getAsInt(this.get(S_IsInheritable));
  
  }
  public int getIsInheritableInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsInheritable));
      }

  public void initIsApprovable(int value){
     this.initProperty(S_IsApprovable,new Integer(value));
  }
  public  void setIsApprovable(int value){
     this.set(S_IsApprovable,new Integer(value));
  }
  public  void setIsApprovableNull(){
     this.set(S_IsApprovable,null);
  }

  public int getIsApprovable(){
        return DataType.getAsInt(this.get(S_IsApprovable));
  
  }
  public int getIsApprovableInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsApprovable));
      }


 
 }

