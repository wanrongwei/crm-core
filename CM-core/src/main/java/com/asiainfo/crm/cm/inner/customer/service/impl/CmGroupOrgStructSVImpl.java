package com.asiainfo.crm.cm.inner.customer.service.impl;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.inner.customer.dao.interfaces.ICmGroupOrgStructDAO;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupOrgStructValue;
import com.asiainfo.crm.cm.inner.customer.service.interfaces.ICmGroupOrgStructSV;

public class CmGroupOrgStructSVImpl implements ICmGroupOrgStructSV{

	public IBOCmGroupOrgStructValue queryGroupOrg(long relCustId)
			throws Exception {
		ICmGroupOrgStructDAO dao = (ICmGroupOrgStructDAO) ServiceFactory.getService(ICmGroupOrgStructDAO.class);
		return dao.queryCmGroupOrg(relCustId);
	}

}
