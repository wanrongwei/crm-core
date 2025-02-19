package com.asiainfo.crm.cm.customer.group.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.ai.omframe.common.service.interfaces.CenterConst;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupAcctProductSV;
import com.asiainfo.crm.so.query.ivalues.IQUserRelInfoValue;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ISoBusiSV;

public class CmGroupAcctProductSVImpl implements ICmGroupAcctProductSV {
    
    public static transient Log log = LogFactory.getLog(CmGroupAcctProductSVImpl.class);

   

    public IQUserRelInfoValue[] queryInfo(String acctId) throws Exception {
	
	if ("".equals(acctId)) {
		// 输入参数不合法！
		ExceptionUtil.throwBusinessException("CMS0000073");
	}
	
	Long id =  Long.parseLong(acctId);
	CenterFactory.setCenterInfoByTypeAndValue(CenterConst.ACC_ID, acctId);
	ISoBusiSV sv = (ISoBusiSV) ServiceFactory.getCrossCenterService(ISoBusiSV.class);
	
	return sv.getAcctrelProdByAcctId(id);
    }

}
