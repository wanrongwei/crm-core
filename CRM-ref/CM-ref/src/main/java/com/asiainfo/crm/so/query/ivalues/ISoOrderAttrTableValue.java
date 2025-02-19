package com.asiainfo.crm.so.query.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface ISoOrderAttrTableValue extends DataStructInterface{

  public final static  String S_Index = "INDEX";
  public final static  String S_State = "STATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_Operation = "OPERATION";
  public final static  String S_OrderState = "ORDER_STATE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_Userid = "USERID";
  public final static  String S_Userrole = "USERROLE";
  public final static  String S_ProductItemType = "PRODUCT_ITEM_TYPE";
  public final static  String S_AttrValue = "ATTR_VALUE";
  public final static  String S_ProductItemId = "PRODUCT_ITEM_ID";
  public final static  String S_ProductItemName = "PRODUCT_ITEM_NAME";
  public final static  String S_ParentProductItemId = "PARENT_PRODUCT_ITEM_ID";


public String getIndex();

public String getState();

public String getEffectiveDate();

public String getRemarks();

public String getOperation();

public String getOrderState();

public String getExpireDate();

public String getUserid();

public String getUserrole();

public String getProductItemType();

public String getAttrValue();

public String getProductItemId();

public String getProductItemName();

public String getParentProductItemId();


public  void setIndex(String value);

public  void setState(String value);

public  void setEffectiveDate(String value);

public  void setRemarks(String value);

public  void setOperation(String value);

public  void setOrderState(String value);

public  void setExpireDate(String value);

public  void setUserid(String value);

public  void setUserrole(String value);

public  void setProductItemType(String value);

public  void setAttrValue(String value);

public  void setProductItemId(String value);

public  void setProductItemName(String value);

public  void setParentProductItemId(String value);
}
