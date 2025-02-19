package com.asiainfo.crm.cm.inner.customer.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.customer.ivalues.*;

public class BOCmxUserBingingInfoBean extends DataContainer implements DataContainerInterface,IBOCmxUserBingingInfoValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.customer.bo.BOCmxUserBingingInfo";



  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_PromValue = "PROM_VALUE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_PromName = "PROM_NAME";
  public final static  String S_PromStyle = "PROM_STYLE";
  public final static  String S_Notes = "NOTES";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmxUserBingingInfoBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initPromValue(String value){
     this.initProperty(S_PromValue,value);
  }
  public  void setPromValue(String value){
     this.set(S_PromValue,value);
  }
  public  void setPromValueNull(){
     this.set(S_PromValue,null);
  }

  public String getPromValue(){
       return DataType.getAsString(this.get(S_PromValue));
  
  }
  public String getPromValueInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PromValue));
      }

  public void initBillId(long value){
     this.initProperty(S_BillId,new Long(value));
  }
  public  void setBillId(long value){
     this.set(S_BillId,new Long(value));
  }
  public  void setBillIdNull(){
     this.set(S_BillId,null);
  }

  public long getBillId(){
        return DataType.getAsLong(this.get(S_BillId));
  
  }
  public long getBillIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BillId));
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

  public void initPromName(String value){
     this.initProperty(S_PromName,value);
  }
  public  void setPromName(String value){
     this.set(S_PromName,value);
  }
  public  void setPromNameNull(){
     this.set(S_PromName,null);
  }

  public String getPromName(){
       return DataType.getAsString(this.get(S_PromName));
  
  }
  public String getPromNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PromName));
      }

  public void initPromStyle(String value){
     this.initProperty(S_PromStyle,value);
  }
  public  void setPromStyle(String value){
     this.set(S_PromStyle,value);
  }
  public  void setPromStyleNull(){
     this.set(S_PromStyle,null);
  }

  public String getPromStyle(){
       return DataType.getAsString(this.get(S_PromStyle));
  
  }
  public String getPromStyleInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PromStyle));
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


 
 }

