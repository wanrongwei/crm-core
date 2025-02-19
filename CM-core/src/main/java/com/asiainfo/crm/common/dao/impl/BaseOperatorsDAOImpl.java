package com.asiainfo.crm.common.dao.impl;

import java.util.Map;

import com.asiainfo.crm.cm.common.bo.BOBsOperatorsEngine;
import com.asiainfo.crm.cm.common.ivalues.IBOBsOperatorsValue;
import com.asiainfo.crm.common.dao.interfaces.IBaseOperatorsDAO;

public class BaseOperatorsDAOImpl implements IBaseOperatorsDAO {

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.common.dao.interfaces.IBaseOperatorsDAO#getAllOperators()
	 */
	public IBOBsOperatorsValue[] getAllOperators() throws Exception {
		String condition = "STATE = 'U' ";
		return BOBsOperatorsEngine.getBeans(condition, null);
	}
	
	public IBOBsOperatorsValue[] getAllOperatorsByCdn(String condition, Map parameter) throws Exception {
		return BOBsOperatorsEngine.getBeans(condition, parameter);
	}

	public void saveOperators(IBOBsOperatorsValue[] operationValues) throws Exception {
		BOBsOperatorsEngine.saveBatch(operationValues);
	}

}
