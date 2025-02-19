package com.asiainfo.crm.cm.ln.customer.indiv.service.impl;

import java.util.HashMap;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.customer.speusermain.bo.BOCmUserSpeuserMainEngine;
import com.asiainfo.crm.cm.customer.speusermain.ivalues.IBOCmUserSpeuserMainValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.customer.indiv.bo.BOCmUserSpeuserMainHEngine;
import com.asiainfo.crm.cm.ln.customer.indiv.bo.BOLnCmxIndivCustomerBean;
import com.asiainfo.crm.cm.ln.customer.indiv.ivalues.IBOCmUserSpeuserMainHValue;
import com.asiainfo.crm.cm.ln.customer.indiv.ivalues.IBOLnCmxIndivCustomerValue;
import com.asiainfo.crm.cm.ln.customer.indiv.service.interfaces.ICmLnIndivSV;

public class CmLnIndivSVImpl implements ICmLnIndivSV {

	public void saveIndivExt(IBOLnCmxIndivCustomerValue[] cmxIndivCustomerValues) throws Exception {
		int len = cmxIndivCustomerValues.length;
		BOLnCmxIndivCustomerBean[] indivCustomerBeans = new BOLnCmxIndivCustomerBean[len];
		for (int i = 0; i < len; i++) {
			indivCustomerBeans[i] = new BOLnCmxIndivCustomerBean();
			indivCustomerBeans[i].copy(cmxIndivCustomerValues[i]);
			if (StringUtils.isBlank(indivCustomerBeans[i].getState())) {
				indivCustomerBeans[i].setState(CmConstants.RecordState.USE);
			}
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBeans(indivCustomerBeans);
	}

	public IBOLnCmxIndivCustomerValue queryLnIndivCustExt(long custId) throws Exception {
		IBOLnCmxIndivCustomerValue cmxIndivCustomerValue = new BOLnCmxIndivCustomerBean();
		cmxIndivCustomerValue.setCustId(custId);
		DataContainerInterface dc = CmInnerServiceFactory.getCommonInnerSV().getBean((DataContainerInterface) cmxIndivCustomerValue);
		return (IBOLnCmxIndivCustomerValue) dc;
	}
	
	public IBOCmUserSpeuserMainValue[] queryCmUserSpeuserMainByMobile(long acctId,
			long mobile) throws Exception {
		if (acctId==-1 && mobile==-1) {
			// 传入数据不合法，无法操作！
			ExceptionUtil.throwBusinessException("CMS8000029");
		}
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
	    HashMap paraMap = new HashMap();
	    if (acctId!=-1) {
	    	condition.append(" and ").append(IBOCmUserSpeuserMainValue.S_AcctId).append(" =:acctId");
	   		paraMap.put("acctId", acctId);
		}
	    if (mobile!=-1) {
	    	condition.append(" and ").append(IBOCmUserSpeuserMainValue.S_PhoneId).append(" =:mobile");
	   		paraMap.put("mobile", mobile);
		}
	    return BOCmUserSpeuserMainEngine.getBeans(null, condition.toString(), paraMap, -1, -1, true);
	}

	

}
