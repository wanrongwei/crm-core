package com.asiainfo.crm.cm.inner.account.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.account.ivalues.*;

public class BOCmBillCustomizeBean extends DataContainer implements DataContainerInterface,IBOCmBillCustomizeValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.account.bo.BOCmBillCustomize";



  public final static  String S_MailType = "MAIL_TYPE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_Recipients = "RECIPIENTS";
  public final static  String S_MailProjects = "MAIL_PROJECTS";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ContZipcode = "CONT_ZIPCODE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_BillType = "BILL_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CustomizeId = "CUSTOMIZE_ID";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_MailDate = "MAIL_DATE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_BillPattern = "BILL_PATTERN";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ContFax = "CONT_FAX";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmBillCustomizeBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initMailType(String value){
     this.initProperty(S_MailType,value);
  }
  public  void setMailType(String value){
     this.set(S_MailType,value);
  }
  public  void setMailTypeNull(){
     this.set(S_MailType,null);
  }

  public String getMailType(){
       return DataType.getAsString(this.get(S_MailType));
  
  }
  public String getMailTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MailType));
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

  public void initRecipients(String value){
     this.initProperty(S_Recipients,value);
  }
  public  void setRecipients(String value){
     this.set(S_Recipients,value);
  }
  public  void setRecipientsNull(){
     this.set(S_Recipients,null);
  }

  public String getRecipients(){
       return DataType.getAsString(this.get(S_Recipients));
  
  }
  public String getRecipientsInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Recipients));
      }

  public void initMailProjects(String value){
     this.initProperty(S_MailProjects,value);
  }
  public  void setMailProjects(String value){
     this.set(S_MailProjects,value);
  }
  public  void setMailProjectsNull(){
     this.set(S_MailProjects,null);
  }

  public String getMailProjects(){
       return DataType.getAsString(this.get(S_MailProjects));
  
  }
  public String getMailProjectsInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MailProjects));
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

  public void initContZipcode(String value){
     this.initProperty(S_ContZipcode,value);
  }
  public  void setContZipcode(String value){
     this.set(S_ContZipcode,value);
  }
  public  void setContZipcodeNull(){
     this.set(S_ContZipcode,null);
  }

  public String getContZipcode(){
       return DataType.getAsString(this.get(S_ContZipcode));
  
  }
  public String getContZipcodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContZipcode));
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

  public void initBillType(int value){
     this.initProperty(S_BillType,new Integer(value));
  }
  public  void setBillType(int value){
     this.set(S_BillType,new Integer(value));
  }
  public  void setBillTypeNull(){
     this.set(S_BillType,null);
  }

  public int getBillType(){
        return DataType.getAsInt(this.get(S_BillType));
  
  }
  public int getBillTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_BillType));
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

  public void initCustomizeId(long value){
     this.initProperty(S_CustomizeId,new Long(value));
  }
  public  void setCustomizeId(long value){
     this.set(S_CustomizeId,new Long(value));
  }
  public  void setCustomizeIdNull(){
     this.set(S_CustomizeId,null);
  }

  public long getCustomizeId(){
        return DataType.getAsLong(this.get(S_CustomizeId));
  
  }
  public long getCustomizeIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustomizeId));
      }

  public void initContAddress(String value){
     this.initProperty(S_ContAddress,value);
  }
  public  void setContAddress(String value){
     this.set(S_ContAddress,value);
  }
  public  void setContAddressNull(){
     this.set(S_ContAddress,null);
  }

  public String getContAddress(){
       return DataType.getAsString(this.get(S_ContAddress));
  
  }
  public String getContAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContAddress));
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

  public void initContEmail(String value){
     this.initProperty(S_ContEmail,value);
  }
  public  void setContEmail(String value){
     this.set(S_ContEmail,value);
  }
  public  void setContEmailNull(){
     this.set(S_ContEmail,null);
  }

  public String getContEmail(){
       return DataType.getAsString(this.get(S_ContEmail));
  
  }
  public String getContEmailInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContEmail));
      }

  public void initMailDate(int value){
     this.initProperty(S_MailDate,new Integer(value));
  }
  public  void setMailDate(int value){
     this.set(S_MailDate,new Integer(value));
  }
  public  void setMailDateNull(){
     this.set(S_MailDate,null);
  }

  public int getMailDate(){
        return DataType.getAsInt(this.get(S_MailDate));
  
  }
  public int getMailDateInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MailDate));
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

  public void initBillPattern(int value){
     this.initProperty(S_BillPattern,new Integer(value));
  }
  public  void setBillPattern(int value){
     this.set(S_BillPattern,new Integer(value));
  }
  public  void setBillPatternNull(){
     this.set(S_BillPattern,null);
  }

  public int getBillPattern(){
        return DataType.getAsInt(this.get(S_BillPattern));
  
  }
  public int getBillPatternInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_BillPattern));
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

  public void initContFax(String value){
     this.initProperty(S_ContFax,value);
  }
  public  void setContFax(String value){
     this.set(S_ContFax,value);
  }
  public  void setContFaxNull(){
     this.set(S_ContFax,null);
  }

  public String getContFax(){
       return DataType.getAsString(this.get(S_ContFax));
  
  }
  public String getContFaxInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContFax));
      }


 
 }

