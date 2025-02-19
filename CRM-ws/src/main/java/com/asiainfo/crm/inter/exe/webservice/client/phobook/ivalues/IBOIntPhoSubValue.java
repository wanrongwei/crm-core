package com.asiainfo.crm.inter.exe.webservice.client.phobook.ivalues;

import java.sql.Timestamp;

import com.ai.appframe2.common.DataStructInterface;

public interface IBOIntPhoSubValue extends DataStructInterface {

	public final static String USED = "1";
	public final static String DELETE = "0";

	public final static String S_TelephoSpecUsageCode = "TELEPHO_SPEC_USAGE_CODE";
	public final static String S_AddressId = "ADDRESS_ID";
	public final static String S_TelephoSubProtectCode = "TELEPHO_SUB_PROTECT_CODE";
	public final static String S_TelephoSerTypeCode = "TELEPHO_SER_TYPE_CODE";
	public final static String S_SurnameName = "SURNAME_NAME";
	public final static String S_AnonymousPrepInd = "ANONYMOUS_PREP_IND";
	public final static String S_EmployPositionName = "EMPLOY_POSITION_NAME";
	public final static String S_Status = "STATUS";
	public final static String S_OrgnizationName = "ORGNIZATION_NAME";
	public final static String S_GivenName = "GIVEN_NAME";
	public final static String S_TelephoSub = "TELEPHO_SUB";
	public final static String S_CustId = "CUST_ID";
	public final static String S_MiddleName = "MIDDLE_NAME";
	public final static String S_DanishTelephoNumId = "DANISH_TELEPHO_NUM_ID";
	public final static String S_Ext5 = "EXT5";
	public final static String S_CreateDate = "CREATE_DATE";
	public final static String S_Ext1 = "EXT1";
	public final static String S_OtherAddressId = "OTHER_ADDRESS_ID";
	public final static String S_Ext2 = "EXT2";
	public final static String S_Ext3 = "EXT3";
	public final static String S_SubId = "SUB_ID";
	public final static String S_Ext4 = "EXT4";

	public String getTelephoSpecUsageCode();

	public long getAddressId();

	public String getTelephoSubProtectCode();

	public String getTelephoSerTypeCode();

	public String getSurnameName();

	public String getAnonymousPrepInd();

	public String getEmployPositionName();

	public String getStatus();

	public String getOrgnizationName();

	public String getGivenName();

	public String getTelephoSub();

	public long getCustId();

	public String getMiddleName();

	public String getDanishTelephoNumId();

	public String getExt5();

	public Timestamp getCreateDate();

	public String getExt1();

	public long getOtherAddressId();

	public String getExt2();

	public String getExt3();

	public long getSubId();

	public String getExt4();

	public void setTelephoSpecUsageCode(String value);

	public void setAddressId(long value);

	public void setTelephoSubProtectCode(String value);

	public void setTelephoSerTypeCode(String value);

	public void setSurnameName(String value);

	public void setAnonymousPrepInd(String value);

	public void setEmployPositionName(String value);

	public void setStatus(String value);

	public void setOrgnizationName(String value);

	public void setGivenName(String value);

	public void setTelephoSub(String value);

	public void setCustId(long value);

	public void setMiddleName(String value);

	public void setDanishTelephoNumId(String value);

	public void setExt5(String value);

	public void setCreateDate(Timestamp value);

	public void setExt1(String value);

	public void setOtherAddressId(long value);

	public void setExt2(String value);

	public void setExt3(String value);

	public void setSubId(long value);

	public void setExt4(String value);
}
