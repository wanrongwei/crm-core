package com.asiainfo.crm.cm.custview.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCfgViewDefineValue extends DataStructInterface{

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


public String getState();

public int getViewLevel();

public String getViewTitle();

public String getViewCode();

public long getViewId();

public String getRemarks();

public String getViewType();

public String getViewIconUrl();

public String getViewUrl();

public long getBusinessId();

public String getCustomImplClass();

public int getCustType();

public int getIsLeaf();

public int getIsCustomImpl();

public int getViewSortId();

public long getParentViewId();

public int getChannelType();


public  void setState(String value);

public  void setViewLevel(int value);

public  void setViewTitle(String value);

public  void setViewCode(String value);

public  void setViewId(long value);

public  void setRemarks(String value);

public  void setViewType(String value);

public  void setViewIconUrl(String value);

public  void setViewUrl(String value);

public  void setBusinessId(long value);

public  void setCustomImplClass(String value);

public  void setCustType(int value);

public  void setIsLeaf(int value);

public  void setIsCustomImpl(int value);

public  void setViewSortId(int value);

public  void setParentViewId(long value);

public  void setChannelType(int value);
}
