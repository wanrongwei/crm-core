/**
 * Copyright: Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName: AbstractClubMemberQueryModelImpl.java
 * @Description: 该类的功能描述
 * 
 * @version: v1.0.0
 * @author: LSC
 * @date: 2012-4-7 下午2:31:27
 * 
 * Modification History: Date Author Version Description ---------------------------------------------------------*
 * 2012-4-7 LSC v1.0.0 修改原因
 */

package com.asiainfo.crm.cm.busimodel.impl.club;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubServiceCylceBean;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubServiceCylceValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bo.ClubServiceCylceBean;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceCylceValue;

public abstract class AbstractClubServiceCycleQueryModelImpl extends AbstractQueryBusiModelImpl implements IQueryCountBusiModel, IQueryDataBusiModel {

	protected Class getReturnObjectClass() {
		return ClubServiceCylceBean.class;
	}

	public DataContainer queryServiceCycleById(long cycleId) throws Exception {
		BOCmClubServiceCylceBean bean = new BOCmClubServiceCylceBean();
		bean.setCycleId(cycleId);
		IBOCmClubServiceCylceValue boClubServiceCylceValue = (IBOCmClubServiceCylceValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
		if (!CmCommonUtil.isNotEmptyObject(boClubServiceCylceValue)) {
			return null;
		}
		IClubServiceCylceValue clubServiceCylceValue = new ClubServiceCylceBean();
		clubServiceCylceValue.copy(boClubServiceCylceValue);
		return (DataContainer) clubServiceCylceValue;
	}
	
	protected Parameter buildParameter(DataContainer[] conditionDCs) throws Exception {
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { conditionDCs[0] }, BOCmClubServiceCylceBean.class);
		StringBuilder condition = new StringBuilder();
		condition.append(BOCmClubServiceCylceBean.S_State).append(" = :state ").append(" AND ").append(parameter.getCondition());
		parameter.setCondition(condition.toString());
		parameter.getParameter().put("state", CmConstants.RecordState.USE);
		return parameter;
	}
}
