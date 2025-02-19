package com.asiainfo.crm.cm.customer.group.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.common.ServiceManager;
import com.asiainfo.crm.cm.common.CmxConstants;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupInformInfoEngine;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmGroupInformInfoDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupInformInfoValue;
import com.asiainfo.crm.inter.exe.webservice.client.cpa.task.CpaUserIncTask;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * @ClassName: ICmGroupInformInfoDAO.java
 * @Description: 该类实现对集团客户信息化信息的管理功能。
 * @version: v1.0.0
 * @author: huzq2
 * @date: Jan 12, 2011 2:08:01 PM 
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * Jan 12, 2011		huzq2           v1.0.0               修改原因
 */
public class CmGroupInformInfoDAOImpl implements ICmGroupInformInfoDAO {
	private static Log log = LogFactory.getLog(CmGroupInformInfoDAOImpl.class);

	public IBOCmGroupInformInfoValue queryGroupInformInfo(long groupCustId,
			int informTypeId) throws Exception {
		return BOCmGroupInformInfoEngine.getBean(informTypeId,groupCustId);
	}

	public IBOCmGroupInformInfoValue[] queryGroupInformInfo(long groupCustId, int startIndex, int endIndex) throws Exception{
		StringBuilder condition = new StringBuilder();
		Map param = new HashMap();
		if(groupCustId > 0){
			condition = condition.append(IBOCmGroupInformInfoValue.S_GroupCustId).append(" = :groupCustId ");
			param.put("groupCustId", Long.valueOf(groupCustId));
		}
		return BOCmGroupInformInfoEngine.getBeans(null, condition.toString(), param, startIndex, endIndex, false);
	}

	public int queryGroupInformInfoCount(long groupCustId) throws Exception{
		StringBuilder condition = new StringBuilder();
		Map param = new HashMap();
		if(groupCustId > 0){
			condition = condition.append(IBOCmGroupInformInfoValue.S_GroupCustId).append(" = :groupCustId ");
			param.put("groupCustId", Long.valueOf(groupCustId));
		}
		return BOCmGroupInformInfoEngine.getBeansCount(condition.toString(), param);
	}
	
	public IBOCmGroupInformInfoValue[] queryGroupInformInfosById(long groupCustId) throws Exception{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition = condition.append(IBOCmGroupInformInfoValue.S_GroupCustId).append(" = :groupCustId ");
		parameterMap.put("groupCustId", Long.valueOf(groupCustId));
		condition.append(" AND ");
		condition = condition.append(IBOCmGroupInformInfoValue.S_State).append(" = :state ");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmGroupInformInfoEngine.getBeans(condition.toString(), parameterMap);
	}

	public void saveGroupInformInfo( IBOCmGroupInformInfoValue groupInformInfoValue) throws Exception {
		BOCmGroupInformInfoEngine.save(groupInformInfoValue);
	}

	public void saveGroupInformInfo( IBOCmGroupInformInfoValue[] groupInformInfoValues) throws Exception {
		for (int i = 0; i < groupInformInfoValues.length; i++) {
			BOCmGroupInformInfoEngine.save(groupInformInfoValues[i]);
		}
	}

	public String queryIsUsedByGroupCustId(long groupCustId) throws Exception {
		String note = null;
		Connection conn = null;
		ResultSet r = null;
		PreparedStatement prep = null;
		try {
			conn = ServiceManager.getSession().getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("select CONCAT(");
			sql.append("(select decode(count(inform_type_id),1,'U','E') from cm_group_inform_info where inform_type_id=1 and group_cust_id=? and state='U'),',',");
			sql.append("(select decode(count(inform_type_id),1,'U','E') from cm_group_inform_info where inform_type_id=2 and group_cust_id=? and state='U'),',',");
			sql.append("(select decode(count(inform_type_id),1,'U','E') from cm_group_inform_info where inform_type_id=3 and group_cust_id=? and state='U'),',',");
			sql.append("(select decode(count(inform_type_id),1,'U','E') from cm_group_inform_info where inform_type_id=4 and group_cust_id=? and state='U'),',',");
			sql.append("(select decode(count(inform_type_id),1,'U','E') from cm_group_inform_info where inform_type_id=5 and group_cust_id=? and state='U'),',',");
			sql.append("(select decode(count(inform_type_id),1,'U','E') from cm_group_inform_info where inform_type_id=6 and group_cust_id=? and state='U'),',',");
			sql.append("(select decode(count(inform_type_id),1,'U','E') from cm_group_inform_info where inform_type_id=7 and group_cust_id=? and state='U'),',',");
			sql.append("(select decode(count(inform_type_id),1,'U','E') from cm_group_inform_info where inform_type_id=8 and group_cust_id=? and state='U'),',',");
			sql.append("(select decode(count(inform_type_id),1,'U','E') from cm_group_inform_info where inform_type_id=9 and group_cust_id=? and state='U'),',',");
			sql.append("(select decode(count(inform_type_id),1,'U','E') from cm_group_inform_info where inform_type_id=10 and group_cust_id=? and state='U'),',',");
			sql.append("(select decode(count(inform_type_id),1,'U','E') from cm_group_inform_info where inform_type_id=11 and group_cust_id=? and state='U'),',',");
			sql.append("(select decode(count(inform_type_id),1,'U','E') from cm_group_inform_info where inform_type_id=12 and group_cust_id=? and state='U')) ");
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
			log.error(e.getMessage());
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
	
	
} 
