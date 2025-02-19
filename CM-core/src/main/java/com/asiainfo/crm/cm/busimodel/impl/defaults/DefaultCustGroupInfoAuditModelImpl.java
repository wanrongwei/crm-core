package com.asiainfo.crm.cm.busimodel.impl.defaults;

import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustGroupInfoAuditModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupAuditInfoBean;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupAuditInfoValue;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubMemberBean;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberCardValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberValue;

public class DefaultCustGroupInfoAuditModelImpl extends AbstractCustGroupInfoAuditModelImpl{

	
	protected Parameter buildParameter(DataContainer[] conditionDCs)
			throws Exception {
		// TODO Auto-generated method stub
		Map paramMap = ParamUtil.transferDataContainersToMap(conditionDCs);
		Parameter parameter = ParamUtil.buildParameter(paramMap, BOCmGroupAuditInfoBean.class);
		// 增加审核查询判断
		StringBuilder condition = new StringBuilder(parameter.getCondition());
		// 1 .查询1级审核数据。 2.查询2级审核数据
		if ("1".equals(paramMap.get("CREIDT_AUDIT_ROLE"))){
			condition.append(" And ").append(IBOCmGroupAuditInfoValue.S_OldAuditId).append(" is NULL ");
		}
		if ("2".equals(paramMap.get("CREIDT_AUDIT_ROLE"))) {
			condition.append(" And ").append(IBOCmGroupAuditInfoValue.S_OldAuditId).append(" is not NULL ");
		}
		// 加入时间限制
		if (paramMap.get("START_DATE") != null) {
			condition.append(" And ").append(IBOCmGroupAuditInfoValue.S_CreateDate).append(" >to_Date(:StartTime,'yyyy-MM-dd') ");
			parameter.getParameter().put("StartTime", paramMap.get("START_DATE"));
		}
		if (paramMap.get("END_DATE") != null) {
			condition.append(" AND ").append(IBOCmGroupAuditInfoValue.S_CreateDate).append(" <to_Date(:EndTime,'yyyy-MM-dd') ");
			parameter.getParameter().put("EndTime", paramMap.get("END_DATE"));
		}
		parameter.setCondition(condition.toString());
		return parameter;
	}

}
