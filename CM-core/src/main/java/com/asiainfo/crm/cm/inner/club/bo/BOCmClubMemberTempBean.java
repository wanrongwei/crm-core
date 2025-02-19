package com.asiainfo.crm.cm.inner.club.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.club.ivalues.*;

public class BOCmClubMemberTempBean extends DataContainer implements DataContainerInterface,IBOCmClubMemberTempValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.club.bo.BOCmClubMemberTemp";



  public final static  String S_State = "STATE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_FailRemarks = "FAIL_REMARKS";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmClubMemberTempBean() throws AIException{
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

  public void initBillId(String value){
     this.initProperty(S_BillId,value);
  }
  public  void setBillId(String value){
     this.set(S_BillId,value);
  }
  public  void setBillIdNull(){
     this.set(S_BillId,null);
  }

  public String getBillId(){
       return DataType.getAsString(this.get(S_BillId));
  
  }
  public String getBillIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BillId));
      }

  public void initFailRemarks(String value){
     this.initProperty(S_FailRemarks,value);
  }
  public  void setFailRemarks(String value){
     this.set(S_FailRemarks,value);
  }
  public  void setFailRemarksNull(){
     this.set(S_FailRemarks,null);
  }

  public String getFailRemarks(){
       return DataType.getAsString(this.get(S_FailRemarks));
  
  }
  public String getFailRemarksInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FailRemarks));
      }


 
 }

