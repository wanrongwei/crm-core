package com.asiainfo.crm.cm.customer.group.service.impl;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.IKOBFileImportDAO;
import com.asiainfo.crm.cm.customer.group.service.interfaces.IKOBFileImportSV;

public class KOBFileImportSVImpl implements IKOBFileImportSV{

	public DataContainer[] queryDataForFile(String tenantId,String regionId, int fileNo) throws Exception {
		IKOBFileImportDAO dao = (IKOBFileImportDAO) ServiceFactory.getService(IKOBFileImportDAO.class);

		return dao.queryDataForFile(tenantId, regionId, fileNo);
	}
	
	public DataContainer[] queryIndustrys(String tenantId,long custId) throws Exception {
		IKOBFileImportDAO dao = (IKOBFileImportDAO) ServiceFactory.getService(IKOBFileImportDAO.class);

		return dao.queryIndustrys(tenantId, custId);
	}
}
