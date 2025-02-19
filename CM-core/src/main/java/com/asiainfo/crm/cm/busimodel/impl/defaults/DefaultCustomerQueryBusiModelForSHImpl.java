package com.asiainfo.crm.cm.busimodel.impl.defaults;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustomerQueryBusiModelForSHImpl;

public class DefaultCustomerQueryBusiModelForSHImpl extends AbstractCustomerQueryBusiModelForSHImpl {


	@Override
	public void prepareCondition(DataContainer[] conditionDCs) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DataContainer[] queryCustomers(DataContainer[] conditionDCs,
			int startNum, int endNum) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int queryIndivCustomersCount(DataContainer dcs) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public DataContainerInterface[] queryData(String[] cols,
			DataContainer[] criteria, int startNum, int endNum)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
