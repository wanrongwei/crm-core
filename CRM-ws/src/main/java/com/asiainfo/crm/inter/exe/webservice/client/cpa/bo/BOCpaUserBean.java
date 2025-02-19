package com.asiainfo.crm.inter.exe.webservice.client.cpa.bo;

import java.sql.Timestamp;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.ServiceManager;

public class BOCpaUserBean extends DataContainer implements DataContainerInterface,IBOCpaUserValue{

  private static String  m_boName = "com.asiainfo.crm.inter.exe.webservice.client.cpa.bo.BOCpaUser";



  public final static  String S_State = "STATE";
  public final static  String S_CustomerSegment = "CUSTOMER_SEGMENT";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_SubscriberCompany = "SUBSCRIBER_COMPANY";
  public final static  String S_StateDate = "STATE_DATE";
  public final static  String S_CustomerId = "CUSTOMER_ID";
  public final static  String S_DmlAction = "DML_ACTION";
  public final static  String S_EquipmentNo = "EQUIPMENT_NO";
  public final static  String S_FirstBillDate = "FIRST_BILL_DATE";
  public final static  String S_Ban = "BAN";
  public final static  String S_SubscriberId = "SUBSCRIBER_ID";
  public final static  String S_CycleUnit = "CYCLE_UNIT";
  public final static  String S_Products = "PRODUCTS";
  public final static  String S_CpaUserSeq = "CPA_USER_SEQ";
  public final static  String S_Imsi = "IMSI";
  public final static  String S_SubStatus = "SUB_STATUS";
  public final static  String S_TenantId = "TENANT_ID";
  public final static  String S_MvnoBrand = "MVNO_BRAND";
  public final static  String S_CycleType = "CYCLE_TYPE";
  public final static  String S_Ext5 = "EXT5";
  public final static  String S_OriginalInitDate = "ORIGINAL_INIT_DATE";
  public final static  String S_TestSimFlag = "TEST_SIM_FLAG";
  public final static  String S_SubcriberNo = "SUBCRIBER_NO";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_SuspensionReasonCode = "SUSPENSION_REASON_CODE";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_Ext4 = "EXT4";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCpaUserBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //�������������������ҵ���������
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

  public void initCustomerSegment(String value){
     this.initProperty(S_CustomerSegment,value);
  }
  public  void setCustomerSegment(String value){
     this.set(S_CustomerSegment,value);
  }
  public  void setCustomerSegmentNull(){
     this.set(S_CustomerSegment,null);
  }

