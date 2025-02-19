package com.asiainfo.crm.cm.busimodel.impl.defaults;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.contact.AbstractAddAcctContQryBusiModelImpl;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.contact.bo.QBOCmPartyContactBean;

public class DefaultAddAcctContQryBusiModelImpl extends AbstractAddAcctContQryBusiModelImpl {

	protected Parameter buildParameter(DataContainer[] conditions) throws Exception {
		if (!CmCommonUtil.isNotEmptyObject(conditions)) {
			ExceptionUtil.throwBusinessException("CMS0010034");// 查询条件不可全为空！
		}
		Map prop = new HashMap();
		for (int i = 0; i < conditions.length; i++) {
			prop.putAll(conditions[i].getProperties());
		}
		if (!CmCommonUtil.isNotEmptyObject(prop)) {
			ExceptionUtil.throwBusinessException("CMS0010034");// 查询条件不可全为空！
		}
		Parameter parameter = ParamUtil.buildParameter(prop, QBOCmPartyContactBean.class);
		return parameter;
	}


}
