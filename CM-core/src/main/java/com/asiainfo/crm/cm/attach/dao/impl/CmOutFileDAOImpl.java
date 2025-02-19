package com.asiainfo.crm.cm.attach.dao.impl;

import java.util.HashMap;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.attach.dao.interfaces.ICmOutFileDAO;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;

public class CmOutFileDAOImpl implements ICmOutFileDAO {

	public DataContainerInterface[] qryGrpCustomerListUp(String custId) throws Exception {
		StringBuilder sql = new StringBuilder("select cust_id,level, " + " CASE level " + " WHEN 1 THEN " + " CONCAT(' ',cust_name) " + " WHEN 2 THEN "
				+ " CONCAT('  ',cust_name) " + " when 3 THEN " + " CONCAT('   ',cust_name) " + " when 4 then " + " CONCAT('    ',cust_name) " + " when 5 then"
				+ " CONCAT('     ',cust_name) " + " else " + " CONCAT('      ',cust_name) " + " END cust_name, " + " CASE t.cust_status  WHEN 0 THEN '[ 0 ] in the network group customers'"
				+ " WHEN 1 THEN '[1] potential corporate customers'" + " WHEN 2 THEN '[2] competitors, customers of the Group' end CUST_STATUS " + " from CM_GROUP_CUSTOMER t start with t.cust_id= :custId ");
		HashMap parameter = new HashMap();
		parameter.put("custId", custId);
		StringBuilder condition = new StringBuilder(" connect BY prior t.parent_cust_id =  t.cust_id and t.state='U' order by level desc ");
		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryResult(sql.append(condition).toString(), null, -1, -1, parameter), parameter);

		return values;
	}

	public DataContainerInterface[] qryGrpCustomerListDown(String custId) throws Exception {
		StringBuilder sql = new StringBuilder("select cust_id,level," + " CASE level " + " WHEN 1 THEN " + " CONCAT(' ',cust_name) " + " WHEN 2 THEN " + " CONCAT('  ',cust_name) "
				+ " when 3 THEN " + " CONCAT('   ',cust_name) " + " when 4 then " + " CONCAT('    ',cust_name) " + " when 5 then" + " CONCAT('     ',cust_name) " + " else "
				+ " CONCAT('      ',cust_name) " + " END cust_name, " + " CASE t.cust_status  WHEN 0 THEN '[ 0 ] in the network group customers'" + " WHEN 1 THEN '[1] potential corporate customers'"
				+ " WHEN 2 THEN '[2] competitors, customers of the Group' end CUST_STATUS " + " from CM_GROUP_CUSTOMER t start with t.parent_cust_id= :custId ");
		HashMap parameter = new HashMap();
		parameter.put("custId", custId);
		StringBuilder condition = new StringBuilder(" connect BY prior t.cust_id =  t.parent_cust_id and t.state='U' order by level desc ");
		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryResult(sql.append(condition).toString(), null, -1, -1, parameter), parameter);
		return values;
	}

}
