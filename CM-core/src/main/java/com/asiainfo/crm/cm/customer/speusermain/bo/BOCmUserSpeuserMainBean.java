package com.asiainfo.crm.cm.customer.speusermain.bo;
import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;
import com.asiainfo.crm.cm.customer.speusermain.ivalues.IBOCmUserSpeuserMainValue;
public class BOCmUserSpeuserMainBean extends DataContainer implements DataContainerInterface,IBOCmUserSpeuserMainValue{
  private static String  m_boName = "com.asiainfo.crm.cm.customer.speusermain.bo.BOCmUserSpeuserMain";
  public final static String S_SpeuserId = "SPEUSER_ID";
  public final static String S_PhoneId = "PHONE_ID";
  public final static String S_AcctId = "ACCT_ID";
  public final static String S_CreditLevel = "CREDIT_LEVEL";
  public final static String S_State = "STATE";
  public final static String S_CreateOpId = "CREATE_OP_ID";
  public final static String S_CreateOrgId = "CREATE_ORG_ID";
  public final static String S_OpId = "OP_ID";
  public final static String S_OrgId = "ORG_ID";
  public final static String S_DoneCode = "DONE_CODE";
  public final static String S_CreateDate = "CREATE_DATE";
  public final static String S_DoneDate = "DONE_DATE";
  public final static String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static String S_ExpireDate = "EXPIRE_DATE";
  public final static String S_RegionId = "REGION_ID";
  public final static String S_Remarks = "REMARKS";
  public BOCmUserSpeuserMainBean() throws AIException{
    super(ServiceManager.getObjectTypeFactory().getInstance(m_boName));
  }
  public static ObjectType getObjectTypeStatic() throws AIException{
    return ServiceManager.getObjectTypeFactory().getInstance(m_boName);
  }
  public void setObjectType(ObjectType  value) throws AIException{
    throw new AIException("Such data can not be reset container business object types!");
  }
  public void initSpeuserId(long value){
    this.initProperty(S_SpeuserId,new Long(value));
  }
  public  void setSpeuserId(long value){
    this.set(S_SpeuserId,new Long(value));
  }
  public  void setSpeuserIdNull(){
    this.set(S_SpeuserId,null);
  }
  public long getSpeuserId(){
    return DataType.getAsLong(this.get(S_SpeuserId));
  }
  public long getSpeuserIdInitialValue(){
    return DataType.getAsLong(this.getOldObj(S_SpeuserId));
  }
  public void initPhoneId(long value){
    this.initProperty(S_PhoneId,new Long(value));
  }
  public  void setPhoneId(long value){
    this.set(S_PhoneId,new Long(value));
  }
  public  void setPhoneIdNull(){
    this.set(S_PhoneId,null);
  }
  public long getPhoneId(){
    return DataType.getAsLong(this.get(S_PhoneId));
  }
  public long getPhoneIdInitialValue(){
    return DataType.getAsLong(this.getOldObj(S_PhoneId));
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
  public void initCreditLevel(long value){
    this.initProperty(S_CreditLevel,new Long(value));
  }
  public  void setCreditLevel(long value){
    this.set(S_CreditLevel,new Long(value));
  }
  public  void setCreditLevelNull(){
    this.set(S_CreditLevel,null);
  }
  public long getCreditLevel(){
    return DataType.getAsLong(this.get(S_CreditLevel));
  }
  public long getCreditLevelInitialValue(){
    return DataType.getAsLong(this.getOldObj(S_CreditLevel));
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
}
