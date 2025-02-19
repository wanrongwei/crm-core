package com.asiainfo.crm.cm.inner.account.service.impl;

import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.CmxServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmAccountHisValue;
import com.asiainfo.crm.cm.inner.account.service.interfaces.ICmAccountHisSV;

public class CmAccountHisSVImpl implements ICmAccountHisSV{

	public IBOCmAccountHisValue[] queryAccountHis(long acctId, String acctName,
			String startDate, String endDate, int startNum, int endNum)
			throws Exception {
		// TODO Auto-generated method stub
		IBOCmAccountHisValue[] AccountHValues = CmServiceFactory.getAccountSV().queryAccountHis(acctId, acctName, "", startDate,
		endDate, startNum, endNum);
		if (CmCommonUtil.isNotEmptyObject(AccountHValues)) {
			return AccountHValues;
		}
		// }
		return new IBOCmAccountHisValue[0];
	}

	public int queryAccountHisCount(long acctId, String acctName,
			String startDate, String endDate) throws Exception {
		// TODO Auto-generated method stub
		return CmServiceFactory.getAccountSV().queryAccountHisCount(acctId, acctName, "", startDate, endDate);
	}
	
}
