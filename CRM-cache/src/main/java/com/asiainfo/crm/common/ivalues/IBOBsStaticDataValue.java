package com.asiainfo.crm.common.ivalues;

public interface IBOBsStaticDataValue {
    String S_State = "STATE";
    String S_SortId = "SORT_ID";
    String S_CodeName = "CODE_NAME";
    String S_ExternCodeType = "EXTERN_CODE_TYPE";
    String S_CodeValue = "CODE_VALUE";
    String S_CodeTypeAlias = "CODE_TYPE_ALIAS";
    String S_CodeDesc = "CODE_DESC";
    String S_CodeType = "CODE_TYPE";

    String getState();

    int getSortId();

    String getCodeName();

    String getExternCodeType();

    String getCodeValue();

    String getCodeTypeAlias();

    String getCodeDesc();

    String getCodeType();

    void setState(String var1);

    void setSortId(int var1);

    void setCodeName(String var1);

    void setExternCodeType(String var1);

    void setCodeValue(String var1);

    void setCodeTypeAlias(String var1);

    void setCodeDesc(String var1);

    void setCodeType(String var1);
}
