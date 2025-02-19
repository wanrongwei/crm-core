package com.asiainfo.crm.cm.teaminvoke.out.dao.impl;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmxConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.speusermain.bo.BOCmUserSpeuserMainEngine;
import com.asiainfo.crm.cm.customer.speusermain.ivalues.IBOCmUserSpeuserMainValue;
import com.asiainfo.crm.cm.inner.account.bo.BOCmBillCustomizeEngine;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmBillCustomizeValue;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupContactEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupCustomerEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupManagerEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupMemberEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxGroupMemberEngine;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContactValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupManagerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupMemberValue;
import com.asiainfo.crm.cm.teaminvoke.out.dao.interfaces.ICmGroupCustomerDAO;

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

	public IBOCmGroupCustomerValue queryGroupCustomerByGroupId(long groupId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameters = new HashMap();
		condition.append("1=1");
		condition.append(" AND ");
		condition.append(IBOCmGroupCustomerValue.S_CustServiceId).append("=:groupId");
		parameters.put("groupId", Long.valueOf(groupId));
		condition.append(" AND ");
		condition.append(IBOCmGroupCustomerValue.S_State).append("=:state");
		parameters.put("state", CmxConstants.RECORD_STATE_USE);
		IBOCmGroupCustomerValue[] groupCustomers = BOCmGroupCustomerEngine.getBeans(condition.toString(), parameters);

		// 修改可能的隐患
		if (CmCommonUtil.isEmptyObject(groupCustomers)) {
			return null;
		}
		return groupCustomers[0];
	}

	public IBOCmGroupManagerValue queryGroupCustMgrRel(long groupCustId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameters = new HashMap();
		condition.append(IBOCmGroupManagerValue.S_CustId).append("=:groupId");
		condition.append(" AND ");
		condition.append(IBOCmGroupManagerValue.S_RelType).append("=:reltype");
		condition.append(" AND ");
		condition.append(IBOCmGroupManagerValue.S_State).append("=:state");
		parameters.put("groupId", Long.valueOf(groupCustId));
		parameters.put("reltype", 1);
		parameters.put("state", CmConstants.RecordState.USE);
		IBOCmGroupManagerValue[] gMgrRel = BOCmGroupManagerEngine.getBeans(condition.toString(), parameters);

		// 修改可能的隐患
		if (CmCommonUtil.isEmptyObject(gMgrRel)) {
			return null;
		}
		return gMgrRel[0];
	}

	public com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerValue queryGroupCustInfoByCustId(long groupCustId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameters = new HashMap();
		condition.append(IBOCmGroupCustomerValue.S_CustId).append("=:groupId");
		parameters.put("groupId", Long.valueOf(groupCustId));
		com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerValue[] gMgrRel = com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupCustomerEngine.getBeans(condition.toString(),
				parameters);

		// 修改可能的隐患
		if (CmCommonUtil.isEmptyObject(gMgrRel)) {
			return null;
		}
		return gMgrRel[0];
	}

	public IBOCmUserSpeuserMainValue[] queryCreditByServiceNum(String serviceNum, int type) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameters = new HashMap();

		condition.append(IBOCmUserSpeuserMainValue.S_PhoneId).append("=:serviceNum");
		parameters.put("serviceNum", Long.valueOf(serviceNum));

		IBOCmUserSpeuserMainValue[] mainValue = BOCmUserSpeuserMainEngine.getBeans(condition.toString(), parameters);

		// 修改可能的隐患
		if (CmCommonUtil.isEmptyObject(mainValue)) {
			return null;
		}
		return mainValue;
	}

	public IBOCmGroupCustomerValue[] queryGroupCustInfoByCustName(String custName) throws Exception, RemoteException {
		StringBuffer condition = new StringBuffer();
		Map parameters = new HashMap();

		condition.append(IBOCmGroupCustomerValue.S_CustName).append(" like :custName");
		parameters.put("custName","%"+ custName + "%");
		IBOCmGroupCustomerValue[] gValue = BOCmGroupCustomerEngine.getBeans(condition.toString(), parameters);
		return gValue;
	}

	public IBOCmGroupMemberValue queryGroupMemInfoBySn(String sn) throws Exception, RemoteException {
		StringBuffer condition = new StringBuffer();
		Map parameters = new HashMap();
		IBOCmGroupMemberValue[] groups = null;
		condition.append(IBOCmxGroupMemberValue.S_BillId).append("=:serviceNum");
		parameters.put("serviceNum", sn);
		IBOCmxGroupMemberValue[] cmxMes = BOCmxGroupMemberEngine.getBeans(condition.toString(), parameters);

		// 修改可能的隐患
		if (CmCommonUtil.isEmptyObject(cmxMes)) {
			return null;
		} else {
			StringBuffer sql = new StringBuffer();
			Map para = new HashMap();
			condition.append(IBOCmGroupMemberValue.S_CustRelId).append("=:relId");
			parameters.put("relId", cmxMes[0].getCustRelId());
			groups = BOCmGroupMemberEngine.getBeans(sql.toString(), para);
		}

		return groups[0];
	}

	public IBOCmGroupContactValue[] queryGroupContractByGroupCustId(long custId) throws Exception, RemoteException {
		StringBuffer condition = new StringBuffer();
		Map parameters = new HashMap();

		condition.append(IBOCmGroupContactValue.S_CustId).append("=:custId ").append(" AND ");
		parameters.put("custId", custId);
		condition.append(IBOCmGroupContactValue.S_PrioryLevel).append("=:level ");
		parameters.put("level", "1");

		IBOCmGroupContactValue[] contacts = BOCmGroupContactEngine.getBeans(condition.toString(), parameters);

		return contacts;
	}

	public IBOCmBillCustomizeValue[] queryCmBillCustomize(long customizeId, long custId, long userId, long acctId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameters = new HashMap();
		condition.append(" 1=1 ");
		if (customizeId != -1) {
			condition.append(" and ");
			condition.append(IBOCmBillCustomizeValue.S_CustomizeId).append(" =:customizeId ");
			parameters.put("customizeId", customizeId);
		}
		if (custId != -1) {
			condition.append(" and ");
			condition.append(IBOCmBillCustomizeValue.S_CustId).append(" =:custId ");
			parameters.put("custId", custId);
		}
		if (userId != -1) {
			condition.append(" and ");
			condition.append(IBOCmBillCustomizeValue.S_UserId).append(" =:userId ");
			parameters.put("userId", userId);
		}
		if (acctId != -1) {
			condition.append(" and ");
			condition.append(IBOCmBillCustomizeValue.S_AcctId).append(" =:acctId ");
			parameters.put("acctId", acctId);
		}
		IBOCmBillCustomizeValue[] contacts = BOCmBillCustomizeEngine.getBeans(null, condition.toString(), parameters, -1, -1, true);
		return contacts;
	}
}
