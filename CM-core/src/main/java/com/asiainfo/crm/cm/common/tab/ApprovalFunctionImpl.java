package com.asiainfo.crm.cm.common.tab;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.complex.tab.split.function.IFunction;
import com.ai.common.util.ExceptionUtil;

public class ApprovalFunctionImpl implements IFunction {

	public String convert(Object obj) throws Exception {
		String value = null;
		if (obj == null) {
           ExceptionUtil.throwBusinessException("SCS0040065");
		} else {
			DateFormat objDateFormat = new SimpleDateFormat("yyyy");
            String rtn = objDateFormat.format(obj);
			value = TenantIDFactory.getTenant()+ "_" +rtn;
		}
		return value;
	}

}
