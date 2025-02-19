package com.asiainfo.crm.cm.customer.group.dao.impl;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.asiainfo.crm.cm.common.CmxConstants; /*
												 * import
												 * com.asiainfo.crm.cm.customer.custmgr.bo.BOCmxAllCustMgrRelEngine;
												 * import com.asiainfo.crm.cm.customer.custmgr.bo.BOCmxManagerEngine;
												 * import
												 * com.asiainfo.crm.cm.customer.custmgr.ivalues.IBOCmxAllCustMgrRelValue;
												 * import
												 * com.asiainfo.crm.cm.customer.custmgr.ivalues.IBOCmxManagerValue;
												 */
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustAttrEngine;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustomerEngine;
import com.asiainfo.crm.cm.customer.group.bo.QBOCmGroupCustAndExtraInfoEngine;
import com.asiainfo.crm.cm.customer.group.bo.QBOCmGroupCustManagerEngine;
import com.asiainfo.crm.cm.customer.group.bo.QBOCmSubGroupCustomerEngine;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmGroupCustomerDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustAttrValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupCustManagerValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmSubGroupCustomerValue;

public class CmGroupCustomerDAOImpl implements ICmGroupCustomerDAO {

	public int queryGroupCustomerCount(DataContainerInterface dataContainer) throws Exception {
		Map ps = dataContainer.getProperties();
		StringBuffer condition = new StringBuffer();
		Map parameters = new HashMap();
		for (java.util.Iterator cc = ps.entrySet().iterator(); cc.hasNext();) {
			Map.Entry e = (Map.Entry) cc.next();
			if (condition.length() > 0)
				condition.append(" and ");
			condition.append(e.getKey().toString() + " = :p_" + e.getKey().toString());
			parameters.put("p_" + e.getKey().toString(), e.getValue());
		}
		return BOCmGroupCustomerEngine.getBeansCount(condition.toString(), parameters);
	}

	public IBOCmGroupCustomerValue[] queryGroupCustomers(DataContainerInterface dataContainer, int startIndex, int endIndex) throws Exception {
		Map ps = dataContainer.getProperties();
		StringBuffer condition = new StringBuffer();
		Map parameters = new HashMap();
		for (java.util.Iterator cc = ps.entrySet().iterator(); cc.hasNext();) {
			Map.Entry e = (Map.Entry) cc.next();
			if (condition.length() > 0)
				condition.append(" and ");
			condition.append(e.getKey().toString() + " = :p_" + e.getKey().toString());
			parameters.put("p_" + e.getKey().toString(), e.getValue());
		}
		return BOCmGroupCustomerEngine.getBeans(null, condition.toString(), parameters, startIndex, endIndex, false);
	}

	public IBOCmGroupCustomerValue queryGroupCustomerById(long groupCustId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameters = new HashMap();
		condition.append(IBOCmGroupCustomerValue.S_CustId).append("=:groupCustId");
		condition.append(" AND ");
		condition.append(IBOCmGroupCustomerValue.S_State).append("=:state");
		parameters.put("groupCustId", Long.valueOf(groupCustId));
		parameters.put("state", CmxConstants.RECORD_STATE_USE);
		IBOCmGroupCustomerValue[] groupCustomers = BOCmGroupCustomerEngine.getBeans(condition.toString(), parameters);
		if (groupCustomers.length == 0) {
			return null;
		}
		return groupCustomers[0];
	}

	public void saveGroupCustomer(IBOCmGroupCustomerValue groupCustomerValue) throws Exception {
		groupCustomerValue.setCustName(groupCustomerValue.getCustName().trim());
		BOCmGroupCustomerEngine.save(groupCustomerValue);
	}

	public void saveGroupCustomer(IBOCmGroupCustomerValue[] groupCustomerValues) throws Exception {
		for (IBOCmGroupCustomerValue iboCmGroupCustomerValue : groupCustomerValues) {
			iboCmGroupCustomerValue.setCustName(iboCmGroupCustomerValue.getCustName().trim());
		}
		BOCmGroupCustomerEngine.saveBatch(groupCustomerValues);
	}

	public IBOCmGroupCustAttrValue queryGroupCustAttr(long attrId) throws Exception {
		//return BOCmGroupCustAttrEngine.getBean(attrId);
		return null;
	}

