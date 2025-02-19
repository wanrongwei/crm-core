package com.asiainfo.crm.cm.busimodel.impl.defaults;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.account.AbstractLnAccountProfileQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.ln.account.bo.BOCmAccountPaymentBean;
import com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue;

public class DefaultLnAccountProfileQueryBusiModelImpl extends AbstractLnAccountProfileQueryBusiModelImpl {

	public Parameter buildParameter(DataContainer[] criteria) throws Exception {
		Map param = new HashMap();
		for (int i = 0; i < criteria.length; i++)
			param.putAll(criteria[i].getProperties());

		Parameter parameter = ParamUtil.buildParameter(param, BOCmAccountPaymentBean.class);
		StringBuilder condition = new StringBuilder(parameter.getCondition());
		// 加上state状态限定
//		condition.append(" AND ").append(IAccountProfileValue.S_AcctState).append(" = :acctState ");
//		parameter.getParameter().put("acctState", CmConstants.RecordState.USE);
		condition.append(" AND ").append(IAccountProfileValue.S_PayState).append(" = :payState ");
		parameter.getParameter().put("payState", CmConstants.RecordState.USE);
		condition.append(" AND ").append(IAccountProfileValue.S_CycleState).append(" = :cycleState ");
		parameter.getParameter().put("cycleState", CmConstants.RecordState.USE);
		condition.append(" AND (").append("C.EXPIRE_DATE").append(" >= now() OR ");
		condition.append("C.EXPIRE_DATE").append(" is null )");
		condition.append(" AND (").append("C.EFFECTIVE_DATE").append(" < now() OR ");
		condition.append("C.EFFECTIVE_DATE").append(" is null )");
		parameter.setCondition(condition.toString());
		return parameter;
	}
}
