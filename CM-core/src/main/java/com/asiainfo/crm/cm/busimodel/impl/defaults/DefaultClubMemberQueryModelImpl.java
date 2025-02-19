/**
 * Copyright: Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName: DefaultClubMemberQueryModelImpl.java
 * @Description: 该类的功能描述
 * 
 * @version: v1.0.0
 * @author: LSC
 * @date: 2012-4-7 下午3:59:25
 * 
 * Modification History: Date Author Version Description ---------------------------------------------------------*
 * 2012-4-7 LSC v1.0.0 修改原因
 */

package com.asiainfo.crm.cm.busimodel.impl.defaults;

import java.util.Iterator;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.club.AbstractClubMemberQueryModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubMemberBean;
import com.asiainfo.crm.cm.model.bo.ClubMemberBean;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberCardValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.ICustManagerValue;

public class DefaultClubMemberQueryModelImpl extends AbstractClubMemberQueryModelImpl {


	protected Parameter buildBatchCustIdParam(long[] custId, long clubId) throws Exception {
		Parameter parameter = ParamUtil.buildInParameter(custId, ClubMemberBean.S_CustId);
		parameter.setBeanClass(getQueryBOBeanClassByClubId(clubId));
		StringBuilder condition = new StringBuilder(parameter.getCondition());
		condition.append(" AND ").append(ClubMemberBean.S_ClubId).append("=:").append(ClubMemberBean.S_ClubId);
		condition.append(" AND ").append(ClubMemberBean.S_State).append("=:").append(ClubMemberBean.S_State);
		parameter.put(ClubMemberBean.S_ClubId, clubId);
		parameter.put(ClubMemberBean.S_State, CmConstants.RecordState.USE);
		return parameter;
	}

	protected Parameter buildParameter(DataContainer[] containerDCs) throws Exception {
		Map paramMap = ParamUtil.transferDataContainersToMap(containerDCs);
		// 查询条件中俱乐部编号必须存在
		/*
		 * if (!paramMap.containsKey(IClubMemberValue.S_ClubId)) { // 参数俱乐部编号不能为空！ if (log.isErrorEnabled()) {
		 * log.error(CrmLocaleFactory.getResource("CMS0000360", CrmLocaleFactory.getResource("CMS0088052"))); }
		 * ExceptionUtil.throwBusinessException("CMS0000360", CrmLocaleFactory.getResource("CMS0088052")); } long clubId =
		 * DataType.getAsLong(paramMap.get(IClubMemberValue.S_ClubId));
		 */
		Parameter parameter = ParamUtil.buildParameter(paramMap, BOCmClubMemberBean.class);
		// 增加如果通过时间段限制的查询支持
		StringBuilder condition = new StringBuilder(parameter.getCondition());
		// 加入时间限制
		if (containerDCs[0].get("StartTime") != null) {
			condition.append(" And ").append(IClubMemberValue.S_CreateDate).append(" >to_Date(:StartTime,'yyyy-MM-dd') ");
			parameter.getParameter().put("StartTime", containerDCs[0].get("StartTime"));
		}
		if (containerDCs[0].get("EndTime") != null) {
			condition.append(" AND ").append(IClubMemberValue.S_CreateDate).append(" <to_Date(:EndTime,'yyyy-MM-dd') ");
			parameter.getParameter().put("EndTime", containerDCs[0].get("EndTime"));
		}
		// 是否查询VIP
		if (containerDCs[0].get("IS_VIP") != null && Integer.parseInt(containerDCs[0].get("IS_VIP").toString()) == CmConstants.CommonPageParamName.IS_VIP_TRUE) {
			condition.append(" AND ").append(IClubMemberValue.S_MemberLevel).append(" in(").append(CmConstants.CommonPageParamName.IS_VIP).append(")");
		}
		parameter.setCondition(condition.toString());
		return parameter;
	}

	protected void doAfterQueryById(ClubMemberBean clubMemberValue) throws Exception {
		// 查询客户经理信息
		if (clubMemberValue.getCustId() > 0) {
			ICustManagerValue mainCustManagerValue = CmServiceFactory.getCustomerSV().queryMainCustManagersByCustId(clubMemberValue.getCustId());
			if (CmCommonUtil.isNotEmptyObject(mainCustManagerValue)) {
				Iterator it = mainCustManagerValue.getProperties().entrySet().iterator();
				while (it.hasNext()) {
					Map.Entry entry = (Map.Entry) it.next();
					// 将查询出来的客户经理信息全部塞到俱乐部会员信息对象中
					if (!clubMemberValue.hasProperty(entry.getKey().toString())) {
						clubMemberValue.initProperty(entry.getKey().toString(), entry.getValue());
					}
				}
			}
		}
		// 查询俱乐部会员会员卡信息
		IClubMemberCardValue currCardValue = CmServiceFactory.getClubMemberSV().queryClubMemberCardByMemberId(clubMemberValue.getMemberId());
		if (CmCommonUtil.isNotEmptyObject(currCardValue)) {
			Iterator it = currCardValue.getProperties().entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry entry = (Map.Entry) it.next();
				// 将查询出来的会员卡信息全部塞到俱乐部会员信息对象中
				if (!clubMemberValue.hasProperty(entry.getKey().toString())) {
					clubMemberValue.initProperty(entry.getKey().toString(), entry.getValue());
				}
			}
		}
	}

	protected Class getQueryBOBeanClassByClubId(long clubId) throws Exception {
		return BOCmClubMemberBean.class;
	}
}
