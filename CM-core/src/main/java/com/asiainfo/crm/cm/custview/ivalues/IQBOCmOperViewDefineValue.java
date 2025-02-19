package com.asiainfo.crm.cm.custview.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmOperViewDefineValue extends DataStructInterface{

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


public int getViewLevel();

public String getViewTitle();

public String getViewState();

public long getViewRelId();

public String getViewCode();

public String getViewRemarks();

public long getViewId();

public String getViewType();

public String getViewIconUrl();

public String getViewUrl();

public long getBusinessId();

public String getCustomImplClass();

public int getCustType();

public int getIsLeaf();

public int getIsCustomImpl();

public int getViewSortId();

public long getOperId();

public String getRelState();

public String getRelRemarks();

public long getParentViewId();

public int getChannelType();

public long getSort();


public  void setViewLevel(int value);

public  void setViewTitle(String value);

public  void setViewState(String value);

public  void setViewRelId(long value);

public  void setViewCode(String value);

public  void setViewRemarks(String value);

public  void setViewId(long value);

public  void setViewType(String value);

public  void setViewIconUrl(String value);

public  void setViewUrl(String value);

public  void setBusinessId(long value);

public  void setCustomImplClass(String value);

public  void setCustType(int value);

public  void setIsLeaf(int value);

public  void setIsCustomImpl(int value);

public  void setViewSortId(int value);

public  void setOperId(long value);

public  void setRelState(String value);

public  void setRelRemarks(String value);

public  void setParentViewId(long value);

public  void setChannelType(int value);

public  void setSort(long value);
}
