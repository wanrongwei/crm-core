package com.asiainfo.crm.cm.common.tab;

import com.ai.appframe2.complex.tab.split.function.IFunction;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.ExceptionUtil;

public class AccountIdFunctionImpl implements IFunction {

	public String convert(Object obj) throws Exception {
		String value = null;
		if (obj == null) {
           ExceptionUtil.throwBusinessException("SCS0040065");
		} else {
			long accountId = Long.parseLong(String.valueOf(obj));
			value = CenterUtil.getRegionIdByAcctId(accountId);
		}

		return value;

	}

}
