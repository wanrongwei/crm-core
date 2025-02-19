package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class QBOCmGroupAccountBean extends DataContainer implements DataContainerInterface,IQBOCmGroupAccountValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.QBOCmGroupAccount";



  public final static  String S_ChnlCityId = "CHNL_CITY_ID";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_ContName = "CONT_NAME";
  public final static  String S_AccAliasName = "ACC_ALIAS_NAME";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_ChnlRegionType = "CHNL_REGION_TYPE";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_BaseCustId = "BASE_CUST_ID";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_ChnlRegionDetail = "CHNL_REGION_DETAIL";
  public final static  String S_ContCertCode = "CONT_CERT_CODE";
  public final static  String S_ContCertType = "CONT_CERT_TYPE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmGroupAccountBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initBaseCustId(long value){
     this.initProperty(S_BaseCustId,new Long(value));
  }
  public  void setBaseCustId(long value){
     this.set(S_BaseCustId,new Long(value));
  }
  public  void setBaseCustIdNull(){
     this.set(S_BaseCustId,null);
  }

  public long getBaseCustId(){
        return DataType.getAsLong(this.get(S_BaseCustId));
  
  }
  public long getBaseCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BaseCustId));
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

  public void initContCertType(long value){
     this.initProperty(S_ContCertType,new Long(value));
  }
  public  void setContCertType(long value){
     this.set(S_ContCertType,new Long(value));
  }
  public  void setContCertTypeNull(){
     this.set(S_ContCertType,null);
  }

  public long getContCertType(){
        return DataType.getAsLong(this.get(S_ContCertType));
  
  }
  public long getContCertTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ContCertType));
      }


 
 }

