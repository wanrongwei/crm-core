package com.asiainfo.crm.cm.common.vocreator.setter.impl;

import com.ai.appframe2.common.DataStructInterface;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.vocreator.setter.ICmVODefaultValueSetter;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue;

/**
 * 设置账期默认值信息
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author zhaofei3
 * @Email zhaofei3@asiainfo-linkage.com
 * @company AsiaInfo
 * @date Jun 23, 2012 4:36:03 PM
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * Jun 23, 2012     zhaofei3           v1.0.0               修改原因<br>
 */
public class CmAccountBillCycleDefaultValueSetterImpl implements ICmVODefaultValueSetter {

	/**
	 * dc为账户信息
	 */
	public void setDefaultValue(DataStructInterface distValue, DataStructInterface dc) throws Exception {
		IAccountValue accountValue = (IAccountValue) dc;
		IAcctBillCycleValue acctBillCycleValue = (IAcctBillCycleValue) distValue;
		acctBillCycleValue.setBillDay(CmConstants.AcctBillCycleDay.DEFAULT_DAY);
		acctBillCycleValue.setCycleType(CmConstants.AcctBillCycleType.MONTH);
		acctBillCycleValue.setState(CmConstants.RecordState.USE);
		acctBillCycleValue.setRegionId(accountValue.getRegionId());
	}

}
