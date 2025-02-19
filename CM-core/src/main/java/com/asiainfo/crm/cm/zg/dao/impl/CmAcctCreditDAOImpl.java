package com.asiainfo.crm.cm.zg.dao.impl;

import java.util.Map;

import com.asiainfo.crm.cm.zg.bo.IAccBusiCreditEngine;
import com.asiainfo.crm.cm.zg.bo.IRaccOperEngine;
import com.asiainfo.crm.cm.zg.dao.interfaces.ICmAcctCreditDAO;
import com.asiainfo.crm.cm.zg.ivalues.IIAccBusiCreditValue;
import com.asiainfo.crm.cm.zg.ivalues.IIRaccOperValue;

public class CmAcctCreditDAOImpl implements ICmAcctCreditDAO {

	public IIAccBusiCreditValue[] queryAcctCredit(String condition, Map parameter) throws Exception {
		IIAccBusiCreditValue[] accBusiCreditValues = IAccBusiCreditEngine.getBeans(condition, parameter);
		return accBusiCreditValues;
	}

	public void saveAccBusiCredit(IIAccBusiCreditValue accBusiCreditValue) throws Exception {
		IAccBusiCreditEngine.save(accBusiCreditValue);
	}

	public void saveIRaccOper(IIRaccOperValue raccOperValue) throws Exception {
		IRaccOperEngine.save(raccOperValue);
	}

}
