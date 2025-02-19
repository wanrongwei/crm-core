package com.asiainfo.crm.cm.custview.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.custview.ivalues.*;

public class QBOCmOperViewDefineBean extends DataContainer implements DataContainerInterface,IQBOCmOperViewDefineValue{

  private static String  m_boName = "com.asiainfo.crm.cm.custview.bo.QBOCmOperViewDefine";



  public final static  String S_ViewLevel = "VIEW_LEVEL";
  public final static  String S_ViewTitle = "VIEW_TITLE";
  public final static  String S_ViewState = "VIEW_STATE";
  public final static  String S_ViewRelId = "VIEW_REL_ID";
  public final static  String S_ViewCode = "VIEW_CODE";
  public final static  String S_ViewRemarks = "VIEW_REMARKS";
  public final static  String S_ViewId = "VIEW_ID";
  public final static  String S_ViewType = "VIEW_TYPE";
  public final static  String S_ViewIconUrl = "VIEW_ICON_URL";
  public final static  String S_ViewUrl = "VIEW_URL";
  public final static  String S_BusinessId = "BUSINESS_ID";
  public final static  String S_CustomImplClass = "CUSTOM_IMPL_CLASS";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_IsLeaf = "IS_LEAF";
  public final static  String S_IsCustomImpl = "IS_CUSTOM_IMPL";
  public final static  String S_ViewSortId = "VIEW_SORT_ID";
  public final static  String S_OperId = "OPER_ID";
  public final static  String S_RelState = "REL_STATE";
  public final static  String S_RelRemarks = "REL_REMARKS";
  public final static  String S_ParentViewId = "PARENT_VIEW_ID";
  public final static  String S_ChannelType = "CHANNEL_TYPE";
  public final static  String S_Sort = "SORT";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmOperViewDefineBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initViewState(String value){
     this.initProperty(S_ViewState,value);
  }
  public  void setViewState(String value){
     this.set(S_ViewState,value);
  }
  public  void setViewStateNull(){
     this.set(S_ViewState,null);
  }

  public String getViewState(){
       return DataType.getAsString(this.get(S_ViewState));
  
  }
  public String getViewStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ViewState));
      }

  public void initViewRelId(long value){
     this.initProperty(S_ViewRelId,new Long(value));
  }
  public  void setViewRelId(long value){
     this.set(S_ViewRelId,new Long(value));
  }
  public  void setViewRelIdNull(){
     this.set(S_ViewRelId,null);
  }

  public long getViewRelId(){
        return DataType.getAsLong(this.get(S_ViewRelId));
  
  }
  public long getViewRelIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ViewRelId));
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

  public void initViewRemarks(String value){
     this.initProperty(S_ViewRemarks,value);
  }
  public  void setViewRemarks(String value){
     this.set(S_ViewRemarks,value);
  }
  public  void setViewRemarksNull(){
     this.set(S_ViewRemarks,null);
  }

  public String getViewRemarks(){
       return DataType.getAsString(this.get(S_ViewRemarks));
  
  }
  public String getViewRemarksInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ViewRemarks));
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

  public void initOperId(long value){
     this.initProperty(S_OperId,new Long(value));
  }
  public  void setOperId(long value){
     this.set(S_OperId,new Long(value));
  }
  public  void setOperIdNull(){
     this.set(S_OperId,null);
  }

  public long getOperId(){
        return DataType.getAsLong(this.get(S_OperId));
  
  }
  public long getOperIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OperId));
      }

  public void initRelState(String value){
     this.initProperty(S_RelState,value);
  }
  public  void setRelState(String value){
     this.set(S_RelState,value);
  }
  public  void setRelStateNull(){
     this.set(S_RelState,null);
  }

  public String getRelState(){
       return DataType.getAsString(this.get(S_RelState));
  
  }
  public String getRelStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RelState));
      }

  public void initRelRemarks(String value){
     this.initProperty(S_RelRemarks,value);
  }
  public  void setRelRemarks(String value){
     this.set(S_RelRemarks,value);
  }
  public  void setRelRemarksNull(){
     this.set(S_RelRemarks,null);
  }

  public String getRelRemarks(){
       return DataType.getAsString(this.get(S_RelRemarks));
  
  }
  public String getRelRemarksInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RelRemarks));
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

  public void initSort(long value){
     this.initProperty(S_Sort,new Long(value));
  }
  public  void setSort(long value){
     this.set(S_Sort,new Long(value));
  }
  public  void setSortNull(){
     this.set(S_Sort,null);
  }

  public long getSort(){
        return DataType.getAsLong(this.get(S_Sort));
  
  }
  public long getSortInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Sort));
      }


 
 }

