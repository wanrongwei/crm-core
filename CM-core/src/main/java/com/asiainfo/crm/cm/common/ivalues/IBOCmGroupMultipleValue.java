package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupMultipleValue extends DataStructInterface{

  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_Location = "LOCATION";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_LocationDetail = "LOCATION_DETAIL";
  public final static  String S_TradeType = "TRADE_TYPE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_LinkPhone = "LINK_PHONE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_GroupMtpId = "GROUP_MTP_ID";
  public final static  String S_LinkName = "LINK_NAME";
  public final static  String S_PostCode = "POST_CODE";
  public final static  String S_GroupMtpName = "GROUP_MTP_NAME";


public long getCreateOpId();

public Timestamp getEffectiveDate();

public Timestamp getDoneDate();

public String getRemarks();

public long getOrgId();

public long getLocation();

public Timestamp getCreateDate();

public long getDoneCode();

public String getLocationDetail();

public String getTradeType();

public String getRegionId();

public long getOpId();

public Timestamp getExpireDate();

public String getLinkPhone();

public long getCreateOrgId();

public String getGroupMtpId();

public String getLinkName();

public long getPostCode();

public String getGroupMtpName();


public  void setCreateOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setRemarks(String value);

public  void setOrgId(long value);

public  void setLocation(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setLocationDetail(String value);

public  void setTradeType(String value);

public  void setRegionId(String value);

public  void setOpId(long value);

public  void setExpireDate(Timestamp value);

public  void setLinkPhone(String value);

public  void setCreateOrgId(long value);

public  void setGroupMtpId(String value);

public  void setLinkName(String value);

public  void setPostCode(long value);

public  void setGroupMtpName(String value);
}
