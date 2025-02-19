package com.asiainfo.crm.inter.exe.webservice.client.phobook.bo;

import java.sql.*;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.ivalues.IBOResAddressValue;



public class BOResAddressBean extends DataContainer implements DataContainerInterface,IBOResAddressValue{

  private static String  m_boName = "com.asiainfo.crm.inter.ws.bo.BOResAddress";



  public final static  String S_AddressId = "ADDRESS_ID";
  public final static  String S_AddrDesc = "ADDR_DESC";
  public final static  String S_Ext20 = "EXT20";
  public final static  String S_State = "STATE";
  public final static  String S_BlackState = "BLACK_STATE";
  public final static  String S_LastUpdatedDate = "LAST_UPDATED_DATE";
  public final static  String S_Remark = "REMARK";
  public final static  String S_CreatedBy = "CREATED_BY";
  public final static  String S_LastUpdatedBy = "LAST_UPDATED_BY";
  public final static  String S_Ext19 = "EXT19";
  public final static  String S_Ext18 = "EXT18";
  public final static  String S_Ext17 = "EXT17";
  public final static  String S_Ext16 = "EXT16";
  public final static  String S_Ext15 = "EXT15";
  public final static  String S_Ext25 = "EXT25";
  public final static  String S_Ext26 = "EXT26";
  public final static  String S_Ext14 = "EXT14";
  public final static  String S_Ext13 = "EXT13";
  public final static  String S_Ext23 = "EXT23";
  public final static  String S_Ext12 = "EXT12";
  public final static  String S_Ext24 = "EXT24";
  public final static  String S_Ext11 = "EXT11";
  public final static  String S_Ext21 = "EXT21";
  public final static  String S_Ext10 = "EXT10";
  public final static  String S_Ext22 = "EXT22";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_Ext9 = "EXT9";
  public final static  String S_Ext5 = "EXT5";
  public final static  String S_Ext6 = "EXT6";
  public final static  String S_Ext7 = "EXT7";
  public final static  String S_Ext8 = "EXT8";
  public final static  String S_DeliveryState = "DELIVERY_STATE";
  public final static  String S_CreateDate = "CREATE_DATE";
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
  public BOResAddressBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
 
