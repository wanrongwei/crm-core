package com.asiainfo.crm.cm.inner.customer.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

import com.ai.appframe2.common.ServiceManager;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupCustomerHEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxGroupAddInfoEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxGroupCreditPointRecEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxGroupInformInfoEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxGroupMemberEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxGroupOrgStructExtEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxGroupOutMemberEngine;
import com.asiainfo.crm.cm.inner.customer.bo.QBOCmxGroupCreditPointEngine;
import com.asiainfo.crm.cm.inner.customer.bo.QBOCmxGroupMemEngine;
import com.asiainfo.crm.cm.inner.customer.bo.QBOCmxGroupMemberExtEngine;
import com.asiainfo.crm.cm.inner.customer.bo.QBOCmxGroupOrgStructEngine;
import com.asiainfo.crm.cm.inner.customer.dao.interfaces.ICmxGroupCustDAO;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerHValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupAddInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupCreditPointRecValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupInformInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupMemberValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupOrgStructExtValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupOutMemberValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmxGroupCreditPointValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmxGroupMemValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmxGroupMemberExtValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmxGroupOrgStructValue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CmxGroupCustDAOImpl implements ICmxGroupCustDAO {
	private static final Log log = LogFactory.getLog(CmxGroupCustDAOImpl.class);

	public IQBOCmxGroupMemberExtValue[] queryGroupMemberExt(String condition, Map parameter) throws Exception {
		return QBOCmxGroupMemberExtEngine.getBeans(condition, parameter);
	}

	public IQBOCmxGroupOrgStructValue[] queryGroupOrgStruct(String[] cols, String condition, Map parameter, int startNum, int endNum) throws Exception {
		return QBOCmxGroupOrgStructEngine.getBeans(cols, condition, parameter, startNum, endNum, false);
	}

	public int queryGroupOrgStructCount(String condition, Map parameter) throws Exception {
		return QBOCmxGroupOrgStructEngine.getBeansCount(condition, parameter);
	}

	public void saveGroupOrgStruct(IBOCmxGroupOrgStructExtValue groupOrgStructValue) throws Exception {
		if (groupOrgStructValue != null) {
			BOCmxGroupOrgStructExtEngine.save(groupOrgStructValue);
		}
	}

	public IBOCmxGroupAddInfoValue[] queryGroupCustChance(String[] cols, String condition, Map parameter, int startNum, int endNum) throws Exception {
		return BOCmxGroupAddInfoEngine.getBeans(cols, condition, parameter, startNum, endNum, false);
	}

	public IBOCmxGroupInformInfoValue queryGroupInformInfo(int informTypeId, long groupCustId) throws Exception {
		return BOCmxGroupInformInfoEngine.getBean(groupCustId, informTypeId);
	}

	public String queryIsUsedByGroupCustId(long groupCustId) throws Exception {
		String note = null;
		Connection conn = null;
		ResultSet r = null;
		PreparedStatement prep = null;
		try {

			conn = ServiceManager.getSession().getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("select concat(");
			for (int i = 1; i < 12; i++) {
				sql.append("(select decode2(count(inform_type_id),1,'U','E') from cmx_group_inform_info where inform_type_id=" + i + " and cust_id=? and state='U'),");
			}
			sql.append("(select decode2(count(inform_type_id),1,'U','E') from cmx_group_inform_info where inform_type_id=12 and cust_id=? and state='U')) ");
			sql.append(" from dual");
			prep = conn.prepareStatement(sql.toString());
			for (int i = 1; i < 13; i++) {
				prep.setLong(i, groupCustId);
			}
			r = prep.executeQuery();
			if (r.next()) {
				note = r.getString(1);
			}
		} catch (Exception e) {
			log.error(e.getCause() == null ? e.getMessage() : e.getCause().getMessage());
		} finally {
			if (r != null) {
				r.close();
			}
			if (prep != null) {
				prep.close();
			}
			if (conn != null) {
				conn.close();
			}
		}

		return note;
	}

	public void saveGroupInformInfo(IBOCmxGroupInformInfoValue[] groupInformInfoValues) throws Exception {
		for (int i = 0; i < groupInformInfoValues.length; i++) {
			BOCmxGroupInformInfoEngine.save(groupInformInfoValues[i]);
		}
	}

	public IBOCmxGroupCreditPointRecValue[] queryCreditPointRec(String[] cols, String condition, Map parameter, int startNum, int endNum) throws Exception {
		return BOCmxGroupCreditPointRecEngine.getBeans(cols, condition, parameter, startNum, endNum, false);
	}

	public int queryCreditPointRecCount(String condition, Map parameter) throws Exception {
		return BOCmxGroupCreditPointRecEngine.getBeansCount(condition, parameter);
	}

	public IQBOCmxGroupMemValue[] queryGroupInnerMems(String[] cols, String condition, Map parameter, int startNum, int endNum) throws Exception {
		return QBOCmxGroupMemEngine.getBeans(cols, condition, parameter, startNum, endNum, false);
	}

	public int queryGroupInnerMemCount(String condition, Map parameter) throws Exception {
		return QBOCmxGroupMemEngine.getBeansCount(condition, parameter);
	}

	public IBOCmxGroupOutMemberValue[] queryGroupOuterMems(String[] cols, String condition, Map parameter, int startNum, int endNum) throws Exception {
		return BOCmxGroupOutMemberEngine.getBeans(cols, condition, parameter, startNum, endNum, false);
	}

	public int queryGroupOuterMemCount(String condition, Map parameter) throws Exception {
		return BOCmxGroupOutMemberEngine.getBeansCount(condition, parameter);
	}

	public void saveGroupMemExt(IBOCmxGroupMemberValue cmxGroupMemberValue) throws Exception {
		if (cmxGroupMemberValue != null) {
			BOCmxGroupMemberEngine.save(cmxGroupMemberValue);
		}
	}

	public void saveGroupAddInfoValue(IBOCmxGroupAddInfoValue extValue) throws Exception {
		if (extValue != null) {
			BOCmxGroupAddInfoEngine.save(extValue);
		}
	}

	public void saveGroupOutMember(IBOCmxGroupOutMemberValue groupOutMemberValue) throws Exception {
		if (groupOutMemberValue != null) {
			BOCmxGroupOutMemberEngine.save(groupOutMemberValue);
		}
	}

	public void saveGroupMemberLevel(IBOCmxGroupMemberValue groupMemberValue) throws Exception {
		if (groupMemberValue != null) {
			BOCmxGroupMemberEngine.save(groupMemberValue);
		}
	}

	public void saveGroupMemberLevelByfile(IBOCmxGroupMemberValue[] groupMemberValues) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(groupMemberValues)) {
			BOCmxGroupMemberEngine.saveBatch(groupMemberValues);
		}

	}

	public IBOCmxGroupMemberValue[] queryGroupMemberLevelBybillIds(String[] cols, String condition, Map parameter, int startNum, int endNum) throws Exception {
		return BOCmxGroupMemberEngine.getBeans(cols, condition, parameter, startNum, endNum, false);
	}

	public int queryGroupMemberLevelBybillIdsCount(String condition, Map parameter) throws Exception {
		return BOCmxGroupMemberEngine.getBeansCount(condition, parameter);
	}

	public IQBOCmxGroupCreditPointValue[] queryGroupCreditPoint(String[] cols, String condition, Map parameter, int startNum, int endNum) throws Exception {
		return QBOCmxGroupCreditPointEngine.getBeans(cols, condition, parameter, startNum, endNum, false);
	}

	public int queryGroupCreditPointCount(String condition, Map parameter) throws Exception {
		return QBOCmxGroupCreditPointEngine.getBeansCount(condition, parameter);
	}

	public IBOCmGroupCustomerHValue[] queryGroupCustHis(String sql, Map parameter) throws Exception {
		return BOCmGroupCustomerHEngine.getBeansFromSql(sql, parameter);
	}

}
