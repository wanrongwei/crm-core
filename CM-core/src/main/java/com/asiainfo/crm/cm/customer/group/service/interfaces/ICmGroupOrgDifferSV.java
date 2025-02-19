package com.asiainfo.crm.cm.customer.group.service.interfaces;

import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgDifferBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgStructBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmGroupOrgDifferValue;


public interface ICmGroupOrgDifferSV {
	public IQBOCmGroupOrgDifferValue[] queryGroupOrgDiffers(long custId, int startNum, int endNum)throws Exception;
	
	public int queryGroupOrgDifferCount(long custId)throws Exception;
	
	public void importGroupOrgDiffer(BOCmGroupOrgStructBean[] orgStruct, BOCmGroupOrgDifferBean[] orgDiffer)throws Exception;
}
