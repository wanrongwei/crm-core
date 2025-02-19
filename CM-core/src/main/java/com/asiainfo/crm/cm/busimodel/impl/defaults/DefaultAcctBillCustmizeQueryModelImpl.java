package com.asiainfo.crm.cm.busimodel.impl.defaults;

import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataType;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.account.AbstractAcctBillCustmizeQueryModelImpl;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.account.bo.BOCmBillCustomizeBean;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCustomizeValue;

/**   
* @Copyright Copyright (c) 2011 Asiainfo-Linkage
* @ClassName DefaultAcctBillCustmizeQueryModelImpl
* @Description 查询账户客户化帐单定制处理的默认继承类，提供创建类对象使用
*
*
* @version: v1.0.0
* @author: zhangyin
* @date: 2011-12-28 上午10:13:08 
*
* Modification History:
* Date               Author            Version            Description
* -------------------------------------------------------------------
* 2011-12-28        zhangyin            v1.0.0                 修改原因
*/
public class DefaultAcctBillCustmizeQueryModelImpl extends AbstractAcctBillCustmizeQueryModelImpl {


	protected Parameter buildParameter(DataContainer[] conditionDCs) throws Exception {
		Map condMap = ParamUtil.transferDataContainersToMap(conditionDCs);
		if (CmCommonUtil.isEmptyObject(condMap)) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		Parameter parameter = ParamUtil.buildParameter(condMap, BOCmBillCustomizeBean.class);

		if (condMap.containsKey("queryType") && DataType.getAsLong("queryType") == 1) {
			StringBuilder condition = new StringBuilder();
			condition.append(" AND ").append(BOCmBillCustomizeBean.S_EffectiveDate).append(" < now() ");
			condition.append(" AND ").append(BOCmBillCustomizeBean.S_ExpireDate).append(" > now() ");
			parameter.setCondition(condition.insert(0, parameter.getCondition()).toString());
		}
		return parameter;
	}

	@Override
	protected void afterQueryAcctBillCustomizeById(IAcctBillCustomizeValue acctBillCustomizeValue) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
