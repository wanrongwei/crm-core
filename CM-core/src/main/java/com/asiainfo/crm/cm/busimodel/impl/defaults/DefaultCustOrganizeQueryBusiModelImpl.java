package com.asiainfo.crm.cm.busimodel.impl.defaults;

import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataType;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustOrganizeQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgStructBean;
import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;

public class DefaultCustOrganizeQueryBusiModelImpl extends AbstractCustOrganizeQueryBusiModelImpl {

	protected Parameter buildParameter(DataContainer[] conditionDCs) throws Exception {
		Map paramMap = ParamUtil.transferDataContainersToMap(conditionDCs);
		Parameter parameter = null;
		if (paramMap.containsKey(ICustOrganizeValue.S_DeptName)) {
			if (!paramMap.containsKey(CmConstants.MatchType.ATTR_CODE_MATCH_TYPE)) {
				paramMap.put(CmConstants.MatchType.ATTR_CODE_MATCH_TYPE, CmConstants.MatchType.RIGHT_MATCH);
			}
			if (paramMap.containsKey(CmConstants.MatchType.ATTR_CODE_MATCH_TYPE) && CmConstants.MatchType.EXACT_MATCH == Integer.parseInt(paramMap.get(CmConstants.MatchType.ATTR_CODE_MATCH_TYPE).toString())){
				parameter = ParamUtil.buildParameter(paramMap, BOCmGroupOrgStructBean.class, null);
			}else{
				parameter = ParamUtil.buildParameter(paramMap, BOCmGroupOrgStructBean.class, new String[] { ICustOrganizeValue.S_DeptName });
			}

		} else {
			parameter = ParamUtil.buildParameter(paramMap, BOCmGroupOrgStructBean.class);
		}
		// 对上级部门编号查询条件做特殊处理
		if (paramMap.containsKey(ICustOrganizeValue.S_ParentDeptId) && DataType.getAsLong(paramMap.get(ICustOrganizeValue.S_ParentDeptId)) <= 0) {
			StringBuilder sql = new StringBuilder(parameter.getCondition());
			sql.append(" AND (").append(ICustOrganizeValue.S_ParentDeptId).append(" = 0 OR ").append(ICustOrganizeValue.S_ParentDeptId).append(" IS NULL )");
			parameter.setCondition(sql.toString());
		}
		return parameter;
	}

}
