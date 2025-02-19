package com.asiainfo.crm.cm.ln.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.ln.common.ivalues.*;

public class BOLnCmCustUnionInfoBean extends DataContainer implements DataContainerInterface,IBOLnCmCustUnionInfoValue{

  private static String  m_boName = "com.asiainfo.crm.cm.ln.common.bo.BOLnCmCustUnionInfo";



  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OutlineAlarm = "OUTLINE_ALARM";
  public final static  String S_CurrentTerminal = "CURRENT_TERMINAL";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_Field9 = "FIELD_9";
  public final static  String S_FluxUse = "FLUX_USE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_Field7 = "FIELD_7";
  public final static  String S_Field8 = "FIELD_8";
  public final static  String S_Field5 = "FIELD_5";
  public final static  String S_Field6 = "FIELD_6";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Field10 = "FIELD_10";
  public final static  String S_AvgArpu = "AVG_ARPU";
  public final static  String S_Field4 = "FIELD_4";
  public final static  String S_Field3 = "FIELD_3";
  public final static  String S_AvgCallTimesDay = "AVG_CALL_TIMES_DAY";
  public final static  String S_Field2 = "FIELD_2";
  public final static  String S_Field1 = "FIELD_1";
  public final static  String S_CreateDate = "CREATE_DATE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOLnCmCustUnionInfoBean() throws AIException{
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

  public void initOutlineAlarm(String value){
     this.initProperty(S_OutlineAlarm,value);
  }
  public  void setOutlineAlarm(String value){
     this.set(S_OutlineAlarm,value);
  }
  public  void setOutlineAlarmNull(){
     this.set(S_OutlineAlarm,null);
  }

  public String getOutlineAlarm(){
       return DataType.getAsString(this.get(S_OutlineAlarm));
  
  }
  public String getOutlineAlarmInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OutlineAlarm));
      }

  public void initCurrentTerminal(String value){
     this.initProperty(S_CurrentTerminal,value);
  }
  public  void setCurrentTerminal(String value){
     this.set(S_CurrentTerminal,value);
  }
  public  void setCurrentTerminalNull(){
     this.set(S_CurrentTerminal,null);
  }

  public String getCurrentTerminal(){
       return DataType.getAsString(this.get(S_CurrentTerminal));
  
  }
  public String getCurrentTerminalInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CurrentTerminal));
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

  public void initAcctId(long value){
     this.initProperty(S_AcctId,new Long(value));
  }
  public  void setAcctId(long value){
     this.set(S_AcctId,new Long(value));
  }
  public  void setAcctIdNull(){
     this.set(S_AcctId,null);
  }

  public long getAcctId(){
        return DataType.getAsLong(this.get(S_AcctId));
  
  }
  public long getAcctIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AcctId));
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

  public void initField9(String value){
     this.initProperty(S_Field9,value);
  }
  public  void setField9(String value){
     this.set(S_Field9,value);
  }
  public  void setField9Null(){
     this.set(S_Field9,null);
  }

  public String getField9(){
       return DataType.getAsString(this.get(S_Field9));
  
  }
  public String getField9InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Field9));
      }

  public void initFluxUse(String value){
     this.initProperty(S_FluxUse,value);
  }
  public  void setFluxUse(String value){
     this.set(S_FluxUse,value);
  }
  public  void setFluxUseNull(){
     this.set(S_FluxUse,null);
  }

  public String getFluxUse(){
       return DataType.getAsString(this.get(S_FluxUse));
  
  }
  public String getFluxUseInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FluxUse));
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

  public void initField7(String value){
     this.initProperty(S_Field7,value);
  }
  public  void setField7(String value){
     this.set(S_Field7,value);
  }
  public  void setField7Null(){
     this.set(S_Field7,null);
  }

  public String getField7(){
       return DataType.getAsString(this.get(S_Field7));
  
  }
  public String getField7InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Field7));
      }

  public void initField8(String value){
     this.initProperty(S_Field8,value);
  }
  public  void setField8(String value){
     this.set(S_Field8,value);
  }
  public  void setField8Null(){
     this.set(S_Field8,null);
  }

  public String getField8(){
       return DataType.getAsString(this.get(S_Field8));
  
  }
  public String getField8InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Field8));
      }

  public void initField5(String value){
     this.initProperty(S_Field5,value);
  }
  public  void setField5(String value){
     this.set(S_Field5,value);
  }
  public  void setField5Null(){
     this.set(S_Field5,null);
  }

  public String getField5(){
       return DataType.getAsString(this.get(S_Field5));
  
  }
  public String getField5InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Field5));
      }

  public void initField6(String value){
     this.initProperty(S_Field6,value);
  }
  public  void setField6(String value){
     this.set(S_Field6,value);
  }
  public  void setField6Null(){
     this.set(S_Field6,null);
  }

  public String getField6(){
       return DataType.getAsString(this.get(S_Field6));
  
  }
  public String getField6InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Field6));
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

  public void initField10(String value){
     this.initProperty(S_Field10,value);
  }
  public  void setField10(String value){
     this.set(S_Field10,value);
  }
  public  void setField10Null(){
     this.set(S_Field10,null);
  }

  public String getField10(){
       return DataType.getAsString(this.get(S_Field10));
  
  }
  public String getField10InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Field10));
      }

  public void initAvgArpu(String value){
     this.initProperty(S_AvgArpu,value);
  }
  public  void setAvgArpu(String value){
     this.set(S_AvgArpu,value);
  }
  public  void setAvgArpuNull(){
     this.set(S_AvgArpu,null);
  }

  public String getAvgArpu(){
       return DataType.getAsString(this.get(S_AvgArpu));
  
  }
  public String getAvgArpuInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AvgArpu));
      }

  public void initField4(String value){
     this.initProperty(S_Field4,value);
  }
  public  void setField4(String value){
     this.set(S_Field4,value);
  }
  public  void setField4Null(){
     this.set(S_Field4,null);
  }

  public String getField4(){
       return DataType.getAsString(this.get(S_Field4));
  
  }
  public String getField4InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Field4));
      }

  public void initField3(String value){
     this.initProperty(S_Field3,value);
  }
  public  void setField3(String value){
     this.set(S_Field3,value);
  }
  public  void setField3Null(){
     this.set(S_Field3,null);
  }

  public String getField3(){
       return DataType.getAsString(this.get(S_Field3));
  
  }
  public String getField3InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Field3));
      }

  public void initAvgCallTimesDay(String value){
     this.initProperty(S_AvgCallTimesDay,value);
  }
  public  void setAvgCallTimesDay(String value){
     this.set(S_AvgCallTimesDay,value);
  }
  public  void setAvgCallTimesDayNull(){
     this.set(S_AvgCallTimesDay,null);
  }

  public String getAvgCallTimesDay(){
       return DataType.getAsString(this.get(S_AvgCallTimesDay));
  
  }
  public String getAvgCallTimesDayInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AvgCallTimesDay));
      }

  public void initField2(String value){
     this.initProperty(S_Field2,value);
  }
  public  void setField2(String value){
     this.set(S_Field2,value);
  }
  public  void setField2Null(){
     this.set(S_Field2,null);
  }

  public String getField2(){
       return DataType.getAsString(this.get(S_Field2));
  
  }
  public String getField2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Field2));
      }

  public void initField1(String value){
     this.initProperty(S_Field1,value);
  }
  public  void setField1(String value){
     this.set(S_Field1,value);
  }
  public  void setField1Null(){
     this.set(S_Field1,null);
  }

  public String getField1(){
       return DataType.getAsString(this.get(S_Field1));
  
  }
  public String getField1InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Field1));
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


 
 }