	public IBOCmGroupCustAttrValue[] queryGroupCustAttrs(long groupCustId, long attrDefineId) throws Exception {
//		StringBuilder condition = new StringBuilder();
//		Map parameter = new HashMap();
//		// 添加条件groupCustId
//		condition.append(IBOCmGroupCustAttrValue.S_GroupCustId).append(" = :groupCustId ");
//		parameter.put("groupCustId", Long.valueOf(groupCustId));
//		// 添加条件
//		condition.append(" AND ").append(IBOCmGroupCustAttrValue.S_AttrDefineId).append(" = :attrDefineId ");
//		parameter.put("attrDefineId", Long.valueOf(attrDefineId));
//
//		return BOCmGroupCustAttrEngine.getBeans(condition.toString(), parameter);
		return null;
	}

	public void saveGrouCustAttr(IBOCmGroupCustAttrValue groupCustAttrValue) throws Exception {
		BOCmGroupCustAttrEngine.save(groupCustAttrValue);
	}

	public void saveGrouCustAttr(IBOCmGroupCustAttrValue[] groupCustAttrValues) throws Exception {
		BOCmGroupCustAttrEngine.saveBatch(groupCustAttrValues);
	}

	public long queryGroupCustomerCount(String custName, long custId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameters = new HashMap();
		condition.append(IBOCmGroupCustomerValue.S_CustName).append("=:custName");
		parameters.put("custName", custName);
		condition.append(" AND ");
		condition.append(IBOCmGroupCustomerValue.S_State).append("=:state");
		parameters.put("state", CmxConstants.RECORD_STATE_USE);
		if (custId > 0) {
			condition.append(" AND ");
			condition.append(IBOCmGroupCustomerValue.S_CustId).append("=:groupCustId");
			parameters.put("groupCustId", Long.valueOf(custId));
		}
		return BOCmGroupCustomerEngine.getBeansCount(condition.toString(), parameters);
	}

	public void deleteGroupCustomer(IBOCmGroupCustomerValue groupCustomerValue) throws Exception {
		groupCustomerValue.setStsToOld();
		groupCustomerValue.setState(CmxConstants.RECORD_STATE_DEL);
		groupCustomerValue.setCustName(groupCustomerValue.getCustName().trim());
		BOCmGroupCustomerEngine.save(groupCustomerValue);
	}

	public long queryGroupCustomerAndExtraInfoCount(String condition, Map map) throws Exception {
		return QBOCmGroupCustAndExtraInfoEngine.getBeansCount(condition, map);
	}

	public IQBOCmSubGroupCustomerValue[] querySubGroupCustomersByGroupId(long groupId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameters = new HashMap();
		parameters.put("groupId", Long.valueOf(groupId));
		return QBOCmSubGroupCustomerEngine.getBeans(condition.toString(), parameters);
	}

	public IQBOCmGroupCustManagerValue[] queryGroupCustManagersByGroupId(long groupCustId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameters = new HashMap();
		condition.append(IQBOCmGroupCustManagerValue.S_GroupCustId).append(" =:groupId ").append(" ORDER BY ").append(IQBOCmGroupCustManagerValue.S_RelType).append(" ASC "); // 增加按受理日期降序排序
		parameters.put("groupId", Long.valueOf(groupCustId));
		return QBOCmGroupCustManagerEngine.getBeans(condition.toString(), parameters);
	}

