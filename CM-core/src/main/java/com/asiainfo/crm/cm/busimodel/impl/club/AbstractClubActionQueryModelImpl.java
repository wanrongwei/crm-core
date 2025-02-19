/**
 * Copyright: Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName: AbstractClubActionQueryModelImpl.java
 * @Description: 该类的功能描述
 * 
 * @version: v1.0.0
 * @author: LSC
 * @date: 2012-4-9 下午8:06:34
 * 
 *        Modification History:
 *        Date Author Version Description
 *        ---------------------------------------------------------*
 *        2012-4-9 LSC v1.0.0 修改原因
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
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubActionBean;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubActionValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bo.ClubActionBean;
import com.asiainfo.crm.cm.model.ivalues.IClubActionValue;

public class AbstractClubActionQueryModelImpl extends AbstractQueryBusiModelImpl implements IQueryCountBusiModel, IQueryDataBusiModel {

	public DataContainer queryClubActionByActionId(long actionId) throws Exception {
		BOCmClubActionBean bean = new BOCmClubActionBean();
		bean.setActionId(actionId);
		IBOCmClubActionValue boClubActionValue = (IBOCmClubActionValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
		if (!CmCommonUtil.isNotEmptyObject(boClubActionValue)) {
			return null;
		}
		ClubActionBean clubActionValue = new ClubActionBean();
		clubActionValue.copy(boClubActionValue);
		return clubActionValue;
	}

	public DataContainer[] queryClubActions(DataContainer[] condition, int startNum, int endNum) throws Exception {
		Parameter parameter = buildQueryCondition(condition);
		IBOCmClubActionValue[] boClubActionValues = (IBOCmClubActionValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(), parameter.getCondition(),
				parameter.getParameter(), startNum, endNum);
		if (!CmCommonUtil.isNotEmptyObject(boClubActionValues)) {
			return new ClubActionBean[0];
		}
		IClubActionValue[] clubActionValues = new ClubActionBean[boClubActionValues.length];
		// 数据类型转换
		for (int i = 0; i < clubActionValues.length; i++) {
			clubActionValues[i] = new ClubActionBean();
			clubActionValues[i].copy(boClubActionValues[i]);
		}
		return (DataContainer[]) clubActionValues;
	}

	protected Parameter buildQueryCondition(DataContainer[] conditionDCs) throws Exception {
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { conditionDCs[0] }, BOCmClubActionBean.class);
		StringBuilder condition = new StringBuilder();
		condition.append(BOCmClubActionBean.S_State).append(" = :state ").append(" AND ").append(parameter.getCondition());
		parameter.setCondition(condition.toString());
		parameter.getParameter().put("state", CmConstants.RecordState.USE);
		return parameter;
	}

	protected Parameter buildParameter(DataContainer[] conditionDCs) throws Exception {
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { conditionDCs[0] }, BOCmClubActionBean.class);
		StringBuilder condition = new StringBuilder();
		condition.append(BOCmClubActionBean.S_State).append(" = :state ").append(" AND ").append(parameter.getCondition());
		parameter.setCondition(condition.toString());
		parameter.getParameter().put("state", CmConstants.RecordState.USE);
		return parameter;
	}

	protected Class getReturnObjectClass() {
		return ClubActionBean.class;
	}
	
}
