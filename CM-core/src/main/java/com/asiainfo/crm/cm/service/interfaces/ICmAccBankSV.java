package com.asiainfo.crm.cm.service.interfaces;

import com.ai.appframe2.bo.DataContainer;

public interface ICmAccBankSV 
{

	public DataContainer[] queryData(String criteria, int startNum, int endNum) throws Exception;

	public int queryDataCount(String criteria) throws Exception;

	public void saveData(DataContainer[] values) throws Exception;
	
}
