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
 *        Modification History:
 *        Date Author Version Description
 *        ---------------------------------------------------------*
 *        2012-4-7 LSC v1.0.0 修改原因
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
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubServiceBean;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubServiceValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bo.ClubServiceBean;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceValue;

public abstract class AbstractClubServiceQueryModelImpl extends AbstractQueryBusiModelImpl implements IQueryCountBusiModel, IQueryDataBusiModel {

	protected Class getReturnObjectClass() {
		return ClubServiceBean.class;
	}

	public DataContainer queryServiceById(long serviceId) throws Exception {
		BOCmClubServiceBean bean = new BOCmClubServiceBean();
		bean.setServiceId(serviceId);
		IBOCmClubServiceValue boClubServiceValues = (IBOCmClubServiceValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
		if (!CmCommonUtil.isNotEmptyObject(boClubServiceValues)) {
			return null;
		}
		IClubServiceValue clubServiceValue = new ClubServiceBean();
		clubServiceValue.copy(boClubServiceValues);
		return (DataContainer) clubServiceValue;
	}

	public DataContainer[] queryServicesByClubId(long clubId, int startNum, int endNum) throws Exception {
		BOCmClubServiceBean bean = new BOCmClubServiceBean();
		bean.setClubId(clubId);
		bean.setState(CmConstants.RecordState.USE);
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { bean }, BOCmClubServiceBean.class);
		IBOCmClubServiceValue[] boClubServiceValues = (IBOCmClubServiceValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(),
				parameter.getCondition(), parameter.getParameter(), startNum, endNum);
		IClubServiceValue[] clubServiceValues = new ClubServiceBean[boClubServiceValues.length];
		if (!CmCommonUtil.isNotEmptyObject(boClubServiceValues)) {
			return new ClubServiceBean[0];
		}
		// 数据类型转换
		for (int i = 0; i < clubServiceValues.length; i++) {
			clubServiceValues[i] = new ClubServiceBean();
			clubServiceValues[i].copy(boClubServiceValues[i]);
		}
		return (DataContainer[]) clubServiceValues;
	}

	protected Parameter buildParameter(DataContainer[] conditionDCs) throws Exception {
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { conditionDCs[0] }, BOCmClubServiceBean.class);
		StringBuilder condition = new StringBuilder();
		condition.append(BOCmClubServiceBean.S_State).append(" = :state ").append(" AND ").append(parameter.getCondition());
		parameter.setCondition(condition.toString());
		parameter.getParameter().put("state", CmConstants.RecordState.USE);
		return parameter;
	}
}
