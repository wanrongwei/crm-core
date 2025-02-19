package com.asiainfo.crm.cm.custgroup.service.interfaces;

import java.util.Map;

import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmGeneralConfigValue;

public interface IGeneralConfigSV {
	/**
	 * 查询客管通用配置表数据
	 * srcType 必传，不传返回空
	 * @author huanglun
	 * @date 2018年9月3日 下午3:48:53
	 */
	public IBOCmGeneralConfigValue[] getGeneralConfigs(String srcType,String configType,String configCode,String state) throws Exception;
	
	public IBOCmGeneralConfigValue[] getGeneralConfigs(Map<String,String> params)throws Exception;
	
	public void saveCmGeneralConfigValue(IBOCmGeneralConfigValue value)throws Exception;
	
	public void saveCmGeneralConfigValues(IBOCmGeneralConfigValue[] values)throws Exception;
}
