package com.asiainfo.crm.cm.service.impl;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOAccBankBean;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.service.interfaces.ICmAccBankSV;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractCmCommonDealModelImpl;

public class CmAccBankSVImpl implements ICmAccBankSV 
{

	public int queryDataCount(String criteria) throws Exception 
	{
		return ((AbstractCmCommonDealModelImpl) CmServiceFactory.getBusiMode(AbstractCmCommonDealModelImpl.class)).queryCount(criteria);
	}

	public DataContainer[] queryData(String criteria, int startNum,int endNum) throws Exception 
	{
		return ((AbstractCmCommonDealModelImpl)CmServiceFactory.getBusiMode(AbstractCmCommonDealModelImpl.class)).queryData(criteria, startNum, endNum);
	}

	public void saveData(DataContainer[] values) throws Exception 
	{
		for(DataContainer value:values)
		{
			if(value.isNew())
				((BOAccBankBean)value).setPhoneId(String.valueOf(CmCommonUtil.getNewSequence(BOAccBankBean.class)));
		}
		((AbstractCmCommonDealModelImpl) CmServiceFactory.getBusiMode(AbstractCmCommonDealModelImpl.class)).saveData(values);
	}

}
