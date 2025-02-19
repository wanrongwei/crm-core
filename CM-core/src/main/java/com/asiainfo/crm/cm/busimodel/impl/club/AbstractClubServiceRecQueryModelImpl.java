/**
 * Copyright: Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName: AbstractClubServiceRecQueryModelImpl.java
 * @Description: 该类的功能描述
 * 
 * @version: v1.0.0
 * @author: LSC
 * @date: 2012-4-9 下午2:03:48
 * 
 *        Modification History:
 *        Date Author Version Description
 *        ---------------------------------------------------------*
 *        2012-4-9 LSC v1.0.0 修改原因
 */

package com.asiainfo.crm.cm.busimodel.impl.club;

import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubServiceBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubServiceRecBean;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubServiceRecValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bo.ClubServiceRecBean;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceRecValue;

public abstract class AbstractClubServiceRecQueryModelImpl extends AbstractQueryBusiModelImpl implements IQueryCountBusiModel, IQueryDataBusiModel {

	/**
	 * 查询一个会员参加多个服务的服务记录
	 * @param conditionDCs
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author liaosc
	 * @date Jun 1, 2012 4:19:30 PM 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 1, 2012     liaosc        v1.0.0               修改原因<br>
	 */
	public DataContainer[] queryClubServiceRecsInDcs(long memberId, long serviceId[], int startNum, int endNum) throws Exception {
		Parameter parameter = ParamUtil.buildInParameter(serviceId, BOCmClubServiceRecBean.S_ServiceId);
		StringBuilder condition = new StringBuilder(parameter.getCondition());
		Map param = parameter.getParameter();
		condition.append(" AND ").append(BOCmClubServiceRecBean.S_MemberId).append(" =:memberId");
		param.put("memberId", memberId);
		IBOCmClubServiceRecValue[] boClubServiceRecValues = (IBOCmClubServiceRecValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(),
				condition.toString(), param, startNum, endNum);
		if (!CmCommonUtil.isNotEmptyObject(boClubServiceRecValues)) {
			return new ClubServiceRecBean[0];
		}
		IClubServiceRecValue[] clubServiceRecValues = new ClubServiceRecBean[boClubServiceRecValues.length];
		// 数据类型转换
		for (int i = 0; i < clubServiceRecValues.length; i++) {
			clubServiceRecValues[i] = new ClubServiceRecBean();
			clubServiceRecValues[i].copy(boClubServiceRecValues[i]);
		}
		return (DataContainer[]) clubServiceRecValues;
	}

	protected Parameter buildParameter(DataContainer[] conditionDCs) throws Exception {
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { conditionDCs[0] }, BOCmClubServiceRecBean.class);
		StringBuilder condition = new StringBuilder();
		condition.append(BOCmClubServiceBean.S_State).append(" = :state ").append(" AND ").append(parameter.getCondition());
		parameter.setCondition(condition.toString());
		parameter.getParameter().put("state", CmConstants.RecordState.USE);
		return parameter;
	}
	
	protected Class getReturnObjectClass() {
		return ClubServiceRecBean.class;
	}
}
