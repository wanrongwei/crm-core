package com.asiainfo.crm.cm.custgroup.dao.interfaces;

import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmGeneralConfigValue;

public interface IGeneralConfigDAO {
	public IBOCmGeneralConfigValue[] queryCmGeneralConfigByCondition(String srcType,String configType,String configCode,String state) throws Exception;
	
	public IBOCmGeneralConfigValue[] queryCmGeneralConfigByCondition(String srcType, String configType, String configCode,String value1,String value2,String value3,String value4,String value5,String state) throws Exception;
	public void saveCmGeneralConfigValue(IBOCmGeneralConfigValue value)throws Exception;
	
	public void saveCmGeneralConfigValues(IBOCmGeneralConfigValue[] values)throws Exception;
}
