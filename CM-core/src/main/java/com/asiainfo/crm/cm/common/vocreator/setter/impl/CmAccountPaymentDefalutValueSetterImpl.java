package com.asiainfo.crm.cm.common.vocreator.setter.impl;

import com.ai.appframe2.common.DataStructInterface;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.vocreator.setter.ICmVODefaultValueSetter;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue;

/**
 * 账户支付方案信息的默认值
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName CmAccountPaymentDefalutValueSetterImpl
 * @Description 
 *
 * @version v1.0.0
 * @author zhaofei3
 * @Email zhaofei3@asiainfo-linkage.com
 * @company AsiaInfo
 * @date Jun 23, 2012 4:34:21 PM
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * Jun 23, 2012     zhaofei3           v1.0.0               修改原因<br>
 */
public class CmAccountPaymentDefalutValueSetterImpl implements ICmVODefaultValueSetter {

	/**
	 * dc为账户信息
	 */
	public void setDefaultValue(DataStructInterface distValue, DataStructInterface dc) throws Exception {
		IAcctPaymentValue payValue = (IAcctPaymentValue) distValue;
		IAccountValue accountValue = (IAccountValue) dc;
		payValue.setPayMethod(CmConstants.AccountPayMethod.CASH);// 现金
		payValue.setRegionId(accountValue.getRegionId());
		payValue.setState(CmConstants.RecordState.USE);
	}
}
