package com.asiainfo.crm.cm.ln.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCustUnionFieldMappingValue extends DataStructInterface{

  public final static  String S_FieldType = "FIELD_TYPE";
  public final static  String S_FieldCode = "FIELD_CODE";
  public final static  String S_FieldValue = "FIELD_VALUE";


public int getFieldType();

public String getFieldCode();

public String getFieldValue();


public  void setFieldType(int value);

public  void setFieldCode(String value);

public  void setFieldValue(String value);
}
