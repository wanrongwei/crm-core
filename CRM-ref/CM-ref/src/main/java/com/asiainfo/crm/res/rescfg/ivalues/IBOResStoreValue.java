package com.asiainfo.crm.res.rescfg.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOResStoreValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_Creater = "CREATER";
  public final static  String S_AttachType = "ATTACH_TYPE";
  public final static  String S_UseType = "USE_TYPE";
  public final static  String S_ReceiverPhone = "RECEIVER_PHONE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_ResStoreCode = "RES_STORE_CODE";
  public final static  String S_WearhouseType = "WEARHOUSE_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ResStoreDesc = "RES_STORE_DESC";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ChannelId = "CHANNEL_ID";
  public final static  String S_ResStoreName = "RES_STORE_NAME";
  public final static  String S_BusiType = "BUSI_TYPE";
  public final static  String S_ResStoreTypeId = "RES_STORE_TYPE_ID";
  public final static  String S_ParentStoreId = "PARENT_STORE_ID";
  public final static  String S_ResStoreId = "RES_STORE_ID";
  public final static  String S_Receiver = "RECEIVER";
  public final static  String S_ResStoreTypeName = "RES_STORE_TYPE_NAME";


public String getState();

public long getCreater();

public String getAttachType();

public String getUseType();

public String getReceiverPhone();

public long getOrgId();

public String getResStoreCode();

public String getWearhouseType();

public Timestamp getCreateDate();

public String getResStoreDesc();

public String getCountyId();

public String getRegionId();

public long getChannelId();

public String getResStoreName();

public String getBusiType();

public String getResStoreTypeId();

public long getParentStoreId();

public long getResStoreId();

public long getReceiver();

public String getResStoreTypeName();


public  void setState(String value);

public  void setCreater(long value);

public  void setAttachType(String value);

public  void setUseType(String value);

public  void setReceiverPhone(String value);

public  void setOrgId(long value);

public  void setResStoreCode(String value);

public  void setWearhouseType(String value);

public  void setCreateDate(Timestamp value);

public  void setResStoreDesc(String value);

public  void setCountyId(String value);

public  void setRegionId(String value);

public  void setChannelId(long value);

public  void setResStoreName(String value);

public  void setBusiType(String value);

public  void setResStoreTypeId(String value);

public  void setParentStoreId(long value);

public  void setResStoreId(long value);

public  void setReceiver(long value);

public  void setResStoreTypeName(String value);
}
