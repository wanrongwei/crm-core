package com.asiainfo.crm.cm.customer.group.dao.interfaces;

import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmxCustserviceRelValue;

public interface ICmxCustserviceRelDAO {

	public IBOCmxCustserviceRelValue queryCustserviceRelByCountryCode(String countryCode) throws Exception;
}
