package com.asiainfo.crm.so.common.party.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOInsxFamlyPackActiveValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_IccId = "ICC_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_Sts = "STS";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PackType = "PACK_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_Imei = "IMEI";
  public final static  String S_ValidDate = "VALID_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OfferId = "OFFER_ID";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";


public Timestamp getExpireDate();

public String getIccId();

public long getOpId();

public int getSts();

public String getRemarks();

public int getPackType();

public long getOrgId();

public String getRegionId();

public String getImei();

public Timestamp getValidDate();

public String getDoneDate();

public long getOfferId();

public String getBillId();

public Timestamp getCreateDate();

public Timestamp getDoneCode();


public  void setExpireDate(Timestamp value);

public  void setIccId(String value);

public  void setOpId(long value);

public  void setSts(int value);

public  void setRemarks(String value);

public  void setPackType(int value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setImei(String value);

public  void setValidDate(Timestamp value);

public  void setDoneDate(String value);

public  void setOfferId(long value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(Timestamp value);
}
