package com.asiainfo.crm.common.bo;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.*;
import com.ai.common.ivalues.IBOBsStaticDataValue;

public class BOBsStaticDataBean extends DataContainer implements DataContainerInterface, IBOBsStaticDataValue {
    private static String m_boName = "com.ai.common.bo.BOBsStaticData";
    public static final String S_State = "STATE";
    public static final String S_SortId = "SORT_ID";
    public static final String S_CodeName = "CODE_NAME";
    public static final String S_ExternCodeType = "EXTERN_CODE_TYPE";
    public static final String S_CodeValue = "CODE_VALUE";
    public static final String S_CodeTypeAlias = "CODE_TYPE_ALIAS";
    public static final String S_CodeDesc = "CODE_DESC";
    public static final String S_CodeType = "CODE_TYPE";
    public static ObjectType S_TYPE = null;

    public BOBsStaticDataBean() throws AIException {
        super(S_TYPE);
    }

    public static ObjectType getObjectTypeStatic() throws AIException {
        return S_TYPE;
    }

    public void setObjectType(ObjectType value) throws AIException {
        throw new AIException("Cannot reset ObjectType");
    }

    public void initState(String value) {
        this.initProperty("STATE", value);
    }

    public void setState(String value) {
        this.set("STATE", value);
    }

    public void setStateNull() {
        this.set("STATE", (Object)null);
    }

    public String getState() {
        return DataType.getAsString(this.get("STATE"));
    }

    public String getStateInitialValue() {
        return DataType.getAsString(this.getOldObj("STATE"));
    }

    public void initSortId(int value) {
        this.initProperty("SORT_ID", new Integer(value));
    }

    public void setSortId(int value) {
        this.set("SORT_ID", new Integer(value));
    }

    public void setSortIdNull() {
        this.set("SORT_ID", (Object)null);
    }

    public int getSortId() {
        return DataType.getAsInt(this.get("SORT_ID"));
    }

    public int getSortIdInitialValue() {
        return DataType.getAsInt(this.getOldObj("SORT_ID"));
    }

    public void initCodeName(String value) {
        this.initProperty("CODE_NAME", value);
    }

    public void setCodeName(String value) {
        this.set("CODE_NAME", value);
    }

    public void setCodeNameNull() {
        this.set("CODE_NAME", (Object)null);
    }

    public String getCodeName() {
        return DataType.getAsString(this.get("CODE_NAME"));
    }

    public String getCodeNameInitialValue() {
        return DataType.getAsString(this.getOldObj("CODE_NAME"));
    }

    public void initExternCodeType(String value) {
        this.initProperty("EXTERN_CODE_TYPE", value);
    }

    public void setExternCodeType(String value) {
        this.set("EXTERN_CODE_TYPE", value);
    }

    public void setExternCodeTypeNull() {
        this.set("EXTERN_CODE_TYPE", (Object)null);
    }

    public String getExternCodeType() {
        return DataType.getAsString(this.get("EXTERN_CODE_TYPE"));
    }

    public String getExternCodeTypeInitialValue() {
        return DataType.getAsString(this.getOldObj("EXTERN_CODE_TYPE"));
    }

    public void initCodeValue(String value) {
        this.initProperty("CODE_VALUE", value);
    }

    public void setCodeValue(String value) {
        this.set("CODE_VALUE", value);
    }

    public void setCodeValueNull() {
        this.set("CODE_VALUE", (Object)null);
    }

    public String getCodeValue() {
        return DataType.getAsString(this.get("CODE_VALUE"));
    }

    public String getCodeValueInitialValue() {
        return DataType.getAsString(this.getOldObj("CODE_VALUE"));
    }

    public void initCodeTypeAlias(String value) {
        this.initProperty("CODE_TYPE_ALIAS", value);
    }

    public void setCodeTypeAlias(String value) {
        this.set("CODE_TYPE_ALIAS", value);
    }

    public void setCodeTypeAliasNull() {
        this.set("CODE_TYPE_ALIAS", (Object)null);
    }

    public String getCodeTypeAlias() {
        return DataType.getAsString(this.get("CODE_TYPE_ALIAS"));
    }

    public String getCodeTypeAliasInitialValue() {
        return DataType.getAsString(this.getOldObj("CODE_TYPE_ALIAS"));
    }

    public void initCodeDesc(String value) {
        this.initProperty("CODE_DESC", value);
    }

    public void setCodeDesc(String value) {
        this.set("CODE_DESC", value);
    }

    public void setCodeDescNull() {
        this.set("CODE_DESC", (Object)null);
    }

    public String getCodeDesc() {
        return DataType.getAsString(this.get("CODE_DESC"));
    }

    public String getCodeDescInitialValue() {
        return DataType.getAsString(this.getOldObj("CODE_DESC"));
    }

    public void initCodeType(String value) {
        this.initProperty("CODE_TYPE", value);
    }

    public void setCodeType(String value) {
        this.set("CODE_TYPE", value);
    }

    public void setCodeTypeNull() {
        this.set("CODE_TYPE", (Object)null);
    }

    public String getCodeType() {
        return DataType.getAsString(this.get("CODE_TYPE"));
    }

    public String getCodeTypeInitialValue() {
        return DataType.getAsString(this.getOldObj("CODE_TYPE"));
    }

    static {
        try {
            S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
        } catch (Exception var1) {
            throw new RuntimeException(var1);
        }
    }


 
 }

