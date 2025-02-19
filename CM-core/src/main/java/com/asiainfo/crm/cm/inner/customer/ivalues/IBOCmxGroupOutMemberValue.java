package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxGroupOutMemberValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_Name = "NAME";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_SpType = "SP_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OutMemberId = "OUT_MEMBER_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_Gender = "GENDER";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_Ext4 = "EXT4";


public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getState();

public String getName();

public String getRemarks();

public int getSpType();

public long getOrgId();

public String getRegionId();

public long getOutMemberId();

public long getCreateOrgId();

public long getCustId();

public int getGender();

public long getCreateOpId();

public Timestamp getDoneDate();

public String getBillId();

public Timestamp getCreateDate();

public long getDoneCode();

public String getExt1();

public String getExt2();

public long getExt3();

public long getExt4();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setName(String value);

public  void setRemarks(String value);

public  void setSpType(int value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setOutMemberId(long value);

public  void setCreateOrgId(long value);

public  void setCustId(long value);

public  void setGender(int value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setExt3(long value);

public  void setExt4(long value);
}
