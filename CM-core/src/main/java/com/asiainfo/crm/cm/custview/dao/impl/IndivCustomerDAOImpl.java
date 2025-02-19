package com.asiainfo.crm.cm.custview.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.custview.bo.QBOCmIndivContactEngine;
import com.asiainfo.crm.cm.custview.bo.QBOCmIndivCustomerHEngine;
import com.asiainfo.crm.cm.custview.bo.QBOIndivCustomerEngine;
import com.asiainfo.crm.cm.custview.dao.interfaces.IIndivCustomerDAO;
import com.asiainfo.crm.cm.custview.ivalues.IQBOCmIndivContactValue;
import com.asiainfo.crm.cm.custview.ivalues.IQBOCmIndivCustomerHValue;
import com.asiainfo.crm.cm.custview.ivalues.IQBOIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivManagerEngine;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupManagerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivManagerValue;

/**
* 
* Copyright: Copyright (c) 2011 Asiainfo-Linkage
* 
* @ClassName: IndivCustomerDAOImpl.java
* @Description: 北京个人客户数据接口实现类
*
* @version: v1.0.0
* @author: jiangxy
* @date: 2011-12-22 上午09:28:29 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2011-12-22     jiangxy           v1.0.0               修改原因
 */
public class IndivCustomerDAOImpl implements IIndivCustomerDAO {

	public IQBOIndivCustomerValue[] queryIndivCustomer(String[] cols, String condition, Map parameter, int startNum, int endNum) throws Exception {
		return QBOIndivCustomerEngine.getBeans(cols, condition, parameter, startNum, endNum, false);
	}

	public int queryIndivCustomerCount(String condition, Map parameter) throws Exception {
		return QBOIndivCustomerEngine.getBeansCount(condition, parameter);
	}

	public IQBOCmIndivCustomerHValue[] queryIndivCustomerHByConditions(String[] cols, String condition, Map parameter, int startNum, int endNum) throws Exception {
		return QBOCmIndivCustomerHEngine.getBeans(cols, condition, parameter, startNum, endNum, false);
	}

	public int queryIndivCustomerHCountByConditions(String condition, Map parameter) throws Exception {
		return QBOCmIndivCustomerHEngine.getBeansCount(condition, parameter);
	}

	public IBOCmIndivManagerValue[] queryIndivManagers(long custId) throws Exception {
		StringBuilder sb = new StringBuilder();
		Map map = new HashMap();
		sb.append(IBOCmGroupManagerValue.S_State).append(" = :state");
		map.put("state", CmConstants.RecordState.USE);
		if (custId > 0) {
			sb.append(" AND ").append(IBOCmGroupManagerValue.S_CustId).append(" = :custId ");
			map.put("custId", custId);
		}
		return BOCmIndivManagerEngine.getBeans(sb.toString(), map);
	}
	
	public IQBOCmIndivContactValue[] queryIndivContact(String[] cols, String condition, Map parameter, int startNum, int endNum) throws Exception {
		return QBOCmIndivContactEngine.getBeans(cols, condition, parameter, startNum, endNum, false);
	}

	public int queryIndivContactCount(String condition, Map parameter) throws Exception {
		return QBOCmIndivContactEngine.getBeansCount(condition, parameter);
	}

	public IQBOCmIndivCustomerHValue[] queryIndivCustomerHFormSql(String sql, Map parameter) throws Exception {
		return QBOCmIndivCustomerHEngine.getBeansFromSql(sql, parameter);
	}

	public IQBOIndivCustomerValue[] queryIndivCustomerByCustServiceId(String condition, Map parameter) throws Exception {
		return QBOIndivCustomerEngine.getBeans(condition,parameter);
	}
}
