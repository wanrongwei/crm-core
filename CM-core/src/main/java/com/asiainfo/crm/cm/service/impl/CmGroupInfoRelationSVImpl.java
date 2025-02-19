package com.asiainfo.crm.cm.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractGroupInfoRelationSVImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOGroupInfoRelationBean;
import com.asiainfo.crm.cm.common.bo.BOGroupInfoRelationEngine;
import com.asiainfo.crm.cm.common.ivalues.IBOGroupArchivesValue;
import com.asiainfo.crm.cm.common.ivalues.IBOGroupInfoRelationValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupArchivesSV;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupInfoRelationSV;

/**
 * 
* Copyright: Copyright (c) 2012 Asiainfo-Linkage
* 
* @ClassName: CmGroupArchivesMemberSVImpl.java
* @Description: 集团建档员工管理
*
* @version: v1.0.0
* @author: suntao6
* @date: Jul 24, 2012 4:12:24 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Jul 24, 2012      suntao6          v1.0.0             修改原因
 */
public class CmGroupInfoRelationSVImpl implements ICmGroupInfoRelationSV {

	public int queryGroupInfoRelationCount(String criteria) throws Exception {

		// return ((AbstractGroupInfoRelationSVImpl)
		// CmServiceFactory.getBusiMode(AbstractGroupInfoRelationSVImpl.class)).queryCount(criteria);
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(criteria);
		DataContainer condition = dcs[0];
		StringBuilder sqlB = new StringBuilder("");
		sqlB.append(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOGroupInfoRelationBean.class).getMapingEnty());
		StringBuilder addMemSql = new StringBuilder("");
		Map parameter = new HashMap();
		if (!"".equals(condition.getAsString("CREATE_START_DATE")) && null != condition.getAsString("CREATE_START_DATE")) {
			addMemSql.append(" and t.CREATE_DATE >=to_date( :StartDate ,'YYYY-MM-DD') ");
			parameter.put("StartDate", condition.getAsString("CREATE_START_DATE").substring(0, 10));
		}
		if (!"".equals(condition.getAsString("CREATE_END_DATE")) && null != condition.getAsString("CREATE_END_DATE")) {
			addMemSql.append(" and t.CREATE_DATE <to_date( :EndDate ,'YYYY-MM-DD') ");
			parameter.put("EndDate", condition.getAsString("CREATE_END_DATE").substring(0, 10));
		}
		if (!"".equals(condition.getAsString("AUDIT_STATUS")) && null != condition.getAsString("AUDIT_STATUS")) {
			addMemSql.append(" and t.AUDIT_STATUS = :auditStatus ");
			parameter.put("auditStatus", condition.getAsString("AUDIT_STATUS"));
		}
		// 关联查询建档集团表
		if ((!"".equals(condition.getAsString("GROUP_NAME")) && null != condition.getAsString("GROUP_NAME"))
				|| (!"".equals(condition.getAsString("GROUP_SEQ")) && null != condition.getAsString("GROUP_SEQ"))
				|| (!"".equals(condition.getAsString("CITY_ID")) && null != condition.getAsString("CITY_ID"))
				|| (!"".equals(condition.getAsString("COUNTY_ID")) && null != condition.getAsString("COUNTY_ID"))) {
			addMemSql.append(" and exists ( select 1 from CM_GROUP_ARCHIVES a where a.group_seq = t.group_seq ");
			if (!"".equals(condition.getAsString("GROUP_NAME")) && null != condition.getAsString("GROUP_NAME")) {
				addMemSql.append(" and a.GROUP_NAME like :groupName ");
				parameter.put("groupName", condition.getAsString("GROUP_NAME") + "%");
			}
			if (!"".equals(condition.getAsString("GROUP_SEQ")) && null != condition.getAsString("GROUP_SEQ")) {
				addMemSql.append(" and a.GROUP_SEQ = :groupSeq ");
				parameter.put("groupSeq", condition.getAsString("GROUP_SEQ"));
			}
			if (!"".equals(condition.getAsString("CITY_ID")) && null != condition.getAsString("CITY_ID")) {
				addMemSql.append(" and a.region_code = :CityId ");
				parameter.put("CityId", condition.getAsLong("CITY_ID"));
			}
			if (!"".equals(condition.getAsString("COUNTY_ID")) && null != condition.getAsString("COUNTY_ID")) {
				addMemSql.append(" and a.county_code = :CountyId ");
				parameter.put("CountyId", condition.getAsLong("COUNTY_ID"));
			}
			addMemSql.append(" ) ");
		}
		// 关联在网集团客户表
		if ((!"".equals(condition.getAsString("CITY_ID")) && null != condition.getAsString("CITY_ID"))
				|| (!"".equals(condition.getAsString("COUNTY_ID")) && null != condition.getAsString("COUNTY_ID"))
				|| (!"".equals(condition.getAsString("GROUP_ID")) && null != condition.getAsString("GROUP_ID"))
				|| (!"".equals(condition.getAsString("CUST_NAME")) && null != condition.getAsString("CUST_NAME"))
				|| (!"".equals(condition.getAsString("OP_ID")) && null != condition.getAsString("OP_ID"))) {
			addMemSql.append(" and exists ( select 1 from cm_group_customer c where c.cust_service_id = t.group_id and c.state='U' ");
			if (!"".equals(condition.getAsString("CITY_ID")) && null != condition.getAsString("CITY_ID")) {
				addMemSql.append(" and c.CITY_ID = :CityId ");
				parameter.put("CityId", condition.getAsString("CITY_ID"));
			}
			if (!"".equals(condition.getAsString("COUNTY_ID")) && null != condition.getAsString("COUNTY_ID")) {
				addMemSql.append(" and c.COUNTY_ID = :CountyId ");
				parameter.put("CountyId", condition.getAsString("COUNTY_ID"));
			}
			if (!"".equals(condition.getAsString("GROUP_ID")) && null != condition.getAsString("GROUP_ID")) {
				addMemSql.append(" and c.CUST_SERVICE_ID = :custServiceId ");
				parameter.put("custServiceId", condition.getAsString("GROUP_ID"));
			}
			if (!"".equals(condition.getAsString("CUST_NAME")) && null != condition.getAsString("CUST_NAME")) {
				addMemSql.append(" and c.CUST_NAME like :custName ");
				parameter.put("custName", condition.getAsString("CUST_NAME") + "%");
			}
			if (!"".equals(condition.getAsString("OP_ID")) && null != condition.getAsString("OP_ID")) {
				addMemSql.append(" and exists (select 1 from cm_group_manager g where g.cust_id = c.cust_id and g.MANAGER_ID = :managerId ) ");
				parameter.put("managerId", condition.getAsLong("OP_ID"));
			}
			addMemSql.append(" ) ");
		}
		DataContainer[] values = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryCount(sqlB.toString(), addMemSql.toString(), parameter), parameter);
		return values[0].getAsInt("CNT");
	}

	public void saveGroupInfoRelation(DataContainer[] values) throws Exception {

		((AbstractGroupInfoRelationSVImpl) CmServiceFactory.getBusiMode(AbstractGroupInfoRelationSVImpl.class)).saveGroupArchives(values);
	}

	public DataContainer[] queryGroupInfoRelation(String criteria, int startNum, int endNum) throws Exception {
		// return
		// ((AbstractGroupInfoRelationSVImpl)CmServiceFactory.getBusiMode(AbstractGroupInfoRelationSVImpl.class)).queryData(criteria,
		// startNum, endNum);
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(criteria);
		DataContainer condition = dcs[0];
		StringBuilder sqlB = new StringBuilder("");
		sqlB.append(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOGroupInfoRelationBean.class).getMapingEnty());
		StringBuilder addMemSql = new StringBuilder("");
		Map parameter = new HashMap();
		if (!"".equals(condition.getAsString("CREATE_START_DATE")) && null != condition.getAsString("CREATE_START_DATE")) {
			addMemSql.append(" and t.CREATE_DATE >=to_date( :StartDate ,'YYYY-MM-DD') ");
			parameter.put("StartDate", condition.getAsString("CREATE_START_DATE").substring(0, 10));
		}
		if (!"".equals(condition.getAsString("CREATE_END_DATE")) && null != condition.getAsString("CREATE_END_DATE")) {
			addMemSql.append(" and t.CREATE_DATE <to_date( :EndDate ,'YYYY-MM-DD') ");
			parameter.put("EndDate", condition.getAsString("CREATE_END_DATE").substring(0, 10));
		}
		if (!"".equals(condition.getAsString("AUDIT_STATUS")) && null != condition.getAsString("AUDIT_STATUS")) {
			addMemSql.append(" and t.AUDIT_STATUS = :auditStatus ");
			parameter.put("auditStatus", condition.getAsString("AUDIT_STATUS"));
		}
		// 关联查询建档集团表
		if ((!"".equals(condition.getAsString("GROUP_NAME")) && null != condition.getAsString("GROUP_NAME"))
				|| (!"".equals(condition.getAsString("GROUP_SEQ")) && null != condition.getAsString("GROUP_SEQ"))
				|| (!"".equals(condition.getAsString("CITY_ID")) && null != condition.getAsString("CITY_ID"))
				|| (!"".equals(condition.getAsString("COUNTY_ID")) && null != condition.getAsString("COUNTY_ID"))) {
			addMemSql.append(" and exists ( select 1 from CM_GROUP_ARCHIVES a where a.group_seq = t.group_seq ");
			if (!"".equals(condition.getAsString("GROUP_NAME")) && null != condition.getAsString("GROUP_NAME")) {
				addMemSql.append(" and a.GROUP_NAME like :groupName ");
				parameter.put("groupName", condition.getAsString("GROUP_NAME") + "%");
			}
			if (!"".equals(condition.getAsString("GROUP_SEQ")) && null != condition.getAsString("GROUP_SEQ")) {
				addMemSql.append(" and a.GROUP_SEQ = :groupSeq ");
				parameter.put("groupSeq", condition.getAsString("GROUP_SEQ"));
			}
			if (!"".equals(condition.getAsString("CITY_ID")) && null != condition.getAsString("CITY_ID")) {
				addMemSql.append(" and a.region_code = :CityId ");
				parameter.put("CityId", condition.getAsLong("CITY_ID"));
			}
			if (!"".equals(condition.getAsString("COUNTY_ID")) && null != condition.getAsString("COUNTY_ID")) {
				addMemSql.append(" and a.county_code = :CountyId ");
				parameter.put("CountyId", condition.getAsLong("COUNTY_ID"));
			}
			addMemSql.append(" ) ");
		}
		// 关联在网集团客户表
		if ((!"".equals(condition.getAsString("CITY_ID")) && null != condition.getAsString("CITY_ID"))
				|| (!"".equals(condition.getAsString("COUNTY_ID")) && null != condition.getAsString("COUNTY_ID"))
				|| (!"".equals(condition.getAsString("GROUP_ID")) && null != condition.getAsString("GROUP_ID"))
				|| (!"".equals(condition.getAsString("CUST_NAME")) && null != condition.getAsString("CUST_NAME"))
				|| (!"".equals(condition.getAsString("OP_ID")) && null != condition.getAsString("OP_ID"))) {
			addMemSql.append(" and exists ( select 1 from cm_group_customer c where c.cust_service_id = t.group_id and c.state='U' ");
			if (!"".equals(condition.getAsString("CITY_ID")) && null != condition.getAsString("CITY_ID")) {
				addMemSql.append(" and c.CITY_ID = :CityId ");
				parameter.put("CityId", condition.getAsString("CITY_ID"));
			}
			if (!"".equals(condition.getAsString("COUNTY_ID")) && null != condition.getAsString("COUNTY_ID")) {
				addMemSql.append(" and c.COUNTY_ID = :CountyId ");
				parameter.put("CountyId", condition.getAsString("COUNTY_ID"));
			}
			if (!"".equals(condition.getAsString("GROUP_ID")) && null != condition.getAsString("GROUP_ID")) {
				addMemSql.append(" and c.CUST_SERVICE_ID = :custServiceId ");
				parameter.put("custServiceId", condition.getAsString("GROUP_ID"));
			}
			if (!"".equals(condition.getAsString("CUST_NAME")) && null != condition.getAsString("CUST_NAME")) {
				addMemSql.append(" and c.CUST_NAME like :custName ");
				parameter.put("custName", condition.getAsString("CUST_NAME") + "%");
			}
			if (!"".equals(condition.getAsString("OP_ID")) && null != condition.getAsString("OP_ID")) {
				addMemSql.append(" and exists (select 1 from cm_group_manager g where g.cust_id = c.cust_id and g.MANAGER_ID = :managerId ) ");
				parameter.put("managerId", condition.getAsLong("OP_ID"));
			}
			addMemSql.append(" ) ");
		}
		DataContainer[] returnValues = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOGroupInfoRelationBean.class,
				CmLnCommonUtil.getQueryResult(sqlB.toString(), addMemSql.toString(), startNum, endNum, parameter), parameter);
		if (CmCommonUtil.isNotEmptyObject(returnValues) && returnValues.length > 0) {
			// return returnValues;
			ICustomerValue custValueOri = null;
			IBOGroupArchivesValue[] gaValues = null;
			ICmCustomerSV ccSV = CmServiceFactory.getCustomerSV();
			ICmGroupArchivesSV caSV = (ICmGroupArchivesSV) ServiceFactory.getService(ICmGroupArchivesSV.class);
			for (DataContainer value : returnValues) {
				// 补充在网集团名称
				custValueOri = ccSV.queryCustomerByServiceId(value.getAsString("GROUP_ID"), CmConstants.CustomerType.GROUP);
				if (CmCommonUtil.isNotEmptyObject(custValueOri))
					value.initProperty("CUST_NAME", custValueOri.getCustName());
				// 补充建档集团名称等信息
				gaValues = caSV.getGroupArchivesByGroupSeq(value.getAsString("GROUP_SEQ"));
				if (CmCommonUtil.isNotEmptyObject(gaValues) && gaValues.length > 0) {
					value.initProperty("GROUP_NAME", gaValues[0].getGroupName());
					value.initProperty("LINK_PHONE", gaValues[0].getLinkPhone());
					value.initProperty("GROUP_STATUS", gaValues[0].getGroupStatus());
				}
			}
			return returnValues;
		} else {
			return new DataContainer[0];
		}
	}

	public IBOGroupInfoRelationValue[] getGroupInfoRelation(String custServerId, String groupSeq) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		if (custServerId != null && !"".equals(custServerId)) {
			condition.append(" and " + IBOGroupInfoRelationValue.S_GroupId + "  = :custServerId ");
			paraMap.put("custServerId", custServerId);
		}
		if (groupSeq != null && !"".equals(groupSeq)) {
			condition.append(" and " + IBOGroupInfoRelationValue.S_GroupSeq + "  = :groupSeq ");
			paraMap.put("groupSeq", groupSeq);
		}
		IBOGroupInfoRelationValue[] values = BOGroupInfoRelationEngine.getBeans(condition.toString(), paraMap);
		return values;
	}

	public int checkGroupInfoRelationRela(String groupId, String groupSeq) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		if (!"".equals(groupId) && !"null".equals(groupId) && groupId != null) {
			condition.append(" and " + IBOGroupInfoRelationValue.S_GroupId + "  = :groupId ");
			paraMap.put("groupId", groupId);
		}
		if (!"".equals(groupSeq) && !"null".equals(groupSeq) && groupSeq != null) {
			condition.append(" and " + IBOGroupInfoRelationValue.S_GroupSeq + "  = :groupSeq ");
			paraMap.put("groupSeq", groupSeq);
		}
		IBOGroupInfoRelationValue[] values = BOGroupInfoRelationEngine.getBeans(condition.toString(), paraMap);
		int count = values.length;
		return count;
	}

}
