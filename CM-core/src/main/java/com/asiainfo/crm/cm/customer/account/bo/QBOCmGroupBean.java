package com.asiainfo.crm.cm.customer.account.bo;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.ServiceManager;
import com.asiainfo.crm.cm.customer.account.ivalues.IQBOCmGroupValue;

public class QBOCmGroupBean extends DataContainer implements DataContainerInterface,IQBOCmGroupValue{

  private static String  m_boName = "com.asiainfo.crm.customer.account.bo.QBOCmGroup";



  public final static  String S_ChnlRegionType = "CHNL_REGION_TYPE";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_ChnlCityId = "CHNL_CITY_ID";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_AcctType = "ACCT_TYPE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmGroupBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initAcctType(long value){
     this.initProperty(S_AcctType,new Long(value));
  }
  public  void setAcctType(long value){
     this.set(S_AcctType,new Long(value));
  }
  public  void setAcctTypeNull(){
     this.set(S_AcctType,null);
  }

  public long getAcctType(){
        return DataType.getAsLong(this.get(S_AcctType));
  
  }
  public long getAcctTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AcctType));
      }


 
 }

