package com.asiainfo.crm.cm.ln.customer.indiv.service.interfaces;

import com.ai.appframe2.common.DataContainerInterface;

public interface ICmLnCustomerSV 
{
	

	public DataContainerInterface[] queryPartyContactByNameOrCert(String contactName, int certType, String certCode, int startNum, int endNum) throws Exception;
	
	
	public int queryPartyContactByNameOrCertCount(String contactName, int certType, String certCode) throws Exception;
	
	
	public DataContainerInterface[] queryContByIdContId(long id, long contId, int type)throws Exception;
	
	
	
}
