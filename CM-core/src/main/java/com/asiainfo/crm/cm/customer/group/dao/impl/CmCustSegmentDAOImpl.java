package com.asiainfo.crm.cm.customer.group.dao.impl;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.common.ServiceManager;
import com.ai.omframe.util.TimeUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.bo.BoCmCustSegmentEngine;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmCustSegmentDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IBoCmCustSegmentValue;

public class CmCustSegmentDAOImpl implements ICmCustSegmentDAO {

	public void saveSegment(IBoCmCustSegmentValue value) throws Exception {
		if (value.isNew()) {// new customer
			value.setCreateDate(new Timestamp(System.currentTimeMillis()));
			value.setState("U");
			value.setEffectiveDate(new Timestamp(System.currentTimeMillis()));
			value.setExpireDate(TimeUtil.getExpire2099());
			value.setDoneDate(new Timestamp(System.currentTimeMillis()));
			value.setDoneCode(ServiceManager.getDoneCode());
			value.setSegmentId(BoCmCustSegmentEngine.getNewId().longValue());
			value.setCreateOpId(ServiceManager.getUser().getID());
			value.setCreateOrgId(ServiceManager.getUser().getOrgId());
			value.setRegionId(CmCommonUtil.getDefaultRegionId());
		} else if (value.isModified()) {// modify customer
			value.setDoneDate(new Timestamp(System.currentTimeMillis()));
			value.setOpId(ServiceManager.getUser().getID());
			value.setOrgId(ServiceManager.getUser().getOrgId());
		}
		BoCmCustSegmentEngine.save(value);
	}

	public IBoCmCustSegmentValue[] querySegments(long segId, String segName, long parentSegId, String regionId, int strIdx, int endIdx) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		Map parameter = new HashMap();
		if (segId > 0) {
			condition.append(" AND ").append(IBoCmCustSegmentValue.S_SegmentId).append(" = :segId");
			parameter.put("segId", segId);
		}
		if (StringUtils.isNotBlank(segName)) {
			condition.append(" AND ");
			condition.append(IBoCmCustSegmentValue.S_SegmentName).append(" = :segName");
			parameter.put("segName", segName);
		}

		if (parentSegId > 0) {
			condition.append(" AND ").append(IBoCmCustSegmentValue.S_UpSegmentId).append(" = :parentSegId ");
			parameter.put("parentSegId", parentSegId);
		}

		if (StringUtils.isNotBlank(regionId)) {
			condition.append(" AND ").append(IBoCmCustSegmentValue.S_RegionId).append(" = :regionId ");
			parameter.put("regionId", regionId);
		}
		condition.append(" AND ");
		condition.append(IBoCmCustSegmentValue.S_State).append(" = :state");
		parameter.put("state", "U");

		return BoCmCustSegmentEngine.getBeans(null, condition.toString(), parameter, strIdx, endIdx, false);

	}

	public IBoCmCustSegmentValue querySegment(long segId, String segName) throws Exception {
		IBoCmCustSegmentValue[] values = querySegments(segId, segName, -1, null, -1, -1);
		if (null != values && values.length > 0) {
			return values[0];
		}
		return null;
	}

}
