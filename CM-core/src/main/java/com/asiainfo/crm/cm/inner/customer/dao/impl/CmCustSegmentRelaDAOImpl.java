package com.asiainfo.crm.cm.inner.customer.dao.impl;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.common.SessionManager;
import com.ai.omframe.util.TimeUtil;
import com.asiainfo.crm.cm.customer.group.bo.BoCmCustSegmentEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustSegmentRelaEngine;
import com.asiainfo.crm.cm.inner.customer.dao.interfaces.ICmCustSegmentRelaDAO;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;

public class CmCustSegmentRelaDAOImpl implements ICmCustSegmentRelaDAO{

	public void save(IBOCmCustSegmentRelaValue value) throws Exception {
		if(null!=value && value.isModified()){
			BOCmCustSegmentRelaEngine.save(value);
		}else if(null!=value && value.isNew()){
			value.setCreateDate(new Timestamp(System.currentTimeMillis()));
			value.setState("U");
			value.setDoneDate(new Timestamp(System.currentTimeMillis()));
			value.setEffectiveDate(new Timestamp(System.currentTimeMillis()));
			value.setExpireDate(TimeUtil.getExpire2099());
			value.setRelaId(BOCmCustSegmentRelaEngine.getNewId().longValue());
			value.setCreateOpId(SessionManager.getUser().getID());
			value.setCreateOrgId(SessionManager.getUser().getOrgId());
			value.setOpId(SessionManager.getUser().getID());
			value.setOrgId(SessionManager.getUser().getOrgId());
			BOCmCustSegmentRelaEngine.save(value);
		}
	}

	public IBOCmCustSegmentRelaValue querySegmentByCustId(long custId) throws Exception {
		Map parameter = new HashMap();
		parameter.put("custId", custId);
		StringBuffer condition = new StringBuffer();
		condition.append(IBOCmCustSegmentRelaValue.S_CustId).append(" = ").append(":custId");
		
		IBOCmCustSegmentRelaValue[] values = BOCmCustSegmentRelaEngine.getBeans(condition.toString(), parameter);
		if(null!=values && values.length>0){
			return values[0];
		}
		return null;
	}

}
