package com.asiainfo.crm.cm.customer.group.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.util.CommonTool;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmGroupStaffAmountDAO;

public class CmGroupStaffAmountDAOImpl implements ICmGroupStaffAmountDAO{

	public DataContainer[] queryGroupStaffAmount(long custId, String tenantId)
			throws Exception {
		StringBuffer condition = new StringBuffer();
		String custTabName = "";
		String orgTabName = "";
		if(null!=tenantId && !"".equals(tenantId)){
			custTabName = "CM_GROUP_CUSTOMER_" + tenantId;
			orgTabName = "CM_GROUP_ORG_STRUCT_" + tenantId;
		}else{
			ExceptionUtil.throwBusinessException("The tenant number can not be empty");
		}
		//CM_GROUP_CUSTOMER_01 M,CM_GROUP_ORG_STRUCT_01 N WHERE N.REL_CUST_ID > 0 AND M.CUST_ID = N.REL_CUST_ID AND N.CUST_ID = 23111000000005 UNION SELECT M.STAFF_AMOUNT FROM CM_GROUP_CUSTOMER_01 M WHERE M.CUST_ID = 23111000000005) X
		condition.append("SELECT SUM(X.STAFF_AMOUNT) AS STAFF_AMOUNT FROM (SELECT M.STAFF_AMOUNT FROM ");
		condition.append(custTabName).append(" M ,").append(orgTabName).append(" N ");
		condition.append(" WHERE N.REL_CUST_ID > 0 AND M.CUST_ID = N.REL_CUST_ID AND N.CUST_ID = ");
		condition.append(":custId ").append(" ) X");
		Map map = new HashMap();
		map.put("custId", custId);
		return CommonTool.queryBeansFromSql(condition.toString(), map, -1, -1);
	}

	public DataContainer[] queryParentGroup(String tenantId, String regionId)
			throws Exception {
		StringBuffer condition = new StringBuffer();
		String sql = null;
		condition.append(" SELECT DISTINCT CUST_ID FROM {CM_GROUP_ORG_STRUCT} ");
		condition.append(" WHERE 1 = 1 ");
		condition.append(" AND CUST_ID >0");
		if(null!=tenantId && !"".equals(tenantId)){
			sql = SplitTableFactory.createQuerySQL(condition.toString(),new HashMap());
		}else{
			ExceptionUtil.throwBusinessException("The tenant number can not be empty");
		}
		
		Map map = new HashMap();
		return CommonTool.queryBeansFromSql(sql, map, -1, -1);

	}

}
