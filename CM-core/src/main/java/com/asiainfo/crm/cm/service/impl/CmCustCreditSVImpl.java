package com.asiainfo.crm.cm.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.service.interfaces.ICmAccountSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustCreditSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;

public class CmCustCreditSVImpl implements ICmCustCreditSV {

	@Override
	public long queryCustCredit(long custId, long acctId) throws Exception {
		if (custId > 0 && acctId <= 0) {
			ICmCustomerSV service = (ICmCustomerSV) ServiceFactory
					.getService(ICmCustomerSV.class);
			ICustomerValue customerValue = service
					.queryCustomerByCustId(custId);
			long creditValue = Long.valueOf(customerValue.getCreditValue());
			if (creditValue == 0) {
				ICmAccountSV service1 = (ICmAccountSV) ServiceFactory
						.getService(ICmAccountSV.class);
				IAccountValue[] accountValues = service1
						.queryAccountByCondition(custId, -1, -1);
				List<Long> list = new ArrayList<Long>();
				for (int i = 0; i < accountValues.length; i++) {
					list.add(accountValues[i].getCreditValue());
				}
				return Collections.max(list);
			} else {
				return creditValue;
			}
		}
		if (custId <= 0 && acctId > 0) {
			ICmAccountSV service = (ICmAccountSV) ServiceFactory
					.getService(ICmAccountSV.class);
			IAccountValue accountValue = service.queryAccountById(acctId);
			return accountValue.getCreditValue();
		}
		if (custId > 0 && acctId > 0) {
			ICmAccountSV service = (ICmAccountSV) ServiceFactory
					.getService(ICmAccountSV.class);
			IAccountValue accountValue = service.queryAccountById(acctId);
			return accountValue.getCreditValue();
		}
		return -1;
	}

}
