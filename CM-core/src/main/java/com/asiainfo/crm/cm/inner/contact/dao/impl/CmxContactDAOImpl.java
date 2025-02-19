package com.asiainfo.crm.cm.inner.contact.dao.impl;

import java.util.Map;

import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyContactEngine;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyContactValue;
import com.asiainfo.crm.cm.inner.contact.bo.BOCmGroupContactHEngine;
import com.asiainfo.crm.cm.inner.contact.bo.BOCmxGroupCustAdminEngine;
import com.asiainfo.crm.cm.inner.contact.bo.QBOCmxGroupContactEngine;
import com.asiainfo.crm.cm.inner.contact.bo.QBOCmxGroupContactHEngine;
import com.asiainfo.crm.cm.inner.contact.dao.interfaces.ICmxContactDAO;
import com.asiainfo.crm.cm.inner.contact.ivalues.IBOCmGroupContactHValue;
import com.asiainfo.crm.cm.inner.contact.ivalues.IBOCmxGroupCustAdminValue;
import com.asiainfo.crm.cm.inner.contact.ivalues.IQBOCmxGroupContactHValue;
import com.asiainfo.crm.cm.inner.contact.ivalues.IQBOCmxGroupContactValue;

public class CmxContactDAOImpl implements ICmxContactDAO {

	
	public IBOCmPartyContactValue[] queryCustContact(String condition, Map paramerMap) throws Exception {
		
		return BOCmPartyContactEngine.getBeans(condition, paramerMap);
	}

	public IQBOCmxGroupContactValue[] queryGroupContacts(String[] cols,String condition, Map parameter, int startNum, int endNum)throws Exception {

		return  QBOCmxGroupContactEngine.getBeans(cols, condition, parameter, startNum, endNum, false);
	}

	public int queryGroupContactCount(String condition, Map parameter)throws Exception {
		
		return QBOCmxGroupContactEngine.getBeansCount(condition, parameter);
	}

	public IQBOCmxGroupContactHValue[] queryGroupContactH(String[] cols,String condition, Map parameter, int startNum, int endNum)throws Exception {
		
		return QBOCmxGroupContactHEngine.getBeans(cols, condition, parameter, startNum, endNum, false);
	}

	public int queryGroupContactHCount(String condition, Map parameter)throws Exception {
		
		return QBOCmxGroupContactHEngine.getBeansCount(condition, parameter);
	}

	public IBOCmxGroupCustAdminValue[] queryGroupCustAdmins(String[] cols,String condition, Map parameter, int startNum, int endNum)throws Exception {
		return BOCmxGroupCustAdminEngine.getBeans(cols, condition, parameter, startNum, endNum, false);
	}

	public int queryCmxGroupAdminsCount(String condition, Map parameter)throws Exception {
		return BOCmxGroupCustAdminEngine.getBeansCount(condition, parameter);
	}

	public void saveGroupCustAdmin(IBOCmxGroupCustAdminValue groupCustAdminValue)throws Exception {
		if(groupCustAdminValue != null){
		BOCmxGroupCustAdminEngine.save(groupCustAdminValue);
		}
	}

	public void saveGroupContactH(IBOCmGroupContactHValue[] groupContactHValues) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(groupContactHValues)) {
		BOCmGroupContactHEngine.saveBatch(groupContactHValues);	
		}
	}
}
