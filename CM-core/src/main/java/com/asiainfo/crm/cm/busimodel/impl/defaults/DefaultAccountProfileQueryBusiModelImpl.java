/**
 * 
 */
package com.asiainfo.crm.cm.busimodel.impl.defaults;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.account.AbstractAccountProfileQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.inner.account.bo.QBOCmAccountProfileBean;
import com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName DefaultAccountProfileQueryBusiModelImpl
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-4-26 下午9:57:55
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-4-26     huzq2           v1.0.0               修改原因<br>
 */
public class DefaultAccountProfileQueryBusiModelImpl extends AbstractAccountProfileQueryBusiModelImpl {

	public Parameter buildParameter(DataContainer[] criteria) throws Exception {
		Map param = new HashMap();
		for (int i = 0; i < criteria.length; i++) {
			param.putAll(criteria[i].getProperties());
		}
		Parameter parameter = ParamUtil.buildParameter(param, QBOCmAccountProfileBean.class);
		StringBuilder condition = new StringBuilder(parameter.getCondition());
		// 加上state状态限定
		condition.append(" AND ").append(IAccountProfileValue.S_AcctState).append(" = :acctState ");
		parameter.getParameter().put("acctState", CmConstants.RecordState.USE);
		condition.append(" AND ").append(IAccountProfileValue.S_PayState).append(" = :payState ");
		parameter.getParameter().put("payState", CmConstants.RecordState.USE);
		condition.append(" AND ").append(IAccountProfileValue.S_CycleState).append(" = :cycleState ");
		parameter.getParameter().put("cycleState", CmConstants.RecordState.USE);
		condition.append(" AND (").append(" D.EXPIRE_DATE  ").append(" >= now() OR ");
		condition.append(" D.EXPIRE_DATE ").append(" is null )");
		condition.append(" AND (").append(" D.EFFECTIVE_DATE ").append(" < now() OR ");
		condition.append(" D.EFFECTIVE_DATE ").append(" is null )");
		parameter.setCondition(condition.toString());
		return parameter;
	}
}