  public String getCustomerSegment(){
       return DataType.getAsString(this.get(S_CustomerSegment));
  
  }
  public String getCustomerSegmentInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustomerSegment));
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

  public void initSubscriberCompany(String value){
     this.initProperty(S_SubscriberCompany,value);
  }
  public  void setSubscriberCompany(String value){
     this.set(S_SubscriberCompany,value);
  }
  public  void setSubscriberCompanyNull(){
     this.set(S_SubscriberCompany,null);
  }

  public String getSubscriberCompany(){
       return DataType.getAsString(this.get(S_SubscriberCompany));
  
  }
  public String getSubscriberCompanyInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SubscriberCompany));
      }

  public void initStateDate(Timestamp value){
     this.initProperty(S_StateDate,value);
  }
  public  void setStateDate(Timestamp value){
     this.set(S_StateDate,value);
  }
  public  void setStateDateNull(){
     this.set(S_StateDate,null);
  }

  public Timestamp getStateDate(){
        return DataType.getAsDateTime(this.get(S_StateDate));
  
  }
  public Timestamp getStateDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_StateDate));
      }

  public void initCustomerId(String value){
     this.initProperty(S_CustomerId,value);
  }
  public  void setCustomerId(String value){
     this.set(S_CustomerId,value);
  }
  public  void setCustomerIdNull(){
     this.set(S_CustomerId,null);
  }

  public String getCustomerId(){
       return DataType.getAsString(this.get(S_CustomerId));
  
  }
  public String getCustomerIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustomerId));
      }

  public void initDmlAction(String value){
     this.initProperty(S_DmlAction,value);
  }
  public  void setDmlAction(String value){
     this.set(S_DmlAction,value);
  }
  public  void setDmlActionNull(){
     this.set(S_DmlAction,null);
  }

  public String getDmlAction(){
       return DataType.getAsString(this.get(S_DmlAction));
  
  }
  public String getDmlActionInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DmlAction));
      }

  public void initEquipmentNo(String value){
     this.initProperty(S_EquipmentNo,value);
  }
  public  void setEquipmentNo(String value){
     this.set(S_EquipmentNo,value);
  }
  public  void setEquipmentNoNull(){
     this.set(S_EquipmentNo,null);
  }

  public String getEquipmentNo(){
       return DataType.getAsString(this.get(S_EquipmentNo));
  
  }
  public String getEquipmentNoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EquipmentNo));
      }

  public void initFirstBillDate(String value){
     this.initProperty(S_FirstBillDate,value);
  }
  public  void setFirstBillDate(String value){
     this.set(S_FirstBillDate,value);
  }
  public  void setFirstBillDateNull(){
     this.set(S_FirstBillDate,null);
  }

  public String getFirstBillDate(){
       return DataType.getAsString(this.get(S_FirstBillDate));
  
  }
  public String getFirstBillDateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FirstBillDate));
      }

  public void initBan(String value){
     this.initProperty(S_Ban,value);
  }
  public  void setBan(String value){
     this.set(S_Ban,value);
  }
  public  void setBanNull(){
     this.set(S_Ban,null);
  }

  public String getBan(){
       return DataType.getAsString(this.get(S_Ban));
  
  }
  public String getBanInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ban));
      }

  public void initSubscriberId(String value){
     this.initProperty(S_SubscriberId,value);
  }
  public  void setSubscriberId(String value){
     this.set(S_SubscriberId,value);
  }
  public  void setSubscriberIdNull(){
     this.set(S_SubscriberId,null);
  }

  public String getSubscriberId(){
       return DataType.getAsString(this.get(S_SubscriberId));
  
  }
  public String getSubscriberIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SubscriberId));
      }

  public void initCycleUnit(String value){
     this.initProperty(S_CycleUnit,value);
  }
  public  void setCycleUnit(String value){
     this.set(S_CycleUnit,value);
  }
  public  void setCycleUnitNull(){
     this.set(S_CycleUnit,null);
  }

  public String getCycleUnit(){
       return DataType.getAsString(this.get(S_CycleUnit));
  
  }
  public String getCycleUnitInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CycleUnit));
      }

  public void initProducts(String value){
     this.initProperty(S_Products,value);
  }
  public  void setProducts(String value){
     this.set(S_Products,value);
  }
  public  void setProductsNull(){
     this.set(S_Products,null);
  }

  public String getProducts(){
       return DataType.getAsString(this.get(S_Products));
  
  }
  public String getProductsInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Products));
      }

  public void initCpaUserSeq(long value){
     this.initProperty(S_CpaUserSeq,new Long(value));
  }
  public  void setCpaUserSeq(long value){
     this.set(S_CpaUserSeq,new Long(value));
  }
  public  void setCpaUserSeqNull(){
     this.set(S_CpaUserSeq,null);
  }

  public long getCpaUserSeq(){
        return DataType.getAsLong(this.get(S_CpaUserSeq));
  
  }
  public long getCpaUserSeqInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CpaUserSeq));
      }

  public void initImsi(String value){
     this.initProperty(S_Imsi,value);
  }
  public  void setImsi(String value){
     this.set(S_Imsi,value);
  }
  public  void setImsiNull(){
     this.set(S_Imsi,null);
  }

  public String getImsi(){
       return DataType.getAsString(this.get(S_Imsi));
  
  }
  public String getImsiInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Imsi));
      }

  public void initSubStatus(String value){
     this.initProperty(S_SubStatus,value);
  }
  public  void setSubStatus(String value){
     this.set(S_SubStatus,value);
  }
  public  void setSubStatusNull(){
     this.set(S_SubStatus,null);
  }

  public String getSubStatus(){
       return DataType.getAsString(this.get(S_SubStatus));
  
  }
  public String getSubStatusInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SubStatus));
      }

  public void initTenantId(String value){
     this.initProperty(S_TenantId,value);
  }
  public  void setTenantId(String value){
     this.set(S_TenantId,value);
  }
  public  void setTenantIdNull(){
     this.set(S_TenantId,null);
  }

  public String getTenantId(){
       return DataType.getAsString(this.get(S_TenantId));
  
  }
  public String getTenantIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TenantId));
      }

  public void initMvnoBrand(String value){
     this.initProperty(S_MvnoBrand,value);
  }
  public  void setMvnoBrand(String value){
     this.set(S_MvnoBrand,value);
  }
  public  void setMvnoBrandNull(){
     this.set(S_MvnoBrand,null);
  }

  public String getMvnoBrand(){
       return DataType.getAsString(this.get(S_MvnoBrand));
  
  }
  public String getMvnoBrandInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MvnoBrand));
      }

  public void initCycleType(String value){
     this.initProperty(S_CycleType,value);
  }
  public  void setCycleType(String value){
     this.set(S_CycleType,value);
  }
  public  void setCycleTypeNull(){
     this.set(S_CycleType,null);
  }

  public String getCycleType(){
       return DataType.getAsString(this.get(S_CycleType));
  
  }
  public String getCycleTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CycleType));
      }

  public void initExt5(String value){
     this.initProperty(S_Ext5,value);
  }
  public  void setExt5(String value){
     this.set(S_Ext5,value);
  }
  public  void setExt5Null(){
     this.set(S_Ext5,null);
  }

  public String getExt5(){
       return DataType.getAsString(this.get(S_Ext5));
  
  }
  public String getExt5InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext5));
      }

  public void initOriginalInitDate(Timestamp value){
     this.initProperty(S_OriginalInitDate,value);
  }
  public  void setOriginalInitDate(Timestamp value){
     this.set(S_OriginalInitDate,value);
  }
  public  void setOriginalInitDateNull(){
     this.set(S_OriginalInitDate,null);
  }

  public Timestamp getOriginalInitDate(){
        return DataType.getAsDateTime(this.get(S_OriginalInitDate));
  
  }
  public Timestamp getOriginalInitDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_OriginalInitDate));
      }

  public void initTestSimFlag(String value){
     this.initProperty(S_TestSimFlag,value);
  }
  public  void setTestSimFlag(String value){
     this.set(S_TestSimFlag,value);
  }
  public  void setTestSimFlagNull(){
     this.set(S_TestSimFlag,null);
  }

  public String getTestSimFlag(){
       return DataType.getAsString(this.get(S_TestSimFlag));
  
  }
  public String getTestSimFlagInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TestSimFlag));
      }

  public void initSubcriberNo(String value){
     this.initProperty(S_SubcriberNo,value);
  }
  public  void setSubcriberNo(String value){
     this.set(S_SubcriberNo,value);
  }
  public  void setSubcriberNoNull(){
     this.set(S_SubcriberNo,null);
  }

  public String getSubcriberNo(){
       return DataType.getAsString(this.get(S_SubcriberNo));
  
  }
  public String getSubcriberNoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SubcriberNo));
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

  public void initSuspensionReasonCode(String value){
     this.initProperty(S_SuspensionReasonCode,value);
  }
  public  void setSuspensionReasonCode(String value){
     this.set(S_SuspensionReasonCode,value);
  }
  public  void setSuspensionReasonCodeNull(){
     this.set(S_SuspensionReasonCode,null);
  }

  public String getSuspensionReasonCode(){
       return DataType.getAsString(this.get(S_SuspensionReasonCode));
  
  }
  public String getSuspensionReasonCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SuspensionReasonCode));
      }

  public void initExt1(String value){
     this.initProperty(S_Ext1,value);
  }
  public  void setExt1(String value){
     this.set(S_Ext1,value);
  }
  public  void setExt1Null(){
     this.set(S_Ext1,null);
  }

  public String getExt1(){
       return DataType.getAsString(this.get(S_Ext1));
  
  }
  public String getExt1InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext1));
      }

  public void initExt2(String value){
     this.initProperty(S_Ext2,value);
  }
  public  void setExt2(String value){
     this.set(S_Ext2,value);
  }
  public  void setExt2Null(){
     this.set(S_Ext2,null);
  }

  public String getExt2(){
       return DataType.getAsString(this.get(S_Ext2));
  
  }
  public String getExt2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext2));
      }

  public void initExt3(String value){
     this.initProperty(S_Ext3,value);
  }
  public  void setExt3(String value){
     this.set(S_Ext3,value);
  }
  public  void setExt3Null(){
     this.set(S_Ext3,null);
  }

  public String getExt3(){
       return DataType.getAsString(this.get(S_Ext3));
  
  }
  public String getExt3InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext3));
      }

  public void initExt4(String value){
     this.initProperty(S_Ext4,value);
  }
  public  void setExt4(String value){
     this.set(S_Ext4,value);
  }
  public  void setExt4Null(){
     this.set(S_Ext4,null);
  }

  public String getExt4(){
       return DataType.getAsString(this.get(S_Ext4));
  
  }
  public String getExt4InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext4));
      }


 
 }

