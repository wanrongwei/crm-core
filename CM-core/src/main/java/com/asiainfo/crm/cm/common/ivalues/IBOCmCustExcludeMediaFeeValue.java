package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCustExcludeMediaFeeValue extends DataStructInterface{

  public final static  String S_RegionCode = "REGION_CODE";
  public final static  String S_LastUpdateDate = "LAST_UPDATE_DATE";
  public final static  String S_Name2 = "NAME2";
  public final static  String S_Name = "NAME";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_City = "CITY";
  public final static  String S_Address = "ADDRESS";
  public final static  String S_ApprovalNumber = "APPROVAL_NUMBER";
  public final static  String S_PostCode = "POST_CODE";
  public final static  String S_CvrNumber = "CVR_NUMBER";
  public final static  String S_Id = "ID";
  public final static  String S_Address2 = "ADDRESS2";


public String getRegionCode();

public Timestamp getLastUpdateDate();

public String getName2();

public String getName();

public String getExt1();

public String getExt2();

public Timestamp getCreateDate();

public String getExt3();

public String getCity();

public String getAddress();

public String getApprovalNumber();

public String getPostCode();

public String getCvrNumber();

public long getId();

public String getAddress2();


public  void setRegionCode(String value);

public  void setLastUpdateDate(Timestamp value);

public  void setName2(String value);

public  void setName(String value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setCreateDate(Timestamp value);

public  void setExt3(String value);

public  void setCity(String value);

public  void setAddress(String value);

public  void setApprovalNumber(String value);

public  void setPostCode(String value);

public  void setCvrNumber(String value);

public  void setId(long value);

public  void setAddress2(String value);
}
