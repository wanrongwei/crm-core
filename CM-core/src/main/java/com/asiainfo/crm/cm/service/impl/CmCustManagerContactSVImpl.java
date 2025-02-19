package com.asiainfo.crm.cm.service.impl;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmCustManagerContactDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupCustomerOperValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustManagerContactSV;

public class CmCustManagerContactSVImpl implements ICmCustManagerContactSV {

	@Override
	public String queryCustManagerContact(long custId) throws Exception {
		ICmCustManagerContactDAO dao=(ICmCustManagerContactDAO) ServiceFactory.getService(ICmCustManagerContactDAO.class);
		IQBOCmGroupCustomerOperValue[] values=dao.queryCustManagerContact(custId);
		if(values!=null && values.length>0){
			return values[0].getBillId();
		}
		return null;
	}

}
