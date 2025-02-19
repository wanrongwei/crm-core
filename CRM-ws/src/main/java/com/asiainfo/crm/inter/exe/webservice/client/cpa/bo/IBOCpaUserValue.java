package com.asiainfo.crm.inter.exe.webservice.client.cpa.bo;
import java.sql.Timestamp;

import com.ai.appframe2.common.DataStructInterface;
public interface IBOCpaUserValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_CustomerSegment = "CUSTOMER_SEGMENT";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_SubscriberCompany = "SUBSCRIBER_COMPANY";
  public final static  String S_StateDate = "STATE_DATE";
  public final static  String S_CustomerId = "CUSTOMER_ID";
  public final static  String S_DmlAction = "DML_ACTION";
  public final static  String S_EquipmentNo = "EQUIPMENT_NO";
  public final static  String S_FirstBillDate = "FIRST_BILL_DATE";
  public final static  String S_Ban = "BAN";
  public final static  String S_SubscriberId = "SUBSCRIBER_ID";
  public final static  String S_CycleUnit = "CYCLE_UNIT";
  public final static  String S_Products = "PRODUCTS";
  public final static  String S_CpaUserSeq = "CPA_USER_SEQ";
  public final static  String S_Imsi = "IMSI";
  public final static  String S_SubStatus = "SUB_STATUS";
  public final static  String S_TenantId = "TENANT_ID";
  public final static  String S_MvnoBrand = "MVNO_BRAND";
  public final static  String S_CycleType = "CYCLE_TYPE";
  public final static  String S_Ext5 = "EXT5";
  public final static  String S_OriginalInitDate = "ORIGINAL_INIT_DATE";
  public final static  String S_TestSimFlag = "TEST_SIM_FLAG";
  public final static  String S_SubcriberNo = "SUBCRIBER_NO";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_SuspensionReasonCode = "SUSPENSION_REASON_CODE";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_Ext4 = "EXT4";


public String getState();

public String getCustomerSegment();

public String getRemarks();

public String getSubscriberCompany();

public Timestamp getStateDate();

public String getCustomerId();

public String getDmlAction();

public String getEquipmentNo();

public String getFirstBillDate();

public String getBan();

public String getSubscriberId();

public String getCycleUnit();

public String getProducts();

public long getCpaUserSeq();

public String getImsi();

public String getSubStatus();

public String getTenantId();

public String getMvnoBrand();

public String getCycleType();

public String getExt5();

public Timestamp getOriginalInitDate();

public String getTestSimFlag();

public String getSubcriberNo();

public Timestamp getCreateDate();

public String getSuspensionReasonCode();

public String getExt1();

public String getExt2();

public String getExt3();

public String getExt4();


public  void setState(String value);

public  void setCustomerSegment(String value);

public  void setRemarks(String value);

public  void setSubscriberCompany(String value);

public  void setStateDate(Timestamp value);

public  void setCustomerId(String value);

public  void setDmlAction(String value);

public  void setEquipmentNo(String value);

public  void setFirstBillDate(String value);

public  void setBan(String value);

public  void setSubscriberId(String value);

public  void setCycleUnit(String value);

public  void setProducts(String value);

public  void setCpaUserSeq(long value);

public  void setImsi(String value);

public  void setSubStatus(String value);

public  void setTenantId(String value);

public  void setMvnoBrand(String value);

public  void setCycleType(String value);

public  void setExt5(String value);

public  void setOriginalInitDate(Timestamp value);

public  void setTestSimFlag(String value);

public  void setSubcriberNo(String value);

public  void setCreateDate(Timestamp value);

public  void setSuspensionReasonCode(String value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setExt3(String value);

public  void setExt4(String value);
}
