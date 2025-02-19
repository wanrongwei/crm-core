package com.asiainfo.crm.cm.busimodel.impl.customer;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractCmCommonDealModelImpl;

public abstract class AbstractCustGroupInfoAuditModelImpl extends AbstractCmCommonDealModelImpl{
	
	
	public DataContainer[] queryData(String criteria, int startNum, int endNum) throws Exception 
	{
		return queryData(ParamUtil.parseXmlCriteria_new(criteria), startNum, endNum);
	}


	public int queryCount(String criteria) throws Exception 
	{
		return queryCount(ParamUtil.parseXmlCriteria_new(criteria));
	}
	
}
