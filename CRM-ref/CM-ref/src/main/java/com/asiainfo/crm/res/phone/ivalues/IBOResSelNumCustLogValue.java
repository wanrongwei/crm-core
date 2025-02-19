package com.asiainfo.crm.res.phone.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOResSelNumCustLogValue extends DataStructInterface{

  public final static  String S_DeptId = "DEPT_ID";
  public final static  String S_State = "STATE";
  public final static  String S_RelaType = "RELA_TYPE";
  public final static  String S_SecOrgId = "SEC_ORG_ID";
  public final static  String S_DataId = "DATA_ID";
  public final static  String S_OccupyDate = "OCCUPY_DATE";
  public final static  String S_CustCardNo = "CUST_CARD_NO";
  public final static  String S_ResId = "RES_ID";
  public final static  String S_ResSpecId = "RES_SPEC_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CustCardType = "CUST_CARD_TYPE";
  public final static  String S_ResStoreId = "RES_STORE_ID";
  public final static  String S_Notes = "NOTES";
  public final static  String S_IccId = "ICC_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_PreOccupyDate = "PRE_OCCUPY_DATE";
  public final static  String S_BusiType = "BUSI_TYPE";
  public final static  String S_ExtId = "EXT_ID";
  public final static  String S_LeadingNum = "LEADING_NUM";
  public final static  String S_Imsi = "IMSI";
  public final static  String S_ExtStr = "EXT_STR";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_ManageStatus = "MANAGE_STATUS";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ManualExport = "MANUAL_EXPORT";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3"; 
  public final static  String S_Ext4 = "EXT4";


public String getDeptId();

public long getState();

public long getRelaType();

public long getSecOrgId();

public long getDataId();

public Timestamp getOccupyDate();

public String getCustCardNo();

public String getResId();

public long getResSpecId();

public long getDoneCode();

public String getCustCardType();

public long getResStoreId();

public String getNotes();

public String getIccId();

public long getOpId();

public Timestamp getPreOccupyDate();

public String getBusiType();

public long getExtId();

public String getLeadingNum();

public String getImsi();

public String getExtStr();

public long getOrgId();

public String getRegionId();

public String getCountyId();

public String getManageStatus();

public Timestamp getDoneDate();

public String getManualExport();

public String getExt1();

public String getExt2();

public String getExt3();

public String getExt4();


public  void setDeptId(String value);

public  void setState(long value);

public  void setRelaType(long value);

public  void setSecOrgId(long value);

public  void setDataId(long value);

public  void setOccupyDate(Timestamp value);

public  void setCustCardNo(String value);

public  void setResId(String value);

public  void setResSpecId(long value);

public  void setDoneCode(long value);

public  void setCustCardType(String value);

public  void setResStoreId(long value);

public  void setNotes(String value);

public  void setIccId(String value);

public  void setOpId(long value);

public  void setPreOccupyDate(Timestamp value);

public  void setBusiType(String value);

public  void setExtId(long value);

public  void setLeadingNum(String value);

public  void setImsi(String value);

public  void setExtStr(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCountyId(String value);

public  void setManageStatus(String value);

public  void setDoneDate(Timestamp value);

public  void setManualExport(String value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setExt3(String value);

public  void setExt4(String value);
}
