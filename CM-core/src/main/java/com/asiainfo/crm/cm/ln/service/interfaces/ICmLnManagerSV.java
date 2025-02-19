package com.asiainfo.crm.cm.ln.service.interfaces;

import com.ai.appframe2.bo.DataContainer;

public interface ICmLnManagerSV {
	
	public DataContainer[] qryManager(String criteria, int start, int end) throws Exception;
	
	public int qryManagerCount(String criteria) throws Exception;
}
