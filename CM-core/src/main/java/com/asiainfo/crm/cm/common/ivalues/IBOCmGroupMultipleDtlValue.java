package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupMultipleDtlValue extends DataStructInterface{

  public final static  String S_ProvVnum = "PROV_VNUM";
  public final static  String S_CmccNum = "CMCC_NUM";
  public final static  String S_ChargerPhone = "CHARGER_PHONE";
  public final static  String S_SoNbr = "SO_NBR";
  public final static  String S_SoDate = "SO_DATE";
  public final static  String S_ManagerId = "MANAGER_ID";
  public final static  String S_RegionCode = "REGION_CODE";
  public final static  String S_CtNum = "CT_NUM";
  public final static  String S_Notes = "NOTES";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_DeptCharger = "DEPT_CHARGER";
  public final static  String S_IsGmanage = "IS_GMANAGE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_RegionVnum = "REGION_VNUM";
  public final static  String S_OtherCharger = "OTHER_CHARGER";
  public final static  String S_OtherPhone = "OTHER_PHONE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CuNum = "CU_NUM";
  public final static  String S_LinkPhone = "LINK_PHONE";
  public final static  String S_GroupMtpId = "GROUP_MTP_ID";
  public final static  String S_LinkName = "LINK_NAME";
  public final static  String S_Charger = "CHARGER";
  public final static  String S_ChargeDept = "CHARGE_DEPT";


public long getProvVnum();

public long getCmccNum();

public String getChargerPhone();

public long getSoNbr();

public Timestamp getSoDate();

public String getManagerId();

public long getRegionCode();

public long getCtNum();

public String getNotes();

public long getOrgId();

public String getDeptCharger();

public int getIsGmanage();

public Timestamp getCreateDate();

public long getRegionVnum();

public String getOtherCharger();

public String getOtherPhone();

public long getOpId();

public Timestamp getExpireDate();

public long getCuNum();

public String getLinkPhone();

public String getGroupMtpId();

public String getLinkName();

public String getCharger();

public String getChargeDept();


public  void setProvVnum(long value);

public  void setCmccNum(long value);

public  void setChargerPhone(String value);

public  void setSoNbr(long value);

public  void setSoDate(Timestamp value);

public  void setManagerId(String value);

public  void setRegionCode(long value);

public  void setCtNum(long value);

public  void setNotes(String value);

public  void setOrgId(long value);

public  void setDeptCharger(String value);

public  void setIsGmanage(int value);

public  void setCreateDate(Timestamp value);

public  void setRegionVnum(long value);

public  void setOtherCharger(String value);

public  void setOtherPhone(String value);

public  void setOpId(long value);

public  void setExpireDate(Timestamp value);

public  void setCuNum(long value);

public  void setLinkPhone(String value);

public  void setGroupMtpId(String value);

public  void setLinkName(String value);

public  void setCharger(String value);

public  void setChargeDept(String value);
}
