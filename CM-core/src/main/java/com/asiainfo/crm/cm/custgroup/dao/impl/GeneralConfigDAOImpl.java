package com.asiainfo.crm.cm.custgroup.dao.impl;

import java.util.HashMap;

import org.apache.commons.lang.StringUtils;

import com.asiainfo.crm.cm.custgroup.bo.BOCmGeneralConfigEngine;
import com.asiainfo.crm.cm.custgroup.dao.interfaces.IGeneralConfigDAO;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmGeneralConfigValue;

public class GeneralConfigDAOImpl implements IGeneralConfigDAO {

	public IBOCmGeneralConfigValue[] queryCmGeneralConfigByCondition(String srcType, String configType, String configCode, String state) throws Exception{
		StringBuilder condition = new StringBuilder(" 1 = 1 ");
		HashMap paraMap = new HashMap();
		if(StringUtils.isNotBlank(srcType)){
			condition.append(" AND ").append(IBOCmGeneralConfigValue.S_SrcType).append(" = :").append(IBOCmGeneralConfigValue.S_SrcType);
			paraMap.put(IBOCmGeneralConfigValue.S_SrcType, srcType);
		}
		if(StringUtils.isNotBlank(configType)){
			condition.append(" AND ").append(IBOCmGeneralConfigValue.S_ConfigType).append(" = :").append(IBOCmGeneralConfigValue.S_ConfigType);
			paraMap.put(IBOCmGeneralConfigValue.S_ConfigType, configType);
		}
		if(StringUtils.isNotBlank(configCode)){
			condition.append(" AND ").append(IBOCmGeneralConfigValue.S_ConfigCode).append(" = :").append(IBOCmGeneralConfigValue.S_ConfigCode);
			paraMap.put(IBOCmGeneralConfigValue.S_ConfigCode, configCode);
		}
		
		condition.append(" AND ").append(IBOCmGeneralConfigValue.S_State).append(" = :").append(IBOCmGeneralConfigValue.S_State);
		paraMap.put(IBOCmGeneralConfigValue.S_State, state);
		return BOCmGeneralConfigEngine.getBeans(condition.toString(), paraMap);
	}
	
	public IBOCmGeneralConfigValue[] queryCmGeneralConfigByCondition(String srcType, String configType, 
			String configCode,String value1,String value2,String value3,String value4,String value5,
			String state) throws Exception{
		StringBuilder condition = new StringBuilder(" 1 = 1 ");
		HashMap paraMap = new HashMap();
		if(StringUtils.isNotBlank(srcType)){
			condition.append(" AND ").append(IBOCmGeneralConfigValue.S_SrcType).append(" = :").append(IBOCmGeneralConfigValue.S_SrcType);
			paraMap.put(IBOCmGeneralConfigValue.S_SrcType, srcType);
		}
		if(StringUtils.isNotBlank(configType)){
			condition.append(" AND ").append(IBOCmGeneralConfigValue.S_ConfigType).append(" = :").append(IBOCmGeneralConfigValue.S_ConfigType);
			paraMap.put(IBOCmGeneralConfigValue.S_ConfigType, configType);
		}
		if(StringUtils.isNotBlank(configCode)){
			condition.append(" AND ").append(IBOCmGeneralConfigValue.S_ConfigCode).append(" = :").append(IBOCmGeneralConfigValue.S_ConfigCode);
			paraMap.put(IBOCmGeneralConfigValue.S_ConfigCode, configCode);
		}
		
		if(StringUtils.isNotBlank(value1)){
			condition.append(" AND ").append(IBOCmGeneralConfigValue.S_Value1).append(" = :").append(IBOCmGeneralConfigValue.S_Value1);
			paraMap.put(IBOCmGeneralConfigValue.S_Value1, value1);
		}
		if(StringUtils.isNotBlank(value2)){
			condition.append(" AND ").append(IBOCmGeneralConfigValue.S_Value2).append(" = :").append(IBOCmGeneralConfigValue.S_Value2);
			paraMap.put(IBOCmGeneralConfigValue.S_Value2, value2);
		}
		if(StringUtils.isNotBlank(value3)){
			condition.append(" AND ").append(IBOCmGeneralConfigValue.S_Value3).append(" = :").append(IBOCmGeneralConfigValue.S_Value3);
			paraMap.put(IBOCmGeneralConfigValue.S_Value3, value3);
		}
		if(StringUtils.isNotBlank(value4)){
			condition.append(" AND ").append(IBOCmGeneralConfigValue.S_Value4).append(" = :").append(IBOCmGeneralConfigValue.S_Value4);
			paraMap.put(IBOCmGeneralConfigValue.S_Value4, value4);
		}
		if(StringUtils.isNotBlank(value5)){
			condition.append(" AND ").append(IBOCmGeneralConfigValue.S_Value5).append(" = :").append(IBOCmGeneralConfigValue.S_Value5);
			paraMap.put(IBOCmGeneralConfigValue.S_Value5, value5);
		}
		if (StringUtils.isNotBlank(state)){
			condition.append(" AND ").append(IBOCmGeneralConfigValue.S_State).append(" = :").append(IBOCmGeneralConfigValue.S_State);
			paraMap.put(IBOCmGeneralConfigValue.S_State, state);
		}
		return BOCmGeneralConfigEngine.getBeans(condition.toString(), paraMap);
	}

	public void saveCmGeneralConfigValue(IBOCmGeneralConfigValue value)throws Exception {
		BOCmGeneralConfigEngine.save(value);
	}

	public void saveCmGeneralConfigValues(IBOCmGeneralConfigValue[] values)throws Exception {
		BOCmGeneralConfigEngine.save(values);
	}

}
