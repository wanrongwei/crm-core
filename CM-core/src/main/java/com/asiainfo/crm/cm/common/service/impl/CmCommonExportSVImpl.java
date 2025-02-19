package com.asiainfo.crm.cm.common.service.impl;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.dao.interfaces.ICmCommonDAO;
import com.asiainfo.crm.cm.common.ivalues.IBOCmAttachExColValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmAttachExporClassValue;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonExportSV;

public class CmCommonExportSVImpl implements ICmCommonExportSV {

	public IBOCmAttachExColValue[] getCmAttachExColClass() throws Exception {
		ICmCommonDAO commonDAO = (ICmCommonDAO) ServiceFactory.getService(ICmCommonDAO.class);
		return commonDAO.getCmAttachExColClass();
	}
	
	public IBOCmAttachExporClassValue[] getCmAttachExportValue() throws Exception{
		ICmCommonDAO commonDAO = (ICmCommonDAO) ServiceFactory.getService(ICmCommonDAO.class);
		return commonDAO.getCmAttachExportValue();
	}
}
