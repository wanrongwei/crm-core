package com.asiainfo.crm.cm.busimodel.impl.account;

import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.model.bo.AccountProfileBean;

public abstract class AbstractLnAccountProfileQueryBusiModelImpl extends AbstractQueryBusiModelImpl implements IQueryDataBusiModel, IQueryCountBusiModel {

	
	protected Class<?> getReturnObjectClass() 
	{
		return AccountProfileBean.class;
	}

}
