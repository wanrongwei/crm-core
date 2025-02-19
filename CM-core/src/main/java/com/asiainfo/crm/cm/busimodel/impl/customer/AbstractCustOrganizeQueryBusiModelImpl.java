package com.asiainfo.crm.cm.busimodel.impl.customer;

import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataByIdBusiModel;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmBusiLogFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgStructBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupOrgStructValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bo.CustOrganizeBean;

public abstract class AbstractCustOrganizeQueryBusiModelImpl extends AbstractQueryBusiModelImpl implements IQueryDataBusiModel, IQueryCountBusiModel, IQueryDataByIdBusiModel {

	protected Class getReturnObjectClass() {
		return CustOrganizeBean.class;
	}

	public DataContainerInterface queryDataById(long deptId) throws Exception {
		BOCmGroupOrgStructBean bean = new BOCmGroupOrgStructBean();
		bean.setDeptId(deptId);
		IBOCmGroupOrgStructValue boGroupOrgStructValue = (IBOCmGroupOrgStructValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
		if (!CmCommonUtil.isNotEmptyObject(boGroupOrgStructValue)) {
			return null;
		}
		CustOrganizeBean custOrganize = new CustOrganizeBean();
		custOrganize.copy(boGroupOrgStructValue);
		return custOrganize;
	}

	protected void saveQueryBusiLog(Parameter parameter) throws Exception {
		CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.CUSTOMER_LOG);
	}
}