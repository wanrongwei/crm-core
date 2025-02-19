package com.asiainfo.crm.so.common.bboss.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOInsxVpnGroupRelValue extends DataStructInterface{

	  public final static  String S_IsMainGroup = "IS_MAIN_GROUP";
	  public final static  String S_OpId = "OP_ID";
	  public final static  String S_State = "STATE";
	  public final static  String S_UserId = "USER_ID";
	  public final static  String S_OrgId = "ORG_ID";
	  public final static  String S_RegionId = "REGION_ID";
	  public final static  String S_RelId = "REL_ID";
	  public final static  String S_MainUserId = "MAIN_USER_ID";
	  public final static  String S_CustId = "CUST_ID";
	  public final static  String S_OfferId = "OFFER_ID";
	  public final static  String S_VpnName = "VPN_NAME";
	  public final static  String S_CreateDate = "CREATE_DATE";
	  public final static  String S_OfferInstId = "OFFER_INST_ID";
	  public final static  String S_MigratePlatformStatus = "MIGRATE_PLATFORM_STATUS";



	public long getIsMainGroup();

	public long getOpId();

	public long getState();

	public long getUserId();

	public long getOrgId();

	public String getRegionId();

	public long getRelId();

	public long getMainUserId();

	public long getCustId();

	public long getOfferId();

	public String getVpnName();

	public Timestamp getCreateDate();

	public long getOfferInstId();

	public String getMigratePlatformStatus();


	public  void setIsMainGroup(long value);

	public  void setOpId(long value);

	public  void setState(long value);

	public  void setUserId(long value);

	public  void setOrgId(long value);

	public  void setRegionId(String value);

	public  void setRelId(long value);

	public  void setMainUserId(long value);

	public  void setCustId(long value);

	public  void setOfferId(long value);

	public  void setVpnName(String value);

	public  void setCreateDate(Timestamp value);

	public  void setOfferInstId(long value);

	public void setMigratePlatformStatus(String value);
}
