package com.asiainfo.crm.cm.customer.group.dao.interfaces;

import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCardInfoValue;

public interface ICmGroupCardInfoDAO
{
	public IBOCmGroupCardInfoValue[] queryGroupCardInfo(long groupCustId, int busiType, int start, int end)
			throws Exception;

	public int queryGroupCardInfoCount(long groupCustId, int busiType) throws Exception;

	public void saveGroupCardInfos(IBOCmGroupCardInfoValue[] groupCardInfoValues) throws Exception;

	public IBOCmGroupCardInfoValue[] queryGroupCardInfo(long groupCustId, int busiType, String billId) throws Exception;

	public long getNewId() throws Exception;
}
