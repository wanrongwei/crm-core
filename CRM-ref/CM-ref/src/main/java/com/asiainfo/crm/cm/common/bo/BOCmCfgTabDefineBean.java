package com.asiainfo.crm.cm.common.bo;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.*;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgTabDefineValue;

public class BOCmCfgTabDefineBean extends DataContainer implements DataContainerInterface,IBOCmCfgTabDefineValue{

  private static String  m_boName = "com.asiainfo.crm.customer.common.bo.BOCmCfgTabDefine";



  public final static  String S_State = "STATE";
  public final static  String S_TabTitle = "TAB_TITLE";
  public final static  String S_TabUrl = "TAB_URL";
  public final static  String S_TabType = "TAB_TYPE";
  public final static  String S_TabId = "TAB_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_BusinessId = "BUSINESS_ID";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_TabCode = "TAB_CODE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmCfgTabDefineBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
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

  public void initTabTitle(String value){
     this.initProperty(S_TabTitle,value);
  }
  public  void setTabTitle(String value){
     this.set(S_TabTitle,value);
  }
  public  void setTabTitleNull(){
     this.set(S_TabTitle,null);
  }

  public String getTabTitle(){
       return DataType.getAsString(this.get(S_TabTitle));
  
  }
  public String getTabTitleInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TabTitle));
      }

  public void initTabUrl(String value){
     this.initProperty(S_TabUrl,value);
  }
  public  void setTabUrl(String value){
     this.set(S_TabUrl,value);
  }
  public  void setTabUrlNull(){
     this.set(S_TabUrl,null);
  }

  public String getTabUrl(){
       return DataType.getAsString(this.get(S_TabUrl));
  
  }
  public String getTabUrlInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TabUrl));
      }

  public void initTabType(String value){
     this.initProperty(S_TabType,value);
  }
  public  void setTabType(String value){
     this.set(S_TabType,value);
  }
  public  void setTabTypeNull(){
     this.set(S_TabType,null);
  }

  public String getTabType(){
       return DataType.getAsString(this.get(S_TabType));
  
  }
  public String getTabTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TabType));
      }

  public void initTabId(long value){
     this.initProperty(S_TabId,new Long(value));
  }
  public  void setTabId(long value){
     this.set(S_TabId,new Long(value));
  }
  public  void setTabIdNull(){
     this.set(S_TabId,null);
  }

  public long getTabId(){
        return DataType.getAsLong(this.get(S_TabId));
  
  }
  public long getTabIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_TabId));
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

  public void initBusinessId(long value){
     this.initProperty(S_BusinessId,new Long(value));
  }
  public  void setBusinessId(long value){
     this.set(S_BusinessId,new Long(value));
  }
  public  void setBusinessIdNull(){
     this.set(S_BusinessId,null);
  }

  public long getBusinessId(){
        return DataType.getAsLong(this.get(S_BusinessId));
  
  }
  public long getBusinessIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BusinessId));
      }

  public void initCustType(int value){
     this.initProperty(S_CustType,new Integer(value));
  }
  public  void setCustType(int value){
     this.set(S_CustType,new Integer(value));
  }
  public  void setCustTypeNull(){
     this.set(S_CustType,null);
  }

  public int getCustType(){
        return DataType.getAsInt(this.get(S_CustType));
  
  }
  public int getCustTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CustType));
      }

  public void initTabCode(String value){
     this.initProperty(S_TabCode,value);
  }
  public  void setTabCode(String value){
     this.set(S_TabCode,value);
  }
  public  void setTabCodeNull(){
     this.set(S_TabCode,null);
  }

  public String getTabCode(){
       return DataType.getAsString(this.get(S_TabCode));
  
  }
  public String getTabCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TabCode));
      }


 
 }

