package com.asiainfo.crm.cm.hu.customer.service.interfaces;

import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmContactContMediumPojoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmContactContMediumInfoValue;

public interface ICmContactSV {

	public IQBOCmContactContMediumInfoValue[] queryContactContMediumInfo(long contId, long mediumType, long upMediumType, int start, int end) throws Exception;

	public IQBOCmContactContMediumInfoValue[] queryContactContMediumInfoForPage(long contId, long mediumType, long upMediumType, int start, int end) throws Exception;

	public int queryContactContMediumCount(long contId, long mediumType, long upMediumType) throws Exception;

	public IBOCmContactContMediumPojoValue queryContMediumById(long contRelaId) throws Exception;
	
	public DataContainerInterface queryIndivContactById(long partyId,long custContId) throws Exception;
}
