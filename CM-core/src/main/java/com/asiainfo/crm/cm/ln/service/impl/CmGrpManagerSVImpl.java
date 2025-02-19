package com.asiainfo.crm.cm.ln.service.impl;

import java.util.HashMap;

import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupManagerBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupManagerValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.service.interfaces.ICmGrpManagerSV;

public class CmGrpManagerSVImpl implements ICmGrpManagerSV {

	public IBOCmGroupManagerValue[] queryCmGrpManagerValues(long custId)throws Exception {
		if (custId <= 0) {
			// 客户编号不能为空！
			ExceptionUtil.throwBusinessException("CMS5000001");
		}
		HashMap parameter = new HashMap();
		StringBuilder condition = new StringBuilder(" 1=1 ");
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmGroupManagerValue.S_CustId).append(" =:custId ");
			parameter.put("custId", Long.valueOf(custId));
		}
		return (IBOCmGroupManagerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupManagerBean.class, condition.toString(), parameter, -1, -1);
	}


}
