package com.asiainfo.crm.res.rescfg.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOGsmHlrInfoValue extends DataStructInterface{

  public final static  String S_HlrType = "HLR_TYPE";
  public final static  String S_ModifyDate = "MODIFY_DATE";
  public final static  String S_BureauCode = "BUREAU_CODE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_RegionCode = "REGION_CODE";
  public final static  String S_HlrCode = "HLR_CODE";
  public final static  String S_AreaCode = "AREA_CODE";
  public final static  String S_ValidDate = "VALID_DATE";
  public final static  String S_ProvCode = "PROV_CODE";


public int getHlrType();

public Timestamp getModifyDate();

public String getBureauCode();

public Timestamp getExpireDate();

public String getRegionCode();

public String getHlrCode();

public String getAreaCode();

public Timestamp getValidDate();

public String getProvCode();


public  void setHlrType(int value);

public  void setModifyDate(Timestamp value);

public  void setBureauCode(String value);

public  void setExpireDate(Timestamp value);

public  void setRegionCode(String value);

public  void setHlrCode(String value);

public  void setAreaCode(String value);

public  void setValidDate(Timestamp value);

public  void setProvCode(String value);
}
