package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupOrgStructValue extends DataStructInterface{

  public final static  String S_DeptId = "DEPT_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_DeptType = "DEPT_TYPE";
  public final static  String S_DeptName = "DEPT_NAME";
  public final static  String S_HasLeaf = "HAS_LEAF";
  public final static  String S_ModifiedDate = "MODIFIED_DATE";
  public final static  String S_IsContactPoint = "IS_CONTACT_POINT";
  public final static  String S_IsRevisable = "IS_REVISABLE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ParentDeptId = "PARENT_DEPT_ID";
  public final static  String S_IsCpeProvisioningNeeded = "IS_CPE_PROVISIONING_NEEDED";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ModifiedBy = "MODIFIED_BY";
  public final static  String S_WifiName = "WIFI_NAME";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RelCustId = "REL_CUST_ID";
  public final static  String S_DeptLevel = "DEPT_LEVEL";
  public final static  String S_IsHaveContactPoint = "IS_HAVE_CONTACT_POINT";
  public final static  String S_Principal = "PRINCIPAL";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_WifiPassword = "WIFI_PASSWORD";
  public final static  String S_DeptFunc = "DEPT_FUNC";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_PrincipalTel = "PRINCIPAL_TEL";
  public final static  String S_CreateDate = "CREATE_DATE";


public long getDeptId();

public String getState();

public String getRemarks();

public long getDeptType();

public String getDeptName();

public long getHasLeaf();

public Timestamp getModifiedDate();

public long getIsContactPoint();

public long getIsRevisable();

public long getCustId();

public long getCreateOpId();

public long getParentDeptId();

public String getIsCpeProvisioningNeeded();

public long getDoneCode();

public long getModifiedBy();

public String getWifiName();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public long getRelCustId();

public long getDeptLevel();

public long getIsHaveContactPoint();

public String getPrincipal();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public String getWifiPassword();

public String getDeptFunc();

public Timestamp getDoneDate();

public String getPrincipalTel();

public Timestamp getCreateDate();


public  void setDeptId(long value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setDeptType(long value);

public  void setDeptName(String value);

public  void setHasLeaf(long value);

public  void setModifiedDate(Timestamp value);

public  void setIsContactPoint(long value);

public  void setIsRevisable(long value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setParentDeptId(long value);

public  void setIsCpeProvisioningNeeded(String value);

public  void setDoneCode(long value);

public  void setModifiedBy(long value);

public  void setWifiName(String value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setRelCustId(long value);

public  void setDeptLevel(long value);

public  void setIsHaveContactPoint(long value);

public  void setPrincipal(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setWifiPassword(String value);

public  void setDeptFunc(String value);

public  void setDoneDate(Timestamp value);

public  void setPrincipalTel(String value);

public  void setCreateDate(Timestamp value);
}
