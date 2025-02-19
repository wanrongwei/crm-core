package com.asiainfo.crm.cm.busimodel.impl.club;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubServiceVdoingDetailBean;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubServiceVdoingDetailValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bo.ClubServiceVdoingDetailBean;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceVdoingDetailValue;

public abstract class AbstractClubServiceVdoingDetailQueryModelImpl extends AbstractQueryBusiModelImpl implements IQueryCountBusiModel, IQueryDataBusiModel {

	protected Class getReturnObjectClass() {
		return ClubServiceVdoingDetailBean.class;
	}

	public DataContainer queryServiceCycleById(long detailId) throws Exception {
		BOCmClubServiceVdoingDetailBean bean = new BOCmClubServiceVdoingDetailBean();
		bean.setDetailId(detailId);
		IBOCmClubServiceVdoingDetailValue boClubServiceVdoingDetailValue = (IBOCmClubServiceVdoingDetailValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
		if (!CmCommonUtil.isNotEmptyObject(boClubServiceVdoingDetailValue)) {
			return null;
		}
		IClubServiceVdoingDetailValue clubServiceVdoingDetailValue = new ClubServiceVdoingDetailBean();
		clubServiceVdoingDetailValue.copy(boClubServiceVdoingDetailValue);
		return (DataContainer) clubServiceVdoingDetailValue;
	}

	protected Parameter buildParameter(DataContainer[] conditionDCs) throws Exception {
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { conditionDCs[0] }, BOCmClubServiceVdoingDetailBean.class);
		StringBuilder condition = new StringBuilder();
		condition.append(BOCmClubServiceVdoingDetailBean.S_State).append(" = :state ").append(" AND ").append(parameter.getCondition());
		parameter.setCondition(condition.toString());
		parameter.getParameter().put("state", CmConstants.RecordState.USE);
		return parameter;
	}
}
