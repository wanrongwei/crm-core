package com.asiainfo.crm.cm.inner.customer.service.interfaces;

import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupOrgStructValue;

public interface ICmGroupOrgStructSV {
	public IBOCmGroupOrgStructValue queryGroupOrg(long relCustId)throws Exception;
}
