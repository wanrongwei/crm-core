package com.asiainfo.crm.cm.busimodel.impl.club;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubServiceAdjustBean;
import com.asiainfo.crm.cm.model.bo.ClubServiceAdjustBean;

public abstract class AbstractClubServiceAdjustQueryModelImpl extends AbstractQueryBusiModelImpl implements IQueryCountBusiModel, IQueryDataBusiModel {

	protected Parameter buildParameter(DataContainer[] conditionDCs) throws Exception {
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { conditionDCs[0] }, BOCmClubServiceAdjustBean.class);
		StringBuilder condition = new StringBuilder();
		condition.append(BOCmClubServiceAdjustBean.S_State).append(" = :state ").append(" AND ").append(parameter.getCondition());
		parameter.setCondition(condition.toString());
		parameter.getParameter().put("state", CmConstants.RecordState.USE);
		return parameter;
	}

	protected Class getReturnObjectClass() {
		return ClubServiceAdjustBean.class;
	}
}