   throw new AIException("Cannot reset ObjectType");
 }


  public void initAddressId(long value){
     this.initProperty(S_AddressId,new Long(value));
  }
  public  void setAddressId(long value){
     this.set(S_AddressId,new Long(value));
  }
  public  void setAddressIdNull(){
     this.set(S_AddressId,null);
  }

  public long getAddressId(){
        return DataType.getAsLong(this.get(S_AddressId));
  
  }
  public long getAddressIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AddressId));
      }

  public void initAddrDesc(String value){
     this.initProperty(S_AddrDesc,value);
  }
  public  void setAddrDesc(String value){
     this.set(S_AddrDesc,value);
  }
  public  void setAddrDescNull(){
     this.set(S_AddrDesc,null);
  }

  public String getAddrDesc(){
       return DataType.getAsString(this.get(S_AddrDesc));
  
  }
  public String getAddrDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AddrDesc));
      }

  public void initExt20(String value){
     this.initProperty(S_Ext20,value);
  }
  public  void setExt20(String value){
     this.set(S_Ext20,value);
  }
  public  void setExt20Null(){
     this.set(S_Ext20,null);
  }

  public String getExt20(){
       return DataType.getAsString(this.get(S_Ext20));
  
  }
  public String getExt20InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext20));
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

  public void initBlackState(String value){
     this.initProperty(S_BlackState,value);
  }
  public  void setBlackState(String value){
     this.set(S_BlackState,value);
  }
  public  void setBlackStateNull(){
     this.set(S_BlackState,null);
  }

  public String getBlackState(){
       return DataType.getAsString(this.get(S_BlackState));
  
  }
  public String getBlackStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BlackState));
      }

  public void initLastUpdatedDate(Timestamp value){
     this.initProperty(S_LastUpdatedDate,value);
  }
  public  void setLastUpdatedDate(Timestamp value){
     this.set(S_LastUpdatedDate,value);
  }
  public  void setLastUpdatedDateNull(){
     this.set(S_LastUpdatedDate,null);
  }

  public Timestamp getLastUpdatedDate(){
        return DataType.getAsDateTime(this.get(S_LastUpdatedDate));
  
  }
  public Timestamp getLastUpdatedDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_LastUpdatedDate));
      }

  public void initRemark(String value){
     this.initProperty(S_Remark,value);
  }
  public  void setRemark(String value){
     this.set(S_Remark,value);
  }
  public  void setRemarkNull(){
     this.set(S_Remark,null);
  }

  public String getRemark(){
       return DataType.getAsString(this.get(S_Remark));
  
  }
  public String getRemarkInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Remark));
      }

  public void initCreatedBy(String value){
     this.initProperty(S_CreatedBy,value);
  }
  public  void setCreatedBy(String value){
     this.set(S_CreatedBy,value);
  }
  public  void setCreatedByNull(){
     this.set(S_CreatedBy,null);
  }

  public String getCreatedBy(){
       return DataType.getAsString(this.get(S_CreatedBy));
  
  }
  public String getCreatedByInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CreatedBy));
      }

  public void initLastUpdatedBy(String value){
     this.initProperty(S_LastUpdatedBy,value);
  }
  public  void setLastUpdatedBy(String value){
     this.set(S_LastUpdatedBy,value);
  }
  public  void setLastUpdatedByNull(){
     this.set(S_LastUpdatedBy,null);
  }

  public String getLastUpdatedBy(){
       return DataType.getAsString(this.get(S_LastUpdatedBy));
  
  }
  public String getLastUpdatedByInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LastUpdatedBy));
      }

  public void initExt19(String value){
     this.initProperty(S_Ext19,value);
  }
  public  void setExt19(String value){
     this.set(S_Ext19,value);
  }
  public  void setExt19Null(){
     this.set(S_Ext19,null);
  }

  public String getExt19(){
       return DataType.getAsString(this.get(S_Ext19));
  
  }
  public String getExt19InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext19));
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

  public void initExt25(String value){
     this.initProperty(S_Ext25,value);
  }
  public  void setExt25(String value){
     this.set(S_Ext25,value);
  }
  public  void setExt25Null(){
     this.set(S_Ext25,null);
  }

  public String getExt25(){
       return DataType.getAsString(this.get(S_Ext25));
  
  }
  public String getExt25InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext25));
      }

  public void initExt26(String value){
     this.initProperty(S_Ext26,value);
  }
  public  void setExt26(String value){
     this.set(S_Ext26,value);
  }
  public  void setExt26Null(){
     this.set(S_Ext26,null);
  }

  public String getExt26(){
       return DataType.getAsString(this.get(S_Ext26));
  
  }
  public String getExt26InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext26));
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

  public void initExt23(String value){
     this.initProperty(S_Ext23,value);
  }
  public  void setExt23(String value){
     this.set(S_Ext23,value);
  }
  public  void setExt23Null(){
     this.set(S_Ext23,null);
  }

  public String getExt23(){
       return DataType.getAsString(this.get(S_Ext23));
  
  }
  public String getExt23InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext23));
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

  public void initExt24(String value){
     this.initProperty(S_Ext24,value);
  }
  public  void setExt24(String value){
     this.set(S_Ext24,value);
  }
  public  void setExt24Null(){
     this.set(S_Ext24,null);
  }

  public String getExt24(){
       return DataType.getAsString(this.get(S_Ext24));
  
  }
  public String getExt24InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext24));
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

  public void initExt21(String value){
     this.initProperty(S_Ext21,value);
  }
  public  void setExt21(String value){
     this.set(S_Ext21,value);
  }
  public  void setExt21Null(){
     this.set(S_Ext21,null);
  }

  public String getExt21(){
       return DataType.getAsString(this.get(S_Ext21));
  
  }
  public String getExt21InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext21));
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

  public void initExt22(String value){
     this.initProperty(S_Ext22,value);
  }
  public  void setExt22(String value){
     this.set(S_Ext22,value);
  }
  public  void setExt22Null(){
     this.set(S_Ext22,null);
  }

  public String getExt22(){
       return DataType.getAsString(this.get(S_Ext22));
  
  }
  public String getExt22InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext22));
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

  public void initDeliveryState(String value){
     this.initProperty(S_DeliveryState,value);
  }
  public  void setDeliveryState(String value){
     this.set(S_DeliveryState,value);
  }
  public  void setDeliveryStateNull(){
     this.set(S_DeliveryState,null);
  }

  public String getDeliveryState(){
       return DataType.getAsString(this.get(S_DeliveryState));
  
  }
  public String getDeliveryStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DeliveryState));
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

