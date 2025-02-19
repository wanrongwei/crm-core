package com.asiainfo.crm.so.common.party.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOINSBillCustomerValue extends DataStructInterface{


	  public final static  String S_ExpireDate = "EXPIRE_DATE";
	  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
	  public final static  String S_OpId = "OP_ID";
	  public final static  String S_State = "STATE";
	  public final static  String S_UserId = "USER_ID";
	  public final static  String S_Remarks = "REMARKS";
	  public final static  String S_UserRegionId = "USER_REGION_ID";
	  public final static  String S_OrgId = "ORG_ID";
	  public final static  String S_Ext1 = "EXT_1";
	  public final static  String S_InsId = "INS_ID";
	  public final static  String S_CustId = "CUST_ID";
	  public final static  String S_DoneDate = "DONE_DATE";
	  public final static  String S_BillId = "BILL_ID";
	  public final static  String S_CreateDate = "CREATE_DATE";
	  public final static  String S_DoneCode = "DONE_CODE";


	public Timestamp getExpireDate();

	public Timestamp getEffectiveDate();

	public long getOpId();

	public String getState();

	public long getUserId();

	public String getRemarks();

	public String getUserRegionId();

	public long getOrgId();

	public String getExt1();

	public long getInsId();

	public long getCustId();

	public Timestamp getDoneDate();

	public String getBillId();

	public Timestamp getCreateDate();

	public long getDoneCode();


	public  void setExpireDate(Timestamp value);

	public  void setEffectiveDate(Timestamp value);

	public  void setOpId(long value);

	public  void setState(String value);

	public  void setUserId(long value);

	public  void setRemarks(String value);

	public  void setUserRegionId(String value);

	public  void setOrgId(long value);

	public  void setExt1(String value);

	public  void setInsId(long value);

	public  void setCustId(long value);

	public  void setDoneDate(Timestamp value);

	public  void setBillId(String value);

	public  void setCreateDate(Timestamp value);

	public  void setDoneCode(long value);
	}
