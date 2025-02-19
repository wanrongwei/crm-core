package com.asiainfo.crm.cm.busimodel.impl.common;

import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.busimodel.IMaskBusiModel;
import com.asiainfo.crm.common.mask.BOMaskHelper;

public abstract class AbstractMaskBusiModel implements IMaskBusiModel {

	public void mask(DataContainerInterface dc) throws Exception {
		// 直接调用模糊化助手的方法
		BOMaskHelper.mask(dc);
	}

	public void mask(DataContainerInterface[] dcs) throws Exception {
		// 直接调用模糊化助手的方法
		BOMaskHelper.mask(dcs);
	}

	public void mask(DataContainerInterface dc, Class clazz) throws Exception {
		// 直接调用模糊化助手的方法
		BOMaskHelper.mask(dc, clazz);
	}

	public void mask(DataContainerInterface[] dcs, Class clazz) throws Exception {
		// 直接调用模糊化助手的方法
		BOMaskHelper.mask(dcs, clazz);
	}
}
