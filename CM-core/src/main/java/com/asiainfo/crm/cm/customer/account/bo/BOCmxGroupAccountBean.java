package com.asiainfo.crm.cm.customer.account.bo;

import java.sql.Timestamp;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.ServiceManager;
import com.asiainfo.crm.cm.customer.account.ivalues.IBOCmxGroupAccountValue;

public class BOCmxGroupAccountBean extends DataContainer implements DataContainerInterface,IBOCmxGroupAccountValue{

  private static String  m_boName = "com.asiainfo.crm.customer.account.bo.BOCmxGroupAccount";



  public final static  String S_DeptId = "DEPT_ID";
  public final static  String S_State = "STATE";
  public final static  String S_IsPrepaytag = "IS_PREPAYTAG";
  public final static  String S_ContName = "CONT_NAME";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_PayCycle = "PAY_CYCLE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_IsSendBill = "IS_SEND_BILL";
  public final static  String S_IsSendMessage = "IS_SEND_MESSAGE";
  public final static  String S_ContCertType = "CONT_CERT_TYPE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_AcctRealType = "ACCT_REAL_TYPE";
  public final static  String S_AccAliasName = "ACC_ALIAS_NAME";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_AcctType = "ACCT_TYPE";
  public final static  String S_CreditTerm = "CREDIT_TERM";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_AcctBusiType = "ACCT_BUSI_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_NoticeFlag = "NOTICE_FLAG";
  public final static  String S_ContCertCode = "CONT_CERT_CODE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmxGroupAccountBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initDeptId(long value){
     this.initProperty(S_DeptId,new Long(value));
  }
  public  void setDeptId(long value){
     this.set(S_DeptId,new Long(value));
  }
  public  void setDeptIdNull(){
     this.set(S_DeptId,null);
  }

  public long getDeptId(){
        return DataType.getAsLong(this.get(S_DeptId));
  
  }
  public long getDeptIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DeptId));
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

  public void initIsPrepaytag(int value){
     this.initProperty(S_IsPrepaytag,new Integer(value));
  }
  public  void setIsPrepaytag(int value){
     this.set(S_IsPrepaytag,new Integer(value));
  }
  public  void setIsPrepaytagNull(){
     this.set(S_IsPrepaytag,null);
  }

  public int getIsPrepaytag(){
        return DataType.getAsInt(this.get(S_IsPrepaytag));
  
  }
  public int getIsPrepaytagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsPrepaytag));
      }

  public void initContName(String value){
     this.initProperty(S_ContName,value);
  }
  public  void setContName(String value){
     this.set(S_ContName,value);
  }
  public  void setContNameNull(){
     this.set(S_ContName,null);
  }

  public String getContName(){
       return DataType.getAsString(this.get(S_ContName));
  
  }
  public String getContNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContName));
      }

  public void initCreditValue(long value){
     this.initProperty(S_CreditValue,new Long(value));
  }
  public  void setCreditValue(long value){
     this.set(S_CreditValue,new Long(value));
  }
  public  void setCreditValueNull(){
     this.set(S_CreditValue,null);
  }

  public long getCreditValue(){
        return DataType.getAsLong(this.get(S_CreditValue));
  
  }
  public long getCreditValueInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CreditValue));
      }

  public void initContMobile(String value){
     this.initProperty(S_ContMobile,value);
  }
  public  void setContMobile(String value){
     this.set(S_ContMobile,value);
  }
  public  void setContMobileNull(){
     this.set(S_ContMobile,null);
  }

  public String getContMobile(){
       return DataType.getAsString(this.get(S_ContMobile));
  
  }
  public String getContMobileInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContMobile));
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

  public void initPayCycle(int value){
     this.initProperty(S_PayCycle,new Integer(value));
  }
  public  void setPayCycle(int value){
     this.set(S_PayCycle,new Integer(value));
  }
  public  void setPayCycleNull(){
     this.set(S_PayCycle,null);
  }

  public int getPayCycle(){
        return DataType.getAsInt(this.get(S_PayCycle));
  
  }
  public int getPayCycleInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PayCycle));
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

  public void initIsSendBill(int value){
     this.initProperty(S_IsSendBill,new Integer(value));
  }
  public  void setIsSendBill(int value){
     this.set(S_IsSendBill,new Integer(value));
  }
  public  void setIsSendBillNull(){
     this.set(S_IsSendBill,null);
  }

  public int getIsSendBill(){
        return DataType.getAsInt(this.get(S_IsSendBill));
  
  }
  public int getIsSendBillInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsSendBill));
      }

  public void initIsSendMessage(int value){
     this.initProperty(S_IsSendMessage,new Integer(value));
  }
  public  void setIsSendMessage(int value){
     this.set(S_IsSendMessage,new Integer(value));
  }
  public  void setIsSendMessageNull(){
     this.set(S_IsSendMessage,null);
  }

  public int getIsSendMessage(){
        return DataType.getAsInt(this.get(S_IsSendMessage));
  
  }
  public int getIsSendMessageInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsSendMessage));
      }

  public void initContCertType(int value){
     this.initProperty(S_ContCertType,new Integer(value));
  }
  public  void setContCertType(int value){
     this.set(S_ContCertType,new Integer(value));
  }
  public  void setContCertTypeNull(){
     this.set(S_ContCertType,null);
  }

  public int getContCertType(){
        return DataType.getAsInt(this.get(S_ContCertType));
  
  }
  public int getContCertTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ContCertType));
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

  public void initAcctRealType(int value){
     this.initProperty(S_AcctRealType,new Integer(value));
  }
  public  void setAcctRealType(int value){
     this.set(S_AcctRealType,new Integer(value));
  }
  public  void setAcctRealTypeNull(){
     this.set(S_AcctRealType,null);
  }

  public int getAcctRealType(){
        return DataType.getAsInt(this.get(S_AcctRealType));
  
  }
  public int getAcctRealTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_AcctRealType));
      }

  public void initAccAliasName(String value){
     this.initProperty(S_AccAliasName,value);
  }
  public  void setAccAliasName(String value){
     this.set(S_AccAliasName,value);
  }
  public  void setAccAliasNameNull(){
     this.set(S_AccAliasName,null);
  }

  public String getAccAliasName(){
       return DataType.getAsString(this.get(S_AccAliasName));
  
  }
  public String getAccAliasNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AccAliasName));
      }

  public void initGroupCustId(long value){
     this.initProperty(S_GroupCustId,new Long(value));
  }
  public  void setGroupCustId(long value){
     this.set(S_GroupCustId,new Long(value));
  }
  public  void setGroupCustIdNull(){
     this.set(S_GroupCustId,null);
  }

  public long getGroupCustId(){
        return DataType.getAsLong(this.get(S_GroupCustId));
  
  }
  public long getGroupCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupCustId));
      }

  public void initAcctType(int value){
     this.initProperty(S_AcctType,new Integer(value));
  }
  public  void setAcctType(int value){
     this.set(S_AcctType,new Integer(value));
  }
  public  void setAcctTypeNull(){
     this.set(S_AcctType,null);
  }

  public int getAcctType(){
        return DataType.getAsInt(this.get(S_AcctType));
  
  }
  public int getAcctTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_AcctType));
      }

  public void initCreditTerm(int value){
     this.initProperty(S_CreditTerm,new Integer(value));
  }
  public  void setCreditTerm(int value){
     this.set(S_CreditTerm,new Integer(value));
  }
  public  void setCreditTermNull(){
     this.set(S_CreditTerm,null);
  }

  public int getCreditTerm(){
        return DataType.getAsInt(this.get(S_CreditTerm));
  
  }
  public int getCreditTermInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CreditTerm));
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

  public void initCountyId(String value){
     this.initProperty(S_CountyId,value);
  }
  public  void setCountyId(String value){
     this.set(S_CountyId,value);
  }
  public  void setCountyIdNull(){
     this.set(S_CountyId,null);
  }

  public String getCountyId(){
       return DataType.getAsString(this.get(S_CountyId));
  
  }
  public String getCountyIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CountyId));
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

  public void initAcctBusiType(int value){
     this.initProperty(S_AcctBusiType,new Integer(value));
  }
  public  void setAcctBusiType(int value){
     this.set(S_AcctBusiType,new Integer(value));
  }
  public  void setAcctBusiTypeNull(){
     this.set(S_AcctBusiType,null);
  }

  public int getAcctBusiType(){
        return DataType.getAsInt(this.get(S_AcctBusiType));
  
  }
  public int getAcctBusiTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_AcctBusiType));
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

  public void initNoticeFlag(int value){
     this.initProperty(S_NoticeFlag,new Integer(value));
  }
  public  void setNoticeFlag(int value){
     this.set(S_NoticeFlag,new Integer(value));
  }
  public  void setNoticeFlagNull(){
     this.set(S_NoticeFlag,null);
  }

  public int getNoticeFlag(){
        return DataType.getAsInt(this.get(S_NoticeFlag));
  
  }
  public int getNoticeFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_NoticeFlag));
      }

  public void initContCertCode(String value){
     this.initProperty(S_ContCertCode,value);
  }
  public  void setContCertCode(String value){
     this.set(S_ContCertCode,value);
  }
  public  void setContCertCodeNull(){
     this.set(S_ContCertCode,null);
  }

  public String getContCertCode(){
       return DataType.getAsString(this.get(S_ContCertCode));
  
  }
  public String getContCertCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContCertCode));
      }


 
 }

