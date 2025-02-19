package com.asiainfo.crm.cm.customer.group.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;

public interface ICmGroupMemberHSV 
{

	public DataContainerInterface[] queryData(String criteria, int startNum, int endNum) throws Exception;

	public int queryDataCount(String criteria) throws Exception;

	public void saveData(DataContainer[] values) throws Exception;
	
}
