package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOIdentificationValue extends DataStructInterface{

  public final static  String S_IssuerAuthority = "issuer_authority";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_IdenEffDate = "iden_eff_date";
  public final static  String S_Status = "status";
  public final static  String S_IdenAddress = "iden_address";
  public final static  String S_State = "state";
  public final static  String S_RegionId = "region_id";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_Remarks = "remarks";
  public final static  String S_PartyId = "party_id";
  public final static  String S_IdenExpDate = "iden_exp_date";
  public final static  String S_IdenId = "iden_id";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_IdenNr = "iden_nr";
  public final static  String S_OrgId = "org_id";
  public final static  String S_IdenType = "iden_type";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_StatusDate = "status_date";
  public final static  String S_IdenSubType = "iden_sub_type";
  public final static  String S_Action = "ACTION";
  public final static  String S_CreateOpId = "create_op_id";


public String getIssuerAuthority();

public Timestamp getExpireDate();

public Timestamp getDoneDate();

public Timestamp getIdenEffDate();

public String getStatus();

public String getIdenAddress();

public String getState();

public String getRegionId();

public long getDoneCode();

public String getRemarks();

public long getPartyId();

public Timestamp getIdenExpDate();

public long getIdenId();

public long getCreateOrgId();

public String getIdenNr();

public long getOrgId();

public long getIdenType();

public long getOpId();

public Timestamp getCreateDate();

public Timestamp getEffectiveDate();

public Timestamp getStatusDate();

public long getIdenSubType();

public String getAction();

public long getCreateOpId();


public  void setIssuerAuthority(String value);

public  void setExpireDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setIdenEffDate(Timestamp value);

public  void setStatus(String value);

public  void setIdenAddress(String value);

public  void setState(String value);

public  void setRegionId(String value);

public  void setDoneCode(long value);

public  void setRemarks(String value);

public  void setPartyId(long value);

public  void setIdenExpDate(Timestamp value);

public  void setIdenId(long value);

public  void setCreateOrgId(long value);

public  void setIdenNr(String value);

public  void setOrgId(long value);

public  void setIdenType(long value);

public  void setOpId(long value);

public  void setCreateDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setStatusDate(Timestamp value);

public  void setIdenSubType(long value);

public  void setAction(String value);

public  void setCreateOpId(long value);
}
