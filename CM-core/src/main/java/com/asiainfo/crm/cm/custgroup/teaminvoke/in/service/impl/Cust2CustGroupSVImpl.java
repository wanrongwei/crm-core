package com.asiainfo.crm.cm.custgroup.teaminvoke.in.service.impl;

import com.ai.appframe2.service.ServiceFactory;
import com.ai.omframe.order.valuebean.OrderConst;
import com.asiainfo.crm.cm.common.ivalues.IBOCmInsCmrelValue;
import com.asiainfo.crm.cm.custgroup.teaminvoke.in.service.interfaces.ICust2CustGroupSV;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;

public class Cust2CustGroupSVImpl implements ICust2CustGroupSV {
	
	/**
	 *  根据客户ID查询客户信息。
	 *  
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public ICustomerValue getCustomerById(long custId) throws Exception {
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		return customerSV.queryCustomerByCustId(custId);
	}
	
	public IBOCmInsCmrelValue[] getCmInsCmrel(long custId)throws Exception{
		ICmCustomerSV cmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		return cmCustomerSV.queryCmInsCmrel(custId, -1, OrderConst.RelaType.OWNER, -1, -1, -1, -1, -1);
	}

}
