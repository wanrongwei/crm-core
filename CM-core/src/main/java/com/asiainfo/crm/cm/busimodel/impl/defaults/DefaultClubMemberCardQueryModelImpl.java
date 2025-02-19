package com.asiainfo.crm.cm.busimodel.impl.defaults;

import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataType;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.club.AbstractClubMemberCardQueryModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubMemberCardBean;
import com.asiainfo.crm.cm.model.bo.ClubMemberCardBean;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberCardValue;
import com.asiainfo.crm.cm.model.ivalues.IClubValue;

public class DefaultClubMemberCardQueryModelImpl extends AbstractClubMemberCardQueryModelImpl {

	protected Parameter buildBatchMemberIdParam(long[] memberIds, long clubId, boolean isOnlyValidated, String sMemberid) throws Exception {
		Parameter parameter = ParamUtil.buildInParameter(memberIds, BOCmClubMemberCardBean.S_MemberId);
		parameter.setBeanClass(getQueryBOBeanClass(clubId));
		// 增加如果通过时间段限制的查询支持
		if (isOnlyValidated) {
			StringBuilder condition = new StringBuilder(parameter.getCondition());
			condition.append(" AND ").append(IClubMemberCardValue.S_EffectiveDate).append(" < now() ");
			condition.append(" AND ").append(IClubMemberCardValue.S_ExpireDate).append(" > now() ");
			condition.append(" AND ").append(IClubMemberCardValue.S_State).append(" = :").append(IClubMemberCardValue.S_State);
			parameter.setCondition(condition.toString());
			parameter.put(IClubMemberCardValue.S_State, CmConstants.RecordState.USE);
		}
		return parameter;
	}

	protected Parameter buildParameter(DataContainer[] containerDCs) throws Exception {
		Map paramMap = ParamUtil.transferDataContainersToMap(containerDCs);
		boolean isOnlyValidated = DataType.getAsBoolean(paramMap.get("IS_ONLY_VALIDATED"));
		long clubId = DataType.getAsLong(paramMap.get(IClubValue.S_ClubId));
		Parameter parameter = ParamUtil.buildParameter(containerDCs, getQueryBOBeanClass(clubId));
		// 增加如果通过时间段限制的查询支持
		if (isOnlyValidated) {
			StringBuilder condition = new StringBuilder(parameter.getCondition());
			condition.append(" AND ").append(IClubMemberCardValue.S_EffectiveDate).append(" < now() ");
			condition.append(" AND ").append(IClubMemberCardValue.S_ExpireDate).append(" > now() ");
			condition.append(" AND ").append(IClubMemberCardValue.S_State).append(" = :").append(IClubMemberCardValue.S_State);
			parameter.setCondition(condition.toString());
			parameter.put(IClubMemberCardValue.S_State, CmConstants.RecordState.USE);
		}
		return parameter;
	}

	protected void doAfterQueryById(ClubMemberCardBean clubMemberValue) throws Exception {
		//查询后操作
	}

	protected Class getQueryBOBeanClass(long clubId) throws Exception {
		return BOCmClubMemberCardBean.class;
	}
}
