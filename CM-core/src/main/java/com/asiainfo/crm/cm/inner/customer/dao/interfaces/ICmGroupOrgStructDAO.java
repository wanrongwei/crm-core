package com.asiainfo.crm.cm.inner.customer.dao.interfaces;

import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupOrgStructValue;

public interface ICmGroupOrgStructDAO {
	public IBOCmGroupOrgStructValue queryCmGroupOrg(long relCustId)throws Exception;
}
