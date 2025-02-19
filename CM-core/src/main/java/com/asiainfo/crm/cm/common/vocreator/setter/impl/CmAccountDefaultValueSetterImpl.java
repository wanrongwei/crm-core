package com.asiainfo.crm.cm.common.vocreator.setter.impl;

import com.ai.appframe2.common.DataStructInterface;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.vocreator.setter.ICmVODefaultValueSetter;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;

/**
 * 账户信息的默认值
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName CmAccountDefaultValueSetterImpl
 * @Description 
 *
 * @version v1.0.0
 * @author zhaofei3
 * @Email zhaofei3@asiainfo-linkage.com
 * @company AsiaInfo
 * @date Jun 23, 2012 4:34:47 PM
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * Jun 23, 2012     zhaofei3           v1.0.0               修改原因<br>
 */
public class CmAccountDefaultValueSetterImpl implements ICmVODefaultValueSetter {

	/**
	 * dc为客户信息
	 */
	public void setDefaultValue(DataStructInterface distValue, DataStructInterface dc) throws Exception {
		IAccountValue accountValue = (IAccountValue) distValue;
		ICustomerValue customerValue = (ICustomerValue) dc;
		accountValue.setAcctName(customerValue.getCustName());
		accountValue.setRegionId(customerValue.getRegionId());
		accountValue.setState(CmConstants.RecordState.USE);
		accountValue.setCustId(customerValue.getCustId());
		accountValue.setAcctType(CmConstants.AccountType.POSTPAY);// 后付费
		accountValue.setAcctStatus(CmConstants.AccountStatus.NORMAL); // 正常
	}

}
