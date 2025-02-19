package com.asiainfo.crm.cm.inner.party.dao.impl;

import java.util.Map;

import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.party.bo.BOCmxIndivPartyHobbyEngine;
import com.asiainfo.crm.cm.inner.party.bo.BOCmxPartyContTypeInfoEngine;
import com.asiainfo.crm.cm.inner.party.dao.interfaces.ICmxPartyDAO;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmxIndivPartyHobbyValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmxPartyContTypeInfoValue;

public class CmxPartyDAOImpl implements ICmxPartyDAO {

	public IBOCmxIndivPartyHobbyValue[] queryIndivPartyHobby(String[] cols, String condition, Map parameter, int startNum, int endNum)
			throws Exception {
		return BOCmxIndivPartyHobbyEngine.getBeans(null, condition, parameter, startNum, endNum, false);
	}

	public int queryIndivPartyHobbyCount(String condition, Map parameter) throws Exception
	{
		return BOCmxIndivPartyHobbyEngine.getBeansCount(condition, parameter);
	}

	public IBOCmxPartyContTypeInfoValue[] queryPartyContTypeInfo(String[] cols,String condition, Map parameter, int startNum, int endNum) throws Exception {
		
		return BOCmxPartyContTypeInfoEngine.getBeans(null, condition, parameter, startNum, endNum, false);
	}

	public int queryPartyContTypeInfoCount(String condition, Map parameter) throws Exception {
		return BOCmxPartyContTypeInfoEngine.getBeansCount(condition, parameter);
	}

	public void saveIndivPartyHobby(IBOCmxIndivPartyHobbyValue[] cmxIndivPartyHobbyValue) throws Exception {
		if (cmxIndivPartyHobbyValue !=null){
			BOCmxIndivPartyHobbyEngine.save(cmxIndivPartyHobbyValue);
		}
	}

	public void savePartyContTypeInfo(IBOCmxPartyContTypeInfoValue[] cmxPartyContTypeInfoValue) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(cmxPartyContTypeInfoValue)){
			BOCmxPartyContTypeInfoEngine.saveBatch(cmxPartyContTypeInfoValue);
		}
	}
	
	public void savePartyHobby(IBOCmxIndivPartyHobbyValue cmxIndivPartyHobbyValue) throws Exception {
		if (cmxIndivPartyHobbyValue !=null){
			BOCmxIndivPartyHobbyEngine.save(cmxIndivPartyHobbyValue);
		}
	}
}
