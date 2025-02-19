package com.asiainfo.crm.cm.teaminvoke.in.service.impl;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.omframe.instance.ivalues.IInsAccrelValue;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISo2CmSV;
import com.asiainfo.crm.so.query.ivalues.IQAcctRelInfoValue;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmExtFSV;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV;

public class So2CmSVImpl implements ISo2CmSV 
{
	private ICrmFSV getSo2CmFSV() throws Exception{
		return (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
	}

	public IInsAccrelValue[] getInsAccrelByAcctId(long acctId, long payType, int validType) throws Exception
	{
		return getSo2CmFSV().getInsAccrelByAcctId(acctId,payType,validType);
	}

	public int getAccrelInfoCountByAcctId(long acctId, int payType, int aValidType) throws Exception
	{
		return getSo2CmFSV().getAccrelInfoCountByAcctId(acctId,payType,aValidType);
	}
	
	public IQAcctRelInfoValue[] getAccrelInfoByAcctId(long acctId, int payType, int aValidType,int startIndex,int endIndex) throws Exception
	{
		return getSo2CmFSV().getAccrelInfoByAcctId(acctId,payType,aValidType,startIndex,endIndex);
	}
	
	public DataContainerInterface[] getAccrelInfoByAcctIdOfSet(long acctId, int payType, int aValidType,int startIndex,int endIndex) throws Exception
	{
		return getSo2CmFSV().getAccrelInfoByAcctIdOfSet(acctId,payType,aValidType,startIndex,endIndex);
	}
	
	public boolean updateCustInfo4CPA(long custId, String custSegment, String custName) throws Exception {
		ICrmExtFSV fsv = (ICrmExtFSV) ServiceFactory.getService(ICrmExtFSV.class);
		return fsv.updateCustInfo4CPA(custId, custSegment, custName);
	}

	public boolean updateAcctInfo4CPA(long acctId, String cycleType, String billDate) throws Exception {
		ICrmExtFSV fsv = (ICrmExtFSV) ServiceFactory.getService(ICrmExtFSV.class);
		return fsv.updateAcctInfo4CPA(acctId, cycleType, "1", billDate);
	}
}
