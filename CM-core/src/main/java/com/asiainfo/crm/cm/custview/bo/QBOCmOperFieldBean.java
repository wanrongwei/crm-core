package com.asiainfo.crm.cm.custview.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.custview.ivalues.*;

public class QBOCmOperFieldBean extends DataContainer implements DataContainerInterface,IQBOCmOperFieldValue{

  private static String  m_boName = "com.asiainfo.crm.cm.custview.bo.QBOCmOperField";



  public final static  String S_ViewTitle = "VIEW_TITLE";
  public final static  String S_ViewState = "VIEW_STATE";
  public final static  String S_ViewCode = "VIEW_CODE";
  public final static  String S_FieldState = "FIELD_STATE";
  public final static  String S_BceFrameId = "BCE_FRAME_ID";
  public final static  String S_ViewRemarks = "VIEW_REMARKS";
  public final static  String S_FieldRelId = "FIELD_REL_ID";
  public final static  String S_ViewId = "VIEW_ID";
  public final static  String S_BceFormId = "BCE_FORM_ID";
  public final static  String S_ViewType = "VIEW_TYPE";
  public final static  String S_ViewUrl = "VIEW_URL";
  public final static  String S_BusinessId = "BUSINESS_ID";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_FieldName = "FIELD_NAME";
  public final static  String S_FieldRemarks = "FIELD_REMARKS";
  public final static  String S_OperId = "OPER_ID";
  public final static  String S_Sort = "SORT";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmOperFieldBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initFieldState(String value){
     this.initProperty(S_FieldState,value);
  }
  public  void setFieldState(String value){
     this.set(S_FieldState,value);
  }
  public  void setFieldStateNull(){
     this.set(S_FieldState,null);
  }

  public String getFieldState(){
       return DataType.getAsString(this.get(S_FieldState));
  
  }
  public String getFieldStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FieldState));
      }

  public void initBceFrameId(long value){
     this.initProperty(S_BceFrameId,new Long(value));
  }
  public  void setBceFrameId(long value){
     this.set(S_BceFrameId,new Long(value));
  }
  public  void setBceFrameIdNull(){
     this.set(S_BceFrameId,null);
  }

  public long getBceFrameId(){
        return DataType.getAsLong(this.get(S_BceFrameId));
  
  }
  public long getBceFrameIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BceFrameId));
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

  public void initFieldRelId(long value){
     this.initProperty(S_FieldRelId,new Long(value));
  }
  public  void setFieldRelId(long value){
     this.set(S_FieldRelId,new Long(value));
  }
  public  void setFieldRelIdNull(){
     this.set(S_FieldRelId,null);
  }

  public long getFieldRelId(){
        return DataType.getAsLong(this.get(S_FieldRelId));
  
  }
  public long getFieldRelIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_FieldRelId));
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

  public void initBceFormId(String value){
     this.initProperty(S_BceFormId,value);
  }
  public  void setBceFormId(String value){
     this.set(S_BceFormId,value);
  }
  public  void setBceFormIdNull(){
     this.set(S_BceFormId,null);
  }

  public String getBceFormId(){
       return DataType.getAsString(this.get(S_BceFormId));
  
  }
  public String getBceFormIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BceFormId));
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

  public void initFieldName(String value){
     this.initProperty(S_FieldName,value);
  }
  public  void setFieldName(String value){
     this.set(S_FieldName,value);
  }
  public  void setFieldNameNull(){
     this.set(S_FieldName,null);
  }

  public String getFieldName(){
       return DataType.getAsString(this.get(S_FieldName));
  
  }
  public String getFieldNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FieldName));
      }

  public void initFieldRemarks(String value){
     this.initProperty(S_FieldRemarks,value);
  }
  public  void setFieldRemarks(String value){
     this.set(S_FieldRemarks,value);
  }
  public  void setFieldRemarksNull(){
     this.set(S_FieldRemarks,null);
  }

  public String getFieldRemarks(){
       return DataType.getAsString(this.get(S_FieldRemarks));
  
  }
  public String getFieldRemarksInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FieldRemarks));
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

  public void initSort(int value){
     this.initProperty(S_Sort,new Integer(value));
  }
  public  void setSort(int value){
     this.set(S_Sort,new Integer(value));
  }
  public  void setSortNull(){
     this.set(S_Sort,null);
  }

  public int getSort(){
        return DataType.getAsInt(this.get(S_Sort));
  
  }
  public int getSortInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Sort));
      }


 
 }

