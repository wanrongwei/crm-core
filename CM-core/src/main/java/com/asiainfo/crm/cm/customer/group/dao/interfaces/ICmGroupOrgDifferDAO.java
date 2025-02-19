package com.asiainfo.crm.cm.customer.group.dao.interfaces;

import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgDifferBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgStructBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmGroupOrgDifferValue;


public interface ICmGroupOrgDifferDAO {
	public IQBOCmGroupOrgDifferValue[] queryGroupOrgDiffers(long custId, int startNum, int endNum)throws Exception;
	
	public IQBOCmGroupOrgDifferValue[] queryGroupOrgDiffersByCustId(long custId, int startNum, int endNum)throws Exception;
	
	public void saveOrgDiffer(BOCmGroupOrgStructBean[] orgStruct, BOCmGroupOrgDifferBean[] orgDiffer) throws Exception;
}
