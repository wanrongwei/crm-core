package com.asiainfo.crm.cm.custview.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmOperFieldValue extends DataStructInterface{

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


public String getViewTitle();

public String getViewState();

public String getViewCode();

public String getFieldState();

public long getBceFrameId();

public String getViewRemarks();

public long getFieldRelId();

public long getViewId();

public String getBceFormId();

public String getViewType();

public String getViewUrl();

public long getBusinessId();

public int getCustType();

public String getFieldName();

public String getFieldRemarks();

public long getOperId();

public int getSort();


public  void setViewTitle(String value);

public  void setViewState(String value);

public  void setViewCode(String value);

public  void setFieldState(String value);

public  void setBceFrameId(long value);

public  void setViewRemarks(String value);

public  void setFieldRelId(long value);

public  void setViewId(long value);

public  void setBceFormId(String value);

public  void setViewType(String value);

public  void setViewUrl(String value);

public  void setBusinessId(long value);

public  void setCustType(int value);

public  void setFieldName(String value);

public  void setFieldRemarks(String value);

public  void setOperId(long value);

public  void setSort(int value);
}
