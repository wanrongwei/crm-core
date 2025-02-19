package com.asiainfo.crm.so.query.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOBoundaryRoamValue extends DataStructInterface{

  public final static  String S_LacId = "LAC_ID";
  public final static  String S_RegionCode = "REGION_CODE";
  public final static  String S_RoamType = "ROAM_TYPE";
  public final static  String S_MscId = "MSC_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_AreaCode = "AREA_CODE";
  public final static  String S_RegionName = "REGION_NAME";
  public final static  String S_ValidDate = "VALID_DATE";
  public final static  String S_CellId = "CELL_ID";


public String getLacId();

public String getRegionCode();

public long getRoamType();

public String getMscId();

public Timestamp getExpireDate();

public String getAreaCode();

public String getRegionName();

public Timestamp getValidDate();

public String getCellId();


public  void setLacId(String value);

public  void setRegionCode(String value);

public  void setRoamType(long value);

public  void setMscId(String value);

public  void setExpireDate(Timestamp value);

public  void setAreaCode(String value);

public  void setRegionName(String value);

public  void setValidDate(Timestamp value);

public  void setCellId(String value);
}
