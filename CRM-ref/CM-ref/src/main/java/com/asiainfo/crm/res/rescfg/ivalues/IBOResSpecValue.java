package com.asiainfo.crm.res.rescfg.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOResSpecValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_IsModify = "IS_MODIFY";
  public final static  String S_ResCode = "RES_CODE";
  public final static  String S_ResSpecName = "RES_SPEC_NAME";
  public final static  String S_IsNeedConfirm = "IS_NEED_CONFIRM";
  public final static  String S_ResDesc = "RES_DESC";
  public final static  String S_IsPersonAllocate = "IS_PERSON_ALLOCATE";
  public final static  String S_ResCost = "RES_COST";
  public final static  String S_SecFactory = "SEC_FACTORY";
  public final static  String S_HeadRule = "HEAD_RULE";
  public final static  String S_InstType = "INST_TYPE";
  public final static  String S_ResSpecId = "RES_SPEC_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_TradeId = "TRADE_ID";
  public final static  String S_ServiceType = "SERVICE_TYPE";
  public final static  String S_UseRange = "USE_RANGE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_AccCode = "ACC_CODE";
  public final static  String S_Unit = "UNIT";
  public final static  String S_OldCode = "OLD_CODE";
  public final static  String S_TermiType = "TERMI_TYPE";
  public final static  String S_MatCode = "MAT_CODE";
  public final static  String S_ResTypeId = "RES_TYPE_ID";
  public final static  String S_IsRealStock = "IS_REAL_STOCK";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ValidDays = "VALID_DAYS";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_TermiUpName = "TERMI_UP_NAME";


public String getState();

public String getIsModify();

public String getResCode();

public String getResSpecName();

public int getIsNeedConfirm();

public String getResDesc();

public int getIsPersonAllocate();

public long getResCost();

public String getSecFactory();

public String getHeadRule();

public String getInstType();

public long getResSpecId();

public long getDoneCode();

public String getTradeId();

public String getServiceType();

public long getUseRange();

public String getNotes();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public long getAccCode();

public String getUnit();

public String getOldCode();

public String getTermiType();

public String getMatCode();

public long getResTypeId();

public int getIsRealStock();

public long getOrgId();

public String getRegionId();

public long getValidDays();

public Timestamp getDoneDate();

public String getTermiUpName();


public  void setState(String value);

public  void setIsModify(String value);

public  void setResCode(String value);

public  void setResSpecName(String value);

public  void setIsNeedConfirm(int value);

public  void setResDesc(String value);

public  void setIsPersonAllocate(int value);

public  void setResCost(long value);

public  void setSecFactory(String value);

public  void setHeadRule(String value);

public  void setInstType(String value);

public  void setResSpecId(long value);

public  void setDoneCode(long value);

public  void setTradeId(String value);

public  void setServiceType(String value);

public  void setUseRange(long value);

public  void setNotes(String value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setAccCode(long value);

public  void setUnit(String value);

public  void setOldCode(String value);

public  void setTermiType(String value);

public  void setMatCode(String value);

public  void setResTypeId(long value);

public  void setIsRealStock(int value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setValidDays(long value);

public  void setDoneDate(Timestamp value);

public  void setTermiUpName(String value);
}
