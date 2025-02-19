package com.asiainfo.crm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOBsCommonDistrictValue extends DataStructInterface{

  public final static  String S_DistrictDesc = "DISTRICT_DESC";
  public final static  String S_State = "STATE";
  public final static  String S_ParentDistrictId = "PARENT_DISTRICT_ID";
  public final static  String S_SortId = "SORT_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_DistrictType = "DISTRICT_TYPE";
  public final static  String S_DistrictId = "DISTRICT_ID";
  public final static  String S_PostCode = "POST_CODE";
  public final static  String S_AreaCode = "AREA_CODE";
  public final static  String S_DistrictName = "DISTRICT_NAME";
  public final static  String S_DistrictCode = "DISTRICT_CODE";
  public final static  String S_DistrictEnglishName = "DISTRICT_ENGLISH_NAME";


public String getDistrictDesc();

public String getState();

public long getParentDistrictId();

public long getSortId();

public String getRemarks();

public int getDistrictType();

public long getDistrictId();

public String getPostCode();

public String getAreaCode();

public String getDistrictName();

public String getDistrictCode();

public String getDistrictEnglishName();


public  void setDistrictDesc(String value);

public  void setState(String value);

public  void setParentDistrictId(long value);

public  void setSortId(long value);

public  void setRemarks(String value);

public  void setDistrictType(int value);

public  void setDistrictId(long value);

public  void setPostCode(String value);

public  void setAreaCode(String value);

public  void setDistrictName(String value);

public  void setDistrictCode(String value);

public  void setDistrictEnglishName(String value);
}
