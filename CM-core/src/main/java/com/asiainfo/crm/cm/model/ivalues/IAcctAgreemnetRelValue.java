package com.asiainfo.crm.cm.model.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IAcctAgreemnetRelValue extends DataStructInterface{

  public final static  String S_ValidDate = "VALID_DATE";
  public final static  String S_AgreementId = "AGREEMENT_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_TenantId = "TENANT_ID";
  public final static  String S_CommitDate = "COMMIT_DATE";
  public final static  String S_SoNbr = "SO_NBR";
  public final static  String S_OperatorDate = "OPERATOR_DATE";


public Timestamp getValidDate();

public long getAgreementId();

public Timestamp getDoneDate();

public String getOperType();

public long getAcctId();

public String getTenantId();

public Timestamp getCommitDate();

public String getSoNbr();

public Timestamp getOperatorDate();


public  void setValidDate(Timestamp value);

public  void setAgreementId(long value);

public  void setDoneDate(Timestamp value);

public  void setOperType(String value);

public  void setAcctId(long value);

public  void setTenantId(String value);

public  void setCommitDate(Timestamp value);

public  void setSoNbr(String value);

public  void setOperatorDate(Timestamp value);
}
