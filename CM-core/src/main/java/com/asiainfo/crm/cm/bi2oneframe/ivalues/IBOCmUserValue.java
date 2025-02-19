package com.asiainfo.crm.cm.bi2oneframe.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmUserValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_ScreenSize = "SCREEN_SIZE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_IsMobilePay = "IS_MOBILE_PAY";
  public final static  String S_Fetion = "FETION";
  public final static  String S_DownloadWap = "DOWNLOAD_WAP";
  public final static  String S_MobileEmail = "MOBILE_EMAIL";
  public final static  String S_MarketTime = "MARKET_TIME";
  public final static  String S_Version = "VERSION";
  public final static  String S_DataId = "DATA_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_Kjava = "KJAVA";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_IsMobileTvWap = "IS_MOBILE_TV_WAP";
  public final static  String S_IsMobileTvClient = "IS_MOBILE_TV_CLIENT";
  public final static  String S_Mms = "MMS";
  public final static  String S_MobileSecurity = "MOBILE_SECURITY";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_DownloadMethod = "DOWNLOAD_METHOD";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_Wap = "WAP";
  public final static  String S_System = "SYSTEM";
  public final static  String S_Gprs = "GPRS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CreateVestDepartement = "CREATE_VEST_DEPARTEMENT";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Brand = "BRAND";


public String getState();

public String getScreenSize();

public String getRemarks();

public String getIsMobilePay();

public String getFetion();

public String getDownloadWap();

public String getMobileEmail();

public Timestamp getMarketTime();

public String getVersion();

public long getDataId();

public long getCreateOpId();

public String getKjava();

public long getDoneCode();

public String getIsMobileTvWap();

public String getIsMobileTvClient();

public String getMms();

public String getMobileSecurity();

public Timestamp getExpireDate();

public String getDownloadMethod();

public Timestamp getEffectiveDate();

public long getOpId();

public String getWap();

public String getSystem();

public String getGprs();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public String getCreateVestDepartement();

public Timestamp getDoneDate();

public String getBillId();

public Timestamp getCreateDate();

public String getBrand();


public  void setState(String value);

public  void setScreenSize(String value);

public  void setRemarks(String value);

public  void setIsMobilePay(String value);

public  void setFetion(String value);

public  void setDownloadWap(String value);

public  void setMobileEmail(String value);

public  void setMarketTime(Timestamp value);

public  void setVersion(String value);

public  void setDataId(long value);

public  void setCreateOpId(long value);

public  void setKjava(String value);

public  void setDoneCode(long value);

public  void setIsMobileTvWap(String value);

public  void setIsMobileTvClient(String value);

public  void setMms(String value);

public  void setMobileSecurity(String value);

public  void setExpireDate(Timestamp value);

public  void setDownloadMethod(String value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setWap(String value);

public  void setSystem(String value);

public  void setGprs(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCreateVestDepartement(String value);

public  void setDoneDate(Timestamp value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setBrand(String value);
}
