package com.asiainfo.crm.cm.common.service.impl;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.common.bo.BOCmInterfaceLogBean;
import com.asiainfo.crm.cm.common.service.interfaces.ICmInterfaceLogSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;

public class CmInterfaceLogSVImpl implements ICmInterfaceLogSV {

	public final void saveDatas(DataContainer[] values) throws Exception {
		for (int i = 0; i < values.length; i++) {
			// 设置主键
			if (values[i].isNew()) {
				if (values[i].getAsLong(BOCmInterfaceLogBean.S_LogId) <= 0) {
					values[i].set(BOCmInterfaceLogBean.S_LogId, CmCommonUtil.getNewSequence(BOCmInterfaceLogBean.class));
				}
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBean(values[i]);
		}
	}

}
