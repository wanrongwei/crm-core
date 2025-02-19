package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class QBOCmQueryContractBean extends DataContainer implements DataContainerInterface,IQBOCmQueryContractValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.QBOCmQueryContract";



  public final static  String S_ThirdDeputyType = "THIRD_DEPUTY_TYPE";
  public final static  String S_ContractSequenceNo = "CONTRACT_SEQUENCE_NO";
  public final static  String S_OtherDesc = "OTHER_DESC";
  public final static  String S_BusiDesc = "BUSI_DESC";
  public final static  String S_ContractType = "CONTRACT_TYPE";
  public final static  String S_SecondDeputyPhone = "SECOND_DEPUTY_PHONE";
  public final static  String S_ChnlRegionType = "CHNL_REGION_TYPE";
  public final static  String S_SecondDeputyDuty = "SECOND_DEPUTY_DUTY";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_ChnlRegionDetail = "CHNL_REGION_DETAIL";
  public final static  String S_ContractSeq = "CONTRACT_SEQ";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_ContractName = "CONTRACT_NAME";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_FirstDeputyType = "FIRST_DEPUTY_TYPE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ChnlCityId = "CHNL_CITY_ID";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_ThirdDeputyDuty = "THIRD_DEPUTY_DUTY";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_ManagerId = "MANAGER_ID";
  public final static  String S_ThirdDeputyName = "THIRD_DEPUTY_NAME";
  public final static  String S_FirstDeputyName = "FIRST_DEPUTY_NAME";
  public final static  String S_ContractStatus = "CONTRACT_STATUS";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_SubscribeDate = "SUBSCRIBE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ContractExpireDate = "CONTRACT_EXPIRE_DATE";
  public final static  String S_FirstDeputyPhone = "FIRST_DEPUTY_PHONE";
  public final static  String S_State = "STATE";
  public final static  String S_ParentContractId = "PARENT_CONTRACT_ID";
  public final static  String S_TemplateId = "TEMPLATE_ID";
  public final static  String S_DetailFeeDesc = "DETAIL_FEE_DESC";
  public final static  String S_SecondName = "SECOND_NAME";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ContractSource = "CONTRACT_SOURCE";
  public final static  String S_IsProtract = "IS_PROTRACT";
  public final static  String S_ThirdDeputyPhone = "THIRD_DEPUTY_PHONE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_ContractDesc = "CONTRACT_DESC";
  public final static  String S_ContractId = "CONTRACT_ID";
  public final static  String S_ContractLevel = "CONTRACT_LEVEL";
  public final static  String S_Affixpath = "AFFIXPATH";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_FirstDeputyDuty = "FIRST_DEPUTY_DUTY";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ThirdName = "THIRD_NAME";
  public final static  String S_SubscribePlace = "SUBSCRIBE_PLACE";
  public final static  String S_SecondDeputyName = "SECOND_DEPUTY_NAME";
  public final static  String S_SecondDeputyType = "SECOND_DEPUTY_TYPE";
  public final static  String S_ContractValidDate = "CONTRACT_VALID_DATE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmQueryContractBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initThirdDeputyType(long value){
     this.initProperty(S_ThirdDeputyType,new Long(value));
  }
  public  void setThirdDeputyType(long value){
     this.set(S_ThirdDeputyType,new Long(value));
  }
  public  void setThirdDeputyTypeNull(){
     this.set(S_ThirdDeputyType,null);
  }

  public long getThirdDeputyType(){
        return DataType.getAsLong(this.get(S_ThirdDeputyType));
  
  }
  public long getThirdDeputyTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ThirdDeputyType));
      }

  public void initContractSequenceNo(String value){
     this.initProperty(S_ContractSequenceNo,value);
  }
  public  void setContractSequenceNo(String value){
     this.set(S_ContractSequenceNo,value);
  }
  public  void setContractSequenceNoNull(){
     this.set(S_ContractSequenceNo,null);
  }

  public String getContractSequenceNo(){
       return DataType.getAsString(this.get(S_ContractSequenceNo));
  
  }
  public String getContractSequenceNoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContractSequenceNo));
      }

  public void initOtherDesc(String value){
     this.initProperty(S_OtherDesc,value);
  }
  public  void setOtherDesc(String value){
     this.set(S_OtherDesc,value);
  }
  public  void setOtherDescNull(){
     this.set(S_OtherDesc,null);
  }

  public String getOtherDesc(){
       return DataType.getAsString(this.get(S_OtherDesc));
  
  }
  public String getOtherDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OtherDesc));
      }

  public void initBusiDesc(String value){
     this.initProperty(S_BusiDesc,value);
  }
  public  void setBusiDesc(String value){
     this.set(S_BusiDesc,value);
  }
  public  void setBusiDescNull(){
     this.set(S_BusiDesc,null);
  }

  public String getBusiDesc(){
       return DataType.getAsString(this.get(S_BusiDesc));
  
  }
  public String getBusiDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BusiDesc));
      }

  public void initContractType(String value){
     this.initProperty(S_ContractType,value);
  }
  public  void setContractType(String value){
     this.set(S_ContractType,value);
  }
  public  void setContractTypeNull(){
     this.set(S_ContractType,null);
  }

  public String getContractType(){
       return DataType.getAsString(this.get(S_ContractType));
  
  }
  public String getContractTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContractType));
      }

  public void initSecondDeputyPhone(String value){
     this.initProperty(S_SecondDeputyPhone,value);
  }
  public  void setSecondDeputyPhone(String value){
     this.set(S_SecondDeputyPhone,value);
  }
  public  void setSecondDeputyPhoneNull(){
     this.set(S_SecondDeputyPhone,null);
  }

  public String getSecondDeputyPhone(){
       return DataType.getAsString(this.get(S_SecondDeputyPhone));
  
  }
  public String getSecondDeputyPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SecondDeputyPhone));
      }

  public void initChnlRegionType(String value){
     this.initProperty(S_ChnlRegionType,value);
  }
  public  void setChnlRegionType(String value){
     this.set(S_ChnlRegionType,value);
  }
  public  void setChnlRegionTypeNull(){
     this.set(S_ChnlRegionType,null);
  }

  public String getChnlRegionType(){
       return DataType.getAsString(this.get(S_ChnlRegionType));
  
  }
  public String getChnlRegionTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ChnlRegionType));
      }

  public void initSecondDeputyDuty(String value){
     this.initProperty(S_SecondDeputyDuty,value);
  }
  public  void setSecondDeputyDuty(String value){
     this.set(S_SecondDeputyDuty,value);
  }
  public  void setSecondDeputyDutyNull(){
     this.set(S_SecondDeputyDuty,null);
  }

  public String getSecondDeputyDuty(){
       return DataType.getAsString(this.get(S_SecondDeputyDuty));
  
  }
  public String getSecondDeputyDutyInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SecondDeputyDuty));
      }

  public void initFirstName(String value){
     this.initProperty(S_FirstName,value);
  }
  public  void setFirstName(String value){
     this.set(S_FirstName,value);
  }
  public  void setFirstNameNull(){
     this.set(S_FirstName,null);
  }

  public String getFirstName(){
       return DataType.getAsString(this.get(S_FirstName));
  
  }
  public String getFirstNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FirstName));
      }

  public void initChnlRegionDetail(long value){
     this.initProperty(S_ChnlRegionDetail,new Long(value));
  }
  public  void setChnlRegionDetail(long value){
     this.set(S_ChnlRegionDetail,new Long(value));
  }
  public  void setChnlRegionDetailNull(){
     this.set(S_ChnlRegionDetail,null);
  }

  public long getChnlRegionDetail(){
        return DataType.getAsLong(this.get(S_ChnlRegionDetail));
  
  }
  public long getChnlRegionDetailInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ChnlRegionDetail));
      }

  public void initContractSeq(String value){
     this.initProperty(S_ContractSeq,value);
  }
  public  void setContractSeq(String value){
     this.set(S_ContractSeq,value);
  }
  public  void setContractSeqNull(){
     this.set(S_ContractSeq,null);
  }

  public String getContractSeq(){
       return DataType.getAsString(this.get(S_ContractSeq));
  
  }
  public String getContractSeqInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContractSeq));
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

  public void initContractName(String value){
     this.initProperty(S_ContractName,value);
  }
  public  void setContractName(String value){
     this.set(S_ContractName,value);
  }
  public  void setContractNameNull(){
     this.set(S_ContractName,null);
  }

  public String getContractName(){
       return DataType.getAsString(this.get(S_ContractName));
  
  }
  public String getContractNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContractName));
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

  public void initFirstDeputyType(long value){
     this.initProperty(S_FirstDeputyType,new Long(value));
  }
  public  void setFirstDeputyType(long value){
     this.set(S_FirstDeputyType,new Long(value));
  }
  public  void setFirstDeputyTypeNull(){
     this.set(S_FirstDeputyType,null);
  }

  public long getFirstDeputyType(){
        return DataType.getAsLong(this.get(S_FirstDeputyType));
  
  }
  public long getFirstDeputyTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_FirstDeputyType));
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

  public void initChnlCityId(String value){
     this.initProperty(S_ChnlCityId,value);
  }
  public  void setChnlCityId(String value){
     this.set(S_ChnlCityId,value);
  }
  public  void setChnlCityIdNull(){
     this.set(S_ChnlCityId,null);
  }

  public String getChnlCityId(){
       return DataType.getAsString(this.get(S_ChnlCityId));
  
  }
  public String getChnlCityIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ChnlCityId));
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

  public void initThirdDeputyDuty(String value){
     this.initProperty(S_ThirdDeputyDuty,value);
  }
  public  void setThirdDeputyDuty(String value){
     this.set(S_ThirdDeputyDuty,value);
  }
  public  void setThirdDeputyDutyNull(){
     this.set(S_ThirdDeputyDuty,null);
  }

  public String getThirdDeputyDuty(){
       return DataType.getAsString(this.get(S_ThirdDeputyDuty));
  
  }
  public String getThirdDeputyDutyInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ThirdDeputyDuty));
      }

  public void initCustName(String value){
     this.initProperty(S_CustName,value);
  }
  public  void setCustName(String value){
     this.set(S_CustName,value);
  }
  public  void setCustNameNull(){
     this.set(S_CustName,null);
  }

  public String getCustName(){
       return DataType.getAsString(this.get(S_CustName));
  
  }
  public String getCustNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustName));
      }

  public void initManagerId(long value){
     this.initProperty(S_ManagerId,new Long(value));
  }
  public  void setManagerId(long value){
     this.set(S_ManagerId,new Long(value));
  }
  public  void setManagerIdNull(){
     this.set(S_ManagerId,null);
  }

  public long getManagerId(){
        return DataType.getAsLong(this.get(S_ManagerId));
  
  }
  public long getManagerIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ManagerId));
      }

  public void initThirdDeputyName(String value){
     this.initProperty(S_ThirdDeputyName,value);
  }
  public  void setThirdDeputyName(String value){
     this.set(S_ThirdDeputyName,value);
  }
  public  void setThirdDeputyNameNull(){
     this.set(S_ThirdDeputyName,null);
  }

  public String getThirdDeputyName(){
       return DataType.getAsString(this.get(S_ThirdDeputyName));
  
  }
  public String getThirdDeputyNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ThirdDeputyName));
      }

  public void initFirstDeputyName(String value){
     this.initProperty(S_FirstDeputyName,value);
  }
  public  void setFirstDeputyName(String value){
     this.set(S_FirstDeputyName,value);
  }
  public  void setFirstDeputyNameNull(){
     this.set(S_FirstDeputyName,null);
  }

  public String getFirstDeputyName(){
       return DataType.getAsString(this.get(S_FirstDeputyName));
  
  }
  public String getFirstDeputyNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FirstDeputyName));
      }

  public void initContractStatus(long value){
     this.initProperty(S_ContractStatus,new Long(value));
  }
  public  void setContractStatus(long value){
     this.set(S_ContractStatus,new Long(value));
  }
  public  void setContractStatusNull(){
     this.set(S_ContractStatus,null);
  }

  public long getContractStatus(){
        return DataType.getAsLong(this.get(S_ContractStatus));
  
  }
  public long getContractStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ContractStatus));
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

  public void initSubscribeDate(Timestamp value){
     this.initProperty(S_SubscribeDate,value);
  }
  public  void setSubscribeDate(Timestamp value){
     this.set(S_SubscribeDate,value);
  }
  public  void setSubscribeDateNull(){
     this.set(S_SubscribeDate,null);
  }

  public Timestamp getSubscribeDate(){
        return DataType.getAsDateTime(this.get(S_SubscribeDate));
  
  }
  public Timestamp getSubscribeDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_SubscribeDate));
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

  public void initContractExpireDate(Timestamp value){
     this.initProperty(S_ContractExpireDate,value);
  }
  public  void setContractExpireDate(Timestamp value){
     this.set(S_ContractExpireDate,value);
  }
  public  void setContractExpireDateNull(){
     this.set(S_ContractExpireDate,null);
  }

  public Timestamp getContractExpireDate(){
        return DataType.getAsDateTime(this.get(S_ContractExpireDate));
  
  }
  public Timestamp getContractExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ContractExpireDate));
      }

  public void initFirstDeputyPhone(String value){
     this.initProperty(S_FirstDeputyPhone,value);
  }
  public  void setFirstDeputyPhone(String value){
     this.set(S_FirstDeputyPhone,value);
  }
  public  void setFirstDeputyPhoneNull(){
     this.set(S_FirstDeputyPhone,null);
  }

  public String getFirstDeputyPhone(){
       return DataType.getAsString(this.get(S_FirstDeputyPhone));
  
  }
  public String getFirstDeputyPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FirstDeputyPhone));
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

  public void initParentContractId(long value){
     this.initProperty(S_ParentContractId,new Long(value));
  }
  public  void setParentContractId(long value){
     this.set(S_ParentContractId,new Long(value));
  }
  public  void setParentContractIdNull(){
     this.set(S_ParentContractId,null);
  }

  public long getParentContractId(){
        return DataType.getAsLong(this.get(S_ParentContractId));
  
  }
  public long getParentContractIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ParentContractId));
      }

  public void initTemplateId(long value){
     this.initProperty(S_TemplateId,new Long(value));
  }
  public  void setTemplateId(long value){
     this.set(S_TemplateId,new Long(value));
  }
  public  void setTemplateIdNull(){
     this.set(S_TemplateId,null);
  }

  public long getTemplateId(){
        return DataType.getAsLong(this.get(S_TemplateId));
  
  }
  public long getTemplateIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_TemplateId));
      }

  public void initDetailFeeDesc(String value){
     this.initProperty(S_DetailFeeDesc,value);
  }
  public  void setDetailFeeDesc(String value){
     this.set(S_DetailFeeDesc,value);
  }
  public  void setDetailFeeDescNull(){
     this.set(S_DetailFeeDesc,null);
  }

  public String getDetailFeeDesc(){
       return DataType.getAsString(this.get(S_DetailFeeDesc));
  
  }
  public String getDetailFeeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DetailFeeDesc));
      }

  public void initSecondName(String value){
     this.initProperty(S_SecondName,value);
  }
  public  void setSecondName(String value){
     this.set(S_SecondName,value);
  }
  public  void setSecondNameNull(){
     this.set(S_SecondName,null);
  }

  public String getSecondName(){
       return DataType.getAsString(this.get(S_SecondName));
  
  }
  public String getSecondNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SecondName));
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

  public void initContractSource(long value){
     this.initProperty(S_ContractSource,new Long(value));
  }
  public  void setContractSource(long value){
     this.set(S_ContractSource,new Long(value));
  }
  public  void setContractSourceNull(){
     this.set(S_ContractSource,null);
  }

  public long getContractSource(){
        return DataType.getAsLong(this.get(S_ContractSource));
  
  }
  public long getContractSourceInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ContractSource));
      }

  public void initIsProtract(String value){
     this.initProperty(S_IsProtract,value);
  }
  public  void setIsProtract(String value){
     this.set(S_IsProtract,value);
  }
  public  void setIsProtractNull(){
     this.set(S_IsProtract,null);
  }

  public String getIsProtract(){
       return DataType.getAsString(this.get(S_IsProtract));
  
  }
  public String getIsProtractInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IsProtract));
      }

  public void initThirdDeputyPhone(String value){
     this.initProperty(S_ThirdDeputyPhone,value);
  }
  public  void setThirdDeputyPhone(String value){
     this.set(S_ThirdDeputyPhone,value);
  }
  public  void setThirdDeputyPhoneNull(){
     this.set(S_ThirdDeputyPhone,null);
  }

  public String getThirdDeputyPhone(){
       return DataType.getAsString(this.get(S_ThirdDeputyPhone));
  
  }
  public String getThirdDeputyPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ThirdDeputyPhone));
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

  public void initContractDesc(String value){
     this.initProperty(S_ContractDesc,value);
  }
  public  void setContractDesc(String value){
     this.set(S_ContractDesc,value);
  }
  public  void setContractDescNull(){
     this.set(S_ContractDesc,null);
  }

  public String getContractDesc(){
       return DataType.getAsString(this.get(S_ContractDesc));
  
  }
  public String getContractDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContractDesc));
      }

  public void initContractId(long value){
     this.initProperty(S_ContractId,new Long(value));
  }
  public  void setContractId(long value){
     this.set(S_ContractId,new Long(value));
  }
  public  void setContractIdNull(){
     this.set(S_ContractId,null);
  }

  public long getContractId(){
        return DataType.getAsLong(this.get(S_ContractId));
  
  }
  public long getContractIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ContractId));
      }

  public void initContractLevel(long value){
     this.initProperty(S_ContractLevel,new Long(value));
  }
  public  void setContractLevel(long value){
     this.set(S_ContractLevel,new Long(value));
  }
  public  void setContractLevelNull(){
     this.set(S_ContractLevel,null);
  }

  public long getContractLevel(){
        return DataType.getAsLong(this.get(S_ContractLevel));
  
  }
  public long getContractLevelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ContractLevel));
      }

  public void initAffixpath(String value){
     this.initProperty(S_Affixpath,value);
  }
  public  void setAffixpath(String value){
     this.set(S_Affixpath,value);
  }
  public  void setAffixpathNull(){
     this.set(S_Affixpath,null);
  }

  public String getAffixpath(){
       return DataType.getAsString(this.get(S_Affixpath));
  
  }
  public String getAffixpathInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Affixpath));
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

  public void initFirstDeputyDuty(String value){
     this.initProperty(S_FirstDeputyDuty,value);
  }
  public  void setFirstDeputyDuty(String value){
     this.set(S_FirstDeputyDuty,value);
  }
  public  void setFirstDeputyDutyNull(){
     this.set(S_FirstDeputyDuty,null);
  }

  public String getFirstDeputyDuty(){
       return DataType.getAsString(this.get(S_FirstDeputyDuty));
  
  }
  public String getFirstDeputyDutyInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FirstDeputyDuty));
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

  public void initThirdName(String value){
     this.initProperty(S_ThirdName,value);
  }
  public  void setThirdName(String value){
     this.set(S_ThirdName,value);
  }
  public  void setThirdNameNull(){
     this.set(S_ThirdName,null);
  }

  public String getThirdName(){
       return DataType.getAsString(this.get(S_ThirdName));
  
  }
  public String getThirdNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ThirdName));
      }

  public void initSubscribePlace(String value){
     this.initProperty(S_SubscribePlace,value);
  }
  public  void setSubscribePlace(String value){
     this.set(S_SubscribePlace,value);
  }
  public  void setSubscribePlaceNull(){
     this.set(S_SubscribePlace,null);
  }

  public String getSubscribePlace(){
       return DataType.getAsString(this.get(S_SubscribePlace));
  
  }
  public String getSubscribePlaceInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SubscribePlace));
      }

  public void initSecondDeputyName(String value){
     this.initProperty(S_SecondDeputyName,value);
  }
  public  void setSecondDeputyName(String value){
     this.set(S_SecondDeputyName,value);
  }
  public  void setSecondDeputyNameNull(){
     this.set(S_SecondDeputyName,null);
  }

  public String getSecondDeputyName(){
       return DataType.getAsString(this.get(S_SecondDeputyName));
  
  }
  public String getSecondDeputyNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SecondDeputyName));
      }

  public void initSecondDeputyType(long value){
     this.initProperty(S_SecondDeputyType,new Long(value));
  }
  public  void setSecondDeputyType(long value){
     this.set(S_SecondDeputyType,new Long(value));
  }
  public  void setSecondDeputyTypeNull(){
     this.set(S_SecondDeputyType,null);
  }

  public long getSecondDeputyType(){
        return DataType.getAsLong(this.get(S_SecondDeputyType));
  
  }
  public long getSecondDeputyTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SecondDeputyType));
      }

  public void initContractValidDate(Timestamp value){
     this.initProperty(S_ContractValidDate,value);
  }
  public  void setContractValidDate(Timestamp value){
     this.set(S_ContractValidDate,value);
  }
  public  void setContractValidDateNull(){
     this.set(S_ContractValidDate,null);
  }

  public Timestamp getContractValidDate(){
        return DataType.getAsDateTime(this.get(S_ContractValidDate));
  
  }
  public Timestamp getContractValidDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ContractValidDate));
      }


 
 }

