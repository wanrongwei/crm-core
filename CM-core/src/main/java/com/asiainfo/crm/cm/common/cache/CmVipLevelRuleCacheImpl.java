package com.asiainfo.crm.cm.common.cache;

import java.util.HashMap;

import com.ai.appframe2.complex.cache.impl.AbstractCache;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.ivalues.IBOCmKernelClassCfgValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;

public class CmVipLevelRuleCacheImpl extends AbstractCache {

	public final static String ALL_DATA_KEY = "ALL_";
	public final static String ONE_DATA_KEY = "ONE_";

	public HashMap getData() throws Exception {
		HashMap retMap = new HashMap();
		IBOCmKernelClassCfgValue[] kernelClassCfgValues = CmServiceFactory.getCommonSV().getAllKernelClass();
		if (CmCommonUtil.isNotEmptyObject(kernelClassCfgValues)) {
			// 所有
			retMap.put(ALL_DATA_KEY, kernelClassCfgValues);
			for (int i = 0; i < kernelClassCfgValues.length; i++) {
				// 单个
				retMap.put(ONE_DATA_KEY + kernelClassCfgValues[i].getCurClass() + kernelClassCfgValues[i].getKernelClass() + kernelClassCfgValues[i].getIsGlobal(),
						kernelClassCfgValues[i]);
			}
		}
		return retMap;
	}

}
