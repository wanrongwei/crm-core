package com.asiainfo.crm.cm.common.tab;

import java.util.Date;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.complex.tab.split.function.IFunction;
import com.ai.common.util.TimeUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;

/**
 * 
* @Package: com.asiainfo.crm.customer.common.tab   
* @Classname: LastNumberFunctionImpl.java
* Description: 按末位分表的实现类
* Copyright: Copyright (c) 2011
* Company: AsiaInfo-linkage
* @author: xialing
* @version: v1.0.0
* Create at: Jan 25, 2011 9:22:42 AM 
* 
* Modification History:
* Date               Author            Version            Description
* -------------------------------------------------------------------
* Jan 25, 2011     xialing             v1.0.0               修改原因
 */
public class LastNumberFunctionImpl implements IFunction {

	public LastNumberFunctionImpl() {
	}

	public String convert(Object obj) throws Exception {
		String year = TimeUtil.getYYYYMM(new Date());
		String lastNumber = (obj == null) ? "0" : StringUtils.right(obj.toString().trim(), 1);
		return year + "_" + lastNumber;
	}

	

}
