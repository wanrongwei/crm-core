package com.asiainfo.crm.cm.busimodel.impl.club;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubServiceVdoingBean;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubServiceVdoingValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bo.ClubServiceVdoingBean;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceVdoingValue;

public abstract class AbstractClubServiceVdoingQueryModelImpl extends AbstractQueryBusiModelImpl implements IQueryCountBusiModel, IQueryDataBusiModel {

	protected Class getReturnObjectClass() {
		return ClubServiceVdoingBean.class;
	}

	public DataContainer queryServiceCycleById(long dimensionId) throws Exception {
		BOCmClubServiceVdoingBean bean = new BOCmClubServiceVdoingBean();
		bean.setDimensionId(dimensionId);
		IBOCmClubServiceVdoingValue boClubServiceVdoingValue = (IBOCmClubServiceVdoingValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
		if (!CmCommonUtil.isNotEmptyObject(boClubServiceVdoingValue)) {
			return null;
		}
		IClubServiceVdoingValue clubServiceVdoingValue = new ClubServiceVdoingBean();
		clubServiceVdoingValue.copy(boClubServiceVdoingValue);
		return (DataContainer) clubServiceVdoingValue;
	}

	protected Parameter buildParameter(DataContainer[] conditionDCs) throws Exception {
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { conditionDCs[0] }, BOCmClubServiceVdoingBean.class);
		StringBuilder condition = new StringBuilder();
		condition.append(BOCmClubServiceVdoingBean.S_State).append(" = :state ").append(" AND ").append(parameter.getCondition());
		parameter.setCondition(condition.toString());
		parameter.getParameter().put("state", CmConstants.RecordState.USE);
		return parameter;
	}
}
