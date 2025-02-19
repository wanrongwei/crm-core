package com.asiainfo.crm.cm.busimodel.impl.defaults;

import java.util.ArrayList;
import java.util.List;

import com.asiainfo.crm.cm.busimodel.ICmBusiLogCreator;
import com.asiainfo.crm.cm.busimodel.impl.log.AbstractBusiLogCreatorImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;
import com.asiainfo.crm.cm.model.ivalues.ISpecialListValue;
import com.asiainfo.crm.cm.model.ivalues.IVOSpecialListValue;

public class CmSpecialListBusiLogCreatorImpl extends AbstractBusiLogCreatorImpl implements ICmBusiLogCreator {

	protected ICmBusiLogValue[] createBusiLogDetails(IValueObject valueObject, ICmBusiLogValue mainBusiLogValue) throws Exception {
		List<ICmBusiLogValue> busiLogValues = new ArrayList<ICmBusiLogValue>();
		IVOSpecialListValue specialListValue = (IVOSpecialListValue) valueObject;
		// 生成参与人基本信息业务日志
		createSpecialListBusiLog(busiLogValues, mainBusiLogValue, specialListValue);
		// 其他业务日志
		createOtherBusiLog(busiLogValues, mainBusiLogValue, specialListValue);
		// 返回结果
		return busiLogValues.toArray(new ICmBusiLogValue[0]);
	}

	protected void createOtherBusiLog(List<ICmBusiLogValue> busiLogValues, ICmBusiLogValue mainBusiLogValue, IVOSpecialListValue specialListValue) {
		//创建其他业务日志
	}

	protected void createSpecialListBusiLog(List<ICmBusiLogValue> busiLogValues, ICmBusiLogValue mainBusiLogValue, IVOSpecialListValue specialListValue) throws Exception {
		if (specialListValue.hasSpecialLists()) {
			ISpecialListValue[] specialListValues = specialListValue.getSpecialLists();
			for (ISpecialListValue listValue : specialListValues) {
				ICmBusiLogValue busiLogValue = createBusiLogFromDC(listValue, mainBusiLogValue, listValue.getCustId());
				if (CmCommonUtil.isNotEmptyObject(busiLogValue)) {
					busiLogValues.add(busiLogValue);
				}
			}
		}
	}

	protected int getBusiLogType() {
		return CmConstants.BusiLogType.CUSTOMER_EVALUATION_LOG;
	}

}
