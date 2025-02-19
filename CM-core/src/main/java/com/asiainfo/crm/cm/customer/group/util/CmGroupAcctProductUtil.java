package com.asiainfo.crm.cm.customer.group.util;

import java.rmi.RemoteException;

import com.ai.appframe2.bo.DataContainer;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.impl.account.AbstractAccountQueryModelImpl;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;

public class CmGroupAcctProductUtil {
    
    /**
     * 获取集团客户的账户信息
     * @param custId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IAccountValue[] getGroupAcctId(String custId,String regionId) throws Exception {
	
	if ("".equals(custId) || "".equals(regionId)) {
		// 输入参数不合法！
		ExceptionUtil.throwBusinessException("CMS0000073");
	}
	DataContainer criteria = new DataContainer();
	criteria.set(IAccountValue.S_CustId, custId);
	criteria.set(IAccountValue.S_RegionId,regionId);
	AbstractAccountQueryModelImpl busiModelImpl = (AbstractAccountQueryModelImpl) CmServiceFactory
			.getBusiMode(AbstractAccountQueryModelImpl.class);
	
	return (IAccountValue[]) busiModelImpl.queryData(new DataContainer[] { criteria }, -1, -1);
    }

}
