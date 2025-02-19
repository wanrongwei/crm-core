package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCmCustBadRecordBean extends DataContainer implements DataContainerInterface,IBOCmCustBadRecordValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmCustBadRecord";



  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_DeletionDate = "DELETION_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_Amount = "AMOUNT";
  public final static  String S_Ext9 = "EXT9";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Ext5 = "EXT5";
  public final static  String S_Ext6 = "EXT6";
  public final static  String S_Ext7 = "EXT7";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Ext8 = "EXT8";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_DeletionCaus = "DELETION_CAUS";
  public final static  String S_Ext4 = "EXT4";
  public final static  String S_Ext20 = "EXT20";
  public final static  String S_Ext30 = "EXT30";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CreateBy = "CREATE_BY";
  public final static  String S_BeskedId = "BESKED_ID";
  public final static  String S_RegistRemark = "REGIST_REMARK";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_Ext19 = "EXT19";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_Ext29 = "EXT29";
  public final static  String S_Ext18 = "EXT18";
  public final static  String S_Ext17 = "EXT17";
  public final static  String S_Ext27 = "EXT27";
  public final static  String S_Ext16 = "EXT16";
  public final static  String S_Ext28 = "EXT28";
  public final static  String S_Ext15 = "EXT15";
  public final static  String S_Ext25 = "EXT25";
  public final static  String S_Ext14 = "EXT14";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Ext26 = "EXT26";
  public final static  String S_Ext13 = "EXT13";
  public final static  String S_Ext23 = "EXT23";
  public final static  String S_Ext12 = "EXT12";
  public final static  String S_Ext24 = "EXT24";
  public final static  String S_Ext11 = "EXT11";
  public final static  String S_Ext21 = "EXT21";
  public final static  String S_Ext10 = "EXT10";
  public final static  String S_Ext22 = "EXT22";
  public final static  String S_RegistDate = "REGIST_DATE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmCustBadRecordBean() throws AIException{
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

  public void initDeletionDate(Timestamp value){
     this.initProperty(S_DeletionDate,value);
  }
  public  void setDeletionDate(Timestamp value){
     this.set(S_DeletionDate,value);
  }
  public  void setDeletionDateNull(){
     this.set(S_DeletionDate,null);
  }

  public Timestamp getDeletionDate(){
        return DataType.getAsDateTime(this.get(S_DeletionDate));
  
  }
  public Timestamp getDeletionDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_DeletionDate));
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

  public void initAmount(String value){
     this.initProperty(S_Amount,value);
  }
  public  void setAmount(String value){
     this.set(S_Amount,value);
  }
  public  void setAmountNull(){
     this.set(S_Amount,null);
  }

  public String getAmount(){
       return DataType.getAsString(this.get(S_Amount));
  
  }
  public String getAmountInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Amount));
      }

  public void initExt9(String value){
     this.initProperty(S_Ext9,value);
  }
  public  void setExt9(String value){
     this.set(S_Ext9,value);
  }
  public  void setExt9Null(){
     this.set(S_Ext9,null);
  }

  public String getExt9(){
       return DataType.getAsString(this.get(S_Ext9));
  
  }
  public String getExt9InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext9));
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

  public void initExt6(String value){
     this.initProperty(S_Ext6,value);
  }
  public  void setExt6(String value){
     this.set(S_Ext6,value);
  }
  public  void setExt6Null(){
     this.set(S_Ext6,null);
  }

  public String getExt6(){
       return DataType.getAsString(this.get(S_Ext6));
  
  }
  public String getExt6InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext6));
      }

  public void initExt7(String value){
     this.initProperty(S_Ext7,value);
  }
  public  void setExt7(String value){
     this.set(S_Ext7,value);
  }
  public  void setExt7Null(){
     this.set(S_Ext7,null);
  }

  public String getExt7(){
       return DataType.getAsString(this.get(S_Ext7));
  
  }
  public String getExt7InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext7));
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

  public void initExt8(String value){
     this.initProperty(S_Ext8,value);
  }
  public  void setExt8(String value){
     this.set(S_Ext8,value);
  }
  public  void setExt8Null(){
     this.set(S_Ext8,null);
  }

  public String getExt8(){
       return DataType.getAsString(this.get(S_Ext8));
  
  }
  public String getExt8InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext8));
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

  public void initDeletionCaus(String value){
     this.initProperty(S_DeletionCaus,value);
  }
  public  void setDeletionCaus(String value){
     this.set(S_DeletionCaus,value);
  }
  public  void setDeletionCausNull(){
     this.set(S_DeletionCaus,null);
  }

  public String getDeletionCaus(){
       return DataType.getAsString(this.get(S_DeletionCaus));
  
  }
  public String getDeletionCausInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DeletionCaus));
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

  public void initExt20(long value){
     this.initProperty(S_Ext20,new Long(value));
  }
  public  void setExt20(long value){
     this.set(S_Ext20,new Long(value));
  }
  public  void setExt20Null(){
     this.set(S_Ext20,null);
  }

  public long getExt20(){
        return DataType.getAsLong(this.get(S_Ext20));
  
  }
  public long getExt20InitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Ext20));
      }

  public void initExt30(Timestamp value){
     this.initProperty(S_Ext30,value);
  }
  public  void setExt30(Timestamp value){
     this.set(S_Ext30,value);
  }
  public  void setExt30Null(){
     this.set(S_Ext30,null);
  }

  public Timestamp getExt30(){
        return DataType.getAsDateTime(this.get(S_Ext30));
  
  }
  public Timestamp getExt30InitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_Ext30));
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

  public void initCreateBy(String value){
     this.initProperty(S_CreateBy,value);
  }
  public  void setCreateBy(String value){
     this.set(S_CreateBy,value);
  }
  public  void setCreateByNull(){
     this.set(S_CreateBy,null);
  }

  public String getCreateBy(){
       return DataType.getAsString(this.get(S_CreateBy));
  
  }
  public String getCreateByInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CreateBy));
      }

  public void initBeskedId(String value){
     this.initProperty(S_BeskedId,value);
  }
  public  void setBeskedId(String value){
     this.set(S_BeskedId,value);
  }
  public  void setBeskedIdNull(){
     this.set(S_BeskedId,null);
  }

  public String getBeskedId(){
       return DataType.getAsString(this.get(S_BeskedId));
  
  }
  public String getBeskedIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BeskedId));
      }

  public void initRegistRemark(String value){
     this.initProperty(S_RegistRemark,value);
  }
  public  void setRegistRemark(String value){
     this.set(S_RegistRemark,value);
  }
  public  void setRegistRemarkNull(){
     this.set(S_RegistRemark,null);
  }

  public String getRegistRemark(){
       return DataType.getAsString(this.get(S_RegistRemark));
  
  }
  public String getRegistRemarkInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RegistRemark));
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

  public void initExt19(long value){
     this.initProperty(S_Ext19,new Long(value));
  }
  public  void setExt19(long value){
     this.set(S_Ext19,new Long(value));
  }
  public  void setExt19Null(){
     this.set(S_Ext19,null);
  }

  public long getExt19(){
        return DataType.getAsLong(this.get(S_Ext19));
  
  }
  public long getExt19InitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Ext19));
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

  public void initExt29(Timestamp value){
     this.initProperty(S_Ext29,value);
  }
  public  void setExt29(Timestamp value){
     this.set(S_Ext29,value);
  }
  public  void setExt29Null(){
     this.set(S_Ext29,null);
  }

  public Timestamp getExt29(){
        return DataType.getAsDateTime(this.get(S_Ext29));
  
  }
  public Timestamp getExt29InitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_Ext29));
      }

  public void initExt18(String value){
     this.initProperty(S_Ext18,value);
  }
  public  void setExt18(String value){
     this.set(S_Ext18,value);
  }
  public  void setExt18Null(){
     this.set(S_Ext18,null);
  }

  public String getExt18(){
       return DataType.getAsString(this.get(S_Ext18));
  
  }
  public String getExt18InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext18));
      }

  public void initExt17(String value){
     this.initProperty(S_Ext17,value);
  }
  public  void setExt17(String value){
     this.set(S_Ext17,value);
  }
  public  void setExt17Null(){
     this.set(S_Ext17,null);
  }

  public String getExt17(){
       return DataType.getAsString(this.get(S_Ext17));
  
  }
  public String getExt17InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext17));
      }

  public void initExt27(Timestamp value){
     this.initProperty(S_Ext27,value);
  }
  public  void setExt27(Timestamp value){
     this.set(S_Ext27,value);
  }
  public  void setExt27Null(){
     this.set(S_Ext27,null);
  }

  public Timestamp getExt27(){
        return DataType.getAsDateTime(this.get(S_Ext27));
  
  }
  public Timestamp getExt27InitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_Ext27));
      }

  public void initExt16(String value){
     this.initProperty(S_Ext16,value);
  }
  public  void setExt16(String value){
     this.set(S_Ext16,value);
  }
  public  void setExt16Null(){
     this.set(S_Ext16,null);
  }

  public String getExt16(){
       return DataType.getAsString(this.get(S_Ext16));
  
  }
  public String getExt16InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext16));
      }

  public void initExt28(Timestamp value){
     this.initProperty(S_Ext28,value);
  }
  public  void setExt28(Timestamp value){
     this.set(S_Ext28,value);
  }
  public  void setExt28Null(){
     this.set(S_Ext28,null);
  }

  public Timestamp getExt28(){
        return DataType.getAsDateTime(this.get(S_Ext28));
  
  }
  public Timestamp getExt28InitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_Ext28));
      }

  public void initExt15(String value){
     this.initProperty(S_Ext15,value);
  }
  public  void setExt15(String value){
     this.set(S_Ext15,value);
  }
  public  void setExt15Null(){
     this.set(S_Ext15,null);
  }

  public String getExt15(){
       return DataType.getAsString(this.get(S_Ext15));
  
  }
  public String getExt15InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext15));
      }

  public void initExt25(long value){
     this.initProperty(S_Ext25,new Long(value));
  }
  public  void setExt25(long value){
     this.set(S_Ext25,new Long(value));
  }
  public  void setExt25Null(){
     this.set(S_Ext25,null);
  }

  public long getExt25(){
        return DataType.getAsLong(this.get(S_Ext25));
  
  }
  public long getExt25InitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Ext25));
      }

  public void initExt14(String value){
     this.initProperty(S_Ext14,value);
  }
  public  void setExt14(String value){
     this.set(S_Ext14,value);
  }
  public  void setExt14Null(){
     this.set(S_Ext14,null);
  }

  public String getExt14(){
       return DataType.getAsString(this.get(S_Ext14));
  
  }
  public String getExt14InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext14));
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

  public void initExt26(long value){
     this.initProperty(S_Ext26,new Long(value));
  }
  public  void setExt26(long value){
     this.set(S_Ext26,new Long(value));
  }
  public  void setExt26Null(){
     this.set(S_Ext26,null);
  }

  public long getExt26(){
        return DataType.getAsLong(this.get(S_Ext26));
  
  }
  public long getExt26InitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Ext26));
      }

  public void initExt13(String value){
     this.initProperty(S_Ext13,value);
  }
  public  void setExt13(String value){
     this.set(S_Ext13,value);
  }
  public  void setExt13Null(){
     this.set(S_Ext13,null);
  }

  public String getExt13(){
       return DataType.getAsString(this.get(S_Ext13));
  
  }
  public String getExt13InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext13));
      }

  public void initExt23(long value){
     this.initProperty(S_Ext23,new Long(value));
  }
  public  void setExt23(long value){
     this.set(S_Ext23,new Long(value));
  }
  public  void setExt23Null(){
     this.set(S_Ext23,null);
  }

  public long getExt23(){
        return DataType.getAsLong(this.get(S_Ext23));
  
  }
  public long getExt23InitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Ext23));
      }

  public void initExt12(String value){
     this.initProperty(S_Ext12,value);
  }
  public  void setExt12(String value){
     this.set(S_Ext12,value);
  }
  public  void setExt12Null(){
     this.set(S_Ext12,null);
  }

  public String getExt12(){
       return DataType.getAsString(this.get(S_Ext12));
  
  }
  public String getExt12InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext12));
      }

  public void initExt24(long value){
     this.initProperty(S_Ext24,new Long(value));
  }
  public  void setExt24(long value){
     this.set(S_Ext24,new Long(value));
  }
  public  void setExt24Null(){
     this.set(S_Ext24,null);
  }

  public long getExt24(){
        return DataType.getAsLong(this.get(S_Ext24));
  
  }
  public long getExt24InitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Ext24));
      }

  public void initExt11(String value){
     this.initProperty(S_Ext11,value);
  }
  public  void setExt11(String value){
     this.set(S_Ext11,value);
  }
  public  void setExt11Null(){
     this.set(S_Ext11,null);
  }

  public String getExt11(){
       return DataType.getAsString(this.get(S_Ext11));
  
  }
  public String getExt11InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext11));
      }

  public void initExt21(long value){
     this.initProperty(S_Ext21,new Long(value));
  }
  public  void setExt21(long value){
     this.set(S_Ext21,new Long(value));
  }
  public  void setExt21Null(){
     this.set(S_Ext21,null);
  }

  public long getExt21(){
        return DataType.getAsLong(this.get(S_Ext21));
  
  }
  public long getExt21InitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Ext21));
      }

  public void initExt10(String value){
     this.initProperty(S_Ext10,value);
  }
  public  void setExt10(String value){
     this.set(S_Ext10,value);
  }
  public  void setExt10Null(){
     this.set(S_Ext10,null);
  }

  public String getExt10(){
       return DataType.getAsString(this.get(S_Ext10));
  
  }
  public String getExt10InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext10));
      }

  public void initExt22(long value){
     this.initProperty(S_Ext22,new Long(value));
  }
  public  void setExt22(long value){
     this.set(S_Ext22,new Long(value));
  }
  public  void setExt22Null(){
     this.set(S_Ext22,null);
  }

  public long getExt22(){
        return DataType.getAsLong(this.get(S_Ext22));
  
  }
  public long getExt22InitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Ext22));
      }

  public void initRegistDate(Timestamp value){
     this.initProperty(S_RegistDate,value);
  }
  public  void setRegistDate(Timestamp value){
     this.set(S_RegistDate,value);
  }
  public  void setRegistDateNull(){
     this.set(S_RegistDate,null);
  }

  public Timestamp getRegistDate(){
        return DataType.getAsDateTime(this.get(S_RegistDate));
  
  }
  public Timestamp getRegistDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_RegistDate));
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


 
 }