	public IBOCmGroupCustomerValue[] queryGroupCustomerByCustName(String custName, int startNum, int endNum) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameters = new HashMap();
		condition.append(IBOCmGroupCustomerValue.S_CustName).append(" like :custname").append(" order by").append(IBOCmGroupCustomerValue.S_CustName);
		parameters.put("custname", "%" + custName + "%");
		return BOCmGroupCustomerEngine.getBeans(null, condition.toString(), parameters, startNum, endNum, false);
	}

	public IBOCmGroupCustomerValue queryGroupCustomerByGroupId(long groupId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameters = new HashMap();
		condition.append(IBOCmGroupCustomerValue.S_CustServiceId).append("=:groupId");
		parameters.put("groupId", Long.valueOf(groupId));
		condition.append(" AND ");
		condition.append(IBOCmGroupCustomerValue.S_State).append("=:state");
		parameters.put("state", CmxConstants.RECORD_STATE_USE);
		IBOCmGroupCustomerValue[] groupCustomers = BOCmGroupCustomerEngine.getBeans(condition.toString(), parameters);
		if (groupCustomers.length == 0) {
			return null;
		}
		return groupCustomers[0];
	}

	public long getGroupId(String chnlCityId) throws Exception {
		long seq = ServiceManager.getIdGenerator().getNewId(("CM_GROUP_ID_" + chnlCityId).toUpperCase()).longValue();
		StringBuffer sb = new StringBuffer();
		sb.append("571").append(chnlCityId.substring(1, 3)).append(seq);
		return Long.valueOf(sb.toString()).longValue();
	}

	public Timestamp getSysDate() throws Exception {
		return BOCmGroupCustomerEngine.getSysDate();
	}

	public IBOCmGroupCustomerValue queryAllStateGroupCustomerByGroupCustId(long groupCustId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameters = new HashMap();
		condition.append(IBOCmGroupCustomerValue.S_CustId).append("= :groupCustId");
		parameters.put("groupCustId", Long.valueOf(groupCustId));
		IBOCmGroupCustomerValue[] results = BOCmGroupCustomerEngine.getBeans(condition.toString(), parameters);
		if (results.length == 0) {
			return null;
		}
		return results[0];
	}

	public IBOCmGroupCustomerValue[] queryGroupCustomers(String condition, Map parmer) throws Exception {
		return BOCmGroupCustomerEngine.getBeans(condition, parmer);
	}

	public String getGroupConnectionName() throws Exception {
		return ServiceManager.getSession().getCurrentTransactionName();
	}

	/*
	 * public IBOCmxManagerValue[] queryCmxMangers(long[] mgrIds) throws Exception { IBOCmxManagerValue[] cmxManger =
	 * null; if(mgrIds.length > 0){ StringBuilder sql = new StringBuilder(); sql.append(" SELECT M.* FROM (SELECT
	 * BILL_ID , STAFF_ID, STATE, DONE_DATE FROM CMX_MANAGER ") .append(" ) M,(SELECT BILL_ID , STAFF_ID, MAX(DONE_DATE)
	 * FROM CMX_MANAGER WHERE STAFF_ID IN ("); for (int i = 0,length = mgrIds.length; i < length; i++) { if(i == 0){
	 * sql.append(mgrIds[i]); } sql.append(",").append(mgrIds[i]); } sql.append(") GROUP BY BILL_ID,STAFF_ID) N WHERE
	 * M.BILL_ID = N.BILL_ID"); cmxManger = BOCmxManagerEngine.getBeansFromSql(sql.toString(), new HashMap()); } return
	 * cmxManger; } public int getGroupDelNotExistVipCount(String regionId) throws Exception { StringBuilder sql = new
	 * StringBuilder() .append(" SELECT COUNT(1) CUST_ID ") .append(" FROM CMX_ALL_CUST_MGR_REL A WHERE REL_TYPE = 1 AND
	 * A.OPER_TYPE = 2 AND NOT EXISTS(") .append(" SELECT 1 FROM CMX_ALL_CUST_MGR_REL B WHERE REL_TYPE = 2 AND
	 * A.USER_BILL_ID = B.USER_BILL_ID") .append(" AND A.MANAGER_BILL_ID = B.MANAGER_BILL_ID) AND REGION_ID
	 * =:REGION_ID"); Map parameter = new HashMap(); parameter.put("REGION_ID", regionId); return
	 * Integer.parseInt(String.valueOf(BOCmxAllCustMgrRelEngine.getBeansFromSql(sql.toString(),
	 * parameter)[0].getCustId())); } public int getVipNotExistGroupCount(String regionId) throws Exception {
	 * StringBuilder sql = new StringBuilder() .append(" SELECT COUNT(1) CUST_ID ") .append(" FROM CMX_ALL_CUST_MGR_REL
	 * A WHERE REL_TYPE = 2 AND NOT EXISTS(") .append(" SELECT 1 FROM CMX_ALL_CUST_MGR_REL B WHERE REL_TYPE = 1 AND
	 * A.USER_BILL_ID = B.USER_BILL_ID") .append(" AND A.MANAGER_BILL_ID = B.MANAGER_BILL_ID) AND REGION_ID
	 * =:REGION_ID"); Map parameter = new HashMap(); parameter.put("REGION_ID", regionId); return
	 * Integer.parseInt(String.valueOf(BOCmxAllCustMgrRelEngine.getBeansFromSql(sql.toString(),
	 * parameter)[0].getCustId())); } public IBOCmxAllCustMgrRelValue[] queryUserBillIdBySql(String sql) throws
	 * Exception { return BOCmxAllCustMgrRelEngine.getBeansFromSql(sql, new HashMap()); }
	 */
}
