package com.asiainfo.crm.cm.inner.contact.bo;

import java.sql.Timestamp;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.ServiceManager;
import com.asiainfo.crm.cm.inner.contact.ivalues.IBOCmContactValue;

public class BOCmContactBean extends DataContainer implements DataContainerInterface,IBOCmContactValue{

  private static String  m_boName = "com.asiainfo.crm.customer.contact.bo.BOCmContact";



  public final static  String S_RelCustId = "REL_CUST_ID";
  public final static  String S_State = "STATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_RelCustType = "REL_CUST_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_ContType = "CONT_TYPE";
  public final static  String S_OtherContMedium = "OTHER_CONT_MEDIUM";
  public final static  String S_ContZipcode = "CONT_ZIPCODE";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_ContGender = "CONT_GENDER";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_ContFax = "CONT_FAX";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ContPhone = "CONT_PHONE";
  public final static  String S_PriorContMetohd = "PRIOR_CONT_METOHD";
  public final static  String S_ContName = "CONT_NAME";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmContactBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initRelCustId(long value){
     this.initProperty(S_RelCustId,new Long(value));
  }
  public  void setRelCustId(long value){
     this.set(S_RelCustId,new Long(value));
  }
  public  void setRelCustIdNull(){
     this.set(S_RelCustId,null);
  }

  public long getRelCustId(){
        return DataType.getAsLong(this.get(S_RelCustId));
  
  }
  public long getRelCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelCustId));
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

  public void initRelCustType(int value){
     this.initProperty(S_RelCustType,new Integer(value));
  }
  public  void setRelCustType(int value){
     this.set(S_RelCustType,new Integer(value));
  }
  public  void setRelCustTypeNull(){
     this.set(S_RelCustType,null);
  }

  public int getRelCustType(){
        return DataType.getAsInt(this.get(S_RelCustType));
  
  }
  public int getRelCustTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_RelCustType));
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

  public void initContId(long value){
     this.initProperty(S_ContId,new Long(value));
  }
  public  void setContId(long value){
     this.set(S_ContId,new Long(value));
  }
  public  void setContIdNull(){
     this.set(S_ContId,null);
  }

  public long getContId(){
        return DataType.getAsLong(this.get(S_ContId));
  
  }
  public long getContIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ContId));
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

  public void initContType(int value){
     this.initProperty(S_ContType,new Integer(value));
  }
  public  void setContType(int value){
     this.set(S_ContType,new Integer(value));
  }
  public  void setContTypeNull(){
     this.set(S_ContType,null);
  }

  public int getContType(){
        return DataType.getAsInt(this.get(S_ContType));
  
  }
  public int getContTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ContType));
      }

  public void initOtherContMedium(String value){
     this.initProperty(S_OtherContMedium,value);
  }
  public  void setOtherContMedium(String value){
     this.set(S_OtherContMedium,value);
  }
  public  void setOtherContMediumNull(){
     this.set(S_OtherContMedium,null);
  }

  public String getOtherContMedium(){
       return DataType.getAsString(this.get(S_OtherContMedium));
  
  }
  public String getOtherContMediumInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OtherContMedium));
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

  public void initContGender(int value){
     this.initProperty(S_ContGender,new Integer(value));
  }
  public  void setContGender(int value){
     this.set(S_ContGender,new Integer(value));
  }
  public  void setContGenderNull(){
     this.set(S_ContGender,null);
  }

  public int getContGender(){
        return DataType.getAsInt(this.get(S_ContGender));
  
  }
  public int getContGenderInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ContGender));
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

  public void initContPhone(String value){
     this.initProperty(S_ContPhone,value);
  }
  public  void setContPhone(String value){
     this.set(S_ContPhone,value);
  }
  public  void setContPhoneNull(){
     this.set(S_ContPhone,null);
  }

  public String getContPhone(){
       return DataType.getAsString(this.get(S_ContPhone));
  
  }
  public String getContPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContPhone));
      }

  public void initPriorContMetohd(int value){
     this.initProperty(S_PriorContMetohd,new Integer(value));
  }
  public  void setPriorContMetohd(int value){
     this.set(S_PriorContMetohd,new Integer(value));
  }
  public  void setPriorContMetohdNull(){
     this.set(S_PriorContMetohd,null);
  }

  public int getPriorContMetohd(){
        return DataType.getAsInt(this.get(S_PriorContMetohd));
  
  }
  public int getPriorContMetohdInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PriorContMetohd));
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


 
 }

