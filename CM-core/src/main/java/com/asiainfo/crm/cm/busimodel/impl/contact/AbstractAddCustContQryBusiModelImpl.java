package com.asiainfo.crm.cm.busimodel.impl.contact;

import com.asiainfo.crm.cm.busimodel.IMaskBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmBusiLogFactory;
import com.asiainfo.crm.cm.model.bo.ContactBean;


public abstract class AbstractAddCustContQryBusiModelImpl extends AbstractQueryBusiModelImpl implements IQueryDataBusiModel, IQueryCountBusiModel, IMaskBusiModel {

	protected Class getReturnObjectClass() {
		return ContactBean.class;
	}

	protected void saveQueryBusiLog(Parameter parameter) throws Exception {
		// 记录业务日志
		CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.CONTACT_LOG);
	}
}
