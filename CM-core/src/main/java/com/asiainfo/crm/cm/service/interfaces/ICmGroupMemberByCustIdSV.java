package com.asiainfo.crm.cm.service.interfaces;

import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;

public interface ICmGroupMemberByCustIdSV {
public ICustomerValue queryCustomerByIndivCustId(long custId)throws Exception;
}
