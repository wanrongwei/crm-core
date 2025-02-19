package com.asiainfo.crm.cm.common.dao.impl;

import com.ai.appframe2.common.ServiceManager;
import com.ai.common.util.TimeUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.bo.BOCmCustOutMappingBean;
import com.asiainfo.crm.cm.common.bo.BOCmCustOutMappingEngine;
import com.asiainfo.crm.cm.common.dao.interfaces.ICmCustOutMappingDAO;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustomerBean;
import com.asiainfo.crm.cm.ln.account.bo.BOCmxAcctBankRelBean;

public class CmCustOutMappingDAOImpl implements ICmCustOutMappingDAO {

	@Override
	public long createNewMappingValue(String oldSystemId) throws Exception {
		BOCmCustOutMappingBean BOCmCustOutMappingBean = new BOCmCustOutMappingBean();
		// CmxAcctBankRel表未使用，就拿就这表的序列来使用
		BOCmCustOutMappingBean.setRelId(CmCommonUtil.getNewSequence(BOCmxAcctBankRelBean.class));
		long groupCustId = CmCommonUtil.getNewSequence(BOCmGroupCustomerBean.class);
		BOCmCustOutMappingBean.setCustId(groupCustId);
		BOCmCustOutMappingBean.setOutType(1);
		BOCmCustOutMappingBean.setOutRelaId(oldSystemId);
		BOCmCustOutMappingBean.setState(CmConstants.RecordState.USE);
		BOCmCustOutMappingBean.setCreateOpId(ServiceManager.getUser().getID());
		BOCmCustOutMappingBean.setCreateOrgId(ServiceManager.getUser().getOrgId());
		BOCmCustOutMappingBean.setCreateDate(ServiceManager.getOpDateTime());
		BOCmCustOutMappingBean.setDoneDate(ServiceManager.getOpDateTime());
		BOCmCustOutMappingBean.setEffectiveDate(ServiceManager.getOpDateTime());
		BOCmCustOutMappingBean.setExpireDate(TimeUtil.getMaxExpire());
		BOCmCustOutMappingBean.setRegionId(CmCommonUtil.getDefaultRegionId());
		BOCmCustOutMappingBean.setRemarks("simulate the relationship of ReferenceNummer and customerId");
		BOCmCustOutMappingEngine.save(BOCmCustOutMappingBean);
		return groupCustId;
	}

}
