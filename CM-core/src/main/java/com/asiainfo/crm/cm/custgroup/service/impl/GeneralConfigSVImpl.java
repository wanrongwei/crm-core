package com.asiainfo.crm.cm.custgroup.service.impl;

import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.appframe2.util.TableTenantHelper;
import com.asiainfo.crm.cm.custgroup.dao.interfaces.IGeneralConfigDAO;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmGeneralConfigValue;
import com.asiainfo.crm.cm.custgroup.service.interfaces.IGeneralConfigSV;

public class GeneralConfigSVImpl implements IGeneralConfigSV {
	public IBOCmGeneralConfigValue[] getGeneralConfigs(String srcType,String configType, String configCode, String state)throws Exception {
		if(StringUtils.isBlank(srcType)){
			return null;
		}
		IGeneralConfigDAO generalConfigDAO = (IGeneralConfigDAO)ServiceFactory.getService(IGeneralConfigDAO.class);
		return generalConfigDAO.queryCmGeneralConfigByCondition(srcType, configType, configCode, state);
	}
	
	public IBOCmGeneralConfigValue[] getGeneralConfigs(Map<String,String> params)throws Exception {
		if(params!=null && params.size()>0){
			String srcType = params.get("srcType");
			String configType = params.get("configType");
			String configCode = params.get("configCode");
			String value1 = params.get("value1");
			String value2 = params.get("value2");
			String value3 = params.get("value3");
			String value4 = params.get("value4");
			String value5 = params.get("value5");
			String state = params.get("state");
			IGeneralConfigDAO generalConfigDAO = (IGeneralConfigDAO)ServiceFactory.getService(IGeneralConfigDAO.class);
			return generalConfigDAO.queryCmGeneralConfigByCondition(srcType, configType, configCode, 
					value1, value2, value3, value4, value5, state);
		}
		return null;
	}

	private void setCommonFields(IBOCmGeneralConfigValue value) throws Exception{
		if ( value.isNew() ){
			if ( value.getCreateDate()==null ){
				value.setCreateDate( ServiceManager.getOpDateTime() );
			}
		}else{
			if ( value.getLastUpdateDate()==null ){
				value.setLastUpdateDate( ServiceManager.getOpDateTime() );
			}
		}
		
		if ( value.getOpId()<=0 && ServiceManager.getUser()!=null && ServiceManager.getUser().getID()>0 ){
			value.setOpId( ServiceManager.getUser().getID() );
		}
		if ( StringUtils.isBlank(value.getTenantId()) && StringUtils.isNotBlank(TableTenantHelper.getTenantId()) ){
			value.setTenantId( TableTenantHelper.getTenantId() );
		}
	}
	
	private void setCommonFields(IBOCmGeneralConfigValue[] values) throws Exception{
		for ( int i=0; values!=null && i<values.length; i++ ){
			setCommonFields( values[i] );
		}
	}
	
	public void saveCmGeneralConfigValue(IBOCmGeneralConfigValue value)throws Exception {
		IGeneralConfigDAO generalConfigDAO = (IGeneralConfigDAO)ServiceFactory.getService(IGeneralConfigDAO.class);
		setCommonFields(value);
		generalConfigDAO.saveCmGeneralConfigValue(value);
	}

	public void saveCmGeneralConfigValues(IBOCmGeneralConfigValue[] values)throws Exception {
		IGeneralConfigDAO generalConfigDAO = (IGeneralConfigDAO)ServiceFactory.getService(IGeneralConfigDAO.class);
		setCommonFields(values);
		generalConfigDAO.saveCmGeneralConfigValues(values);
	}
}
