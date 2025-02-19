package com.asiainfo.crm.cm.customer.group.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractCmCommonDealModelImpl;
import com.asiainfo.crm.cm.common.CmServiceFactory;

public interface ICmGroupAuditInfoSV {
	
	public DataContainer[] queryData(String criteria, int startNum, int endNum)throws Exception;

	public int queryDataCount(String criteria) throws Exception;

	public void saveData(DataContainer[] values,String auditClass) throws Exception;
}
