package com.asiainfo.crm.cm.hu.account.service.impl;

import java.util.HashMap;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.hu.account.service.interfaces.ICmHUAccountSV;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;

public class CmHUAccountSVImpl implements ICmHUAccountSV {

	public DataContainerInterface[] queryPayerAccts(long custId) throws Exception {
		int custType = CmCommonUtil.getCustType(custId);
		StringBuilder sql = new StringBuilder();
		HashMap queryParam = new HashMap();
		if (custType == CmConstants.CustomerType.INDIVIDUAL) {
			sql.append("SELECT T.ACCT_ID FROM {CM_PARTY_ACCT_REL} T,{CM_CUST_ACCT_REL} T1,{CM_INDIV_CUSTOMER} T2 WHERE T.ACCT_ID = T1.ACCT_ID AND T.PARTY_ID = T2.PARTY_ID AND T2.CUST_ID = :custId1 AND T1.REL_CUST_ID != :custId2 AND T1.STATE = 'U'");
		} else {
			sql.append("SELECT T.ACCT_ID FROM {CM_PARTY_ACCT_REL} T,{CM_CUST_ACCT_REL} T1,{CM_GROUP_CUSTOMER} T2 WHERE T.ACCT_ID = T1.ACCT_ID AND T.PARTY_ID = T2.PARTY_ID AND T2.CUST_ID = :custId1 AND T1.REL_CUST_ID != :custId2 AND T1.STATE = 'U'");
		}
		queryParam.put("custId1", custId);
		queryParam.put("custId2", custId);
		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), queryParam);
		if (values != null && values.length > 0) {
			return values;
		}
		return new DataContainerInterface[0];
	}
}
