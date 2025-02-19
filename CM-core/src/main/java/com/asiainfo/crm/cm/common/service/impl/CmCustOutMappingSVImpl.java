package com.asiainfo.crm.cm.common.service.impl;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.dao.interfaces.ICmCustOutMappingDAO;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCustOutMappingSV;

public class CmCustOutMappingSVImpl implements ICmCustOutMappingSV {

	@Override
	public long createNewMappingValue(String oldSystemId) throws Exception {
		ICmCustOutMappingDAO dao = (ICmCustOutMappingDAO) ServiceFactory.getService(ICmCustOutMappingDAO.class);
		return dao.createNewMappingValue(oldSystemId);
	}
}
