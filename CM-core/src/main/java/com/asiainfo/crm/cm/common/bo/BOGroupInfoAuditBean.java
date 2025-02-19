package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOGroupInfoAuditBean extends DataContainer implements DataContainerInterface,IBOGroupInfoAuditValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOGroupInfoAudit";



  public final static  String S_ApplyType = "APPLY_TYPE";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_OperaType = "OPERA_TYPE";
  public final static  String S_GroupName = "GROUP_NAME";
  public final static  String S_Remark = "REMARK";
  public final static  String S_ApplyDate = "APPLY_DATE";
  public final static  String S_ApplyState = "APPLY_STATE";
  public final static  String S_ApplyId = "APPLY_ID";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOGroupInfoAuditBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initApplyType(int value){
     this.initProperty(S_ApplyType,new Integer(value));
  }
  public  void setApplyType(int value){
     this.set(S_ApplyType,new Integer(value));
  }
  public  void setApplyTypeNull(){
     this.set(S_ApplyType,null);
  }

  public int getApplyType(){
        return DataType.getAsInt(this.get(S_ApplyType));
  
  }
  public int getApplyTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ApplyType));
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

  public void initOperaType(int value){
     this.initProperty(S_OperaType,new Integer(value));
  }
  public  void setOperaType(int value){
     this.set(S_OperaType,new Integer(value));
  }
  public  void setOperaTypeNull(){
     this.set(S_OperaType,null);
  }

  public int getOperaType(){
        return DataType.getAsInt(this.get(S_OperaType));
  
  }
  public int getOperaTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_OperaType));
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

  public void initRemark(String value){
     this.initProperty(S_Remark,value);
  }
  public  void setRemark(String value){
     this.set(S_Remark,value);
  }
  public  void setRemarkNull(){
     this.set(S_Remark,null);
  }

  public String getRemark(){
       return DataType.getAsString(this.get(S_Remark));
  
  }
  public String getRemarkInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Remark));
      }

  public void initApplyDate(Timestamp value){
     this.initProperty(S_ApplyDate,value);
  }
  public  void setApplyDate(Timestamp value){
     this.set(S_ApplyDate,value);
  }
  public  void setApplyDateNull(){
     this.set(S_ApplyDate,null);
  }

  public Timestamp getApplyDate(){
        return DataType.getAsDateTime(this.get(S_ApplyDate));
  
  }
  public Timestamp getApplyDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ApplyDate));
      }

  public void initApplyState(int value){
     this.initProperty(S_ApplyState,new Integer(value));
  }
  public  void setApplyState(int value){
     this.set(S_ApplyState,new Integer(value));
  }
  public  void setApplyStateNull(){
     this.set(S_ApplyState,null);
  }

  public int getApplyState(){
        return DataType.getAsInt(this.get(S_ApplyState));
  
  }
  public int getApplyStateInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ApplyState));
      }

  public void initApplyId(long value){
     this.initProperty(S_ApplyId,new Long(value));
  }
  public  void setApplyId(long value){
     this.set(S_ApplyId,new Long(value));
  }
  public  void setApplyIdNull(){
     this.set(S_ApplyId,null);
  }

  public long getApplyId(){
        return DataType.getAsLong(this.get(S_ApplyId));
  
  }
  public long getApplyIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ApplyId));
      }


 
 }

