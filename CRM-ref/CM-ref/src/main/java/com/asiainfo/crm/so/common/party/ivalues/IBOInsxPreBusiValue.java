package com.asiainfo.crm.so.common.party.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOInsxPreBusiValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_BusinessId = "BUSINESS_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_ReserveRegionId = "RESERVE_REGION_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_ReserveId = "RESERVE_ID";
  public final static  String S_ReserveType = "RESERVE_TYPE";
  public final static  String S_Remark = "REMARK";
  public final static  String S_ReserveCountyCode = "RESERVE_COUNTY_CODE";
  public final static  String S_ReserveOrgId = "RESERVE_ORG_ID";
  public final static  String S_LinkPhone = "LINK_PHONE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_BookTime = "BOOK_TIME";
  public final static  String S_ValidDate = "VALID_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ReserveSts = "RESERVE_STS";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";


public Timestamp getExpireDate();

public long getBusinessId();

public long getOpId();

public String getCountyCode();

public String getReserveRegionId();

public long getUserId();

public long getReserveId();

public int getReserveType();

public String getRemark();

public String getReserveCountyCode();

public long getReserveOrgId();

public String getLinkPhone();

public long getOrgId();

public String getRegionId();

public Timestamp getBookTime();

public Timestamp getValidDate();

public Timestamp getDoneDate();

public int getReserveSts();

public String getBillId();

public Timestamp getCreateDate();

public long getDoneCode();


public  void setExpireDate(Timestamp value);

public  void setBusinessId(long value);

public  void setOpId(long value);

public  void setCountyCode(String value);

public  void setReserveRegionId(String value);

public  void setUserId(long value);

public  void setReserveId(long value);

public  void setReserveType(int value);

public  void setRemark(String value);

public  void setReserveCountyCode(String value);

public  void setReserveOrgId(long value);

public  void setLinkPhone(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setBookTime(Timestamp value);

public  void setValidDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setReserveSts(int value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);
}
