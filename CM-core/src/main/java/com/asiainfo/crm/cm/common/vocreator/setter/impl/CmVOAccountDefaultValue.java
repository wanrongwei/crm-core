package com.asiainfo.crm.cm.common.vocreator.setter.impl;

import com.ai.appframe2.common.DataStructInterface;
import com.asiainfo.crm.cm.common.vocreator.CmValueObjectCreator;
import com.asiainfo.crm.cm.model.bean.VOAccountBean;
import com.asiainfo.crm.cm.model.bo.AccountBean;
import com.asiainfo.crm.cm.model.bo.AcctBillCycleBean;
import com.asiainfo.crm.cm.model.bo.AcctPaymentBean;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;

public class CmVOAccountDefaultValue {

	/**
	 * dc为客户信息
	 */
	public static IVOAccountValue getDefaultValue(DataStructInterface dc) throws Exception {
		ICustomerValue customerValue = (ICustomerValue) dc;
		IAccountValue accountValue = (IAccountValue) CmValueObjectCreator.create(AccountBean.class, customerValue);
		IAcctBillCycleValue acctPeriodValue = (IAcctBillCycleValue) CmValueObjectCreator.create(AcctBillCycleBean.class, accountValue);
		IAcctPaymentValue acctPaymentValue = (IAcctPaymentValue) CmValueObjectCreator.create(AcctPaymentBean.class, accountValue);
		IVOAccountValue voAccountValue = new VOAccountBean();
		voAccountValue.setAccount(accountValue);
		voAccountValue.setBillCycle(acctPeriodValue);
		voAccountValue.addPayment(acctPaymentValue);
		return voAccountValue;
	}

}
