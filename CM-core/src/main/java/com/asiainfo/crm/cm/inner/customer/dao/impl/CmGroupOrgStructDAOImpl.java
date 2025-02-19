package com.asiainfo.crm.cm.inner.customer.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgStructEngine;
import com.asiainfo.crm.cm.inner.customer.dao.interfaces.ICmGroupOrgStructDAO;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupOrgStructValue;

public class CmGroupOrgStructDAOImpl implements ICmGroupOrgStructDAO{

	public IBOCmGroupOrgStructValue queryCmGroupOrg(long relCustId)
			throws Exception {
		Map parameter = new HashMap();
		StringBuffer condition = new StringBuffer(" 1=1 ");
		if(relCustId > 0){
			condition.append(" AND ").append(IBOCmGroupOrgStructValue.S_RelCustId).append(" = ").append(":relCustId");
			parameter.put("relCustId", relCustId);
		}
		IBOCmGroupOrgStructValue[] values = BOCmGroupOrgStructEngine.getBeans(condition.toString(), parameter);
		if(null!=values && values.length>0){
			return values[0];
		}
		return null;
	}

}
