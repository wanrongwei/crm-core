package com.asiainfo.crm.cm.common.vocreator.setter.impl;

import com.ai.appframe2.common.DataStructInterface;
import com.asiainfo.crm.cm.common.vocreator.setter.ICmVODefaultValueSetter;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;


public class CmCustomerDefaultValueSetterImpl implements ICmVODefaultValueSetter {

	public void setDefaultValue(DataStructInterface distValue, DataStructInterface dc) throws Exception {
		ICustomerValue customerValue = (ICustomerValue)distValue;
		customerValue.setCustName("dee");
	}

}
