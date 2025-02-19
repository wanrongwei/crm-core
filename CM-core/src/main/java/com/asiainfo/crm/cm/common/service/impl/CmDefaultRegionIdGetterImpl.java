package com.asiainfo.crm.cm.common.service.impl;

import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.service.base.interfaces.ICommonSV;
import com.asiainfo.crm.cm.common.service.interfaces.ICmDefaultRegionIdGetter;

public class CmDefaultRegionIdGetterImpl implements ICmDefaultRegionIdGetter {

	public String getDefaultRegionId() throws Exception {
		ICommonSV commonSV = (ICommonSV)ServiceFactory.getService(ICommonSV.class);
		return commonSV.getRegionIdByNewUser();
	}
}
