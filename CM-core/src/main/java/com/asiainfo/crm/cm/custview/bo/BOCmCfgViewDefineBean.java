package com.asiainfo.crm.cm.custview.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.custview.ivalues.*;

public class BOCmCfgViewDefineBean extends DataContainer implements DataContainerInterface,IBOCmCfgViewDefineValue{

  private static String  m_boName = "com.asiainfo.crm.cm.custview.bo.BOCmCfgViewDefine";



  public final static  String S_State = "STATE";
  public final static  String S_ViewLevel = "VIEW_LEVEL";
  public final static  String S_ViewTitle = "VIEW_TITLE";
  public final static  String S_ViewCode = "VIEW_CODE";
  public final static  String S_ViewId = "VIEW_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ViewType = "VIEW_TYPE";
  public final static  String S_ViewIconUrl = "VIEW_ICON_URL";
  public final static  String S_ViewUrl = "VIEW_URL";
  public final static  String S_BusinessId = "BUSINESS_ID";
  public final static  String S_CustomImplClass = "CUSTOM_IMPL_CLASS";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_IsLeaf = "IS_LEAF";
  public final static  String S_IsCustomImpl = "IS_CUSTOM_IMPL";
  public final static  String S_ViewSortId = "VIEW_SORT_ID";
  public final static  String S_ParentViewId = "PARENT_VIEW_ID";
  public final static  String S_ChannelType = "CHANNEL_TYPE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmCfgViewDefineBean() throws AIException{
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

  public void initViewLevel(int value){
     this.initProperty(S_ViewLevel,new Integer(value));
  }
  public  void setViewLevel(int value){
     this.set(S_ViewLevel,new Integer(value));
  }
  public  void setViewLevelNull(){
     this.set(S_ViewLevel,null);
  }

  public int getViewLevel(){
        return DataType.getAsInt(this.get(S_ViewLevel));
  
  }
  public int getViewLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ViewLevel));
      }

  public void initViewTitle(String value){
     this.initProperty(S_ViewTitle,value);
  }
  public  void setViewTitle(String value){
     this.set(S_ViewTitle,value);
  }
  public  void setViewTitleNull(){
     this.set(S_ViewTitle,null);
  }

  public String getViewTitle(){
       return DataType.getAsString(this.get(S_ViewTitle));
  
  }
  public String getViewTitleInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ViewTitle));
      }

  public void initViewCode(String value){
     this.initProperty(S_ViewCode,value);
  }
  public  void setViewCode(String value){
     this.set(S_ViewCode,value);
  }
  public  void setViewCodeNull(){
     this.set(S_ViewCode,null);
  }

  public String getViewCode(){
       return DataType.getAsString(this.get(S_ViewCode));
  
  }
  public String getViewCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ViewCode));
      }

  public void initViewId(long value){
     this.initProperty(S_ViewId,new Long(value));
  }
  public  void setViewId(long value){
     this.set(S_ViewId,new Long(value));
  }
  public  void setViewIdNull(){
     this.set(S_ViewId,null);
  }

  public long getViewId(){
        return DataType.getAsLong(this.get(S_ViewId));
  
  }
  public long getViewIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ViewId));
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

  public void initViewType(String value){
     this.initProperty(S_ViewType,value);
  }
  public  void setViewType(String value){
     this.set(S_ViewType,value);
  }
  public  void setViewTypeNull(){
     this.set(S_ViewType,null);
  }

  public String getViewType(){
       return DataType.getAsString(this.get(S_ViewType));
  
  }
  public String getViewTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ViewType));
      }

  public void initViewIconUrl(String value){
     this.initProperty(S_ViewIconUrl,value);
  }
  public  void setViewIconUrl(String value){
     this.set(S_ViewIconUrl,value);
  }
  public  void setViewIconUrlNull(){
     this.set(S_ViewIconUrl,null);
  }

  public String getViewIconUrl(){
       return DataType.getAsString(this.get(S_ViewIconUrl));
  
  }
  public String getViewIconUrlInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ViewIconUrl));
      }

  public void initViewUrl(String value){
     this.initProperty(S_ViewUrl,value);
  }
  public  void setViewUrl(String value){
     this.set(S_ViewUrl,value);
  }
  public  void setViewUrlNull(){
     this.set(S_ViewUrl,null);
  }

  public String getViewUrl(){
       return DataType.getAsString(this.get(S_ViewUrl));
  
  }
  public String getViewUrlInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ViewUrl));
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

  public void initCustomImplClass(String value){
     this.initProperty(S_CustomImplClass,value);
  }
  public  void setCustomImplClass(String value){
     this.set(S_CustomImplClass,value);
  }
  public  void setCustomImplClassNull(){
     this.set(S_CustomImplClass,null);
  }

  public String getCustomImplClass(){
       return DataType.getAsString(this.get(S_CustomImplClass));
  
  }
  public String getCustomImplClassInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustomImplClass));
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

  public void initIsLeaf(int value){
     this.initProperty(S_IsLeaf,new Integer(value));
  }
  public  void setIsLeaf(int value){
     this.set(S_IsLeaf,new Integer(value));
  }
  public  void setIsLeafNull(){
     this.set(S_IsLeaf,null);
  }

  public int getIsLeaf(){
        return DataType.getAsInt(this.get(S_IsLeaf));
  
  }
  public int getIsLeafInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsLeaf));
      }

  public void initIsCustomImpl(int value){
     this.initProperty(S_IsCustomImpl,new Integer(value));
  }
  public  void setIsCustomImpl(int value){
     this.set(S_IsCustomImpl,new Integer(value));
  }
  public  void setIsCustomImplNull(){
     this.set(S_IsCustomImpl,null);
  }

  public int getIsCustomImpl(){
        return DataType.getAsInt(this.get(S_IsCustomImpl));
  
  }
  public int getIsCustomImplInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsCustomImpl));
      }

  public void initViewSortId(int value){
     this.initProperty(S_ViewSortId,new Integer(value));
  }
  public  void setViewSortId(int value){
     this.set(S_ViewSortId,new Integer(value));
  }
  public  void setViewSortIdNull(){
     this.set(S_ViewSortId,null);
  }

  public int getViewSortId(){
        return DataType.getAsInt(this.get(S_ViewSortId));
  
  }
  public int getViewSortIdInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ViewSortId));
      }

  public void initParentViewId(long value){
     this.initProperty(S_ParentViewId,new Long(value));
  }
  public  void setParentViewId(long value){
     this.set(S_ParentViewId,new Long(value));
  }
  public  void setParentViewIdNull(){
     this.set(S_ParentViewId,null);
  }

  public long getParentViewId(){
        return DataType.getAsLong(this.get(S_ParentViewId));
  
  }
  public long getParentViewIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ParentViewId));
      }

  public void initChannelType(int value){
     this.initProperty(S_ChannelType,new Integer(value));
  }
  public  void setChannelType(int value){
     this.set(S_ChannelType,new Integer(value));
  }
  public  void setChannelTypeNull(){
     this.set(S_ChannelType,null);
  }

  public int getChannelType(){
        return DataType.getAsInt(this.get(S_ChannelType));
  
  }
  public int getChannelTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ChannelType));
      }


 
 }

