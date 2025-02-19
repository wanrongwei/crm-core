package com.asiainfo.crm.cm.customer.custmgr.bo;

import java.sql.Timestamp;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.ServiceManager;
import com.asiainfo.crm.cm.customer.custmgr.ivalues.IBOCmxAllCustMgrRelValue;

public class BOCmxAllCustMgrRelBean extends DataContainer implements DataContainerInterface,IBOCmxAllCustMgrRelValue{

  private static String  m_boName = "com.asiainfo.crm.customer.custmgr.bo.BOCmxAllCustMgrRel";



  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_UserBillId = "USER_BILL_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_RelType = "REL_TYPE";
  public final static  String S_ProcessState = "PROCESS_STATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ManagerBillId = "MANAGER_BILL_ID";
  public final static  String S_MgrType = "MGR_TYPE";
  public final static  String S_OperType = "OPER_TYPE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmxAllCustMgrRelBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initUserBillId(String value){
     this.initProperty(S_UserBillId,value);
  }
  public  void setUserBillId(String value){
     this.set(S_UserBillId,value);
  }
  public  void setUserBillIdNull(){
     this.set(S_UserBillId,null);
  }

  public String getUserBillId(){
       return DataType.getAsString(this.get(S_UserBillId));
  
  }
  public String getUserBillIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_UserBillId));
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

  public void initRelType(int value){
     this.initProperty(S_RelType,new Integer(value));
  }
  public  void setRelType(int value){
     this.set(S_RelType,new Integer(value));
  }
  public  void setRelTypeNull(){
     this.set(S_RelType,null);
  }

  public int getRelType(){
        return DataType.getAsInt(this.get(S_RelType));
  
  }
  public int getRelTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_RelType));
      }

  public void initProcessState(int value){
     this.initProperty(S_ProcessState,new Integer(value));
  }
  public  void setProcessState(int value){
     this.set(S_ProcessState,new Integer(value));
  }
  public  void setProcessStateNull(){
     this.set(S_ProcessState,null);
  }

  public int getProcessState(){
        return DataType.getAsInt(this.get(S_ProcessState));
  
  }
  public int getProcessStateInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ProcessState));
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

  public void initManagerBillId(String value){
     this.initProperty(S_ManagerBillId,value);
  }
  public  void setManagerBillId(String value){
     this.set(S_ManagerBillId,value);
  }
  public  void setManagerBillIdNull(){
     this.set(S_ManagerBillId,null);
  }

  public String getManagerBillId(){
       return DataType.getAsString(this.get(S_ManagerBillId));
  
  }
  public String getManagerBillIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ManagerBillId));
      }

  public void initMgrType(int value){
     this.initProperty(S_MgrType,new Integer(value));
  }
  public  void setMgrType(int value){
     this.set(S_MgrType,new Integer(value));
  }
  public  void setMgrTypeNull(){
     this.set(S_MgrType,null);
  }

  public int getMgrType(){
        return DataType.getAsInt(this.get(S_MgrType));
  
  }
  public int getMgrTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MgrType));
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


 
 }

